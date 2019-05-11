package com.example.motionlayoutex.first_ex

import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.v4.app.Fragment
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.motionlayoutex.R
import kotlinx.android.synthetic.main.first_ex_constraint_set_end.*

class FirstExampleWithConstraintSet : Fragment() {

    companion object {
        fun newInstance() = FirstExampleWithConstraintSet()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.first_ex_constraint_set_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addAnimationOperations(view)
    }

    private fun addAnimationOperations(view: View) {
        var set = false
        val constraint1 = ConstraintSet()
        constraint1.clone(root)
        val constraint2 = ConstraintSet()
        constraint2.clone(context, R.layout.first_ex_constraint_set_end)

        view.findViewById<View>(R.id.first_ex_toggle).setOnClickListener {
            TransitionManager.beginDelayedTransition(root)
            val constraint = if (set) constraint1 else constraint2
            constraint.applyTo(root)
            set = !set
        }
    }
}