<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>客户列表</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/list.js"></script>
<link href="${pageContext.request.contextPath }/css/Style.css"
	type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css"
	type=text/css rel=stylesheet>
<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
	<FORM id="customerForm" name="customerForm"
		action="${pageContext.request.contextPath }/customerServlet?method=list"
		method=post>

		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG
						src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%"
						background="${pageContext.request.contextPath }/images/new_020.jpg"
						height=20></TD>
					<TD width=15><IMG
						src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg"
						border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：客户管理 &gt; 客户列表</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						<TABLE borderColor=#cccccc cellSpacing=0 cellPadding=0
							width="100%" align=center border=0 style="height: 50px;">
							<TBODY>
								<TR>
									<TD height=25>
										<TABLE cellSpacing=0 cellPadding=2 border=0>
											<TBODY>
												<TR>
													<TD>客户名称：</TD>
													<TD><INPUT class=textbox id=sChannel2
														style="WIDTH: 80px" maxLength=50 name="custName"></TD>

													<TD><INPUT class=button id=sButton2 type=submit
														value=" 筛选 " name=sButton2></TD>
												</TR>
											</TBODY>
										</TABLE>
									</TD>
								</TR>

								<TR>
									<TD>
										<TABLE id=grid
											style="BORDER-TOP-WIDTH: 0px; FONT-WEIGHT: normal; BORDER-LEFT-WIDTH: 0px; BORDER-LEFT-COLOR: #cccccc; BORDER-BOTTOM-WIDTH: 0px; BORDER-BOTTOM-COLOR: #cccccc; WIDTH: 100%; BORDER-TOP-COLOR: #cccccc; FONT-STYLE: normal; BACKGROUND-COLOR: #cccccc; BORDER-RIGHT-WIDTH: 0px; TEXT-DECORATION: none; BORDER-RIGHT-COLOR: #cccccc"
											cellSpacing=1 cellPadding=2 rules=all border=0>
											<TBODY>
												<TR
													style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
													<TD>客户名称</TD>
													<TD>客户级别</TD>
													<TD>客户来源</TD>
													<TD>联系人</TD>
													<TD>电话</TD>
													<TD>手机</TD>
													<TD>操作</TD>
												</TR>
												<c:forEach items="${customer_list}" var="customer">
													<TR
														style="FONT-WEIGHT: normal; FONT-STYLE: normal; BACKGROUND-COLOR: white; TEXT-DECORATION: none">
														<TD>${customer.cust_name }</TD>
														<TD>${customer.cust_level }</TD>
														<TD>${customer.cust_source }</TD>
														<TD>${customer.cust_linkman }</TD>
														<TD>${customer.cust_phone }</TD>
														<TD>${customer.cust_mobile }</TD>
														<TD><a
															href="${pageContext.request.contextPath }/EditCustomerServlet?cust_id=${customer.cust_id}">修改</a>
															&nbsp;&nbsp; <a
															href="${pageContext.request.contextPath }/customerServlet?method=delete&cust_id=${customer.cust_id}">删除</a>
														</TD>
													</TR>

												</c:forEach>

											</TBODY>
										</TABLE>
									</TD>
								</TR>

								<TR style="FONT-WEIGHT: normal; FONT-STYLE: normal; BACKGROUND-COLOR: white; TEXT-DECORATION: none">
									<TD><SPAN id="pagelink" >
											
											<span class="row-selector" style="padding-left:50px;"> 
												<select class="form-control perpage" id="perpage" >
													<option value="2">2</option>
													<option value="5">5</option>
													<option value="10">10</option>
												</select> <!-- react-text: 635 -->rows per page.<!-- /react-text -->
											</span> 
											<span class="pagination-buttons"> 
												<input type="hidden" id="pagehide" value="${pagehide }">
												<input type="hidden" id="perpagehide" value="${perpagehide }">
												<input type="hidden" id="sizehide" value="${sizehide }">
												<button type="button" id="previous" name="page" value="previous" class="button_prev">Previous</button>
												<button type="button" id="1" name="page" value="1" class="button_page">1</button>
												<button type="button" id="2" name="page" value="2" class="button_page">2</button>
												<button type="button" id="3" name="page" value="3" class="button_page">3</button>
												<button type="button" id="4" name="page" value="4" class="button_page">4</button>
												<button type="button" id="5" name="page" value="5" class="button_page">5</button>
												<button type="button" id="next" name="page" value="next" class="button_next">Next</button>
												
											</span>
											
									</SPAN></TD>
								</TR>
							</TBODY>
						</TABLE>
					</TD>
					<TD width=15
						background="${pageContext.request.contextPath }/images/new_023.jpg"><IMG
						src="${pageContext.request.contextPath }/images/new_023.jpg"
						border=0></TD>
				</TR>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG
						src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg"
						height=15></TD>
					<TD width=15><IMG
						src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
</BODY>
</HTML>

