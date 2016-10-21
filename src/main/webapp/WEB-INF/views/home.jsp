<!DOCTYPE html>
<html lang="en">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  
<head>
  <title>Shop 360Degree</title>
  <meta charset="utf-8">
 
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!...............carosel.........................>
<style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Shop here</a>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Books and More<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Stationery</a></li>
            <li><a href="#">Music</a></li>
            <li><a href="#">Sports</a></li>
          </ul>
<li class="dropdown">
 <a class="dropdown-toggle" data-toggle="dropdown" href="#">Electronics<span class="caret"></span></a>
          <ul class="dropdown-menu">
      <li>  <a href="#">Mobiles</a><li>
      <li>  <a href="#">Laptops</a></li>
      </ul>
<li class="dropdown">
 <a class="dropdown-toggle" data-toggle="dropdown" href="#">Appliances<span class="caret"></span></a>
          <ul class="dropdown-menu">
       <li> <a href="#">Home entertainments</a><li>
        <li><a href="#">Washing machines</a></li>
      </ul>

      <ul class="nav navbar-nav navbar-right">
        <li><a href="Register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="LoginHere"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
       
      </ul>
    </div>
  </div>
</nav>
  <div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>
<!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src=<c:url value="/resources/Appple2.jpg"/> class="img-responsive">
        <div class="carousel-caption">
          <h3>Laptops</h3>
          <p>ALL Brands at best prices .</p>
        </div>
      </div>

    <div class="item">
         <img src=<c:url value="/resources/watch.jpg"/> class="img-responsive">
        <div class="carousel-caption">
          <h3>Watches</h3>
          <p>30-50% off best brands.</p>
        </div>
      </div>
    
      <div class="item">
         <img src=<c:url value="/resources/st.jpg"/> class="img-responsive">
        <div class="carousel-caption">
          <h3>Stationery</h3>
          <p>special offer for classmates notebooks</p>
        </div>
      </div>

      <div class="item">
         <img src=<c:url value="/resources/lap.jpg"/> class="img-responsive">
        <div class="carousel-caption">
          <h3>i phones</h3>
          <p>Discount is only for short time .shop now</p>
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>

