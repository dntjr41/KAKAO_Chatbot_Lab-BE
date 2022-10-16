package com.example.goENC.models;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "choice_answer")
@NoArgsConstructor
public class ChoiceAnswer {

    @Id  // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // SQL에서 auto_increment 의미
    @Column(name = "answer_id", nullable = false)
    private Integer answerId;

    @JoinColumn(name = "question_id")
    private Integer questionId;

    @Column(name = "answer_order")
    private Integer answerOrder;

    @Column(name = "answer_content", length = 50)
    private String answerContent;

    // 객관식 질문
    @Builder
    public ChoiceAnswer(Integer answerId, Integer questionId, Integer answerOrder, String answerContent) {
        this.answerId = answerId;
        this.questionId = questionId;
        this.answerOrder = answerOrder;
        this.answerContent = answerContent;
    }
}
