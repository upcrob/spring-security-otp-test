# Spring Security OTP Test App

This is an example application to demonstrate basic usage of the spring-security-otp plugin.  Note that it is for plugin demonstration purposes only and should not be used as a guide for wider Spring, Spring Security, and web development best practices!

## Config

The following fields will need to be filled in in the `spring-security.xml` file to finish configuring the app:

* "[TEST USER EMAIL]" - the email address that will receive generated tokens
* "[SENDER ACCOUNT EMAIL]" - the email account that will send tokens
* "[SENDER ACCOUNT USERNAME]"
* "[SENDER ACCOUNT PASSWORD]"

If the sending account is not a GMail account, the server and port settings will need to be updated appropriately.
