import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.GREEN;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (short) -1);
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-15667200), (-510), 65367, (-2130837248));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3584) + "'", int4 == (-3584));
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        int int2 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener3;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-18881792), (-1439745), 33488896, 63736);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-18874624) + "'", int4 == (-18874624));
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1, (float) 20160, (float) 0, (float) (byte) -1);
        float float5 = color4.a;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.BLACK;
        float float7 = color6.r;
        com.badlogic.gdx.graphics.Color color12 = color6.set((-8.0750596E37f), 0.0f, (float) (-1L), (float) 65024);
        com.badlogic.gdx.graphics.Color color13 = color6.cpy();
        com.badlogic.gdx.graphics.Color color14 = color6.clamp();
        com.badlogic.gdx.graphics.Color color15 = color4.add(color14);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, 50200831);
        float float18 = color4.toFloatBits();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(color6);
// flaky:         org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.6954926E38f) + "'", float18 == (-1.6954926E38f));
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TAN;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color0, (int) 'a');
        com.badlogic.gdx.graphics.Color color3 = color0.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration4.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration4.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration4.setwindowY((int) (byte) -1);
        int int17 = lwjgl3ApplicationConfiguration4.g;
        int int18 = lwjgl3ApplicationConfiguration4.getwindowWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = lwjgl3ApplicationConfiguration4.windowListener;
        boolean boolean20 = color0.equals((java.lang.Object) lwjgl3WindowListener19);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 640 + "'", int18 == 640);
        org.junit.Assert.assertNull(lwjgl3WindowListener19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration6.setaudioDeviceSimultaneousSources((int) (byte) 100);
        lwjgl3ApplicationConfiguration6.setdisableAudio(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration6.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = lwjgl3ApplicationConfiguration6.windowListener;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(lwjgl3WindowListener12);
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-4.818329E37f), (float) 50200831, (float) (-33576664), (-1.6960587E38f));
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        float float1 = color0.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str3 = lwjgl3ApplicationConfiguration2.title;
        com.badlogic.gdx.graphics.Color color4 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color4, 16);
        lwjgl3ApplicationConfiguration2.setInitialBackgroundColor(color4);
        com.badlogic.gdx.graphics.Color color12 = color4.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color20 = color14.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str22 = color21.toString();
        com.badlogic.gdx.graphics.Color color24 = color14.lerp(color21, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color25, 16);
        com.badlogic.gdx.graphics.Color color28 = color24.sub(color25);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color25, 1677696502);
        com.badlogic.gdx.graphics.Color color31 = color4.sub(color25);
        com.badlogic.gdx.graphics.Color color32 = color0.add(color25);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color25);
        com.badlogic.gdx.graphics.Color color35 = color25.mul(0.0f);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-4.28676E37f) + "'", float1 == (-4.28676E37f));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color35);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 43268, 9);
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color19 = color14.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color20 = color13.sub(color19);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color23 = color22.cpy();
        com.badlogic.gdx.graphics.Color color28 = color22.add((float) '#', (float) (-13500161), (float) 512, (float) (-335));
        java.lang.String str29 = color28.toString();
        com.badlogic.gdx.graphics.Color color30 = color19.add(color28);
        float float31 = color28.g;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ff00ff00" + "'", str29, "ff00ff00");
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        int int10 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (-16711680));
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        java.lang.String str16 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        lwjgl3ApplicationConfiguration9.disableAudio = true;
        lwjgl3ApplicationConfiguration9.windowHeight = (short) 1;
        int int14 = lwjgl3ApplicationConfiguration9.windowWidth;
        lwjgl3ApplicationConfiguration9.setBackBufferConfig((int) (byte) -1, (-9216), (-33488131), (-537010176), (-167706623), 0, 650250);
        int int23 = lwjgl3ApplicationConfiguration9.audioDeviceBufferCount;
        int int24 = lwjgl3ApplicationConfiguration9.getwindowX();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 640 + "'", int14 == 640);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-14622977), 0.057594743f, (float) (-96), (float) (-149));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-37995) + "'", int4 == (-37995));
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        color11.a = 35;
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((-16711680));
        com.badlogic.gdx.graphics.Color color17 = color14.sub(color16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode12;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.windowDecorated;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int16 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-512064));
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff09f6");
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-587726848);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.windowY;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.g = 31334400;
        lwjgl3ApplicationConfiguration0.setwindowX(570949632);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00002000";
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-15144960), (-1665155040), (-16646655), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2496512) + "'", int4 == (-2496512));
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration8.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration8.setaudioDeviceBufferCount(20188);
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration8.preferencesFileType;
        java.lang.String str14 = lwjgl3ApplicationConfiguration8.preferencesDirectory;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNull(fileType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-436443648));
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((float) (-255), 100.0f, (float) (byte) 100, (float) 41903542);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color6, (-567943452));
        com.badlogic.gdx.graphics.Color color10 = color1.lerp(color6, (float) (-1644167168));
        int int11 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16776960 + "'", int11 == 16776960);
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 31334400, (float) (-2114125568), (float) 150405120, (float) 15);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color4, (-535426560));
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(3, 8897069);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int16 = lwjgl3ApplicationConfiguration15.windowWidth;
        lwjgl3ApplicationConfiguration15.setTitle("");
        int int19 = lwjgl3ApplicationConfiguration15.getdepth();
        int int20 = lwjgl3ApplicationConfiguration15.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration15.windowResizable = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(0);
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.windowWidth = (-65281);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-33488131));
        int int10 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean12 = lwjgl3ApplicationConfiguration11.getuseGL30();
        lwjgl3ApplicationConfiguration11.setTitle("001cff00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.windowHeight;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-65568), (float) (-335609856), (float) (-16731648), (float) (-18881792));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-4.2826227E37f) + "'", float4 == (-4.2826227E37f));
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-4326480));
        int int2 = com.badlogic.gdx.graphics.Color.rgb565(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64990 + "'", int2 == 64990);
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        int int13 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int14 = lwjgl3ApplicationConfiguration0.g;
        int int15 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int17 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setWindowedMode(166464502, 16711425);
        int int10 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.setdepth((-12597000));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-62986), (float) 'a', (float) '4', (float) (short) 10);
        float float5 = color4.b;
        color4.b = 0.19607843f;
        com.badlogic.gdx.graphics.Color color8 = color4.clamp();
        float float9 = color4.r;
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16711425);
        int int11 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int14 = lwjgl3ApplicationConfiguration13.getaudioDeviceBufferSize();
        int int15 = lwjgl3ApplicationConfiguration13.b;
        lwjgl3ApplicationConfiguration13.useGL30 = false;
        lwjgl3ApplicationConfiguration13.useGL30 = true;
        lwjgl3ApplicationConfiguration13.audioDeviceSimultaneousSources = (-33488131);
        lwjgl3ApplicationConfiguration13.setwindowX((-16734721));
        int int24 = lwjgl3ApplicationConfiguration13.getdepth();
        java.lang.String str25 = lwjgl3ApplicationConfiguration13.preferencesDirectory;
        lwjgl3ApplicationConfiguration13.useGL30 = true;
        com.badlogic.gdx.Files.FileType fileType28 = lwjgl3ApplicationConfiguration13.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00ff00dc", fileType28);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ".prefs/" + "'", str25, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.g = (short) 0;
        lwjgl3ApplicationConfiguration0.windowX = 35;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 56864, 151015132);
        int int16 = lwjgl3ApplicationConfiguration0.windowY;
        int int17 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int18 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.windowHeight = (-8142);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) 16772625, (float) 16580354, (float) (-119406593), (float) (-15671025));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-65536) + "'", int4 == (-65536));
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((-1.6950243E38f), (float) (-2147483616), (-1.6415966E38f), (float) (-119406593));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        int int8 = lwjgl3ApplicationConfiguration0.stencil;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) 1105199359);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((-1.515294E38f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str9 = color8.toString();
        com.badlogic.gdx.graphics.Color color11 = color1.lerp(color8, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color12, 16);
        com.badlogic.gdx.graphics.Color color15 = color11.sub(color12);
        color12.a = 65024;
        float float18 = color12.b;
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color19, (int) 'a');
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color19, (-8160));
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00ff0000" + "'", str9, "00ff0000");
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.06666667f + "'", float18 == 0.06666667f);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setInitialVisible(true);
        lwjgl3ApplicationConfiguration8.setwindowX(20160);
        lwjgl3ApplicationConfiguration8.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.preferencesFileType = fileType16;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        lwjgl3ApplicationConfiguration18.disableAudio = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.b = '4';
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNull(fileType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-255));
        com.badlogic.gdx.graphics.Color color6 = color1.set((float) (-567943452), (float) 1, (float) (short) -1, (float) (-567943452));
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color8 = color7.cpy();
        com.badlogic.gdx.graphics.Color color10 = color1.lerp(color8, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color13 = color8.set(color11);
        color11.b = (-14540110);
        com.badlogic.gdx.graphics.Color color16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color17 = color11.sub(color16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-1308557313));
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((-16711680));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color3, (-16734721));
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color11 = color6.add((float) (byte) 100, (float) 41903542, (float) (short) 10, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color13 = color12.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color13, 1);
        float float16 = color13.r;
        com.badlogic.gdx.graphics.Color color17 = color6.sub(color13);
        com.badlogic.gdx.graphics.Color color18 = color3.set(color6);
        com.badlogic.gdx.graphics.Color color19 = color1.sub(color18);
        float float20 = color18.a;
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int9 = lwjgl3ApplicationConfiguration0.g;
        int int10 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str1 = color0.toString();
        com.badlogic.gdx.graphics.Color color3 = color0.set((-62986));
        java.lang.Class<?> wildcardClass4 = color3.getClass();
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000" + "'", str1, "00000000");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 266342400;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 511;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) 240, 2.9056E-41f, (-1.7011522E38f), 1.5612034E-37f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 268435456 + "'", int4 == 268435456);
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color14 = color9.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = color8.sub(color14);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color8, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = color8.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.setwindowX(97);
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str29 = color28.toString();
        com.badlogic.gdx.graphics.Color color31 = color28.set((-62986));
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color32.set((-62986));
        com.badlogic.gdx.graphics.Color color36 = color31.sub(color35);
        com.badlogic.gdx.graphics.Color color37 = color26.add(color35);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color35);
        com.badlogic.gdx.graphics.Color color39 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "00ff0000" + "'", str29, "00ff0000");
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ffff09f6" + "'", str33, "ffff09f6");
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color39);
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowHeight = 6529016;
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int16 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color16 = color11.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color24 = color19.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color32 = color26.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str34 = color33.toString();
        com.badlogic.gdx.graphics.Color color36 = color26.lerp(color33, (-8.0750596E37f));
        boolean boolean37 = color19.equals((java.lang.Object) color26);
        com.badlogic.gdx.graphics.Color color38 = color18.add(color19);
        com.badlogic.gdx.graphics.Color color40 = color10.lerp(color18, (float) (-14540110));
        int int41 = com.badlogic.gdx.graphics.Color.rgb565(color10);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color43 = color9.add(color42);
        int int44 = com.badlogic.gdx.graphics.Color.rgba8888(color9);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ffffffff" + "'", str8, "ffffffff");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "00ff0000" + "'", str34, "00ff0000");
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2047 + "'", int41 == 2047);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLD;
        com.badlogic.gdx.graphics.Color color2 = color0.set(570949632);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((float) 6147990, (float) (byte) -1, (float) (-61455), (float) 15687677);
        com.badlogic.gdx.graphics.Color color8 = color2.sub(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color7);
        int int10 = com.badlogic.gdx.graphics.Color.rgb565(color7);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 63488 + "'", int10 == 63488);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration12.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration12.disableAudio = true;
        int int17 = lwjgl3ApplicationConfiguration12.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration12.setWindowListener(lwjgl3WindowListener18);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GREEN;
        int int1 = com.badlogic.gdx.graphics.Color.rgba8888(color0);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, (-248));
        com.badlogic.gdx.graphics.Color color9 = color0.lerp((float) (-65024), 0.0f, (float) 50200831, (float) 65025, 2.3509886E-38f);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color19 = color13.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color20 = color11.mul(color19);
        com.badlogic.gdx.graphics.Color color25 = color20.sub((float) (short) -1, (float) (-1306385665), (float) (-262646), (float) 100L);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color20);
        com.badlogic.gdx.graphics.Color color27 = color0.mul(color26);
        float float28 = color0.b;
        color0.a = (-14911125);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.1802158E-30f + "'", float28 == 1.1802158E-30f);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-53504), (float) (-16776961), (float) (-335609856), 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-33488131);
        lwjgl3ApplicationConfiguration0.setwindowX((-16734721));
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-58475));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(284196832, 196604, (-587202461), (-65042), (-1109610), (-22), 4095);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        int int14 = lwjgl3ApplicationConfiguration13.getwindowX();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.disableAudio;
        lwjgl3ApplicationConfiguration13.setAudioConfig(11667711, (-752), 268493567);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-96), (-4.731522E-22f), 2.2591532E-38f, (float) 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1610620896 + "'", int4 == 1610620896);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2147483648));
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setdepth(512);
        lwjgl3ApplicationConfiguration0.g = (byte) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration14.setpreferencesFileType(fileType15);
        lwjgl3ApplicationConfiguration14.useVsync(false);
        lwjgl3ApplicationConfiguration14.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration14.a = (-62986);
        lwjgl3ApplicationConfiguration14.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration14.hdpiMode = hdpiMode26;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode26);
        int int29 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode10;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowWidth(640);
        lwjgl3ApplicationConfiguration0.stencil = 167247232;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.windowY = 43268;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(480, 31, (-119406593), (-234885152));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6955932E38f) + "'", float4 == (-1.6955932E38f));
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (byte) -1, 2.5243549E-29f, (float) 10L, (float) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration5.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration5.useVsync(false);
        lwjgl3ApplicationConfiguration5.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration5);
        lwjgl3ApplicationConfiguration12.setwindowX((int) (byte) 100);
        java.lang.String str15 = lwjgl3ApplicationConfiguration12.title;
        boolean boolean16 = color4.equals((java.lang.Object) str15);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.r = (byte) -1;
        lwjgl3ApplicationConfiguration10.preferencesDirectory = "ffffff00";
        boolean boolean15 = lwjgl3ApplicationConfiguration10.windowResizable;
        lwjgl3ApplicationConfiguration10.setBackBufferConfig(16, (int) (byte) 0, 2550, (-79360), 537395200, 0, (-1224736769));
        lwjgl3ApplicationConfiguration10.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        lwjgl3ApplicationConfiguration10.r = 512;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color18.g = (short) 1;
        com.badlogic.gdx.graphics.Color color22 = color10.lerp(color18, (float) 25500);
        com.badlogic.gdx.graphics.Color color27 = color10.mul(0.0f, (float) (-8142), (float) (-1562574848), (-1.0f));
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color33 = color28.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str34 = color33.toString();
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color35);
        int int37 = com.badlogic.gdx.graphics.Color.rgba4444(color36);
        com.badlogic.gdx.graphics.Color color38 = color33.mul(color36);
        com.badlogic.gdx.graphics.Color color39 = color27.add(color38);
        float float40 = color38.toFloatBits();
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ffffff00" + "'", str34, "ffffff00");
        org.junit.Assert.assertNotNull(color35);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
// flaky:         org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color6 = color0.lerp((float) (-2015879168), (float) (-150), (float) 3570, (-1.7013859E38f), 0.44444445f);
        color6.a = 4.5183064E-38f;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowWidth = 65522;
        int int13 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.graphics.Color color14 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener17;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.useGL30;
        int int20 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff0200");
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 65522 + "'", int13 == 65522);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode10 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setWindowPosition(130560, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.title = "ffffffb6";
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        org.junit.Assert.assertTrue("'" + hdpiMode10 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode10.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.g = ' ';
        com.badlogic.gdx.graphics.Color color8 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color13 = color8.mul((float) 65535, 0.0f, (float) 2016, (float) 65024);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(65295);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int8 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.b = (-84);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color9, 8897069);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color17 = color12.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        int int20 = com.badlogic.gdx.graphics.Color.argb8888(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color19);
        com.badlogic.gdx.graphics.Color color23 = color9.lerp(color19, (float) 1044480);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int26 = lwjgl3ApplicationConfiguration25.getaudioDeviceBufferSize();
        boolean boolean27 = lwjgl3ApplicationConfiguration25.windowResizable;
        int int28 = lwjgl3ApplicationConfiguration25.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration25.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration25);
        com.badlogic.gdx.graphics.Color color32 = lwjgl3ApplicationConfiguration31.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color38 = color33.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color39);
        com.badlogic.gdx.graphics.Color color41 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color46 = color41.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color54 = color48.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color55 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str56 = color55.toString();
        com.badlogic.gdx.graphics.Color color58 = color48.lerp(color55, (-8.0750596E37f));
        boolean boolean59 = color41.equals((java.lang.Object) color48);
        com.badlogic.gdx.graphics.Color color60 = color40.add(color41);
        float float61 = color60.b;
        com.badlogic.gdx.graphics.Color color62 = color32.set(color60);
        int int63 = com.badlogic.gdx.graphics.Color.rgb888(color62);
        com.badlogic.gdx.graphics.Color color64 = color24.mul(color62);
        float float65 = color24.a;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16777215 + "'", int20 == 16777215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-256) + "'", int21 == (-256));
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "00ff0000" + "'", str56, "00ff0000");
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 1.0f + "'", float61 == 1.0f);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 16777215 + "'", int63 == 16777215);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 0.0f + "'", float65 == 0.0f);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-34881504), (float) 1610620896, (-7.501805E37f), (float) (-2304));
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.samples = (short) 1;
        lwjgl3ApplicationConfiguration10.stencil = (short) -1;
        lwjgl3ApplicationConfiguration10.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color17, 16);
        float float20 = color17.toFloatBits();
        lwjgl3ApplicationConfiguration10.initialBackgroundColor = color17;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        int int23 = lwjgl3ApplicationConfiguration10.getaudioDeviceBufferSize();
        int int24 = lwjgl3ApplicationConfiguration10.getaudioDeviceBufferSize();
        int int25 = lwjgl3ApplicationConfiguration10.r;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.561203E-39f + "'", float20 == 1.561203E-39f);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((-1.6947917E38f), (float) 573767680, 1.66464E8f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.useGL30;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration8.samples = (-1);
        lwjgl3ApplicationConfiguration8.useGL30 = true;
        lwjgl3ApplicationConfiguration8.setpreferencesDirectory("ffff72ff");
        int int17 = lwjgl3ApplicationConfiguration8.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration8.windowY = 20188;
        int int20 = lwjgl3ApplicationConfiguration8.getaudioDeviceBufferCount();
        com.badlogic.gdx.Files.FileType fileType21 = lwjgl3ApplicationConfiguration8.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType21);
        int int23 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + fileType21 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType21.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode11;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(1671296512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.FOREST;
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        com.badlogic.gdx.graphics.Color color6 = color1.lerp(color3, (float) (-50396672));
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color6);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color14 = color9.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color22 = color17.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color30 = color24.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str32 = color31.toString();
        com.badlogic.gdx.graphics.Color color34 = color24.lerp(color31, (-8.0750596E37f));
        boolean boolean35 = color17.equals((java.lang.Object) color24);
        com.badlogic.gdx.graphics.Color color36 = color16.add(color17);
        com.badlogic.gdx.graphics.Color color38 = color8.lerp(color16, (float) (-14540110));
        int int39 = com.badlogic.gdx.graphics.Color.rgb565(color8);
        com.badlogic.gdx.graphics.Color color40 = color6.sub(color8);
        color6.r = (-240);
        color6.a = (-248);
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color(color6);
        int int46 = com.badlogic.gdx.graphics.Color.rgb565(color6);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(color3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16777184) + "'", int4 == (-16777184));
        org.junit.Assert.assertNotNull(color6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00ff0000" + "'", str32, "00ff0000");
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2047 + "'", int39 == 2047);
        org.junit.Assert.assertNotNull(color40);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-15237120) + "'", int46 == (-15237120));
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 2105344, (float) 50200831, 0.0f, 1.7705992E21f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7013859E38f) + "'", float4 == (-1.7013859E38f));
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 1799159552, 0.44444445f, 9.18355E-41f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-36608) + "'", int3 == (-36608));
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(56864);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(2.2683366E-38f, (float) (-66048), 2.4259024E-18f, (-1.7011522E38f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-4.319991E37f) + "'", float4 == (-4.319991E37f));
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-61455));
        lwjgl3ApplicationConfiguration0.depth = (-32);
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setTitle("ffffff22");
        org.junit.Assert.assertNull(lwjgl3WindowListener9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(3, 8897069);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int16 = lwjgl3ApplicationConfiguration15.windowWidth;
        lwjgl3ApplicationConfiguration15.setBackBufferConfig(268493567, 0, (-80190464), (-32), (-65568), (-7936), 570425395);
        int int25 = lwjgl3ApplicationConfiguration15.getgles30ContextMajorVersion();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(1671296512);
        int int2 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color1, (-2336));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color1, 1794115036);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1671296512 + "'", int2 == 1671296512);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float13 = color12.a;
        com.badlogic.gdx.graphics.Color color18 = color12.mul((float) 8, (float) 1677696502, (float) 0L, (float) 43268);
        com.badlogic.gdx.graphics.Color color19 = color1.add(color18);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color18, 100);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.TAN;
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.VIOLET;
        com.badlogic.gdx.graphics.Color color29 = color23.lerp((float) (byte) 100, (float) 8, (float) 10, (float) 9, (float) (-1611265692));
        int int30 = com.badlogic.gdx.graphics.Color.rgba8888(color23);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color23);
        com.badlogic.gdx.graphics.Color color32 = color22.sub(color23);
        com.badlogic.gdx.graphics.Color color37 = color23.sub((-1.4523669E17f), (float) 3, (-5.68232E37f), (float) (-187392));
        com.badlogic.gdx.graphics.Color color38 = color23.cpy();
        com.badlogic.gdx.graphics.Color color39 = color18.mul(color23);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(14500320);
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-58475));
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        int int5 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setdepth(100);
        lwjgl3ApplicationConfiguration0.b = 480;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.windowY = 255;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TAN;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color0, (int) 'a');
        com.badlogic.gdx.graphics.Color color3 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, 50);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.b = (-587202461);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-1611265692);
        lwjgl3ApplicationConfiguration0.b = (byte) -1;
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1611265692) + "'", int7 == (-1611265692));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((-32.498047f), 1.68296448E8f, (float) 65280, 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-65536) + "'", int4 == (-65536));
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        boolean boolean7 = color5.equals((java.lang.Object) (byte) -1);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color5);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        int int16 = lwjgl3ApplicationConfiguration0.samples;
        int int17 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha(0.0f, (float) 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1785 + "'", int2 == 1785);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-12460032), 178, (-579592), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-396800) + "'", int4 == (-396800));
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1677721600, (-1.7014117E38f), 0.001822412f, 0.03137255f);
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        float float6 = color0.toFloatBits();
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color0, 1677696502);
        color0.r = (-2147483392);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 9.1477E-41f + "'", float6 == 9.1477E-41f);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        color1.r = 14;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.FOREST;
        int int1 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int3 = lwjgl3ApplicationConfiguration2.getaudioDeviceBufferSize();
        boolean boolean4 = lwjgl3ApplicationConfiguration2.windowResizable;
        lwjgl3ApplicationConfiguration2.depth = (short) 10;
        lwjgl3ApplicationConfiguration2.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color19 = color10.mul(color18);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration2.initialBackgroundColor = color10;
        com.badlogic.gdx.graphics.Color color23 = color0.set(color10);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color23, (int) ' ');
        int int26 = com.badlogic.gdx.graphics.Color.rgba8888(color23);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color23);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-16777184) + "'", int1 == (-16777184));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8192 + "'", int26 == 8192);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int11 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.g = 570425395;
        lwjgl3ApplicationConfiguration0.setwindowY(1610620896);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color13 = color8.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = color15.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str23 = color22.toString();
        com.badlogic.gdx.graphics.Color color25 = color15.lerp(color22, (-8.0750596E37f));
        boolean boolean26 = color8.equals((java.lang.Object) color15);
        com.badlogic.gdx.graphics.Color color27 = color7.add(color8);
        com.badlogic.gdx.graphics.Color color33 = color8.lerp(0.19607843f, (float) 167247232, (float) 16777215, (float) 587162524, 0.0f);
        int int34 = com.badlogic.gdx.graphics.Color.rgba4444(color33);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00ff0000" + "'", str23, "00ff0000");
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3840 + "'", int34 == 3840);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-32), (float) 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2086665) + "'", int2 == (-2086665));
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode9;
        lwjgl3ApplicationConfiguration0.windowX = 512;
        int int13 = lwjgl3ApplicationConfiguration0.g;
        int int14 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode9 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode9.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-554880), 1.7014117E38f, (float) (-512064), (float) 61455);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-41231) + "'", int4 == (-41231));
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 1671296512, (float) (-554880));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-128) + "'", int2 == (-128));
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (-16646400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-12460032));
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color12;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2015879168));
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        boolean boolean13 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.a = 16580354;
        int int17 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setWindowPosition((-34881504), 32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.g = (short) 0;
        lwjgl3ApplicationConfiguration0.windowX = 35;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 56864, 151015132);
        int int16 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.r = (-65280);
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-65024));
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-68060), 0.0f, (float) (-1562574848), (float) 61455);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6427872E38f) + "'", float4 == (-1.6427872E38f));
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        lwjgl3ApplicationConfiguration11.setTitle("ff00ff00");
        lwjgl3ApplicationConfiguration11.windowHeight = 166464502;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 13119;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        boolean boolean9 = lwjgl3ApplicationConfiguration7.vSyncEnabled;
        int int10 = lwjgl3ApplicationConfiguration7.g;
        lwjgl3ApplicationConfiguration7.setInitialVisible(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-134217728));
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int11 = lwjgl3ApplicationConfiguration0.g;
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        int int15 = lwjgl3ApplicationConfiguration13.windowX;
        lwjgl3ApplicationConfiguration13.setdisableAudio(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration11.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration11.samples = '4';
        com.badlogic.gdx.Files.FileType fileType16 = lwjgl3ApplicationConfiguration11.preferencesFileType;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration10.a = 61440;
        lwjgl3ApplicationConfiguration10.setWindowedMode(61455, 16744272);
        lwjgl3ApplicationConfiguration10.setpreferencesDirectory("ffff44ee");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + fileType16 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType16.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-8142));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2076210) + "'", int1 == (-2076210));
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color11 = color4.mul((float) 16580354);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((float) (-33488131), (float) 255, (float) 6356992, 1.67129651E9f);
        com.badlogic.gdx.graphics.Color color18 = color11.lerp(color16, (float) 2783);
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) 1642083276, (float) (-2117940064), (float) (-2015879168), (-1.6482297E38f));
        int int24 = com.badlogic.gdx.graphics.Color.rgb565(color18);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 63488 + "'", int24 == 63488);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((int) (byte) 10, (-265712), (-56576), (-61363200));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-68022262) + "'", int4 == (-68022262));
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-1.6415966E38f), (float) 166464000, 2.3418052E-38f, (float) 8192);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7013859E38f) + "'", float4 == (-1.7013859E38f));
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) 151015132, (-5.387877E37f), (-4.818329E37f), (float) (-2147483616));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16777216) + "'", int4 == (-16777216));
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565(6.163163E-33f, (float) 255, (float) 16776961);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 520091936 + "'", int3 == 520091936);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setAudioConfig(512, (-14540110), (int) (byte) 1);
        lwjgl3ApplicationConfiguration8.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = lwjgl3ApplicationConfiguration8.windowListener;
        lwjgl3ApplicationConfiguration8.audioDeviceBufferSize = (-33488896);
        int int18 = lwjgl3ApplicationConfiguration8.gles30ContextMajorVersion;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNull(lwjgl3WindowListener15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.depth = (-232);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.r = 63519;
        com.badlogic.gdx.graphics.Color color8 = color4.set(512);
        com.badlogic.gdx.graphics.Color color13 = color8.add((float) (-7876885), (float) 4095, (float) (-512), (-6.9082207E37f));
        color13.r = 2105344;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.g = (-7876885);
        lwjgl3ApplicationConfiguration0.b = (-16731648);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.r = 1677696502;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration18.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration18);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color27 = color22.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        int int28 = com.badlogic.gdx.graphics.Color.rgba8888(color22);
        lwjgl3ApplicationConfiguration21.initialBackgroundColor = color22;
        com.badlogic.gdx.graphics.Color color30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color32 = color22.lerp(color30, (float) (-27809536));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-256) + "'", int28 == (-256));
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-257551), (int) ' ', (-1902614), 65522);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6894161E38f) + "'", float4 == (-1.6894161E38f));
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.badlogic.gdx.graphics.Color.argb8888(color0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        int int8 = lwjgl3ApplicationConfiguration0.stencil;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-383778816);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffffff00";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 43268, 9);
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color19 = color14.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color20 = color13.sub(color19);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color23 = color22.cpy();
        com.badlogic.gdx.graphics.Color color28 = color22.add((float) '#', (float) (-13500161), (float) 512, (float) (-335));
        java.lang.String str29 = color28.toString();
        com.badlogic.gdx.graphics.Color color30 = color19.add(color28);
        int int31 = com.badlogic.gdx.graphics.Color.rgb565(color28);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ff00ff00" + "'", str29, "ff00ff00");
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 63519 + "'", int31 == 63519);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType4 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType4);
        lwjgl3ApplicationConfiguration0.setTitle("4169e1ff");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration10.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("", fileType16);
        com.badlogic.gdx.Files.FileType fileType18 = lwjgl3ApplicationConfiguration10.preferencesFileType;
        int int19 = lwjgl3ApplicationConfiguration10.samples;
        int int20 = lwjgl3ApplicationConfiguration10.windowHeight;
        lwjgl3ApplicationConfiguration10.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color25 = lwjgl3ApplicationConfiguration10.initialBackgroundColor;
        int int26 = com.badlogic.gdx.graphics.Color.argb8888(color25);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color25;
        int int28 = com.badlogic.gdx.graphics.Color.rgba8888(color25);
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNull(fileType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 480 + "'", int20 == 480);
        org.junit.Assert.assertNotNull(color25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1677721501) + "'", int26 == (-1677721501));
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 25500 + "'", int28 == 25500);
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(14500320, (-16711923), (int) (short) 1, 178);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1291891232) + "'", int4 == (-1291891232));
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) 2048, (float) 1, (float) (-65042), (float) (-68935680));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2097212928) + "'", int4 == (-2097212928));
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color11 = color6.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color19 = color14.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color27 = color21.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str29 = color28.toString();
        com.badlogic.gdx.graphics.Color color31 = color21.lerp(color28, (-8.0750596E37f));
        boolean boolean32 = color14.equals((java.lang.Object) color21);
        com.badlogic.gdx.graphics.Color color33 = color13.add(color14);
        com.badlogic.gdx.graphics.Color color35 = color5.lerp(color13, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color37 = color1.sub(color5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color47 = lwjgl3ApplicationConfiguration38.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color48 = color1.sub(color47);
        com.badlogic.gdx.graphics.Color color53 = color1.sub(0.0f, (float) 6147990, (float) 2147483647, 0.0f);
        color53.a = 65025;
        color53.b = 7680;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "00ff0000" + "'", str29, "00ff0000");
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color53);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.windowY = 56864;
        int int13 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        int int8 = color0.toIntBits();
        com.badlogic.gdx.graphics.Color color9 = color0.cpy();
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color0);
        int int11 = com.badlogic.gdx.graphics.Color.rgba8888(color10);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16777215 + "'", int7 == 16777215);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16777215 + "'", int8 == 16777215);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-256) + "'", int11 == (-256));
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.samples = (short) 1;
        lwjgl3ApplicationConfiguration10.stencil = (short) -1;
        lwjgl3ApplicationConfiguration10.useOpenGL3(false, 0, 480);
        int int19 = lwjgl3ApplicationConfiguration10.windowX;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(130560);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) 63519, (float) (-40036), (float) 3306396, (float) (-47784960));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-110329856) + "'", int4 == (-110329856));
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-37995), (-41231), (-33576664), (-2));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7012971E38f) + "'", float4 == (-1.7012971E38f));
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color7);
        color9.r = 65295;
        com.badlogic.gdx.graphics.Color color16 = color9.sub((float) (-7680), (float) (-940), (float) 240, (float) (-15671025));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-62986), 65530, (-65358), (-570425600));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1034) + "'", int4 == (-1034));
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.windowWidth = (-66048);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 240, (-1.4936944E38f), (float) (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2550) + "'", int3 == (-2550));
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) (-65400));
        java.lang.Class<?> wildcardClass4 = color1.getClass();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(0.057594743f, (float) 64783, (-1.6950762E38f), (float) (-58368));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-3.031089E36f) + "'", float4 == (-3.031089E36f));
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertNull(lwjgl3WindowListener5);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str9 = color8.toString();
        com.badlogic.gdx.graphics.Color color11 = color1.lerp(color8, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color12, 16);
        com.badlogic.gdx.graphics.Color color15 = color11.sub(color12);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color12, 1677696502);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color12, 480);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color25 = color20.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color20);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color33 = color28.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color41 = color35.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color42 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str43 = color42.toString();
        com.badlogic.gdx.graphics.Color color45 = color35.lerp(color42, (-8.0750596E37f));
        boolean boolean46 = color28.equals((java.lang.Object) color35);
        com.badlogic.gdx.graphics.Color color47 = color27.add(color28);
        com.badlogic.gdx.graphics.Color color48 = color12.set(color27);
        com.badlogic.gdx.graphics.Color color50 = color48.mul((float) (byte) 10);
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color(color48);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00000100" + "'", str9, "00000100");
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "00ff0000" + "'", str43, "00ff0000");
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color50);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-536969804));
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(20160);
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.r = (byte) -1;
        lwjgl3ApplicationConfiguration10.preferencesDirectory = "ffffff00";
        lwjgl3ApplicationConfiguration10.r = (-9216);
        lwjgl3ApplicationConfiguration10.setdepth(43268);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setwindowY((-18));
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-11604982), 7576628, 480, (-16646400), (-7876885), (-335), 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.r = 20188;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 65293;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode13 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(31);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertNull(lwjgl3DisplayMode13);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        int int7 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int8 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        lwjgl3ApplicationConfiguration0.depth = 167709184;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowX = 512;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.useVsync(true);
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        int int18 = lwjgl3ApplicationConfiguration0.windowWidth;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 640 + "'", int18 == 640);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener20);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-56320), (float) 8, (float) (-603664549), (float) 15990783);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1070333936 + "'", int4 == 1070333936);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setAudioConfig(512, (-14540110), (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.setDecorated(false);
        lwjgl3ApplicationConfiguration14.a = (byte) 10;
        boolean boolean19 = lwjgl3ApplicationConfiguration14.initialVisible;
        int int20 = lwjgl3ApplicationConfiguration14.b;
        lwjgl3ApplicationConfiguration14.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration14.preferencesFileType;
        lwjgl3ApplicationConfiguration8.setPreferencesConfig(".prefs/", fileType23);
        int int25 = lwjgl3ApplicationConfiguration8.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration8.b = (-2117009408);
        lwjgl3ApplicationConfiguration8.samples = (-65280);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration30.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration30.windowX = 100;
        boolean boolean35 = lwjgl3ApplicationConfiguration30.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType38 = null;
        lwjgl3ApplicationConfiguration37.setpreferencesFileType(fileType38);
        lwjgl3ApplicationConfiguration37.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration37.setPreferencesConfig("", fileType43);
        lwjgl3ApplicationConfiguration37.g = (short) 0;
        lwjgl3ApplicationConfiguration37.windowX = 35;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration49.setDecorated(false);
        lwjgl3ApplicationConfiguration49.a = (byte) 10;
        boolean boolean54 = lwjgl3ApplicationConfiguration49.initialVisible;
        int int55 = lwjgl3ApplicationConfiguration49.b;
        lwjgl3ApplicationConfiguration49.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType58 = lwjgl3ApplicationConfiguration49.preferencesFileType;
        lwjgl3ApplicationConfiguration37.setpreferencesFileType(fileType58);
        lwjgl3ApplicationConfiguration30.setPreferencesConfig("ffffff22", fileType58);
        lwjgl3ApplicationConfiguration8.preferencesFileType = fileType58;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 8 + "'", int55 == 8);
        org.junit.Assert.assertTrue("'" + fileType58 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType58.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 65535, 56864);
        int int12 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setwindowX((int) 'a');
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 10);
        lwjgl3ApplicationConfiguration0.g = 65295;
        boolean boolean18 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int19 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.windowY = (-1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setwindowX((int) 'a');
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 41903542;
        int int18 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener19;
        boolean boolean21 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setwindowY(0);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color18.g = (short) 1;
        com.badlogic.gdx.graphics.Color color22 = color10.lerp(color18, (float) 25500);
        com.badlogic.gdx.graphics.Color color27 = color10.mul(0.0f, (float) (-8142), (float) (-1562574848), (-1.0f));
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color33 = color28.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str34 = color33.toString();
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color35);
        int int37 = com.badlogic.gdx.graphics.Color.rgba4444(color36);
        com.badlogic.gdx.graphics.Color color38 = color33.mul(color36);
        com.badlogic.gdx.graphics.Color color39 = color27.add(color38);
        com.badlogic.gdx.graphics.Color color41 = color27.mul((float) (-33488131));
        float float42 = color41.b;
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ffffff00" + "'", str34, "ffffff00");
        org.junit.Assert.assertNotNull(color35);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-0.0f) + "'", float42 == (-0.0f));
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 10;
        java.lang.String str7 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.windowWidth = (-1880097264);
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType11 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration16.setgles30ContextMinorVersion(65025);
        int int19 = lwjgl3ApplicationConfiguration16.getgles30ContextMajorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        int int21 = lwjgl3ApplicationConfiguration20.getwindowX();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration6.setAudioConfig(1677696502, (-50396672), 2);
        int int11 = lwjgl3ApplicationConfiguration6.getwindowWidth();
        lwjgl3ApplicationConfiguration6.disableAudio(false);
        lwjgl3ApplicationConfiguration6.setWindowedMode(49939200, (-1562574848));
        int int17 = lwjgl3ApplicationConfiguration6.samples;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str2 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.windowHeight = 1;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-62986);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".prefs/" + "'", str2, ".prefs/");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration8.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration8.audioDeviceBufferCount = 61680;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int11 = lwjgl3ApplicationConfiguration0.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration12.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration12.windowX = 100;
        int int17 = lwjgl3ApplicationConfiguration12.stencil;
        int int18 = lwjgl3ApplicationConfiguration12.windowY;
        lwjgl3ApplicationConfiguration12.a = 43268;
        int int21 = lwjgl3ApplicationConfiguration12.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration12.setdepth(512);
        lwjgl3ApplicationConfiguration12.g = (byte) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration26.setpreferencesFileType(fileType27);
        lwjgl3ApplicationConfiguration26.useVsync(false);
        lwjgl3ApplicationConfiguration26.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration26.a = (-62986);
        lwjgl3ApplicationConfiguration26.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration26.hdpiMode = hdpiMode38;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode38;
        boolean boolean42 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType44 = null;
        lwjgl3ApplicationConfiguration43.setpreferencesFileType(fileType44);
        lwjgl3ApplicationConfiguration43.disableAudio = true;
        lwjgl3ApplicationConfiguration43.initialVisible = true;
        int int50 = lwjgl3ApplicationConfiguration43.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration43.stencil = 1671296512;
        lwjgl3ApplicationConfiguration43.r = (-16777216);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode56 = null;
        lwjgl3ApplicationConfiguration55.setFullscreenMode(displayMode56);
        lwjgl3ApplicationConfiguration55.windowX = 100;
        int int60 = lwjgl3ApplicationConfiguration55.g;
        com.badlogic.gdx.Files.FileType fileType61 = lwjgl3ApplicationConfiguration55.getpreferencesFileType();
        lwjgl3ApplicationConfiguration55.initialVisible = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int66 = lwjgl3ApplicationConfiguration65.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration65.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType69 = lwjgl3ApplicationConfiguration65.preferencesFileType;
        lwjgl3ApplicationConfiguration55.setPreferencesConfig("ffffffff", fileType69);
        lwjgl3ApplicationConfiguration43.preferencesFileType = fileType69;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType69);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 512 + "'", int50 == 512);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 8 + "'", int60 == 8);
        org.junit.Assert.assertTrue("'" + fileType61 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType61.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 512 + "'", int66 == 512);
        org.junit.Assert.assertTrue("'" + fileType69 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType69.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-33488131), 16777215);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color7 = color5.set(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color41 = color5.sub(color9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color51 = lwjgl3ApplicationConfiguration42.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color52 = color5.sub(color51);
        com.badlogic.gdx.graphics.Color color57 = color5.sub(0.0f, (float) 6147990, (float) 2147483647, 0.0f);
        com.badlogic.gdx.graphics.Color color58 = color5.clamp();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color58);
        lwjgl3ApplicationConfiguration0.setwindowY((-2147283968));
        int int62 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "00ff0000" + "'", str33, "00ff0000");
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 16 + "'", int62 == 16);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.19607843f, 9.1477E-41f, (float) 512, (float) 20188);
        int int5 = color4.toIntBits();
        float float6 = color4.r;
        color4.b = (-68935680);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-65486) + "'", int5 == (-65486));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.19607843f + "'", float6 == 0.19607843f);
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-16777184), (float) (-2219520), (float) (-79360));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2099712) + "'", int3 == (-2099712));
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.samples = (-2105704448);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-1224736769), (float) 166464000, 0.8666667f, 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-48) + "'", int4 == (-48));
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-65025), (float) 31, (float) 480, 10.0f);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        com.badlogic.gdx.graphics.Color color11 = color9.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color16 = color9.set((float) (-65536), (float) (-2), (float) (-8142), (float) (-469852380));
        int int17 = com.badlogic.gdx.graphics.Color.rgb565(color16);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-1241350299));
        int int7 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.g = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color1, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color17 = color1.mul((float) 9, (float) (-2228480), (float) (-1L), (float) (-790528));
        color1.r = 0.0f;
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.g = 6356992;
        int int13 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        int int10 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color20 = color15.sub((float) (short) 0, (-1.6947917E38f), (-1.6947917E38f), (float) (-62986));
        com.badlogic.gdx.graphics.Color color22 = color15.set(25500);
        com.badlogic.gdx.graphics.Color color27 = color22.add((float) (-34), (-1.6960587E38f), (float) 65535, (float) 33554176);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color27);
        java.lang.Class<?> wildcardClass29 = color27.getClass();
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1902614), (float) 16777215, 1.561203E-39f, (float) 16777215);
        java.lang.Class<?> wildcardClass5 = color4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color11 = color4.mul((float) 16580354);
        color11.r = 3855;
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.SKY;
        int int15 = com.badlogic.gdx.graphics.Color.argb8888(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str17 = lwjgl3ApplicationConfiguration16.title;
        lwjgl3ApplicationConfiguration16.a = (-1);
        boolean boolean20 = lwjgl3ApplicationConfiguration16.vSyncEnabled;
        lwjgl3ApplicationConfiguration16.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color23 = lwjgl3ApplicationConfiguration16.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color24 = color14.mul(color23);
        com.badlogic.gdx.graphics.Color color25 = color23.cpy();
        com.badlogic.gdx.graphics.Color color26 = color11.set(color23);
        color23.a = (-2228480);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha(0.0f, 0.93333334f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 238 + "'", int2 == 238);
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition(61450, (-1562574848));
        lwjgl3ApplicationConfiguration0.windowWidth = 1677786624;
        lwjgl3ApplicationConfiguration0.a = 284196832;
        lwjgl3ApplicationConfiguration0.windowHeight = (-187392);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        int int14 = lwjgl3ApplicationConfiguration13.getwindowX();
        int int15 = lwjgl3ApplicationConfiguration13.getwindowWidth();
        lwjgl3ApplicationConfiguration13.setAudioConfig((-1056), 1785, (-56576));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GREEN;
        com.badlogic.gdx.graphics.Color color6 = color0.lerp((-4.581683E37f), (float) 20160, (float) 13260, (float) (-187392), (float) (-1879860224));
        color6.r = 0.44444445f;
        color6.b = (-524536);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((float) (-59160), (float) (-10887648), (float) (-1562574848), 2.2407642E-38f);
        boolean boolean16 = color6.equals((java.lang.Object) (-10887648));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.stencil = 1677696502;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(8897069);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-2147283968), (float) (-2550));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-650250) + "'", int2 == (-650250));
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        int int4 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0.0f, (float) 1, 0.13333334f, 1.561203E-39f);
        com.badlogic.gdx.graphics.Color color11 = color9.mul((float) 100);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        int int13 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setWindowedMode((-652800), 570949632);
        int int17 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 480 + "'", int13 == 480);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 570949632 + "'", int17 == 570949632);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType8);
        lwjgl3ApplicationConfiguration7.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration7.g = (short) 0;
        lwjgl3ApplicationConfiguration7.windowX = 35;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.setDecorated(false);
        lwjgl3ApplicationConfiguration19.a = (byte) 10;
        boolean boolean24 = lwjgl3ApplicationConfiguration19.initialVisible;
        int int25 = lwjgl3ApplicationConfiguration19.b;
        lwjgl3ApplicationConfiguration19.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType28 = lwjgl3ApplicationConfiguration19.preferencesFileType;
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType28);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffffff22", fileType28);
        java.lang.String str31 = lwjgl3ApplicationConfiguration0.title;
        int int32 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 16 + "'", int32 == 16);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, 8);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.g = (short) 0;
        lwjgl3ApplicationConfiguration0.windowX = 35;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 56864, 151015132);
        int int16 = lwjgl3ApplicationConfiguration0.windowY;
        int int17 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int18 = lwjgl3ApplicationConfiguration0.g;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 2016, (float) (-262176), (-1.6969465E38f), (float) (-2086665));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 3.4084816E-37f + "'", float4 == 3.4084816E-37f);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-1291845633));
        java.lang.Class<?> wildcardClass2 = color1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(65367, 1677721600, 0, (-379904));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 9.1599E-41f + "'", float4 == 9.1599E-41f);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-650250), (int) (byte) 100, 9, 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6978801E38f) + "'", float4 == (-1.6978801E38f));
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setwindowX(16776961);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration13.windowY = 166464502;
        lwjgl3ApplicationConfiguration13.windowX = (-7876885);
        lwjgl3ApplicationConfiguration13.disableAudio = false;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 'a';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((-1.4936944E38f), (float) (-1669267456));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.g = (short) 0;
        int int10 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        int int13 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int8 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener9;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 640 + "'", int8 == 640);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setAudioConfig(512, (-14540110), (int) (byte) 1);
        lwjgl3ApplicationConfiguration8.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = lwjgl3ApplicationConfiguration8.windowListener;
        int int16 = lwjgl3ApplicationConfiguration8.getwindowX();
        int int17 = lwjgl3ApplicationConfiguration8.getgles30ContextMajorVersion();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNull(lwjgl3WindowListener15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-32), (-16719105), (int) '4', (-22));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7014086E38f) + "'", float4 == (-1.7014086E38f));
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int8 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.setwindowY(100);
        int int7 = lwjgl3ApplicationConfiguration0.windowY;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.initialVisible;
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-59160), (float) (-1241513983), (float) (-1056), (float) (-16734721));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-148496) + "'", int4 == (-148496));
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode9 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode9;
        int int11 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int12 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 8256822, (float) (-3200), (float) 7576628, (float) 33423457);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6995686E38f) + "'", float4 == (-1.6995686E38f));
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration14.windowX = 100;
        int int19 = lwjgl3ApplicationConfiguration14.g;
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration14.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffffff00", fileType20);
        int int22 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (-10420224));
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(268493567, (-1241513983), 62976, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-150936577) + "'", int4 == (-150936577));
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int11 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.useGL30;
        int int13 = lwjgl3ApplicationConfiguration0.stencil;
        int int14 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 640 + "'", int14 == 640);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowWidth = 65522;
        int int13 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.graphics.Color color14 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener17;
        int int19 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.b = (-45390);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 65522 + "'", int13 == 65522);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(16718848, 16776994, (int) (byte) -1, 63519);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6963753E38f) + "'", float4 == (-1.6963753E38f));
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.6789801E38f), (float) 587162524, (float) (-167706623), (float) 524288);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color4, 65522);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 369623040, (-5.4452915E37f), (float) (-65024));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-512) + "'", int3 == (-512));
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType15 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration11.setPreferencesConfig("hi!", fileType15);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType15;
        lwjgl3ApplicationConfiguration0.setdepth(480);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, 33554176);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNull(lwjgl3WindowListener22);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setwindowX((int) 'a');
        int int14 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (byte) 1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-265712), (float) 16759790);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.g = 587162524;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("00ff0000");
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setwindowX((int) 'a');
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType17);
        lwjgl3ApplicationConfiguration16.useVsync(false);
        lwjgl3ApplicationConfiguration16.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration16.a = (-62986);
        lwjgl3ApplicationConfiguration16.setdisableAudio(true);
        boolean boolean28 = lwjgl3ApplicationConfiguration16.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration30.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration30.windowX = 100;
        int int35 = lwjgl3ApplicationConfiguration30.g;
        com.badlogic.gdx.Files.FileType fileType36 = lwjgl3ApplicationConfiguration30.getpreferencesFileType();
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("ffffff00", fileType36);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("000000ff", fileType36);
        int int39 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + fileType36 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType36.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int11 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.r = 1677721600;
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        lwjgl3ApplicationConfiguration0.setwindowHeight(151015132);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration17.setsamples(43268);
        lwjgl3ApplicationConfiguration17.samples = (-119406593);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 58111, (float) (-768));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-195840) + "'", int2 == (-195840));
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLACK;
        float float1 = color0.r;
        com.badlogic.gdx.graphics.Color color6 = color0.set((-8.0750596E37f), 0.0f, (float) (-1L), (float) 65024);
        float float7 = color0.g;
        com.badlogic.gdx.graphics.Color color8 = color0.cpy();
        com.badlogic.gdx.graphics.Color color10 = color0.mul((float) (-16711923));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color10, (-16252928));
        com.badlogic.gdx.graphics.Color color13 = color10.premultiplyAlpha();
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.67129651E9f + "'", float1 == 1.67129651E9f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str1 = color0.toString();
        color0.g = 16;
        int int4 = com.badlogic.gdx.graphics.Color.rgb888(color0);
        color0.r = (-1611265692);
        float float7 = color0.r;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00ff0000" + "'", str1, "00ff0000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1044480 + "'", int4 == 1044480);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.61126566E9f) + "'", float7 == (-1.61126566E9f));
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16711425);
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setsamples(65295);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((-4.153069E34f), (float) (-1669267456), (float) (-45390));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1407090) + "'", int3 == (-1407090));
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.b = '4';
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.setDecorated(false);
        lwjgl3ApplicationConfiguration15.a = (byte) 10;
        boolean boolean20 = lwjgl3ApplicationConfiguration15.initialVisible;
        int int21 = lwjgl3ApplicationConfiguration15.b;
        lwjgl3ApplicationConfiguration15.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color24;
        boolean boolean26 = lwjgl3ApplicationConfiguration15.useGL30;
        com.badlogic.gdx.Files.FileType fileType27 = lwjgl3ApplicationConfiguration15.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType27);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-118095928));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNull(fileType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode(56864, (int) (short) 0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        int int10 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int15 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-12632257);
        int int19 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-33488131));
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-402678048), (-1.7013859E38f), (float) (-32770560), (float) 16772625);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode12;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int19 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode20 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode20;
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (byte) 1, 0.0f, (float) (byte) 0, (float) (byte) 100);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color4);
        color6.r = (-262646);
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setdepth((-1610612736));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode10;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = '4';
        int int19 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.depth = (-150);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int12 = lwjgl3ApplicationConfiguration0.windowWidth;
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.b = 587202527;
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-119406593), (-61455), (-8672), (-33566977));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.5950735E38f) + "'", float4 == (-1.5950735E38f));
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("4169e1ff");
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("ffff72ff");
        org.junit.Assert.assertNull(fileType14);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        lwjgl3ApplicationConfiguration0.setwindowHeight(151015132);
        lwjgl3ApplicationConfiguration0.setTitle("88bb2222");
        int int19 = lwjgl3ApplicationConfiguration0.samples;
        boolean boolean20 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-16777119), (-14671700), (-8192), (-2142638528));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-5.339288E37f) + "'", float4 == (-5.339288E37f));
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888(2.2407642E-38f, (float) 587202527, (float) (-18874624), (float) (-65486));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-52786) + "'", int4 == (-52786));
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str9 = color8.toString();
        com.badlogic.gdx.graphics.Color color11 = color1.lerp(color8, (-8.0750596E37f));
        int int12 = com.badlogic.gdx.graphics.Color.rgb888(color11);
        int int13 = com.badlogic.gdx.graphics.Color.rgba8888(color11);
        float float14 = color11.toFloatBits();
        float float15 = color11.r;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color21 = color11.sub((float) (-59160), 0.001822412f, 0.0f, 0.13725491f);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ffffff00" + "'", str9, "ffffff00");
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16711935 + "'", int12 == 16711935);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-16711936) + "'", int13 == (-16711936));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.3418409E-38f + "'", float14 == 2.3418409E-38f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(color21);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-15333376), (float) 4080, (float) (-16777184), (float) (-15144960));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-134242816) + "'", int4 == (-134242816));
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        lwjgl3ApplicationConfiguration13.setaudioDeviceSimultaneousSources((-40036));
        boolean boolean16 = lwjgl3ApplicationConfiguration13.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration13.setWindowListener(lwjgl3WindowListener17);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int14 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setTitle("ffff0000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(16744272, (-2105704448), (-12989440), 2016);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0612943E37f) + "'", float4 == (-1.0612943E37f));
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2113928961));
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        color1.b = 0.003921569f;
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(65280);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(3, 8897069);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int16 = lwjgl3ApplicationConfiguration15.windowWidth;
        lwjgl3ApplicationConfiguration15.setTitle("");
        int int19 = lwjgl3ApplicationConfiguration15.getdepth();
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration15.preferencesFileType;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertNull(fileType20);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color9, 8897069);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color17 = color12.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        int int20 = com.badlogic.gdx.graphics.Color.argb8888(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color19);
        com.badlogic.gdx.graphics.Color color23 = color9.lerp(color19, (float) 1044480);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color();
        com.badlogic.gdx.graphics.Color color25 = color9.sub(color24);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color9, (-58475));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color9, 0);
        float float30 = color9.a;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16777215 + "'", int20 == 16777215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-256) + "'", int21 == (-256));
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.33333334f + "'", float30 == 0.33333334f);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-2550));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-650250) + "'", int1 == (-650250));
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((-4.7187594E37f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) 246);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 62730 + "'", int1 == 62730);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.7005811E38f), (float) (-3056), 0.30588236f, (float) 16772625);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (byte) 1, (-5.08119E37f), (-1.6969465E38f), (float) 195840);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-392448) + "'", int4 == (-392448));
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        lwjgl3ApplicationConfiguration0.setdepth(0);
        lwjgl3ApplicationConfiguration0.setwindowX(640);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.title = "ffffffb2";
        int int15 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-1));
        boolean boolean18 = lwjgl3ApplicationConfiguration0.initialVisible;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration19.setpreferencesFileType(fileType20);
        lwjgl3ApplicationConfiguration19.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration19.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration19.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = lwjgl3ApplicationConfiguration19.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode29;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration31.windowDecorated = true;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration31);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.6954926E38f), (float) (-335609856), 0.0f, (-1.24151398E9f));
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-118095928), (float) 16707600, 3.57E-43f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-677216256) + "'", int3 == (-677216256));
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-16580863), (float) (-9216));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2350080) + "'", int2 == (-2350080));
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.windowHeight = (-56320);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType11 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        lwjgl3ApplicationConfiguration17.setsamples((-7688));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-1677721501));
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-33488131));
        int int10 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-10);
        int int14 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 3845;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color2, 16);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color2);
        int int6 = lwjgl3ApplicationConfiguration0.g;
        int int7 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 8192, (float) (-47784960), (float) (-16741598), (float) (-1980237824));
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setInitialVisible(true);
        lwjgl3ApplicationConfiguration8.setwindowX(20160);
        lwjgl3ApplicationConfiguration8.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.preferencesFileType = fileType16;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        lwjgl3ApplicationConfiguration18.setwindowDecorated(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        lwjgl3ApplicationConfiguration0.a = (-1291845633);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.title = "acffffff";
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888(0.99215686f, (float) (-96), (float) (-8320));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8064) + "'", int3 == (-8064));
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-128512), (-5.360365E37f), (float) 1651519680, (float) 1426063359);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 'a';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int13 = lwjgl3ApplicationConfiguration12.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration12.audioDeviceBufferCount = (-469852380);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (short) 100, (float) (-254), (float) (-16776961), (float) 140834847);
        float float5 = color4.b;
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(20160);
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-248));
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (-938016));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(284196832, 1105199359, (-820510720), (-16777119));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-5.966859E29f) + "'", float4 == (-5.966859E29f));
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str7 = lwjgl3ApplicationConfiguration6.title;
        lwjgl3ApplicationConfiguration6.a = (-1);
        boolean boolean10 = lwjgl3ApplicationConfiguration6.vSyncEnabled;
        lwjgl3ApplicationConfiguration6.setgles30ContextMajorVersion((-50135050));
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration6.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffff0100", fileType13);
        boolean boolean15 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        int int10 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int15 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-12632257);
        int int19 = lwjgl3ApplicationConfiguration0.g;
        int int20 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565(1.5612034E-37f, (float) 65280, (float) (-79360));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2460160) + "'", int3 == (-2460160));
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str9 = color8.toString();
        com.badlogic.gdx.graphics.Color color11 = color1.lerp(color8, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color12, 16);
        com.badlogic.gdx.graphics.Color color15 = color11.sub(color12);
        color12.a = 65024;
        float float18 = color12.b;
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color21 = color20.cpy();
        boolean boolean22 = color19.equals((java.lang.Object) color20);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        color23.g = 35;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(3);
        color27.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color30 = color27.clamp();
        com.badlogic.gdx.graphics.Color color35 = color30.sub((float) (-14540110), (float) (short) -1, (float) (-14513374), (float) 2);
        com.badlogic.gdx.graphics.Color color36 = color23.add(color35);
        com.badlogic.gdx.graphics.Color color37 = color20.set(color35);
        float float38 = color35.r;
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00ff0000" + "'", str9, "00ff0000");
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.06666667f + "'", float18 == 0.06666667f);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-12989440), (float) (-11280864), (float) (-16189440), (float) 480);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 122400 + "'", int4 == 122400);
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(13119);
        int int2 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13119 + "'", int2 == 13119);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-62986), (float) 'a', (float) '4', (float) (short) 10);
        com.badlogic.gdx.graphics.Color color9 = color4.set((float) (-256), (float) 3840, (float) ' ', (-1.7013883E38f));
        com.badlogic.gdx.graphics.Color color10 = color4.cpy();
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color4, (-128508928));
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 250675200, 62730);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-567943452);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration11.windowX = (-47784960);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-33488131));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration10.disableAudio = true;
        int int15 = lwjgl3ApplicationConfiguration10.windowY;
        int int16 = lwjgl3ApplicationConfiguration10.audioDeviceBufferCount;
        int int17 = lwjgl3ApplicationConfiguration10.a;
        boolean boolean18 = lwjgl3ApplicationConfiguration10.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration10.hdpiMode = hdpiMode19;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.b = (-10420224);
        boolean boolean24 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-11280864));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color0, 41903542);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color0, (-50396672));
        com.badlogic.gdx.graphics.Color color14 = color0.set((float) (-262646), (float) (-1902614), (float) 65295, (float) 65535);
        com.badlogic.gdx.graphics.Color color19 = color0.set((-32.498047f), (float) (-32770560), (float) 65280, (float) (-67611904));
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color0);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1470693630, (float) (byte) 0, (float) 2048, 1.7705992E21f);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowY = 20188;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.initialVisible;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-256);
        boolean boolean16 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.samples = 3845;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color6 = color4.set((int) (short) 0);
        int int7 = com.badlogic.gdx.graphics.Color.rgba4444(color4);
        java.lang.String str8 = color4.toString();
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color14 = color9.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color15);
        int int17 = com.badlogic.gdx.graphics.Color.argb8888(color16);
        int int18 = com.badlogic.gdx.graphics.Color.argb8888(color16);
        com.badlogic.gdx.graphics.Color color20 = color16.set(3);
        com.badlogic.gdx.graphics.Color color21 = color4.set(color20);
        com.badlogic.gdx.graphics.Color color26 = color21.add((float) 61455, (float) 512, (float) (-2219520), (float) 2147483647);
        int int27 = com.badlogic.gdx.graphics.Color.argb8888(color26);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16777215 + "'", int17 == 16777215);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16777215 + "'", int18 == 16777215);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-256) + "'", int27 == (-256));
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setwindowX(16776961);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(65535);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("ffffffff");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(20160);
        lwjgl3ApplicationConfiguration0.windowY = 2550;
        int int13 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 13119;
        int int13 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.title = "ff660000";
        int int16 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int17 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-2117940064), (float) (-50135050), (float) (-84), (float) (-2113928961));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-3.0127012E-12f) + "'", float4 == (-3.0127012E-12f));
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str6 = color5.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color5, 1);
        com.badlogic.gdx.graphics.Color color13 = color5.mul((float) 41903542, (float) (-8672), (float) (-50135050), (float) (-10));
        com.badlogic.gdx.graphics.Color color19 = color13.lerp((float) (-65025), (-0.0f), (float) (-65486), (float) (byte) 10, (float) (-1L));
        color13.b = 652800;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str23 = lwjgl3ApplicationConfiguration22.title;
        lwjgl3ApplicationConfiguration22.windowY = 20188;
        int int26 = lwjgl3ApplicationConfiguration22.getwindowWidth();
        boolean boolean27 = color13.equals((java.lang.Object) int26);
        color13.r = (-790528);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color13);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ffffff00" + "'", str6, "ffffff00");
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 640 + "'", int26 == 640);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(0.0f, (float) (-195840), 2.541842E-29f, (-5.08119E37f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-50331648) + "'", int4 == (-50331648));
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-61455));
        lwjgl3ApplicationConfiguration0.depth = (-32);
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertNull(lwjgl3WindowListener9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        float float6 = color0.toFloatBits();
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color0, 1677696502);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color16 = color11.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color17 = color10.sub(color16);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color10, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color24 = color10.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        int int25 = com.badlogic.gdx.graphics.Color.rgba8888(color10);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color35 = color29.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color36 = color27.mul(color35);
        int int37 = com.badlogic.gdx.graphics.Color.argb8888(color36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str39 = lwjgl3ApplicationConfiguration38.title;
        com.badlogic.gdx.graphics.Color color40 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color40, 16);
        lwjgl3ApplicationConfiguration38.setInitialBackgroundColor(color40);
        int int44 = lwjgl3ApplicationConfiguration38.g;
        boolean boolean45 = color36.equals((java.lang.Object) lwjgl3ApplicationConfiguration38);
        com.badlogic.gdx.graphics.Color color46 = color10.add(color36);
        com.badlogic.gdx.graphics.Color color47 = color0.set(color36);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color36, (-2099712));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 9.1477E-41f + "'", float6 == 9.1477E-41f);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 16711935 + "'", int25 == 16711935);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 16711935 + "'", int37 == 16711935);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 8 + "'", int44 == 8);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color47);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((-1.5862616E29f), (-1.6947916E38f), (float) (-16252928), 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 394264576 + "'", int4 == 394264576);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2117009408));
        float float2 = color1.toFloatBits();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.5156E-41f + "'", float2 == 7.5156E-41f);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode10;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int15 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        boolean boolean16 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int17 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 50;
        lwjgl3ApplicationConfiguration0.windowHeight = (-16734721);
        java.lang.String str22 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ".prefs/" + "'", str22, ".prefs/");
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-2147283968), (-8202), (-536969804), 1114112);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-512) + "'", int4 == (-512));
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color9, 8897069);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color17 = color12.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        int int20 = com.badlogic.gdx.graphics.Color.argb8888(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color19);
        com.badlogic.gdx.graphics.Color color23 = color9.lerp(color19, (float) 1044480);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color();
        com.badlogic.gdx.graphics.Color color25 = color9.sub(color24);
        com.badlogic.gdx.graphics.Color color27 = color24.set(1794115036);
        com.badlogic.gdx.graphics.Color color28 = color24.premultiplyAlpha();
        int int29 = color24.toIntBits();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color24, (-67111040));
        color24.a = (-256);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16777215 + "'", int20 == 16777215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-256) + "'", int21 == (-256));
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-603664549) + "'", int29 == (-603664549));
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(1044480, 167247232, (-2113928961), 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-2.5955146E33f) + "'", float4 == (-2.5955146E33f));
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-61455), (float) 195840, (float) (-16646400), (float) (-232));
        color4.g = (-12632257);
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color16 = color10.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color17 = color8.mul(color16);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color8, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        int int21 = com.badlogic.gdx.graphics.Color.argb8888(color8);
        com.badlogic.gdx.graphics.Color color22 = color8.clamp();
        java.lang.String str23 = color22.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00000000" + "'", str23, "00000000");
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) 587162524);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) 1794115036, (float) (-11280864), (float) 12263936, (float) 369623040);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-255));
        com.badlogic.gdx.graphics.Color color6 = color1.set((float) (-567943452), (float) 1, (float) (short) -1, (float) (-567943452));
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color8 = color7.cpy();
        com.badlogic.gdx.graphics.Color color10 = color1.lerp(color8, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color11, (-256));
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.FOREST;
        int int15 = com.badlogic.gdx.graphics.Color.argb8888(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int17 = lwjgl3ApplicationConfiguration16.getaudioDeviceBufferSize();
        boolean boolean18 = lwjgl3ApplicationConfiguration16.windowResizable;
        lwjgl3ApplicationConfiguration16.depth = (short) 10;
        lwjgl3ApplicationConfiguration16.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color32 = color26.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color33 = color24.mul(color32);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color24, (int) (byte) 0);
        lwjgl3ApplicationConfiguration16.initialBackgroundColor = color24;
        com.badlogic.gdx.graphics.Color color37 = color14.set(color24);
        com.badlogic.gdx.graphics.Color color38 = color11.add(color14);
        com.badlogic.gdx.graphics.Color color39 = color8.mul(color11);
        java.lang.Class<?> wildcardClass40 = color11.getClass();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.windowWidth = (-65025);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.setDecorated(false);
        lwjgl3ApplicationConfiguration11.a = (byte) 10;
        boolean boolean16 = lwjgl3ApplicationConfiguration11.initialVisible;
        int int17 = lwjgl3ApplicationConfiguration11.b;
        lwjgl3ApplicationConfiguration11.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color20;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int23 = lwjgl3ApplicationConfiguration22.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration22.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType26 = lwjgl3ApplicationConfiguration22.preferencesFileType;
        lwjgl3ApplicationConfiguration11.setpreferencesFileType(fileType26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration28.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration28.windowX = 100;
        int int33 = lwjgl3ApplicationConfiguration28.g;
        int int34 = lwjgl3ApplicationConfiguration28.getwindowY();
        com.badlogic.gdx.Files.FileType fileType35 = lwjgl3ApplicationConfiguration28.getpreferencesFileType();
        lwjgl3ApplicationConfiguration11.preferencesFileType = fileType35;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType35;
        lwjgl3ApplicationConfiguration0.samples = (-222);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int41 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + fileType35 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType35.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-65025) + "'", int41 == (-65025));
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(0.19607843f, 0.13725491f, 0.0f, (float) (-248));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-63240) + "'", int4 == (-63240));
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (-262646));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode9 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode9;
        int int11 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.6974137E38f), (float) 65534, (float) 167709184, (float) 'a');
        com.badlogic.gdx.graphics.Color color6 = color4.set(1794115036);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        color0.g = 35;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(3);
        color4.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color7 = color4.clamp();
        com.badlogic.gdx.graphics.Color color12 = color7.sub((float) (-14540110), (float) (short) -1, (float) (-14513374), (float) 2);
        com.badlogic.gdx.graphics.Color color13 = color0.add(color12);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color19 = color14.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color20);
        int int22 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        com.badlogic.gdx.graphics.Color color25 = color21.set(3);
        com.badlogic.gdx.graphics.Color color26 = color0.sub(color25);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color27, (-2147283968));
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color((int) (byte) -1);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color((float) 6356992, (float) 16, (float) (-65024), (float) 2016);
        com.badlogic.gdx.graphics.Color color38 = color31.lerp(color36, (-5.68232E37f));
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color36);
        com.badlogic.gdx.graphics.Color color40 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color45 = color40.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str46 = color45.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color45, 1);
        com.badlogic.gdx.graphics.Color color53 = color45.mul((float) 41903542, (float) (-8672), (float) (-50135050), (float) (-10));
        com.badlogic.gdx.graphics.Color color59 = color53.lerp((float) (-65025), (-0.0f), (float) (-65486), (float) (byte) 10, (float) (-1L));
        color53.b = 652800;
        boolean boolean62 = color36.equals((java.lang.Object) 652800);
        com.badlogic.gdx.graphics.Color color63 = color27.add(color36);
        float float64 = color63.b;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16777215 + "'", int22 == 16777215);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16777215 + "'", int23 == 16777215);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color45);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ffffffff" + "'", str46, "ffffffff");
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.windowHeight = 'a';
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        int int15 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int16 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.depth = (-7688);
        lwjgl3ApplicationConfiguration0.r = 123030;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.windowY = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-587202461));
        lwjgl3ApplicationConfiguration0.depth = (-752);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888(0.0f, (float) (-946176), (float) 20188);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1635873500) + "'", int3 == (-1635873500));
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-13500161), (-5.68232E37f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setTitle("00ff0000");
        int int9 = lwjgl3ApplicationConfiguration0.depth;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-135823360), (float) 1557110528, (float) 167247232, (float) (-2));
        int int5 = com.badlogic.gdx.graphics.Color.rgba4444(color4);
        int int6 = com.badlogic.gdx.graphics.Color.rgb565(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4080 + "'", int5 == 4080);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2047 + "'", int6 == 2047);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(0.0f, (float) (-128512), 0.13333334f, (-32.498047f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-95) + "'", int4 == (-95));
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) ' ');
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        int int3 = com.badlogic.gdx.graphics.Color.rgb565(color2);
        color2.b = (-222);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.YELLOW;
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.SALMON;
        float float2 = color1.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str4 = lwjgl3ApplicationConfiguration3.title;
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color5, 16);
        lwjgl3ApplicationConfiguration3.setInitialBackgroundColor(color5);
        com.badlogic.gdx.graphics.Color color13 = color5.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = color15.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str23 = color22.toString();
        com.badlogic.gdx.graphics.Color color25 = color15.lerp(color22, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color26, 16);
        com.badlogic.gdx.graphics.Color color29 = color25.sub(color26);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color26, 1677696502);
        com.badlogic.gdx.graphics.Color color32 = color5.sub(color26);
        com.badlogic.gdx.graphics.Color color33 = color1.add(color26);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color36 = color0.lerp(color34, 0.2580645f);
        int int37 = com.badlogic.gdx.graphics.Color.rgb565(color36);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color36, (-256));
        int int40 = com.badlogic.gdx.graphics.Color.argb8888(color36);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.163163E-33f + "'", float2 == 6.163163E-33f);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00ff0000" + "'", str23, "00ff0000");
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 48416 + "'", int37 == 48416);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1929387520) + "'", int40 == (-1929387520));
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(11667711, (int) '#', (-59160), (-436443648));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 6.466791E-24f + "'", float4 == 6.466791E-24f);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(2.2683366E-38f, (float) 160, (float) (-2147477600), (float) (-541699));
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-35402), (-1.7005551E38f), (float) (-14513374), (float) 251658239);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-8.1830974E37f) + "'", float4 == (-8.1830974E37f));
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int13 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.depth = (-232);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        int int12 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration13.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration13.samples = (-1);
        lwjgl3ApplicationConfiguration13.setgles30ContextMajorVersion(1677696502);
        boolean boolean20 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        lwjgl3ApplicationConfiguration13.setaudioDeviceBufferCount((-33488131));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration23.setpreferencesFileType(fileType24);
        lwjgl3ApplicationConfiguration23.disableAudio = true;
        int int28 = lwjgl3ApplicationConfiguration23.windowY;
        int int29 = lwjgl3ApplicationConfiguration23.audioDeviceBufferCount;
        int int30 = lwjgl3ApplicationConfiguration23.a;
        boolean boolean31 = lwjgl3ApplicationConfiguration23.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration23.hdpiMode = hdpiMode32;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration10.setHdpiMode(hdpiMode32);
        boolean boolean36 = lwjgl3ApplicationConfiguration10.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3ApplicationConfiguration10.setWindowListener(lwjgl3WindowListener37);
        int int39 = lwjgl3ApplicationConfiguration10.getgles30ContextMinorVersion();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-1090519041), (float) (-58475), (float) 14500320);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color24 = color18.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color25 = color16.mul(color24);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color33 = color27.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color33.g = (short) 1;
        com.badlogic.gdx.graphics.Color color37 = color25.lerp(color33, (float) 25500);
        int int38 = com.badlogic.gdx.graphics.Color.rgba8888(color37);
        com.badlogic.gdx.graphics.Color color43 = color37.mul((float) 16, (-1.0f), (float) 524288, 1.7014117E38f);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color43);
        lwjgl3ApplicationConfiguration0.depth = 3381300;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-256) + "'", int38 == (-256));
        org.junit.Assert.assertNotNull(color43);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        int int9 = com.badlogic.gdx.graphics.Color.rgba4444(color6);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color15 = color10.set((float) 15687677, (float) 2, (float) 1L, (float) (-240));
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color16, (int) 'a');
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color21 = color16.lerp(color19, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str23 = color22.toString();
        com.badlogic.gdx.graphics.Color color24 = color19.sub(color22);
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color30 = color25.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color25);
        int int32 = com.badlogic.gdx.graphics.Color.argb8888(color25);
        com.badlogic.gdx.graphics.Color color34 = color25.mul((float) (-262646));
        com.badlogic.gdx.graphics.Color color35 = color22.sub(color34);
        com.badlogic.gdx.graphics.Color color36 = color10.set(color22);
        float float37 = color36.toFloatBits();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ffffff00" + "'", str8, "ffffff00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65520 + "'", int9 == 65520);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00ff0000" + "'", str23, "00ff0000");
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 16777215 + "'", int32 == 16777215);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
// flaky:         org.junit.Assert.assertTrue("'" + float37 + "' != '" + 9.1477E-41f + "'", float37 == 9.1477E-41f);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setwindowX((int) 'a');
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 41903542;
        int int18 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int19 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-603914496);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(65024);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-1562574848));
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("0000ee00");
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((-1.6894161E38f), 1.5612034E-37f, (-7.508787E-9f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-1241350299));
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 123030;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 587162524, (-1.0700091E38f), (float) 16580354);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1728) + "'", int3 == (-1728));
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        boolean boolean14 = lwjgl3ApplicationConfiguration13.windowResizable;
        lwjgl3ApplicationConfiguration13.setwindowY((-2147483392));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.samples = (short) 1;
        lwjgl3ApplicationConfiguration10.stencil = (short) -1;
        int int15 = lwjgl3ApplicationConfiguration10.getwindowX();
        lwjgl3ApplicationConfiguration10.disableAudio = false;
        lwjgl3ApplicationConfiguration10.title = "hi!";
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        int int11 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setWindowPosition((-16777215), 652800);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setwindowWidth(31334400);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int22 = lwjgl3ApplicationConfiguration21.getaudioDeviceBufferSize();
        boolean boolean23 = lwjgl3ApplicationConfiguration21.windowResizable;
        int int24 = lwjgl3ApplicationConfiguration21.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration21.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        lwjgl3ApplicationConfiguration27.setaudioDeviceSimultaneousSources((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType30 = lwjgl3ApplicationConfiguration27.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffffffff", fileType30);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1308557313), 255);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
        org.junit.Assert.assertTrue("'" + fileType30 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType30.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.windowY = 43268;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(61450, 167247232, (-469852380));
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.samples = 65295;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-1291845633));
        lwjgl3ApplicationConfiguration0.b = 31;
        boolean boolean24 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-4.2867603E37f), 9.18893E-39f, (float) 1794115036, (float) (-10));
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = color10.mul((-1.0f), (float) 1677696502, (float) 65024, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color16 = color4.sub(color15);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color16, (-16777200));
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-14540110), (float) (-2147222656), 7.5156E-41f, (float) (-579592));
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration14.windowX = 100;
        int int19 = lwjgl3ApplicationConfiguration14.g;
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration14.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffffff00", fileType20);
        int int22 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean23 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int24 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color32 = color27.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color33 = color26.sub(color32);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color26, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color37 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color39 = color37.mul((float) (-14513374));
        com.badlogic.gdx.graphics.Color color40 = color36.set(color37);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color36, 0);
        com.badlogic.gdx.graphics.Color color47 = color36.sub((-1.7005551E38f), (float) 1044480, 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(color36);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color48;
        int int50 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 512 + "'", int50 == 512);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        int int14 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.setTitle("0000ff00");
        lwjgl3ApplicationConfiguration0.windowWidth = 65535;
        int int19 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.93333334f, (float) 587162524, 9.1477E-41f, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color6 = color4.set((-2105704448));
        int int7 = com.badlogic.gdx.graphics.Color.rgba8888(color6);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2105704448) + "'", int7 == (-2105704448));
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-603664549));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(65024, 16776961, 0, (-524536), (-257551), (-512), (-10158080));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-33488131));
        int int10 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.windowWidth = 5147940;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(13119);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(3);
        color3.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color6 = color3.clamp();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color3, (-1902614));
        com.badlogic.gdx.graphics.Color color13 = color3.set((float) (byte) 1, (float) '4', (float) 6529016, (float) (-16734721));
        com.badlogic.gdx.graphics.Color color14 = color13.cpy();
        com.badlogic.gdx.graphics.Color color15 = color1.set(color14);
        color1.g = (-14911125);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.gles30ContextMajorVersion;
        int int11 = lwjgl3ApplicationConfiguration9.getaudioDeviceBufferCount();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1677696502 + "'", int10 == 1677696502);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode3;
        lwjgl3ApplicationConfiguration0.setwindowWidth((-150936577));
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str1 = color0.toString();
        com.badlogic.gdx.graphics.Color color3 = color0.set((-62986));
        com.badlogic.gdx.graphics.Color color4 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str5 = color4.toString();
        com.badlogic.gdx.graphics.Color color7 = color4.set((-62986));
        com.badlogic.gdx.graphics.Color color8 = color3.sub(color7);
        float float9 = color3.g;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00ff0000" + "'", str1, "00ff0000");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ffff09f6" + "'", str5, "ffff09f6");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-40036), 122400, 3, (int) (byte) -1, 652800, 52, 1610620896);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 587162524;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode11;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        int int12 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.windowHeight = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        boolean boolean21 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(65024);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        int int8 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode(56864, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode10;
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        lwjgl3ApplicationConfiguration10.samples = (-1);
        int int16 = lwjgl3ApplicationConfiguration10.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) 1677696502);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-56));
        java.lang.Class<?> wildcardClass2 = color1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-13513103), 196080, 63488, (-59160));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6880791E38f) + "'", float4 == (-1.6880791E38f));
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setAudioConfig(512, (-14540110), (int) (byte) 1);
        int int13 = lwjgl3ApplicationConfiguration8.windowWidth;
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration8.getClass();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.windowX = (-65568);
        int int7 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int8 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 524288, (-62986));
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-1241350299));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setdepth(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration12.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration12.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration12.gles30ContextMajorVersion = 10;
        int int27 = lwjgl3ApplicationConfiguration12.getwindowY();
        lwjgl3ApplicationConfiguration12.initialVisible = false;
        lwjgl3ApplicationConfiguration12.windowY = (-50135050);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode32 = lwjgl3ApplicationConfiguration12.fullscreenMode;
        lwjgl3ApplicationConfiguration12.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color40 = color35.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        color35.g = 151015132;
        com.badlogic.gdx.graphics.Color color47 = color35.sub((float) 10L, (float) 480, (float) (-1611265692), (float) (-8672));
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(color35);
        lwjgl3ApplicationConfiguration12.initialBackgroundColor = color35;
        int int50 = com.badlogic.gdx.graphics.Color.argb8888(color35);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color35;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode32);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-16711681) + "'", int50 == (-16711681));
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-33488131));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration10.disableAudio = true;
        int int15 = lwjgl3ApplicationConfiguration10.windowY;
        int int16 = lwjgl3ApplicationConfiguration10.audioDeviceBufferCount;
        int int17 = lwjgl3ApplicationConfiguration10.a;
        boolean boolean18 = lwjgl3ApplicationConfiguration10.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration10.hdpiMode = hdpiMode19;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        int int22 = lwjgl3ApplicationConfiguration0.getsamples();
        int int23 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-248));
        lwjgl3ApplicationConfiguration0.setsamples(65367);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean10 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setwindowHeight(1610620896);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 246, 1.7014117E38f, (float) (-2350080), (float) (-334888960));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7013869E38f) + "'", float4 == (-1.7013869E38f));
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setsamples((-255));
        int int18 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean19 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 167247232;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        boolean boolean14 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        int int3 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-3056));
        lwjgl3ApplicationConfiguration0.setwindowHeight((-119406593));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-335), (float) 16777215, (float) 196604);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-124) + "'", int3 == (-124));
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(251658239, 151015132, 852308735, 99);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-1));
        boolean boolean18 = lwjgl3ApplicationConfiguration0.initialVisible;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration19.setpreferencesFileType(fileType20);
        lwjgl3ApplicationConfiguration19.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration19.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration19.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = lwjgl3ApplicationConfiguration19.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode29;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int32 = lwjgl3ApplicationConfiguration31.getsamples();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((-1.700529E38f), (float) (-16844545), (float) (-16777216), (float) (-603664549));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.windowY = (-1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color17 = color11.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color18 = color9.mul(color17);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color9, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color21 = color9.cpy();
        com.badlogic.gdx.graphics.Color color22 = color7.set(color9);
        float float23 = color7.r;
        int int24 = com.badlogic.gdx.graphics.Color.argb8888(color7);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(3570, (-2076210), 65293, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-7.3709775E37f) + "'", float4 == (-7.3709775E37f));
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-13500161), (-15237120), (-1109610), (-16189440));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4849409) + "'", int4 == (-4849409));
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(9.18893E-39f, (float) 130560, (float) 10, (float) (-1800));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, 520091936);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int11 = lwjgl3ApplicationConfiguration0.g;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setwindowY((-67611904));
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color18.g = (short) 1;
        com.badlogic.gdx.graphics.Color color22 = color10.lerp(color18, (float) 25500);
        com.badlogic.gdx.graphics.Color color27 = color10.mul(0.0f, (float) (-8142), (float) (-1562574848), (-1.0f));
        color10.g = '#';
        color10.a = 16768546;
        int int32 = com.badlogic.gdx.graphics.Color.rgb565(color10);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 70560 + "'", int32 == 70560);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-85425);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener9);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.b;
        lwjgl3ApplicationConfiguration10.setdisableAudio(false);
        lwjgl3ApplicationConfiguration10.setAudioConfig(20188, (-255), (-1088));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20188 + "'", int9 == 20188);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType4 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType4);
        lwjgl3ApplicationConfiguration0.setTitle("4169e1ff");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration10.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("", fileType16);
        com.badlogic.gdx.Files.FileType fileType18 = lwjgl3ApplicationConfiguration10.preferencesFileType;
        int int19 = lwjgl3ApplicationConfiguration10.samples;
        int int20 = lwjgl3ApplicationConfiguration10.windowHeight;
        lwjgl3ApplicationConfiguration10.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color25 = lwjgl3ApplicationConfiguration10.initialBackgroundColor;
        int int26 = com.badlogic.gdx.graphics.Color.argb8888(color25);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color25;
        int int28 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNull(fileType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 480 + "'", int20 == 480);
        org.junit.Assert.assertNotNull(color25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-16777216) + "'", int26 == (-16777216));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        lwjgl3ApplicationConfiguration0.setwindowWidth(20160);
        int int14 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType15 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration11.setPreferencesConfig("hi!", fileType15);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType15;
        lwjgl3ApplicationConfiguration0.setdepth(480);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = lwjgl3ApplicationConfiguration0.windowListener;
        int int23 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str24 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        java.lang.String str25 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNull(lwjgl3WindowListener22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 480 + "'", int23 == 480);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ".prefs/" + "'", str24, ".prefs/");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ".prefs/" + "'", str25, ".prefs/");
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 100, (float) (short) 0, (float) 640);
        com.badlogic.gdx.graphics.Color color9 = color4.add((-8.0750596E37f), (float) 20188, (float) 10L, (float) 31334400);
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) 100L);
        com.badlogic.gdx.graphics.Color color40 = color9.premultiplyAlpha();
        float float41 = color40.g;
        color40.a = 5.8756265E-29f;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration44.setDecorated(false);
        lwjgl3ApplicationConfiguration44.a = (byte) 10;
        boolean boolean49 = lwjgl3ApplicationConfiguration44.initialVisible;
        int int50 = lwjgl3ApplicationConfiguration44.b;
        lwjgl3ApplicationConfiguration44.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color53 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration44.initialBackgroundColor = color53;
        com.badlogic.gdx.graphics.Color color55 = color53.clamp();
        com.badlogic.gdx.graphics.Color color56 = color53.clamp();
        com.badlogic.gdx.graphics.Color color58 = color40.lerp(color56, (-1.700529E38f));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color56, (-2336));
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "00ff0000" + "'", str33, "00ff0000");
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.0f + "'", float41 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 8 + "'", int50 == 8);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color58);
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setAudioConfig(65522, 1500, 1651519680);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 33489151, (float) (-790528), (float) (-67611904), (float) (-2113928961));
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((-652800));
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color7, 650250);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color7, (-2336));
        com.badlogic.gdx.graphics.Color color12 = color4.add(color7);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(0, 268493567, 63519, (-10887648));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-117440768) + "'", int4 == (-117440768));
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ff660000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration13.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration13.windowX = 100;
        int int18 = lwjgl3ApplicationConfiguration13.stencil;
        int int19 = lwjgl3ApplicationConfiguration13.windowY;
        lwjgl3ApplicationConfiguration13.a = 43268;
        int int22 = lwjgl3ApplicationConfiguration13.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration13.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffff65b6", fileType23);
        boolean boolean25 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int26 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.Files.FileType fileType27 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color((float) 6147990, (float) (byte) -1, (float) (-61455), (float) 15687677);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        int int34 = com.badlogic.gdx.graphics.Color.rgb565(color32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 63488 + "'", int34 == 63488);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int8 = lwjgl3ApplicationConfiguration0.getsamples();
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.setwindowY(11667711);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        color0.g = 1671296512;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color0, (-8672));
        int int12 = com.badlogic.gdx.graphics.Color.rgb565(color0);
        com.badlogic.gdx.graphics.Color color14 = color0.mul((float) 13119);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color20 = color15.sub((float) (byte) 100, (float) (-240), (-1.7012971E38f), (float) (-524869));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16777215 + "'", int7 == 16777215);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 56864 + "'", int12 == 56864);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-11604982), 64783, 122400, 196604);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7009715E38f) + "'", float4 == (-1.7009715E38f));
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int14 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setWindowPosition(1878880718, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean19 = lwjgl3ApplicationConfiguration18.windowDecorated;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(50200831, (-128512), (-65025));
        lwjgl3ApplicationConfiguration0.setWindowedMode(14, (-10026973));
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(4.5183064E-38f, (float) (-402678048), (float) (-1034), (-1.7013859E38f));
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-396800));
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        int int10 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color15, 43268);
        float float18 = color15.g;
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.12698413f + "'", float18 == 0.12698413f);
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) 64783);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16519665 + "'", int1 == 16519665);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType11 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration16.setgles30ContextMinorVersion(65025);
        lwjgl3ApplicationConfiguration16.initialVisible = true;
        int int21 = lwjgl3ApplicationConfiguration16.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration23.setFullscreenMode(displayMode24);
        com.badlogic.gdx.Files.FileType fileType26 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration23.setpreferencesFileType(fileType26);
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("ff660000", fileType26);
        int int29 = lwjgl3ApplicationConfiguration16.samples;
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration16.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration8.windowX = 100;
        int int13 = lwjgl3ApplicationConfiguration8.g;
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration8.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("4169e1ff", fileType14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration16.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration16.windowX = 100;
        int int21 = lwjgl3ApplicationConfiguration16.g;
        int int22 = lwjgl3ApplicationConfiguration16.getwindowY();
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration16.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType23;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "01000000";
        int int27 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType4 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1800));
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int8 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setwindowHeight(16707600);
        int int13 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color9, 8897069);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color17 = color12.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        int int20 = com.badlogic.gdx.graphics.Color.argb8888(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color19);
        com.badlogic.gdx.graphics.Color color23 = color9.lerp(color19, (float) 1044480);
        float float24 = color19.r;
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str26 = color25.toString();
        color25.g = 16;
        int int29 = com.badlogic.gdx.graphics.Color.rgb888(color25);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color25);
        float float31 = color25.g;
        com.badlogic.gdx.graphics.Color color33 = color19.lerp(color25, (-1.6954926E38f));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16777215 + "'", int20 == 16777215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-256) + "'", int21 == (-256));
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00ff0000" + "'", str26, "00ff0000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1044480 + "'", int29 == 1044480);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 16.0f + "'", float31 == 16.0f);
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color7, (int) 'a');
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color12 = color7.lerp(color10, (float) (short) 0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color12;
        int int14 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color22 = color16.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str24 = color23.toString();
        com.badlogic.gdx.graphics.Color color26 = color16.lerp(color23, (-8.0750596E37f));
        int int27 = com.badlogic.gdx.graphics.Color.rgb888(color26);
        int int28 = com.badlogic.gdx.graphics.Color.rgba8888(color26);
        float float29 = color26.toFloatBits();
        float float30 = color26.r;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration0.setwindowX(7);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-96), 57856);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0ff00000" + "'", str24, "0ff00000");
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16711935 + "'", int27 == 16711935);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-16711936) + "'", int28 == (-16711936));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 2.3418409E-38f + "'", float29 == 2.3418409E-38f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowX = 512;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.stencil = (-1306385665);
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = lwjgl3ApplicationConfiguration0.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        int int20 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 640 + "'", int20 == 640);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 'a';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration12.b = 100;
        int int15 = lwjgl3ApplicationConfiguration12.windowHeight;
        boolean boolean16 = lwjgl3ApplicationConfiguration12.useGL30;
        int int17 = lwjgl3ApplicationConfiguration12.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.stencil = (-1);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-2015879168));
        lwjgl3ApplicationConfiguration0.setsamples(2016);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-2228448));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-568254208) + "'", int1 == (-568254208));
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-45390), (-234885152), (-524869), 52);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7009626E38f) + "'", float4 == (-1.7009626E38f));
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-6.014632E37f), (float) '4', 2.3509886E-38f, (-7.501805E37f));
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-529006382));
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((-4.2865007E37f), (float) 369623040, (float) (-61455), (float) 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.BLACK;
        float float7 = color6.r;
        com.badlogic.gdx.graphics.Color color12 = color6.set((float) 0L, (float) 1671296512, (float) 255, (-5.387877E37f));
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color6;
        com.badlogic.gdx.graphics.Color color14 = color6.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration15.setsamples((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration15.setWindowListener(lwjgl3WindowListener20);
        boolean boolean22 = lwjgl3ApplicationConfiguration15.vSyncEnabled;
        boolean boolean23 = color14.equals((java.lang.Object) lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(color6);
// flaky:         org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.b;
        lwjgl3ApplicationConfiguration10.setDecorated(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20188 + "'", int9 == 20188);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-270598144), (float) (-8064), 0.0f, (-1.6880938E38f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1619001344) + "'", int4 == (-1619001344));
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setAudioConfig(512, (-14540110), (int) (byte) 1);
        int int13 = lwjgl3ApplicationConfiguration8.b;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-1291891232), (float) 49939200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setwindowHeight(0);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-16189440);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str4 = lwjgl3ApplicationConfiguration3.title;
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color5, 16);
        lwjgl3ApplicationConfiguration3.setInitialBackgroundColor(color5);
        com.badlogic.gdx.graphics.Color color13 = color5.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = color15.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str23 = color22.toString();
        com.badlogic.gdx.graphics.Color color25 = color15.lerp(color22, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color26, 16);
        com.badlogic.gdx.graphics.Color color29 = color25.sub(color26);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color26, 1677696502);
        com.badlogic.gdx.graphics.Color color32 = color5.sub(color26);
        com.badlogic.gdx.graphics.Color color33 = color1.mul(color26);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color26);
        float float35 = color26.r;
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(color26);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16776960 + "'", int2 == 16776960);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00ff0000" + "'", str23, "00ff0000");
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 1677721600, 3.57E-43f, (float) 62976, (float) (-1291845633));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4096) + "'", int4 == (-4096));
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SCARLET;
        color0.b = '#';
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) 1L);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(1.67129651E9f, (float) (-14540110), (float) 2, (-1.5659187E38f));
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color16 = color11.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color24 = color19.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color32 = color26.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str34 = color33.toString();
        com.badlogic.gdx.graphics.Color color36 = color26.lerp(color33, (-8.0750596E37f));
        boolean boolean37 = color19.equals((java.lang.Object) color26);
        com.badlogic.gdx.graphics.Color color38 = color18.add(color19);
        com.badlogic.gdx.graphics.Color color44 = color19.lerp(0.19607843f, (float) 167247232, (float) 16777215, (float) 587162524, 0.0f);
        float float45 = color19.toFloatBits();
        com.badlogic.gdx.graphics.Color color46 = color10.set(color19);
        com.badlogic.gdx.graphics.Color color48 = color5.lerp(color10, (float) 570949632);
        com.badlogic.gdx.graphics.Color color54 = color5.lerp(2.3509528E-38f, (float) 570949632, (float) (-12775665), 1.0f, (float) 1470693630);
        float float55 = color5.a;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "00ff0000" + "'", str34, "00ff0000");
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 9.1477E-41f + "'", float45 == 9.1477E-41f);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 1.0f + "'", float55 == 1.0f);
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition(61450, (-1562574848));
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode15;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-1879860224);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.FOREST;
        int int1 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int3 = lwjgl3ApplicationConfiguration2.getaudioDeviceBufferSize();
        boolean boolean4 = lwjgl3ApplicationConfiguration2.windowResizable;
        lwjgl3ApplicationConfiguration2.depth = (short) 10;
        lwjgl3ApplicationConfiguration2.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color19 = color10.mul(color18);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration2.initialBackgroundColor = color10;
        com.badlogic.gdx.graphics.Color color23 = color0.set(color10);
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.TAN;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color24, (int) 'a');
        int int27 = color24.toIntBits();
        com.badlogic.gdx.graphics.Color color28 = color0.add(color24);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color29, 570425395);
        com.badlogic.gdx.graphics.Color color36 = color29.sub((float) (-3145729), 0.0f, (float) 63519, (float) 160);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1442840320 + "'", int1 == 1442840320);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6356992 + "'", int27 == 6356992);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color36);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1929387520), (float) 16646400, (float) (-1607680), (float) (-1958400));
        int int5 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 65280 + "'", int5 == 65280);
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setAudioConfig(256, 0, 570949632);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-4106), (int) 'a');
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(167247232);
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) 31334400, (float) 3845, (float) (-62986), (float) (-16741598), (float) (-379904));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color7, (-8142));
        com.badlogic.gdx.graphics.Color color11 = color7.set((-52786));
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        boolean boolean13 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-524869));
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.g = (short) 0;
        lwjgl3ApplicationConfiguration0.windowX = 35;
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.title;
        int int13 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        boolean boolean9 = lwjgl3ApplicationConfiguration7.vSyncEnabled;
        boolean boolean10 = lwjgl3ApplicationConfiguration7.getwindowDecorated();
        int int11 = lwjgl3ApplicationConfiguration7.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType14);
        lwjgl3ApplicationConfiguration13.useVsync(false);
        lwjgl3ApplicationConfiguration13.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration13.a = (-62986);
        lwjgl3ApplicationConfiguration13.setdisableAudio(true);
        boolean boolean25 = lwjgl3ApplicationConfiguration13.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration26.setpreferencesFileType(fileType27);
        lwjgl3ApplicationConfiguration26.disableAudio = true;
        lwjgl3ApplicationConfiguration26.setsamples((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration34.setpreferencesFileType(fileType35);
        lwjgl3ApplicationConfiguration34.useVsync(false);
        lwjgl3ApplicationConfiguration34.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration34.a = (-62986);
        lwjgl3ApplicationConfiguration34.setdisableAudio(true);
        boolean boolean46 = lwjgl3ApplicationConfiguration34.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode49 = null;
        lwjgl3ApplicationConfiguration48.setFullscreenMode(displayMode49);
        lwjgl3ApplicationConfiguration48.windowX = 100;
        int int53 = lwjgl3ApplicationConfiguration48.g;
        com.badlogic.gdx.Files.FileType fileType54 = lwjgl3ApplicationConfiguration48.getpreferencesFileType();
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("ffffff00", fileType54);
        lwjgl3ApplicationConfiguration26.setPreferencesConfig("ffff72ff", fileType54);
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType54);
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("ffffffb6", fileType54);
        lwjgl3ApplicationConfiguration7.setResizable(false);
        boolean boolean61 = lwjgl3ApplicationConfiguration7.getdisableAudio();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 8 + "'", int53 == 8);
        org.junit.Assert.assertTrue("'" + fileType54 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType54.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration8.windowX = 100;
        int int13 = lwjgl3ApplicationConfiguration8.g;
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration8.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("4169e1ff", fileType14);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        int int22 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType11 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        int int18 = lwjgl3ApplicationConfiguration17.windowX;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color10 = color5.mul((-1.0f), (float) 1677696502, (float) 65024, (float) (short) 1);
        java.lang.Class<?> wildcardClass11 = color5.getClass();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-804062), (-10420224), (-2076210), (-1984));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6996239E38f) + "'", float4 == (-1.6996239E38f));
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType10 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType10);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType10;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 0;
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.title;
        boolean boolean16 = lwjgl3ApplicationConfiguration0.useGL30;
        int int17 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int18 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 480 + "'", int17 == 480);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 640 + "'", int18 == 640);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) 100L, (float) (-459000), (-1.6954926E38f), (float) 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1661466122) + "'", int4 == (-1661466122));
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-3145729), (float) (-1), 0.0f, (float) (-2496512));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1792) + "'", int4 == (-1792));
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.windowY = 0;
        lwjgl3ApplicationConfiguration0.setTitle("4169e1ff");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode16 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(369623040);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNull(lwjgl3DisplayMode16);
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration12.setwindowDecorated(false);
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration12.getpreferencesFileType();
        lwjgl3ApplicationConfiguration12.setgles30ContextMajorVersion((-3145729));
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNull(fileType15);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-13513103), (float) 16718848, (-1.7013583E38f), (float) (-16711923));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-65536) + "'", int4 == (-65536));
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-15144960), (float) (-58368));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14883840) + "'", int2 == (-14883840));
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration5.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration5.samples = (-1);
        lwjgl3ApplicationConfiguration5.useGL30 = true;
        lwjgl3ApplicationConfiguration5.setpreferencesDirectory("ffff72ff");
        int int14 = lwjgl3ApplicationConfiguration5.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration5.windowY = 20188;
        int int17 = lwjgl3ApplicationConfiguration5.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = lwjgl3ApplicationConfiguration5.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode18;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setwindowWidth((-8320));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(453010332, (-119406593), (-34881504), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-67108964) + "'", int4 == (-67108964));
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 167247232;
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setAudioConfig(8897069, (-240), (-33488131));
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowHeight(650250);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color19);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) 70560, 0.9032258f, (float) (-16741598), (float) 970962282);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        float float6 = color0.toFloatBits();
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color0, 1677696502);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color16 = color11.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color17 = color10.sub(color16);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color10, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color24 = color10.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        int int25 = com.badlogic.gdx.graphics.Color.rgba8888(color10);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color35 = color29.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color36 = color27.mul(color35);
        int int37 = com.badlogic.gdx.graphics.Color.argb8888(color36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str39 = lwjgl3ApplicationConfiguration38.title;
        com.badlogic.gdx.graphics.Color color40 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color40, 16);
        lwjgl3ApplicationConfiguration38.setInitialBackgroundColor(color40);
        int int44 = lwjgl3ApplicationConfiguration38.g;
        boolean boolean45 = color36.equals((java.lang.Object) lwjgl3ApplicationConfiguration38);
        com.badlogic.gdx.graphics.Color color46 = color10.add(color36);
        com.badlogic.gdx.graphics.Color color47 = color0.set(color36);
        int int48 = com.badlogic.gdx.graphics.Color.argb8888(color36);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 9.1477E-41f + "'", float6 == 9.1477E-41f);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 16711935 + "'", int25 == 16711935);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 16711935 + "'", int37 == 16711935);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 8 + "'", int44 == 8);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 16711935 + "'", int48 == 16711935);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TAN;
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.VIOLET;
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) (byte) 100, (float) 8, (float) 10, (float) 9, (float) (-1611265692));
        int int8 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color10 = color0.sub(color1);
        com.badlogic.gdx.graphics.Color color15 = color1.sub((-1.4523669E17f), (float) 3, (-5.68232E37f), (float) (-187392));
        color15.g = (-1.5084639E38f);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 765 + "'", int1 == 765);
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float2 = color1.a;
        com.badlogic.gdx.graphics.Color color7 = color1.mul((float) 8, (float) 1677696502, (float) 0L, (float) 43268);
        int int8 = com.badlogic.gdx.graphics.Color.rgba4444(color1);
        com.badlogic.gdx.graphics.Color color9 = color1.cpy();
        float float10 = color9.g;
        color9.g = (-918031);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65295 + "'", int8 == 65295);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (byte) 1;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-1610612736);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowY = 20188;
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int14 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setwindowHeight((-1291891232));
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration3.windowListener = lwjgl3WindowListener4;
        boolean boolean6 = lwjgl3ApplicationConfiguration3.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = lwjgl3ApplicationConfiguration3.fullscreenMode;
        lwjgl3ApplicationConfiguration3.useVsync(true);
        int int11 = lwjgl3ApplicationConfiguration3.gles30ContextMajorVersion;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(lwjgl3DisplayMode8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(0.93333334f, (float) (-52786), (float) (-148496), 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 4.6550913E-6f + "'", float4 == 4.6550913E-6f);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (-587202461));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-2228448), (float) 65535, (float) (-41231), (-1.7005811E38f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6956224E38f) + "'", float4 == (-1.6956224E38f));
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 167247232;
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setAudioConfig(8897069, (-240), (-33488131));
        lwjgl3ApplicationConfiguration0.setResizable(true);
        int int26 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-240) + "'", int26 == (-240));
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 167247232;
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setAudioConfig(8897069, (-240), (-33488131));
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color19);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        int int2 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        int int3 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-535426560), (-4.731522E-22f), (-1.6614816E38f), (float) (-2076210));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-529433536) + "'", int4 == (-529433536));
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 167247232;
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color24 = color19.mul((float) 1, (float) (-240), 2.3418409E-38f, (float) 100);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color27 = color25.set(1105199359);
        float float28 = color27.toFloatBits();
        color27.g = (-2147483392);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-4.2826394E37f) + "'", float28 == (-4.2826394E37f));
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int8 = lwjgl3ApplicationConfiguration0.r;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str11 = lwjgl3ApplicationConfiguration10.title;
        lwjgl3ApplicationConfiguration10.a = (-1);
        boolean boolean14 = lwjgl3ApplicationConfiguration10.vSyncEnabled;
        lwjgl3ApplicationConfiguration10.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration10.useVsync(true);
        lwjgl3ApplicationConfiguration10.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        lwjgl3ApplicationConfiguration10.audioDeviceBufferCount = 167247232;
        com.badlogic.gdx.graphics.Color color29 = lwjgl3ApplicationConfiguration10.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        int int31 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16 + "'", int31 == 16);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int7 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration11.useGL30 = true;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        lwjgl3ApplicationConfiguration0.setdepth(0);
        lwjgl3ApplicationConfiguration0.setwindowX(640);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.windowHeight = 65295;
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(196604);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(16744272);
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str1 = color0.toString();
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color7 = color2.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color2);
        int int9 = com.badlogic.gdx.graphics.Color.argb8888(color2);
        com.badlogic.gdx.graphics.Color color15 = color2.lerp((float) (-1611265692), (float) 524288, (float) 6356992, (-1.7013883E38f), 0.30588236f);
        com.badlogic.gdx.graphics.Color color20 = color15.set((float) (-2), (float) (-16719105), (-1.24151398E9f), 2.5243549E-29f);
        com.badlogic.gdx.graphics.Color color21 = color0.sub(color20);
        com.badlogic.gdx.graphics.Color color26 = color20.sub(2.87E-42f, 6.162976E-33f, (-1.7013869E38f), (float) (-1980237824));
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ffff0000" + "'", str1, "ffff0000");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16777215 + "'", int9 == 16777215);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color26);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-240);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (int) 'a');
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color6 = color3.clamp();
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((-201326593));
        com.badlogic.gdx.graphics.Color color11 = color6.set(color10);
        int int12 = color6.toIntBits();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-13) + "'", int12 == (-13));
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((-1.6894161E38f), (float) (-67108964), (float) 3855);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 983025 + "'", int3 == 983025);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(49939200);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(3, 8897069);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.a = (-255);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        boolean boolean22 = lwjgl3ApplicationConfiguration0.windowResizable;
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.g = 16;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(fileType23);
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType10 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType10);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType10;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        int int15 = lwjgl3ApplicationConfiguration0.getsamples();
        int int16 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 61455, (-47784960));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-1056), (-187392), (-61455), 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7013047E38f) + "'", float4 == (-1.7013047E38f));
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(3);
        color1.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color4 = color1.clamp();
        com.badlogic.gdx.graphics.Color color9 = color4.sub((float) (-14540110), (float) (short) -1, (float) (-14513374), (float) 2);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color4, 652800);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color4, (-96));
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLACK;
        float float1 = color0.r;
        com.badlogic.gdx.graphics.Color color6 = color0.set((-8.0750596E37f), 0.0f, (float) (-1L), (float) 65024);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color8.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str16 = color15.toString();
        com.badlogic.gdx.graphics.Color color18 = color8.lerp(color15, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color19, 16);
        com.badlogic.gdx.graphics.Color color22 = color18.sub(color19);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color19, 1677696502);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color19, 480);
        com.badlogic.gdx.graphics.Color color27 = color0.add(color19);
        float float28 = color0.toFloatBits();
        int int29 = com.badlogic.gdx.graphics.Color.rgba8888(color0);
        int int30 = com.badlogic.gdx.graphics.Color.rgb565(color0);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00ff0000" + "'", str16, "00ff0000");
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.5822227E38f) + "'", float28 == (-1.5822227E38f));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1175295 + "'", int29 == 1175295);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 156 + "'", int30 == 156);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(13119);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(3);
        color3.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color6 = color3.clamp();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color3, (-1902614));
        com.badlogic.gdx.graphics.Color color13 = color3.set((float) (byte) 1, (float) '4', (float) 6529016, (float) (-16734721));
        com.badlogic.gdx.graphics.Color color14 = color13.cpy();
        com.badlogic.gdx.graphics.Color color15 = color1.set(color14);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color1);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
    }
}
