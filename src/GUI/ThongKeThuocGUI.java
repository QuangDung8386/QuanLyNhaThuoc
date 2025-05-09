/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.jfree.chart.ChartPanel;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import PanelDashboard.BarChartThongKe;
import PanelDashboard.LineChartAdvanced;
import PanelDashboard.LineChartThongKe;
import PanelDashboard.PieChartThongKe;


/**
 *
 * @author 44ong
 */
public class ThongKeThuocGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public ThongKeThuocGUI() {
    	this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton1 = new javax.swing.JButton();
        panel_header = new javax.swing.JPanel();
        icon_close_fullscreen = new javax.swing.JPanel();
        panel_fullscreen = new javax.swing.JPanel();
        label_fullscreen = new javax.swing.JLabel();
        panel_close = new javax.swing.JPanel();
        label_close = new javax.swing.JLabel();
        panel_main = new javax.swing.JPanel();
        panel_title = new javax.swing.JPanel();
        label_quanlyhoadon = new javax.swing.JLabel();
        panel_thongtin = new javax.swing.JPanel();
        panel_hoadon = new javax.swing.JPanel();
        panel_button_loaithongke = new javax.swing.JPanel();
        panel_contain_button = new javax.swing.JPanel();
        cb_thang = new javax.swing.JComboBox<>();
        label_tonkho = new javax.swing.JLabel();
        cb_filter_tonkho = new javax.swing.JComboBox<>();
        label_nhomthuoc = new javax.swing.JLabel();
        cb_filter_nhomthuoc = new javax.swing.JComboBox<>();
        label_nhacungcap = new javax.swing.JLabel();
        cb_filter_nhacungcap = new javax.swing.JComboBox<>();
        button_hienthi = new javax.swing.JButton();
        button_thoat = new javax.swing.JButton();
        panel_bieudo = new javax.swing.JPanel();
        panel_bieudo_top = new javax.swing.JPanel();
        panel_bieudo_botton = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_header.setBackground(new java.awt.Color(204, 204, 204));
        panel_header.setPreferredSize(new java.awt.Dimension(900, 30));
        panel_header.setLayout(new java.awt.BorderLayout());

        icon_close_fullscreen.setBackground(new java.awt.Color(204, 204, 204));
        icon_close_fullscreen.setPreferredSize(new java.awt.Dimension(60, 30));
        icon_close_fullscreen.setLayout(new javax.swing.BoxLayout(icon_close_fullscreen, javax.swing.BoxLayout.X_AXIS));

        panel_fullscreen.setBackground(new java.awt.Color(204, 204, 204));
        panel_fullscreen.setPreferredSize(new java.awt.Dimension(30, 30));

        label_fullscreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fullscreen-removebg-preview (1).png"))); // NOI18N
        label_fullscreen.setText("jLabel2");
        label_fullscreen.setPreferredSize(new java.awt.Dimension(30, 30));
        label_fullscreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_fullscreenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_fullscreenLayout = new javax.swing.GroupLayout(panel_fullscreen);
        panel_fullscreen.setLayout(panel_fullscreenLayout);
        panel_fullscreenLayout.setHorizontalGroup(
            panel_fullscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fullscreenLayout.createSequentialGroup()
                .addComponent(label_fullscreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_fullscreenLayout.setVerticalGroup(
            panel_fullscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_fullscreenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_fullscreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        icon_close_fullscreen.add(panel_fullscreen);

        panel_close.setBackground(new java.awt.Color(204, 204, 204));
        panel_close.setPreferredSize(new java.awt.Dimension(30, 30));

        label_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clsoe-removebg-preview (1).png"))); // NOI18N
        label_close.setText("jLabel1");
        label_close.setPreferredSize(new java.awt.Dimension(30, 30));
        label_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_closeLayout = new javax.swing.GroupLayout(panel_close);
        panel_close.setLayout(panel_closeLayout);
        panel_closeLayout.setHorizontalGroup(
            panel_closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_closeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_closeLayout.setVerticalGroup(
            panel_closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_closeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        icon_close_fullscreen.add(panel_close);

        panel_header.add(icon_close_fullscreen, java.awt.BorderLayout.LINE_END);

        getContentPane().add(panel_header, java.awt.BorderLayout.PAGE_START);

        panel_main.setLayout(new java.awt.BorderLayout());

        panel_title.setBackground(new java.awt.Color(4, 71, 126));
        panel_title.setPreferredSize(new java.awt.Dimension(100, 100));
        panel_title.setLayout(new java.awt.BorderLayout());

        label_quanlyhoadon.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label_quanlyhoadon.setForeground(new java.awt.Color(255, 255, 255));
        label_quanlyhoadon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_quanlyhoadon.setText("Thống Kê");
        panel_title.add(label_quanlyhoadon, java.awt.BorderLayout.CENTER);

        panel_main.add(panel_title, java.awt.BorderLayout.PAGE_START);

        panel_thongtin.setLayout(new java.awt.BorderLayout());

        panel_hoadon.setLayout(new java.awt.BorderLayout());

        panel_button_loaithongke.setBackground(new java.awt.Color(255, 255, 255));
        panel_button_loaithongke.setPreferredSize(new java.awt.Dimension(900, 50));
        panel_button_loaithongke.setLayout(new java.awt.BorderLayout());

        panel_contain_button.setBackground(new java.awt.Color(255, 255, 255));
        panel_contain_button.setPreferredSize(new java.awt.Dimension(850, 50));
        panel_contain_button.setLayout(new java.awt.GridBagLayout());

        cb_thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2 ", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6" }));
        cb_thang.setPreferredSize(new java.awt.Dimension(80, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(cb_thang, gridBagConstraints);

        label_tonkho.setText("Tồn Kho");
        label_tonkho.setPreferredSize(new java.awt.Dimension(80, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(label_tonkho, gridBagConstraints);

        cb_filter_tonkho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Không", "Tất Cả", "Sắp Hết" }));
        cb_filter_tonkho.setPreferredSize(new java.awt.Dimension(80, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(cb_filter_tonkho, gridBagConstraints);

        label_nhomthuoc.setText("Nhóm Thuốc");
        label_nhomthuoc.setPreferredSize(new java.awt.Dimension(80, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(label_nhomthuoc, gridBagConstraints);

        cb_filter_nhomthuoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Không", "Tất Cả", "Kháng Sinh", "Giảm Đau", "Vitamin" }));
        cb_filter_nhomthuoc.setPreferredSize(new java.awt.Dimension(90, 30));
        cb_filter_nhomthuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_filter_nhomthuocActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(cb_filter_nhomthuoc, gridBagConstraints);

        label_nhacungcap.setText("Nhà Cung Cấp");
        label_nhacungcap.setPreferredSize(new java.awt.Dimension(80, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(label_nhacungcap, gridBagConstraints);

        cb_filter_nhacungcap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Không", "Tất Cả", "Công Ty A", "Công Ty B", "Công Ty C", " " }));
        cb_filter_nhacungcap.setPreferredSize(new java.awt.Dimension(90, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(cb_filter_nhacungcap, gridBagConstraints);

        button_hienthi.setText("Hiển Thị");
        button_hienthi.setPreferredSize(new java.awt.Dimension(80, 30));
        button_hienthi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_hienthiMouseClicked(evt);
            }
        });
        button_hienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_hienthiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(button_hienthi, gridBagConstraints);

        button_thoat.setText("Thoát");
        button_thoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_thoatMouseClicked(evt);
            }
        });
        button_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_thoatActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(button_thoat, gridBagConstraints);

        panel_button_loaithongke.add(panel_contain_button, java.awt.BorderLayout.LINE_END);

        panel_hoadon.add(panel_button_loaithongke, java.awt.BorderLayout.PAGE_START);

        panel_bieudo.setLayout(new java.awt.GridLayout(2, 1));

        panel_bieudo_top.setLayout(new java.awt.GridLayout(1, 2));
        
        
        
        // CREATE LINE CHART 
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Thêm dữ liệu cho 5 đường (Series 1 đến Series 5)
        String[] categories = {"Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6"};

        // Series 1: Dữ liệu tăng dần
        for (int i = 0; i < categories.length; i++) {
            dataset.addValue(10 + i * 5, "Khu vực A", categories[i]);
        }

        // Series 2: Dữ liệu giảm dần
        for (int i = 0; i < categories.length; i++) {
            dataset.addValue(50 - i * 5, "Khu vực B", categories[i]);
        }

        // Series 3: Dữ liệu dao động
        dataset.addValue(20, "Khu vực C", categories[0]);
        dataset.addValue(35, "Khu vực C", categories[1]);
        dataset.addValue(15, "Khu vực C", categories[2]);
        dataset.addValue(40, "Khu vực C", categories[3]);
        dataset.addValue(10, "Khu vực C", categories[4]);
        dataset.addValue(30, "Khu vực C", categories[5]);

        // Series 4: Dữ liệu ngẫu nhiên
        for (int i = 0; i < categories.length; i++) {
            dataset.addValue(10 + Math.random() * 30, "Khu vực D", categories[i]);
        }

        // Series 5: Dữ liệu ổn định
        for (int i = 0; i < categories.length; i++) {
            dataset.addValue(25, "Khu vực E", categories[i]);
        }

        // Tạo biểu đồ
        LineChartAdvanced lineChart = new LineChartAdvanced(
            dataset,
            "DOANH SỐ BÁN HÀNG THEO KHU VỰC (2023)",
            "Tháng",
            "Doanh số (triệu VND)"
        );
        
        // END CREATE LINE CHART 
        
        
        // CREATE PIE CHART
        
        
       
       DefaultPieDataset dataset_piechart = new DefaultPieDataset();
        
        // Thêm dữ liệu (ví dụ)
	    dataset_piechart.setValue("Quý 1", 25);
	    dataset_piechart.setValue("Quý 2", 35);
	    dataset_piechart.setValue("Quý 3", 20);
	    dataset_piechart.setValue("Quý 4", 40);
        
        PieChartThongKe piechart = new PieChartThongKe(dataset_piechart, "Phần Trăm Thuốc Tồn Kho");
        
        ChartPanel piechart_phantram = piechart.createChartPanel();

        
        
        // END CREATE LINE CHART
        panel_bieudo_top.add(lineChart.createSampleChartPanel());
        panel_bieudo_top.add(piechart_phantram);
        
        panel_bieudo.add(panel_bieudo_top);

        panel_bieudo_botton.setLayout(new java.awt.GridLayout(1, 2));
        
        
        Map<String, Integer> salesData = new HashMap<>();
        salesData.put("Tháng 1", 150);
        salesData.put("Tháng 2", 200);
        salesData.put("Tháng 3", 180);
        salesData.put("Tháng 4", 300);
        salesData.put("Tháng 5", 250);

        // Tạo frame chính
        JFrame frame = new JFrame("Biểu Đồ Cột - Java Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Tạo và thêm ChartPanel vào frame
        BarChartThongKe barchart_thongke = new BarChartThongKe(salesData, "Doanh Số Bán Hàng Theo Tháng", new Color(75, 192, 192));
        
        
        panel_bieudo_botton.add(barchart_thongke);
        
        panel_bieudo.add(panel_bieudo_botton);

        panel_hoadon.add(panel_bieudo, java.awt.BorderLayout.CENTER);

        panel_thongtin.add(panel_hoadon, java.awt.BorderLayout.CENTER);
        
        
        
        
        
        MenuForm_2 menuForm_2 = new MenuForm_2(new MenuForm_2.MenuListener() {
            
        	/*@Override public void onDrugImportSelected() { showFrame(new DrugImportFrame()); }
            @Override public void onDrugUpdateSelected() { showFrame(new DrugUpdateFrame()); }
            @Override public void onDrugListSelected() { showFrame(new DrugListFrame()); }
            @Override public void onInvoiceCreateSelected() { showFrame(new InvoiceCreateFrame()); }
            @Override public void onInvoiceListSelected() { showFrame(new InvoiceListFrame()); }
            @Override public void onRevenueStatsSelected() { showFrame(new RevenueStatsFrame()); }
            @Override public void onDrugStatsSelected() { showFrame(new DrugStatsFrame()); }
            @Override public void onStaffListSelected() { showFrame(new StaffListFrame()); }
            @Override public void onAddStaffSelected() { showFrame(new AddStaffFrame()); }
            @Override public void onCustomerListSelected() { showFrame(new CustomerListFrame()); }
            @Override public void onAddCustomerSelected() { showFrame(new AddCustomerFrame()); }
            @Override public void onSupplierListSelected() { showFrame(new SupplierListFrame()); }
            @Override public void onAddSupplierSelected() { showFrame(new AddSupplierFrame()); }*/
        	
        	
        	
        	
        	
        	@Override public void openFormNhapThuoc() { showFrame(new NhapThuocGUI()); }
            @Override public void openFormCapNhatThuoc() { showFrame(new DrugUpdateFrame()); }
            @Override public void openFormDanhSachThuoc() { showFrame(new QuanLyThuocGUI()); }
            @Override public void openFormTaoHoaDon() { showFrame(new TaoHoaDonGUI()); }
            @Override public void openFormDanhSachHoaDon() { showFrame(new QuanLyHoaDonGUI()); }
            @Override public void openFormThongKeDoanhThu() { showFrame(new ThongKeDoanhThuGUI()); }
            @Override public void openFormThongKeThuoc() { showFrame(new ThongKeThuocGUI()); }
            @Override public void openFormDanhSachNhanVien() { showFrame(new QuanLyNhanVienGUI()); }
            @Override public void openFormThemNhanVien() { showFrame(new AddStaffFrame()); }
            @Override public void openFormDanhSachKhachHang() { showFrame(new CustomerListFrame()); }
            @Override public void openFormThemKhachHang() { showFrame(new AddCustomerFrame()); }
            @Override public void openFormNhaCungCap() { showFrame(new SupplierListFrame()); }
            @Override public void openFormThemNhaCungCap() { showFrame(new AddSupplierFrame()); }
        	
        });
        
        
        
        
        
        panel_main.add(menuForm_2, java.awt.BorderLayout.WEST);
      

        panel_main.add(panel_thongtin, java.awt.BorderLayout.CENTER);

        getContentPane().add(panel_main, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(900, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>                        
    
    // chinh sua nut close
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
        
    } 
    private void label_closeMouseEntered(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        changecolor(panel_close, new Color(245, 66, 105));
    }                                        

    private void label_closeMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void label_closeMouseExited(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        changecolor(panel_close, new Color(204,204,204));
    }                                       
    // ket thuc chinh sua nut close
    
    private void label_fullscreenMouseClicked(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
        if(this.getExtendedState()!=ThongKeThuocGUI.MAXIMIZED_BOTH){
            this.setExtendedState(ThongKeThuocGUI.MAXIMIZED_BOTH);
        }else{
           this.setExtendedState(ThongKeThuocGUI.NORMAL);
        }  
    }                                             

    private void cb_filter_nhomthuocActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void button_hienthiActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void button_hienthiMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void button_thoatActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void button_thoatMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
    	this.setVisible(false);
    	TongQuanGUI tongquangui = new TongQuanGUI();
    	tongquangui.setVisible(true);
    	}                                         
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThongKeThuocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeThuocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeThuocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeThuocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeThuocGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton button_hienthi;
    private javax.swing.JButton button_thoat;
    private javax.swing.JComboBox<String> cb_filter_nhacungcap;
    private javax.swing.JComboBox<String> cb_filter_nhomthuoc;
    private javax.swing.JComboBox<String> cb_filter_tonkho;
    private javax.swing.JComboBox<String> cb_thang;
    private javax.swing.JPanel icon_close_fullscreen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel label_close;
    private javax.swing.JLabel label_fullscreen;
    private javax.swing.JLabel label_nhacungcap;
    private javax.swing.JLabel label_nhomthuoc;
    private javax.swing.JLabel label_quanlyhoadon;
    private javax.swing.JLabel label_tonkho;
    private javax.swing.JPanel panel_bieudo;
    private javax.swing.JPanel panel_bieudo_botton;
    private javax.swing.JPanel panel_bieudo_top;
    private javax.swing.JPanel panel_button_loaithongke;
    private javax.swing.JPanel panel_close;
    private javax.swing.JPanel panel_contain_button;
    private javax.swing.JPanel panel_fullscreen;
    private javax.swing.JPanel panel_header;
    private javax.swing.JPanel panel_hoadon;
    private javax.swing.JPanel panel_main;
    private javax.swing.JPanel panel_thongtin;
    private javax.swing.JPanel panel_title;
    // End of variables declaration 
    
    
    private void showFrame(JFrame frame) {
    	this.setVisible(false);
        frame.setVisible(true);
    }
}
