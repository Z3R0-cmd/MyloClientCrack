/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.lang.reflect.Type;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */   implements JsonDeserializer<ant.a>, JsonSerializer<ant.a>
/*     */ {
/*     */   public ant.a a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 749 */     JsonObject jsonObject = ☃.getAsJsonObject();
/*     */     
/* 751 */     ant.a a = new ant.a();
/*     */     
/*     */     try {
/* 754 */       a.b = ni.a(jsonObject, "coordinateScale", a.b);
/* 755 */       a.c = ni.a(jsonObject, "heightScale", a.c);
/* 756 */       a.e = ni.a(jsonObject, "lowerLimitScale", a.e);
/* 757 */       a.d = ni.a(jsonObject, "upperLimitScale", a.d);
/* 758 */       a.f = ni.a(jsonObject, "depthNoiseScaleX", a.f);
/* 759 */       a.g = ni.a(jsonObject, "depthNoiseScaleZ", a.g);
/* 760 */       a.h = ni.a(jsonObject, "depthNoiseScaleExponent", a.h);
/* 761 */       a.i = ni.a(jsonObject, "mainNoiseScaleX", a.i);
/* 762 */       a.j = ni.a(jsonObject, "mainNoiseScaleY", a.j);
/* 763 */       a.k = ni.a(jsonObject, "mainNoiseScaleZ", a.k);
/* 764 */       a.l = ni.a(jsonObject, "baseSize", a.l);
/* 765 */       a.m = ni.a(jsonObject, "stretchY", a.m);
/* 766 */       a.n = ni.a(jsonObject, "biomeDepthWeight", a.n);
/* 767 */       a.o = ni.a(jsonObject, "biomeDepthOffset", a.o);
/* 768 */       a.p = ni.a(jsonObject, "biomeScaleWeight", a.p);
/* 769 */       a.q = ni.a(jsonObject, "biomeScaleOffset", a.q);
/* 770 */       a.r = ni.a(jsonObject, "seaLevel", a.r);
/*     */       
/* 772 */       a.s = ni.a(jsonObject, "useCaves", a.s);
/* 773 */       a.t = ni.a(jsonObject, "useDungeons", a.t);
/* 774 */       a.u = ni.a(jsonObject, "dungeonChance", a.u);
/* 775 */       a.v = ni.a(jsonObject, "useStrongholds", a.v);
/* 776 */       a.w = ni.a(jsonObject, "useVillages", a.w);
/* 777 */       a.x = ni.a(jsonObject, "useMineShafts", a.x);
/* 778 */       a.y = ni.a(jsonObject, "useTemples", a.y);
/* 779 */       a.z = ni.a(jsonObject, "useMonuments", a.z);
/* 780 */       a.A = ni.a(jsonObject, "useRavines", a.A);
/* 781 */       a.B = ni.a(jsonObject, "useWaterLakes", a.B);
/* 782 */       a.C = ni.a(jsonObject, "waterLakeChance", a.C);
/* 783 */       a.D = ni.a(jsonObject, "useLavaLakes", a.D);
/* 784 */       a.E = ni.a(jsonObject, "lavaLakeChance", a.E);
/* 785 */       a.F = ni.a(jsonObject, "useLavaOceans", a.F);
/*     */       
/* 787 */       a.G = ni.a(jsonObject, "fixedBiome", a.G);
/* 788 */       if (a.G >= 38 || a.G < -1) {
/* 789 */         a.G = -1;
/* 790 */       } else if (a.G >= ady.x.az) {
/* 791 */         a.G += 2;
/*     */       } 
/* 793 */       a.H = ni.a(jsonObject, "biomeSize", a.H);
/* 794 */       a.I = ni.a(jsonObject, "riverSize", a.I);
/*     */       
/* 796 */       a.J = ni.a(jsonObject, "dirtSize", a.J);
/* 797 */       a.K = ni.a(jsonObject, "dirtCount", a.K);
/* 798 */       a.L = ni.a(jsonObject, "dirtMinHeight", a.L);
/* 799 */       a.M = ni.a(jsonObject, "dirtMaxHeight", a.M);
/* 800 */       a.N = ni.a(jsonObject, "gravelSize", a.N);
/* 801 */       a.O = ni.a(jsonObject, "gravelCount", a.O);
/* 802 */       a.P = ni.a(jsonObject, "gravelMinHeight", a.P);
/* 803 */       a.Q = ni.a(jsonObject, "gravelMaxHeight", a.Q);
/* 804 */       a.R = ni.a(jsonObject, "graniteSize", a.R);
/* 805 */       a.S = ni.a(jsonObject, "graniteCount", a.S);
/* 806 */       a.T = ni.a(jsonObject, "graniteMinHeight", a.T);
/* 807 */       a.U = ni.a(jsonObject, "graniteMaxHeight", a.U);
/* 808 */       a.V = ni.a(jsonObject, "dioriteSize", a.V);
/* 809 */       a.W = ni.a(jsonObject, "dioriteCount", a.W);
/* 810 */       a.X = ni.a(jsonObject, "dioriteMinHeight", a.X);
/* 811 */       a.Y = ni.a(jsonObject, "dioriteMaxHeight", a.Y);
/* 812 */       a.Z = ni.a(jsonObject, "andesiteSize", a.Z);
/* 813 */       a.aa = ni.a(jsonObject, "andesiteCount", a.aa);
/* 814 */       a.ab = ni.a(jsonObject, "andesiteMinHeight", a.ab);
/* 815 */       a.ac = ni.a(jsonObject, "andesiteMaxHeight", a.ac);
/* 816 */       a.ad = ni.a(jsonObject, "coalSize", a.ad);
/* 817 */       a.ae = ni.a(jsonObject, "coalCount", a.ae);
/* 818 */       a.af = ni.a(jsonObject, "coalMinHeight", a.af);
/* 819 */       a.ag = ni.a(jsonObject, "coalMaxHeight", a.ag);
/* 820 */       a.ah = ni.a(jsonObject, "ironSize", a.ah);
/* 821 */       a.ai = ni.a(jsonObject, "ironCount", a.ai);
/* 822 */       a.aj = ni.a(jsonObject, "ironMinHeight", a.aj);
/* 823 */       a.ak = ni.a(jsonObject, "ironMaxHeight", a.ak);
/* 824 */       a.al = ni.a(jsonObject, "goldSize", a.al);
/* 825 */       a.am = ni.a(jsonObject, "goldCount", a.am);
/* 826 */       a.an = ni.a(jsonObject, "goldMinHeight", a.an);
/* 827 */       a.ao = ni.a(jsonObject, "goldMaxHeight", a.ao);
/* 828 */       a.ap = ni.a(jsonObject, "redstoneSize", a.ap);
/* 829 */       a.aq = ni.a(jsonObject, "redstoneCount", a.aq);
/* 830 */       a.ar = ni.a(jsonObject, "redstoneMinHeight", a.ar);
/* 831 */       a.as = ni.a(jsonObject, "redstoneMaxHeight", a.as);
/* 832 */       a.at = ni.a(jsonObject, "diamondSize", a.at);
/* 833 */       a.au = ni.a(jsonObject, "diamondCount", a.au);
/* 834 */       a.av = ni.a(jsonObject, "diamondMinHeight", a.av);
/* 835 */       a.aw = ni.a(jsonObject, "diamondMaxHeight", a.aw);
/* 836 */       a.ax = ni.a(jsonObject, "lapisSize", a.ax);
/* 837 */       a.ay = ni.a(jsonObject, "lapisCount", a.ay);
/* 838 */       a.az = ni.a(jsonObject, "lapisCenterHeight", a.az);
/* 839 */       a.aA = ni.a(jsonObject, "lapisSpread", a.aA);
/* 840 */     } catch (Exception exception) {}
/*     */ 
/*     */ 
/*     */     
/* 844 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement a(ant.a ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 849 */     JsonObject jsonObject = new JsonObject();
/*     */     
/* 851 */     jsonObject.addProperty("coordinateScale", Float.valueOf(☃.b));
/* 852 */     jsonObject.addProperty("heightScale", Float.valueOf(☃.c));
/* 853 */     jsonObject.addProperty("lowerLimitScale", Float.valueOf(☃.e));
/* 854 */     jsonObject.addProperty("upperLimitScale", Float.valueOf(☃.d));
/* 855 */     jsonObject.addProperty("depthNoiseScaleX", Float.valueOf(☃.f));
/* 856 */     jsonObject.addProperty("depthNoiseScaleZ", Float.valueOf(☃.g));
/* 857 */     jsonObject.addProperty("depthNoiseScaleExponent", Float.valueOf(☃.h));
/* 858 */     jsonObject.addProperty("mainNoiseScaleX", Float.valueOf(☃.i));
/* 859 */     jsonObject.addProperty("mainNoiseScaleY", Float.valueOf(☃.j));
/* 860 */     jsonObject.addProperty("mainNoiseScaleZ", Float.valueOf(☃.k));
/* 861 */     jsonObject.addProperty("baseSize", Float.valueOf(☃.l));
/* 862 */     jsonObject.addProperty("stretchY", Float.valueOf(☃.m));
/* 863 */     jsonObject.addProperty("biomeDepthWeight", Float.valueOf(☃.n));
/* 864 */     jsonObject.addProperty("biomeDepthOffset", Float.valueOf(☃.o));
/* 865 */     jsonObject.addProperty("biomeScaleWeight", Float.valueOf(☃.p));
/* 866 */     jsonObject.addProperty("biomeScaleOffset", Float.valueOf(☃.q));
/* 867 */     jsonObject.addProperty("seaLevel", Integer.valueOf(☃.r));
/*     */     
/* 869 */     jsonObject.addProperty("useCaves", Boolean.valueOf(☃.s));
/* 870 */     jsonObject.addProperty("useDungeons", Boolean.valueOf(☃.t));
/* 871 */     jsonObject.addProperty("dungeonChance", Integer.valueOf(☃.u));
/* 872 */     jsonObject.addProperty("useStrongholds", Boolean.valueOf(☃.v));
/* 873 */     jsonObject.addProperty("useVillages", Boolean.valueOf(☃.w));
/* 874 */     jsonObject.addProperty("useMineShafts", Boolean.valueOf(☃.x));
/* 875 */     jsonObject.addProperty("useTemples", Boolean.valueOf(☃.y));
/* 876 */     jsonObject.addProperty("useMonuments", Boolean.valueOf(☃.z));
/* 877 */     jsonObject.addProperty("useRavines", Boolean.valueOf(☃.A));
/* 878 */     jsonObject.addProperty("useWaterLakes", Boolean.valueOf(☃.B));
/* 879 */     jsonObject.addProperty("waterLakeChance", Integer.valueOf(☃.C));
/* 880 */     jsonObject.addProperty("useLavaLakes", Boolean.valueOf(☃.D));
/* 881 */     jsonObject.addProperty("lavaLakeChance", Integer.valueOf(☃.E));
/* 882 */     jsonObject.addProperty("useLavaOceans", Boolean.valueOf(☃.F));
/*     */     
/* 884 */     jsonObject.addProperty("fixedBiome", Integer.valueOf(☃.G));
/* 885 */     jsonObject.addProperty("biomeSize", Integer.valueOf(☃.H));
/* 886 */     jsonObject.addProperty("riverSize", Integer.valueOf(☃.I));
/*     */     
/* 888 */     jsonObject.addProperty("dirtSize", Integer.valueOf(☃.J));
/* 889 */     jsonObject.addProperty("dirtCount", Integer.valueOf(☃.K));
/* 890 */     jsonObject.addProperty("dirtMinHeight", Integer.valueOf(☃.L));
/* 891 */     jsonObject.addProperty("dirtMaxHeight", Integer.valueOf(☃.M));
/* 892 */     jsonObject.addProperty("gravelSize", Integer.valueOf(☃.N));
/* 893 */     jsonObject.addProperty("gravelCount", Integer.valueOf(☃.O));
/* 894 */     jsonObject.addProperty("gravelMinHeight", Integer.valueOf(☃.P));
/* 895 */     jsonObject.addProperty("gravelMaxHeight", Integer.valueOf(☃.Q));
/* 896 */     jsonObject.addProperty("graniteSize", Integer.valueOf(☃.R));
/* 897 */     jsonObject.addProperty("graniteCount", Integer.valueOf(☃.S));
/* 898 */     jsonObject.addProperty("graniteMinHeight", Integer.valueOf(☃.T));
/* 899 */     jsonObject.addProperty("graniteMaxHeight", Integer.valueOf(☃.U));
/* 900 */     jsonObject.addProperty("dioriteSize", Integer.valueOf(☃.V));
/* 901 */     jsonObject.addProperty("dioriteCount", Integer.valueOf(☃.W));
/* 902 */     jsonObject.addProperty("dioriteMinHeight", Integer.valueOf(☃.X));
/* 903 */     jsonObject.addProperty("dioriteMaxHeight", Integer.valueOf(☃.Y));
/* 904 */     jsonObject.addProperty("andesiteSize", Integer.valueOf(☃.Z));
/* 905 */     jsonObject.addProperty("andesiteCount", Integer.valueOf(☃.aa));
/* 906 */     jsonObject.addProperty("andesiteMinHeight", Integer.valueOf(☃.ab));
/* 907 */     jsonObject.addProperty("andesiteMaxHeight", Integer.valueOf(☃.ac));
/* 908 */     jsonObject.addProperty("coalSize", Integer.valueOf(☃.ad));
/* 909 */     jsonObject.addProperty("coalCount", Integer.valueOf(☃.ae));
/* 910 */     jsonObject.addProperty("coalMinHeight", Integer.valueOf(☃.af));
/* 911 */     jsonObject.addProperty("coalMaxHeight", Integer.valueOf(☃.ag));
/* 912 */     jsonObject.addProperty("ironSize", Integer.valueOf(☃.ah));
/* 913 */     jsonObject.addProperty("ironCount", Integer.valueOf(☃.ai));
/* 914 */     jsonObject.addProperty("ironMinHeight", Integer.valueOf(☃.aj));
/* 915 */     jsonObject.addProperty("ironMaxHeight", Integer.valueOf(☃.ak));
/* 916 */     jsonObject.addProperty("goldSize", Integer.valueOf(☃.al));
/* 917 */     jsonObject.addProperty("goldCount", Integer.valueOf(☃.am));
/* 918 */     jsonObject.addProperty("goldMinHeight", Integer.valueOf(☃.an));
/* 919 */     jsonObject.addProperty("goldMaxHeight", Integer.valueOf(☃.ao));
/* 920 */     jsonObject.addProperty("redstoneSize", Integer.valueOf(☃.ap));
/* 921 */     jsonObject.addProperty("redstoneCount", Integer.valueOf(☃.aq));
/* 922 */     jsonObject.addProperty("redstoneMinHeight", Integer.valueOf(☃.ar));
/* 923 */     jsonObject.addProperty("redstoneMaxHeight", Integer.valueOf(☃.as));
/* 924 */     jsonObject.addProperty("diamondSize", Integer.valueOf(☃.at));
/* 925 */     jsonObject.addProperty("diamondCount", Integer.valueOf(☃.au));
/* 926 */     jsonObject.addProperty("diamondMinHeight", Integer.valueOf(☃.av));
/* 927 */     jsonObject.addProperty("diamondMaxHeight", Integer.valueOf(☃.aw));
/* 928 */     jsonObject.addProperty("lapisSize", Integer.valueOf(☃.ax));
/* 929 */     jsonObject.addProperty("lapisCount", Integer.valueOf(☃.ay));
/* 930 */     jsonObject.addProperty("lapisCenterHeight", Integer.valueOf(☃.az));
/* 931 */     jsonObject.addProperty("lapisSpread", Integer.valueOf(☃.aA));
/*     */     
/* 933 */     return (JsonElement)jsonObject;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ant$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */