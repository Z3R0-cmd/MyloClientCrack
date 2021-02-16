/*    */ package com.mylo.base;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOError;
/*    */ import java.lang.reflect.Field;
/*    */ import java.util.Arrays;
/*    */ import javax.swing.JOptionPane;
/*    */ import net.minecraft.client.main.Main;
/*    */ 
/*    */ 
/*    */ public class LaunchClient
/*    */ {
/*    */   public static void main(String[] args) {
/* 14 */     File natives = null;
/*    */     
/*    */     try {
/* 17 */       natives = new File("Natives");
/*    */     }
/* 19 */     catch (IOError|SecurityException error) {
/* 20 */       JOptionPane.showMessageDialog(null, error.getMessage().split("\n")[0].trim().toString().toLowerCase());
/*    */     } 
/* 22 */     if (!natives.exists()) {
/* 23 */       JOptionPane.showMessageDialog(null, "We can't find your natives.\nPlease run Minecraft 1.8.8 to generate them.\nWE DONT HELP PIRATING THE GAME");
/*    */     }
/*    */     try {
/* 26 */       addLibraryPath(natives.getPath());
/*    */     }
/* 28 */     catch (Exception e) {
/* 29 */       e.printStackTrace();
/*    */     } 
/* 31 */     System.setProperty("file.encoding", "Cp1252");
/* 32 */     System.out.println("Now starting client");
/* 33 */     Main.main(concat(new String[] { "--username", String.valueOf(System.getProperty("user.name").replace(" ", "_")) + (System.currentTimeMillis() % 100000L), "--version", "mcp", "--accessToken", "0", "--assetsDir", "assets", "--assetIndex", "1.8.8", "--userProperties", "{}" }args));
/*    */   }
/*    */ 
/*    */   
/*    */   public static void addLibraryPath(String pathToAdd) throws Exception {
/* 38 */     Field usrPathsField = ClassLoader.class.getDeclaredField("usr_paths");
/* 39 */     usrPathsField.setAccessible(true);
/* 40 */     String[] paths = (String[])usrPathsField.get(null), arrstring = paths;
/* 41 */     int n = paths.length;
/* 42 */     for (int i = 0; i < n; ) {
/* 43 */       String path = arrstring[i];
/* 44 */       if (!path.equals(pathToAdd)) {
/*    */         i++; continue;
/*    */       }  return;
/* 47 */     }  String[] newPaths = Arrays.<String>copyOf(paths, paths.length + 1);
/* 48 */     newPaths[newPaths.length - 1] = pathToAdd;
/* 49 */     usrPathsField.set(null, newPaths);
/*    */   }
/*    */   
/*    */   public static <T> T[] concat(T[] first, T[] second) {
/* 53 */     T[] result = Arrays.copyOf(first, first.length + second.length);
/* 54 */     System.arraycopy(second, 0, result, first.length, second.length);
/* 55 */     return result;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/LaunchClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */