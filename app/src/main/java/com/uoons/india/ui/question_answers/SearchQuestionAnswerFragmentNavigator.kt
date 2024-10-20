package com.uoons.india.ui.question_answers

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface SearchQuestionAnswerFragmentNavigator : CommonNavigator{
    fun productQuestionListResponse()
    fun likeUnlikeQuestionResponse()
}