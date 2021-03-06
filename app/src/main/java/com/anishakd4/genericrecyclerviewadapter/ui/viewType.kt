package com.anishakd4.genericrecyclerviewadapter.ui

import com.anishakd4.genericrecyclerviewadapter.R
import com.anishakd4.genericrecyclerviewadapter.adapter.ViewType
import com.anishakd4.genericrecyclerviewadapter.data.model.Answer
import com.anishakd4.genericrecyclerviewadapter.data.model.SingleChoiceQuestion

data class SingleChoiceViewType(private val model: SingleChoiceQuestion) :
    ViewType<SingleChoiceQuestion> {

    override fun layoutId(): Int = R.layout.layout_single_choice

    override fun data(): SingleChoiceQuestion = model
}

class CarDescriptionViewType : ViewType<Unit> {

    override fun layoutId(): Int = R.layout.layout_car_description

    override fun data() {}
}

data class QuestionViewType(private val model: String) : ViewType<String> {

    override fun layoutId(): Int = R.layout.layout_multiple_choice

    override fun data(): String = model
}

data class MultipleAnswerViewType(private val model: Answer) : ViewType<Answer> {

    override fun layoutId(): Int = R.layout.layout_answer

    override fun data(): Answer = model
}