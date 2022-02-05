
   
<?php
	$firstName = $_POST['firstName'];
	

	// Database connection
	$conn = new mysqli('localhost','root','root','testTable');
	if($conn->connect_error){
		echo "$conn->connect_error";
		die("Connection Failed : ". $conn->connect_error);
	} else {
		$stmt = $conn->prepare("insert into registration(firstName) values(?)");
		$stmt->bind_param("s", $firstName);
		$execval = $stmt->execute();
		echo $execval;
		echo "Registration successfully...";
		$stmt->close();
		$conn->close();
	}
?>