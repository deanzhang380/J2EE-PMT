<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Services Registered</title>

<!-- Custom fonts for this template-->
<link href="<c:url value = "/vendor/fontawesome-free/css/all.min.css"/>"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="<c:url value = "/css/sb-admin-2.min.css"/>" rel="stylesheet">
<link href="<c:url value = "/css/main.css"/>" rel="stylesheet"
	media="all">

<!-- Font special for pages-->

<!-- Vendor CSS-->
<link href="<c:url value = "/vendor/select2/select2.min.css"/>"
	rel="stylesheet" media="all">
<link href="<c:url value = "/vendor/datepicker/daterangepicker.css"/>"
	rel="stylesheet" media="all">

<!-- Main CSS-->
<link
	href="<c:url value = "/vendor/datatables/dataTables.bootstrap4.min.css"/>"
	rel="stylesheet">

</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<ul
			class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
			id="accordionSidebar">

			<!-- Sidebar - Brand -->
			<a
				class="sidebar-brand d-flex align-items-center justify-content-center"
				href="index.html">
				<div class="sidebar-brand-icon">
					<i class="fa fa-user-md"></i>
				</div>
				<div class="sidebar-brand-text mx-3">
					UserName <sup>2</sup>
				</div>
			</a>

			<!-- Divider -->
			<hr class="sidebar-divider my-0">

			<!-- Nav Item - Dashboard -->
			<li class="nav-item active"><a class="nav-link"
				href="index.html"> <i class="fas fa-home"></i> <span>Home</span></a>
			</li>

			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Heading -->
			<div class="sidebar-heading">Interface</div>

			<!-- Nav Item - Pages Collapse Menu -->
			<li class="nav-item"><a class="nav-link"
				href="patientSearch.html"> <i class="fas fa-medkit"></i> <span>Patients
						List</span></a></li>

			<!-- <li class="nav-item"><a class="nav-link" href="examines.html">
					<i class="fas fa-medkit"></i> <span>Examines</span>
			</a></li>

			<li class="nav-item"><a class="nav-link" href="medicalBill.html">
					<i class="fas fa-medkit"></i> <span>Medical Bill</span>
			</a></li> -->
			<hr class="sidebar-divider">

		</ul>
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<nav
					class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

					<!-- Sidebar Toggle (Topbar) -->
					<button id="sidebarToggleTop"
						class="btn btn-link d-md-none rounded-circle mr-3">
						<i class="fa fa-bars"></i>
					</button>

					<!-- Topbar Search -->
					<form
						class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
						<div class="input-group">
							<input type="text" class="form-control bg-light border-0 small"
								placeholder="Search for..." aria-label="Search"
								aria-describedby="basic-addon2">
							<div class="input-group-append">
								<button class="btn btn-primary" type="button">
									<i class="fas fa-search fa-sm"></i>
								</button>
							</div>
						</div>
					</form>

					<!-- Topbar Navbar -->
					<ul class="navbar-nav ml-auto">

						<!-- Nav Item - Search Dropdown (Visible Only XS) -->
						<li class="nav-item dropdown no-arrow d-sm-none"><a
							class="nav-link dropdown-toggle" href="#" id="searchDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-search fa-fw"></i>
						</a> <!-- Dropdown - Messages -->
							<div
								class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
								aria-labelledby="searchDropdown">
								<form class="form-inline mr-auto w-100 navbar-search">
									<div class="input-group">
										<input type="text"
											class="form-control bg-light border-0 small"
											placeholder="Search for..." aria-label="Search"
											aria-describedby="basic-addon2">
										<div class="input-group-append">
											<button class="btn btn-primary" type="button">
												<i class="fas fa-search fa-sm"></i>
											</button>
										</div>
									</div>
								</form>
							</div></li>

						<div class="topbar-divider d-none d-sm-block"></div>

						<!-- Nav Item - User Information -->
						<li class="nav-item dropdown no-arrow"><a
							class="nav-link dropdown-toggle" href="#" id="userDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <span
								class="mr-2 d-none d-lg-inline text-gray-600 small">Username</span>
								<img class="img-profile rounded-circle"
								src="https://source.unsplash.com/QAB-WJcbgJk/60x60">
						</a> <!-- Dropdown - User Information -->
							<div
								class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="userDropdown">
								<a class="dropdown-item" href="#"> <i
									class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i> Profile
								</a> <a class="dropdown-item" href="#"> <i
									class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
									Settings
								</a> <a class="dropdown-item" href="#"> <i
									class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
									Activity Log
								</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="#" data-toggle="modal"
									data-target="#logoutModal"> <i
									class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
									Logout
								</a>
							</div></li>

					</ul>

				</nav>
				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">
					<!-- Page Heading -->
					<div
						class="d-sm-flex align-items-center justify-content-between mb-4">
						<h1 class="h3 mb-0 text-gray-800">Medical Bill</h1>
					</div>
					<form action="<c:url value='/Doctor/MedicalBill'/>" method="POST">
						<div class="card card-5">
							<div class="card-body">
								<div method="POST">
									<div class="form-row ">
										<div class="name"></div>
										<div class="value">
											<div class="row row-space-2-items">
												<div class="col-2">
													<div class="input-group-desc">
														<input type="text" class="form-control form-control-user"
															name="diagnosis" value="${diagnosis}" disabled> <label
															class="label--desc">Diagnosis ID</label>
													</div>
												</div>
												<div class="col-2">
													<div class="input-group-desc">
														<!-- <input class="input--style-5" type="text" name="" value="40"
                                                        disabled> -->
														<input type="text" class="form-control form-control-user"
															name="patientId" value="${patientId}" disabled> <label
															class="label--desc">Patients ID</label>
													</div>
												</div>
												<div class="col-2">
													<div class="input-group-desc">
														<!-- <input class="input--style-5" type="text" name="" value="40"
                                                      disabled> -->
														<input type="text" class="form-control form-control-user"
															name="date" value="${date}" disabled> <label
															class="label--desc">Date</label>
													</div>
												</div>
											</div>

										</div>
									</div>
									<div class="form-row m-b-20">
										<div class="name">Full Name</div>
										<div class="value">
											<div class="row row-space">
												<div class="col-4">
													<div class="input-group-desc">
														<input type="text" class="form-control form-control-user"
															name="patientName" value="${patientName}" disabled>
													</div>
												</div>
											</div>

										</div>
									</div>

									<div class="form-row m-b-20">
										<div class="name">Medicine Name</div>
										<div class="value">
											<div class="input-group">
												<div class="rs-select2 js-select-simple select--no-search">
													<select name="medicine" id="diseaseSelect"
														style="width: 300px; height: 40px">
														<option disabled="disabled" selected="selected">Medicine</option>
														<c:forEach items="${medicine}" var="item">
															<option value="${item.getId()}">
																${item.getTenThuoc()}</option>
														</c:forEach>
													</select>
													<div class="select-dropdown"></div>
												</div>
											</div>
										</div>
									</div>

									<div class="form-row m-b-20" style="display: flex;">

										<div style="display: flex; margin-right: 40px;">
											<div class="name">Unit</div>
											<div class="value">
												<div class="input-group">
													<div class="rs-select2 js-select-simple select--no-search">
														<select name="unit" style="width: 100px; height: 30px">
															<option disabled="disabled" selected="selected">Unit</option>
															<c:forEach items="${unit}" var="unitItem">
																<option value="${unitItem.getMaDonVi()}">
																	${unitItem.getTenDonVi()}</option>
															</c:forEach>
														</select>
														<div class="select-dropdown"></div>
													</div>
												</div>
											</div>
										</div>
										<div style="display: flex; margin-right: 40px;">
											<div class="name">Usage</div>
											<div class="value">
												<div class="input-group">
													<div class="rs-select2 js-select-simple select--no-search">
														<select name="usage" style="width: 100px; height: 30px">
															<option disabled="disabled" selected="selected">Usage</option>
															<c:forEach items="${usage}" var="UsageItem">
																<option value="${UsageItem.getMaCachDung()}">
																	${UsageItem.getCachDung()}</option>
															</c:forEach>
														</select>
														<div class="select-dropdown"></div>
													</div>
												</div>
											</div>
										</div>
										<div style="display: flex; margin-right: 20px;">
											<div class="name"
												style="text-align: center; margin-top: 10px;">Number</div>
											<div class="value">
												<div class="row row-space">
													<div class="col-12">
														<div class="input-group-desc">
															<input type="text" class="form-control form-control-user"
																name="number" id="exampleLastName" value="">
														</div>
													</div>
												</div>

											</div>
										</div>
										<div style="margin-right: 50px;">
											<button class="btn btn--radius-2 btn--blue" type="submit"
												name="functionAdd">Add</button>
										</div>

									</div>

									<div style="display: flex;">
										<div style="margin-right: 50px;">
											<button class="btn btn--radius-2 btn--blue" type="submit"
												name="functionComplete">Complete</button>
										</div>
										<div style="margin-right: 50px;">
											<button class="btn btn--radius-2 btn--blue" type="submit"
												name="functionPrint">Print Medical Bill</button>
										</div>
										<div style="margin-right: 50px;">
											<button class="btn btn--radius-2 btn--blue" type="submit"
												name="functionCancel">Cancel</button>
										</div>
									</div>


									<div class="" style="margin-top: 20px;">
										<div class="table-responsive">
											<table class="table table-bordered" id="dataTable"
												width="100%" cellspacing="0">
												<thead>
													<tr>
														<th>Medicine Name</th>
														<th>Unit</th>
														<th>Number</th>
														<th>Usage</th>											
														<th>Remove</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach items="${prescriptionDetailList}" var="item">
														<tr>
															<td>${item.getThuoc().getTenThuoc()}</td>
															<td>${item.getDonVi().getTenDonVi()}</td>
															<td>${item.getSoLuong()}</td>
															<td>${item.getCachDung().getCachDung()}</td>
															<td><a href="<c:url value='/Doctor/MedicalBill?id=${patientId}&date=${date}&diagnosis=${diagnosis}&remove=${item.getThuoc().getId()}'/>"
													method="POST"> Remove</a></td>
														</tr>
													</c:forEach>
												</tbody>
											</table>
										</div>
									</div>
								</div>
					</form>
				</div>
			</div>
			</form>
		</div>
		<!-- End of Main Content -->

		<!-- Footer -->
		<footer class="sticky-footer bg-white">
			<div class="container my-auto">
				<div class="copyright text-center my-auto">
					<span>Copyright &copy; Your Website 2020</span>
				</div>
			</div>
		</footer>
		<!-- End of Footer -->

	</div>
	<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="login.html">Logout</a>
				</div>
			</div>
		</div>
	</div>
	<!-- Bootstrap core JavaScript-->
	<script src="<c:url value = "/vendor/jquery/jquery.min.js"/>"></script>
	<script
		src="<c:url value = "/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>

	<!-- Core plugin JavaScript-->
	<script
		src="<c:url value = "/vendor/jquery-easing/jquery.easing.min.js"/>"></script>

	<!-- Custom scripts for all pages-->
	<script src="<c:url value = "/js/sb-admin-2.min.js"/>"></script>

	<!-- Page level plugins -->
	<script src="<c:url value = "/vendor/chart.js/Chart.min.js"/>"></script>

	<!-- Page level custom scripts -->
	<script src="<c:url value = "/js/demo/chart-area-demo.js"/>"></script>
	<script src="<c:url value = "/js/demo/chart-pie-demo.js"/>"></script>

	<!-- Page level plugins -->
	<script
		src="<c:url value = "/vendor/datatables/jquery.dataTables.min.js"/>"></script>
	<script
		src="<c:url value = "/vendor/datatables/dataTables.bootstrap4.min.js"/>"></script>

	<!-- Page level custom scripts -->
	<script src="<c:url value = "/js/demo/datatables-demo.js"/>"></script>
</body>

</html>