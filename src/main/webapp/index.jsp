<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>ahihi</title>
  <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="resources/font-awesome/css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="resources/css/select2.min.css">
  <link rel="stylesheet" type="text/css" href="resources/css/control.css">
  <link rel="stylesheet" type="text/css" href="resources/css/layout.css">
  <link rel="stylesheet" type="text/css" href="resources/csss/table.css">
  <link rel="stylesheet" type="text/css" href="resources/css/text.css">
  <link rel="stylesheet" type="text/css" href="resources/css/style.css">
</head>
<body>
<div class="histaff-header background-white">
  <div class="container">
    <div class="row">
      <div class="col-sm-2">
        <div class="histaff-header-logo">
          <a href="https://histaff.vn/">
            <img src="resources/images/histaff-logo.png" alt="Histaff logo">
          </a>
        </div>
      </div>
      <div class="col-sm-10">
        <div class="histaff-header-content text-center">
          <h1>CANDIDATE'S FORM</h1>
        </div>
      </div>
    </div>
  </div>
</div>
<div class="histaff-body" style="--mtop:90px;">
  <div class="container">
    <div class="row">
      <div class="col-md-2">
        <div class="histaff-side-bar background-white border-radius-5">
          <div class="side-bar-content">
            <ul>
              <li id="side-bar-info">
                <a href="#histaff-info">
                  <i class="fa fa-user-circle-o" aria-hidden="true"></i>
                  Sơ yếu lý lịch
                </a>
              </li>
              <li id="side-bar-education">
                <a href="#histaff-education">
                  <i class="fa fa-graduation-cap" aria-hidden="true"></i>
                  Thông tin trình độ
                </a>
              </li>
              <li id="side-bar-recruitment">
                <a href="#histaff-recruitment">
                  <i class="fa fa-list" aria-hidden="true"></i>
                  Nguyện vọng
                </a>
              </li>
              <li id="side-bar-work">
                <a href="#histaff-work-exp">
                  <i class="fa fa-briefcase" aria-hidden="true"></i>
                  Kinh nghiệm làm việc
                </a>
              </li>
              <li id="side-bar-other">
                <a href="#histaff-other">
                  <i class="fa fa-pencil-square-o" aria-hidden="true"></i>
                  Thông tin khác
                </a>
              </li>
            </ul>
          </div>
        </div>
      </div>
      <div class="col-md-10">
        <div class="histaff-body-content">
          <div class="histaff-item-group background-white border-radius-5 active" id="histaff-info">
            <div class="container">
              <div class="row">
                <div class="col-sm-12 histaff-item-group-header">
                  <h3>Sơ yếu lý lịch</h3>
                </div>
              </div>
              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-3">
                  <input type="file" class="file-upload" name="candidate-image" id="candidate-image" style="display: none;" accept="image/*">
                  <div class="histaff-upload-image" id="file-btn">
                    <i class="fa fa-camera" aria-hidden="true"></i>
                  </div>
                </div>
                <div class="col-md-9">
                  <div class="row margin-b-15">
                    <div class="col-md-4">
                      <label>Họ và tên đệm</label><span class="required">*</span><br>
                      <input type="text" name="candidate-fname" id="candidate-fname" class="item-control active">
                    </div>
                    <div class="col-md-4">
                      <label>Tên</label><span class="required">*</span><br>
                      <input type="text" name="candidate-lname" id="candidate-lname" class="item-control">
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-8">
                      <label>Vị trí ứng tuyển</label><br>
                      <select name="candidate-position" id="candidate-position" class="item-control" style="width: 100%;">
                        <option value="1">Giám đốc bộ phận</option>
                      </select>
                    </div>
                    <div class="col-md-4">
                      <input type="file" name="candidate-cv" id="candidate-cv" style="display: none;" accept= "application/msword, application/vnd.ms-excel, application/vnd.ms-powerpoint,text/plain, application/pdf, image/*">
                      <div class="hs-button">
                        <a href="#" id="uploadCV"><i class="fa fa-paperclip" aria-hidden="true"></i> Upload CV</a>
                      </div>
                      <div class="hs-button">
                        <a href="#">Xem JD</a>
                      </div>
                      <div class="clear"></div>
                    </div>
                  </div>
                </div>
              </div>

              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-3">
                  <label>Giới tính</label><span class="required">*</span><br>
                  <select name="candidate-gender" id="candidate-gender" class="item-control" style="width: 100%;">
                    <option value="1">Nam</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>Tình trạng hôn nhân</label><br>
                  <select name="candidate-maried" id="candidate-maried" class="item-control" style="width: 100%;">
                    <option value="1">Chưa vợ</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>Dân tộc</label><br>
                  <select name="candidate-native" id="candidate-native" class="item-control" style="width: 100%;">
                    <option value="1">Nam</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>Tôn giáo</label><br>
                  <select name="candidate-religion" id="candidate-religion" class="item-control" style="width: 100%;">
                    <option value="1">Phật giáo</option>
                  </select>
                </div>
              </div>

              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-3">
                  <label>Ngày sinh</label><span class="required">*</span><br>
                  <input type="date" name="candidate-birthDate" id="candidate-birthDate" class="item-control">
                </div>
                <div class="col-md-3">
                  <label>Nơi sinh</label><span class="required">*</span><br>
                  <select name="candidate-birthPlace" id="candidate-birthPlace" class="item-control" style="width: 100%;">
                    <option value="1">Nhà</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>Quốc tịch</label><br>
                  <select name="candidate-nation" id="candidate-nation" class="item-control" style="width: 100%;">
                    <option value="1">Việt Nam</option>
                  </select>
                </div>
              </div>

              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-3">
                  <label>CMND/CCCD</label><span class="required">*</span><br>
                  <select name="candidate-typeID" id="candidate-typeID" class="item-control" style="width: 100%;">
                    <option value="1">CMND</option>
                    <option value="2">CCCD</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>Ngày cấp</label><br>
                  <input type="date" name="candidate-idFromDate" id="candidate-idFromDate" class="item-control">
                </div>
                <div class="col-md-3">
                  <label>Nơi cấp</label><br>
                  <select name="candidate-idPlace" id="candidate-idPlace" class="item-control" style="width: 100%;">
                    <option value="1">Việt Nam</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>Ngày hết hạn</label><br>
                  <input type="date" name="candidate-idEndDate" id="candidate-idEndDate" class="item-control">
                </div>
              </div>

              <div class="row padding-tb-15">
                <div class="col-sm-12 histaff-item-group-header">
                  <h4><span>Thông tin liên lạc</span></h4>
                </div>
              </div>

              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-3">
                  <label>Điện thoại cá nhân</label><br>
                  <input type="text" name="candidate-mobilePhone" id="candidate-mobilePhone" class="item-control">
                </div>
                <div class="col-md-3">
                  <label>Điện thoại cố định</label><br>
                  <input type="date" name="candidate-phone" id="candidate-phone" class="item-control">
                </div>
                <div class="col-md-3">
                  <label>Email</label><br>
                  <input type="email" name="candidate-email" id="candidate-email" class="item-control">
                </div>
              </div>

              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-6">
                  <label>Địa chỉ thường trú</label><br>
                  <input type="text" name="candidate-perAddress" id="candidate-perAddress" class="item-control">
                </div>
              </div>

              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-3">
                  <label>Tỉnh/Thành phố</label><span class="required">*</span><br>
                  <select name="candidate-perProvince" id="candidate-perProvince" class="item-control" style="width: 100%;">
                    <option value="1">Hà Nội</option>
                    <option value="2">TP Hồ Chí Minh</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>Quận/Huyện</label><br>
                  <select name="candidate-perDistrict" id="candidate-perDistrict" class="item-control" style="width: 100%;">
                    <option value="1">Quận 12</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>Phường/Xã</label><br>
                  <select name="candidate-perWard" id="candidate-perWard" class="item-control" style="width: 100%;">
                    <option value="1">Thới An</option>
                  </select>
                </div>
              </div>

              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-6">
                  <label>Địa chỉ tạm trú</label><br>
                  <input type="text" name="candidate-navAddress" id="candidate-navAddress" class="item-control">
                </div>
                <div class="col-md-3" style="margin-top: 40px;">
                  <input type="checkbox" name="candidate-copyPer" id="candidate-copyPer">
                  <label>Sao chép địa chỉ thường trú</label>
                </div>
              </div>

              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-3">
                  <label>Tỉnh/Thành phố</label><span class="required">*</span><br>
                  <select name="candidate-navProvince" id="candidate-navProvince" class="item-control" style="width: 100%;">
                    <option value="1">Hà Nội</option>
                    <option value="2">TP Hồ Chí Minh</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>Quận/Huyện</label><br>
                  <select name="candidate-navDistrict" id="candidate-navDistrict" class="item-control" style="width: 100%;">
                    <option value="1">Quận 12</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>Phường/Xã</label><br>
                  <select name="candidate-nvaWard" id="candidate-nvaWard" class="item-control" style="width: 100%;">
                    <option value="1">Thới An</option>
                  </select>
                </div>
              </div>
            </div>
          </div>

          <div class="histaff-item-group background-white border-radius-5 active" id="histaff-education">
            <div class="container">
              <div class="row">
                <div class="col-sm-12 histaff-item-group-header">
                  <h3>Thông tin trình độ</h3>
                </div>
              </div>
              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-3">
                  <label>Trình độ văn hóa</label><br>
                  <select name="candidate-trainingLevel" id="candidate-trainingLevel" class="item-control" style="width: 100%;">
                    <option value="1">12/12</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>Trình độ học vấn</label><br>
                  <select name="candidate-learningLevel" id="candidate-learningLevel" class="item-control" style="width: 100%;">
                    <option value="1">Đại học</option>
                  </select>
                </div>
              </div>

              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-3">
                  <label>Trường học</label><br>
                  <select name="candidate-school" id="candidate-school" class="item-control" style="width: 100%;">
                    <option value="1">RMIT</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>Chuyên ngành</label><br>
                  <select name="candidate-major" id="candidate-major" class="item-control" style="width: 100%;">
                    <option value="1">IT</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>năm tốt nghiệp</label><br>
                  <input type="date" name="candidate-gradutionYear" id="candidate-gradutionYear" class="item-control">
                </div>
                <div class="col-md-3">
                  <label>Xếp loại</label><br>
                  <select name="candidate-mark" id="candidate-mark" class="item-control" style="width: 100%;">
                    <option value="1">Giỏi</option>
                  </select>
                </div>
              </div>

              <div class="row padding-tb-15">
                <div class="col-sm-12 histaff-item-group-header">
                  <h4><span>Trình độ ngoại ngữ</span></h4>
                </div>
              </div>

              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-3">
                  <label>Ngoại ngữ</label><br>
                  <select name="candidate-language" id="candidate-language" class="item-control" style="width: 100%;">
                    <option value="1">Tiếng anh</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>Trình độ ngoại ngữ</label><br>
                  <select name="candidate-languageLevel" id="candidate-languageLevel" class="item-control" style="width: 100%;">
                    <option value="1">A1</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>Điểm số/Xếp loại</label><br>
                  <select name="candidate-languageMark" id="candidate-languageMark" class="item-control" style="width: 100%;">
                    <option value="1">8.5</option>
                  </select>
                </div>
              </div>
            </div>
          </div>

          <div class="histaff-item-group background-white border-radius-5 active" id="histaff-recruitment">
            <div class="container">
              <div class="row">
                <div class="col-sm-12 histaff-item-group-header">
                  <h3>Nguyện vọng</h3>
                </div>
              </div>
              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-3">
                  <label>Mức lương mong muốn</label><br>
                  <select name="candidate-rqSalary" id="candidate-rqSalary" class="item-control" style="width: 100%;">
                    <option value="1">10.000.000</option>
                  </select>
                </div>
                <div class="col-md-3">
                  <label>Ngày nhận việc mong muôn</label><br>
                  <input type="date" name="candidate-rqJoin" id="candidate-rqJoin" class="item-control">
                </div>
                <div class="col-md-6">
                  <label>Nơi làm việc mong muốn</label><br>
                  <input type="text" name="candidate-rqPlace" id="candidate-rqPlace" class="item-control">
                </div>
              </div>

              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-12">
                  <label>Đề nghị khác</label><br>
                  <textarea name="candidate-rqOther" id="candidate-rqOther" class="item-control" rows="4"></textarea>
                </div>
              </div>
            </div>
          </div>

          <div class="histaff-item-group background-white border-radius-5 active" id="histaff-work-exp">
            <div class="container">
              <div class="row">
                <div class="col-sm-12 histaff-item-group-header">
                  <h3>Kinh nghiệm làm việc</h3>
                </div>
              </div>
              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-12">
                  <div class="histaff-table">
                    <div class="hs-button table-add-btn">
                      <span><i class="fa fa-plus" aria-hidden="true"></i> Thêm</span>
                    </div>
                    <table class="h-table">
                      <thead>
                      <tr>
                        <th class="text-center f-weight-4" style="width: 50px;"><input type="checkbox" class="table-checkAll"></th>
                        <th class="text-center f-weight-4" style="width: 250px;">Tên công ty</th>
                        <th class="text-center f-weight-4" style="width: 130px;">Từ tháng/năm</th>
                        <th class="text-center f-weight-4" style="width: 130px;">Đến tháng/năm</th>
                        <th class="text-center f-weight-4" style="width: 250px;">Chức danh</th>
                        <th class="text-center f-weight-4" style="width: 300px;">Mô tả công việc</th>
                        <th class="text-center f-weight-4" style="width: 350px;">Lý do nghỉ việc</th>
                        <th class="text-center f-weight-4" style="width: 300px;">Ghi chú</th>
                        <th class="text-center f-weight-4" style="width: 200px;">Thao tác</th>
                      </tr>
                      </thead>
                      <tbody>
                      <tr>
                        <td class="text-center check-col"><input type="checkbox" class="table-checkbox"></td>
                        <td>
                          <span class="col-val">Công ty cổ phần bưu chính viễn thông SLECOPE</span>
                          <input type="text" class="table-control item-control hidden comName" value="Công ty cổ phần bưu chính viễn thông SLECOPE">
                        </td>
                        <td>
                          <span class="col-val">01/2021</span>
                          <input type="text" class="table-control item-control hidden fromMonth" placeholder="mm/yyyy" value="01/2021">
                        </td>
                        <td>
                          <span class="col-val">01/2023</span>
                          <input type="text" class="table-control item-control hidden toMonth" placeholder="mm/yyyy" value="01/2023">
                        </td>
                        <td>
                          <span class="col-val">Chuyên viên quản trị hệ thống</span>
                          <input type="text" class="table-control item-control hidden position" value="Chuyên viên quản trị hệ thống">
                        </td>
                        <td>
                          <span class="col-val">amet facilisis tortor, eu vehiculam. Cras faucibus sit amet velit vitae iaculis.</span>
                          <input type="text" class="table-control item-control hidden jobDes" value="amet facilisis tortor, eu vehiculam. Cras faucibus sit amet velit vitae iaculis.">
                        </td>
                        <td>
                          <span class="col-val">Thay đổi nơi ở</span>
                          <input type="text" class="table-control item-control hidden leaveReason" value="Thay đổi nơi ở">
                        </td>
                        <td>
                          <span class="col-val">Nothing here</span>
                          <input type="text" class="table-control item-control hidden note" value="Nothing here">
                        </td>
                        <td>
                          <ul class="table-action">
                            <li class="table-action-control row-save hidden"><i class="fa fa-check" aria-hidden="true"></i></li>
                            <li class="table-action-control row-edit"><i class="fa fa-pencil" aria-hidden="true"></i></li>
                            <li class="table-action-control row-delete"><i class="fa fa-trash-o" aria-hidden="true"></i></li>
                          </ul>
                        </td>
                      </tr>
                      <tr>
                        <td class="text-center check-col"><input type="checkbox" class="table-checkbox"></td>
                        <td>
                          <span class="col-val">Công ty cổ phần bưu chính viễn thông SLECOPE</span>
                          <input type="text" class="table-control item-control hidden comName" value="Công ty cổ phần bưu chính viễn thông SLECOPE">
                        </td>
                        <td>
                          <span class="col-val">01/2021</span>
                          <input type="text" class="table-control item-control hidden fromMonth" placeholder="mm/yyyy" value="01/2021">
                        </td>
                        <td>
                          <span class="col-val">01/2023</span>
                          <input type="text" class="table-control item-control hidden toMonth" placeholder="mm/yyyy" value="01/2023">
                        </td>
                        <td>
                          <span class="col-val">Chuyên viên quản trị hệ thống</span>
                          <input type="text" class="table-control item-control hidden position" value="Chuyên viên quản trị hệ thống">
                        </td>
                        <td>
                          <span class="col-val">amet facilisis tortor, eu vehiculam. Cras faucibus sit amet velit vitae iaculis.</span>
                          <input type="text" class="table-control item-control hidden jobDes" value="amet facilisis tortor, eu vehiculam. Cras faucibus sit amet velit vitae iaculis.">
                        </td>
                        <td>
                          <span class="col-val">Thay đổi nơi ở</span>
                          <input type="text" class="table-control item-control hidden leaveReason" value="Thay đổi nơi ở">
                        </td>
                        <td>
                          <span class="col-val">Nothing here</span>
                          <input type="text" class="table-control item-control hidden note" value="Nothing here">
                        </td>
                        <td>
                          <ul class="table-action">
                            <li class="table-action-control row-save hidden"><i class="fa fa-check" aria-hidden="true"></i></li>
                            <li class="table-action-control row-edit"><i class="fa fa-pencil" aria-hidden="true"></i></li>
                            <li class="table-action-control row-delete"><i class="fa fa-trash-o" aria-hidden="true"></i></li>
                          </ul>
                        </td>
                      </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <div class="histaff-item-group background-white border-radius-5 active" id="histaff-other">
            <div class="container">
              <div class="row">
                <div class="col-sm-12 histaff-item-group-header">
                  <h3>Thông tin khác</h3>
                </div>
              </div>
              <div class="row padding-tb-15">
                <div class="col-sm-12 histaff-item-group-header">
                  <h4><span>Người tham chiếu 1</span></h4>
                </div>
              </div>
              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-3">
                  <label>Họ và tên</label><br>
                  <input type="text" name="candidate-otherName1" id="candidate-otherName1" class="item-control">
                </div>
                <div class="col-md-3">
                  <label>Chức danh</label><br>
                  <input type="text" name="candidate-otherPosition1" id="candidate-otherPosition1" class="item-control">
                </div>
                <div class="col-md-3">
                  <label>Số điện thoại</label><br>
                  <input type="text" name="candidate-otherPhone1" id="candidate-otherPhone1" class="item-control">
                </div>
                <div class="col-md-3">
                  <label>Email</label><br>
                  <input type="text" name="candidate-otherEmail1" id="candidate-otherEmail1" class="item-control">
                </div>
              </div>
              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-6">
                  <label>Địa chỉ thường trú</label><br>
                  <input type="text" name="candidate-otherPerAddress1" id="candidate-otherPerAddress1" class="item-control">
                </div>
              </div>
              <div class="row padding-tb-15">
                <div class="col-sm-12 histaff-item-group-header">
                  <h4><span>Người tham chiếu 2</span></h4>
                </div>
              </div>
              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-3">
                  <label>Họ và tên</label><br>
                  <input type="text" name="candidate-otherName2" id="candidate-otherName2" class="item-control">
                </div>
                <div class="col-md-3">
                  <label>Chức danh</label><br>
                  <input type="text" name="candidate-otherPosition2" id="candidate-otherPosition2" class="item-control">
                </div>
                <div class="col-md-3">
                  <label>Số điện thoại</label><br>
                  <input type="text" name="candidate-otherPhone2" id="candidate-otherPhone2" class="item-control">
                </div>
                <div class="col-md-3">
                  <label>Email</label><br>
                  <input type="text" name="candidate-otherEmail2" id="candidate-otherEmail2" class="item-control">
                </div>
              </div>
              <div class="row padding-tb-15 margin-b-15">
                <div class="col-md-6">
                  <label>Địa chỉ thường trú</label><br>
                  <input type="text" name="candidate-otherPerAddress2" id="candidate-otherPerAddress2" class="item-control">
                </div>
              </div>
            </div>
          </div>

          <div class="histaff-item-group text-center">
            <div class="container">
              <div class="row">
                <div class="col-md-12">
                  <button type="button" class="histaff-confirm-button">Hủy</button>
                  <button type="button" name="btnAddCandidate" class="histaff-confirm-button" value="add">Gửi</button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<div class="histaff-footer background-white">

</div>
<div id="histaff-message" class="text-center">
</div>
</body>
<script type="text/javascript" src="resources/cssbootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="resources/js/select2.min.js"></script>
<script type="text/javascript" src="resources/js/table.js"></script>
<script type="text/javascript" src="resources/js/main.js"></script>
</html>
