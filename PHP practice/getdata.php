<!-- 
@author: Amey
-->
<?php
	$con=mysqli_connect("localhost","root","","mysql");
	// Check connection
	if (mysqli_connect_errno())
	  {
	  echo "Failed to connect to MySQL: " . mysqli_connect_error();
	  }
	//echo ' connected to DB.';
	//echo '<pre>';
	$val = implode("",$_POST);
	echo $val;

	if ($val == "first") {
		//echo "hello am in  1";
		if (mysqli_query($con,"select id,name from students where course = 'CS'") == TRUE) {
			$res = mysqli_query($con,"select id,name from students where course = 'CS'");
			//echo 'query success';
			while ($query_execute = mysqli_fetch_assoc($res)) {
				echo '<table border = "1" style = "width:300px"><tr><td>'.$query_execute['id'].'</td><td>'.$query_execute['name'].'</td></tr></table>'.'<br>';
			}
		}
		else {
			echo "error";
		}
	}
	else if ($val == "second") {
		//echo "inside 2";
		if (mysqli_query($con,"select cNo,title from courses where cNo In ( select cNo from transcripts where id = ( select id from students where name = 'Ef') and grade = 'A' or grade = 'B')") == TRUE) {
			$res = mysqli_query($con,"select cNo,title from courses where cNo In ( select cNo from transcripts where id = ( select id from students where name = 'Ef') and grade = 'A' or grade = 'B')");
			//echo 'query 2 success';
			while ($query_execute = mysqli_fetch_assoc($res)) {
				echo '<table><tr><tb>'.$query_execute['cNo'].'</td><td>'.$query_execute['title'].'</td></tr></table>'.'<br>';
			}
		}
	}
	else if ($val == "third") {
		//echo 'inside 3';
		if (mysqli_query($con, "select s.id,s.name,sum(c.credits) as total_credits from students s join courses c join transcripts t where s.id = t.id and c.cNo = t.cNo group by s.id;
		SUBMIT") == TRUE) {
			//echo 'query 3 success';
			$res = mysqli_query($con, "select s.id,s.name,sum(c.credits) as total_credits from students s join courses c join transcripts t where s.id = t.id and c.cNo = t.cNo group by s.id;
		SUBMIT");
			while ($obj = mysql_fetch_assoc($res)) {
				echo '<table><tr><tb>'.$obj['id'].'</td><td>'.$obj['name'].'</td><td>'.$obj['total_credits'].'</td></tr></table>'.'<br>';
			}
		}
	}
	mysqli_close($con);
?>