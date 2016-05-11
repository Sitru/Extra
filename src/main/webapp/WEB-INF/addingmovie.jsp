
<html lang="en">

<head>



<title>AddMovie</title>


</head>

<body>

	<div class="brand">AddMovie</div>

	
	<div class="container">


		<div class="row">
			<div class="box">
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						<strong>Add Movie</strong>
					</h2>
					<hr>
					<form role="form" action="./addingmovie" method="post">
						<div class="row">
							
							<div class="form-group col-lg-4">
								<label>id</label> 
								<input type="text" name="id"  class="form-control"/>
							</div>
                            <br>
                            <div class="form-group col-lg-4">
								<label>Movie Title</label> 
								<input type="text" name="title" class="form-control" />
							</div>
                            <br>
							<div class="form-group col-lg-4">
								<label>Rating</label> 
								<input	type="text" name="rating"  size="40" class="form-control">
							</div>
							<br>
							<div class="form-group col-lg-4">
								<label>Year</label> 
								<input type="text" name="year" class="form-control"  />
							</div>
							<br>
							<div class="form-group col-lg-4">
								<label>Sumary</label>
								 <input type="text" name="sumary"	class="form-control"  />
							</div>
                            <br>
							<div class="form-group col-lg-4">
                                
							    <label>Genere</label></br>
								<select class="selectpicker" name="type" class="form-control">
									<option value="SCI_FI">SCI_FI</option>
									<option value="ACTION">ACTION</option>
									<option value="ROMANCE">ROMANCE</option>
									<option value="HORROR">HORROR</option>
									<option value="COMEDY">COMEDY</option>
									<option value="Adventure">Adventure</option>
									<option value="CRIME">CRIME</option>
									<option value="FANTASY">FANTASY</option>
									<option value="MYSTERY">MYSTERY</option>
								</select>
							</div>
                        <br>
							<div class="clearfix"></div>

							<div class="form-group col-lg-12">
								<input type="hidden" name="save" value="contact">
								<button type="submit" class="btn btn-default">Submit</button>
								</div>
						</div>
					</form>
				</div>
			</div>
		</div>

	</div>

	<!-- /.container -->

	

</body>

</html>
