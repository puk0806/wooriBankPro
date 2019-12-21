<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="wrap" class="wrap">
		<div id="header" class="snb-padding">
			<!-- @@##@@##우리은행 마크있는 맨 윗라인  -->
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
				
				<!--	####@@@@ 삭제 필요 기능 확인 (로그인시 이름 자르기 추측)	 	 -->	
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
			
			<!-- @@##@@## 두번째줄 카테고리 라인  -->
			<div id="lnb" class="ui-set-lnb-level1 ui-set-lnb">
				<h2 class="hidden">대메뉴</h2>
				<!-- @@##@@## 카테고리 관련 자료들 -->
				<ul class="level1 level1-ps">
					<!-- @@##@@## 조회 관련 자료들 -->
					<li class="level1-item  level1-item-0  first"><a href="#" class="level1-item-a-0">조회</a>
						
						<div class="lnb-sub-ly" style="display: none;"><div class="lnb-ly">
						<ul class="lnb-list">
						
						<li><dl><dt><a href="#">계좌조회</a></dt>
						<dd><a href="#">전계좌조회</a></dd><dd><a href="#">만기/기일도래계좌조회</a></dd><dd><a href="#">해지계좌조회</a></dd><dd><a href="#">휴면계좌조회</a></dd><dd><a href="#">장기미거래신탁계좌조회</a></dd><dd><a href="#">월평균계좌잔액조회</a></dd>
						</dl></li>
						
						<li><dl><dt><a href="#">거래내역조회</a></dt>
						<dd><a href="#">거래내역조회</a></dd><dd><a href="#">과거거래내역조회</a></dd>
						</dl></li>
						
						<li><dl><dt><a href="#">수표/어음조회</a></dt>
						<dd><a href="#">자기앞수표조회</a></dd><dd><a href="#">본인발행자기앞수표조회</a></dd><dd><a href="#">(가계)당좌수표현황</a></dd><dd><a href="#">수표어음교부신청</a></dd><dd><a href="#">수표어음교환현황내역</a></dd><dd><a href="#">받을어음보관명세</a></dd><dd><a href="#">받을어음반환신청</a></dd>
						</dl></li>
						
						<li><dl><dt><a href="#">전자어음조회</a></dt>
						<dd><a href="#">받을전자어음</a></dd><dd><a href="#">보증전자어음</a></dd><dd><a href="#">전자어음사고신고사전조회</a></dd>
						</dl></li>
						
						<li><dl><dt><a href="#">기타조회</a></dt>
						<dd><a href="#">수수료면제횟수조회</a></dd><dd><a href="#">사이버증권계좌조회</a></dd><dd><a href="#">기부금조회</a></dd><dd><a href="#">현금/직불카드 조회</a></dd><dd><a href="#">무통장송금내역 조회</a></dd>
						</dl></li>
						
						</ul>
					
			            </div></div>
			            
			        </li>
				
				</ul>
			</div>
		</div>
	</div>


</body>
</html>