/*     */ package com.mylo.base.utils;
/*     */ 
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.module.Module;
/*     */ import de.Hero.settings.Setting;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Paths;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import java.util.List;
/*     */ import net.minecraft.client.Minecraft;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class saveutil
/*     */ {
/*     */   public static void save(String filename) {
/*  24 */     JsonObject settings = new JsonObject();
/*  25 */     for (Module m : Main.modmgr.getModules()) {
/*  26 */       JsonObject module = new JsonObject();
/*  27 */       if (Main.setmgr.getSettingsByMod(m) != null)
/*  28 */         for (Setting s : Main.setmgr.getSettingsByMod(m)) {
/*  29 */           if (s.isCheck())
/*  30 */             module.addProperty(s.getName(), Boolean.valueOf(s.getValBoolean())); 
/*  31 */           if (s.isCombo())
/*  32 */             module.addProperty(s.getName(), s.getValString()); 
/*  33 */           if (s.isSlider()) {
/*  34 */             module.addProperty(s.getName(), Double.valueOf(s.getValDouble()));
/*     */           }
/*     */         }  
/*  37 */       module.addProperty("Enabled", Boolean.valueOf(m.getState()));
/*  38 */       module.addProperty("Keybind", Integer.valueOf(m.keybind));
/*  39 */       settings.add(m.name, (JsonElement)module);
/*     */     } 
/*     */     try {
/*  42 */       if (!Files.isDirectory(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems", new String[0]), new java.nio.file.LinkOption[0])) {
/*  43 */         Files.createDirectory(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems", new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
/*     */       }
/*  45 */       if (!Files.isDirectory(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\configs", new String[0]), new java.nio.file.LinkOption[0])) {
/*  46 */         Files.createDirectory(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\configs", new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
/*     */       }
/*  48 */       if (!Files.exists(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\configs\\" + filename + ".json", new String[0]), new java.nio.file.LinkOption[0])) {
/*  49 */         Files.createFile(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\\\configs\\" + filename + ".json", new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
/*     */       }
/*  51 */       Gson gson = (new GsonBuilder()).setPrettyPrinting().create();
/*  52 */       Files.write(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\configs\\" + filename + ".json", new String[0]), gson.toJson((JsonElement)settings).getBytes(), new java.nio.file.OpenOption[0]);
/*  53 */     } catch (IOException e) {
/*  54 */       e.printStackTrace();
/*  55 */       Main.sendChatMessage("error in saving");
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void load(String filename) {
/*  60 */     if (Files.exists(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\configs\\" + filename + ".json", new String[0]), new java.nio.file.LinkOption[0])) {
/*  61 */       for (Module m : Main.modmgr.getModules()) {
/*  62 */         if (m.getState()) {
/*  63 */           m.toggle();
/*     */         }
/*     */       } 
/*  66 */       Gson gson = new Gson();
/*     */       try {
/*  68 */         List<String> configlist = Files.readAllLines(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\configs\\" + filename + ".json", new String[0]));
/*  69 */         String configstring = "";
/*  70 */         for (String s : configlist) {
/*  71 */           configstring = String.valueOf(configstring) + s + "\n";
/*     */         }
/*  73 */         JsonObject config = (JsonObject)gson.fromJson(configstring, JsonObject.class);
/*  74 */         for (Module m : Main.modmgr.getModules()) {
/*  75 */           JsonElement moduleel = config.get(m.name);
/*  76 */           if (moduleel != null) {
/*  77 */             JsonObject module = moduleel.getAsJsonObject();
/*  78 */             m.setState(module.get("Enabled").getAsBoolean());
/*  79 */             m.keybind = module.get("Keybind").getAsInt();
/*  80 */             if (Main.setmgr.getSettingsByMod(m) != null)
/*  81 */               for (Setting s : Main.setmgr.getSettingsByMod(m)) {
/*  82 */                 if (module.get(s.getName()) != null) {
/*  83 */                   if (s.isCheck())
/*  84 */                     s.setValBoolean(module.get(s.getName()).getAsBoolean()); 
/*  85 */                   if (s.isCombo())
/*  86 */                     s.setValString(module.get(s.getName()).getAsString()); 
/*  87 */                   if (s.isSlider()) {
/*  88 */                     s.setValDouble(module.get(s.getName()).getAsDouble());
/*     */                   }
/*     */                 } 
/*     */               }  
/*     */           } 
/*  93 */           if (m.name.equalsIgnoreCase("hud")) {
/*  94 */             m.setState(true);
/*     */           }
/*     */         } 
/*  97 */       } catch (IOException e) {
/*  98 */         e.printStackTrace();
/*  99 */         Main.sendChatMessage("error in loading");
/*     */       } 
/*     */     } else {
/*     */       
/* 103 */       Main.sendChatMessage("that config does not exist!");
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void saveAlteningToken(String alteningtoken) {
/*     */     try {
/* 109 */       if (!Files.exists(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\alttoken.txt", new String[0]), new java.nio.file.LinkOption[0])) {
/* 110 */         Files.createFile(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\alttoken.txt", new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
/*     */       }
/* 112 */       if (!Files.exists(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\alttoken.txt", new String[0]), new java.nio.file.LinkOption[0])) {
/* 113 */         Files.createFile(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\alttoken.txt", new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
/*     */       }
/* 115 */       Files.write(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\alttoken.txt", new String[0]), alteningtoken.getBytes(), new java.nio.file.OpenOption[0]);
/*     */     }
/* 117 */     catch (IOException e) {
/* 118 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static String getAlteningToken() {
/*     */     try {
/* 124 */       if (Files.exists(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\alttoken.txt", new String[0]), new java.nio.file.LinkOption[0])) {
/*     */         try {
/* 126 */           return Files.readAllLines(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\alttoken.txt", new String[0])).get(0);
/* 127 */         } catch (IOException e) {
/* 128 */           e.printStackTrace();
/*     */         }
/*     */       
/*     */       }
/* 132 */     } catch (Exception exception) {}
/*     */ 
/*     */     
/* 135 */     return "";
/*     */   }
/*     */   
/*     */   public static void saveFriends(List<String> friends) {
/*     */     try {
/* 140 */       if (!Files.exists(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\friends.txt", new String[0]), new java.nio.file.LinkOption[0])) {
/* 141 */         Files.createFile(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\friends.txt", new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
/*     */       }
/* 143 */       if (!Files.exists(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\friends.txt", new String[0]), new java.nio.file.LinkOption[0])) {
/* 144 */         Files.createFile(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\friends.txt", new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
/*     */       }
/* 146 */       String friendslist = "";
/* 147 */       for (String friend : friends) {
/* 148 */         friendslist = String.valueOf(friendslist) + friend + "\n";
/*     */       }
/* 150 */       Files.write(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\friends.txt", new String[0]), friendslist.getBytes(), new java.nio.file.OpenOption[0]);
/*     */     }
/* 152 */     catch (IOException e) {
/* 153 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static List<String> getFriends() {
/* 158 */     if (Files.exists(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\friends.txt", new String[0]), new java.nio.file.LinkOption[0])) {
/*     */       try {
/* 160 */         return Files.readAllLines(Paths.get(String.valueOf((Minecraft.getMinecraft()).mcDataDir.getPath()) + "\\cheems\\friends.txt", new String[0]));
/* 161 */       } catch (IOException e) {
/* 162 */         e.printStackTrace();
/*     */       } 
/*     */     }
/* 165 */     return Lists.newArrayList((Object[])new String[] { "" });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/saveutil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */