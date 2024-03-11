<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Animated Login</title>
    <link rel="stylesheet" href="login.css" type="text/css" /> 
    <style type="text/css">
    *{
    margin: 0;
    padding: 0;
    font-family: 'Times New Roman', Times, serif;
    box-sizing: border-box;
}
.container{
    width: 100%;
    height: 100vh;
    background: linear-gradient(45deg, rgba( 405, 52, 172, 0.8), rgba(257,175,89,0.8));
    padding: 1px;
    overflow: hidden;
}
.header nav{
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    flex-wrap: wrap;
    margin-top: 40px;
}
nav .logo{
    margin-left: 100px;
    font-size: 25px;
    font-weight: 400;
    cursor: pointer;

}
.content ul li{
    display: inline-block;
    margin-right: 30px;
    list-style: none;
    font-size: 25px;
    cursor: pointer;
}
.signIn1{
    position: relative;
}
.signIn1 .signIn{
    /* border: 5px solid #fff; */
    width: 450px;
    height: 500px;
    transform: translate(125%,20%);
    border-radius: 25% 0px 25% 0px;
    animation: borde 5s linear infinite;
    background-color: #fff;
    padding: 1px;


}

.signIn1 .signIn::before{
    position: absolute;
    width: 100%;
    height: 100%;
    border-radius: 25% 0px 25% 0px;
    content: '';
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
}
@keyframes borde{
    0%{
        transform:rotate3d(0deg);
        box-shadow: 5px 5px 10px red;
    }
    25%{
        transform: rotate3d(180deg);
        box-shadow: 5px 5px 10px green;
    }
    100%{
        transform: rotate3d(360deg);
        box-shadow: 5px 5px 10px blue;
    }
}


/* Sign iN */

.signIn h1{
    text-align: center;
    margin-top: 80px;
}
.signIn form{
    position: absolute;
    margin-top: 60px;
    margin-right: 50px;
    margin-left: 50px;
}
.signIn form input{
    width: 350px;
    height: 45px;
    gap: 20px;
    border-top: none;
    border-left: none;
    border-right: none;
    font-size: 15px;
    outline: none;
}
.email{
    margin-top: 20px;
    margin-bottom: 30px;
}
.signIn form input::placeholder{
    font-size: 20px;
    padding-left: 10px;
}
.signIn form button{
    margin-top: 50px;
    margin-bottom: 30px;
    margin-left: 15%;
    width: 250px;
    height: 45px;
    font-size: 4;
    font-weight: 400;
    background-color: pink;
    color: #000;
    cursor: pointer;
}

    </style>

  </head>
  <body>
    <div class="container">
      <div class="header">
        <nav>
          <div class="logo">
            <h3>NNBHanu</h3>
          </div>
          <div class="content">
            <ul>
              <li>Home</li>
              <li>Contact</li>
              <li>Information</li>
              <li>Details</li>
            </ul>
          </div>
        </nav>
      </div>
      <div class="signIn1">
        <div class="signIn">
            <h1>signIn</h1>
          <form action="hello" method="post">
            <input type="email" placeholder="Email" class="email" name="email" required="required">
            <input type="password" placeholder="password" name="password" required="required" >
            <button>SignIn</button>
          </form>
            
        </div>
      </div>
    </div>
  </body>
</html>
    