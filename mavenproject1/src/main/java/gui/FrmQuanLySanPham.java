/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import dao.SanPhamDao;
import entity.SanPham;
import helper.XuatFileExcel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ChanhNe
 */
public class FrmQuanLySanPham extends javax.swing.JPanel {

    private final SanPhamDao sanPhamDao;

    public FrmQuanLySanPham() throws Exception {
        sanPhamDao = new SanPhamDao();
        initComponents();
        loadTableData();
        checkInputData();
    }

    private void checkInputData() {
        txtTrangThai.setEnabled(false);
    }

    private void checkNgayHoanThanh() {
        Date ngayHoanThanh = chooserNgayHoanThanh.getDate();
        if (ngayHoanThanh == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày hoàn thành");
            return;
        }
        if (ngayHoanThanh.before(new Date())) {
            JOptionPane.showMessageDialog(this, "Ngày hoàn thành phải lớn hơn ngày hiện tại");
            return;
        }
    }

    private void loadTableData() throws Exception {
        SanPhamDao sanPhamDAO = new SanPhamDao();
        List<SanPham> sanPhams = sanPhamDAO.getAllSanPham();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã sản phẩm");
        model.addColumn("Tên sản phẩm");
        model.addColumn("Loại sản phẩm");
        model.addColumn("Màu sắc");
        model.addColumn("Chất liệu");
        model.addColumn("Số lượng cần làm");
        model.addColumn("Số lượng đã làm");
        model.addColumn("Ngày hoàn thành");
        model.addColumn("Trạng thái");
        for (SanPham sanPham : sanPhams) {
            model.addRow(new Object[]{
                sanPham.getMaSanPham(),
                sanPham.getTenSanPham(),
                sanPham.getLoaiSanPham(),
                sanPham.getMauSac(),
                sanPham.getChatLieu(),
                sanPham.getSoLuongCanLam(),
                sanPham.getSoLuongDaLam(),
                sanPham.getNgayHoanThanh(),
                sanPham.getTrangThai()
            });
        }
        tblDanhSachSanPham.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTieuDe1 = new javax.swing.JLabel();
        pnlThongTinNV = new javax.swing.JPanel();
        lblMaSanPham = new javax.swing.JLabel();
        lblTenSanPham = new javax.swing.JLabel();
        lblLoaiSanPham = new javax.swing.JLabel();
        lblMauSac = new javax.swing.JLabel();
        lblChatLieu = new javax.swing.JLabel();
        lblSoLuongCanLam = new javax.swing.JLabel();
        lblSoLuongDaLam = new javax.swing.JLabel();
        lblNgayHoanThanh = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        txtMaSanPham = new javax.swing.JTextField();
        txtTenSanPham = new javax.swing.JTextField();
        txtLoaiSanPham = new javax.swing.JTextField();
        txtSoLuongCanLam = new javax.swing.JTextField();
        txtSoLuongDaLam = new javax.swing.JTextField();
        txtTrangThai = new javax.swing.JTextField();
        chooserNgayHoanThanh = new com.toedter.calendar.JDateChooser();
        cmbMauSac = new javax.swing.JComboBox<>();
        cmbChatLieu = new javax.swing.JComboBox<>();
        pnlNutChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachSanPham = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTieuDe1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTieuDe1.setForeground(new java.awt.Color(51, 0, 255));
        lblTieuDe1.setText("SẢN PHẨM");

        pnlThongTinNV.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlThongTinNV.setMaximumSize(new java.awt.Dimension(100, 100));

        lblMaSanPham.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMaSanPham.setText("Mã sản phẩm:");

        lblTenSanPham.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTenSanPham.setText("Tên sản phẩm:");

        lblLoaiSanPham.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLoaiSanPham.setText("Loại sản phẩm:");

        lblMauSac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMauSac.setText("Màu sắc:");

        lblChatLieu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblChatLieu.setText("Chất liệu:");

        lblSoLuongCanLam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSoLuongCanLam.setText("Số lượng cần làm:");

        lblSoLuongDaLam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSoLuongDaLam.setText("Số lượng đã làm:");

        lblNgayHoanThanh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNgayHoanThanh.setText("Ngày hoàn thành:");

        lblTrangThai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTrangThai.setText("Trạng thái:");

        txtMaSanPham.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaSanPhamFocusLost(evt);
            }
        });

        chooserNgayHoanThanh.setDateFormatString(" dd/MM/yyyy");

        cmbMauSac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đen", "Trắng", "Xanh lá", "Tím", "Đỏ", "Vàng", "Cam" }));
        cmbMauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMauSacActionPerformed(evt);
            }
        });

        cmbChatLieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thép", "Nhôm", "Nhựa", "Gỗ", "Cao su", "Kính" }));

        javax.swing.GroupLayout pnlThongTinNVLayout = new javax.swing.GroupLayout(pnlThongTinNV);
        pnlThongTinNV.setLayout(pnlThongTinNVLayout);
        pnlThongTinNVLayout.setHorizontalGroup(
            pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongTinNVLayout.createSequentialGroup()
                .addContainerGap(360, Short.MAX_VALUE)
                .addGroup(pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlThongTinNVLayout.createSequentialGroup()
                        .addComponent(lblTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenSanPham))
                    .addGroup(pnlThongTinNVLayout.createSequentialGroup()
                        .addComponent(lblChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbChatLieu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlThongTinNVLayout.createSequentialGroup()
                        .addComponent(lblMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbMauSac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongTinNVLayout.createSequentialGroup()
                        .addComponent(lblLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoaiSanPham))
                    .addGroup(pnlThongTinNVLayout.createSequentialGroup()
                        .addComponent(lblMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlThongTinNVLayout.createSequentialGroup()
                        .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlThongTinNVLayout.createSequentialGroup()
                        .addComponent(lblSoLuongDaLam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoLuongDaLam))
                    .addGroup(pnlThongTinNVLayout.createSequentialGroup()
                        .addComponent(lblNgayHoanThanh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chooserNgayHoanThanh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlThongTinNVLayout.createSequentialGroup()
                        .addComponent(lblSoLuongCanLam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoLuongCanLam, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(351, 351, 351))
        );
        pnlThongTinNVLayout.setVerticalGroup(
            pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinNVLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoLuongCanLam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuongCanLam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoLuongDaLam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuongDaLam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgayHoanThanh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooserNgayHoanThanh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbMauSac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnThem.setBackground(new java.awt.Color(204, 255, 204));
        btnThem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/them.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setMargin(new java.awt.Insets(2, 2, 3, 2));
        btnThem.setMaximumSize(new java.awt.Dimension(115, 37));
        btnThem.setMinimumSize(new java.awt.Dimension(115, 37));
        btnThem.setPreferredSize(new java.awt.Dimension(125, 37));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnCapNhat.setBackground(new java.awt.Color(204, 255, 204));
        btnCapNhat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/icon-CapNhat.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.setMargin(new java.awt.Insets(2, 2, 3, 2));
        btnCapNhat.setMaximumSize(new java.awt.Dimension(115, 37));
        btnCapNhat.setMinimumSize(new java.awt.Dimension(115, 37));
        btnCapNhat.setPreferredSize(new java.awt.Dimension(125, 37));
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(204, 255, 204));
        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/icon-xoachamcong.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setMargin(new java.awt.Insets(2, 2, 3, 2));
        btnXoa.setPreferredSize(new java.awt.Dimension(125, 23));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(204, 255, 204));
        btnLamMoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/icon-LamMoi.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.setMargin(new java.awt.Insets(2, 2, 3, 2));
        btnLamMoi.setPreferredSize(new java.awt.Dimension(125, 22));
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnXuatExcel.setBackground(new java.awt.Color(204, 255, 204));
        btnXuatExcel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXuatExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/icon-XuatExcel.png"))); // NOI18N
        btnXuatExcel.setText("Xuất Excel");
        btnXuatExcel.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btnXuatExcel.setPreferredSize(new java.awt.Dimension(125, 22));
        btnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcelActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(204, 255, 204));
        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/icon-thoat.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setMargin(new java.awt.Insets(2, 2, 3, 2));
        btnThoat.setPreferredSize(new java.awt.Dimension(125, 23));
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNutChucNangLayout = new javax.swing.GroupLayout(pnlNutChucNang);
        pnlNutChucNang.setLayout(pnlNutChucNangLayout);
        pnlNutChucNangLayout.setHorizontalGroup(
            pnlNutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNutChucNangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNutChucNangLayout.setVerticalGroup(
            pnlNutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNutChucNangLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlNutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách Sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblDanhSachSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDanhSachSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSachSanPham);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jScrollPane1)
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlThongTinNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNutChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTieuDe1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTieuDe1)
                .addGap(0, 0, 0)
                .addComponent(pnlThongTinNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(pnlNutChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String maSanPham = txtMaSanPham.getText();
        String tenSanPham = txtTenSanPham.getText();
        String loaiSanPham = txtLoaiSanPham.getText();
        String mauSac = cmbMauSac.getSelectedItem().toString();
        String chatLieu = cmbChatLieu.getSelectedItem().toString();
        Date ngayHoanThanh = chooserNgayHoanThanh.getDate();
        checkNgayHoanThanh();
        String trangThai = txtTrangThai.getText();
        if (maSanPham.isEmpty() || tenSanPham.isEmpty() || loaiSanPham.isEmpty() || mauSac.isEmpty() || chatLieu.isEmpty() || trangThai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã sản phẩm");
            return;
        }
        int soLuongCanLam = 0;
        int soLuongDaLam = 0;
        try {
            soLuongCanLam = Integer.parseInt(txtSoLuongCanLam.getText());
            soLuongDaLam = Integer.parseInt(txtSoLuongDaLam.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng là số nguyên");
            return;
        }
        SanPham sanPham = new SanPham(maSanPham, tenSanPham, loaiSanPham, mauSac, chatLieu, soLuongCanLam,
                soLuongDaLam, ngayHoanThanh, trangThai);
        try {
            if (sanPhamDao.themSanPham(sanPham)) {
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm mới thành công");
                xoaRong();
                loadTableData();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm mới thất bại");
            }
        } catch (Exception ex) {
            Logger.getLogger(FrmQuanLySanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = tblDanhSachSanPham.getSelectedRow();
        if (row != -1) {
            String maSanPham = tblDanhSachSanPham.getValueAt(row, 0).toString();
            SanPhamDao sanPhamDao = new SanPhamDao();
            try {
                if (sanPhamDao.xoaSanPham(maSanPham)) {
                    JOptionPane.showMessageDialog(this, "Xóa sản phẩm thành công");
                    loadTableData();
                    xoaRong();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa sản phẩm không thành công");
                }
            } catch (Exception ex) {
                Logger.getLogger(FrmQuanLySanPham.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm để xóa");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblDanhSachSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachSanPhamMouseClicked
        // TODO add your handling code here:
        int row = tblDanhSachSanPham.getSelectedRow();
        if (row != -1) {
            txtMaSanPham.setText(tblDanhSachSanPham.getValueAt(row, 0).toString());
            txtTenSanPham.setText(tblDanhSachSanPham.getValueAt(row, 1).toString());
            txtLoaiSanPham.setText(tblDanhSachSanPham.getValueAt(row, 2).toString());
            cmbMauSac.setSelectedItem(tblDanhSachSanPham.getValueAt(row, 3).toString());
            cmbChatLieu.setSelectedItem(tblDanhSachSanPham.getValueAt(row, 4).toString());
            txtSoLuongCanLam.setText(tblDanhSachSanPham.getValueAt(row, 5).toString());
            txtSoLuongDaLam.setText(tblDanhSachSanPham.getValueAt(row, 6).toString());
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(tblDanhSachSanPham.getValueAt(row, 7).toString());
                chooserNgayHoanThanh.setDate(date);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            txtTrangThai.setText(tblDanhSachSanPham.getValueAt(row, 8).toString());

        }
    }//GEN-LAST:event_tblDanhSachSanPhamMouseClicked
    private void xoaDuLieuTrongBang() {
        DefaultTableModel model = (DefaultTableModel) tblDanhSachSanPham.getModel();
        model.setRowCount(0);
    }
    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        xoaRong();
        try {
            loadTableData();
        } catch (Exception ex) {
            Logger.getLogger(FrmQuanLySanPham.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        SwingUtilities.getWindowAncestor(this).dispose();
        this.setVisible(false);
        new TrangChu_GUI().setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        try {
            // TODO add your handling code here:
            // TODO add your handling code here:
            String maSanPham = txtMaSanPham.getText();
            String tenSanPham = txtTenSanPham.getText();
            String loaiSanPham = txtLoaiSanPham.getText();
            String mauSac = cmbMauSac.getSelectedItem().toString();
            String chatLieu = cmbChatLieu.getSelectedItem().toString();
            if (maSanPham.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng đầy đủu thông tin");
                return;
            }
            int soLuongCanLam = Integer.parseInt(txtSoLuongCanLam.getText());
            int soLuongDaLam = Integer.parseInt(txtSoLuongDaLam.getText());
            Date ngayHoanThanh = chooserNgayHoanThanh.getDate();
            checkNgayHoanThanh();
            String trangThai = txtTrangThai.getText();
            
            SanPham sanPham = new SanPham(maSanPham, tenSanPham, loaiSanPham, mauSac, chatLieu, soLuongCanLam, soLuongDaLam, ngayHoanThanh, trangThai);
            boolean result = sanPhamDao.suaSanPham(sanPham);
            
            if (result) {
                JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                loadTableData();
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại, vui lòng kiểm tra lại dữ liệu nhập");
            }
        } catch (Exception ex) {
            Logger.getLogger(FrmQuanLySanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        // TODO add your handling code here:
         XuatFileExcel.xuatFileExcel(tblDanhSachSanPham);
    }//GEN-LAST:event_btnXuatExcelActionPerformed

    private void txtMaSanPhamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaSanPhamFocusLost
        // TODO add your handling code here:
        String maSanPham = txtMaSanPham.getText();
        if (maSanPham.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã sản phẩm");
            txtMaSanPham.requestFocus();
        } else if (!maSanPham.matches("^SP_[a-zA-Z0-9]{1,20}$")) {
            JOptionPane.showMessageDialog(this, "Mã sản phẩm không đúng định dạng(SP_XXXXX)!");
            txtMaSanPham.requestFocus();
        } else {
            // Input của txtName hợp lệ, không làm gì cả
        }
    }//GEN-LAST:event_txtMaSanPhamFocusLost

    private void cmbMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMauSacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMauSacActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatExcel;
    private com.toedter.calendar.JDateChooser chooserNgayHoanThanh;
    private javax.swing.JComboBox<String> cmbChatLieu;
    private javax.swing.JComboBox<String> cmbMauSac;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChatLieu;
    private javax.swing.JLabel lblLoaiSanPham;
    private javax.swing.JLabel lblMaSanPham;
    private javax.swing.JLabel lblMauSac;
    private javax.swing.JLabel lblNgayHoanThanh;
    private javax.swing.JLabel lblSoLuongCanLam;
    private javax.swing.JLabel lblSoLuongDaLam;
    private javax.swing.JLabel lblTenSanPham;
    private javax.swing.JLabel lblTieuDe1;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JPanel pnlNutChucNang;
    private javax.swing.JPanel pnlThongTinNV;
    private javax.swing.JTable tblDanhSachSanPham;
    private javax.swing.JTextField txtLoaiSanPham;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtSoLuongCanLam;
    private javax.swing.JTextField txtSoLuongDaLam;
    private javax.swing.JTextField txtTenSanPham;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables

    private void xoaRong() {
        txtMaSanPham.setText("");
        txtTenSanPham.setText("");
        txtLoaiSanPham.setText("");
        cmbMauSac.setSelectedItem(null);
        cmbChatLieu.setSelectedItem(null);
        txtSoLuongCanLam.setText("");
        txtSoLuongDaLam.setText("");
        chooserNgayHoanThanh.setDate(null);
        txtTrangThai.setText("");
    }
}
