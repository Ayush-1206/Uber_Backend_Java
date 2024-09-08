package com.example.UberReviewService.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//table(name = "bookingreview")
public class Review extends BaseModel{

    @Column(nullable = false)
    String content;

    Double rating;

    public String toString(){
        return "review :" + this.content + " " + this.rating + " " + this.createdAt;
    }

}
