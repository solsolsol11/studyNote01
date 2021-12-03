package com.phs.exam.notepad;

import java.util.*;

public class Main {

    private static void makeTestcase(List<Article> articles) {
        for(int i = 0; i < 100; i++){
            int id= i + 1;
            articles.add(new Article(id,"제목" + id,"내용" + id));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("- 게시판 v 0.1 -");
        System.out.println("==프로그램 시작==");


        int articlesLastId = 0;
        List<Article> articles = new ArrayList<>();
        makeTestcase(articles);
        while (true){
            System.out.printf("명령 ) ");
            String cmd = sc.nextLine();

            if(cmd.equals("exit")){
                break;
            }else if(cmd.equals("/usr/article/list")){
                System.out.println("- 게시물 리스트 -");
                System.out.println("-------------------");
                System.out.println("번호 / 제목");
                System.out.println("-------------------");

                for(int i = articles.size() -1 ; i >= 0; i--){
                    Article article = articles.get(i);
                    System.out.printf("%d / %s\n",article.id,article.title);

                }

            }
            else if(cmd.equals("/usr/article/detail")){
                if(articles.isEmpty()){
                    System.out.println("게시물이 없습니다");
                    continue;
                }
                Article article = articles.get(articles.size() -1);
                System.out.println("- 게시물 상세내용 -");
                System.out.printf("번호 : %d\n",article.id);
                System.out.printf("제목 : %s\n",article.title);
                System.out.printf("내용 : %s\n",article.body);
            }
            else if(cmd.equals("/usr/article/write")){


                System.out.println("게시물 등록");
                System.out.printf("제목 : ");
                String title = sc.nextLine();
                System.out.printf("제목 : ");
                String body = sc.nextLine();

                int id = articlesLastId +1;
                articlesLastId = id;

                System.out.printf("%d번 게시물이 입력되었습니다.\n", id);
                Article article = new Article(id,title,body);
                articles.add(article);
                System.out.println("입력된 객체" + article);
            }


        }
        sc.close();
        System.out.println("==프로그램 종료==");
    }


}

class Article{
    int id;
    String title;
    String body;

    Article(int id,String title,String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString(){
        return String.format("{id : %d title : %s body : %s}",id,title,body);
    }

}

class Rq{
    String url;

    Rq(String url){
        this.url = url;
    }

    static Map<String, String> getParams(){
        return null;
    }
    static String getUrlPath(){
        return null;
    }
}

class Util{

}