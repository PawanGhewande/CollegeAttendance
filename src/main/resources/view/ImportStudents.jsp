

<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
        <link href="/css/main.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>
    <body>
        <div>
            <nav style="background: #3f51b5;">
                <div class="nav-wrapper-red">

                    <a href="#" class="brand-logo center">Attendance Tracker</a>
                    <ul id="nav-mobile" class="right hide-on-med-and-down">
                        <li><a href="AddSubject">Add Subject</a></li>
                        <li><a href="AddTeacher">Add Teacher</a></li>
                        <li><a href="AddClass">Add Class</a></li>
                        <li><a href="ImportStudents">Import Students</a></li>
                    </ul>
                </div>
            </nav>  
        </div>
        <f:view>
            <div class="col s12">
                <div class="row">
                    <center> <h4>Import Students</h4></center>
                    <div class="col s12 m4">
                    </div>
                    <div class="col s12 m4">
                        <form action="/ImportStudents" method="POST" enctype="multipart/form-data"> 
                            <div class="card ">
                                <div class="card-content">
                                    <div class="input-field "> 
                                        <input type="text" name="deptName" class="validate" required="" aria-required="true">
                                        <label for="Department Name">Department Name</label>
                                    </div> 
                                    <div class="input-field "> 
                                        <input type="text" name="className" class="validate" required="" aria-required="true">
                                        <label for="className">Class Name</label>
                                    </div> 
                                    <div class="input-field">
                                        <input type="text" name="divName" class="validate">
                                        <label for="divName">Div Name</label>
                                    </div>
                                    <div class="file-field input-field">
                                            <div class="btn" style="border-radius: 15px; background-color: #3f51b5;">
                                                <span>File</span>
                                                <input type="file" name="studentsFile" >
                                            </div>
                                            <div class="file-path-wrapper">
                                                <input class="file-path validate"  type="text" placeholder="Import excel file...">
                                            </div>
                                        </div>
                                </div>
                                <div class="card-action">
                                <div class="center">
                                    <button class="btn waves-effect waves-light" type="submit" style="border-radius: 15px; background-color: #3f51b5;">Import
                                    </button>
                                </div>
                            </div>
                            </div>
                        </form>    
                    </div>
                    <div class="col s12 m4">
                    </div>
                </div>
            </div>
        </f:view>
        <script src="/js/main.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </body>
</html>

