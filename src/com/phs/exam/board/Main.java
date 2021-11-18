package com.phs.exam.board;

import java.util.Scanner;

/*
[ ]환영메세지 출력
[ ]고객으로부터 명령어 입력받기
  [ ]스캐너 객체라도 하나 만들어보기
  [ ]받은 명령어 출력하기
[ ]exit 명령어 처리
  [ ]exit 입력받으면 종료 라고 출력하기
  [ ]exit 입력받을 때 까지 계속 실행
[ ]/usr/article/write 명령어 입력처리
  [ ]시작문구라도 출력
  [ ]제목과 내용이라도 입력받기
  [ ]생성된 게시물 번호 출력
  [ ]생성될 때 마다 게시물번호가 증가
  [ ]생성된 게시물을 객체에 담기
  [ ]Article 객체 생성하기
  [ ]Article 클래스 생성하기
[ ]/usr/article/detail 명령어 입력처리
[ ]명령어를 제대로 입력했다면, 입력받은 명령어 문구는 안나오도록
[ ]toString 메서드 오버라이드 하기
[ ]생성자 도입
*/
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("==게시판 v 0.1 ==");
    System.out.println("== 프로그램 시작 ==");
    int articleLastId = 0;
    while (true){
      System.out.printf("명령 ) ");
      String cmd = sc.nextLine();
      if(cmd.equals("exit")){
      break;
      }else if(cmd.equals("/usr/article/write")){
        System.out.println("- 게시물 등록 - ");
        System.out.printf("제목 : ");
        String title = sc.nextLine();
        System.out.printf("내용 : ");
        String body = sc.nextLine();

        int id = articleLastId + 1;
        articleLastId = id;
        Article article = new Article();
        article.id = id;
        article.title = title;
        article.body = body;
        System.out.println("생성된 게시물 객체 :" + article);
        System.out.printf("%d번 게시물이 입력되었습니다\n",id);
      }


    }
    System.out.println("== 프로그램 종료 ==");
    sc.close();



  }
}

class Article{
  int id;
  String title;
  String body;
  @Override
  public String toString(){
    return String.format("{id : \"%d\" title : \"%s\" body : \"%s\"}",id,title,body);
  }
}





