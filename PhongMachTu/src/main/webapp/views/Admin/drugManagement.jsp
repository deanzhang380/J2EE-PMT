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

<title>Home</title>

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
			<li class="nav-item active"><a class="nav-link" href=""> <i
					class="fas fa-home"></i> <span>Home</span></a></li>

			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Heading -->
			<div class="sidebar-heading">Manage Resource</div>

			<li class="nav-item"><a class="nav-link"
				href="<c:url value='/Admin/accountManagement'/>" method="POST">
					<i class="fas fa-user-circle"></i> <span>Account Management</span>
			</a></li>
			<li class="nav-item"><a class="nav-link"
				href="<c:url value='/Admin/drugManagement'/>" method="POST"> <i
					class="fas fa-prescription-bottle-alt"></i> <span>Drug
						Management</span></a></li>
			<li class="nav-item"><a class="nav-link"
				href="<c:url value='/Admin/unitManagement'/>" method="POST"> <i
					class="fas fa-tablets"></i> <span>Unit Management</span></a></li>
			<li class="nav-item"><a class="nav-link"
				href="<c:url value='/Admin/methodManagement'/>" method="POST"> <i
					class="fas fa-notes-medical"></i> <span>Method Management</span></a></li>
			<li class="nav-item"><a class="nav-link"
				href="<c:url value='/Admin/parameterManagement'/>" method="POST">
					<i class="fas fa-list-ol"></i> <span>Parameter Management</span>
			</a></li>
			<!-- Nav Item - Pages Collapse Menu -->
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
						<h1 class="h3 mb-0 text-gray-800">Drug Register</h1>

					</div>
					<form action="<c:url value='/reception/register'/>" class="patient"
						method="POST">
						<div class="card card-5">
							<div class="card-body">
								<form method="POST">
									<div class="form-row m-b-20">
										<div class="name">ID</div>
										<div class="value">
											<div class="row row-space">
												<div class="col-6">
													<div class="input-group-desc">
														<input type="text" class="form-control form-control-user"
															name="id">
													</div>
												</div>

											</div>
										</div>
									</div>
									<div class="form-row m-b-20">
										<div class="name">Drug Name</div>
										<div class="value">
											<div class="row row-space">
												<div class="col-6">
													<div class="input-group-desc">
														<input type="text" class="form-control form-control-user"
															name="drugName">
													</div>
												</div>

											</div>
										</div>
									</div>

									<div class="form-row m-b-20">
										<div class="name">Price</div>
										<div class="value">
											<div class="row row-space">
												<div class="col-6">
													<div class="input-group-desc">
														<input type="number"
															class="form-control form-control-user" name="price">
													</div>
												</div>
											</div>
										</div>
									</div>

									<div style="display: flex;">
										<button style="margin-right: 20px"
											class="btn btn--radius-2 btn--blue" action="create"
											type="submit">Create</button>
										<button style="margin-right: 20px"
											class="btn btn--radius-2 btn--blue" action="update"
											type="submit">Update</button>
										<button style="margin-right: 20px"
											class="btn btn--radius-2 btn--blue" action="submit"
											type="submit">Delete</button>
									</div>
								</form>

								<div style="margin-top: 10px" class="card shadow mb-4">
									<div class="card-header py-3">
										<h6 class="m-0 font-weight-bold text-primary">Patients
											Table</h6>
									</div>
									<div class="card-body">
										<div class="table-responsive">
											<table class="table table-bordered" id="dataTable"
												width="100%" cellspacing="0">
												<thead>
													<tr>
														<th>Drug ID</th>
														<th>Drug Name</th>
														<th>Price</th>
													</tr>
												</thead>
												<tbody>
													<tr>
														<td></td>
													</tr>

												</tbody>
											</table>
										</div>
									</div>
								</div>
							</div>
							<!-- /.container-fluid -->

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
							<h5 class="modal-title" id="exampleModalLabel">Ready to
								Leave?</h5>
							<button class="close" type="button" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">×</span>
							</button>
						</div>
						<div class="modal-body">Select "Logout" below if you are
							ready to end your current session.</div>
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