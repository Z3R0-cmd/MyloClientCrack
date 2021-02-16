/*     */ package com.mylo.base.specialobjects.hookscord;
/*     */ 
/*     */ import com.mylo.base.specialobjects.hookscord.utils.Message;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Hookscord
/*     */ {
/*     */   private enum EHttpMethod
/*     */   {
/*  29 */     GET,
/*  30 */     POST;
/*     */   }
/*     */   
/*  33 */   private static final Logger LOGGER = Logger.getLogger(Hookscord.class.getName());
/*     */   
/*     */   private static final String USER_AGENT = "Mozilla/5.0 (X11; Linux x86_64; rv:49.0) Gecko/20100101 Firefox/49.0";
/*  36 */   private URL _url = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Hookscord(String url) throws MalformedURLException {
/*  44 */     this._url = new URL(url + "/slack");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private HttpURLConnection _doConnection(EHttpMethod method) {
/*  53 */     HttpURLConnection connection = null;
/*     */     try {
/*  55 */       connection = (HttpURLConnection)this._url.openConnection();
/*     */       
/*  57 */       connection.setRequestMethod(method.toString());
/*  58 */       connection.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:49.0) Gecko/20100101 Firefox/49.0");
/*  59 */       connection.setRequestProperty("Content-type", "application/json; charset=windows-1252");
/*  60 */       connection.setDoOutput(true);
/*  61 */       connection.setDoInput(true);
/*  62 */     } catch (IOException ex) {
/*  63 */       LOGGER.log(Level.SEVERE, (String)null, ex);
/*  64 */       connection = null;
/*     */     } 
/*  66 */     return connection;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean _doPost(String payload) {
/*  75 */     HttpURLConnection connection = _doConnection(EHttpMethod.POST);
/*  76 */     if (connection == null) {
/*  77 */       return false;
/*     */     }
/*  79 */     connection.setRequestProperty("Content-length", String.valueOf(payload.length()));
/*     */     
/*     */     try {
/*  82 */       DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
/*  83 */       outputStream.writeBytes(payload);
/*  84 */       outputStream.flush();
/*  85 */       outputStream.close();
/*  86 */     } catch (IOException ex) {
/*  87 */       LOGGER.log(Level.SEVERE, (String)null, ex);
/*  88 */       return false;
/*     */     } 
/*     */     try {
/*  91 */       if (connection.getResponseCode() != 200) {
/*  92 */         return false;
/*     */       }
/*  94 */     } catch (IOException ex) {
/*  95 */       LOGGER.log(Level.SEVERE, (String)null, ex);
/*  96 */       return false;
/*     */     } 
/*  98 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void sendMessage(Message msg) throws IOException {
/* 107 */     if (!_doPost(msg.toJson().toString()))
/* 108 */       throw new IOException("Can't perform task"); 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/specialobjects/hookscord/Hookscord.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */