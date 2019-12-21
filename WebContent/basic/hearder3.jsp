<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style>

* {
    font-family: '맑은 고딕','Malgun Gothic','돋움',Dotum,Helvetica,AppleGothic,Sans-serif;
}

body, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, a, button, form, fieldset, p, blockquote {
    margin: 0;
    padding: 0;
}

a, cite, code, dfn, del, em, ins, label, q, span, strong {
    display: inline-block;
    vertical-align: middle;
}

a, button, input[type=button], input[type=submit], input[type=reset] {
    text-decoration: none;
}


body, dl, dt, dd, th, td, div, p, a, button, table, li {
    font-size: 12px;
}

form, fieldset, legend, input, button, textarea, select {
    font-size: 13px;
}

body {
    font-family: '맑은 고딕','Malgun Gothic','돋움',Dotum,Helvetica,AppleGothic,Sans-serif;
    width: 100%;
    height: 100%;
    color: #000;
}

input, textarea {
    display: inline-block;
    font-size: 13px;
    vertical-align: middle;
}

a {
    color: #000;
}

img {
    display: inline-block;
    border: none;
    vertical-align: top;
}

img, fieldset {
    border: none;
}




#gnb .my-svc .select-banking-type {
    -webkit-box-shadow: 2px 2px 6px -3px rgba(0,0,0,0.5);
    box-shadow: 2px 2px 6px -3px rgba(0,0,0,0.5);
    border-radius: 3px;
}

#gnb .my-svc .select-banking-type {
    -webkit-box-shadow: 2px 2px 6px -3px rgba(0,0,0,0.5);
    box-shadow: 2px 2px 6px -3px rgba(0,0,0,0.5);
    border-radius: 3px;
}


#wrap {
    width: 100%;
    height: 100%;
    
}

#wrap.wrap {
    background: url(https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/79188573_1352558148250311_185064969644015616_n.jpg?_nc_cat=100&_nc_ohc=ePjjTo7Xs-EAQnLZt9gTsZSG6loPO_jsVIe-G5tQDUii5knDVUPKpzSNg&_nc_ht=scontent-icn1-1.xx&oh=06377f974a9c2ce09d8353af5f11ace8&oe=5E899F5B) no-repeat left top;
}





#header {
    width: 100%;
    margin: 0 auto;
    text-align: center;
    box-sizing: border-box;
}

#wrap {
    width: 100%;
    min-width: 950px;
    margin: 0;
    padding: 0;
}

body.main #header {
    padding-left: 0;
}

#header {
    position: relative;
    z-index: 100;
    width: 950px;
    margin: 0 auto;
    height: 154px;
}

body.intro .snb-padding, body.main .snb-padding {
    padding-left: 0;
}

body .snb-padding {
    padding-left: 53px;
}

#header:after {
    display: block;
    clear: both;
    content: " ";
}

#gnb {
    position: relative;
    width: 950px;
    margin: 0 auto;
    height: 45px;
    padding-top: 32px;
    z-index: 11;
}

#gnb:after {
    clear: both;
}

#gnb h1, #gnb ul, #gnb li, #gnb form, #gnb fieldset, #gnb legend, #gnb input, #gnb label, #gnb img {
    margin: 0;
    padding: 0;
}

#gnb h1 {
    float: left;
    padding: 0;
}

#gnb h1 a.woori {
    display: inline-block;
    width: 31px;
    height: 31px;
}

#gnb h1 a {
    vertical-align: top;
    padding: 0;
    float: left;
}

#gnb h1 a.site {
    display: inline-block;
    margin-left: 4px;
    margin-top: 3px;
}

#gnb .my-svc {
    float: left;
    height: 31px;
    margin: 2px 0 0 6px;
}

#gnb .my-svc dt {
    position: absolute !important;
    top: -10000px;
    left: 0;
    visibility: hidden;
    overflow: hidden;
    width: 0 !important;
    height: 0;
    margin: 0 !important;
    padding: 0 !important;
}

#gnb .my-svc dd.btn {
    margin: 3px 4px 0 0;
}

#gnb .my-svc dd {
    float: left;
    margin: 0 10px 0 0;
    font-weight: normal;
    font-size: 11px;
}

#gnb .my-svc .btn-login {
    display: inline-block;
    position: relative;
}

#gnb .my-svc dd {
    float: left;
    margin: 0 10px 0 0;
    font-weight: normal;
    font-size: 11px;
}

.gnb-member-bt {
    display: inline-block;
    height: 20px;
    width: 55px;
    line-height: 21px;
    text-align: center;
    color: #333;
    letter-spacing: -1px;
    background: url(/img/common/etc/bg_btn/gnb_member.gif) left top no-repeat;
    vertical-align: middle;
    padding: 0;
    margin: 0;
}


a.gnb-member-bt.js-display-hover-trigger {
    cursor: default !important;
    display: inline-block;
    height: 20px;
    line-height: 21px;
    text-align: center;
    vertical-align: middle;
    padding: 0;
    margin: 0;
}

.gnb-member-bt span {
    display: inline-block;
    height: 20px;
    width: 55px;
    line-height: 21px;
    text-align: center;
    font-size: 12px;
    white-space: nowrap;
    vertical-align: middle;
    font-family: "돋움",dotum,Helvetica,sans-serif;
    padding: 0;
    margin: 0;
    color: #fff;
}

#gnb .my-svc dd.btn span, #gnb .my-svc dd.timer span {
    display: inline-block;
}

a.gnb-member-bt.js-display-hover-trigger {
    cursor: default !important;
    display: inline-block;
    height: 20px;
    line-height: 21px;
    text-align: center;
    vertical-align: middle;
    padding: 0;
    margin: 0;
}

.gnb-member-bt {
    display: inline-block;
    height: 20px;
    width: 55px;
    line-height: 21px;
    text-align: center;
    color: #333;
    letter-spacing: -1px;
    background: url(/basic/image/header/gnb_member.gif) left top no-repeat;
    vertical-align: middle;
    padding: 0;
    margin: 0;
}

#gnb .my-svc .btn-login .select-banking-type {
    top: 24px;
    left: -46px;
    width: 145px;
}

#gnb .my-svc .select-banking-type {
    display: none;
    position: absolute;
    text-align: center;
    border: solid 1px #008cdf;
    background: #fff;
    width: 109px;
    height: 30px;
    line-height: 32px;
    font-size: 11px;
    color: #ececec;
    left: -17px;
    top: 24px;
}

#gnb .my-svc dd {
    float: left;
    margin: 0 10px 0 0;
    font-weight: normal;
    font-size: 11px;
}


#gnb .my-svc .select-banking-type a {
    background: none;
    padding: 0 !important;
    font-size: 14px !important;
    font-weight: bold;
    line-height: 14px;
    height: 14px;
    color: #000 !important;
    margin: 10px 0 0 0 !important;
}

#gnb .my-svc .btn-login .select-banking-type-arrow {
    top: 14px;
    left: -46px;
    height: 11px;
    width: 147px;
    display: none;
}

#gnb .my-svc .select-banking-type-arrow {
    display: none;
    position: absolute;
    width: 111px;
    height: 11px;
    background: url(/image/header/common.gif) no-repeat center 4px;
    left: -17px;
    top: 14px;
}

#gnb .my-svc dd {
    float: left;
    margin: 0 10px 0 0;
    font-weight: normal;
    font-size: 11px;
}

#gnb .my-svc dd.txt {
    margin: 2px 0 0 0;
}

.chrome #gnb .my-svc dd.txt, .safari #gnb .my-svc dd.txt {
    margin: 1px 0 0 0;
}

#gnb .my-svc .btn-certificate-center {
    display: inline-block;
    position: relative;
}

#gnb .my-svc dd.txt a {
    font-family: "돋움",dotum,Helvetica,sans-serif;
    font-size: 12px;
    letter-spacing: -1px;
    padding: 0 0 0 0px;
    margin: 5px 0 0 0;
}

#gnb .my-svc dd.txt a.js-display-hover-trigger {
    cursor: default !important;
}

#gnb .my-svc .btn-certificate-center a.js-display-hover-trigger {
    text-decoration: none;
    margin: 1px 0 0 0;
}

#gnb .my-svc dd.txt .select-banking-type a {
    font-family: '맑은 고딕','Malgun Gothic','돋움',Dotum,Helvetica,AppleGothic,Sans-serif !important;
    margin: 0 3px;
}











html {
    color: -internal-root-color;
}

div {
    display: block;
}

script {
    display: none;
}

input[type="hidden" i] {
    display: none;
    -webkit-appearance: initial;
    background-color: initial;
    cursor: default;
    padding: initial;
    border: initial;
}

input {
    -webkit-writing-mode: horizontal-tb !important;
    text-rendering: auto;
    color: initial;
    letter-spacing: normal;
    word-spacing: normal;
    text-transform: none;
    text-indent: 0px;
    text-shadow: none;
    display: inline-block;
    text-align: start;
    -webkit-appearance: textfield;
    background-color: white;
    -webkit-rtl-ordering: logical;
    cursor: text;
    margin: 0em;
    font: 400 13.3333px Arial;
    padding: 1px 0px;
    border-width: 2px;
    border-style: inset;
    border-color: initial;
    border-image: initial;
}

h1 {
    display: block;
    font-size: 2em;
    margin-block-start: 0.67em;
    margin-block-end: 0.67em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
    font-weight: bold;
}

a:-webkit-any-link {
    color: -webkit-link;
    cursor: pointer;
    text-decoration: underline;
}

h1 {
    font-size: 2em;
    font-weight: bold;
}

dl {
    display: block;
    margin-block-start: 1em;
    margin-block-end: 1em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
}

dt {
    display: block;
}

dd {
    display: block;
    margin-inline-start: 40px;
}




	

</style>
<script>

</script>

</head>
<!-- !@!@!@(주석안 사용이유 아직 미정 표시)  -->
<!-- !@#!@#!@# 나만의 링크주소로 넣어줘야하는곳 -->
<!-- #@!#@!#@! 나만의 스크립트로수정필요 -->
<!-- @@##@@## 덩어리 위치 표시 -->
<!-- ####@@@@ 삭제 필요 -->
	
<body class="main css3">
	<div id="wrap" class="wrap">
		<div id="header" class="snb-padding">
			<!-- 우리은행 마크있는 맨 윗라인  -->
			<div id="gnb" class="ui-set-gnb">
				<input type="hidden" name="PAGE_ID" value="ps">	<!-- 페이지 위치 넘겨주려고 추축 !@!@!@  -->
				
				<!-- @@##@@##맨위 왼쪽 부분 -->
				<h1>
					<img alt="우리은행로고" src="https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/78926909_1351655335007259_7764818340182228992_n.jpg?_nc_cat=108&_nc_ohc=x7-W4ZX1rfoAQnA3wlIy-CNlJVuiJxGKRC1lFYYYWxwWAX3KPQ4CKpnzw&_nc_ht=scontent-icn1-1.xx&oh=55cf921a18afa67e6756cb44bf8f7eff&oe=5E7F4A60">
					<a href="#" class="woori"> </a>		<!-- !@#!@# 개인 홈링크 위치 -->
					<a class="site" href="#">			<!-- !@#!@# 개인홈 링크 위치 -->
						<img alt="개인로고" src="https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/80107828_1351663518339774_3141600386104688640_n.jpg?_nc_cat=101&_nc_ohc=_nF29S4wPVwAQl9JkJaNLpYoLCzBK-_xFrnnCkkui6t3_QWk8TuqOx_8Q&_nc_ht=scontent-icn1-1.xx&oh=20097c699ce9c9388e35f3ad1bc12169&oe=5E8BC5C6">
					</a>		
					
				</h1>
				<!-- @@##@@## 왼쪽 로그인 공인인증센터부분 -->
				<dl class="my-svc">
					<dt>회원관련 서비스</dt>
					<dd class="btn">
						<!-- #@!#@!#@! 스크립트 수정필요 호버시   -->
						<div class="js-display-hover btn-login ui-set-display-hover">
							<a href="#none" class="gnb-member-bt  js-display-hover-trigger" onclick="return false;"><span>로그인</span></a>
							<div class="js-display-hover-area select-banking-type" style="display: none;">
								<a href="#" class="on">개인뱅킹</a>		<!-- !@#!@# 개인 사이트홉으로이동 링크 -->
								<a href="#">기업뱅킹</a>					<!-- !@#!@# 기업 사이트홉으로이동 링크 -->
							</div>
							<span class="select-banking-type-arrow js-display-hover-area" data-ui-animation="false" style="display: none;"></span>
						</div>						
					</dd>
					<dd class="txt">
						<div class="js-display-hover btn-certificate-center ui-set-display-hover">
							<a href="#none" class="js-display-hover-trigger" onclick="return false;">공인인증센터</a>
							<div class="js-display-hover-area select-banking-type" style="display: none;">
								<a href="#" class="on">개인</a>		<!-- !@#!@# 개인 사이트홉으로이동 링크 -->
								<a href="#">기업</a> 	<!-- !@#!@# 기업 사이트홉으로이동 링크 -->
							</div>
							<span class="select-banking-type-arrow js-display-hover-area" data-ui-animation="false" style="display: none;"></span>
						</div>
					</dd>
				</dl>
				
				<!--	####@@@@ 삭제 필요 기능 확인 (로그인시 이름 자르기 추측)	 	
					<script type="text/javascript">//<![CDATA[
					String.prototype.cut = function(len) { var str = this; var s = 0; for (var i=0; i<str.length; i++) { s += (str.charCodeAt  > 128) ? 2 : 1; if (s > len){ return str.substring(0,i); } } return str; }
					$(function(){ $('.login-name1',$('.my-svc')).text( $('.login-name1',$('.my-svc')).text().cut(7) ); $(".login .fishing-img a.js-display-hover-trigger").focus(function(){$(".js-display-hover-area.fishing-word-wrap").show();}); });	// 이름: 한글기준7자출력
					
					//]]></script>
					
					
						<script type="text/javascript">
						var strSelfUrl = "https://spib.wooribank.com/pib/";
							function showLogoutWarning(dis) {
								wbUI.openPopup('/pib/jcc?withyou=ps&__ID=c018195' + '&dis=' + dis);
							}
					</script>
				 -->
				 
			 	<!-- @@##@@## 오른쪽 링크들 -->
			 	<!-- !@#!@#!@# 링크위치들 바꿔줘야함 -->
				 <dl class="rel-svc">
					<dt>우리은행 관련 서비스 링크 및 검색</dt>
					<dd><a href="#"><img src="https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/78685937_1351720025000790_4683295565771964416_n.jpg?_nc_cat=106&_nc_ohc=H5LKNklRJ7MAQnkQWxNRGN8tMvjyjBAklyBrCST4Z89PSIyA7R-ghn7nQ&_nc_ht=scontent-icn1-1.xx&oh=ffb6a6863fa2e7a720121f4193229434&oe=5E3ECAB2" alt="개인"></a></dd> 
					<dd><a href="#"><img src="https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/78457817_1351720031667456_4993760287535398912_n.jpg?_nc_cat=102&_nc_ohc=mlUtw31ePdMAQnIrp9M9Mrzl0G8c9P8nF_IpPVr4eoQ_AcoDZp7kiF4Mw&_nc_ht=scontent-icn1-1.xx&oh=9ba023b7370b612cd9ed320ed79421f5&oe=5E7EF637" alt="기업"></a></dd>
					<dd><a href="#"><img src="https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/78714588_1351720075000785_4092062316403621888_n.jpg?_nc_cat=101&_nc_ohc=4iZHNmgmZ_kAQnMyRMOTn2n9mcktGAAetbjtnvqqKrRv8vPsPMh4KuizA&_nc_ht=scontent-icn1-1.xx&oh=b59810984e2de1045b2f0106bb0e61ad&oe=5E88965C" alt="금융상품"></a></dd>
					<dd><a href="#"><img src="https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/79317806_1351720071667452_4126148057332973568_n.jpg?_nc_cat=106&_nc_ohc=WneSuFVlzOUAQkW18H_Ud_DJIjb2mu5_VAh-d46ZKbc2Or9FHYBVvuxug&_nc_ht=scontent-icn1-1.xx&oh=5464c0100f551b5e103c1a97532fb064&oe=5E855ABC" alt="우리카드"></a></dd>
					<dd class="mr15">
						<a href="#" class="btn-popup ui-set-btn-popup"><img alt="전체서비스" src="https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/76726025_1351720028334123_3701795646286594048_n.jpg?_nc_cat=109&_nc_ohc=_CXL3rxqKAMAQl1vdHCvUfazRaxqwlbBXbQosr5z1zlZxYBPCoNZS232A&_nc_ht=scontent-icn1-1.xx&oh=24a1f47bc2c155cad3cb88a58323aa79&oe=5E86912F"></a>
					</dd>
				</dl>
				<!-- @@##@@## 오른쪽 검색 폼 -->
				<!-- 액션링크 수정 필요 -->
				<form method="post" action="">
					<div class="search2">
						<input class="text font-c-7" type="text" style="width:96px;" name="query" title="검색어 입력" value="부동산" onfocus="this.value=''" mask="n">
						<input class="submit" type="image" src="https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/78641078_1351738414998951_339050160069804032_n.jpg?_nc_cat=111&_nc_ohc=IOZ2UhaS3WcAQmy9d4S3APRHaXGJUUxzVyKvFLUnnRvoyR2qJaNfloYuA&_nc_ht=scontent-icn1-1.xx&oh=024e8553766178e4a5ac4e642fbce780&oe=5E75ED8C" alt="검색">
					</div>
				</form>
			</div> <!-- 우리은행 마크 맨 윗라인 끝 id="gnb" -->
		</div>
	</div>
</body>
</html>