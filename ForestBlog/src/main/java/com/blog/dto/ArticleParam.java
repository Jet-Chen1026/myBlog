package com.blog.dto;

import lombok.Data;

import java.util.List;

//此注解为lombok提供，可以为所有类属性提供getset方法
@Data
public class ArticleParam {

    private Integer articleId;

    private String articleTitle;

    private String articleContent;

    private Integer articleParentCategoryId;

    private Integer articleChildCategoryId;

    private Integer articleOrder;

    private Integer articleStatus;

    private List<Integer> articleTagIds;

}
