# SmileRatingDialog
![alt text](https://raw.githubusercontent.com/vickyKDV/SmileRatingDialog/master/RatingDialog.gif)

# Library Rating dialog dan BottomSheet Dialog dengan animasi Smile

Cara implementasi
   
   
   Set pada build.gradle application
   
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
        implementation 'com.github.vickykdv:SmileRatingDialog:1.0'
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
                            
                                 //centerRating.getKomentar() = adalah value dari callback komentar yang diisi
                                Log.d("MainActivity", "Komentar: "+centerRating.getKomentar());
                                
                                //centerRating.getRating() = adalah value dari callback rating yang diberikan
                                Log.d("MainActivity", "Rating: "+centerRating.getRating());
                                
                                //Menutup Dialog
                                dialogInterface.dismiss();
                            }
                        })
                        .setNegativeButton("Batal",  new CenterRating.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                            
                                 //Menutup Dialog
                                dialogInterface.dismiss();
                            }
                        })
                        .build();
                centerRating.show();
                
 Cara menggunakan BottomSheet Rating pada class actvity / fragment
        
        //Buat Variable Global pada class activity
       
            private BottomSheetRating bottomSheetRating;
        
        //Initial dan setup pada event OnClick
                bottomSheetRating = new BottomSheetRating.Builder(DashboardActivity.this)
                        //Set Title / Judul Dialog
                        .setTitle("Beri Rating")
                        
                        //Set Deskripsi Dialog
                        .setMessage("Beri nilai pada aplikasi kami...")
                        
                        //Menonaktifkan dan mengaktifkan event cancelble / onBackpressed
                        .setCancelable(false)
                        .setPositiveButton("Kirim",  new BottomSheetRating.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            
                                 //centerRating.getKomentar() = adalah value dari callback komentar yang diisi
                                Log.d("MainActivity", "Komentar: "+bottomSheetRating.getKomentar());
                                
                                //centerRating.getRating() = adalah value dari callback rating yang diberikan
                                Log.d("MainActivity", "Rating: "+bottomSheetRating.getRating());
                                
                                //Menutup Dialog
                                dialogInterface.dismiss();
                            }
                        })
                        .setNegativeButton("Batal",  new BottomSheetRating.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                            
                                 //Menutup Dialog
                                dialogInterface.dismiss();
                            }
                        })
                        .build();
                centerRating.show();
