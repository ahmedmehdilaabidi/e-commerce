<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/bootstrap/dist/css/bootstrap.min.css">


</head>
<body>
<div class="container">
	<div class="row">
        <div class="col-sm-12">
            <legend>E-Commerce Plateforme:</legend>
        </div>
        <!-- panel preview -->
        <div class="col-sm-5">
            <h4>Product :</h4>
            <div class="panel panel-default">
                <div class="panel-body form-horizontal payment-form">
                    <div class="form-group">
                        <label for="nom" class="col-sm-3 control-label">Nom</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="nom" name="nom">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Description</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="description" name="description">
                        </div>
                    </div> 
                    <div class="form-group">
                        <label for="amount" class="col-sm-3 control-label">Prix</label>
                        <div class="col-sm-9">
                            <input type="number" class="form-control" id="prix" name="prix">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="status" class="col-sm-3 control-label">Taille</label>
                        <div class="col-sm-9">
                            <select class="form-control" id="taille" name="taille">
                                <option>S</option>
                                <option>XL</option>
                            </select>
                        </div>
                    </div> 
<!--                     <div class="form-group"> -->
<!--                         <label for="date" class="col-sm-3 control-label">Date</label> -->
<!--                         <div class="col-sm-9"> -->
<!--                             <input type="date" class="form-control" id="date" name="date"> -->
<!--                         </div> -->
<!--                     </div>    -->
                    <div class="form-group">
                        <div class="col-sm-12 text-right">
                            <button type="button" class="btn btn-default preview-add-button">
                                <span class="glyphicon glyphicon-plus"></span> Add
                            </button>
                        </div>
                    </div>
                </div>
            </div>            
        </div> <!-- / panel preview -->
        <div class="col-sm-7">
            <h4>Preview:</h4>
            <div class="row">
                <div class="col-xs-12">
                    <div class="table-responsive">
                        <table class="table preview-table">
                            <thead>
                                <tr>
                                    <th>Nom</th>
                                    <th>Description</th>
                                    <th>Amount</th>
                                    <th>Status</th>
                                    <th>Date</th>
                                </tr>
                            </thead>
                            <tbody></tbody> <!-- preview content goes here-->
                        </table>
                    </div>                            
                </div>
            </div>
            <div class="row text-right">
                <div class="col-xs-12">
                    <h4>Total: <strong><span class="preview-total"></span></strong></h4>
                </div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <hr style="border:1px dashed #dddddd;">
                    <button type="button" class="btn btn-primary btn-block">Submit all and finish</button>
                </div>                
            </div>
        </div>
	</div>
</div>
<script src="resources/jquery/dist/jquery.min.js"></script>
<script src="resources/bootstrap/dist/js/dashboard.js"></script>

</body>
</html>
