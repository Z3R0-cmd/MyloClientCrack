/*     */ package com.mylo.base.utils;
/*     */ 
/*     */ import com.mojang.authlib.UserAuthentication;
/*     */ import com.mylo.base.ui.GuiAltManager;
/*     */ import com.thealtening.api.TheAltening;
/*     */ import com.thealtening.auth.TheAlteningAuthentication;
/*     */ import com.thealtening.auth.service.AlteningServiceType;
/*     */ import java.lang.reflect.Field;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.entity.EntityPlayerSP;
/*     */ import net.minecraft.client.gui.GuiScreen;
/*     */ import net.minecraft.util.Session;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class altutils
/*     */ {
/*  18 */   public static TheAlteningAuthentication thealteningauth = TheAlteningAuthentication.mojang();
/*     */   public static boolean altmanageropen = false;
/*     */   
/*     */   public static void setSession(Session s, AlteningServiceType type) throws Exception {
/*  22 */     Class<? extends Minecraft> mc = (Class)Minecraft.getMinecraft().getClass();
/*     */ 
/*     */     
/*     */     try {
/*  26 */       thealteningauth.updateService(type);
/*     */       
/*  28 */       Field session = null; byte b; int i;
/*     */       Field[] arrayOfField;
/*  30 */       for (i = (arrayOfField = mc.getDeclaredFields()).length, b = 0; b < i; ) { Field f = arrayOfField[b];
/*     */         
/*  32 */         if (f.getType().isInstance(s))
/*     */         {
/*  34 */           session = f;
/*     */         }
/*     */         b++; }
/*     */       
/*  38 */       if (session == null) {
/*  39 */         throw new IllegalStateException("No field of type " + Session.class.getCanonicalName() + " declared.");
/*     */       }
/*  41 */       session.setAccessible(true);
/*  42 */       session.set(Minecraft.getMinecraft(), s);
/*  43 */       session.setAccessible(false);
/*     */     }
/*  45 */     catch (Exception e) {
/*     */       
/*  47 */       e.printStackTrace();
/*  48 */       throw e;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setUserOffline(String username) {
/*     */     try {
/*  56 */       if (username.equals("")) {
/*  57 */         username = Stringutils.getRandomString("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", (int)(Math.random() * 5.0D) + 5);
/*     */       }
/*     */       
/*  60 */       Minecraft mc = Minecraft.getMinecraft();
/*  61 */       UserAuthentication auth = mc.AUTH;
/*     */       
/*  63 */       auth.logOut();
/*     */       
/*  65 */       Session session = new Session(username, EntityPlayerSP.getOfflineUUID(username).toString(), "-", "legacy");
/*     */       
/*  67 */       setSession(session, AlteningServiceType.MOJANG);
/*     */     }
/*  69 */     catch (Exception e) {
/*  70 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setUser(String username, String password, AlteningServiceType type) {
/*     */     try {
/*  78 */       Minecraft mc = Minecraft.getMinecraft();
/*  79 */       UserAuthentication auth = mc.AUTH;
/*     */       
/*  81 */       thealteningauth.updateService(type);
/*     */       
/*  83 */       auth.logOut();
/*     */       
/*  85 */       auth.setUsername(username);
/*  86 */       auth.setPassword(password);
/*     */       
/*  88 */       auth.logIn();
/*     */       
/*  90 */       Session session = new Session(auth.getSelectedProfile().getName(), auth.getSelectedProfile().getId().toString(), auth.getAuthenticatedToken(), "mojang");
/*     */       
/*  92 */       setSession(session, type);
/*     */     }
/*  94 */     catch (Exception exception) {}
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void showAltManager(GuiScreen parentScreen) {
/* 100 */     Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new GuiAltManager(parentScreen));
/*     */   }
/*     */   
/*     */   public static void loginAltening(String apikeyortoken, boolean api) {
/* 104 */     String token = apikeyortoken;
/* 105 */     if (api) {
/* 106 */       token = TheAltening.newBasicRetriever(apikeyortoken).getAccount().getToken();
/*     */     }
/* 108 */     setUser(token, token, AlteningServiceType.THEALTENING);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/altutils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */