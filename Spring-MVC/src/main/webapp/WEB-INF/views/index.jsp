<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Job Application For</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .application-container {
            margin-top: 1%;
            text-align: center;
            padding: 40px;
            padding-top: 10px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 500px;
            background-color: white;
        }

        .application-container h1 {
            font-size: 28px;
            color: #333;
            margin-bottom: 20px;
        }

        .application-container input,
        .application-container select,
        .application-container textarea {
            width: 95%;
            padding: 12px;
            margin: 10px 0;
            font-size: 14px;
            border: 1px solid #ddd;
            border-radius: 12px;
        }

        .application-container button {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            font-size: 16px;
            font-weight: bold;
            background: #16192c;
            color: white;
            border: none;
            border-radius: 25px;
            cursor: pointer;
        }

        .application-container button:hover {
            background: #222f3f;
        }

        /* Prevent textarea from being resized */
        textarea {
            resize: none;
        }

        /* Style for the gender options to be inline */
        .gender-options input {
            width: auto;
            display: inline-block;
            margin-right: 20px;
        }

        /* Style for the prefix and name fields */
        .name-prefix select {
            display: inline-block;
            width: 20%;
            margin-right: 10px;
        }

        /* Clear fix for floating elements */
        .clearfix {
            clear: both;
        }

        /* Make the layout responsive */
        @media (max-width: 768px) {
            .application-container {
                width: 90%;
                margin: 50px;
                margin-top: 100%;
                background-color: rgb(250, 250, 250);
            }

            .name-prefix select,
            .application-container input,
            .application-container select,
            .application-container textarea {
                width: 100%;
            }

            .gender-options {
                text-align: left;
            }

            .gender-options input,
            .gender-options label {
                margin-right: 10px;
            }

            .name-prefix select,
            .name-prefix input {
                width: 100%;
            }

            .clearfix {
                clear: both;
            }

        }

        @media (max-width: 480px) {
            .application-container {

                width: 90%;
                margin: 50px;
                margin-top: 140%;
                background-color: rgb(250, 250, 250);

            }

            .application-container h1 {
                font-size: 24px;
            }

            .gender-options {
                display: block;
                text-align: left;
            }

            .gender-options input,
            .gender-options label {
                margin-right: 10px;
            }

            .name-prefix select,
            .name-prefix input {
                width: 100%;
                margin-bottom: 10px;
            }

            .name-prefix select,
            .name-prefix input {
                width: 100%;
            }
        }
    </style>
</head>

<body>
    <div class="application-container">
        <h1>Employee Details</h1>
        <form action="empDetails" method="post">
            <!-- Prefix Dropdown and Name Fields -->
            <div class="name-prefix">
                <select name="prefix" required style="float: left;">
                    <option value="">Prefix</option>
                    <option value="Mr.">Mr.</option>
                    <option value="Mrs.">Mrs.</option>
                    <option value="Dr.">Dr.</option>
                    <option value="Ms.">Ms.</option>
                </select>
                <input type="text" name="firstname" placeholder="First  Name" style="width: 72.5%;" required><br>
            </div>
            <div class="clearfix"></div>

            <input type="text" name="middlename" placeholder="Middle  Name" required>
            <input type="text" name="lastname" placeholder="Last  Name" required>

            <div class="clearfix"></div>
            <br>
            <div class="gender-options">
                <label style="margin-right: 15%;">Gender</label>

                <input type="radio" id="male" name="gender" value="male" style="margin-right: 0%;" required>
                <label for="male" style="margin-right: 5%;">Male</label>

                <input type="radio" id="female" name="gender" value="female" style="margin-right: 0%;" required>
                <label for="female" style="margin-right: 5%;">Female</label>

                <input type="radio" id="other" name="gender" value="other" style="margin-right: 0%;" required>
                <label for="other" style="margin-right: 5%;">Other</label>
            </div>
            <br>
            <div class="clearfix"></div>

            <input type="email" name="email" placeholder="Email  Address" required>
            <input type="tel" name="phone" placeholder="Phone  Number" required>

            <!-- Educational Details -->
            <select id="qualification" name="qualification" style="width: 100%;" required>
                <option value="">Select Highest Qualification</option>
                <option value="High School">High School</option>
                <option value="Diploma">Diploma</option>
                <option value="Bachelor's">Bachelor's</option>
                <option value="Master's">Master's</option>
                <option value="PhD">PhD</option>
            </select>
            
            <button type="submit">Submit Application</button>

        </form>
    </div>
</body>

</html>