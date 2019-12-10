# SmileRatingDialog
![alt text](https://raw.githubusercontent.com/CASH-IT-Developer/smileratingdialog/master/RatingDialog.gif)

# Library Rating dialog dan BottomSheet Dialog dengan animasi Smile

How to implementasi
   
   
   Add in build.gradle application
   
     allprojects {
          repositories {
             ...
             ...
             maven { url "https://jitpack.io" }

          }
      }
    
   Set pada build.gradle module
    
    dependencies {
        ...
        ...
        implementation 'com.github.CASH-IT-Developer:SmileRatingDialog:1.0'
    }



   Cara menggunakan Center Rating pada class actvity / fragment
        
        //Buat Variable Global pada class activity
       
            private CenterRating centerRating;
        
        //Initial dan setup pada event OnClick
            
            //Membuat Center Rating
                centerRating = new CenterRating.Builder(DashboardActivity.this)
                        //Set Title / Judul Dialog
                        .setTitle("Beri Rating")
                        
                        //Set Deskripsi Dialog
                        .setMessage("Beri nilai pada aplikasi kami...")
                        
                        //Menonaktifkan dan mengaktifkan event cancelble / onBackpressed
                        .setCancelable(false)
                        .setPositiveButton("Kirim",  new CenterRating.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            
                                 //centerRating.getKomentar() ( value from callback komentar )
                                Log.d("MainActivity", "Komentar: "+centerRating.getKomentar());
                                
                                //centerRating.getRating() = value from callback rating your set
                                Log.d("MainActivity", "Rating: "+centerRating.getRating());
                                
                                //Close Dialog
                                dialogInterface.dismiss();
                            }
                        })
                        .setNegativeButton("Batal",  new CenterRating.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                            
                                 //Close Dialog
                                dialogInterface.dismiss();
                            }
                        })
                        .build();
                centerRating.show();
                
 How to user BottomSheet Rating in class actvity or fragment
        
        //Create Variable Global pada class activity
       
            private BottomSheetRating bottomSheetRating;
        
        //Initial and setup from event OnClick
                bottomSheetRating = new BottomSheetRating.Builder(DashboardActivity.this)
                        //Set Title / Judul Dialog
                        .setTitle("Beri Rating")
                        
                        //Set Deskripsi Dialog
                        .setMessage("Beri nilai pada aplikasi kami...")
                        
                        //Disable or deactive event cancelble / onBackpressed
                        .setCancelable(false)
                        .setPositiveButton("Kirim",  new BottomSheetRating.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            
                                 //centerRating.getKomentar() ( value from callback komentar )
                                Log.d("MainActivity", "Komentar: "+bottomSheetRating.getKomentar());
                                
                                //centerRating.getRating() = value from callback rating your set
                                Log.d("MainActivity", "Rating: "+bottomSheetRating.getRating());
                                
                                //Close Dialog
                                dialogInterface.dismiss();
                            }
                        })
                        .setNegativeButton("Batal",  new BottomSheetRating.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                            
                                 //Close Dialog
                                dialogInterface.dismiss();
                            }
                        })
                        .build();
                centerRating.show();
