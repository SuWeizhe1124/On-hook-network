




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import java.util.Timer;
import java.util.TimerTask;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.util.Enumeration;





public class MySQL {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		 JFrame jFrame = new JFrame();
		 jFrame.setSize(300, 200);
		 jFrame.setLayout(null);

		 int result = JOptionPane.showConfirmDialog(jFrame, "刷網站系統 \n  著者:Suweizhe ");
		
		 
		    if (result == 0) {
		    	
		   	 
					HJFrame f = new HJFrame();
				
				  /*
				Timer timer = new Timer();
		        TimerTask task = new TimerTask() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						if(in1==null) {
                    	    JOptionPane.showMessageDialog(jFrame,"離開-系統 ");
         
                    	    System.exit(0);
            			 
                    	   
                       }else
                       {
							chome(in1);
							
					
							
                       }
					}
		        	
		        };
		        Date startTime = new Date();
		        timer.schedule(task, startTime, 5000);
		    	
		
		      
		       */ 
				/*
		    	String me = "https://suweizhe1124.github.io/";
					for(int i=0;i<3;i++)
					{
					
						java.net.URI uri = java.net.URI.create(me);
						// 獲取當前系統桌面擴充套件
						java.awt.Desktop dp = java.awt.Desktop.getDesktop();
						// 判斷系統桌面是否支援要執行的功能
						if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
							dp.browse(uri);
							// 獲取系統預設瀏覽器開啟連結
						}
						
					}
					
					*/
		    }
    if (result == 1) {
		    	
    	 System.exit(0);
    	 
		    }    
     if (result == 2) {
		    	
		    	 System.exit(0);
		    }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		/*
		
		
		
		String me = "https://suweizhe1124.github.io/";
		String R = "https://www.google.com/maps/place//data=!4m2!3m1!1s0x346e950aed323217:0x6d65ffc053d61a9c?source=g.page.m._";
		

		Timer timer = new Timer();
        TimerTask task = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
		

	
	
					chome(R);
				
			}
        };
        Date startTime = new Date();
        timer.schedule(task, startTime, 5000);
		*/
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
            public static  void chome(String Url)
            {
            	
            	
            	String url =Url;
            	  //------------------------------------------------------//
            		
            		
            		                //------------------------------------------------------//	            	
            		            	try {
            		        		
            		        			java.net.URI uri = java.net.URI.create(url);
            		        			// 獲取當前系統桌面擴充套件
            		        			java.awt.Desktop dp = java.awt.Desktop.getDesktop();
            		        			// 判斷系統桌面是否支援要執行的功能
            		        			if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
            		        				dp.browse(uri);
            		        				// 獲取系統預設瀏覽器開啟連結
            		        			}
            		        		} catch (java.lang.NullPointerException e) {
            		        			// 此為uri為空時丟擲異常
            		        			e.printStackTrace();
            		        		} catch (java.io.IOException e) {
            		        			// 此為無法獲取系統預設瀏覽器
            		        			e.printStackTrace();
            		        		}
            		            	
            		                //------------------------------------------------------//	         	
            		         	   try {
            						Thread.sleep(3000);
            						
            						// 2秒 確定網址   
            						
            						
            						
            					} catch (InterruptedException e) {
            						// TODO Auto-generated catch block
            						e.printStackTrace();
            					} //設定 兩秒後啟關閉 瀏覽器
            		         	   
            		               //-----關閉-------------------------------------------------//	     
            		    		   closeBrowse(); 
            		    		    	
    
            		                System.out.println("Suweizhe-刷流量");
            		    
            		        // Schedule the task to run every 5 seconds starting from the current time
            		      
            	
            }
	
	
	
	
	
	
	
	
	
	
	
	
	
	   public static void closeBrowse(){
	        try {
	            Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
	            Runtime.getRuntime().exec("taskkill /F /IM iexplorer.exe");  
	            Runtime.getRuntime().exec("taskkill /F /IM 360se.exe"); 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }  
	        
	   }
	   
	   public class DelayExecutionExample { 
		   void publicstaticvoidmain(String[] args){ 
			   try { 
				   System.out.println("开始执行");
				   // 延迟两秒
				   Thread.sleep(2000); System.out.println("延迟两秒后执行");
				   } 
			   catch(InterruptedException e) { e.printStackTrace(); 
			   } 
			   }
		   
		   
		   }
			   
	  
}
class HJFrame extends JFrame {
	private JPanel contentPane;
	private JTextField  txtPwd, txtPwdd, txtPwddd, txtPwdddd;
	private JLabel lblId, lblPwd;
	private JButton btnLogin, Close;
	
	HJFrame() {
    	
    	
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 280, 180);
	        contentPane = new JPanel();
	        setContentPane(contentPane);
	        contentPane.setLayout(null);


//----------------------------------------------------//

	        lblPwd = new JLabel("預計每幾分鐘後開啟");
	        lblPwd.setBounds(10, 65, 100, 15);
	        contentPane.add(lblPwd);

	        btnLogin = new JButton("開啟");
	        btnLogin.setBounds(10, 100, 80, 25);
	        contentPane.add(btnLogin);
	        

	        Close = new JButton("關閉");
	        Close.setBounds(100, 100, 80, 25);
	        contentPane.add(Close);
	        
	        btnLogin.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	   
	            		Timer timer = new Timer();
	                    TimerTask task = new TimerTask() {
	            			@Override
	            			public void run() {
	            		
	            					try {
										chome();
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
	            				
	            			}
	                    };
	                    
	                    Date startTime = new Date();
	                 
	                    timer.schedule(task, startTime, 5000); //target_price*10000
	                    
	               
	                    
	            }
	        });
	        //-------------------------------------------------------------------//
	        
	        Close.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	         
	                    JOptionPane.showMessageDialog(null, "關閉系統", "系統資訊", JOptionPane.ERROR_MESSAGE);
	                    System.exit(0);
	            }
	        });
	        
	        setVisible(true);
	}

	
    public static  void chome( ) throws Exception
    {
    	
                      
    	String[] myArray = {"https://youtu.be/nZVC-83M_Lg", 
    			"https://youtu.be/Obrrc7Y1Yvg", 
    					 "https://youtu.be/Y6BqlF40wUo",
    					 "https://youtu.be/36MLMAEc2jw"
    			,          "https://youtu.be/n3NdvwJWoE8"
    			,            "https://youtu.be/VsiCIx1cjT4"};
    		//------------------------------------------------------//	     
    	int Random = 0;
    	Random = (int)(Math.random()*(255-100+1))+100;
    	
   
        int I=4;
    	        int NUM= (int)(Math.random()*4);
    	  /*
    	        String    Ip = InetAddress.getLocalHost().getHostAddress();
    	        System.out.print(Ip+"\n");
    	        */
    	     
    	        
    	        
    		            	try {
    		            	
    		            		
    		        		
    		            	    switch(NUM){
    		            	    case 0 :
    		            	    	play(myArray[0],I);
    		            	       break; //可选
    		            	    case 1 :
    		            	    	play(myArray[1],I);
    		            	       break; //可选
    		            	    case 2 :
    		            	    	play(myArray[2],I);
    		            	       break; //可选
    		            	    case 3 :
    		            	    	play(myArray[3],I);
    		            	       break; //可选
    		            	    //你可以有任意数量的case语句
    		            	    default : //可选
    		            	         }

    		        			
    		        		} catch (java.lang.NullPointerException e) {
    		        			// 此為uri為空時丟擲異常
    		        			e.printStackTrace();
    		        		} catch (java.io.IOException e) {
    		        			// 此為無法獲取系統預設瀏覽器
    		        			e.printStackTrace();
    		        		}
    		            	
    		                //------------------------------------------------------//	         	
    		         	   try {
    		         		
    		         		
    		         		     //int r = 0;求 20~40 之間的亂數
    		         		int    r = (int)(Math.random()*(300000-180000+1))+180000;
    		         
    		         	       System.out.println("秒數"+r+"分鐘"+(r/60000));
    		         	       
    		         	
    						Thread.sleep(10000);
    						
    						// 2秒 確定網址   
    						
    						
    						
    					} catch (InterruptedException e) {
    						// TODO Auto-generated catch block
    						e.printStackTrace();
    					} //設定 兩秒後啟關閉 瀏覽器
    		         	   
    		               //-----關閉-------------------------------------------------//	     
    		    		   closeBrowse(); 
    		    		    	

    		                System.out.println("Suweizhe-刷流量");
    		    
    		        // Schedule the task to run every 5 seconds starting from the current time
    		      
    	
    }



    public static void play(String URL,int I) throws IOException, AWTException, InterruptedException{
    	for(int i=0;i<=I;i++)
		{
    		
    
   		 
			java.net.URI uri = java.net.URI.create(URL);
			// 獲取當前系統桌面擴充套件
			java.awt.Desktop dp = java.awt.Desktop.getDesktop();
			// 判斷系統桌面是否支援要執行的功能
			if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
				dp.browse(uri);
				// 獲取系統預設瀏覽器開啟連結
			}
			Thread.sleep(2000);
			Robot myRobot = new Robot();
			myRobot.mouseMove(890, 600);				// 移動滑鼠到座標（x,y）處
			myRobot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);		// 模擬按下滑鼠左鍵
			//myRobot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);	// 模擬釋放滑鼠左鍵
			
			Thread.sleep(2000);
			
		}
    }










public static void closeBrowse(){
    try {
        Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
        Runtime.getRuntime().exec("taskkill /F /IM iexplorer.exe");  
        Runtime.getRuntime().exec("taskkill /F /IM 360se.exe"); 
    } catch (IOException e) {
        e.printStackTrace();
    }  
    
}

public class DelayExecutionExample { 
   void publicstaticvoidmain(String[] args){ 
	   try { 
		   System.out.println("开始执行");
		   // 延迟两秒
		   Thread.sleep(2000); System.out.println("延迟两秒后执行");
		   } 
	   catch(InterruptedException e) { e.printStackTrace(); 
	   } 
	   }
   
   
   }
}
