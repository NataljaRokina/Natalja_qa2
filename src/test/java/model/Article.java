package model;

public class Article {
    private String title;
    private Integer commentCount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;//  esli 2 odinakovije peremennije, odna na urovne klassa, drugaja na urovne funkcii
        // -> this zdes na urovne klassa opredeljajet
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public void setCommentCount(String commentCount) {
        commentCount = commentCount.substring(1, commentCount.length() - 1);// v skobkah '1' potomu chto pervaja ckobka
        //eto nulevoj simvol, kotorim javljajetsja skobka u elementa commentCount
        this.commentCount = Integer.valueOf(commentCount);
    }
}
