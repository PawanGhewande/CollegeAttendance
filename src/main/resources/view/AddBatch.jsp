
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
                        <li><a href="AddBatch">Add Batches</a></li>
                        <li><a href="ImportStudents">Import Students</a></li>
                    </ul>
                </div>
            </nav>  
        </div>
        <f:view>
            <div class="col s12">
                <div class="row">
                    <center> <h4>Add Batches</h4></center>
                    <div class="col s12 m4">
                    </div>
                    <div class="col s12 m4">
                        <form action="/AddBatch" method="POSt" > 
                            <div class="card ">
                                <div class="card-content">
                                    <div class="input-field">
                                        <input type="text" name="deptName" class="validate">
                                        <label for="deptName">Department Name</label>
                                    </div> 
                                    <div class="input-field "> 
                                        <input type="text" name="className" class="validate">
                                        <label for="className">Class Name</label>
                                    </div> 

                                    <div class="input-field "> 
                                        <input type="text" name="divName" class="validate">
                                        <label for="divName">Division Name</label>
                                    </div>
                                    <div class="input-field "> 
                                        <input type="text" name="batchName" class="validate">
                                        <label for="batchName">Bach</label>
                                    </div>
                                </div>
                                <div class="card-action">
                                    <div class="center">
                                        <button class="btn waves-effect waves-light" type="submit" name="action" style="border-radius: 15px; background-color: #3f51b5;">Save

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
