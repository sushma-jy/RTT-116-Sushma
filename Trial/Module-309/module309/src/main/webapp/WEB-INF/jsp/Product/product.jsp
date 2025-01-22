<%--<jsp:useBean id="form" scope="request" type="com.sun.org.apache.xml.internal.security.signature.SignatureProperty"/>
<%--<jsp:useBean id="form" scope="request" type="com.sun.org.apache.xml.internal.security.signature.SignatureProperty"/>--%>
<%--
  Created by IntelliJ IDEA.
  User: Chumpi
  Date: 1/21/2025
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>Create New Products - Restricted to Admins only</h1>--%>

<%--</body>--%>
<%--</html>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../include/header.jsp"/>

<section class="bg-light1 pt-5 pb-5">
    <div class="container">
        <div class="row">
            <h1 class="m-0 text-center">Create New Products - Restricted to Admins only</h1>
        </div>
    </div>
</section>

<style>
    .form_input_error {
        color:red;

    }
</style>

<section class="bg-light2 pt-5 pb-5">
    <div class="container">
        <!-- when you want to do a file upload the form must sumbit using a post -->
        <!-- enctype="multipart/form-data" is needed to allow for file uploads -->
        <form action="/Product/createProduct" method="POST" enctype="multipart/form-data">
            <input type="hidden" name="id" value="${form.id}"/>

            <div class="mt-3 row justify-content-center">
                <label for="productCode" class="col-sm-2 col-form-label">Product Code</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="productCode" name="productCode" value="${form.productCode}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('productCode')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('productCode')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>


            <div class="mt-3 row justify-content-center">
                <label for="productName" class="col-sm-2 col-form-label">Product Name</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="productName" name="productName" value="${form.productName}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('productName')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('productName')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>


            <div class="mt-3 row justify-content-center">
                <label for="productlineId" class="col-sm-2 col-form-label">Product Line ID</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="productlineId" name="productlineId" value="${form.productlineId}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('productlineId')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('productlineId')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>


            <div class="mt-3 row justify-content-center">
                <label for="productScale" class="col-sm-2 col-form-label">Product Scale</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="productScale" name="productScale" value="${form.productScale}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('productScale')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('productScale')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mt-3 row justify-content-center">
                <label for="productVendor" class="col-sm-2 col-form-label">Product Vendor</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="productVendor" name="productVendor" value="${form.productVendor}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('productVendor')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('productVendor')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mt-3 row justify-content-center">
                <label for="productDescription" class="col-sm-2 col-form-label">Product Description</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="productDescription" name="productDescription" value="${form.productDescription}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('productDescription')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('productDescription')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mt-3 row justify-content-center">
                <label for="quantityInStock" class="col-sm-2 col-form-label">Stock Quantity</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="quantityInStock" name="quantityInStock" value="${form.quantityInStock}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('quantityInStock')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('quantityInStock')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mt-3 row justify-content-center">
                <label for="buyPrice" class="col-sm-2 col-form-label">Dealer Price</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="buyPrice" name="buyPrice" value="${form.buyPrice}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('buyPrice')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('buyPrice')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>


            <div class="mt-3 row justify-content-center">
                <label for="msrp" class="col-sm-2 col-form-label">Market Selling Price</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="msrp" name="msrp" value="${form.msrp}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('msrp')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('msrp')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mt-3 row justify-content-center">
                <div class="col-sm-12 col-lg-8">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </div>
        </form>
    </div>
</section>


<jsp:include page="../include/footer.jsp"/>