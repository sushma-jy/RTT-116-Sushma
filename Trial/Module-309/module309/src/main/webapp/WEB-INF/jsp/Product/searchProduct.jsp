<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../include/header.jsp"/>
<body>
<section class="bg-light2 pt-5 pb-5">
  <div class="container">
    <h1 class="text-center">Looking for Hair Styling Products?</h1>
    <h3 class="text-center">Type in to search for the product you want</h3>
  </div>
</section>

<section class="bg-light1 pt-5 pb-5">
  <div class="container">
    <form action="/Product/searchProduct" class="mb-0">
      <div class="row justify-content-center">
        <div class="col-6">
          <div class="mb-3">
            <label for="productName" class="form-label">Product Name</label>
            <input type="text" class="form-control" id="productName" name="productName" value="${search}">
          </div>
        </div>
      </div>
      <div class="row justify-content-center">
        <div class="col-6">
          <button type="submit" class="btn btn-primary">Search</button>
        </div>
      </div>
    </form>
  </div>
</section>

<c:if test="${not empty search}">
  <section class="bg-light2 pt-5 pb-5">
    <div class="container">
      <h2 class="text-center">Is this the Product you are looking for? (${productKey.size()})</h2>

      <table class="table mt-5">
        <tr>
          <th>Product Name</th>
          <th>Product Code</th>
          <th>Product Vendor</th>
          <th>Product Description</th>
          <th>Stock left</th>
          <th>Sale Price</th>
        </tr>
        <c:forEach var="Product" items="${productKey}">
          <tr>
            <td>${Product.productName}</td>
            <td>${Product.productCode}</td>
            <td>${Product.productVendor}</td>
            <td>${Product.productDescription}</td>
            <td>${Product.quantityInStock}</td>
            <td>${Product.msrp}</td>
            <td><a href="/Product/orderProduct/${Product.id}">Add to Cart</a></td>
          </tr>
        </c:forEach>
      </table>
    </div>
  </section>
  </body>
</c:if>

<jsp:include page="../include/footer.jsp"/>