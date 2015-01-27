function generateOtp() {
	var statusField = document.getElementById('statusField');
	statusField.innerHTML = 'Sending token...'
	var xmlhttp=new XMLHttpRequest();
	xmlhttp.onreadystatechange = function() {
		if (xmlhttp.readyState==4 && xmlhttp.status==200) {
			statusField.innerHTML = 'Token sent.';
		}
	}
	
	var username = document.getElementById('username').value;
	xmlhttp.open("POST","/spring-security-otp-test/generatetoken", true);
	xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	xmlhttp.send("username=" + username);
}