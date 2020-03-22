<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="../header.jsp" %>
<aside>
  <article id="login_box">
    <img id="login_title" src="img/ttl_login.png">
    <div id="input_button">
    <ul id="login_input">
      <li><input type="text"></li>
      <li><input type="password"></li>
    </ul>
    <img id="login_btn" src="img/btn_login.gif">
    </div> 
    <div class="clear"></div>
    <div id="join_search">
      <img src="img/btn_join.gif">
      <img src="img/btn_search.gif">
    </div>
  </article>
  <article id="guestbook">
    <div id="guestbook_title">
      <img src="img/ttl_memo.gif">
    </div>
    <ul>
      <li>안녕하세요!</li>
      <li>안녕하세요!</li>
      <li>안녕하세요!</li>
      <li>안녕하세요!</li>
    </ul>
  </article>
</aside>

<section id="main">
  <img src="img/main_img.png">
  <section id="notice_free_youtube">
    <article id="notice"> 	<!-- 공지사항 -->
      <div class="latest_title">
        <img class="latest_img" src="img/latest1.gif">
        <img class="more" src="img/more.gif">
        <div class="clear"></div>					
      </div>
      <div class="latest_content">
        <img class="image" src="img/book_pen.gif">
        <ul class="list">
          <li>
            <div class="subject">루바토 개편과 사이트 이용...</div>
            <div class="date">2017-09-20</div>
            <div class="clear"></div>	
          </li>								
          <li>
            <div class="subject">루바토 개편과 사이트 이용...</div>
            <div class="date">2017-09-20</div>
            <div class="clear"></div>	
          </li>		
          <li>
            <div class="subject">루바토 개편과 사이트 이용...</div>
            <div class="date">2017-09-20</div>
            <div class="clear"></div>	
          </li>	
          <li>
            <div class="subject">루바토 개편과 사이트 이용...</div>
            <div class="date">2017-09-20</div>
            <div class="clear"></div>	
          </li>				
        </ul>							
      </div>
    </article>
    <article id="free"> 	<!—자유 게시판 -->
      <div class="latest_title">
        <img class="latest_img" src="img/latest2.gif">
        <img class="more" src="img/more.gif">
        <div class="clear"></div>					
      </div>
      <div class="latest_content">
        <img class="image" src="img/book_pen.gif">
        <ul class="list">
          <li>
            <div class="subject">까스통님의 선물인 보드카...</div>
            <div class="date">2017-09-20</div>
            <div class="clear"></div>		
          </li>
          <li>
            <div class="subject">까스통님의 선물인 보드카...</div>
            <div class="date">2017-09-20</div>
            <div class="clear"></div>	
          </li>		
          <li>
            <div class="subject">까스통님의 선물인 보드카...</div>
            <div class="date">2017-09-20</div>
            <div class="clear"></div>	
          </li>	
          <li>
            <div class="subject">까스통님의 선물인 보드카...</div>
            <div class="date">2017-09-20</div>
            <div class="clear"></div>	
          </li>								
        </ul>							
      </div>
    </article>			
    <article id="youtube">	    <!—YOUTUBE 동영상 -->		
      <div class="latest_title">
        <img class="latest_img" src="img/latest3.gif">
        <img class="more" src="img/more.gif">
        <div class="clear"></div>					
      </div>				
      <img id="youtube_img" src="img/bach.jpg">
    </article>
  </section> <!-- notice_free_youtube -->
  <section id="gallery">
    <img src="img/latest4.gif">
    <div id="gallery_box">
      <div id="gallery_list">
        <div class="items">
          <ul>
            <li><img src="img/img1.jpg"></li>
            <li>기타 페스티벌 4중주</li>
          </ul>
        </div>
        <div class="items">
          <ul>
            <li><img src="img/img1.jpg"></li>
            <li>기타 페스티벌 4중주</li>
          </ul>
        </div>
        <div class="items">
          <ul>
            <li><img src="img/img1.jpg"></li>
            <li>기타 페스티벌 4중주</li>
          </ul>
        </div>
      </div> <!-- galley_list -->
    </div> <!-- gallery_box -->		
  </section> <!-- gallery -->
</section> <!-- section main -->
<div class="clear"></div>
<%@ include file="../footer.jsp" %>