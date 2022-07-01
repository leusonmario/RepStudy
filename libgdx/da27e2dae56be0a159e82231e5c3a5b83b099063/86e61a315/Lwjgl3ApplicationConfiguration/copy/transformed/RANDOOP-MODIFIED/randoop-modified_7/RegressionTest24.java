import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

    public static boolean debug = false;

    @Test
    public void test12001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12001");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color23 = color4.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color24 = color23.clamp();
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.stencil = 10;
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration26.initialBackgroundColor = color30;
        float float32 = color30.toFloatBits();
        java.lang.String str33 = color30.toString();
        boolean boolean35 = color30.equals((java.lang.Object) (-1.7014117E38f));
        com.badlogic.gdx.graphics.Color color40 = color30.sub((float) (-2144), (float) (-15), (float) 401539072, (float) (-553651968));
        float float41 = color40.r;
        com.badlogic.gdx.graphics.Color color42 = color25.set(color40);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color40, (-17796196));
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color(color40);
        int int46 = com.badlogic.gdx.graphics.Color.rgb565(color45);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "00000000" + "'", str33, "00000000");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 63341 + "'", int46 == 63341);
    }

    @Test
    public void test12002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12002");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (short) 10;
        int int10 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        int int14 = lwjgl3ApplicationConfiguration11.b;
        boolean boolean15 = lwjgl3ApplicationConfiguration11.vSyncEnabled;
        lwjgl3ApplicationConfiguration11.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType18 = lwjgl3ApplicationConfiguration11.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration20.initialBackgroundColor = color24;
        int int26 = com.badlogic.gdx.graphics.Color.rgb888(color24);
        boolean boolean28 = color24.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.stencil = 10;
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration29.initialBackgroundColor = color33;
        com.badlogic.gdx.graphics.Color color39 = color33.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color40 = color24.mul(color39);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color39, (int) 'a');
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color39);
        float float44 = color39.a;
        color39.b = (-4.317883E-22f);
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color(color39);
        com.badlogic.gdx.graphics.Color color49 = color47.set((-40036));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + fileType18 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType18.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.06666667f + "'", float44 == 0.06666667f);
        org.junit.Assert.assertNotNull(color49);
    }

    @Test
    public void test12003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12003");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1465382614, (int) ' ');
        int int18 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        lwjgl3ApplicationConfiguration22.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration22.setFullscreenMode(displayMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        int int29 = lwjgl3ApplicationConfiguration28.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration28.title = "hi!";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration32);
        lwjgl3ApplicationConfiguration33.r = ' ';
        lwjgl3ApplicationConfiguration33.windowMinWidth = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = lwjgl3ApplicationConfiguration33.hdpiMode;
        int int39 = lwjgl3ApplicationConfiguration33.getwindowMinWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration41);
        lwjgl3ApplicationConfiguration42.setWindowPosition((int) (short) 10, 10);
        boolean boolean46 = lwjgl3ApplicationConfiguration42.useGL30;
        lwjgl3ApplicationConfiguration42.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType50 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration42.preferencesFileType = fileType50;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("", fileType50);
        lwjgl3ApplicationConfiguration28.preferencesFileType = fileType50;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType50);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-622910848);
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration59.setWindowedMode((-295168), (-218557696));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration33);
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + fileType50 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType50.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration59);
    }

    @Test
    public void test12004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12004");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000200";
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int16 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.setwindowHeight(1310975);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test12005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12005");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-2147413088);
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color16 = color11.set((float) 65295, (float) (-10224128), 0.0f, (float) (-256));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color16, (-208));
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color23, 16);
        color23.a = 0L;
        com.badlogic.gdx.graphics.Color color28 = color21.mul(color23);
        com.badlogic.gdx.graphics.Color color33 = color21.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color33, 33791);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color37 = color19.sub(color36);
        com.badlogic.gdx.graphics.Color color38 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color42, 16);
        color42.a = 0L;
        com.badlogic.gdx.graphics.Color color47 = color40.mul(color42);
        com.badlogic.gdx.graphics.Color color52 = color40.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color52, 33791);
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color(color52);
        com.badlogic.gdx.graphics.Color color56 = color38.sub(color55);
        com.badlogic.gdx.graphics.Color color57 = color36.set(color55);
        com.badlogic.gdx.graphics.Color color58 = color57.cpy();
        com.badlogic.gdx.graphics.Color color59 = color16.set(color58);
        int int60 = com.badlogic.gdx.graphics.Color.rgba4444(color59);
        com.badlogic.gdx.graphics.Color color65 = color59.mul((-4.286695E37f), (float) (-480), (float) (-45312), (float) 372608);
        int int66 = color65.toIntBits();
        com.badlogic.gdx.graphics.Color color71 = color65.sub(0.0f, (-1.7007336E38f), (float) (-2147482368), (float) (-4084));
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color65, 62445);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color65, (-1929445376));
        com.badlogic.gdx.graphics.Color color76 = color65.clamp();
        com.badlogic.gdx.graphics.Color color81 = color65.set((float) (-57361), (float) 401539072, (float) 194, (float) (-1762040320));
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2032 + "'", int60 == 2032);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(color71);
        org.junit.Assert.assertNotNull(color76);
        org.junit.Assert.assertNotNull(color81);
    }

    @Test
    public void test12006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12006");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((-62876));
        com.badlogic.gdx.graphics.Color color4 = color1.add(color3);
        int int5 = com.badlogic.gdx.graphics.Color.rgba4444(color4);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 65535 + "'", int5 == 65535);
    }

    @Test
    public void test12007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12007");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.samples = 512;
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int15 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test12008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12008");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-33280));
    }

    @Test
    public void test12009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12009");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = 765;
        int int10 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = lwjgl3ApplicationConfiguration0.hdpiMode;
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test12010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12010");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(512);
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.windowWidth = 2046;
        lwjgl3ApplicationConfiguration0.b = 16711425;
        int int17 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test12011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12011");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(0);
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = lwjgl3ApplicationConfiguration0.windowListener;
        int int20 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        int int21 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(lwjgl3WindowListener19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test12012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12012");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.title;
        int int15 = lwjgl3ApplicationConfiguration0.depth;
        int int16 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str17 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12013");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.title;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int14 = lwjgl3ApplicationConfiguration13.getsamples();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test12014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12014");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((-1.0899702E38f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test12015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12015");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        int int5 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setsamples((-545421065));
        int int8 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 640 + "'", int5 == 640);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test12016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12016");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.windowX = (-1671024128);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        int int17 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean18 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.title = "ffffffff";
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test12017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12017");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.windowY = (byte) 1;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(lwjgl3DisplayMode8);
    }

    @Test
    public void test12018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12018");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setwindowWidth((-40036));
        int int13 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.setwindowX(480);
        int int16 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.windowWidth = (-95486193);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 480 + "'", int16 == 480);
        org.junit.Assert.assertNull(lwjgl3WindowListener19);
    }

    @Test
    public void test12019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12019");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-42115328), (-1.2760589E38f), (float) (-16124145), (float) 668989779);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test12020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12020");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000000";
        lwjgl3ApplicationConfiguration0.windowY = 8;
        int int13 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ff0000ff";
        lwjgl3ApplicationConfiguration0.setwindowWidth((-266942944));
        int int18 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int19 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int20 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test12021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12021");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.windowMinHeight = 480;
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferCount((-2147483648));
        lwjgl3ApplicationConfiguration1.windowMinHeight = (byte) 1;
        lwjgl3ApplicationConfiguration1.disableAudio(false);
        int int15 = lwjgl3ApplicationConfiguration1.g;
        lwjgl3ApplicationConfiguration1.windowResizable = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test12022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12022");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.graphics.Color color8 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        color8.g = (-1.7013599E38f);
        com.badlogic.gdx.graphics.Color color15 = color8.add((float) 40664886, (float) 1621098495, (float) 0L, (float) (-864551100));
        com.badlogic.gdx.graphics.Color color20 = color8.mul((-1.7013599E38f), (-1.1841958E21f), (float) 480, (float) 514080);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.GOLD;
        color21.r = 'a';
        com.badlogic.gdx.graphics.Color color24 = color8.sub(color21);
        com.badlogic.gdx.graphics.Color color26 = color8.set((-1077952513));
        int int27 = com.badlogic.gdx.graphics.Color.rgba4444(color8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 48063 + "'", int27 == 48063);
    }

    @Test
    public void test12023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12023");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1610726212), (float) 536232049, (float) (-65536), (float) (-57871));
    }

    @Test
    public void test12024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12024");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        int int12 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.stencil = (-52344);
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        boolean boolean16 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.windowY = (-2528);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test12025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12025");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        lwjgl3ApplicationConfiguration1.b = (-65536);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode9 = lwjgl3ApplicationConfiguration1.fullscreenMode;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(lwjgl3DisplayMode9);
    }

    @Test
    public void test12026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12026");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.windowMinWidth = 8925;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(163200, 16776961, (int) '#', (-15), (-2147413088), 2, 131);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(0);
        int int20 = lwjgl3ApplicationConfiguration0.g;
        int int21 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int22 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int23 = lwjgl3ApplicationConfiguration0.windowY;
        boolean boolean24 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16776961 + "'", int20 == 16776961);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test12027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12027");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-255), (float) 6349110, (float) 1677721600, (float) 512);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, 267782144);
        float float7 = color4.a;
        float float8 = color4.b;
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test12028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12028");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(480);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.OLIVE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        int int14 = lwjgl3ApplicationConfiguration11.depth;
        lwjgl3ApplicationConfiguration11.windowX = (short) 100;
        lwjgl3ApplicationConfiguration11.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration11.getpreferencesFileType();
        int int21 = lwjgl3ApplicationConfiguration11.getwindowY();
        lwjgl3ApplicationConfiguration11.windowDecorated = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration25);
        lwjgl3ApplicationConfiguration26.setWindowPosition((int) (short) 10, 10);
        boolean boolean30 = lwjgl3ApplicationConfiguration26.useGL30;
        com.badlogic.gdx.Files.FileType fileType31 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration26.setpreferencesFileType(fileType31);
        com.badlogic.gdx.Files.FileType fileType33 = lwjgl3ApplicationConfiguration26.getpreferencesFileType();
        lwjgl3ApplicationConfiguration11.setPreferencesConfig("", fileType33);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType33);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(65535);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        java.lang.String str40 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(8912896);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + fileType31 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType31.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType33 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType33.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test12029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12029");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        java.lang.String str5 = lwjgl3ApplicationConfiguration0.title;
        int int6 = lwjgl3ApplicationConfiguration0.getsamples();
        java.lang.String str7 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setwindowWidth(65039);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test12030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12030");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        lwjgl3ApplicationConfiguration1.windowHeight = (-2147481728);
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration1.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.stencil = 10;
        int int25 = lwjgl3ApplicationConfiguration22.b;
        boolean boolean26 = lwjgl3ApplicationConfiguration22.vSyncEnabled;
        lwjgl3ApplicationConfiguration22.setuseGL30(false);
        int int29 = lwjgl3ApplicationConfiguration22.getwindowY();
        int int30 = lwjgl3ApplicationConfiguration22.audioDeviceBufferCount;
        int int31 = lwjgl3ApplicationConfiguration22.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration32.stencil = 10;
        int int35 = lwjgl3ApplicationConfiguration32.b;
        boolean boolean36 = lwjgl3ApplicationConfiguration32.vSyncEnabled;
        lwjgl3ApplicationConfiguration32.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration32.hdpiMode = hdpiMode39;
        com.badlogic.gdx.Files.FileType fileType41 = lwjgl3ApplicationConfiguration32.getpreferencesFileType();
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType41);
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("00ffffff", fileType41);
        lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion = ' ';
        lwjgl3ApplicationConfiguration1.a = (-67379424);
        lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources = (-1286733314);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + fileType41 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType41.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12031");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 63518;
        int int18 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test12032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12032");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = 765;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 8, 0.0f, (float) 65535);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color16;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1671172080, (int) '4');
        lwjgl3ApplicationConfiguration0.g = (-65280);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test12033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12033");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-16711681));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test12034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12034");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.depth = 100;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.r = ' ';
        lwjgl3ApplicationConfiguration8.windowMinWidth = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = lwjgl3ApplicationConfiguration8.hdpiMode;
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration8.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType14);
        int int16 = lwjgl3ApplicationConfiguration0.getdepth();
        int int17 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test12035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12035");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, (int) (byte) 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration1.b = '#';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.Files.FileType fileType16 = lwjgl3ApplicationConfiguration15.getpreferencesFileType();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + fileType16 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType16.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12036");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-415027232), (-1.7009948E38f), (float) 5959680, (float) (-3060));
    }

    @Test
    public void test12037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12037");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.a = 2016;
        lwjgl3ApplicationConfiguration0.b = (-458762);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
    }

    @Test
    public void test12038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12038");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        lwjgl3ApplicationConfiguration0.setsamples(1677721600);
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        color10.b = 0.9764706f;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test12039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12039");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-52344);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-4090624);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-4249857), (-1011534592), 491505, (-268435536));
        int int17 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test12040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12040");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 572710365, (float) (-79380480), (float) 40664886, (-1.6947657E38f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3072) + "'", int4 == (-3072));
    }

    @Test
    public void test12041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12041");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int10 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.windowResizable;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.stencil = 10;
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration13.initialBackgroundColor = color17;
        int int19 = com.badlogic.gdx.graphics.Color.rgb888(color17);
        boolean boolean21 = color17.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.stencil = 10;
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration22.initialBackgroundColor = color26;
        com.badlogic.gdx.graphics.Color color32 = color26.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color33 = color17.mul(color32);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color32);
        float float35 = color34.toFloatBits();
        com.badlogic.gdx.graphics.Color color36 = color34.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color41 = color34.mul(2.5207762E-35f, (float) (byte) 0, (-1.460473E38f), 0.0f);
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color41);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 2.3509886E-38f + "'", float35 == 2.3509886E-38f);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color41);
    }

    @Test
    public void test12042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12042");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowWidth = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        lwjgl3ApplicationConfiguration16.setWindowPosition((int) (short) 10, 10);
        boolean boolean20 = lwjgl3ApplicationConfiguration16.useGL30;
        com.badlogic.gdx.Files.FileType fileType21 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType21);
        lwjgl3ApplicationConfiguration16.g = 100;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration25);
        lwjgl3ApplicationConfiguration26.r = ' ';
        boolean boolean29 = lwjgl3ApplicationConfiguration26.getuseGL30();
        lwjgl3ApplicationConfiguration26.useGL30 = false;
        lwjgl3ApplicationConfiguration26.windowMaxHeight = (-256);
        lwjgl3ApplicationConfiguration26.audioDeviceBufferCount = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration36.stencil = 10;
        int int39 = lwjgl3ApplicationConfiguration36.depth;
        boolean boolean40 = lwjgl3ApplicationConfiguration36.vSyncEnabled;
        lwjgl3ApplicationConfiguration36.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration36.hdpiMode = hdpiMode43;
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration16.hdpiMode = hdpiMode43;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode43);
        int int48 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.windowY = (-5467664);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3WindowListener12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + fileType21 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType21.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 16 + "'", int39 == 16);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test12043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12043");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.graphics.Color color4 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.title = "d2b48cff";
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test12044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12044");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CLEAR;
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        float float3 = color2.g;
        com.badlogic.gdx.graphics.Color color4 = color0.mul(color2);
        float float5 = color0.b;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test12045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12045");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.stencil = 10;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color9;
        com.badlogic.gdx.graphics.Color color15 = color9.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color9, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, 765, 0);
        boolean boolean24 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 16439278);
        int int30 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test12046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12046");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int16 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color21;
        lwjgl3ApplicationConfiguration17.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration17.setFullscreenMode(displayMode25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration17);
        int int28 = lwjgl3ApplicationConfiguration17.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration17.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode31);
        boolean boolean34 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int35 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (short) 1;
        java.lang.String str38 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        int int41 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-1967617);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 640 + "'", int35 == 640);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ".prefs/" + "'", str38, ".prefs/");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test12047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12047");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.windowY = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration1.windowListener = lwjgl3WindowListener12;
        int int14 = lwjgl3ApplicationConfiguration1.stencil;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = null;
        lwjgl3ApplicationConfiguration1.fullscreenMode = lwjgl3DisplayMode15;
        boolean boolean17 = lwjgl3ApplicationConfiguration1.disableAudio;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test12048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12048");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        int int9 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16);
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-1077952513);
        lwjgl3ApplicationConfiguration0.setwindowX(483965280);
        int int18 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test12049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12049");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        lwjgl3ApplicationConfiguration12.setwindowHeight((-2147099648));
        lwjgl3ApplicationConfiguration12.setdepth((-1644162816));
        lwjgl3ApplicationConfiguration12.title = "8000ff00";
        lwjgl3ApplicationConfiguration12.setBackBufferConfig((-620849664), 30426, 64784, (-176009952), 16, (-238034928), (-844509056));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test12050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12050");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        int int6 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, 8925);
        com.badlogic.gdx.graphics.Color color13 = color0.sub((float) 167772160, (float) (-100466688), (float) 0, (float) (-164075620));
        com.badlogic.gdx.graphics.Color color18 = color13.set((float) 5242880, 0.98039216f, (float) 1535, (float) (byte) 100);
        float float19 = color13.a;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-16711936) + "'", int6 == (-16711936));
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }

    @Test
    public void test12051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12051");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-4090624), (float) (-1034), (float) (-1048832), (float) (-7536641));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-6.5271836E35f) + "'", float4 == (-6.5271836E35f));
    }

    @Test
    public void test12052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12052");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        int int9 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = lwjgl3ApplicationConfiguration0.windowListener;
        int int13 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1514), 4414625);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test12053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12053");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color22 = color19.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.SKY;
        color23.g = 0L;
        com.badlogic.gdx.graphics.Color color26 = color22.mul(color23);
        com.badlogic.gdx.graphics.Color color28 = color26.set(6349110);
        color28.a = 509920;
        color28.g = (-327680);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test12054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12054");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.windowMinWidth = 8925;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(163200, 16776961, (int) '#', (-15), (-2147413088), 2, 131);
        lwjgl3ApplicationConfiguration0.setAudioConfig(167772160, (-8257792), (-90112));
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test12055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12055");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setwindowX((int) (short) -1);
        int int7 = lwjgl3ApplicationConfiguration1.windowWidth;
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        com.badlogic.gdx.graphics.Color color14 = color12.mul((float) 16777216);
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color14;
        boolean boolean16 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setuseGL30(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 640 + "'", int7 == 640);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test12056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12056");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.windowResizable;
        lwjgl3ApplicationConfiguration1.disableAudio = false;
        boolean boolean7 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        int int8 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        int int9 = lwjgl3ApplicationConfiguration1.getwindowHeight();
        lwjgl3ApplicationConfiguration1.windowMinWidth = 3309388;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
    }

    @Test
    public void test12057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12057");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color4);
        float float22 = color21.a;
        com.badlogic.gdx.graphics.Color color23 = color21.cpy();
        int int24 = com.badlogic.gdx.graphics.Color.argb8888(color23);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color23);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color25);
        int int27 = com.badlogic.gdx.graphics.Color.rgba8888(color26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test12058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12058");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(512);
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12059");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (-256);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = 765;
        lwjgl3ApplicationConfiguration1.setTitle("ffffff00");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = lwjgl3ApplicationConfiguration1.hdpiMode;
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test12060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12060");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.stencil = 10;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color9;
        com.badlogic.gdx.graphics.Color color15 = color9.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color9, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.b = 480;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        int int26 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
    }

    @Test
    public void test12061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12061");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12062");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-38784), (float) (-5375136), 0.0f, (float) (-17690880));
    }

    @Test
    public void test12063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12063");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration1.stencil = 10;
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color5;
        com.badlogic.gdx.graphics.Color color11 = color5.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color15 = color5.lerp(color13, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color15, (-545421065));
        color15.a = 1L;
        com.badlogic.gdx.graphics.Color color24 = color15.mul((float) (-10223606), (float) (-40036), (float) 100, (float) (-16711681));
        com.badlogic.gdx.graphics.Color color29 = color15.sub((float) (-864551100), (float) 1L, (float) 'a', (float) (-16711936));
        com.badlogic.gdx.graphics.Color color31 = color0.lerp(color15, (float) (byte) 0);
        com.badlogic.gdx.graphics.Color color33 = color31.set((-2105736960));
        com.badlogic.gdx.graphics.Color color34 = color33.clamp();
        com.badlogic.gdx.graphics.Color color39 = color33.set((float) (-30218), (float) 252, (float) (byte) -1, (float) 41851);
        com.badlogic.gdx.graphics.Color color44 = color39.sub((float) (-117620736), (-1.7013988E38f), (float) (-1011534592), (float) 117436161);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color44);
    }

    @Test
    public void test12064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12064");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-12);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12065");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 512;
        lwjgl3ApplicationConfiguration0.setWindowPosition(3, 16711680);
        lwjgl3ApplicationConfiguration0.setwindowY((-250615296));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-972423168);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int26 = lwjgl3ApplicationConfiguration17.gles30ContextMajorVersion;
        int int27 = lwjgl3ApplicationConfiguration17.getgles30ContextMajorVersion();
        int int28 = lwjgl3ApplicationConfiguration17.getsamples();
        int int29 = lwjgl3ApplicationConfiguration17.windowMinHeight;
        lwjgl3ApplicationConfiguration17.setWindowPosition((-1077952513), (-545421065));
        com.badlogic.gdx.Files.FileType fileType33 = lwjgl3ApplicationConfiguration17.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffff80ff", fileType33);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + fileType33 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType33.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12066");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.title;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int13 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (short) 100);
        int int16 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test12067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12067");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-658670879), (-511966464), (-33390592), 6156);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-7.953768E36f) + "'", float4 == (-7.953768E36f));
    }

    @Test
    public void test12068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12068");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        boolean boolean7 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test12069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12069");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.setResizable(true);
        lwjgl3ApplicationConfiguration1.windowMinWidth = (-654724064);
        lwjgl3ApplicationConfiguration1.a = (-255);
        lwjgl3ApplicationConfiguration1.g = (-644874240);
        int int15 = lwjgl3ApplicationConfiguration1.windowX;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test12070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12070");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.stencil = 20480;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12071");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.r = 8;
        lwjgl3ApplicationConfiguration0.windowHeight = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.stencil = 10;
        int int10 = lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = null;
        lwjgl3ApplicationConfiguration7.hdpiMode = hdpiMode11;
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = null;
        lwjgl3ApplicationConfiguration7.hdpiMode = hdpiMode15;
        boolean boolean17 = lwjgl3ApplicationConfiguration7.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = null;
        lwjgl3ApplicationConfiguration7.fullscreenMode = lwjgl3DisplayMode18;
        lwjgl3ApplicationConfiguration7.setWindowPosition((int) (byte) 0, 130029600);
        com.badlogic.gdx.Files.FileType fileType24 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("d2b48cff", fileType24);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType24);
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(251658240, 1519722240, 63456, (-1469452288), (-2105697536), 640, (-151));
        int int37 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + fileType24 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType24.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test12072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12072");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.setWindowedMode((-2147483648), 7680);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "d2b48cff";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        int int14 = lwjgl3ApplicationConfiguration11.depth;
        int int15 = lwjgl3ApplicationConfiguration11.stencil;
        lwjgl3ApplicationConfiguration11.gles30ContextMajorVersion = (-16580607);
        boolean boolean18 = lwjgl3ApplicationConfiguration11.disableAudio;
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration11.initialBackgroundColor;
        color19.g = (-1.7013599E38f);
        com.badlogic.gdx.graphics.Color color26 = color19.add((float) 40664886, (float) 1621098495, (float) 0L, (float) (-864551100));
        com.badlogic.gdx.graphics.Color color31 = color19.mul((-1.7013599E38f), (-1.1841958E21f), (float) 480, (float) 514080);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.GOLD;
        color32.r = 'a';
        com.badlogic.gdx.graphics.Color color35 = color19.sub(color32);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color42 = color37.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color43 = color42.clamp();
        int int44 = com.badlogic.gdx.graphics.Color.rgb888(color43);
        com.badlogic.gdx.graphics.Color color46 = color19.lerp(color43, (float) (-164075620));
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color43);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 1157627903;
        int int50 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int51 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 65535 + "'", int44 == 65535);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 9 + "'", int50 == 9);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
    }

    @Test
    public void test12073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12073");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1077952513), (float) (-255), (float) 267782144, (float) (-256));
        int int5 = com.badlogic.gdx.graphics.Color.rgb565(color4);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, (-9180));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
    }

    @Test
    public void test12074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12074");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(65295);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setdepth((-15724560));
    }

    @Test
    public void test12075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12075");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color14, 16);
        color14.a = 0L;
        com.badlogic.gdx.graphics.Color color19 = color12.mul(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration20.initialBackgroundColor = color24;
        int int26 = com.badlogic.gdx.graphics.Color.rgb888(color24);
        boolean boolean28 = color24.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.stencil = 10;
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration29.initialBackgroundColor = color33;
        com.badlogic.gdx.graphics.Color color39 = color33.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color40 = color24.mul(color39);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color39);
        com.badlogic.gdx.graphics.Color color42 = color14.set(color41);
        com.badlogic.gdx.graphics.Color color43 = color10.set(color41);
        int int44 = com.badlogic.gdx.graphics.Color.rgb565(color10);
        com.badlogic.gdx.graphics.Color color50 = color10.lerp((float) 3309388, (float) (-65281), 0.98039216f, (-4.253984E37f), (float) (-8160));
        com.badlogic.gdx.graphics.Color color51 = color10.clamp();
        int int52 = color10.toIntBits();
        color10.b = 1519776768;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color10, 230);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 65535 + "'", int44 == 65535);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-256) + "'", int52 == (-256));
    }

    @Test
    public void test12076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12076");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.setWindowedMode((-2147483648), 7680);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "d2b48cff";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        int int14 = lwjgl3ApplicationConfiguration11.depth;
        int int15 = lwjgl3ApplicationConfiguration11.stencil;
        lwjgl3ApplicationConfiguration11.gles30ContextMajorVersion = (-16580607);
        boolean boolean18 = lwjgl3ApplicationConfiguration11.disableAudio;
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration11.initialBackgroundColor;
        color19.g = (-1.7013599E38f);
        com.badlogic.gdx.graphics.Color color26 = color19.add((float) 40664886, (float) 1621098495, (float) 0L, (float) (-864551100));
        com.badlogic.gdx.graphics.Color color31 = color19.mul((-1.7013599E38f), (-1.1841958E21f), (float) 480, (float) 514080);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.GOLD;
        color32.r = 'a';
        com.badlogic.gdx.graphics.Color color35 = color19.sub(color32);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color42 = color37.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color43 = color42.clamp();
        int int44 = com.badlogic.gdx.graphics.Color.rgb888(color43);
        com.badlogic.gdx.graphics.Color color46 = color19.lerp(color43, (float) (-164075620));
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color43);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 1157627903;
        int int50 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setwindowX(586415136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 65535 + "'", int44 == 65535);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 7680 + "'", int50 == 7680);
    }

    @Test
    public void test12077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12077");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        int int1 = com.badlogic.gdx.graphics.Color.rgba8888(color0);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((float) 63488, (-1.7014117E38f), (float) (-2147413088), (float) (-62876));
        com.badlogic.gdx.graphics.Color color7 = color0.sub(color6);
        int int8 = com.badlogic.gdx.graphics.Color.rgb565(color0);
        com.badlogic.gdx.graphics.Color color9 = color0.premultiplyAlpha();
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-837943127) + "'", int1 == (-837943127));
        org.junit.Assert.assertNotNull(color7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test12078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12078");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-122880), (float) 8586486, 2.2775203E-38f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-256) + "'", int3 == (-256));
    }

    @Test
    public void test12079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12079");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.windowMinWidth = 509920;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        int int16 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.g = 1900764;
        int int19 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test12080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12080");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration14.setaudioDeviceBufferSize((-16764024));
        lwjgl3ApplicationConfiguration14.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.stencil = 10;
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration19.initialBackgroundColor = color23;
        lwjgl3ApplicationConfiguration19.b = (byte) 0;
        lwjgl3ApplicationConfiguration19.setwindowResizable(true);
        lwjgl3ApplicationConfiguration19.gles30ContextMinorVersion = ' ';
        lwjgl3ApplicationConfiguration19.windowMinHeight = 40664886;
        lwjgl3ApplicationConfiguration19.setwindowX(537535241);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration19.setFullscreenMode(displayMode35);
        int int37 = lwjgl3ApplicationConfiguration19.getdepth();
        int int38 = lwjgl3ApplicationConfiguration19.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration19.setWindowListener(lwjgl3WindowListener39);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.stencil = 10;
        int int44 = lwjgl3ApplicationConfiguration41.depth;
        int int45 = lwjgl3ApplicationConfiguration41.stencil;
        int int46 = lwjgl3ApplicationConfiguration41.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = null;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode47);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode49 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration41.hdpiMode = hdpiMode49;
        lwjgl3ApplicationConfiguration19.hdpiMode = hdpiMode49;
        lwjgl3ApplicationConfiguration14.hdpiMode = hdpiMode49;
        java.lang.String str53 = lwjgl3ApplicationConfiguration14.title;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 16 + "'", int37 == 16);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 16 + "'", int38 == 16);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 16 + "'", int44 == 16);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test12081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12081");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CHARTREUSE;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color2, (-864551100));
        float float5 = color2.g;
        int int6 = com.badlogic.gdx.graphics.Color.argb8888(color2);
        float float7 = color2.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration8.stencil = 10;
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration8.initialBackgroundColor = color12;
        int int14 = com.badlogic.gdx.graphics.Color.rgb888(color12);
        boolean boolean16 = color12.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color21;
        com.badlogic.gdx.graphics.Color color27 = color21.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color28 = color12.mul(color27);
        com.badlogic.gdx.graphics.Color color29 = color27.premultiplyAlpha();
        float float30 = color27.b;
        float float31 = color27.toFloatBits();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color27, (-8257792));
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color37, 16);
        color37.a = 0L;
        com.badlogic.gdx.graphics.Color color42 = color35.mul(color37);
        com.badlogic.gdx.graphics.Color color47 = color35.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color color49 = color35.set((int) (byte) -1);
        com.badlogic.gdx.graphics.Color color50 = color35.clamp();
        float float51 = color50.toFloatBits();
        com.badlogic.gdx.graphics.Color color52 = color27.sub(color50);
        com.badlogic.gdx.graphics.Color color53 = color2.sub(color50);
        com.badlogic.gdx.graphics.Color color54 = color50.cpy();
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color(color54);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color54, (-62876));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.9206349f + "'", float5 == 0.9206349f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-5600) + "'", int6 == (-5600));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-5.347416E37f) + "'", float7 == (-5.347416E37f));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-1.7014117E38f) + "'", float51 == (-1.7014117E38f));
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color54);
    }

    @Test
    public void test12082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12082");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int11 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration12.useVsync(true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test12083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12083");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000000";
        int int11 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.title = "";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test12084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12084");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int13 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '#');
        lwjgl3ApplicationConfiguration0.setsamples((-4084));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
    }

    @Test
    public void test12085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12085");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-256);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        int int12 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
    }

    @Test
    public void test12086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12086");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.samples = 480;
        lwjgl3ApplicationConfiguration0.setAudioConfig(31, 765, (-268435536));
        lwjgl3ApplicationConfiguration0.windowWidth = (-518062050);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12087");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.stencil = 10;
        int int13 = lwjgl3ApplicationConfiguration10.b;
        boolean boolean14 = lwjgl3ApplicationConfiguration10.vSyncEnabled;
        lwjgl3ApplicationConfiguration10.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType17 = lwjgl3ApplicationConfiguration10.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType17;
        int int19 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.samples = 16766720;
        lwjgl3ApplicationConfiguration0.setWindowPosition(18005600, (-64));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + fileType17 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType17.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test12088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12088");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) (-62876));
        color3.a = 16711680;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.stencil = 10;
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration6.initialBackgroundColor = color10;
        int int12 = com.badlogic.gdx.graphics.Color.rgb888(color10);
        boolean boolean14 = color10.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.stencil = 10;
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color19;
        com.badlogic.gdx.graphics.Color color25 = color19.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color26 = color10.mul(color25);
        com.badlogic.gdx.graphics.Color color28 = color25.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color color30 = color3.lerp(color28, (-1.5399916E-33f));
        com.badlogic.gdx.graphics.Color color31 = color3.cpy();
        color31.a = 862994742;
        com.badlogic.gdx.graphics.Color color38 = color31.sub((float) 7048739, (float) 862994742, (float) (-8658177), (float) (-990777344));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color31, (-2070550656));
        color31.g = 0.0f;
        com.badlogic.gdx.graphics.Color color44 = color31.set(1677721600);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color44);
    }

    @Test
    public void test12089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12089");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888(0.0f, (-1.6915107E38f), (float) (-4466532), (float) (-1081158672));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1664909312) + "'", int4 == (-1664909312));
    }

    @Test
    public void test12090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12090");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setTitle("");
        lwjgl3ApplicationConfiguration1.setAudioConfig((-10223606), (int) (byte) 0, (-16711936));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int12 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration1.windowListener = lwjgl3WindowListener13;
        lwjgl3ApplicationConfiguration1.windowHeight = 483965280;
        int int17 = lwjgl3ApplicationConfiguration1.samples;
        int int18 = lwjgl3ApplicationConfiguration1.depth;
        lwjgl3ApplicationConfiguration1.setgles30ContextMajorVersion(37670);
        lwjgl3ApplicationConfiguration1.windowY = 862994742;
        lwjgl3ApplicationConfiguration1.windowMinWidth = 0;
        int int25 = lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10223606) + "'", int12 == (-10223606));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test12091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12091");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-57361), (-1671024128), (-14816), (-208));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-57361) + "'", int4 == (-57361));
    }

    @Test
    public void test12092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12092");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-1077936368), (int) (short) 100);
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setTitle("0000faff");
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        com.badlogic.gdx.graphics.Color color16 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        boolean boolean17 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test12093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12093");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-116391936));
    }

    @Test
    public void test12094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12094");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        int int5 = lwjgl3ApplicationConfiguration1.samples;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SALMON;
        float float7 = color6.r;
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color6;
        lwjgl3ApplicationConfiguration1.a = 509920;
        boolean boolean11 = lwjgl3ApplicationConfiguration1.windowDecorated;
        java.lang.Class<?> wildcardClass12 = lwjgl3ApplicationConfiguration1.getClass();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
// flaky:         org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12095");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int10 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int13 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
    }

    @Test
    public void test12096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12096");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.stencil = 10;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color9;
        com.badlogic.gdx.graphics.Color color15 = color9.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color9, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.b = 480;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test12097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12097");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 0);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-65280));
        int int15 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int16 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-262352);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
    }

    @Test
    public void test12098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12098");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color22 = color19.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.SKY;
        color23.g = 0L;
        com.badlogic.gdx.graphics.Color color26 = color22.mul(color23);
        com.badlogic.gdx.graphics.Color color28 = color26.set(6349110);
        com.badlogic.gdx.graphics.Color color30 = color28.set((-45312));
        com.badlogic.gdx.graphics.Color color31 = color30.clamp();
        color31.g = 634911;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration34.setwindowResizable(false);
        lwjgl3ApplicationConfiguration34.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration34.gles30ContextMajorVersion = 0;
        int int49 = lwjgl3ApplicationConfiguration34.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration51.stencil = 10;
        int int54 = lwjgl3ApplicationConfiguration51.depth;
        lwjgl3ApplicationConfiguration51.windowX = (short) 100;
        lwjgl3ApplicationConfiguration51.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType60 = lwjgl3ApplicationConfiguration51.getpreferencesFileType();
        int int61 = lwjgl3ApplicationConfiguration51.getwindowY();
        lwjgl3ApplicationConfiguration51.samples = 512;
        com.badlogic.gdx.graphics.Color color64 = lwjgl3ApplicationConfiguration51.initialBackgroundColor;
        int int65 = lwjgl3ApplicationConfiguration51.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode66 = lwjgl3ApplicationConfiguration51.hdpiMode;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration50.setResizable(true);
        boolean boolean70 = color31.equals((java.lang.Object) lwjgl3ApplicationConfiguration50);
        com.badlogic.gdx.graphics.Color color75 = color31.sub(0.0f, (float) 2097056, (float) 1627389952, (float) (-458762));
        java.lang.Class<?> wildcardClass76 = color75.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 16 + "'", int54 == 16);
        org.junit.Assert.assertTrue("'" + fileType60 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType60.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode66 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode66.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(color75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test12099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12099");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration2.windowMaxHeight = (-16580607);
        int int5 = lwjgl3ApplicationConfiguration2.r;
        lwjgl3ApplicationConfiguration2.setWindowedMode((-4089), (-10224128));
        boolean boolean9 = lwjgl3ApplicationConfiguration2.getuseGL30();
        lwjgl3ApplicationConfiguration2.setTitle("827d0100");
        lwjgl3ApplicationConfiguration2.useGL30 = false;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12100");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        int int7 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test12101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12101");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setwindowWidth((-40036));
        int int13 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.windowHeight = (-15);
        int int16 = lwjgl3ApplicationConfiguration0.samples;
        int int17 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test12102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12102");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-143104);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int18 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test12103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12103");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-52320), (float) (-227328), (-7.098843E32f), (-8.952473E30f));
        float float5 = color4.toFloatBits();
        int int6 = com.badlogic.gdx.graphics.Color.argb8888(color4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test12104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12104");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setsamples((-255));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.title = "ff00000a";
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-536870912));
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-48128), 17392, 16777214, (-415027232));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12105");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setwindowY(8);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.windowX = 537535241;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.stencil = (-1838841856);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test12106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12106");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CHARTREUSE;
        float float1 = color0.r;
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration4);
        lwjgl3ApplicationConfiguration5.setvSyncEnabled(false);
        boolean boolean8 = lwjgl3ApplicationConfiguration5.getuseGL30();
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color12, 16);
        color12.a = 0L;
        com.badlogic.gdx.graphics.Color color17 = color10.mul(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.stencil = 10;
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration18.initialBackgroundColor = color22;
        int int24 = com.badlogic.gdx.graphics.Color.rgb888(color22);
        boolean boolean26 = color22.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.stencil = 10;
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration27.initialBackgroundColor = color31;
        com.badlogic.gdx.graphics.Color color37 = color31.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color38 = color22.mul(color37);
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color37);
        com.badlogic.gdx.graphics.Color color40 = color12.set(color39);
        lwjgl3ApplicationConfiguration5.setInitialBackgroundColor(color40);
        com.badlogic.gdx.graphics.Color color42 = color3.add(color40);
        com.badlogic.gdx.graphics.Color color47 = color40.mul((float) 640, (float) (-2147418368), (float) 100, (float) (-52344));
        com.badlogic.gdx.graphics.Color color52 = color40.set((float) 634911, 0.0f, 0.0f, (float) (-2147413088));
        com.badlogic.gdx.graphics.Color color57 = color40.add((float) 16197090, (float) (-36880), (float) (-8943616), (float) (-45312));
        com.badlogic.gdx.graphics.Color color58 = color0.mul(color57);
        com.badlogic.gdx.graphics.Color color59 = color58.premultiplyAlpha();
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color59);
    }

    @Test
    public void test12107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12107");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color4.lerp(color12, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color12, 34816);
        color12.b = 2.2775203E-38f;
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test12108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12108");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(4095);
    }

    @Test
    public void test12109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12109");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.windowMinWidth = 509920;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.stencil = 10;
        int int18 = lwjgl3ApplicationConfiguration15.depth;
        int int19 = lwjgl3ApplicationConfiguration15.stencil;
        int int20 = lwjgl3ApplicationConfiguration15.getwindowY();
        lwjgl3ApplicationConfiguration15.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration15.setwindowMinWidth(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        int int28 = lwjgl3ApplicationConfiguration25.b;
        boolean boolean29 = lwjgl3ApplicationConfiguration25.vSyncEnabled;
        lwjgl3ApplicationConfiguration25.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType32 = lwjgl3ApplicationConfiguration25.getpreferencesFileType();
        lwjgl3ApplicationConfiguration15.preferencesFileType = fileType32;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType32);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        lwjgl3ApplicationConfiguration0.a = (-1077936368);
        lwjgl3ApplicationConfiguration0.setsamples(572710365);
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-2147482368);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12110");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color22 = color19.mul((float) (short) 1);
        float float23 = color19.r;
        color19.g = 0.0f;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color29, 16);
        color29.a = 0L;
        com.badlogic.gdx.graphics.Color color34 = color27.mul(color29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration35.stencil = 10;
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration35.initialBackgroundColor = color39;
        int int41 = com.badlogic.gdx.graphics.Color.rgb888(color39);
        boolean boolean43 = color39.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration44.stencil = 10;
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration44.initialBackgroundColor = color48;
        com.badlogic.gdx.graphics.Color color54 = color48.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color55 = color39.mul(color54);
        com.badlogic.gdx.graphics.Color color56 = new com.badlogic.gdx.graphics.Color(color54);
        com.badlogic.gdx.graphics.Color color57 = color29.set(color56);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration58.stencil = 10;
        int int61 = lwjgl3ApplicationConfiguration58.depth;
        lwjgl3ApplicationConfiguration58.windowX = (short) 100;
        lwjgl3ApplicationConfiguration58.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration67 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration58);
        int int68 = lwjgl3ApplicationConfiguration67.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration67.setDecorated(false);
        boolean boolean71 = color29.equals((java.lang.Object) false);
        int int72 = com.badlogic.gdx.graphics.Color.rgba4444(color29);
        com.badlogic.gdx.graphics.Color color74 = color19.lerp(color29, (float) 16711680);
        color29.r = (-20224);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 16 + "'", int61 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 16 + "'", int68 == 16);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 65520 + "'", int72 == 65520);
        org.junit.Assert.assertNotNull(color74);
    }

    @Test
    public void test12111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12111");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration1.setdisableAudio(true);
        lwjgl3ApplicationConfiguration1.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color15;
        int int17 = com.badlogic.gdx.graphics.Color.rgb888(color15);
        boolean boolean19 = color15.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration20.initialBackgroundColor = color24;
        com.badlogic.gdx.graphics.Color color30 = color24.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color31 = color15.mul(color30);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color15, (int) (byte) 10);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color15);
        boolean boolean35 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = lwjgl3ApplicationConfiguration1.hdpiMode;
        com.badlogic.gdx.Files.FileType fileType37 = lwjgl3ApplicationConfiguration1.preferencesFileType;
        lwjgl3ApplicationConfiguration1.setWindowPosition((-16838768), (-63488));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.stencil = 10;
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration41.initialBackgroundColor = color45;
        com.badlogic.gdx.graphics.Color color51 = color45.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color52 = color45.clamp();
        int int53 = com.badlogic.gdx.graphics.Color.rgb888(color45);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color45);
        int int55 = lwjgl3ApplicationConfiguration1.a;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + fileType37 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType37.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 16777215 + "'", int53 == 16777215);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 8 + "'", int55 == 8);
    }

    @Test
    public void test12112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12112");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.stencil = 10;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration12.initialBackgroundColor = color16;
        int int18 = com.badlogic.gdx.graphics.Color.rgb888(color16);
        boolean boolean20 = color16.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.stencil = 10;
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration21.initialBackgroundColor = color25;
        com.badlogic.gdx.graphics.Color color31 = color25.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color32 = color16.mul(color31);
        com.badlogic.gdx.graphics.Color color33 = color31.premultiplyAlpha();
        color31.g = 537535241;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color31;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(40664886);
        lwjgl3ApplicationConfiguration0.stencil = 2;
        lwjgl3ApplicationConfiguration0.windowWidth = (-16777116);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test12113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12113");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration1.windowHeight = 9;
        boolean boolean6 = lwjgl3ApplicationConfiguration1.windowDecorated;
        int int7 = lwjgl3ApplicationConfiguration1.windowHeight;
        lwjgl3ApplicationConfiguration1.useGL30 = true;
        int int10 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferSize();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test12114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12114");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 480, (float) 537535241, (float) 10, 1.96271E-40f);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color4, 224);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((float) 10, (float) (-2147483648), (float) 267782144, (-5.0593836E30f));
        com.badlogic.gdx.graphics.Color color13 = color4.lerp(color11, (float) (-2144));
        int int14 = com.badlogic.gdx.graphics.Color.rgb565(color13);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color13, (-9));
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test12115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12115");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CORAL;
        int int1 = color0.toIntBits();
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color8 = color0.lerp((float) (short) 100, (float) (-12), 100.0f, 0.0f, (float) 52625);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color14 = color9.add((float) (-2245888), (float) (-352419840), (float) (-92044800), (-1.6225877E33f));
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12517631 + "'", int1 == 12517631);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test12116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12116");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode14);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int18 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test12117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12117");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-5543167), (-458762));
        lwjgl3ApplicationConfiguration0.setdepth(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        int int28 = lwjgl3ApplicationConfiguration25.depth;
        java.lang.String str29 = lwjgl3ApplicationConfiguration25.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.stencil = 10;
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration30.initialBackgroundColor = color34;
        com.badlogic.gdx.graphics.Color color40 = color34.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color34, (int) (byte) 1);
        lwjgl3ApplicationConfiguration25.initialBackgroundColor = color34;
        boolean boolean44 = lwjgl3ApplicationConfiguration25.windowDecorated;
        lwjgl3ApplicationConfiguration25.setAudioConfig((int) (short) 10, 765, 0);
        lwjgl3ApplicationConfiguration25.setpreferencesDirectory("");
        boolean boolean51 = lwjgl3ApplicationConfiguration25.getvSyncEnabled();
        com.badlogic.gdx.Files.FileType fileType52 = lwjgl3ApplicationConfiguration25.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("8b4513ff", fileType52);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 8420355;
        int int56 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setsamples(587137024);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration59.stencil = 10;
        int int62 = lwjgl3ApplicationConfiguration59.depth;
        boolean boolean63 = lwjgl3ApplicationConfiguration59.vSyncEnabled;
        lwjgl3ApplicationConfiguration59.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode66 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration59.hdpiMode = hdpiMode66;
        lwjgl3ApplicationConfiguration59.b = 401539072;
        boolean boolean70 = lwjgl3ApplicationConfiguration59.vSyncEnabled;
        boolean boolean71 = lwjgl3ApplicationConfiguration59.windowResizable;
        int int72 = lwjgl3ApplicationConfiguration59.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode73 = lwjgl3ApplicationConfiguration59.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode73);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16 + "'", int28 == 16);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + fileType52 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType52.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 16 + "'", int62 == 16);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode66 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode66.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 401539072 + "'", int72 == 401539072);
        org.junit.Assert.assertTrue("'" + hdpiMode73 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode73.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test12118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12118");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 4414625, (float) (-240), (float) (-8943616), (float) (-1L));
    }

    @Test
    public void test12119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12119");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.getwindowY();
        int int7 = lwjgl3ApplicationConfiguration1.samples;
        int int8 = lwjgl3ApplicationConfiguration1.stencil;
        lwjgl3ApplicationConfiguration1.setwindowY(0);
        int int11 = lwjgl3ApplicationConfiguration1.stencil;
        lwjgl3ApplicationConfiguration1.setwindowDecorated(false);
        int int14 = lwjgl3ApplicationConfiguration1.getwindowY();
        boolean boolean15 = lwjgl3ApplicationConfiguration1.getwindowDecorated();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test12120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12120");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        int int6 = lwjgl3ApplicationConfiguration1.windowMaxHeight;
        int int7 = lwjgl3ApplicationConfiguration1.getwindowX();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        int int10 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        int int11 = lwjgl3ApplicationConfiguration1.a;
        lwjgl3ApplicationConfiguration1.b = 1606278944;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test12121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12121");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration1.windowY = (byte) -1;
        int int18 = lwjgl3ApplicationConfiguration1.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration1.title = "00ffff00";
        int int21 = lwjgl3ApplicationConfiguration1.getdepth();
        lwjgl3ApplicationConfiguration1.setwindowX(32256);
        lwjgl3ApplicationConfiguration1.setWindowSizeLimits((-116), 53248, 537535241, 0);
        lwjgl3ApplicationConfiguration1.disableAudio = true;
        lwjgl3ApplicationConfiguration1.setWindowedMode((-4466532), (-200550592));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
    }

    @Test
    public void test12122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12122");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = color19.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color27 = color22.sub((-1.0f), (float) 9, (-1.6473633E38f), (float) 16777215);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color((float) 2550, (float) (-503341578), (float) 1671172080, (-5.875603E37f));
        color32.r = (-66978332);
        com.badlogic.gdx.graphics.Color color35 = color22.set(color32);
        int int36 = color22.toIntBits();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2130771968) + "'", int36 == (-2130771968));
    }

    @Test
    public void test12123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12123");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowX((-5898496));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3DisplayMode11);
    }

    @Test
    public void test12124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12124");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        int int10 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        int int11 = lwjgl3ApplicationConfiguration1.depth;
        lwjgl3ApplicationConfiguration1.setdisableAudio(true);
        boolean boolean14 = lwjgl3ApplicationConfiguration1.vSyncEnabled;
        boolean boolean15 = lwjgl3ApplicationConfiguration1.getwindowResizable();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test12125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12125");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-65025);
        lwjgl3ApplicationConfiguration0.b = 'a';
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getuseGL30();
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setwindowY((-157286400));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test12126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12126");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int4 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener5;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode7 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode7;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        int int11 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test12127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12127");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType5;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration7.setwindowResizable(false);
        int int18 = lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion;
        int int19 = lwjgl3ApplicationConfiguration7.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration7.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.stencil = 10;
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration22.initialBackgroundColor = color26;
        lwjgl3ApplicationConfiguration22.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration22.setFullscreenMode(displayMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        int int33 = lwjgl3ApplicationConfiguration22.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration22.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration7.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode36;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        int int42 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color((-36577280));
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color44);
        lwjgl3ApplicationConfiguration0.g = 36861;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
    }

    @Test
    public void test12128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12128");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        int int5 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int6 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(61440);
        java.lang.Class<?> wildcardClass9 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 640 + "'", int5 == 640);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test12129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12129");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.stencil = 10;
        int int15 = lwjgl3ApplicationConfiguration12.b;
        boolean boolean16 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        lwjgl3ApplicationConfiguration12.setResizable(true);
        lwjgl3ApplicationConfiguration12.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        lwjgl3ApplicationConfiguration22.setWindowPosition((int) (short) 10, 10);
        boolean boolean26 = lwjgl3ApplicationConfiguration22.useGL30;
        com.badlogic.gdx.Files.FileType fileType27 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType27);
        com.badlogic.gdx.Files.FileType fileType29 = lwjgl3ApplicationConfiguration22.getpreferencesFileType();
        lwjgl3ApplicationConfiguration12.setpreferencesFileType(fileType29);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType29;
        int int32 = lwjgl3ApplicationConfiguration0.windowX;
        int int33 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int36 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType29 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType29.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test12130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12130");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-2140955648), 0.0f, (float) (-1480550400), (float) 1519722240);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
    }

    @Test
    public void test12131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12131");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = 765;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    }

    @Test
    public void test12132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12132");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 16);
        color3.a = 0L;
        com.badlogic.gdx.graphics.Color color8 = color1.mul(color3);
        com.badlogic.gdx.graphics.Color color13 = color1.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        color1.g = (short) -1;
        com.badlogic.gdx.graphics.Color color16 = color1.premultiplyAlpha();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        int int20 = lwjgl3ApplicationConfiguration17.b;
        lwjgl3ApplicationConfiguration17.g = '#';
        com.badlogic.gdx.graphics.Color color23 = lwjgl3ApplicationConfiguration17.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color28, 16);
        color28.a = 0L;
        com.badlogic.gdx.graphics.Color color33 = color26.mul(color28);
        com.badlogic.gdx.graphics.Color color38 = color26.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color38, 33791);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color38);
        com.badlogic.gdx.graphics.Color color42 = color24.sub(color41);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color47, 16);
        color47.a = 0L;
        com.badlogic.gdx.graphics.Color color52 = color45.mul(color47);
        com.badlogic.gdx.graphics.Color color57 = color45.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color57, 33791);
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color(color57);
        com.badlogic.gdx.graphics.Color color61 = color43.sub(color60);
        com.badlogic.gdx.graphics.Color color62 = color41.set(color60);
        com.badlogic.gdx.graphics.Color color63 = color62.cpy();
        com.badlogic.gdx.graphics.Color color64 = color23.set(color62);
        com.badlogic.gdx.graphics.Color color65 = com.badlogic.gdx.graphics.Color.CHARTREUSE;
        com.badlogic.gdx.graphics.Color color66 = color64.mul(color65);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color64, 5959695);
        com.badlogic.gdx.graphics.Color color70 = color1.lerp(color64, (-2.14741837E9f));
        com.badlogic.gdx.graphics.Color color75 = color70.sub((float) (-150339737), (float) (-1445928036), (float) (-150339737), (float) (-990777344));
        int int76 = com.badlogic.gdx.graphics.Color.rgb888(color70);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(color66);
        org.junit.Assert.assertNotNull(color70);
        org.junit.Assert.assertNotNull(color75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 16777215 + "'", int76 == 16777215);
    }

    @Test
    public void test12133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12133");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        int int13 = lwjgl3ApplicationConfiguration12.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode14 = lwjgl3ApplicationConfiguration12.fullscreenMode;
        lwjgl3ApplicationConfiguration12.setWindowedMode((-2140996640), (int) 'a');
        int int18 = lwjgl3ApplicationConfiguration12.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration12.preferencesDirectory = "00200000";
        int int21 = lwjgl3ApplicationConfiguration12.a;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(lwjgl3DisplayMode14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test12134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12134");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.a = 3;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1077936368));
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-17040896), 14420470, 0, 4063);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
    }

    @Test
    public void test12135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12135");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 587202560, (float) (-288497664), (-1.7004772E38f), 0.0f);
    }

    @Test
    public void test12136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12136");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-16181535), (-979200), (-1579253505), 12312063);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6953597E38f) + "'", float4 == (-1.6953597E38f));
    }

    @Test
    public void test12137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12137");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        int int5 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setResizable(false);
        lwjgl3ApplicationConfiguration1.setdepth(0);
        boolean boolean10 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int12 = lwjgl3ApplicationConfiguration1.depth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        int int17 = lwjgl3ApplicationConfiguration14.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration14.hdpiMode = hdpiMode18;
        boolean boolean20 = lwjgl3ApplicationConfiguration14.getvSyncEnabled();
        boolean boolean21 = lwjgl3ApplicationConfiguration14.vSyncEnabled;
        lwjgl3ApplicationConfiguration14.disableAudio = false;
        lwjgl3ApplicationConfiguration14.b = (-1077952513);
        int int26 = lwjgl3ApplicationConfiguration14.windowMaxHeight;
        boolean boolean27 = lwjgl3ApplicationConfiguration14.windowDecorated;
        com.badlogic.gdx.Files.FileType fileType28 = lwjgl3ApplicationConfiguration14.getpreferencesFileType();
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("ef000000", fileType28);
        lwjgl3ApplicationConfiguration1.vSyncEnabled = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12138");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        int int15 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test12139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12139");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-16580607);
        lwjgl3ApplicationConfiguration0.title = "ffa5ff00";
        boolean boolean9 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test12140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12140");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int9 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.disableAudio;
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-50266112));
        lwjgl3ApplicationConfiguration0.b = (-5465700);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
    }

    @Test
    public void test12141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12141");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-15514229), (float) (-2147483648), (float) (byte) 1, 0.5137255f);
        float float5 = color4.b;
        float float6 = color4.g;
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test12142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12142");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-786496);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color13, 16);
        color13.a = 0L;
        com.badlogic.gdx.graphics.Color color18 = color11.mul(color13);
        com.badlogic.gdx.graphics.Color color23 = color11.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color color25 = color11.set((int) (byte) -1);
        float float26 = color25.a;
        color25.b = 16744959;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        int int30 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test12143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12143");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLD;
        color0.r = 'a';
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color5 = color3.mul(0.0f);
        color5.r = 1.0f;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color13 = color8.add((float) 52625, (-6.604906E36f), (-1.7013899E38f), (float) (-284884992));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color8, (-786496));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test12144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12144");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, (int) (byte) 0, (int) (byte) 100);
        int int13 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        boolean boolean14 = lwjgl3ApplicationConfiguration1.disableAudio;
        int int15 = lwjgl3ApplicationConfiguration1.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration1.windowHeight = (-1778519256);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color18;
        int int20 = lwjgl3ApplicationConfiguration1.audioDeviceBufferSize;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
    }

    @Test
    public void test12145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12145");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int11 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-307859744);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNull(lwjgl3WindowListener12);
    }

    @Test
    public void test12146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12146");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.g = (-1);
        int int16 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.NAVY;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color19;
        boolean boolean21 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 480 + "'", int16 == 480);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test12147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12147");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color22 = color19.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color19, 3);
        com.badlogic.gdx.graphics.Color color26 = color19.set((int) (short) 1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color26, (-40036));
        com.badlogic.gdx.graphics.Color color29 = color26.cpy();
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color29);
        color29.b = (-242);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color29);
    }

    @Test
    public void test12148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12148");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int13 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 40704;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test12149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12149");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-1579253505), (float) 1967136, (float) 972216, (-1.436333E20f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-2.5958258E23f) + "'", float4 == (-2.5958258E23f));
    }

    @Test
    public void test12150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12150");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        lwjgl3ApplicationConfiguration1.setWindowSizeLimits((int) (byte) -1, (int) (byte) -1, (int) (byte) 1, 40664886);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.stencil = 10;
        int int18 = lwjgl3ApplicationConfiguration15.depth;
        int int19 = lwjgl3ApplicationConfiguration15.stencil;
        int int20 = lwjgl3ApplicationConfiguration15.getwindowY();
        lwjgl3ApplicationConfiguration15.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration15.setwindowMinWidth(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        int int28 = lwjgl3ApplicationConfiguration25.b;
        boolean boolean29 = lwjgl3ApplicationConfiguration25.vSyncEnabled;
        lwjgl3ApplicationConfiguration25.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType32 = lwjgl3ApplicationConfiguration25.getpreferencesFileType();
        lwjgl3ApplicationConfiguration15.preferencesFileType = fileType32;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType32);
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferSize((-569376768));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = lwjgl3ApplicationConfiguration1.hdpiMode;
        int int38 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
        int int39 = lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode37 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode37.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
    }

    @Test
    public void test12151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12151");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.samples = 512;
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = lwjgl3ApplicationConfiguration0.hdpiMode;
        int int16 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.Files.FileType fileType17 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertTrue("'" + fileType17 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType17.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12152");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1465382614, (int) ' ');
        int int18 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.samples = 40664886;
        boolean boolean21 = lwjgl3ApplicationConfiguration0.windowDecorated;
        boolean boolean22 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.windowWidth = 585070592;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        int int28 = lwjgl3ApplicationConfiguration25.depth;
        lwjgl3ApplicationConfiguration25.windowX = (short) 100;
        lwjgl3ApplicationConfiguration25.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration25);
        int int35 = lwjgl3ApplicationConfiguration34.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration34.setWindowSizeLimits((-16), (-256), (-16777216), 0);
        int int41 = lwjgl3ApplicationConfiguration34.depth;
        int int42 = lwjgl3ApplicationConfiguration34.getwindowY();
        lwjgl3ApplicationConfiguration34.windowX = (-129024);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = lwjgl3ApplicationConfiguration34.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode45);
        int int47 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16 + "'", int28 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 16 + "'", int35 == 16);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 16 + "'", int41 == 16);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test12153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12153");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color15;
        float float17 = color15.toFloatBits();
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color15);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color18;
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) 1);
        int int22 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.b = (-1462239232);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
    }

    @Test
    public void test12154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12154");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-142049937));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test12155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12155");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        int int12 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-447780), 16712191, (-46648832), (-905969664), (int) (byte) 100, (-1011534592), (-1686966016));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test12156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12156");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int8 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.setWindowPosition(301989632, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test12157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12157");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode7;
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.g = (-164075620);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-134217944), (-503316225), (-2147099648), (-1671024128));
        lwjgl3ApplicationConfiguration0.depth = (-9);
        lwjgl3ApplicationConfiguration0.windowHeight = 16646400;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12158");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        java.lang.String str12 = lwjgl3ApplicationConfiguration11.preferencesDirectory;
        lwjgl3ApplicationConfiguration11.setwindowMinWidth(0);
        lwjgl3ApplicationConfiguration11.setuseGL30(true);
        lwjgl3ApplicationConfiguration11.windowWidth = 161902304;
        int int19 = lwjgl3ApplicationConfiguration11.audioDeviceSimultaneousSources;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test12159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12159");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2147481728));
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) (byte) 10, (float) 16711680, (float) (short) 0, (float) 224, (-1.7013599E38f));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration8.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration8.setwindowResizable(false);
        int int19 = lwjgl3ApplicationConfiguration8.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration20.initialBackgroundColor = color24;
        int int26 = com.badlogic.gdx.graphics.Color.rgb888(color24);
        boolean boolean28 = color24.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.stencil = 10;
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration29.initialBackgroundColor = color33;
        com.badlogic.gdx.graphics.Color color39 = color33.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color40 = color24.mul(color39);
        com.badlogic.gdx.graphics.Color color41 = color39.premultiplyAlpha();
        color39.g = 537535241;
        lwjgl3ApplicationConfiguration8.initialBackgroundColor = color39;
        int int45 = color39.toIntBits();
        com.badlogic.gdx.graphics.Color color47 = color7.lerp(color39, (-5.435091E37f));
        com.badlogic.gdx.graphics.Color color48 = color7.cpy();
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color(color48);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-256) + "'", int45 == (-256));
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color48);
    }

    @Test
    public void test12160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12160");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((-1.6972517E38f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test12161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12161");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.graphics.Color color12 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
    }

    @Test
    public void test12162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12162");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType9;
        java.lang.String str11 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.setdisableAudio(false);
        int int14 = lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration1.setWindowPosition((-142049825), 61440);
        lwjgl3ApplicationConfiguration1.windowWidth = (-2089026813);
        lwjgl3ApplicationConfiguration1.windowHeight = 16766720;
        lwjgl3ApplicationConfiguration1.setpreferencesDirectory("");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test12163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12163");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(480);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.OLIVE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1077936368), 0, (int) (short) 0);
        boolean boolean15 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-503341578);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration18);
        int int20 = lwjgl3ApplicationConfiguration19.samples;
        lwjgl3ApplicationConfiguration19.setwindowY(9);
        lwjgl3ApplicationConfiguration19.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration19.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int29 = lwjgl3ApplicationConfiguration28.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType31 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration28.setPreferencesConfig("", fileType31);
        lwjgl3ApplicationConfiguration19.setpreferencesFileType(fileType31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int36 = lwjgl3ApplicationConfiguration35.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = lwjgl3ApplicationConfiguration35.windowListener;
        int int39 = lwjgl3ApplicationConfiguration35.getsamples();
        com.badlogic.gdx.Files.FileType fileType40 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration35.preferencesFileType = fileType40;
        lwjgl3ApplicationConfiguration19.setPreferencesConfig("hi!", fileType40);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType40;
        int int44 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-15727136);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertTrue("'" + fileType31 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType31.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 512 + "'", int36 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration37);
        org.junit.Assert.assertNull(lwjgl3WindowListener38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + fileType40 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType40.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 480 + "'", int44 == 480);
    }

    @Test
    public void test12164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12164");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        int int12 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.stencil = (-52344);
        int int15 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(653051);
        int int18 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int20 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 480 + "'", int20 == 480);
    }

    @Test
    public void test12165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12165");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((-1.7010776E38f), 0.0f, (float) (-3776), (float) (-2113994752));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-246497280) + "'", int4 == (-246497280));
    }

    @Test
    public void test12166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12166");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.windowY = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration1.setwindowWidth((-15514229));
        lwjgl3ApplicationConfiguration1.setwindowMinWidth((-208));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int19 = lwjgl3ApplicationConfiguration18.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration18);
        boolean boolean21 = lwjgl3ApplicationConfiguration20.getdisableAudio();
        int int22 = lwjgl3ApplicationConfiguration20.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.stencil = 10;
        lwjgl3ApplicationConfiguration24.setwindowX((int) (short) 0);
        int int29 = lwjgl3ApplicationConfiguration24.getaudioDeviceBufferSize();
        boolean boolean30 = lwjgl3ApplicationConfiguration24.useGL30;
        lwjgl3ApplicationConfiguration24.windowMaxWidth = (-100466688);
        lwjgl3ApplicationConfiguration24.setwindowX((-237));
        com.badlogic.gdx.Files.FileType fileType35 = lwjgl3ApplicationConfiguration24.preferencesFileType;
        lwjgl3ApplicationConfiguration20.setPreferencesConfig("ffff0000", fileType35);
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType35;
        boolean boolean38 = lwjgl3ApplicationConfiguration1.windowDecorated;
        lwjgl3ApplicationConfiguration1.setuseGL30(true);
        boolean boolean41 = lwjgl3ApplicationConfiguration1.getvSyncEnabled();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + fileType35 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType35.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test12167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12167");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color2);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int7 = lwjgl3ApplicationConfiguration6.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("", fileType9);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00ffff00", fileType9);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12168");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration2);
        lwjgl3ApplicationConfiguration3.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration3.getuseGL30();
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color10, 16);
        color10.a = 0L;
        com.badlogic.gdx.graphics.Color color15 = color8.mul(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration16.initialBackgroundColor = color20;
        int int22 = com.badlogic.gdx.graphics.Color.rgb888(color20);
        boolean boolean24 = color20.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration25.initialBackgroundColor = color29;
        com.badlogic.gdx.graphics.Color color35 = color29.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color36 = color20.mul(color35);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(color35);
        com.badlogic.gdx.graphics.Color color38 = color10.set(color37);
        lwjgl3ApplicationConfiguration3.setInitialBackgroundColor(color38);
        com.badlogic.gdx.graphics.Color color40 = color1.add(color38);
        com.badlogic.gdx.graphics.Color color45 = color38.mul((float) 640, (float) (-2147418368), (float) 100, (float) (-52344));
        com.badlogic.gdx.graphics.Color color50 = color38.set((float) 634911, 0.0f, 0.0f, (float) (-2147413088));
        color38.r = (-1.7003146E38f);
        com.badlogic.gdx.graphics.Color color57 = new com.badlogic.gdx.graphics.Color((float) (-32), (float) (-29852), (float) (-7555886), (float) (-2089026813));
        com.badlogic.gdx.graphics.Color color59 = color38.lerp(color57, 6.1897002E29f);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color59);
    }

    @Test
    public void test12169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12169");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-2147413088), (-9.238233E37f), (float) (-637684704), 0.516129f);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (-535826687));
    }

    @Test
    public void test12170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12170");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = null;
        lwjgl3ApplicationConfiguration11.hdpiMode = hdpiMode12;
        lwjgl3ApplicationConfiguration11.setaudioDeviceSimultaneousSources((-369098752));
        int int16 = lwjgl3ApplicationConfiguration11.getwindowMinWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        int int18 = lwjgl3ApplicationConfiguration11.getaudioDeviceBufferCount();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test12171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12171");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.samples = 512;
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 6528502;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-2147418368), (-32), (-1047005184), 634911, 267782144, 130029600, 65280);
        lwjgl3ApplicationConfiguration0.setwindowWidth((-16776704));
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(16189951);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test12172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12172");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000000";
        lwjgl3ApplicationConfiguration0.windowY = 8;
        int int13 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ff0000ff";
        lwjgl3ApplicationConfiguration0.setwindowWidth((-266942944));
        int int18 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNull(lwjgl3WindowListener19);
    }

    @Test
    public void test12173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12173");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (byte) 1, (int) (short) 0, 16711680, (-10224128), (int) (byte) 100, 33791);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 1410392064;
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test12174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12174");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.windowMinWidth = 509920;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.stencil = 10;
        int int18 = lwjgl3ApplicationConfiguration15.depth;
        int int19 = lwjgl3ApplicationConfiguration15.stencil;
        int int20 = lwjgl3ApplicationConfiguration15.getwindowY();
        lwjgl3ApplicationConfiguration15.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration15.setwindowMinWidth(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        int int28 = lwjgl3ApplicationConfiguration25.b;
        boolean boolean29 = lwjgl3ApplicationConfiguration25.vSyncEnabled;
        lwjgl3ApplicationConfiguration25.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType32 = lwjgl3ApplicationConfiguration25.getpreferencesFileType();
        lwjgl3ApplicationConfiguration15.preferencesFileType = fileType32;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int37 = lwjgl3ApplicationConfiguration36.depth;
        int int38 = lwjgl3ApplicationConfiguration36.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration36.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration36.windowMaxWidth = (-1413507584);
        lwjgl3ApplicationConfiguration36.setsamples((-1020));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration35);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 16 + "'", int37 == 16);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
    }

    @Test
    public void test12175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12175");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.title = "ff000000";
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setTitle("00000000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-164075620));
        lwjgl3ApplicationConfiguration0.depth = (-4609);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test12176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12176");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-50331648));
        int int12 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.windowY = 33152;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test12177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12177");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-387200));
        com.badlogic.gdx.graphics.Color color6 = color1.sub((float) (-13200330), (float) (-835044), (float) (-634322729), (float) (-32));
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test12178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12178");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.0f, (float) (-2105736960), (float) 65536, (float) (-33488896));
        int int5 = com.badlogic.gdx.graphics.Color.rgb565(color4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.stencil = 10;
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration6.initialBackgroundColor = color10;
        int int12 = com.badlogic.gdx.graphics.Color.rgb888(color10);
        boolean boolean14 = color10.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.stencil = 10;
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color19;
        com.badlogic.gdx.graphics.Color color25 = color19.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color26 = color10.mul(color25);
        com.badlogic.gdx.graphics.Color color27 = color25.premultiplyAlpha();
        color25.g = 537535241;
        com.badlogic.gdx.graphics.Color color34 = color25.mul(2.3509886E-38f, (float) 100, (float) (-2147483648), (float) (-65025));
        com.badlogic.gdx.graphics.Color color35 = color4.sub(color25);
        com.badlogic.gdx.graphics.Color color36 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color41 = color36.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        float float42 = color41.b;
        com.badlogic.gdx.graphics.Color color47 = color41.add((float) 1465382614, 0.0f, (-1.7010254E38f), (float) (-2140996640));
        com.badlogic.gdx.graphics.Color color49 = color41.set(585070592);
        com.badlogic.gdx.graphics.Color color50 = color25.add(color41);
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color(color41);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 63519 + "'", int5 == 63519);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color50);
    }

    @Test
    public void test12179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12179");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int10 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        boolean boolean15 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int16 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.windowWidth = 1677721600;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 587137024;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration23);
        lwjgl3ApplicationConfiguration24.setWindowPosition((int) (short) 10, 10);
        boolean boolean28 = lwjgl3ApplicationConfiguration24.useGL30;
        com.badlogic.gdx.Files.FileType fileType29 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration24.setpreferencesFileType(fileType29);
        lwjgl3ApplicationConfiguration24.g = 100;
        int int33 = lwjgl3ApplicationConfiguration24.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration24.setwindowWidth((-545421065));
        lwjgl3ApplicationConfiguration24.setWindowPosition((int) (byte) 1, (int) '#');
        lwjgl3ApplicationConfiguration24.setpreferencesDirectory(".prefs/");
        lwjgl3ApplicationConfiguration24.setdepth((-41943040));
        lwjgl3ApplicationConfiguration24.title = "";
        lwjgl3ApplicationConfiguration24.setaudioDeviceSimultaneousSources(63488);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration24);
        java.lang.String str48 = lwjgl3ApplicationConfiguration24.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = lwjgl3ApplicationConfiguration24.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + fileType29 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType29.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16 + "'", int33 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ".prefs/" + "'", str48, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration49);
        org.junit.Assert.assertTrue("'" + hdpiMode50 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode50.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test12180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12180");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType9;
        int int11 = lwjgl3ApplicationConfiguration1.depth;
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = '#';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        lwjgl3ApplicationConfiguration1.vSyncEnabled = false;
        int int18 = lwjgl3ApplicationConfiguration1.b;
        lwjgl3ApplicationConfiguration1.setpreferencesDirectory("ffff639c");
        lwjgl3ApplicationConfiguration1.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration23.audioDeviceSimultaneousSources = (-143104);
        java.lang.String str26 = lwjgl3ApplicationConfiguration23.getpreferencesDirectory();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ffff639c" + "'", str26, "ffff639c");
    }

    @Test
    public void test12181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12181");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = null;
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode11);
        boolean boolean13 = lwjgl3ApplicationConfiguration8.windowDecorated;
        boolean boolean14 = lwjgl3ApplicationConfiguration8.disableAudio;
        boolean boolean15 = lwjgl3ApplicationConfiguration8.getdisableAudio();
        int int16 = lwjgl3ApplicationConfiguration8.windowMinHeight;
        int int17 = lwjgl3ApplicationConfiguration8.getgles30ContextMajorVersion();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test12182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12182");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((float) (-208), (float) (-8257792), (float) 586415136, (float) 7680);
        com.badlogic.gdx.graphics.Color color12 = color11.clamp();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color11, (-15728400));
        com.badlogic.gdx.graphics.Color color21 = color11.add((float) (-52320), (float) 1, (float) 163200, (-1.0431761E38f));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color11, (-8160));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color21);
    }

    @Test
    public void test12183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12183");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 0;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-545421065));
        lwjgl3ApplicationConfiguration0.stencil = (-10223606);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-255));
        boolean boolean17 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-156));
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-33313), 1020460416);
        lwjgl3ApplicationConfiguration0.stencil = (-587202560);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test12184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12184");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int11 = lwjgl3ApplicationConfiguration1.windowWidth;
        int int12 = lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion;
        boolean boolean13 = lwjgl3ApplicationConfiguration1.windowResizable;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test12185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12185");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (-256);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = 765;
        lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion = '#';
        boolean boolean13 = lwjgl3ApplicationConfiguration1.useGL30;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12186");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.windowMinWidth = 8925;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(163200, 16776961, (int) '#', (-15), (-2147413088), 2, 131);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("0083ff00");
        lwjgl3ApplicationConfiguration0.setAudioConfig((-503316225), (-8708864), 3);
        int int26 = lwjgl3ApplicationConfiguration0.getwindowY();
        boolean boolean27 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test12187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12187");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 16);
        color3.a = 0L;
        com.badlogic.gdx.graphics.Color color8 = color1.mul(color3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        int int15 = com.badlogic.gdx.graphics.Color.rgb888(color13);
        boolean boolean17 = color13.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.stencil = 10;
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration18.initialBackgroundColor = color22;
        com.badlogic.gdx.graphics.Color color28 = color22.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color29 = color13.mul(color28);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color28);
        com.badlogic.gdx.graphics.Color color31 = color3.set(color30);
        float float32 = color31.b;
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.FOREST;
        com.badlogic.gdx.graphics.Color color34 = color31.set(color33);
        int int35 = com.badlogic.gdx.graphics.Color.rgba4444(color34);
        com.badlogic.gdx.graphics.Color color36 = color34.cpy();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10287 + "'", int35 == 10287);
        org.junit.Assert.assertNotNull(color36);
    }

    @Test
    public void test12188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12188");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration1.stencil = 10;
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color5;
        int int7 = com.badlogic.gdx.graphics.Color.rgb888(color5);
        boolean boolean9 = color5.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.stencil = 10;
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration10.initialBackgroundColor = color14;
        com.badlogic.gdx.graphics.Color color20 = color14.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color21 = color5.mul(color20);
        com.badlogic.gdx.graphics.Color color23 = color20.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color20, 3);
        com.badlogic.gdx.graphics.Color color27 = color20.set((int) (short) 1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color27, (-40036));
        com.badlogic.gdx.graphics.Color color30 = color27.cpy();
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color30);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color30);
        com.badlogic.gdx.graphics.Color color34 = color0.lerp(color32, 0.0f);
        color34.b = 16738740;
        com.badlogic.gdx.graphics.Color color42 = color34.lerp((-1.6950771E38f), (float) 100L, (float) (-360960), (float) (-16255486), (float) (-393216));
        float float43 = color34.r;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 1.0f + "'", float43 == 1.0f);
    }

    @Test
    public void test12189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12189");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int16 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color21;
        lwjgl3ApplicationConfiguration17.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration17.setFullscreenMode(displayMode25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration17);
        int int28 = lwjgl3ApplicationConfiguration17.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration17.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode31);
        boolean boolean34 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int35 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (short) 1;
        boolean boolean38 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1888288));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 640 + "'", int35 == 640);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test12190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12190");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (short) 10;
        lwjgl3ApplicationConfiguration0.setAudioConfig(40664886, 1677721600, 43371);
        lwjgl3ApplicationConfiguration0.windowWidth = 0;
        lwjgl3ApplicationConfiguration0.samples = 100;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int19 = lwjgl3ApplicationConfiguration18.b;
        boolean boolean20 = lwjgl3ApplicationConfiguration18.windowDecorated;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test12191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12191");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-1077936368), (int) (short) 100);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowResizable;
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color((float) 0L, (float) 640, (float) ' ', (float) (-1));
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color17);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color18;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        float float22 = color21.b;
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        com.badlogic.gdx.graphics.Color color25 = color21.set(704);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color25;
        int int27 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-503316480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test12192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12192");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (short) 10;
        int int10 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        int int14 = lwjgl3ApplicationConfiguration11.b;
        boolean boolean15 = lwjgl3ApplicationConfiguration11.vSyncEnabled;
        lwjgl3ApplicationConfiguration11.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType18 = lwjgl3ApplicationConfiguration11.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration20.initialBackgroundColor = color24;
        int int26 = com.badlogic.gdx.graphics.Color.rgb888(color24);
        boolean boolean28 = color24.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.stencil = 10;
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration29.initialBackgroundColor = color33;
        com.badlogic.gdx.graphics.Color color39 = color33.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color40 = color24.mul(color39);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color39, (int) 'a');
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color39);
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-1536);
        lwjgl3ApplicationConfiguration0.setdepth(4063);
        lwjgl3ApplicationConfiguration0.setdepth(16663740);
        int int50 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + fileType18 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType18.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 512 + "'", int50 == 512);
    }

    @Test
    public void test12193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12193");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CHARTREUSE;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color2, (-864551100));
        float float5 = color2.g;
        int int6 = com.badlogic.gdx.graphics.Color.argb8888(color2);
        float float7 = color2.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration8.stencil = 10;
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration8.initialBackgroundColor = color12;
        int int14 = com.badlogic.gdx.graphics.Color.rgb888(color12);
        boolean boolean16 = color12.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color21;
        com.badlogic.gdx.graphics.Color color27 = color21.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color28 = color12.mul(color27);
        com.badlogic.gdx.graphics.Color color29 = color27.premultiplyAlpha();
        float float30 = color27.b;
        float float31 = color27.toFloatBits();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color27, (-8257792));
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color37, 16);
        color37.a = 0L;
        com.badlogic.gdx.graphics.Color color42 = color35.mul(color37);
        com.badlogic.gdx.graphics.Color color47 = color35.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color color49 = color35.set((int) (byte) -1);
        com.badlogic.gdx.graphics.Color color50 = color35.clamp();
        float float51 = color50.toFloatBits();
        com.badlogic.gdx.graphics.Color color52 = color27.sub(color50);
        com.badlogic.gdx.graphics.Color color53 = color2.sub(color50);
        com.badlogic.gdx.graphics.Color color54 = new com.badlogic.gdx.graphics.Color(color2);
        com.badlogic.gdx.graphics.Color color59 = new com.badlogic.gdx.graphics.Color(0.0f, (float) 512, (float) 16776961, (float) (-237));
        com.badlogic.gdx.graphics.Color color60 = color54.set(color59);
        color54.b = 0.88235295f;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.9206349f + "'", float5 == 0.9206349f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16771616 + "'", int6 == 16771616);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 3.023037E-39f + "'", float7 == 3.023037E-39f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-1.7014117E38f) + "'", float51 == (-1.7014117E38f));
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color60);
    }

    @Test
    public void test12194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12194");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color4.lerp(color12, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color14, (-545421065));
        color14.a = 1L;
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color22, 16);
        color22.a = 0L;
        com.badlogic.gdx.graphics.Color color27 = color20.mul(color22);
        com.badlogic.gdx.graphics.Color color32 = color20.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color32, 33791);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color32);
        color32.b = (-2147418368);
        boolean boolean38 = color14.equals((java.lang.Object) color32);
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color32);
        int int40 = com.badlogic.gdx.graphics.Color.argb8888(color39);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2147450112) + "'", int40 == (-2147450112));
    }

    @Test
    public void test12195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12195");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 267782144, (float) 16711935, (float) 10, (float) 10L);
        com.badlogic.gdx.graphics.Color color9 = color4.add(0.49803922f, (float) 626699475, (float) (-116), (float) 401539072);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color4, 1);
        com.badlogic.gdx.graphics.Color color12 = color4.clamp();
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color((-16777216));
        com.badlogic.gdx.graphics.Color color19 = color14.sub((float) (-67650272), (-9.371056E37f), (float) 30696, (-1.5399916E-33f));
        com.badlogic.gdx.graphics.Color color20 = color4.set(color19);
        com.badlogic.gdx.graphics.Color color25 = color20.sub((float) (-1445928036), 3.777893E22f, (-3.915235E-31f), 0.64705884f);
        com.badlogic.gdx.graphics.Color color27 = color25.set(65533);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test12196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12196");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("0000ffbf");
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test12197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12197");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1476467812), (float) 16766720, (float) 1671172080, (float) 16744959);
    }

    @Test
    public void test12198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12198");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.windowY = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration1.setwindowWidth((-15514229));
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration1.preferencesDirectory = "00000000";
        int int20 = lwjgl3ApplicationConfiguration1.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration1.stencil = (-2320);
        java.lang.String str23 = lwjgl3ApplicationConfiguration1.preferencesDirectory;
        lwjgl3ApplicationConfiguration1.setpreferencesDirectory("00ffff00");
        com.badlogic.gdx.Files.FileType fileType26 = lwjgl3ApplicationConfiguration1.preferencesFileType;
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00000000" + "'", str23, "00000000");
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12199");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000000";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-622910848);
        int int15 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setwindowY((-1077936368));
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(16766720);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.samples = (-1172061696);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
    }

    @Test
    public void test12200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12200");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setTitle("00200000");
        lwjgl3ApplicationConfiguration0.setwindowWidth(36608);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener10);
    }

    @Test
    public void test12201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12201");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        lwjgl3ApplicationConfiguration1.disableAudio(false);
        int int20 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        lwjgl3ApplicationConfiguration1.setWindowedMode((-116), 8616705);
        int int24 = lwjgl3ApplicationConfiguration1.getgles30ContextMajorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration25.preferencesDirectory = "00000200";
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 640 + "'", int20 == 640);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
    }

    @Test
    public void test12202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12202");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = null;
        lwjgl3ApplicationConfiguration11.hdpiMode = hdpiMode12;
        lwjgl3ApplicationConfiguration11.setaudioDeviceSimultaneousSources((-369098752));
        int int16 = lwjgl3ApplicationConfiguration11.windowMaxWidth;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test12203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12203");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.windowWidth = (-4090624);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        int int10 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-503316225));
        lwjgl3ApplicationConfiguration0.setdepth((-31));
        int int15 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-31) + "'", int15 == (-31));
    }

    @Test
    public void test12204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12204");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-150361792), (float) (-16654816));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test12205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12205");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int13 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.setwindowX(61456);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test12206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12206");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, (int) (byte) 0, (int) (byte) 100);
        int int13 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        boolean boolean14 = lwjgl3ApplicationConfiguration1.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener15);
        int int17 = lwjgl3ApplicationConfiguration1.depth;
        int int18 = lwjgl3ApplicationConfiguration1.getwindowHeight();
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration1.initialBackgroundColor;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 480 + "'", int18 == 480);
        org.junit.Assert.assertNotNull(color19);
    }

    @Test
    public void test12207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12207");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.a = 2016;
        lwjgl3ApplicationConfiguration0.b = (-458762);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode19 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode19;
        boolean boolean21 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 50111;
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test12208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12208");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        int int12 = lwjgl3ApplicationConfiguration9.b;
        boolean boolean13 = lwjgl3ApplicationConfiguration9.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType14 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration9.setpreferencesFileType(fileType14);
        int int16 = lwjgl3ApplicationConfiguration9.depth;
        lwjgl3ApplicationConfiguration9.windowX = 765;
        int int19 = lwjgl3ApplicationConfiguration9.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = lwjgl3ApplicationConfiguration9.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode20;
        lwjgl3ApplicationConfiguration0.windowHeight = (-569376768);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
    }

    @Test
    public void test12209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12209");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.WHITE;
        color11.r = 0.0f;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int16 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test12210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12210");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        lwjgl3ApplicationConfiguration1.windowMaxHeight = 862994742;
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferSize(50331648);
        int int9 = lwjgl3ApplicationConfiguration1.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration1.stencil = (-2320);
        int int12 = lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion;
        boolean boolean13 = lwjgl3ApplicationConfiguration1.windowResizable;
        lwjgl3ApplicationConfiguration1.setBackBufferConfig((-1905328384), (-32640), (-7536641), (int) (byte) 10, 2083471872, (-241877265), 32830);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50331648 + "'", int9 == 50331648);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test12211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12211");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) '#', (float) (-16580607), (float) (-40036), (float) 2);
        com.badlogic.gdx.graphics.Color color6 = color4.set(863980544);
        color4.a = (-503316225);
        com.badlogic.gdx.graphics.Color color13 = color4.set((float) (-541344), (float) (-16777116), 0.99607843f, (float) (-266942944));
        com.badlogic.gdx.graphics.Color color15 = color13.mul((float) 2097152);
        int int16 = com.badlogic.gdx.graphics.Color.argb8888(color15);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 255 + "'", int16 == 255);
    }

    @Test
    public void test12212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12212");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-1644162816), (float) 16777087);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test12213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12213");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test12214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12214");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1929445376), (-1.6953597E38f), (float) 14420470, (-1.4953815E38f));
    }

    @Test
    public void test12215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12215");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int6 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.setWindowedMode(40664886, 3309388);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 2147418367;
        int int12 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setTitle("00000020");
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test12216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12216");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.windowY = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration1.setwindowWidth((-15514229));
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = (-16033380);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = lwjgl3ApplicationConfiguration1.hdpiMode;
        boolean boolean21 = lwjgl3ApplicationConfiguration1.getvSyncEnabled();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test12217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12217");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (short) 10;
        lwjgl3ApplicationConfiguration0.setAudioConfig(40664886, 1677721600, 43371);
        lwjgl3ApplicationConfiguration0.windowWidth = 0;
        lwjgl3ApplicationConfiguration0.samples = 100;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int19 = lwjgl3ApplicationConfiguration18.b;
        int int20 = lwjgl3ApplicationConfiguration18.windowY;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test12218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12218");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12219");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener5;
        lwjgl3ApplicationConfiguration0.windowY = 131072;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(6528502);
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int12 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int14 = lwjgl3ApplicationConfiguration13.windowY;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 131072 + "'", int14 == 131072);
    }

    @Test
    public void test12220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12220");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color27, 16);
        color27.a = 0L;
        com.badlogic.gdx.graphics.Color color32 = color25.mul(color27);
        com.badlogic.gdx.graphics.Color color37 = color25.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color37, 33791);
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color37);
        com.badlogic.gdx.graphics.Color color41 = color23.sub(color40);
        int int42 = com.badlogic.gdx.graphics.Color.rgba4444(color41);
        com.badlogic.gdx.graphics.Color color44 = color4.lerp(color41, (float) (-503341578));
        com.badlogic.gdx.graphics.Color color49 = color44.sub((float) (-17796196), (float) 65295, 0.9206349f, 0.53333336f);
        int int50 = color49.toIntBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration51.stencil = 10;
        int int54 = lwjgl3ApplicationConfiguration51.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = null;
        lwjgl3ApplicationConfiguration51.hdpiMode = hdpiMode55;
        boolean boolean57 = lwjgl3ApplicationConfiguration51.getvSyncEnabled();
        boolean boolean58 = lwjgl3ApplicationConfiguration51.vSyncEnabled;
        lwjgl3ApplicationConfiguration51.disableAudio = false;
        com.badlogic.gdx.Graphics.DisplayMode displayMode61 = null;
        lwjgl3ApplicationConfiguration51.setFullscreenMode(displayMode61);
        int int63 = lwjgl3ApplicationConfiguration51.windowMinHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration51);
        lwjgl3ApplicationConfiguration64.title = ".prefs/";
        boolean boolean67 = color49.equals((java.lang.Object) lwjgl3ApplicationConfiguration64);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1310975 + "'", int50 == 1310975);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 8 + "'", int54 == 8);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test12221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12221");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 0);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int8 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean10 = lwjgl3ApplicationConfiguration9.getdisableAudio();
        lwjgl3ApplicationConfiguration9.windowX = 16724807;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 640 + "'", int7 == 640);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12222");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color15 = color4.mul((float) '#', (float) (-10223606), (float) (-545421065), (float) 3309388);
        int int16 = com.badlogic.gdx.graphics.Color.rgb565(color15);
        com.badlogic.gdx.graphics.Color color17 = color15.clamp();
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((-1671024128));
        com.badlogic.gdx.graphics.Color color24 = color19.set((float) (-16711681), (float) 43371, (float) (-7555886), (float) (-1948738560));
        com.badlogic.gdx.graphics.Color color25 = color15.mul(color24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.stencil = 10;
        int int29 = lwjgl3ApplicationConfiguration26.b;
        boolean boolean30 = lwjgl3ApplicationConfiguration26.vSyncEnabled;
        lwjgl3ApplicationConfiguration26.setuseGL30(false);
        int int33 = lwjgl3ApplicationConfiguration26.getwindowY();
        int int34 = lwjgl3ApplicationConfiguration26.audioDeviceBufferCount;
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color38, 16);
        color38.a = 0L;
        com.badlogic.gdx.graphics.Color color43 = color36.mul(color38);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration44.stencil = 10;
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration44.initialBackgroundColor = color48;
        int int50 = com.badlogic.gdx.graphics.Color.rgb888(color48);
        boolean boolean52 = color48.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration53.stencil = 10;
        com.badlogic.gdx.graphics.Color color57 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration53.initialBackgroundColor = color57;
        com.badlogic.gdx.graphics.Color color63 = color57.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color64 = color48.mul(color63);
        com.badlogic.gdx.graphics.Color color65 = new com.badlogic.gdx.graphics.Color(color63);
        com.badlogic.gdx.graphics.Color color66 = color38.set(color65);
        float float67 = color66.r;
        float float68 = color66.g;
        lwjgl3ApplicationConfiguration26.initialBackgroundColor = color66;
        com.badlogic.gdx.graphics.Color color70 = color15.set(color66);
        com.badlogic.gdx.graphics.Color color72 = new com.badlogic.gdx.graphics.Color(1174394321);
        com.badlogic.gdx.graphics.Color color77 = color72.sub((float) (-2320), 0.39215687f, (-1.0407874E38f), (float) (-848128));
        com.badlogic.gdx.graphics.Color color78 = color72.clamp();
        com.badlogic.gdx.graphics.Color color79 = color66.sub(color72);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color79, 150);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 63488 + "'", int16 == 63488);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color66);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 1.0f + "'", float67 == 1.0f);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 1.0f + "'", float68 == 1.0f);
        org.junit.Assert.assertNotNull(color70);
        org.junit.Assert.assertNotNull(color77);
        org.junit.Assert.assertNotNull(color78);
        org.junit.Assert.assertNotNull(color79);
    }

    @Test
    public void test12223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12223");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.setgles30ContextMajorVersion((-503341578));
        int int10 = lwjgl3ApplicationConfiguration1.getwindowX();
        lwjgl3ApplicationConfiguration1.r = 1465382614;
        lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources = (-7555886);
        int int15 = lwjgl3ApplicationConfiguration1.getwindowHeight();
        java.lang.String str16 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.samples = (-16569);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12224");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.depth = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration8.stencil = 10;
        int int11 = lwjgl3ApplicationConfiguration8.depth;
        int int12 = lwjgl3ApplicationConfiguration8.stencil;
        int int13 = lwjgl3ApplicationConfiguration8.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = null;
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode14);
        int int16 = lwjgl3ApplicationConfiguration8.windowY;
        lwjgl3ApplicationConfiguration8.preferencesDirectory = "00000000";
        lwjgl3ApplicationConfiguration8.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration8.audioDeviceBufferSize = (-622910848);
        lwjgl3ApplicationConfiguration8.setAudioConfig((-16764024), (-2320), 16711425);
        lwjgl3ApplicationConfiguration8.setgles30ContextMajorVersion(63488);
        com.badlogic.gdx.Files.FileType fileType29 = lwjgl3ApplicationConfiguration8.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + fileType29 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType29.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12225");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) 626699475, (float) (-52224), (float) (-1528823808), (float) 3968);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-15765376) + "'", int4 == (-15765376));
    }

    @Test
    public void test12226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12226");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode7;
        lwjgl3ApplicationConfiguration0.b = 401539072;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int13 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = lwjgl3ApplicationConfiguration0.hdpiMode;
        int int15 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.samples = 2147483647;
        int int18 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setWindowedMode(16384, 15736800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 401539072 + "'", int13 == 401539072);
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
    }

    @Test
    public void test12227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12227");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.96862745f, (float) (-243732465), 1.1526072E-38f, (float) (-387200));
    }

    @Test
    public void test12228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12228");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2147481728));
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) (byte) 10, (float) 16711680, (float) (short) 0, (float) 224, (-1.7013599E38f));
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color11 = color9.mul((float) (-62876));
        color11.a = 16711680;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        int int20 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        boolean boolean22 = color18.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        com.badlogic.gdx.graphics.Color color33 = color27.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color34 = color18.mul(color33);
        com.badlogic.gdx.graphics.Color color36 = color33.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color color38 = color11.lerp(color36, (-1.5399916E-33f));
        com.badlogic.gdx.graphics.Color color43 = color38.sub((float) 16711935, (float) (short) 100, 0.0f, (-1.6947657E38f));
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(0.0f, (float) '4', (float) 786400, (float) (-32));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color48, (int) '#');
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color48, (-9728477));
        com.badlogic.gdx.graphics.Color color53 = color38.sub(color48);
        com.badlogic.gdx.graphics.Color color54 = color7.add(color48);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color54);
    }

    @Test
    public void test12229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12229");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration9.useOpenGL3(true, (-100466688), (-62876));
        int int15 = lwjgl3ApplicationConfiguration9.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration9.setaudioDeviceSimultaneousSources((-9));
        int int18 = lwjgl3ApplicationConfiguration9.windowY;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100466688) + "'", int15 == (-100466688));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test12230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12230");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        lwjgl3ApplicationConfiguration1.b = (-65536);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        int int12 = lwjgl3ApplicationConfiguration9.depth;
        lwjgl3ApplicationConfiguration9.windowX = (short) 100;
        lwjgl3ApplicationConfiguration9.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType18 = lwjgl3ApplicationConfiguration9.getpreferencesFileType();
        int int19 = lwjgl3ApplicationConfiguration9.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration20.initialBackgroundColor = color24;
        lwjgl3ApplicationConfiguration20.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration20.initialBackgroundColor = color28;
        lwjgl3ApplicationConfiguration20.g = 16711680;
        int int32 = lwjgl3ApplicationConfiguration20.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration20.audioDeviceBufferSize = 0;
        int int35 = lwjgl3ApplicationConfiguration20.getgles30ContextMajorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = lwjgl3ApplicationConfiguration20.hdpiMode;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration1.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration1.windowDecorated = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + fileType18 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType18.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test12231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12231");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        int int16 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.windowMinWidth = 64274;
        int int19 = lwjgl3ApplicationConfiguration0.depth;
        int int20 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        lwjgl3ApplicationConfiguration22.r = ' ';
        boolean boolean25 = lwjgl3ApplicationConfiguration22.getuseGL30();
        java.lang.String str26 = lwjgl3ApplicationConfiguration22.title;
        int int27 = lwjgl3ApplicationConfiguration22.a;
        int int28 = lwjgl3ApplicationConfiguration22.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration22.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration22.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration33);
        int int35 = lwjgl3ApplicationConfiguration34.samples;
        lwjgl3ApplicationConfiguration34.setwindowY(9);
        int int38 = lwjgl3ApplicationConfiguration34.samples;
        int int39 = lwjgl3ApplicationConfiguration34.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.stencil = 10;
        int int43 = lwjgl3ApplicationConfiguration40.depth;
        int int44 = lwjgl3ApplicationConfiguration40.stencil;
        int int45 = lwjgl3ApplicationConfiguration40.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = null;
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode46);
        int int48 = lwjgl3ApplicationConfiguration40.windowY;
        lwjgl3ApplicationConfiguration40.preferencesDirectory = "00000000";
        lwjgl3ApplicationConfiguration40.windowY = 8;
        int int53 = lwjgl3ApplicationConfiguration40.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration54.stencil = 10;
        int int57 = lwjgl3ApplicationConfiguration54.b;
        boolean boolean58 = lwjgl3ApplicationConfiguration54.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType59 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration54.setpreferencesFileType(fileType59);
        int int61 = lwjgl3ApplicationConfiguration54.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration54);
        boolean boolean63 = lwjgl3ApplicationConfiguration54.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration64.stencil = 10;
        int int67 = lwjgl3ApplicationConfiguration64.depth;
        int int68 = lwjgl3ApplicationConfiguration64.stencil;
        int int69 = lwjgl3ApplicationConfiguration64.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode70 = null;
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode70);
        int int72 = lwjgl3ApplicationConfiguration64.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration73 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration73.stencil = 10;
        int int76 = lwjgl3ApplicationConfiguration73.b;
        boolean boolean77 = lwjgl3ApplicationConfiguration73.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType78 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration73.setpreferencesFileType(fileType78);
        int int80 = lwjgl3ApplicationConfiguration73.depth;
        lwjgl3ApplicationConfiguration73.windowX = 765;
        int int83 = lwjgl3ApplicationConfiguration73.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode84 = lwjgl3ApplicationConfiguration73.hdpiMode;
        lwjgl3ApplicationConfiguration64.hdpiMode = hdpiMode84;
        lwjgl3ApplicationConfiguration54.hdpiMode = hdpiMode84;
        lwjgl3ApplicationConfiguration40.hdpiMode = hdpiMode84;
        lwjgl3ApplicationConfiguration34.hdpiMode = hdpiMode84;
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode84;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 480 + "'", int16 == 480);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 640 + "'", int20 == 640);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16 + "'", int28 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 16 + "'", int43 == 16);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 8 + "'", int57 == 8);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + fileType59 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType59.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 16 + "'", int67 == 16);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 8 + "'", int76 == 8);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + fileType78 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType78.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 16 + "'", int80 == 16);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode84 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode84.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test12232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12232");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.a = 862994742;
        int int7 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode10 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.depth = (-6168960);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode10 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode10.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test12233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12233");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-16711936));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 25500;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25500 + "'", int10 == 25500);
    }

    @Test
    public void test12234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12234");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType9;
        int int11 = lwjgl3ApplicationConfiguration1.depth;
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = '#';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int16 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
        lwjgl3ApplicationConfiguration1.b = (-67379424);
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration1.initialBackgroundColor;
        java.lang.String str20 = lwjgl3ApplicationConfiguration1.preferencesDirectory;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ".prefs/" + "'", str20, ".prefs/");
    }

    @Test
    public void test12235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12235");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 49120, (float) 65339, 0.0f, (-1.7013967E38f));
    }

    @Test
    public void test12236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12236");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType9;
        int int11 = lwjgl3ApplicationConfiguration1.depth;
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = '#';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        lwjgl3ApplicationConfiguration1.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration1.hdpiMode = hdpiMode18;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test12237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12237");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-2147413088);
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color16 = color11.set((float) 65295, (float) (-10224128), 0.0f, (float) (-256));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color16, (-208));
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color23, 16);
        color23.a = 0L;
        com.badlogic.gdx.graphics.Color color28 = color21.mul(color23);
        com.badlogic.gdx.graphics.Color color33 = color21.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color33, 33791);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color37 = color19.sub(color36);
        com.badlogic.gdx.graphics.Color color38 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color42, 16);
        color42.a = 0L;
        com.badlogic.gdx.graphics.Color color47 = color40.mul(color42);
        com.badlogic.gdx.graphics.Color color52 = color40.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color52, 33791);
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color(color52);
        com.badlogic.gdx.graphics.Color color56 = color38.sub(color55);
        com.badlogic.gdx.graphics.Color color57 = color36.set(color55);
        com.badlogic.gdx.graphics.Color color58 = color57.cpy();
        com.badlogic.gdx.graphics.Color color59 = color16.set(color58);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration60.stencil = 10;
        com.badlogic.gdx.graphics.Color color64 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration60.initialBackgroundColor = color64;
        int int66 = com.badlogic.gdx.graphics.Color.rgb888(color64);
        boolean boolean68 = color64.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration69 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration69.stencil = 10;
        com.badlogic.gdx.graphics.Color color73 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration69.initialBackgroundColor = color73;
        com.badlogic.gdx.graphics.Color color79 = color73.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color80 = color64.mul(color79);
        com.badlogic.gdx.graphics.Color color81 = new com.badlogic.gdx.graphics.Color(color64);
        float float82 = color81.a;
        java.lang.String str83 = color81.toString();
        com.badlogic.gdx.graphics.Color color84 = new com.badlogic.gdx.graphics.Color(color81);
        com.badlogic.gdx.graphics.Color color85 = new com.badlogic.gdx.graphics.Color(color81);
        com.badlogic.gdx.graphics.Color color86 = new com.badlogic.gdx.graphics.Color(color85);
        com.badlogic.gdx.graphics.Color color87 = color16.set(color86);
        float float88 = color87.toFloatBits();
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(color79);
        org.junit.Assert.assertNotNull(color80);
        org.junit.Assert.assertTrue("'" + float82 + "' != '" + 0.0f + "'", float82 == 0.0f);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "00000000" + "'", str83, "00000000");
        org.junit.Assert.assertNotNull(color87);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + 0.0f + "'", float88 == 0.0f);
    }

    @Test
    public void test12238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12238");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) '4');
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-10223606));
        int int15 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.g = 16769056;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("827d0000");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test12239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12239");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.depth = 2147418367;
        int int20 = lwjgl3ApplicationConfiguration0.r;
        int int21 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test12240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12240");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources = (-32);
        int int9 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.setsamples((-16580607));
        lwjgl3ApplicationConfiguration1.setwindowDecorated(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test12241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12241");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 2560, (float) (-150), (float) 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-300062) + "'", int3 == (-300062));
    }

    @Test
    public void test12242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12242");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setwindowX(862994742);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color18 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-2140955648);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test12243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12243");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 534839040, (float) (-1972440832), (float) (-4089), 0.039215688f);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
    }

    @Test
    public void test12244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12244");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-150996480), (float) (-143104), 0.6117647f, (float) (-151060480));
    }

    @Test
    public void test12245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12245");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        int int1 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        color0.r = 254;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration4.stencil = 10;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration4.initialBackgroundColor = color8;
        com.badlogic.gdx.graphics.Color color14 = color8.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color8.lerp(color16, (float) 100L);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        com.badlogic.gdx.graphics.Color color24 = color18.mul(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration25);
        lwjgl3ApplicationConfiguration26.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration26);
        int int30 = lwjgl3ApplicationConfiguration29.getgles30ContextMinorVersion();
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color32);
        lwjgl3ApplicationConfiguration29.initialBackgroundColor = color32;
        color32.b = 537535241;
        com.badlogic.gdx.graphics.Color color37 = color18.add(color32);
        com.badlogic.gdx.graphics.Color color38 = color0.mul(color37);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11311516 + "'", int1 == 11311516);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
    }

    @Test
    public void test12246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12246");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.depth = (byte) 100;
        lwjgl3ApplicationConfiguration1.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int15 = lwjgl3ApplicationConfiguration14.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
    }

    @Test
    public void test12247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12247");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-5376));
        lwjgl3ApplicationConfiguration0.r = 521985;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test12248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12248");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setAudioConfig(1621098495, (-2144), (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setsamples((-41943040));
        int int13 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3WindowListener8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 480 + "'", int13 == 480);
    }

    @Test
    public void test12249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12249");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setTitle("");
        lwjgl3ApplicationConfiguration1.setAudioConfig((-10223606), (int) (byte) 0, (-16711936));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.windowDecorated = true;
        lwjgl3ApplicationConfiguration1.setwindowX((-66797));
        boolean boolean16 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        int int17 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-10223606) + "'", int17 == (-10223606));
    }

    @Test
    public void test12250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12250");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int17 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int21 = lwjgl3ApplicationConfiguration20.r;
        boolean boolean22 = lwjgl3ApplicationConfiguration20.getvSyncEnabled();
        int int23 = lwjgl3ApplicationConfiguration20.getgles30ContextMinorVersion();
        com.badlogic.gdx.Files.FileType fileType24 = lwjgl3ApplicationConfiguration20.preferencesFileType;
        int int25 = lwjgl3ApplicationConfiguration20.getaudioDeviceBufferCount();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + fileType24 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType24.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
    }

    @Test
    public void test12251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12251");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 786400;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode20);
        int int22 = lwjgl3ApplicationConfiguration19.windowMaxHeight;
        int int23 = lwjgl3ApplicationConfiguration19.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test12252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12252");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color10, 16);
        color10.a = 0L;
        com.badlogic.gdx.graphics.Color color15 = color8.mul(color10);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color21;
        int int23 = com.badlogic.gdx.graphics.Color.rgb888(color21);
        boolean boolean25 = color21.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.stencil = 10;
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration26.initialBackgroundColor = color30;
        com.badlogic.gdx.graphics.Color color36 = color30.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color37 = color21.mul(color36);
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(color36);
        float float39 = color38.r;
        com.badlogic.gdx.graphics.Color color40 = color16.mul(color38);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color38;
        int int42 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        java.lang.String str45 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int46 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
    }

    @Test
    public void test12253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12253");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.r = 65280;
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.stencil = (-962672);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test12254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12254");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int10 = lwjgl3ApplicationConfiguration0.depth;
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int13 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
    }

    @Test
    public void test12255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12255");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration2.getwindowY();
        boolean boolean4 = lwjgl3ApplicationConfiguration2.getvSyncEnabled();
        lwjgl3ApplicationConfiguration2.disableAudio(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test12256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12256");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(1024, (-16), (-262352), (-1047135242));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7011003E38f) + "'", float4 == (-1.7011003E38f));
    }

    @Test
    public void test12257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12257");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int12 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test12258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12258");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.stencil = 10;
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration13.initialBackgroundColor = color17;
        com.badlogic.gdx.graphics.Color color23 = color17.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color27 = color17.lerp(color25, (float) 100L);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        com.badlogic.gdx.graphics.Color color33 = color27.mul(color32);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color27;
        java.lang.String str35 = lwjgl3ApplicationConfiguration11.getpreferencesDirectory();
        int int36 = lwjgl3ApplicationConfiguration11.gles30ContextMajorVersion;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ".prefs/" + "'", str35, ".prefs/");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test12259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12259");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) 910258227, (float) (-622910848), (float) 1900764, (-1.03397577E-25f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2416640) + "'", int4 == (-2416640));
    }

    @Test
    public void test12260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12260");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) -1;
        lwjgl3ApplicationConfiguration0.b = (-16711681);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration12.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((float) 43371, (float) 6528502, (float) (-65025), (float) 480);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        com.badlogic.gdx.graphics.Color color20 = color13.add(color18);
        float float21 = color18.b;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test12261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12261");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setdepth(16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.stencil = 10;
        lwjgl3ApplicationConfiguration12.setwindowX((int) (short) 0);
        int int17 = lwjgl3ApplicationConfiguration12.getaudioDeviceBufferSize();
        int int18 = lwjgl3ApplicationConfiguration12.windowHeight;
        lwjgl3ApplicationConfiguration12.setaudioDeviceBufferSize(480);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.OLIVE;
        lwjgl3ApplicationConfiguration12.initialBackgroundColor = color21;
        float float23 = color21.toFloatBits();
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color21;
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 480 + "'", int18 == 480);
        org.junit.Assert.assertNotNull(color21);
// flaky:         org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-1.7013859E38f) + "'", float23 == (-1.7013859E38f));
    }

    @Test
    public void test12262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12262");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration7.setaudioDeviceBufferCount((int) (short) 0);
        lwjgl3ApplicationConfiguration7.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration7.setWindowSizeLimits(65520, 16777200, (-262352), (-637684704));
        lwjgl3ApplicationConfiguration7.setpreferencesDirectory("ff00ff00");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test12263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12263");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.windowHeight = (byte) 1;
        int int10 = lwjgl3ApplicationConfiguration1.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration1.setResizable(true);
        lwjgl3ApplicationConfiguration1.setpreferencesDirectory("666a0000");
        lwjgl3ApplicationConfiguration1.disableAudio = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test12264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12264");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) 54992, (float) 63341, (float) 30720, (float) (-768));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-64768) + "'", int4 == (-64768));
    }

    @Test
    public void test12265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12265");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = 862994742;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration14.windowMaxHeight = (-2147413088);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration25);
        lwjgl3ApplicationConfiguration26.r = ' ';
        boolean boolean29 = lwjgl3ApplicationConfiguration26.getuseGL30();
        lwjgl3ApplicationConfiguration26.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration33.setwindowResizable(false);
        lwjgl3ApplicationConfiguration33.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration33.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration33.setWindowedMode(1465382614, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType51 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration33.setpreferencesFileType(fileType51);
        lwjgl3ApplicationConfiguration26.setPreferencesConfig("ff000000", fileType51);
        lwjgl3ApplicationConfiguration14.setpreferencesFileType(fileType51);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType51;
        int int56 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((-102293760));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + fileType51 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType51.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
    }

    @Test
    public void test12266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12266");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.samples = 6349110;
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.stencil = 268369920;
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.windowY = (short) -1;
        int int17 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int18 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test12267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12267");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setwindowX(52897);
        lwjgl3ApplicationConfiguration0.g = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test12268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12268");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((-1.6999093E38f), (-2.315247E-14f), (float) 30720, (float) 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2005427100 + "'", int4 == 2005427100);
    }

    @Test
    public void test12269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12269");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        int int9 = lwjgl3ApplicationConfiguration7.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration7.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration7.disableAudio = true;
        int int14 = lwjgl3ApplicationConfiguration7.getsamples();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test12270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12270");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setdepth(16738740);
        lwjgl3ApplicationConfiguration0.windowHeight = (-21376768);
        lwjgl3ApplicationConfiguration0.setWindowPosition(16758015, 62445);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test12271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12271");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = lwjgl3ApplicationConfiguration1.hdpiMode;
        int int7 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
        lwjgl3ApplicationConfiguration1.windowHeight = 3;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration10.windowMaxWidth = 2147483647;
        int int13 = lwjgl3ApplicationConfiguration10.getaudioDeviceBufferCount();
        int int14 = lwjgl3ApplicationConfiguration10.getgles30ContextMinorVersion();
        int int15 = lwjgl3ApplicationConfiguration10.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration10.setWindowedMode(1503395840, 16663740);
        lwjgl3ApplicationConfiguration10.samples = (-9404400);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
    }

    @Test
    public void test12272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12272");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(100);
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        int int3 = com.badlogic.gdx.graphics.Color.rgb888(color1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test12273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12273");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-256);
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.windowMinHeight = 48624;
        int int13 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
    }

    @Test
    public void test12274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12274");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        int int4 = lwjgl3ApplicationConfiguration1.getwindowX();
        int int5 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration1.a = 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test12275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12275");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        int int1 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((-1728));
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        com.badlogic.gdx.graphics.Color color5 = color0.add(color3);
        com.badlogic.gdx.graphics.Color color6 = color0.cpy();
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16751004 + "'", int1 == 16751004);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1090519033 + "'", int4 == 1090519033);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test12276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12276");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, 16);
        color4.a = 0L;
        com.badlogic.gdx.graphics.Color color9 = color2.mul(color4);
        com.badlogic.gdx.graphics.Color color14 = color2.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color14, 33791);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color18 = color0.sub(color17);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color23, 16);
        color23.a = 0L;
        com.badlogic.gdx.graphics.Color color28 = color21.mul(color23);
        com.badlogic.gdx.graphics.Color color33 = color21.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color33, 33791);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color37 = color19.sub(color36);
        com.badlogic.gdx.graphics.Color color38 = color17.set(color36);
        com.badlogic.gdx.graphics.Color color39 = color36.cpy();
        com.badlogic.gdx.graphics.Color color40 = com.badlogic.gdx.graphics.Color.GOLD;
        color40.r = 'a';
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(color40);
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color(color43);
        float float45 = color43.g;
        com.badlogic.gdx.graphics.Color color46 = color36.mul(color43);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color50, 16);
        color50.a = 0L;
        com.badlogic.gdx.graphics.Color color55 = color48.mul(color50);
        com.badlogic.gdx.graphics.Color color60 = color48.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color color62 = color48.set((int) (byte) -1);
        color48.a = (-503341578);
        com.badlogic.gdx.graphics.Color color65 = new com.badlogic.gdx.graphics.Color(color48);
        com.badlogic.gdx.graphics.Color color67 = color43.lerp(color65, (-1.7014015E38f));
        java.lang.Class<?> wildcardClass68 = color43.getClass();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
// flaky:         org.junit.Assert.assertTrue("'" + float45 + "' != '" + 1.0f + "'", float45 == 1.0f);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test12277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12277");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-151125872), (float) (-1864926), (float) 585070592, (float) (-3792896));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16) + "'", int4 == (-16));
    }

    @Test
    public void test12278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12278");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) -1;
        lwjgl3ApplicationConfiguration0.b = (-16711681);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration12.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((float) 43371, (float) 6528502, (float) (-65025), (float) 480);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        com.badlogic.gdx.graphics.Color color20 = color13.add(color18);
        com.badlogic.gdx.graphics.Color color22 = color13.set((-53040));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
    }

    @Test
    public void test12279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12279");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.b = 512;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = '4';
        int int21 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        boolean boolean22 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-1246176));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test12280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12280");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.a = 3;
        com.badlogic.gdx.graphics.Color color8 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12281");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 26510, (float) (byte) -1, (float) (-1502683136), (float) 2080210944);
    }

    @Test
    public void test12282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12282");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, 480, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        boolean boolean13 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration14.windowListener = lwjgl3WindowListener15;
        lwjgl3ApplicationConfiguration14.setwindowY((-16730996));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
    }

    @Test
    public void test12283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12283");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = color1.clamp();
        float float3 = color1.r;
        com.badlogic.gdx.graphics.Color color4 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color5 = color4.clamp();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color6, (-1216512000));
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test12284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12284");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-5543167), (-458762));
        int int22 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode23 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode23;
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((-1504));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.stencil = 10;
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration27.initialBackgroundColor = color31;
        lwjgl3ApplicationConfiguration27.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration27.setFullscreenMode(displayMode35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration27);
        int int38 = lwjgl3ApplicationConfiguration27.getgles30ContextMajorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration40);
        lwjgl3ApplicationConfiguration41.r = ' ';
        int int44 = lwjgl3ApplicationConfiguration41.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration41.b = (-65025);
        com.badlogic.gdx.Files.FileType fileType47 = lwjgl3ApplicationConfiguration41.getpreferencesFileType();
        lwjgl3ApplicationConfiguration27.setPreferencesConfig("82000000", fileType47);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType47);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + fileType47 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType47.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12285");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-2385), (-3.451725E28f), (float) 8257297);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-36630016) + "'", int3 == (-36630016));
    }

    @Test
    public void test12286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12286");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int13 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(626699475);
        int int16 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test12287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12287");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.setgles30ContextMajorVersion((-503341578));
        int int10 = lwjgl3ApplicationConfiguration1.getwindowX();
        lwjgl3ApplicationConfiguration1.r = 1465382614;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int14 = lwjgl3ApplicationConfiguration1.depth;
        int int15 = lwjgl3ApplicationConfiguration1.stencil;
        lwjgl3ApplicationConfiguration1.setsamples(6156);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test12288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12288");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (-256);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        int int14 = lwjgl3ApplicationConfiguration11.depth;
        boolean boolean15 = lwjgl3ApplicationConfiguration11.vSyncEnabled;
        lwjgl3ApplicationConfiguration11.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration11.hdpiMode = hdpiMode18;
        lwjgl3ApplicationConfiguration1.setHdpiMode(hdpiMode18);
        int int21 = lwjgl3ApplicationConfiguration1.getdepth();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
    }

    @Test
    public void test12289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12289");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-2832), (float) (-47940), (float) 59670);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8521302) + "'", int3 == (-8521302));
    }

    @Test
    public void test12290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12290");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        int int10 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12291");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setwindowX(862994742);
        int int16 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-537010321), (-307859744), 0);
        int int21 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 480 + "'", int21 == 480);
    }

    @Test
    public void test12292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12292");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.r;
        lwjgl3ApplicationConfiguration1.samples = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.stencil = 10;
        int int13 = lwjgl3ApplicationConfiguration10.depth;
        int int14 = lwjgl3ApplicationConfiguration10.stencil;
        int int15 = lwjgl3ApplicationConfiguration10.getwindowY();
        lwjgl3ApplicationConfiguration10.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration10.setwindowMinWidth(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        int int23 = lwjgl3ApplicationConfiguration20.b;
        boolean boolean24 = lwjgl3ApplicationConfiguration20.vSyncEnabled;
        lwjgl3ApplicationConfiguration20.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType27 = lwjgl3ApplicationConfiguration20.getpreferencesFileType();
        lwjgl3ApplicationConfiguration10.preferencesFileType = fileType27;
        lwjgl3ApplicationConfiguration10.disableAudio = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration31);
        com.badlogic.gdx.Files.FileType fileType33 = lwjgl3ApplicationConfiguration32.preferencesFileType;
        lwjgl3ApplicationConfiguration10.preferencesFileType = fileType33;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration1.windowListener = lwjgl3WindowListener36;
        lwjgl3ApplicationConfiguration1.setwindowX(7956480);
        lwjgl3ApplicationConfiguration1.windowWidth = (-157713664);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration32);
        org.junit.Assert.assertTrue("'" + fileType33 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType33.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12293");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(2113863936);
        com.badlogic.gdx.graphics.Color color6 = color1.mul((float) (-1075773696), (-1.7007336E38f), (float) (-16777085), (float) (-15728400));
        color1.g = 5959695;
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test12294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12294");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        int int5 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration6.windowWidth = 80;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
    }

    @Test
    public void test12295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12295");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        int int8 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 16711680;
        int int11 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setsamples((-59244732));
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((float) (-983040), (float) (-7798785), (float) (-858996736), (float) 3309388);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        int int20 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test12296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12296");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        lwjgl3ApplicationConfiguration0.setsamples(1677721600);
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.depth = 704;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test12297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12297");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = 765;
        int int10 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 765;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.b = (-622910848);
        int int17 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 640 + "'", int17 == 640);
    }

    @Test
    public void test12298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12298");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-65025), (float) 512, (float) '4', (float) 3);
        color4.b = (-16704);
        int int7 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-4194496) + "'", int7 == (-4194496));
    }

    @Test
    public void test12299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12299");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        com.badlogic.gdx.graphics.Color color22 = color4.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        int int26 = lwjgl3ApplicationConfiguration23.depth;
        lwjgl3ApplicationConfiguration23.windowX = (short) 100;
        lwjgl3ApplicationConfiguration23.setWindowPosition(16, (int) (byte) 100);
        lwjgl3ApplicationConfiguration23.audioDeviceSimultaneousSources = (-458762);
        int int34 = lwjgl3ApplicationConfiguration23.getdepth();
        com.badlogic.gdx.graphics.Color color35 = lwjgl3ApplicationConfiguration23.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color36 = color4.set(color35);
        color4.r = 128;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 16 + "'", int34 == 16);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
    }

    @Test
    public void test12300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12300");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int16 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color21;
        lwjgl3ApplicationConfiguration17.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration17.setFullscreenMode(displayMode25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration17);
        int int28 = lwjgl3ApplicationConfiguration17.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration17.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode31);
        boolean boolean34 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.b = (-369098752);
        int int37 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int38 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 640 + "'", int37 == 640);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test12301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12301");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowWidth = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        lwjgl3ApplicationConfiguration16.setWindowPosition((int) (short) 10, 10);
        boolean boolean20 = lwjgl3ApplicationConfiguration16.useGL30;
        com.badlogic.gdx.Files.FileType fileType21 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType21);
        lwjgl3ApplicationConfiguration16.g = 100;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration25);
        lwjgl3ApplicationConfiguration26.r = ' ';
        boolean boolean29 = lwjgl3ApplicationConfiguration26.getuseGL30();
        lwjgl3ApplicationConfiguration26.useGL30 = false;
        lwjgl3ApplicationConfiguration26.windowMaxHeight = (-256);
        lwjgl3ApplicationConfiguration26.audioDeviceBufferCount = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration36.stencil = 10;
        int int39 = lwjgl3ApplicationConfiguration36.depth;
        boolean boolean40 = lwjgl3ApplicationConfiguration36.vSyncEnabled;
        lwjgl3ApplicationConfiguration36.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration36.hdpiMode = hdpiMode43;
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration16.hdpiMode = hdpiMode43;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode43);
        boolean boolean48 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int49 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.windowY = 267782144;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-65501);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3WindowListener12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + fileType21 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType21.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 16 + "'", int39 == 16);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
    }

    @Test
    public void test12302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12302");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1567), (-32512.0f), (float) (-295168), 0.0f);
    }

    @Test
    public void test12303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12303");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test12304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12304");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 16771616;
        int int16 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int17 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test12305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12305");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setTitle("");
        int int7 = lwjgl3ApplicationConfiguration1.getgles30ContextMinorVersion();
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode8);
        int int10 = lwjgl3ApplicationConfiguration1.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources = 0;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test12306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12306");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.windowHeight = (-8257792);
        lwjgl3ApplicationConfiguration0.setwindowY((-480788480));
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-134217944);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test12307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12307");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(241789056);
    }

    @Test
    public void test12308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12308");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int11 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int12 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowHeight = 626699475;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-42115328), 7536639, (-65));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test12309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12309");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        int int20 = lwjgl3ApplicationConfiguration17.depth;
        lwjgl3ApplicationConfiguration17.windowX = (short) 100;
        lwjgl3ApplicationConfiguration17.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType26 = lwjgl3ApplicationConfiguration17.getpreferencesFileType();
        int int27 = lwjgl3ApplicationConfiguration17.getwindowY();
        lwjgl3ApplicationConfiguration17.samples = 512;
        com.badlogic.gdx.graphics.Color color30 = lwjgl3ApplicationConfiguration17.initialBackgroundColor;
        int int31 = lwjgl3ApplicationConfiguration17.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = lwjgl3ApplicationConfiguration17.hdpiMode;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode32);
        int int34 = lwjgl3ApplicationConfiguration16.windowX;
        com.badlogic.gdx.graphics.Color color35 = lwjgl3ApplicationConfiguration16.initialBackgroundColor;
        color35.a = (-268886016);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(color35);
    }

    @Test
    public void test12310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12310");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration9);
        lwjgl3ApplicationConfiguration10.setWindowPosition((int) (short) 10, 10);
        boolean boolean14 = lwjgl3ApplicationConfiguration10.useGL30;
        com.badlogic.gdx.Files.FileType fileType15 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType15);
        com.badlogic.gdx.Files.FileType fileType17 = lwjgl3ApplicationConfiguration10.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType17);
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        int int23 = lwjgl3ApplicationConfiguration22.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int26 = lwjgl3ApplicationConfiguration25.audioDeviceBufferSize;
        int int27 = lwjgl3ApplicationConfiguration25.windowMinHeight;
        com.badlogic.gdx.Files.FileType fileType28 = lwjgl3ApplicationConfiguration25.getpreferencesFileType();
        lwjgl3ApplicationConfiguration22.setPreferencesConfig("00000000", fileType28);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType28;
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-22272), (-608175), 61440, 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType17 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType17.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12311");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.stencil = 10;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color9;
        com.badlogic.gdx.graphics.Color color15 = color9.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color9, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int20 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 33791;
        lwjgl3ApplicationConfiguration0.setdepth((int) ' ');
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-150));
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.setTitle("ff000000");
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-1504);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test12312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12312");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration10.windowListener;
        int int14 = lwjgl3ApplicationConfiguration10.getsamples();
        com.badlogic.gdx.Files.FileType fileType15 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration10.preferencesFileType = fileType15;
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("00000000", fileType15);
        java.lang.String str18 = lwjgl3ApplicationConfiguration1.title;
        int int19 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferSize();
        int int20 = lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration1.windowX = 63519;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test12313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12313");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12314");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        int int9 = lwjgl3ApplicationConfiguration7.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration7.windowHeight;
        lwjgl3ApplicationConfiguration7.setAudioConfig((-256), 8, 97);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration7.setWindowListener(lwjgl3WindowListener15);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
    }

    @Test
    public void test12315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12315");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = 765;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        int int17 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int18 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 17;
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.CYAN;
        int int22 = com.badlogic.gdx.graphics.Color.rgba8888(color21);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(43371);
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color31 = color26.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        float float32 = color26.g;
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color35 = color33.mul((float) 786400);
        com.badlogic.gdx.graphics.Color color36 = color35.clamp();
        int int37 = color36.toIntBits();
        com.badlogic.gdx.graphics.Color color38 = color25.mul(color36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration39);
        int int41 = lwjgl3ApplicationConfiguration40.samples;
        lwjgl3ApplicationConfiguration40.setwindowY(9);
        lwjgl3ApplicationConfiguration40.setWindowPosition(1465382614, (int) '#');
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        float float52 = color51.a;
        lwjgl3ApplicationConfiguration40.setInitialBackgroundColor(color51);
        com.badlogic.gdx.graphics.Color color54 = color25.set(color51);
        com.badlogic.gdx.graphics.Color color55 = color21.add(color54);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color55);
        com.badlogic.gdx.Files.FileType fileType57 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(color21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-16711936) + "'", int37 == (-16711936));
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 1.0f + "'", float52 == 1.0f);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertTrue("'" + fileType57 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType57.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12316");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (byte) 10, 0.0f, (float) (-10224128), (float) (-16711681));
        java.lang.String str5 = color4.toString();
        com.badlogic.gdx.graphics.Color color7 = color4.mul((float) 1671172080);
        int int8 = com.badlogic.gdx.graphics.Color.rgb565(color4);
        color4.g = (-1.0632526E37f);
        int int11 = color4.toIntBits();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ff000000" + "'", str5, "ff000000");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 63488 + "'", int8 == 63488);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 255 + "'", int11 == 255);
    }

    @Test
    public void test12317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12317");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean3 = lwjgl3ApplicationConfiguration2.getdisableAudio();
        int int4 = lwjgl3ApplicationConfiguration2.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration2.setWindowListener(lwjgl3WindowListener5);
        int int7 = lwjgl3ApplicationConfiguration2.windowX;
        lwjgl3ApplicationConfiguration2.setWindowSizeLimits(16777013, 131072, (-15724560), (-296960));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test12318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12318");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.windowWidth = (-393216);
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-9);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-36592));
        int int18 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test12319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12319");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-271), (float) (-1476467812), (float) ' ', (float) 97);
        com.badlogic.gdx.graphics.Color color9 = color4.sub((float) (-2146373888), 0.0f, (float) (-48896), 0.0f);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color9);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test12320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12320");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-33584897);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-3060));
        int int19 = lwjgl3ApplicationConfiguration0.getdepth();
        int int20 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test12321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12321");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color27 = color21.lerp((float) (-250674975), (float) 163200, (float) (-220), (float) (-7462090), (float) 2088192);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color27, (-95));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test12322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12322");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color6 = color0.lerp((float) (byte) 10, (float) 1465382614, (float) 40664886, (float) (-1L), (float) (-2147413088));
        com.badlogic.gdx.graphics.Color color8 = color6.mul((float) (-16842496));
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color9, (-246497280));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test12323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12323");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-22), (float) 1465382614, (float) 507505200, (-1.0407874E38f));
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color();
        int int7 = color6.toIntBits();
        int int8 = com.badlogic.gdx.graphics.Color.rgba4444(color6);
        com.badlogic.gdx.graphics.Color color10 = color5.lerp(color6, 0.0f);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.graphics.Color color12 = color6.sub(color11);
        com.badlogic.gdx.graphics.Color color13 = color4.mul(color12);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((-65025));
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((float) (short) -1, (float) (-40036), 0.98039216f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color22 = color15.lerp(color20, (float) 786400);
        com.badlogic.gdx.graphics.Color color23 = color13.sub(color22);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color13);
        color24.g = 16724807;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test12324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12324");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 16);
        float float4 = color1.g;
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, (-1047005184));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color5, (-15));
        com.badlogic.gdx.graphics.Color color15 = color5.lerp((float) 491505, (float) (-16728320), (float) (-12032), 0.4392157f, (-1.4702226E20f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test12325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12325");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        boolean boolean3 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int4 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int5 = lwjgl3ApplicationConfiguration0.b;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-553651968));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode9 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode9;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12326");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("ef000000");
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test12327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12327");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color8, 16);
        color8.a = 0L;
        com.badlogic.gdx.graphics.Color color13 = color6.mul(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        int int20 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        boolean boolean22 = color18.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        com.badlogic.gdx.graphics.Color color33 = color27.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color34 = color18.mul(color33);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color36 = color8.set(color35);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration1.setwindowMinWidth(2);
        java.lang.String str40 = lwjgl3ApplicationConfiguration1.preferencesDirectory;
        lwjgl3ApplicationConfiguration1.setsamples((-2089026813));
        boolean boolean43 = lwjgl3ApplicationConfiguration1.windowDecorated;
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = (-2105736960);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = lwjgl3ApplicationConfiguration1.hdpiMode;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ".prefs/" + "'", str40, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test12328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12328");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-516), (float) (-402817440), 3.3362E-41f, (float) (-12032));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-164096) + "'", int4 == (-164096));
    }

    @Test
    public void test12329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12329");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color23 = color21.clamp();
        int int24 = com.badlogic.gdx.graphics.Color.rgba8888(color21);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.stencil = 10;
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration26.initialBackgroundColor = color30;
        com.badlogic.gdx.graphics.Color color36 = color30.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color40 = color30.lerp(color38, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color40, (-545421065));
        color40.a = 1L;
        com.badlogic.gdx.graphics.Color color49 = color40.mul(0.0f, (float) 34816, (-1.7014086E38f), (float) (-548854));
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color(color49);
        color50.b = (-2105697536);
        com.badlogic.gdx.graphics.Color color53 = color21.sub(color50);
        com.badlogic.gdx.graphics.Color color58 = color50.add((float) 11, (float) (-22), (float) (-537067520), (-4.2416786E-22f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-256) + "'", int24 == (-256));
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color58);
    }

    @Test
    public void test12330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12330");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration8.setdepth(480);
        lwjgl3ApplicationConfiguration8.windowMaxWidth = 132184352;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode13 = null;
        lwjgl3ApplicationConfiguration8.fullscreenMode = lwjgl3DisplayMode13;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
    }

    @Test
    public void test12331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12331");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setwindowWidth((-40036));
        int int13 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.setWindowPosition(2047, 1677721600);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.windowWidth = (-545421065);
        lwjgl3ApplicationConfiguration0.setdepth(0);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "33f3ff36";
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test12332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12332");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration1.setdisableAudio(true);
        int int9 = lwjgl3ApplicationConfiguration1.b;
        int int10 = lwjgl3ApplicationConfiguration1.windowY;
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferSize((-1662054400));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test12333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12333");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.r = (-29852);
        lwjgl3ApplicationConfiguration0.depth = 163200;
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-1077952513);
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.depth = 31;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test12334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12334");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration1.windowWidth = (-16711681);
        lwjgl3ApplicationConfiguration1.title = ".prefs/";
        int int11 = lwjgl3ApplicationConfiguration1.getgles30ContextMajorVersion();
        boolean boolean12 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12335");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000000";
        int int11 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        int int12 = lwjgl3ApplicationConfiguration0.stencil;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
    }

    @Test
    public void test12336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12336");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(2);
        lwjgl3ApplicationConfiguration0.title = "00ffffff";
        int int12 = lwjgl3ApplicationConfiguration0.b;
        int int13 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.g = (-7395329);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test12337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12337");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-10224128), (float) (-10223606), (float) 1, (float) 10);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color4, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.stencil = 10;
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration7.initialBackgroundColor = color11;
        int int13 = com.badlogic.gdx.graphics.Color.rgb888(color11);
        boolean boolean15 = color11.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration16.initialBackgroundColor = color20;
        com.badlogic.gdx.graphics.Color color26 = color20.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color27 = color11.mul(color26);
        com.badlogic.gdx.graphics.Color color29 = color26.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color26, 3);
        com.badlogic.gdx.graphics.Color color33 = color26.set((int) (short) 1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color33, (-40036));
        com.badlogic.gdx.graphics.Color color36 = color33.cpy();
        com.badlogic.gdx.graphics.Color color38 = color36.set((int) 'a');
        com.badlogic.gdx.graphics.Color color40 = color4.lerp(color36, (float) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration41);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color(color43);
        lwjgl3ApplicationConfiguration41.setInitialBackgroundColor(color43);
        com.badlogic.gdx.graphics.Color color46 = color40.set(color43);
        float float47 = color46.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration48.stencil = 10;
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration48.initialBackgroundColor = color52;
        lwjgl3ApplicationConfiguration48.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color56 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration48.initialBackgroundColor = color56;
        boolean boolean58 = lwjgl3ApplicationConfiguration48.getwindowResizable();
        int int59 = lwjgl3ApplicationConfiguration48.a;
        lwjgl3ApplicationConfiguration48.windowDecorated = true;
        boolean boolean62 = lwjgl3ApplicationConfiguration48.getvSyncEnabled();
        lwjgl3ApplicationConfiguration48.setwindowMinWidth((-29852));
        boolean boolean65 = color46.equals((java.lang.Object) (-29852));
        com.badlogic.gdx.graphics.Color color71 = color46.lerp((-3.8685626E25f), (float) (-1686966016), (-1.6951653E38f), (float) 61680, (float) 13159);
        com.badlogic.gdx.graphics.Color color72 = com.badlogic.gdx.graphics.Color.BLUE;
        com.badlogic.gdx.graphics.Color color73 = color72.cpy();
        color73.g = (-1.0f);
        com.badlogic.gdx.graphics.Color color76 = new com.badlogic.gdx.graphics.Color(color73);
        int int77 = com.badlogic.gdx.graphics.Color.rgb888(color76);
        com.badlogic.gdx.graphics.Color color78 = color71.mul(color76);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 8 + "'", int59 == 8);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(color71);
        org.junit.Assert.assertNotNull(color72);
        org.junit.Assert.assertNotNull(color73);
// flaky:         org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-65280) + "'", int77 == (-65280));
        org.junit.Assert.assertNotNull(color78);
    }

    @Test
    public void test12338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12338");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) '4');
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test12339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12339");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        int int8 = lwjgl3ApplicationConfiguration0.g;
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test12340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12340");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLD;
        color0.r = 'a';
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color3);
        color4.a = 2.3509886E-38f;
        color4.g = 16711680;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color4, (-1463708416));
        com.badlogic.gdx.graphics.Color color12 = color4.mul((float) (-2284544));
        com.badlogic.gdx.graphics.Color color17 = color12.mul((float) (-503341578), (float) 2113929471, (float) (-973078528), (-1.7012561E38f));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test12341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12341");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration9.useOpenGL3(true, (-100466688), (-62876));
        lwjgl3ApplicationConfiguration9.setwindowHeight((-1077952513));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = lwjgl3ApplicationConfiguration9.windowListener;
        lwjgl3ApplicationConfiguration9.title = "827d0000";
        lwjgl3ApplicationConfiguration9.setwindowHeight((-15728400));
        lwjgl3ApplicationConfiguration9.setwindowHeight(16777214);
        int int24 = lwjgl3ApplicationConfiguration9.gles30ContextMinorVersion;
        boolean boolean25 = lwjgl3ApplicationConfiguration9.vSyncEnabled;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNull(lwjgl3WindowListener17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-62876) + "'", int24 == (-62876));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test12342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12342");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.windowY = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration1.windowListener = lwjgl3WindowListener12;
        int int14 = lwjgl3ApplicationConfiguration1.stencil;
        lwjgl3ApplicationConfiguration1.useOpenGL3(true, 65535, 40664886);
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferSize((-142049825));
        int int21 = lwjgl3ApplicationConfiguration1.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        int int26 = lwjgl3ApplicationConfiguration23.b;
        boolean boolean27 = lwjgl3ApplicationConfiguration23.vSyncEnabled;
        lwjgl3ApplicationConfiguration23.setuseGL30(false);
        int int30 = lwjgl3ApplicationConfiguration23.getwindowY();
        int int31 = lwjgl3ApplicationConfiguration23.audioDeviceBufferCount;
        int int32 = lwjgl3ApplicationConfiguration23.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.stencil = 10;
        int int36 = lwjgl3ApplicationConfiguration33.b;
        boolean boolean37 = lwjgl3ApplicationConfiguration33.vSyncEnabled;
        lwjgl3ApplicationConfiguration33.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration33.hdpiMode = hdpiMode40;
        com.badlogic.gdx.Files.FileType fileType42 = lwjgl3ApplicationConfiguration33.getpreferencesFileType();
        lwjgl3ApplicationConfiguration23.setpreferencesFileType(fileType42);
        int int44 = lwjgl3ApplicationConfiguration23.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int46 = lwjgl3ApplicationConfiguration45.audioDeviceBufferSize;
        int int47 = lwjgl3ApplicationConfiguration45.windowMinHeight;
        com.badlogic.gdx.Files.FileType fileType48 = lwjgl3ApplicationConfiguration45.getpreferencesFileType();
        lwjgl3ApplicationConfiguration45.title = "";
        lwjgl3ApplicationConfiguration45.windowWidth = (-4090624);
        com.badlogic.gdx.Files.FileType fileType53 = lwjgl3ApplicationConfiguration45.preferencesFileType;
        lwjgl3ApplicationConfiguration23.setpreferencesFileType(fileType53);
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType53;
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = (-227328);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + fileType42 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType42.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 512 + "'", int46 == 512);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + fileType48 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType48.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType53 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType53.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12343");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, (-8.952473E30f), (float) 3309388, (float) 130029600);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.stencil = 10;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color9;
        int int11 = com.badlogic.gdx.graphics.Color.rgb888(color9);
        boolean boolean13 = color9.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        com.badlogic.gdx.graphics.Color color24 = color18.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color25 = color9.mul(color24);
        com.badlogic.gdx.graphics.Color color27 = color24.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color24, 3);
        com.badlogic.gdx.graphics.Color color31 = color24.set((int) (short) 1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color31, (-40036));
        com.badlogic.gdx.graphics.Color color34 = color31.cpy();
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color((float) 8925, (float) 25500, (-3.587E-42f), 0.0f);
        com.badlogic.gdx.graphics.Color color40 = color34.add(color39);
        com.badlogic.gdx.graphics.Color color41 = color4.sub(color34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.stencil = 10;
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration42.initialBackgroundColor = color46;
        float float48 = color46.toFloatBits();
        com.badlogic.gdx.graphics.Color color49 = color34.add(color46);
        com.badlogic.gdx.graphics.Color color51 = color34.mul((float) 534839040);
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(65280);
        com.badlogic.gdx.graphics.Color color54 = color51.sub(color53);
        float float55 = color51.a;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.0f + "'", float48 == 0.0f);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 1.0f + "'", float55 == 1.0f);
    }

    @Test
    public void test12344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12344");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-237), 0.0f, (float) (-560496655), (float) (-1208025090));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-14561280) + "'", int4 == (-14561280));
    }

    @Test
    public void test12345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12345");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color22 = color19.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.SKY;
        color23.g = 0L;
        com.badlogic.gdx.graphics.Color color26 = color22.mul(color23);
        com.badlogic.gdx.graphics.Color color28 = color26.set(6349110);
        com.badlogic.gdx.graphics.Color color30 = color28.set((-45312));
        com.badlogic.gdx.graphics.Color color31 = color30.clamp();
        color31.g = 634911;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration34.setwindowResizable(false);
        lwjgl3ApplicationConfiguration34.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration34.gles30ContextMajorVersion = 0;
        int int49 = lwjgl3ApplicationConfiguration34.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration51.stencil = 10;
        int int54 = lwjgl3ApplicationConfiguration51.depth;
        lwjgl3ApplicationConfiguration51.windowX = (short) 100;
        lwjgl3ApplicationConfiguration51.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType60 = lwjgl3ApplicationConfiguration51.getpreferencesFileType();
        int int61 = lwjgl3ApplicationConfiguration51.getwindowY();
        lwjgl3ApplicationConfiguration51.samples = 512;
        com.badlogic.gdx.graphics.Color color64 = lwjgl3ApplicationConfiguration51.initialBackgroundColor;
        int int65 = lwjgl3ApplicationConfiguration51.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode66 = lwjgl3ApplicationConfiguration51.hdpiMode;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration50.setResizable(true);
        boolean boolean70 = color31.equals((java.lang.Object) lwjgl3ApplicationConfiguration50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration71 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 16 + "'", int54 == 16);
        org.junit.Assert.assertTrue("'" + fileType60 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType60.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode66 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode66.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration71);
    }

    @Test
    public void test12346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12346");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444(0.972549f, (-1.7013956E38f), (float) (-427005), (float) (-2147418368));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-102440240) + "'", int4 == (-102440240));
    }

    @Test
    public void test12347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12347");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (byte) 10;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-8943616));
        java.lang.String str16 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration19);
        lwjgl3ApplicationConfiguration20.r = ' ';
        lwjgl3ApplicationConfiguration20.windowResizable = false;
        lwjgl3ApplicationConfiguration20.setResizable(true);
        lwjgl3ApplicationConfiguration20.audioDeviceBufferSize = 862994742;
        lwjgl3ApplicationConfiguration20.windowY = 65520;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration32.stencil = 10;
        int int35 = lwjgl3ApplicationConfiguration32.depth;
        lwjgl3ApplicationConfiguration32.windowX = (short) 100;
        lwjgl3ApplicationConfiguration32.setWindowPosition(16, (int) (byte) 100);
        int int41 = lwjgl3ApplicationConfiguration32.r;
        int int42 = lwjgl3ApplicationConfiguration32.getwindowHeight();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration43);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration45);
        int int47 = lwjgl3ApplicationConfiguration46.samples;
        lwjgl3ApplicationConfiguration46.setwindowY(9);
        lwjgl3ApplicationConfiguration46.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration46.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int56 = lwjgl3ApplicationConfiguration55.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType58 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration55.setPreferencesConfig("", fileType58);
        lwjgl3ApplicationConfiguration46.setpreferencesFileType(fileType58);
        lwjgl3ApplicationConfiguration46.windowMinWidth = (byte) 0;
        lwjgl3ApplicationConfiguration46.windowHeight = (-2147481728);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration65.stencil = 10;
        com.badlogic.gdx.graphics.Color color69 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration65.initialBackgroundColor = color69;
        lwjgl3ApplicationConfiguration65.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color73 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration65.initialBackgroundColor = color73;
        lwjgl3ApplicationConfiguration65.g = 16711680;
        int int77 = lwjgl3ApplicationConfiguration65.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration65.audioDeviceBufferSize = 0;
        int int80 = lwjgl3ApplicationConfiguration65.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = lwjgl3ApplicationConfiguration65.hdpiMode;
        lwjgl3ApplicationConfiguration46.hdpiMode = hdpiMode81;
        lwjgl3ApplicationConfiguration43.hdpiMode = hdpiMode81;
        lwjgl3ApplicationConfiguration32.hdpiMode = hdpiMode81;
        lwjgl3ApplicationConfiguration20.hdpiMode = hdpiMode81;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode81;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".prefs/" + "'", str16, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 16 + "'", int35 == 16);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 480 + "'", int42 == 480);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration44);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 512 + "'", int56 == 512);
        org.junit.Assert.assertTrue("'" + fileType58 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType58.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertNotNull(color73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 9 + "'", int80 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test12348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12348");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-27285));
    }

    @Test
    public void test12349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12349");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-551618560));
        color1.r = 0.0f;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
    }

    @Test
    public void test12350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12350");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.stencil = 10;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color9;
        com.badlogic.gdx.graphics.Color color15 = color9.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color9, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int20 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 33791;
        lwjgl3ApplicationConfiguration0.windowX = 33791;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration25.initialBackgroundColor = color29;
        lwjgl3ApplicationConfiguration25.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration25.initialBackgroundColor = color33;
        lwjgl3ApplicationConfiguration25.windowMaxHeight = 0;
        boolean boolean37 = lwjgl3ApplicationConfiguration25.getwindowDecorated();
        boolean boolean38 = lwjgl3ApplicationConfiguration25.getdisableAudio();
        com.badlogic.gdx.Files.FileType fileType39 = lwjgl3ApplicationConfiguration25.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType39);
        int int41 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int42 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int43 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-2023680);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + fileType39 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType39.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 640 + "'", int42 == 640);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 33791 + "'", int43 == 33791);
    }

    @Test
    public void test12351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12351");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', 0, 509920, 863980544, 6349110, 0, 0);
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        lwjgl3ApplicationConfiguration20.setwindowX((int) (short) 0);
        int int25 = lwjgl3ApplicationConfiguration20.getaudioDeviceBufferSize();
        int int26 = lwjgl3ApplicationConfiguration20.windowHeight;
        lwjgl3ApplicationConfiguration20.setaudioDeviceBufferSize(480);
        int int29 = lwjgl3ApplicationConfiguration20.audioDeviceBufferCount;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration20.hdpiMode = hdpiMode30;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode30);
        boolean boolean33 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 480 + "'", int26 == 480);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode30 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode30.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test12352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12352");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int24 = lwjgl3ApplicationConfiguration23.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration23);
        boolean boolean26 = color22.equals((java.lang.Object) lwjgl3ApplicationConfiguration23);
        lwjgl3ApplicationConfiguration23.g = (-52344);
        lwjgl3ApplicationConfiguration23.setTitle("");
        lwjgl3ApplicationConfiguration23.windowMaxWidth = 51855;
        com.badlogic.gdx.Files.FileType fileType33 = lwjgl3ApplicationConfiguration23.getpreferencesFileType();
        lwjgl3ApplicationConfiguration23.useVsync(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + fileType33 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType33.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12353");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color23 = color21.set((-41943040));
        float float24 = color23.a;
        com.badlogic.gdx.graphics.Color color29 = color23.add((float) 65339, (-1.7014103E38f), (float) 12312063, 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertNotNull(color29);
    }

    @Test
    public void test12354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12354");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode11;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, 130029600);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((float) (-1671024128), (float) 97, (float) (-256), 1.7014117E38f);
        com.badlogic.gdx.graphics.Color color25 = color20.sub((float) (byte) -1, (float) 16776961, (-256.0f), 0.98039216f);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color25;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 65535;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(color25);
    }

    @Test
    public void test12355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12355");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        lwjgl3ApplicationConfiguration15.setWindowPosition((int) (short) 10, 10);
        boolean boolean19 = lwjgl3ApplicationConfiguration15.useGL30;
        com.badlogic.gdx.Files.FileType fileType20 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType20);
        com.badlogic.gdx.Files.FileType fileType22 = lwjgl3ApplicationConfiguration15.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        lwjgl3ApplicationConfiguration0.g = 11059605;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.stencil = 10;
        int int29 = lwjgl3ApplicationConfiguration26.b;
        boolean boolean30 = lwjgl3ApplicationConfiguration26.vSyncEnabled;
        int int31 = lwjgl3ApplicationConfiguration26.getsamples();
        com.badlogic.gdx.graphics.Color color32 = lwjgl3ApplicationConfiguration26.initialBackgroundColor;
        int int33 = lwjgl3ApplicationConfiguration26.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration26);
        com.badlogic.gdx.Files.FileType fileType35 = lwjgl3ApplicationConfiguration26.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType35;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 20191;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType22 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType22.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16 + "'", int33 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration34);
        org.junit.Assert.assertTrue("'" + fileType35 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType35.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12356");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color2);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int7 = lwjgl3ApplicationConfiguration6.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("", fileType9);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00ffff00", fileType9);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
    }

    @Test
    public void test12357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12357");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-4466532);
        lwjgl3ApplicationConfiguration0.windowMinHeight = 100;
        lwjgl3ApplicationConfiguration0.setwindowWidth((-4096));
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test12358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12358");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2136013568));
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (-63488));
    }

    @Test
    public void test12359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12359");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000000";
        lwjgl3ApplicationConfiguration0.windowY = 8;
        int int13 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        int int17 = lwjgl3ApplicationConfiguration14.b;
        boolean boolean18 = lwjgl3ApplicationConfiguration14.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType19 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration14.setpreferencesFileType(fileType19);
        int int21 = lwjgl3ApplicationConfiguration14.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        boolean boolean23 = lwjgl3ApplicationConfiguration14.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.stencil = 10;
        int int27 = lwjgl3ApplicationConfiguration24.depth;
        int int28 = lwjgl3ApplicationConfiguration24.stencil;
        int int29 = lwjgl3ApplicationConfiguration24.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode30);
        int int32 = lwjgl3ApplicationConfiguration24.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.stencil = 10;
        int int36 = lwjgl3ApplicationConfiguration33.b;
        boolean boolean37 = lwjgl3ApplicationConfiguration33.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType38 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration33.setpreferencesFileType(fileType38);
        int int40 = lwjgl3ApplicationConfiguration33.depth;
        lwjgl3ApplicationConfiguration33.windowX = 765;
        int int43 = lwjgl3ApplicationConfiguration33.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = lwjgl3ApplicationConfiguration33.hdpiMode;
        lwjgl3ApplicationConfiguration24.hdpiMode = hdpiMode44;
        lwjgl3ApplicationConfiguration14.hdpiMode = hdpiMode44;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode44;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode48 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener49 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener49;
        lwjgl3ApplicationConfiguration0.b = (-2305);
        lwjgl3ApplicationConfiguration0.title = "ffffff64";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + fileType19 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType19.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16 + "'", int27 == 16);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + fileType38 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType38.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 16 + "'", int40 == 16);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNull(lwjgl3DisplayMode48);
    }

    @Test
    public void test12360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12360");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.a = (-1);
        int int4 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(130029600);
        lwjgl3ApplicationConfiguration0.windowMinWidth = 33791;
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(61455);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.windowY = (-2147413088);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener18;
        int int20 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(653055);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test12361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12361");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-5543167), (-458762));
        lwjgl3ApplicationConfiguration0.setdepth(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        int int28 = lwjgl3ApplicationConfiguration25.depth;
        java.lang.String str29 = lwjgl3ApplicationConfiguration25.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.stencil = 10;
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration30.initialBackgroundColor = color34;
        com.badlogic.gdx.graphics.Color color40 = color34.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color34, (int) (byte) 1);
        lwjgl3ApplicationConfiguration25.initialBackgroundColor = color34;
        boolean boolean44 = lwjgl3ApplicationConfiguration25.windowDecorated;
        lwjgl3ApplicationConfiguration25.setAudioConfig((int) (short) 10, 765, 0);
        lwjgl3ApplicationConfiguration25.setpreferencesDirectory("");
        boolean boolean51 = lwjgl3ApplicationConfiguration25.getvSyncEnabled();
        com.badlogic.gdx.Files.FileType fileType52 = lwjgl3ApplicationConfiguration25.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("8b4513ff", fileType52);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 8420355;
        int int56 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16 + "'", int28 == 16);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + fileType52 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType52.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 8420355 + "'", int56 == 8420355);
    }

    @Test
    public void test12362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12362");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-551618560));
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        float float3 = color2.toFloatBits();
        float float4 = color2.r;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color2, 17);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.2786278E-38f + "'", float3 == 2.2786278E-38f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8745098f + "'", float4 == 0.8745098f);
    }

    @Test
    public void test12363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12363");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.r = (-10);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        boolean boolean9 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        int int12 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test12364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12364");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.g = (-1);
        int int16 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.windowHeight = (-151);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test12365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12365");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.0431761E38f), (float) (-805306623), (float) (-2832), (float) (-65536));
    }

    @Test
    public void test12366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12366");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 16);
        float float4 = color1.g;
        int int5 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color6, (-35));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33791 + "'", int5 == 33791);
    }

    @Test
    public void test12367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12367");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = ' ';
        lwjgl3ApplicationConfiguration0.windowMinHeight = 40664886;
        lwjgl3ApplicationConfiguration0.setwindowX(537535241);
        lwjgl3ApplicationConfiguration0.setwindowX((-242));
    }

    @Test
    public void test12368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12368");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        int int12 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 455196480;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test12369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12369");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color8, 16);
        color8.a = 0L;
        com.badlogic.gdx.graphics.Color color13 = color6.mul(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        int int20 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        boolean boolean22 = color18.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        com.badlogic.gdx.graphics.Color color33 = color27.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color34 = color18.mul(color33);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color36 = color8.set(color35);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration1.setwindowMinWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.stencil = 10;
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration40.initialBackgroundColor = color44;
        int int46 = com.badlogic.gdx.graphics.Color.rgb888(color44);
        boolean boolean48 = color44.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration49.stencil = 10;
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration49.initialBackgroundColor = color53;
        com.badlogic.gdx.graphics.Color color59 = color53.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color60 = color44.mul(color59);
        com.badlogic.gdx.graphics.Color color61 = new com.badlogic.gdx.graphics.Color(color59);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color59);
        lwjgl3ApplicationConfiguration1.windowDecorated = true;
        boolean boolean65 = lwjgl3ApplicationConfiguration1.vSyncEnabled;
        lwjgl3ApplicationConfiguration1.setWindowPosition(534839040, 634911);
        lwjgl3ApplicationConfiguration1.setdepth(7680);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test12370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12370");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-805306623));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test12371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12371");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color6 = color1.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((float) 0L, (float) 640, (float) ' ', (float) (-1));
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color13 = color1.set(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        int int20 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        boolean boolean22 = color18.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        com.badlogic.gdx.graphics.Color color33 = color27.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color34 = color18.mul(color33);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color33);
        float float36 = color35.toFloatBits();
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color((-65025));
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color((float) (short) -1, (float) (-40036), 0.98039216f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color45 = color38.lerp(color43, (float) 786400);
        int int46 = color45.toIntBits();
        float float47 = color45.b;
        com.badlogic.gdx.graphics.Color color48 = com.badlogic.gdx.graphics.Color.NAVY;
        color48.g = (short) 10;
        com.badlogic.gdx.graphics.Color color51 = color45.add(color48);
        com.badlogic.gdx.graphics.Color color53 = color35.lerp(color51, (float) 1L);
        com.badlogic.gdx.graphics.Color color54 = color12.add(color53);
        float float55 = color53.r;
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 2.3509886E-38f + "'", float36 == 2.3509886E-38f);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-65536) + "'", int46 == (-65536));
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 1.0f + "'", float47 == 1.0f);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
    }

    @Test
    public void test12372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12372");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.9843137f, (float) 16738740, (float) (-65280), (-1.0f));
        int int5 = com.badlogic.gdx.graphics.Color.rgb565(color4);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color8 = color7.clamp();
        float float9 = color7.r;
        com.badlogic.gdx.graphics.Color color10 = color4.set(color7);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color4, (-76353280));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 63456 + "'", int5 == 63456);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test12373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12373");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) '4');
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "d2b48cff";
        int int16 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test12374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12374");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-5543167));
        com.badlogic.gdx.graphics.Color color3 = color1.set((-1630253056));
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test12375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12375");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration7.setgles30ContextMinorVersion(8);
        int int10 = lwjgl3ApplicationConfiguration7.windowMinHeight;
        lwjgl3ApplicationConfiguration7.windowMaxHeight = (-2147413088);
        lwjgl3ApplicationConfiguration7.windowY = (-100466688);
        int int15 = lwjgl3ApplicationConfiguration7.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration7.disableAudio = true;
        lwjgl3ApplicationConfiguration7.depth = (-4089);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration7.setWindowSizeLimits(97, (-868), 2032, (-15728623));
        boolean boolean26 = lwjgl3ApplicationConfiguration7.getdisableAudio();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test12376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12376");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        int int10 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-10), 0);
        int int15 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.g = 1621098495;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.stencil = 10;
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration18.initialBackgroundColor = color22;
        com.badlogic.gdx.graphics.Color color28 = color22.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color32, 16);
        color32.a = 0L;
        com.badlogic.gdx.graphics.Color color37 = color30.mul(color32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.stencil = 10;
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration38.initialBackgroundColor = color42;
        int int44 = com.badlogic.gdx.graphics.Color.rgb888(color42);
        boolean boolean46 = color42.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration47.stencil = 10;
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration47.initialBackgroundColor = color51;
        com.badlogic.gdx.graphics.Color color57 = color51.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color58 = color42.mul(color57);
        com.badlogic.gdx.graphics.Color color59 = new com.badlogic.gdx.graphics.Color(color57);
        com.badlogic.gdx.graphics.Color color60 = color32.set(color59);
        com.badlogic.gdx.graphics.Color color61 = color28.set(color59);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color61, 10);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color61;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color61, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color61, (-608));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(color61);
    }

    @Test
    public void test12377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12377");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        lwjgl3ApplicationConfiguration0.setwindowX(1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = null;
        lwjgl3ApplicationConfiguration10.fullscreenMode = lwjgl3DisplayMode11;
        lwjgl3ApplicationConfiguration10.windowDecorated = false;
        lwjgl3ApplicationConfiguration10.windowDecorated = false;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
    }

    @Test
    public void test12378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12378");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int6 = lwjgl3ApplicationConfiguration5.windowY;
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration5.initialBackgroundColor;
        int int8 = lwjgl3ApplicationConfiguration5.getaudioDeviceBufferSize();
        int int9 = lwjgl3ApplicationConfiguration5.b;
        boolean boolean10 = lwjgl3ApplicationConfiguration5.vSyncEnabled;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test12379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12379");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int12 = lwjgl3ApplicationConfiguration8.getwindowX();
        boolean boolean13 = lwjgl3ApplicationConfiguration8.useGL30;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12380");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(0, (-2130706432), (-95), (-2013790208));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0700285E38f) + "'", float4 == (-1.0700285E38f));
    }

    @Test
    public void test12381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12381");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-12);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(2113863936);
        lwjgl3ApplicationConfiguration0.setdepth((-59475968));
        lwjgl3ApplicationConfiguration0.setwindowX((-2385));
        int int17 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = lwjgl3ApplicationConfiguration0.windowListener;
        int int20 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertNull(lwjgl3WindowListener18);
        org.junit.Assert.assertNull(lwjgl3WindowListener19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
    }

    @Test
    public void test12382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12382");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = 862994742;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration14.windowMaxHeight = (-2147413088);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration25);
        lwjgl3ApplicationConfiguration26.r = ' ';
        boolean boolean29 = lwjgl3ApplicationConfiguration26.getuseGL30();
        lwjgl3ApplicationConfiguration26.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration33.setwindowResizable(false);
        lwjgl3ApplicationConfiguration33.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration33.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration33.setWindowedMode(1465382614, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType51 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration33.setpreferencesFileType(fileType51);
        lwjgl3ApplicationConfiguration26.setPreferencesConfig("ff000000", fileType51);
        lwjgl3ApplicationConfiguration14.setpreferencesFileType(fileType51);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType51;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        int int58 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + fileType51 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType51.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
    }

    @Test
    public void test12383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12383");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (byte) 0, (-8.952473E30f), (float) (-10224128), (float) 6349110);
        int int5 = color4.toIntBits();
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color11 = color6.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        int int12 = com.badlogic.gdx.graphics.Color.argb8888(color6);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color6, 8925);
        com.badlogic.gdx.graphics.Color color19 = color6.sub((float) 167772160, (float) (-100466688), (float) 0, (float) (-164075620));
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color19, 117436161);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(color19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-16777216) + "'", int5 == (-16777216));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-16711936) + "'", int12 == (-16711936));
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test12384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12384");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color8, 16);
        color8.a = 0L;
        com.badlogic.gdx.graphics.Color color13 = color6.mul(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        int int20 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        boolean boolean22 = color18.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        com.badlogic.gdx.graphics.Color color33 = color27.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color34 = color18.mul(color33);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color36 = color8.set(color35);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration1.setWindowSizeLimits(1953529918, 9, (int) (byte) 0, 0);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = 11059605;
        int int45 = lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.graphics.Color color47 = lwjgl3ApplicationConfiguration1.initialBackgroundColor;
        lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion = 0;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration46);
        org.junit.Assert.assertNotNull(color47);
    }

    @Test
    public void test12385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12385");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        lwjgl3ApplicationConfiguration1.setWindowSizeLimits((int) (byte) -1, (int) (byte) -1, (int) (byte) 1, 40664886);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.stencil = 10;
        int int18 = lwjgl3ApplicationConfiguration15.depth;
        int int19 = lwjgl3ApplicationConfiguration15.stencil;
        int int20 = lwjgl3ApplicationConfiguration15.getwindowY();
        lwjgl3ApplicationConfiguration15.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration15.setwindowMinWidth(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        int int28 = lwjgl3ApplicationConfiguration25.b;
        boolean boolean29 = lwjgl3ApplicationConfiguration25.vSyncEnabled;
        lwjgl3ApplicationConfiguration25.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType32 = lwjgl3ApplicationConfiguration25.getpreferencesFileType();
        lwjgl3ApplicationConfiguration15.preferencesFileType = fileType32;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType32);
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferSize((-569376768));
        lwjgl3ApplicationConfiguration1.useOpenGL3(true, (-153276416), (-4089));
        boolean boolean41 = lwjgl3ApplicationConfiguration1.windowDecorated;
        lwjgl3ApplicationConfiguration1.setWindowPosition((-131072), (-1308622848));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test12386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12386");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        java.lang.String str5 = lwjgl3ApplicationConfiguration1.title;
        int int6 = lwjgl3ApplicationConfiguration1.a;
        int int7 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration1.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        java.lang.String str11 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion((-234942464));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
    }

    @Test
    public void test12387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12387");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        int int10 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int11 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.g = (-16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        int int17 = lwjgl3ApplicationConfiguration14.depth;
        int int18 = lwjgl3ApplicationConfiguration14.stencil;
        lwjgl3ApplicationConfiguration14.gles30ContextMajorVersion = (-16580607);
        lwjgl3ApplicationConfiguration14.setDecorated(true);
        lwjgl3ApplicationConfiguration14.gles30ContextMinorVersion = 0;
        lwjgl3ApplicationConfiguration14.setwindowWidth((-5543167));
        com.badlogic.gdx.Files.FileType fileType27 = lwjgl3ApplicationConfiguration14.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType27;
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test12388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12388");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color8, 16);
        color8.a = 0L;
        com.badlogic.gdx.graphics.Color color13 = color6.mul(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        int int20 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        boolean boolean22 = color18.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        com.badlogic.gdx.graphics.Color color33 = color27.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color34 = color18.mul(color33);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color36 = color8.set(color35);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration1.setwindowResizable(false);
        int int40 = lwjgl3ApplicationConfiguration1.windowMaxHeight;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test12389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12389");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setsamples((-1077952513));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = null;
        lwjgl3ApplicationConfiguration10.fullscreenMode = lwjgl3DisplayMode11;
        lwjgl3ApplicationConfiguration10.useVsync(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
    }

    @Test
    public void test12390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12390");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.r = 8;
        lwjgl3ApplicationConfiguration0.windowHeight = 0;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(0);
        lwjgl3ApplicationConfiguration0.windowWidth = (-369098752);
        lwjgl3ApplicationConfiguration0.setsamples((-3825));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
    }

    @Test
    public void test12391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12391");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (byte) 10, 0.0f, (float) (-10224128), (float) (-16711681));
        java.lang.String str5 = color4.toString();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(2147483647);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color23 = color13.lerp(color21, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color23, (-545421065));
        int int26 = color23.toIntBits();
        com.badlogic.gdx.graphics.Color color27 = color23.clamp();
        com.badlogic.gdx.graphics.Color color28 = color8.mul(color27);
        com.badlogic.gdx.graphics.Color color30 = color6.lerp(color8, (float) (-1201405952));
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str32 = color6.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ff000000" + "'", str5, "ff000000");
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-142049825) + "'", int26 == (-142049825));
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ff000000" + "'", str32, "ff000000");
    }

    @Test
    public void test12392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12392");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        java.lang.String str9 = lwjgl3ApplicationConfiguration7.getpreferencesDirectory();
        boolean boolean10 = lwjgl3ApplicationConfiguration7.getvSyncEnabled();
        lwjgl3ApplicationConfiguration7.gles30ContextMinorVersion = 6156;
        boolean boolean13 = lwjgl3ApplicationConfiguration7.getuseGL30();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12393");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (-256);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = 765;
        lwjgl3ApplicationConfiguration1.setTitle("ffffff00");
        lwjgl3ApplicationConfiguration1.vSyncEnabled = true;
        int int15 = lwjgl3ApplicationConfiguration1.getwindowHeight();
        int int16 = lwjgl3ApplicationConfiguration1.g;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test12394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12394");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int10 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test12395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12395");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
    }

    @Test
    public void test12396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12396");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test12397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12397");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.Absolute));
    }

    @Test
    public void test12398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12398");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean3 = lwjgl3ApplicationConfiguration2.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration2);
        int int5 = lwjgl3ApplicationConfiguration2.a;
        lwjgl3ApplicationConfiguration2.setDecorated(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test12399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12399");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 43371, (float) 6528502, (float) (-65025), (float) 480);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((float) 786400, (float) (-6553036), (float) (-255), (float) (-622910848));
        com.badlogic.gdx.graphics.Color color16 = color10.lerp((float) (-15514229), (-9.071428E37f), (-1.0407874E38f), (float) (-1107701632), (float) (-65281));
        int int17 = com.badlogic.gdx.graphics.Color.argb8888(color10);
        com.badlogic.gdx.graphics.Color color18 = color5.sub(color10);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test12400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12400");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType9;
        java.lang.String str11 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.setdisableAudio(false);
        lwjgl3ApplicationConfiguration1.setwindowResizable(true);
        lwjgl3ApplicationConfiguration1.windowMaxWidth = 0;
        int int18 = lwjgl3ApplicationConfiguration1.windowY;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 765 + "'", int18 == 765);
    }

    @Test
    public void test12401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12401");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-25500), (float) (-1630253056), (float) 3, (float) 16751871);
    }

    @Test
    public void test12402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12402");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) -1;
        lwjgl3ApplicationConfiguration0.b = (-16711681);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration12.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((float) 43371, (float) 6528502, (float) (-65025), (float) 480);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        com.badlogic.gdx.graphics.Color color20 = color13.add(color18);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((float) 131, (float) (byte) 1, 0.0f, (-1.6880936E38f));
        com.badlogic.gdx.graphics.Color color26 = color25.cpy();
        com.badlogic.gdx.graphics.Color color27 = color20.add(color26);
        int int28 = com.badlogic.gdx.graphics.Color.rgba8888(color27);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-65536) + "'", int28 == (-65536));
    }

    @Test
    public void test12403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12403");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color4.lerp(color12, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color14, (-545421065));
        color14.a = 1L;
        com.badlogic.gdx.graphics.Color color23 = color14.mul((float) (-10223606), (float) (-40036), (float) 100, (float) (-16711681));
        com.badlogic.gdx.graphics.Color color28 = color23.sub((float) 509920, (-9.238233E37f), (float) (-16), (float) 2);
        com.badlogic.gdx.graphics.Color color29 = color23.clamp();
        int int30 = com.badlogic.gdx.graphics.Color.rgb888(color23);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 65535 + "'", int30 == 65535);
    }

    @Test
    public void test12404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12404");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.stencil = 10;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration12.initialBackgroundColor = color16;
        int int18 = com.badlogic.gdx.graphics.Color.rgb888(color16);
        boolean boolean20 = color16.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.stencil = 10;
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration21.initialBackgroundColor = color25;
        com.badlogic.gdx.graphics.Color color31 = color25.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color32 = color16.mul(color31);
        com.badlogic.gdx.graphics.Color color33 = color31.premultiplyAlpha();
        color31.g = 537535241;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color31;
        lwjgl3ApplicationConfiguration0.setWindowedMode(6349110, 509920);
        boolean boolean40 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int41 = lwjgl3ApplicationConfiguration0.stencil;
        int int42 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setwindowX((-368443392));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 512 + "'", int42 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration43);
    }

    @Test
    public void test12405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12405");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.depth = 100;
        lwjgl3ApplicationConfiguration0.samples = '4';
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 16776961;
        int int11 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.stencil = 10;
        lwjgl3ApplicationConfiguration12.gles30ContextMajorVersion = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration12.windowListener = lwjgl3WindowListener17;
        com.badlogic.gdx.Files.FileType fileType19 = lwjgl3ApplicationConfiguration12.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType19;
        boolean boolean21 = lwjgl3ApplicationConfiguration0.disableAudio;
        java.lang.String str22 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + fileType19 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType19.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test12406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12406");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-2146830848), (-4.317883E-22f), (float) 5961728, (float) (-157713664));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1660420096) + "'", int4 == (-1660420096));
    }

    @Test
    public void test12407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12407");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-2147413088);
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color16 = color11.set((float) 65295, (float) (-10224128), 0.0f, (float) (-256));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color16, (-208));
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color23, 16);
        color23.a = 0L;
        com.badlogic.gdx.graphics.Color color28 = color21.mul(color23);
        com.badlogic.gdx.graphics.Color color33 = color21.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color33, 33791);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color37 = color19.sub(color36);
        com.badlogic.gdx.graphics.Color color38 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color42, 16);
        color42.a = 0L;
        com.badlogic.gdx.graphics.Color color47 = color40.mul(color42);
        com.badlogic.gdx.graphics.Color color52 = color40.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color52, 33791);
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color(color52);
        com.badlogic.gdx.graphics.Color color56 = color38.sub(color55);
        com.badlogic.gdx.graphics.Color color57 = color36.set(color55);
        com.badlogic.gdx.graphics.Color color58 = color57.cpy();
        com.badlogic.gdx.graphics.Color color59 = color16.set(color58);
        java.lang.String str60 = color16.toString();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color16, 49120);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "0083ff00" + "'", str60, "0083ff00");
    }

    @Test
    public void test12408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12408");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType5;
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setwindowX(640);
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.windowX = (-1047005184);
        lwjgl3ApplicationConfiguration0.windowX = (-16764024);
        boolean boolean17 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test12409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12409");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(0.43529412f, (float) 61444, (float) 634911, 0.45490196f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6215656E38f) + "'", float4 == (-1.6215656E38f));
    }

    @Test
    public void test12410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12410");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        java.lang.String str5 = lwjgl3ApplicationConfiguration1.title;
        int int6 = lwjgl3ApplicationConfiguration1.a;
        int int7 = lwjgl3ApplicationConfiguration1.windowY;
        lwjgl3ApplicationConfiguration1.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration10.windowMinHeight = 3211264;
        boolean boolean13 = lwjgl3ApplicationConfiguration10.windowResizable;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode14 = lwjgl3ApplicationConfiguration10.fullscreenMode;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(lwjgl3DisplayMode14);
    }

    @Test
    public void test12411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12411");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.title = "ff000000";
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setTitle("00000000");
        int int13 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int14 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int15 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-589825));
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-16738848);
        int int20 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 480 + "'", int13 == 480);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 480 + "'", int20 == 480);
    }

    @Test
    public void test12412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12412");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.graphics.Color color4 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.title = "d2b48cff";
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, 2113863936, 534839040, (-138042720));
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 640);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("0000dd00");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test12413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12413");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 43371, (float) '4', (-6.540879E32f), 0.0f);
        float float5 = color4.toFloatBits();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.1834E-41f + "'", float5 == 9.1834E-41f);
    }

    @Test
    public void test12414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12414");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        int int8 = lwjgl3ApplicationConfiguration1.getwindowY();
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferSize(1);
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration13.setwindowResizable(false);
        lwjgl3ApplicationConfiguration13.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration13.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration13.setuseGL30(false);
        lwjgl3ApplicationConfiguration13.b = 512;
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color();
        int int34 = color33.toIntBits();
        int int35 = com.badlogic.gdx.graphics.Color.rgba4444(color33);
        com.badlogic.gdx.graphics.Color color37 = color32.lerp(color33, 0.0f);
        color37.r = 40664886;
        lwjgl3ApplicationConfiguration13.initialBackgroundColor = color37;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration41);
        lwjgl3ApplicationConfiguration42.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration42.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration1.hdpiMode = hdpiMode45;
        int int49 = lwjgl3ApplicationConfiguration1.r;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration42);
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
    }

    @Test
    public void test12415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12415");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(862994742);
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color8 = color1.lerp((float) (-1613299457), (float) (-1502683136), (float) (-2146830848), (float) (-250615296), (float) (-63488));
        com.badlogic.gdx.graphics.Color color10 = color8.mul((float) 1157627903);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color15;
        int int17 = com.badlogic.gdx.graphics.Color.rgb888(color15);
        boolean boolean19 = color15.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration20.initialBackgroundColor = color24;
        com.badlogic.gdx.graphics.Color color30 = color24.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color31 = color15.mul(color30);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color30);
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color38 = color33.mul((float) 1L, (float) 3, (float) 0, 1.0f);
        float float39 = color38.a;
        com.badlogic.gdx.graphics.Color color41 = color30.lerp(color38, (float) 863980544);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.stencil = 10;
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration42.initialBackgroundColor = color46;
        int int48 = com.badlogic.gdx.graphics.Color.rgb888(color46);
        boolean boolean50 = color46.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration51.stencil = 10;
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration51.initialBackgroundColor = color55;
        com.badlogic.gdx.graphics.Color color61 = color55.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color62 = color46.mul(color61);
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color(color46);
        float float64 = color63.a;
        com.badlogic.gdx.graphics.Color color65 = color63.cpy();
        com.badlogic.gdx.graphics.Color color67 = color30.lerp(color65, (float) (-1202651136));
        com.badlogic.gdx.graphics.Color color68 = new com.badlogic.gdx.graphics.Color(color65);
        com.badlogic.gdx.graphics.Color color69 = new com.badlogic.gdx.graphics.Color(color65);
        com.badlogic.gdx.graphics.Color color70 = color8.add(color69);
        int int71 = color70.toIntBits();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertNotNull(color70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test12416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12416");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setwindowWidth(6156);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test12417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12417");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration1.b = 161902304;
        lwjgl3ApplicationConfiguration1.useOpenGL3(true, (-134360), 0);
        boolean boolean13 = lwjgl3ApplicationConfiguration1.getwindowResizable();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test12418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12418");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color2);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color2);
        com.badlogic.gdx.graphics.Color color9 = color2.set((float) 509920, 0.0f, 0.0f, (float) (byte) 1);
        color2.g = 0.0f;
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color2);
        color12.r = (-1);
        float float15 = color12.toFloatBits();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.701386E38f) + "'", float15 == (-1.701386E38f));
    }

    @Test
    public void test12419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12419");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = 765;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration13.windowWidth = (-2147413088);
        lwjgl3ApplicationConfiguration13.useOpenGL3(true, 507505200, (-12));
        int int20 = lwjgl3ApplicationConfiguration13.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 507505200 + "'", int20 == 507505200);
    }

    @Test
    public void test12420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12420");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.windowY = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration1.setwindowWidth((-15514229));
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = (-16033380);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = lwjgl3ApplicationConfiguration1.hdpiMode;
        lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion = 0;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test12421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12421");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-5543167), (-458762));
        lwjgl3ApplicationConfiguration0.setdepth(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        int int28 = lwjgl3ApplicationConfiguration25.depth;
        java.lang.String str29 = lwjgl3ApplicationConfiguration25.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.stencil = 10;
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration30.initialBackgroundColor = color34;
        com.badlogic.gdx.graphics.Color color40 = color34.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color34, (int) (byte) 1);
        lwjgl3ApplicationConfiguration25.initialBackgroundColor = color34;
        boolean boolean44 = lwjgl3ApplicationConfiguration25.windowDecorated;
        lwjgl3ApplicationConfiguration25.setAudioConfig((int) (short) 10, 765, 0);
        lwjgl3ApplicationConfiguration25.setpreferencesDirectory("");
        boolean boolean51 = lwjgl3ApplicationConfiguration25.getvSyncEnabled();
        com.badlogic.gdx.Files.FileType fileType52 = lwjgl3ApplicationConfiguration25.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("8b4513ff", fileType52);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(167772160);
        int int56 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16 + "'", int28 == 16);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + fileType52 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType52.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 167772160 + "'", int56 == 167772160);
    }

    @Test
    public void test12422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12422");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 63518;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 16439278;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode20 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode20);
    }

    @Test
    public void test12423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12423");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.windowMaxHeight = (byte) -1;
        lwjgl3ApplicationConfiguration9.setwindowResizable(false);
        lwjgl3ApplicationConfiguration9.windowHeight = 765;
        boolean boolean16 = lwjgl3ApplicationConfiguration9.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration17);
        lwjgl3ApplicationConfiguration18.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode21);
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode21);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode21;
        java.lang.String str25 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test12424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12424");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLD;
        color0.r = 'a';
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color5 = color3.mul(0.0f);
        color5.r = 1.0f;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color13 = color8.add((float) 52625, (-6.604906E36f), (-1.7013899E38f), (float) (-284884992));
        color13.b = 215;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test12425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12425");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (-256);
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration1.initialBackgroundColor;
        lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion = 33791;
        lwjgl3ApplicationConfiguration1.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration1.windowResizable = true;
        lwjgl3ApplicationConfiguration1.r = 2113929471;
        lwjgl3ApplicationConfiguration1.g = (-65025);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test12426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12426");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = lwjgl3ApplicationConfiguration0.windowListener;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNull(lwjgl3WindowListener9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test12427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12427");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener5;
        lwjgl3ApplicationConfiguration0.windowY = 131072;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(6528502);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = lwjgl3ApplicationConfiguration0.windowListener;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(862994742);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color21;
        int int23 = com.badlogic.gdx.graphics.Color.rgb888(color21);
        boolean boolean25 = color21.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.stencil = 10;
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration26.initialBackgroundColor = color30;
        com.badlogic.gdx.graphics.Color color36 = color30.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color37 = color21.mul(color36);
        com.badlogic.gdx.graphics.Color color38 = color36.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color36);
        int int40 = com.badlogic.gdx.graphics.Color.rgba4444(color36);
        float float41 = color36.b;
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color((float) 52625, (float) 8420355, (float) 117436161, (float) (-14483712));
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color(color46);
        com.badlogic.gdx.graphics.Color color48 = color36.add(color46);
        com.badlogic.gdx.graphics.Color color49 = color48.premultiplyAlpha();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color49);
        org.junit.Assert.assertNull(lwjgl3WindowListener11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.0f + "'", float41 == 0.0f);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color49);
    }

    @Test
    public void test12428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12428");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        int int14 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((-10188800));
        boolean boolean17 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-1528823808);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test12429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12429");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        com.badlogic.gdx.graphics.Color color22 = color4.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        int int26 = lwjgl3ApplicationConfiguration23.depth;
        lwjgl3ApplicationConfiguration23.windowX = (short) 100;
        lwjgl3ApplicationConfiguration23.setWindowPosition(16, (int) (byte) 100);
        lwjgl3ApplicationConfiguration23.audioDeviceSimultaneousSources = (-458762);
        int int34 = lwjgl3ApplicationConfiguration23.getdepth();
        com.badlogic.gdx.graphics.Color color35 = lwjgl3ApplicationConfiguration23.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color36 = color4.set(color35);
        float float37 = color36.r;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 16 + "'", int34 == 16);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.7419355f + "'", float37 == 0.7419355f);
    }

    @Test
    public void test12430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12430");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.useVsync(true);
        int int16 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.graphics.Color color18 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2147418367);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode21 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNull(lwjgl3DisplayMode21);
    }

    @Test
    public void test12431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12431");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-32160), (-5.7740937E37f), (float) (-1248));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-318240) + "'", int3 == (-318240));
    }

    @Test
    public void test12432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12432");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        int int10 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration1.setwindowWidth((-545421065));
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 1, (int) '#');
        lwjgl3ApplicationConfiguration1.setpreferencesDirectory(".prefs/");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferCount(9);
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferSize((-1077952513));
        lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources = (-2105736960);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.setwindowDecorated(true);
        int int28 = lwjgl3ApplicationConfiguration1.getwindowHeight();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 480 + "'", int28 == 480);
    }

    @Test
    public void test12433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12433");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (byte) 0, (-8.952473E30f), (float) (-10224128), (float) 6349110);
        int int5 = color4.toIntBits();
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color11 = color6.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        int int12 = com.badlogic.gdx.graphics.Color.argb8888(color6);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color6, 8925);
        com.badlogic.gdx.graphics.Color color19 = color6.sub((float) 167772160, (float) (-100466688), (float) 0, (float) (-164075620));
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color19, 117436161);
        float float23 = color19.b;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-16777216) + "'", int5 == (-16777216));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-16711936) + "'", int12 == (-16711936));
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
    }

    @Test
    public void test12434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12434");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(7077476);
    }

    @Test
    public void test12435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12435");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        boolean boolean3 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int4 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int5 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowX = (-654724064);
        int int8 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 15709968, (-1593770240));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test12436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12436");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType5;
        lwjgl3ApplicationConfiguration0.setwindowX((-52344));
        lwjgl3ApplicationConfiguration0.samples = 1;
        int int11 = lwjgl3ApplicationConfiguration0.r;
        int int12 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.a = 586415136;
        int int15 = lwjgl3ApplicationConfiguration0.stencil;
        int int16 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test12437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12437");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int12 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test12438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12438");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = null;
        lwjgl3ApplicationConfiguration11.hdpiMode = hdpiMode12;
        lwjgl3ApplicationConfiguration11.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration11.windowListener = lwjgl3WindowListener16;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test12439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12439");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setTitle("");
        lwjgl3ApplicationConfiguration1.setAudioConfig((-10223606), (int) (byte) 0, (-16711936));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int12 = lwjgl3ApplicationConfiguration11.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode13 = null;
        lwjgl3ApplicationConfiguration11.fullscreenMode = lwjgl3DisplayMode13;
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration11.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(1671172080);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color17, (-2089026813));
        float float20 = color17.b;
        com.badlogic.gdx.graphics.Color color21 = color15.set(color17);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color21);
        color21.g = 1621098495;
        com.badlogic.gdx.graphics.Color color26 = color21.set((-1087242240));
        com.badlogic.gdx.graphics.Color color27 = color26.clamp();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.9843137f + "'", float20 == 0.9843137f);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test12440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12440");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SLATE;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) 9, (float) (byte) 10, (float) 0, 0.0f);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.stencil = 10;
        int int9 = lwjgl3ApplicationConfiguration6.depth;
        int int10 = lwjgl3ApplicationConfiguration6.stencil;
        lwjgl3ApplicationConfiguration6.depth = 100;
        int int13 = lwjgl3ApplicationConfiguration6.windowMaxWidth;
        boolean boolean14 = color0.equals((java.lang.Object) lwjgl3ApplicationConfiguration6);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color0);
        java.lang.String str16 = color0.toString();
        java.lang.String str17 = color0.toString();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ffff0000" + "'", str16, "ffff0000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ffff0000" + "'", str17, "ffff0000");
    }

    @Test
    public void test12441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12441");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        int int12 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
    }

    @Test
    public void test12442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12442");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        float float6 = color4.toFloatBits();
        java.lang.String str7 = color4.toString();
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color23 = color13.lerp(color21, (float) 100L);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        com.badlogic.gdx.graphics.Color color29 = color23.mul(color28);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color23, (-8160));
        com.badlogic.gdx.graphics.Color color32 = color4.sub(color23);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color23, (-6553036));
        color23.g = (-11241472);
        com.badlogic.gdx.graphics.Color color38 = color23.mul((float) (-7555886));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00000000" + "'", str7, "00000000");
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color38);
    }

    @Test
    public void test12443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12443");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-138042720), (-1.7005698E38f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test12444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12444");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.windowHeight = (-59475968);
        int int15 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.Files.FileType fileType16 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration17.setwindowY((-151));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + fileType16 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType16.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
    }

    @Test
    public void test12445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12445");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(1157627903, (-658939904), (-480), 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test12446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12446");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLD;
        color0.r = 'a';
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color0);
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444(color3);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color8, 16);
        color8.a = 0L;
        com.badlogic.gdx.graphics.Color color13 = color6.mul(color8);
        com.badlogic.gdx.graphics.Color color18 = color6.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        color6.g = (short) -1;
        com.badlogic.gdx.graphics.Color color22 = color6.set(1);
        int int23 = color22.toIntBits();
        com.badlogic.gdx.graphics.Color color25 = color22.set((-2023680));
        com.badlogic.gdx.graphics.Color color26 = color3.mul(color25);
        com.badlogic.gdx.graphics.Color color28 = color3.set((-8461568));
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5959920 + "'", int4 == 5959920);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16777216 + "'", int23 == 16777216);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test12447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12447");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.depth = 61455;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-4084));
        lwjgl3ApplicationConfiguration0.setwindowWidth((-105513216));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test12448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12448");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setTitle("");
        int int7 = lwjgl3ApplicationConfiguration1.windowMinHeight;
        lwjgl3ApplicationConfiguration1.windowResizable = true;
        lwjgl3ApplicationConfiguration1.windowWidth = 40664886;
        int int12 = lwjgl3ApplicationConfiguration1.windowMaxWidth;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test12449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12449");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode7;
        int int9 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(615183, (-2140996640), 9, 301989632, (-208), 49121, 7712224);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-8303));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode20 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNull(lwjgl3DisplayMode20);
    }

    @Test
    public void test12450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12450");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int9 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1090519295, 63488);
        int int13 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1090519295 + "'", int13 == 1090519295);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12451");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color8, 16);
        color8.a = 0L;
        com.badlogic.gdx.graphics.Color color13 = color6.mul(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        int int20 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        boolean boolean22 = color18.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        com.badlogic.gdx.graphics.Color color33 = color27.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color34 = color18.mul(color33);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color36 = color8.set(color35);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color36);
        int int38 = lwjgl3ApplicationConfiguration1.windowMaxWidth;
        int int39 = lwjgl3ApplicationConfiguration1.windowHeight;
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((-2146830848));
        com.badlogic.gdx.graphics.Color color42 = com.badlogic.gdx.graphics.Color.GREEN;
        com.badlogic.gdx.graphics.Color color47 = color42.set((float) (-14483712), 0.0f, 0.0f, (float) (-2146830848));
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(color42);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color48);
        com.badlogic.gdx.graphics.Color color50 = color48.cpy();
        com.badlogic.gdx.graphics.Color color52 = color50.set((-48128));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 480 + "'", int39 == 480);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color52);
    }

    @Test
    public void test12452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12452");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color2);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color2);
        com.badlogic.gdx.graphics.Color color5 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowY = (-9792000);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(39951);
        lwjgl3ApplicationConfiguration0.stencil = (-1613299457);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
    }

    @Test
    public void test12453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12453");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, (int) (byte) 0, (int) (byte) 100);
        int int13 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        boolean boolean14 = lwjgl3ApplicationConfiguration1.disableAudio;
        int int15 = lwjgl3ApplicationConfiguration1.getgles30ContextMajorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = lwjgl3ApplicationConfiguration1.windowListener;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color18, 16);
        int int21 = com.badlogic.gdx.graphics.Color.rgb565(color18);
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color18;
        lwjgl3ApplicationConfiguration1.useGL30 = true;
        lwjgl3ApplicationConfiguration1.windowWidth = (-33488896);
        boolean boolean27 = lwjgl3ApplicationConfiguration1.disableAudio;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(lwjgl3WindowListener16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test12454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12454");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int11 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setdepth((-15514229));
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color16;
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((-1.7007336E38f), (float) 64274, (float) 5959695, 0.0f);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color22, (-2009010));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test12455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12455");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        int int19 = lwjgl3ApplicationConfiguration16.depth;
        int int20 = lwjgl3ApplicationConfiguration16.stencil;
        int int21 = lwjgl3ApplicationConfiguration16.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration16.hdpiMode = hdpiMode24;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration0.windowWidth = 0;
        lwjgl3ApplicationConfiguration0.setTitle("00000020");
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 509920;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-6555919));
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((-95486193));
        int int37 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.depth = 0;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 509920 + "'", int37 == 509920);
    }

    @Test
    public void test12456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12456");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.a = (-36);
        lwjgl3ApplicationConfiguration0.setsamples((-917504));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test12457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12457");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.b = (short) 0;
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(65535);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setdepth((-67095094));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener16;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
    }

    @Test
    public void test12458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12458");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-1778519256), (float) 39951);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10187505 + "'", int2 == 10187505);
    }

    @Test
    public void test12459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12459");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.setResizable(true);
        lwjgl3ApplicationConfiguration1.windowMinWidth = (-654724064);
        int int11 = lwjgl3ApplicationConfiguration1.stencil;
        java.lang.String str12 = lwjgl3ApplicationConfiguration1.preferencesDirectory;
        int int13 = lwjgl3ApplicationConfiguration1.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration1.windowMinWidth = (-1659304960);
        int int16 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
    }

    @Test
    public void test12460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12460");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, (int) (byte) 0, (int) (byte) 100);
        int int13 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        boolean boolean14 = lwjgl3ApplicationConfiguration1.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = lwjgl3ApplicationConfiguration1.fullscreenMode;
        boolean boolean16 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration1.disableAudio = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(lwjgl3DisplayMode15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test12461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12461");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration9.useOpenGL3(true, (-100466688), (-62876));
        lwjgl3ApplicationConfiguration9.setwindowHeight((-1077952513));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = lwjgl3ApplicationConfiguration9.windowListener;
        lwjgl3ApplicationConfiguration9.setwindowY(65534);
        lwjgl3ApplicationConfiguration9.g = (-16722017);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNull(lwjgl3WindowListener17);
    }

    @Test
    public void test12462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12462");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources = (-32);
        lwjgl3ApplicationConfiguration1.depth = (-266942944);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
    }

    @Test
    public void test12463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12463");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.getwindowX();
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration7.initialBackgroundColor;
        lwjgl3ApplicationConfiguration7.setaudioDeviceBufferCount((-458762));
        int int12 = lwjgl3ApplicationConfiguration7.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration7.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration7.g = 507505200;
        java.lang.String str17 = lwjgl3ApplicationConfiguration7.preferencesDirectory;
        int int18 = lwjgl3ApplicationConfiguration7.getgles30ContextMinorVersion();
        int int19 = lwjgl3ApplicationConfiguration7.getwindowMinWidth();
        int int20 = lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".prefs/" + "'", str17, ".prefs/");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test12464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12464");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.windowMinWidth = 509920;
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test12465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12465");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        int int8 = lwjgl3ApplicationConfiguration1.depth;
        lwjgl3ApplicationConfiguration1.windowWidth = (byte) 1;
        lwjgl3ApplicationConfiguration1.setWindowSizeLimits(2, (-16580607), 267782144, 786400);
        lwjgl3ApplicationConfiguration1.setDecorated(false);
        int int18 = lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion;
        boolean boolean19 = lwjgl3ApplicationConfiguration1.windowDecorated;
        lwjgl3ApplicationConfiguration1.setWindowPosition((-1659304960), 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test12466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12466");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (short) 10;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int12 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-115933432);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
    }

    @Test
    public void test12467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12467");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = lwjgl3ApplicationConfiguration0.windowListener;
        int int8 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNull(lwjgl3WindowListener7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test12468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12468");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(10287);
    }

    @Test
    public void test12469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12469");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int9 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowX((-520093697));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(lwjgl3DisplayMode10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
    }

    @Test
    public void test12470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12470");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.setgles30ContextMajorVersion((-503341578));
        int int10 = lwjgl3ApplicationConfiguration1.getwindowX();
        lwjgl3ApplicationConfiguration1.r = 1465382614;
        lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources = (-7555886);
        int int15 = lwjgl3ApplicationConfiguration1.getwindowHeight();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        int int19 = lwjgl3ApplicationConfiguration16.depth;
        int int20 = lwjgl3ApplicationConfiguration16.stencil;
        lwjgl3ApplicationConfiguration16.gles30ContextMajorVersion = (-16580607);
        int int23 = lwjgl3ApplicationConfiguration16.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration24.setwindowResizable(false);
        lwjgl3ApplicationConfiguration24.setwindowMinWidth((int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration37);
        lwjgl3ApplicationConfiguration38.r = ' ';
        lwjgl3ApplicationConfiguration38.windowResizable = false;
        int int43 = lwjgl3ApplicationConfiguration38.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration44.stencil = 10;
        int int47 = lwjgl3ApplicationConfiguration44.depth;
        int int48 = lwjgl3ApplicationConfiguration44.stencil;
        int int49 = lwjgl3ApplicationConfiguration44.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = null;
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration44.hdpiMode = hdpiMode52;
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration1.setHdpiMode(hdpiMode52);
        int int58 = lwjgl3ApplicationConfiguration1.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration59);
        lwjgl3ApplicationConfiguration60.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode64 = null;
        lwjgl3ApplicationConfiguration60.setFullscreenMode(displayMode64);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration60);
        lwjgl3ApplicationConfiguration60.setpreferencesDirectory("9c663200");
        com.badlogic.gdx.Files.FileType fileType69 = lwjgl3ApplicationConfiguration60.preferencesFileType;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType69);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 16 + "'", int47 == 16);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode52 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode52.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration60);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration66);
        org.junit.Assert.assertTrue("'" + fileType69 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType69.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12471");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        int int6 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, 8925);
        com.badlogic.gdx.graphics.Color color13 = color0.sub((float) 167772160, (float) (-100466688), (float) 0, (float) (-164075620));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color13, 1465382614);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color13);
        com.badlogic.gdx.graphics.Color color22 = color16.lerp((float) 982772, (-1.7012041E38f), 1.495631E-27f, (-1.7005746E38f), 1.0f);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-16711936) + "'", int6 == (-16711936));
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color22);
    }

    @Test
    public void test12472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12472");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.getwindowX();
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration7.initialBackgroundColor;
        lwjgl3ApplicationConfiguration7.setaudioDeviceBufferCount((-458762));
        lwjgl3ApplicationConfiguration7.r = (-2147483648);
        lwjgl3ApplicationConfiguration7.useVsync(false);
        lwjgl3ApplicationConfiguration7.setwindowX((-589825));
        java.lang.String str18 = lwjgl3ApplicationConfiguration7.title;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12473");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.g = (-40036);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener16;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        boolean boolean20 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test12474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12474");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color19 = color13.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        float float29 = color27.toFloatBits();
        java.lang.String str30 = color27.toString();
        boolean boolean32 = color27.equals((java.lang.Object) (-1.7014117E38f));
        com.badlogic.gdx.graphics.Color color33 = color21.sub(color27);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color((-551618560));
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color35);
        float float37 = color36.toFloatBits();
        float float38 = color36.r;
        com.badlogic.gdx.graphics.Color color39 = color33.set(color36);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000000" + "'", str30, "00000000");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 2.2786278E-38f + "'", float37 == 2.2786278E-38f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.8745098f + "'", float38 == 0.8745098f);
        org.junit.Assert.assertNotNull(color39);
    }

    @Test
    public void test12475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12475");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-537395200), (-10), 65516, 2097056);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2560) + "'", int4 == (-2560));
    }

    @Test
    public void test12476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12476");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("9c663200");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration17);
        lwjgl3ApplicationConfiguration18.setvSyncEnabled(false);
        boolean boolean21 = lwjgl3ApplicationConfiguration18.getuseGL30();
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color25, 16);
        color25.a = 0L;
        com.badlogic.gdx.graphics.Color color30 = color23.mul(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration31.stencil = 10;
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration31.initialBackgroundColor = color35;
        int int37 = com.badlogic.gdx.graphics.Color.rgb888(color35);
        boolean boolean39 = color35.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.stencil = 10;
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration40.initialBackgroundColor = color44;
        com.badlogic.gdx.graphics.Color color50 = color44.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color51 = color35.mul(color50);
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color(color50);
        com.badlogic.gdx.graphics.Color color53 = color25.set(color52);
        lwjgl3ApplicationConfiguration18.setInitialBackgroundColor(color53);
        lwjgl3ApplicationConfiguration18.setwindowMinWidth(2);
        lwjgl3ApplicationConfiguration18.windowWidth = '4';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration59.stencil = 10;
        int int62 = lwjgl3ApplicationConfiguration59.depth;
        int int63 = lwjgl3ApplicationConfiguration59.stencil;
        int int64 = lwjgl3ApplicationConfiguration59.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode65 = null;
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode65);
        int int67 = lwjgl3ApplicationConfiguration59.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration68.stencil = 10;
        int int71 = lwjgl3ApplicationConfiguration68.b;
        boolean boolean72 = lwjgl3ApplicationConfiguration68.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType73 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration68.setpreferencesFileType(fileType73);
        int int75 = lwjgl3ApplicationConfiguration68.depth;
        lwjgl3ApplicationConfiguration68.windowX = 765;
        int int78 = lwjgl3ApplicationConfiguration68.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode79 = lwjgl3ApplicationConfiguration68.hdpiMode;
        lwjgl3ApplicationConfiguration59.hdpiMode = hdpiMode79;
        lwjgl3ApplicationConfiguration18.hdpiMode = hdpiMode79;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode79);
        int int83 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("00000100");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 16 + "'", int62 == 16);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 8 + "'", int71 == 8);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + fileType73 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType73.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 16 + "'", int75 == 16);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode79 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode79.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 16 + "'", int83 == 16);
    }

    @Test
    public void test12477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12477");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.getwindowResizable();
        lwjgl3ApplicationConfiguration1.setwindowHeight((-227328));
        lwjgl3ApplicationConfiguration1.setwindowX((-1888288));
        lwjgl3ApplicationConfiguration1.samples = (-1984);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test12478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12478");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (byte) 1, (int) (short) 0, 16711680, (-10224128), (int) (byte) 100, 33791);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.String str16 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.windowMinHeight = '#';
        int int19 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.stencil = (-2140955648);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".prefs/" + "'", str16, ".prefs/");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test12479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12479");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int13 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        boolean boolean16 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-1);
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.title = "88ff0000";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test12480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12480");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        int int1 = com.badlogic.gdx.graphics.Color.rgba8888(color0);
        float float2 = color0.b;
        com.badlogic.gdx.graphics.Color color7 = color0.set((float) 3309388, (float) 224, (float) 255, (float) 16777215);
        float float8 = color7.r;
        float float9 = color7.a;
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 589993 + "'", int1 == 589993);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test12481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12481");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color10, 16);
        color10.a = 0L;
        com.badlogic.gdx.graphics.Color color15 = color8.mul(color10);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color21;
        int int23 = com.badlogic.gdx.graphics.Color.rgb888(color21);
        boolean boolean25 = color21.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.stencil = 10;
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration26.initialBackgroundColor = color30;
        com.badlogic.gdx.graphics.Color color36 = color30.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color37 = color21.mul(color36);
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(color36);
        float float39 = color38.r;
        com.badlogic.gdx.graphics.Color color40 = color16.mul(color38);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color38;
        lwjgl3ApplicationConfiguration0.setwindowWidth(33791);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration44.setAudioConfig((-592128), (-1512046592), (-654724064));
        lwjgl3ApplicationConfiguration44.samples = (-224);
        int int51 = lwjgl3ApplicationConfiguration44.samples;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-224) + "'", int51 == (-224));
    }

    @Test
    public void test12482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12482");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 16769311, 0.6117647f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test12483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12483");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        java.lang.String str5 = lwjgl3ApplicationConfiguration1.title;
        int int6 = lwjgl3ApplicationConfiguration1.a;
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration1.setdepth(65536);
        lwjgl3ApplicationConfiguration1.disableAudio = true;
        lwjgl3ApplicationConfiguration1.windowX = (-241877265);
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration1.preferencesFileType;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12484");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((-1.6880936E38f), (-1.6984003E38f), 0.0f, (float) (-63457));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16181535) + "'", int4 == (-16181535));
    }

    @Test
    public void test12485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12485");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType9;
        int int11 = lwjgl3ApplicationConfiguration1.depth;
        int int12 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferSize();
        int int13 = lwjgl3ApplicationConfiguration1.getdepth();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test12486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12486");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-65536);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int14 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.setdepth((-134192228));
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test12487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12487");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(0);
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.a = (-637684704);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = lwjgl3ApplicationConfiguration0.hdpiMode;
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode16 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode16;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test12488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12488");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(480);
        int int9 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.stencil = (-327680);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test12489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12489");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setsamples((-1618477056));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test12490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12490");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-567345152), (-962672), (-538713088), (-16716288));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-9465856) + "'", int4 == (-9465856));
    }

    @Test
    public void test12491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12491");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        int int1 = color0.toIntBits();
        color0.g = (-1728);
        java.lang.String str4 = color0.toString();
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2305) + "'", int1 == (-2305));
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ffc0ffff" + "'", str4, "ffc0ffff");
    }

    @Test
    public void test12492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12492");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 585070592, (float) 3371073, (-1.6984003E38f), (float) (-85504));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-512) + "'", int4 == (-512));
    }

    @Test
    public void test12493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12493");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        int int8 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 16711680;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(51855);
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(16385025, 16711426, (-567345152), (-10846208), (-535826687), 8912896, 7077476);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
    }

    @Test
    public void test12494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12494");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setWindowPosition(3855, 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-41943040));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 5;
        com.badlogic.gdx.graphics.Color color17 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test12495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12495");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        int int10 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration11.setpreferencesFileType(fileType12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test12496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12496");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int11 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int12 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowHeight = 626699475;
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-1075773696), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setwindowHeight(16197090);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 2097056, (-7462090), (-2968436), 27238, (-241877265), (-5828));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test12497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12497");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(2);
        lwjgl3ApplicationConfiguration0.title = "00ffffff";
        int int12 = lwjgl3ApplicationConfiguration0.b;
        int int13 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        int int17 = lwjgl3ApplicationConfiguration14.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration14.hdpiMode = hdpiMode18;
        lwjgl3ApplicationConfiguration14.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = null;
        lwjgl3ApplicationConfiguration14.hdpiMode = hdpiMode22;
        boolean boolean24 = lwjgl3ApplicationConfiguration14.getuseGL30();
        lwjgl3ApplicationConfiguration14.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration14.windowListener = lwjgl3WindowListener27;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.stencil = 10;
        lwjgl3ApplicationConfiguration29.setwindowX((int) (short) 0);
        int int34 = lwjgl3ApplicationConfiguration29.getaudioDeviceBufferSize();
        int int35 = lwjgl3ApplicationConfiguration29.windowHeight;
        lwjgl3ApplicationConfiguration29.setaudioDeviceBufferSize(480);
        com.badlogic.gdx.graphics.Color color38 = com.badlogic.gdx.graphics.Color.OLIVE;
        lwjgl3ApplicationConfiguration29.initialBackgroundColor = color38;
        lwjgl3ApplicationConfiguration29.setAudioConfig((-1077936368), 0, (int) (short) 0);
        boolean boolean44 = lwjgl3ApplicationConfiguration29.useGL30;
        lwjgl3ApplicationConfiguration29.audioDeviceBufferCount = (-503341578);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration47);
        int int49 = lwjgl3ApplicationConfiguration48.samples;
        lwjgl3ApplicationConfiguration48.setwindowY(9);
        lwjgl3ApplicationConfiguration48.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration48.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int58 = lwjgl3ApplicationConfiguration57.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType60 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration57.setPreferencesConfig("", fileType60);
        lwjgl3ApplicationConfiguration48.setpreferencesFileType(fileType60);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int65 = lwjgl3ApplicationConfiguration64.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration64);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener67 = lwjgl3ApplicationConfiguration64.windowListener;
        int int68 = lwjgl3ApplicationConfiguration64.getsamples();
        com.badlogic.gdx.Files.FileType fileType69 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration64.preferencesFileType = fileType69;
        lwjgl3ApplicationConfiguration48.setPreferencesConfig("hi!", fileType69);
        lwjgl3ApplicationConfiguration29.preferencesFileType = fileType69;
        lwjgl3ApplicationConfiguration14.setpreferencesFileType(fileType69);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType69);
        java.lang.String str75 = lwjgl3ApplicationConfiguration0.title;
        boolean boolean76 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 480 + "'", int35 == 480);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 512 + "'", int58 == 512);
        org.junit.Assert.assertTrue("'" + fileType60 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType60.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 512 + "'", int65 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration66);
        org.junit.Assert.assertNull(lwjgl3WindowListener67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + fileType69 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType69.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "00ffffff" + "'", str75, "00ffffff");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test12498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12498");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-55296);
        lwjgl3ApplicationConfiguration0.windowHeight = (-24994048);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test12499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12499");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        int int9 = lwjgl3ApplicationConfiguration7.gles30ContextMinorVersion;
        boolean boolean10 = lwjgl3ApplicationConfiguration7.getwindowDecorated();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test12500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12500");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-60572), (float) (-42115328), (float) (-1528823808), (-1.701194E38f));
    }
}
