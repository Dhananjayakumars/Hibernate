<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
    <title>Document</title>
</head>
<body>
   
</body>
<div class="container">
    <div class="row text-center" style="color: tomato;">
     <h2>Tell us about your House</h2>
    </div>
    <hr>
     <div class="row col-md-10 col-md-offset-3"> 
      
      <div class="card card-body">
      
       <h2>House selling register Form</h2>
       <div class="col-md-8 col-md-offset-3">
   
        <form action="registration" method="post">
   
         <div class="form-group">
          <label for="uname">House Name:</label> <input type="text"
           class="form-control" name="name" id="uname" placeholder="House Name"
            required>
         </div>
   
         <div class="form-group">
          <label for="uname">Total Rooms:</label> <input type="number"
           class="form-control" id="uname" name="noOfRooms" placeholder="Enter no of Rooms"
           required>
         </div>
   
         <div class="form-group">
          <label for="uname">Location:</label> <input type="text"
           class="form-control" id="username" name="location" placeholder="Enter Location"
           required>
         </div>
   
         <div class="form-group">
            <label for="uname">Total Floors:</label> <input type="number"
             class="form-control" id="uname" name="noOfFloors" placeholder="Enter no of Floors"
              required>
           </div>
           <div class="form-group">
            <label for="uname">Total Area of House</label> <input type="number"
             class="form-control" id="uname" name="sqMeter" placeholder="Enter Total Area"
              required>
           </div>
          
         <button type="submit" class="btn btn-primary">Submit</button>
        
        
        </form>
       </div>
      </div>
     </div>
    </div>



<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
</html>