import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest46 {

    public static boolean debug = false;

    @Test
    public void test23001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23001");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.a = (-1);
        int int4 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(130029600);
        lwjgl3ApplicationConfiguration0.windowMinWidth = 33791;
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int10 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int12 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.stencil = 10;
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration13.initialBackgroundColor = color17;
        lwjgl3ApplicationConfiguration13.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration13.initialBackgroundColor = color21;
        boolean boolean23 = lwjgl3ApplicationConfiguration13.getwindowResizable();
        int int24 = lwjgl3ApplicationConfiguration13.a;
        boolean boolean25 = lwjgl3ApplicationConfiguration13.windowResizable;
        lwjgl3ApplicationConfiguration13.setdepth((-15514229));
        lwjgl3ApplicationConfiguration13.setaudioDeviceBufferCount(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = lwjgl3ApplicationConfiguration13.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode30;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode30 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode30.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23002");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        int int4 = lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test23003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23003");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-134217944);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test23004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23004");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.r = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int9 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.windowX = (-537010321);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertNull(lwjgl3WindowListener5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23005");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setsamples((-1077952513));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.windowY = 1953529918;
        lwjgl3ApplicationConfiguration10.setpreferencesDirectory("00ffffff");
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration10.preferencesFileType;
        com.badlogic.gdx.Files.FileType fileType16 = lwjgl3ApplicationConfiguration10.getpreferencesFileType();
        lwjgl3ApplicationConfiguration10.setdisableAudio(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType16 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType16.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23006");
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
        lwjgl3ApplicationConfiguration11.setwindowDecorated(true);
        int int18 = lwjgl3ApplicationConfiguration11.getwindowHeight();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 480 + "'", int18 == 480);
    }

    @Test
    public void test23007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23007");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = lwjgl3ApplicationConfiguration1.fullscreenMode;
        int int19 = lwjgl3ApplicationConfiguration1.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration1.windowWidth = 2147483647;
        boolean boolean22 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        lwjgl3ApplicationConfiguration1.windowMinHeight = 1090519033;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration25);
        lwjgl3ApplicationConfiguration26.r = ' ';
        boolean boolean29 = lwjgl3ApplicationConfiguration26.getuseGL30();
        lwjgl3ApplicationConfiguration26.useGL30 = false;
        lwjgl3ApplicationConfiguration26.windowMaxHeight = (-256);
        com.badlogic.gdx.graphics.Color color34 = lwjgl3ApplicationConfiguration26.initialBackgroundColor;
        int int35 = color34.toIntBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration36.stencil = 10;
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration36.initialBackgroundColor = color40;
        com.badlogic.gdx.graphics.Color color46 = color40.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color50 = color40.lerp(color48, (float) 100L);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration51);
        lwjgl3ApplicationConfiguration52.setvSyncEnabled(false);
        boolean boolean55 = lwjgl3ApplicationConfiguration52.getuseGL30();
        com.badlogic.gdx.graphics.Color color57 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color59 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color59, 16);
        color59.a = 0L;
        com.badlogic.gdx.graphics.Color color64 = color57.mul(color59);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration65.stencil = 10;
        com.badlogic.gdx.graphics.Color color69 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration65.initialBackgroundColor = color69;
        int int71 = com.badlogic.gdx.graphics.Color.rgb888(color69);
        boolean boolean73 = color69.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration74.stencil = 10;
        com.badlogic.gdx.graphics.Color color78 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration74.initialBackgroundColor = color78;
        com.badlogic.gdx.graphics.Color color84 = color78.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color85 = color69.mul(color84);
        com.badlogic.gdx.graphics.Color color86 = new com.badlogic.gdx.graphics.Color(color84);
        com.badlogic.gdx.graphics.Color color87 = color59.set(color86);
        lwjgl3ApplicationConfiguration52.setInitialBackgroundColor(color87);
        com.badlogic.gdx.graphics.Color color89 = color50.sub(color87);
        com.badlogic.gdx.graphics.Color color90 = color34.mul(color89);
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color34;
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        lwjgl3ApplicationConfiguration1.a = 60160;
        int int96 = lwjgl3ApplicationConfiguration1.b;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertNull(lwjgl3DisplayMode18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(color34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-288559616) + "'", int35 == (-288559616));
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(color84);
        org.junit.Assert.assertNotNull(color85);
        org.junit.Assert.assertNotNull(color87);
        org.junit.Assert.assertNotNull(color89);
        org.junit.Assert.assertNotNull(color90);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 8 + "'", int96 == 8);
    }

    @Test
    public void test23008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23008");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setdepth(16);
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int14 = lwjgl3ApplicationConfiguration13.windowY;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test23009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23009");
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
        lwjgl3ApplicationConfiguration9.windowWidth = 13260;
        lwjgl3ApplicationConfiguration9.gles30ContextMinorVersion = (-1430550);
        lwjgl3ApplicationConfiguration9.windowMaxWidth = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNull(lwjgl3WindowListener17);
    }

    @Test
    public void test23010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23010");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 16);
        float float4 = color1.g;
        int int5 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33791 + "'", int5 == 33791);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "000083ff" + "'", str8, "000083ff");
    }

    @Test
    public void test23011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23011");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = color1.clamp();
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color1);
        float float4 = color3.r;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, (int) 'a');
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test23012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23012");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = ' ';
        lwjgl3ApplicationConfiguration0.windowMinHeight = 40664886;
        lwjgl3ApplicationConfiguration0.setwindowX(537535241);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 0;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.windowX = (-101592576);
        int int24 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(2083471872, 30426, (-469762048), 0, 589993, 8965222, (-15728400));
        int int33 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-101592576) + "'", int24 == (-101592576));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8965222 + "'", int33 == 8965222);
    }

    @Test
    public void test23013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23013");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration2.getwindowY();
        int int4 = lwjgl3ApplicationConfiguration2.audioDeviceBufferCount;
        java.lang.String str5 = lwjgl3ApplicationConfiguration2.preferencesDirectory;
        lwjgl3ApplicationConfiguration2.setvSyncEnabled(false);
        boolean boolean8 = lwjgl3ApplicationConfiguration2.useGL30;
        lwjgl3ApplicationConfiguration2.setwindowDecorated(false);
        int int11 = lwjgl3ApplicationConfiguration2.g;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".prefs/" + "'", str5, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test23014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23014");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setTitle("");
        lwjgl3ApplicationConfiguration1.setAudioConfig((-10223606), (int) (byte) 0, (-16711936));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int12 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        boolean boolean13 = lwjgl3ApplicationConfiguration1.windowDecorated;
        lwjgl3ApplicationConfiguration1.setwindowWidth(63518);
        int int16 = lwjgl3ApplicationConfiguration1.a;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10223606) + "'", int12 == (-10223606));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test23015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23015");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 16711680;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(3309388);
        lwjgl3ApplicationConfiguration0.stencil = (-844509056);
        lwjgl3ApplicationConfiguration0.b = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test23016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23016");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        boolean boolean11 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test23017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23017");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        int int16 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.windowMinWidth = 64274;
        int int19 = lwjgl3ApplicationConfiguration0.depth;
        int int20 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int21 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int22 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-4089);
        int int25 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 480 + "'", int16 == 480);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test23018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23018");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 131090400;
        lwjgl3ApplicationConfiguration0.stencil = (-1536);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        lwjgl3ApplicationConfiguration11.setwindowX((int) (short) 0);
        lwjgl3ApplicationConfiguration11.setsamples((int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.stencil = 10;
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration19.initialBackgroundColor = color23;
        int int25 = com.badlogic.gdx.graphics.Color.rgb888(color23);
        boolean boolean27 = color23.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration28.stencil = 10;
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration28.initialBackgroundColor = color32;
        com.badlogic.gdx.graphics.Color color38 = color32.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color39 = color23.mul(color38);
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color38);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color40);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int43 = lwjgl3ApplicationConfiguration42.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration42);
        boolean boolean45 = color41.equals((java.lang.Object) lwjgl3ApplicationConfiguration42);
        com.badlogic.gdx.Graphics.DisplayMode displayMode46 = null;
        lwjgl3ApplicationConfiguration42.setFullscreenMode(displayMode46);
        com.badlogic.gdx.Files.FileType fileType48 = lwjgl3ApplicationConfiguration42.getpreferencesFileType();
        lwjgl3ApplicationConfiguration11.setPreferencesConfig("00ffff00", fileType48);
        com.badlogic.gdx.Files.FileType fileType50 = lwjgl3ApplicationConfiguration11.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ef000000", fileType50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 512 + "'", int43 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + fileType48 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType48.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType50 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType50.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23019");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-38559824));
    }

    @Test
    public void test23020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23020");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-4247562), (float) 2072058111, 1.46999735E20f, (float) (-56448));
    }

    @Test
    public void test23021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23021");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setwindowWidth((-116));
        int int12 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-8388608);
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-1050240);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-41943040));
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test23022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23022");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.depth = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration14.disableAudio = false;
        lwjgl3ApplicationConfiguration14.setdepth((-65281));
        int int19 = lwjgl3ApplicationConfiguration14.samples;
        int int20 = lwjgl3ApplicationConfiguration14.windowMaxWidth;
        lwjgl3ApplicationConfiguration14.a = 585070592;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test23023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23023");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = 765;
        int int10 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        int int14 = lwjgl3ApplicationConfiguration11.depth;
        java.lang.String str15 = lwjgl3ApplicationConfiguration11.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration16.initialBackgroundColor = color20;
        com.badlogic.gdx.graphics.Color color26 = color20.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color20, (int) (byte) 1);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color20;
        boolean boolean30 = lwjgl3ApplicationConfiguration11.windowDecorated;
        lwjgl3ApplicationConfiguration11.setAudioConfig((int) (short) 10, 765, 0);
        lwjgl3ApplicationConfiguration11.setpreferencesDirectory("");
        boolean boolean37 = lwjgl3ApplicationConfiguration11.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.stencil = 10;
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration38.initialBackgroundColor = color42;
        lwjgl3ApplicationConfiguration38.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color46 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration38.initialBackgroundColor = color46;
        boolean boolean48 = lwjgl3ApplicationConfiguration38.getwindowResizable();
        lwjgl3ApplicationConfiguration38.windowMinWidth = 509920;
        boolean boolean51 = lwjgl3ApplicationConfiguration38.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration53.stencil = 10;
        int int56 = lwjgl3ApplicationConfiguration53.depth;
        int int57 = lwjgl3ApplicationConfiguration53.stencil;
        int int58 = lwjgl3ApplicationConfiguration53.getwindowY();
        lwjgl3ApplicationConfiguration53.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration53.setwindowMinWidth(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration63.stencil = 10;
        int int66 = lwjgl3ApplicationConfiguration63.b;
        boolean boolean67 = lwjgl3ApplicationConfiguration63.vSyncEnabled;
        lwjgl3ApplicationConfiguration63.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType70 = lwjgl3ApplicationConfiguration63.getpreferencesFileType();
        lwjgl3ApplicationConfiguration53.preferencesFileType = fileType70;
        lwjgl3ApplicationConfiguration38.setPreferencesConfig("hi!", fileType70);
        lwjgl3ApplicationConfiguration11.setpreferencesFileType(fileType70);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType70;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int77 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 16 + "'", int56 == 16);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 8 + "'", int66 == 8);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + fileType70 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType70.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 9 + "'", int77 == 9);
    }

    @Test
    public void test23024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23024");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setwindowWidth(16111);
        int int15 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int16 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16111 + "'", int15 == 16111);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test23025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23025");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int41 = lwjgl3ApplicationConfiguration40.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
    }

    @Test
    public void test23026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23026");
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
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setdepth((-2968436));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        java.lang.String str16 = lwjgl3ApplicationConfiguration0.title;
        int int17 = lwjgl3ApplicationConfiguration0.windowX;
        int int18 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 480 + "'", int18 == 480);
    }

    @Test
    public void test23027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23027");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 3309388, (float) 862994742, (float) (-10223606), 1.0f);
        com.badlogic.gdx.graphics.Color color9 = color4.add((float) (-1248), (float) 2113863936, (-5.7740937E37f), 0.0f);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test23028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23028");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration1.setHdpiMode(hdpiMode4);
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion(234);
        lwjgl3ApplicationConfiguration1.b = 52897;
        int int10 = lwjgl3ApplicationConfiguration1.b;
        lwjgl3ApplicationConfiguration1.samples = 3565410;
        int int13 = lwjgl3ApplicationConfiguration1.windowWidth;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52897 + "'", int10 == 52897);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
    }

    @Test
    public void test23029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23029");
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
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
    }

    @Test
    public void test23030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23030");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        boolean boolean3 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-10));
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test23031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23031");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.setdepth(16777216);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    }

    @Test
    public void test23032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23032");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        float float6 = color5.b;
        com.badlogic.gdx.graphics.Color color11 = color5.add((float) 1465382614, 0.0f, (-1.7010254E38f), (float) (-2140996640));
        int int12 = com.badlogic.gdx.graphics.Color.rgba4444(color5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        lwjgl3ApplicationConfiguration14.r = ' ';
        lwjgl3ApplicationConfiguration14.windowResizable = false;
        boolean boolean19 = color5.equals((java.lang.Object) lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 65280 + "'", int12 == 65280);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23033");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((-6.068505E37f), (float) 5782259, (-1.7010254E38f), (-5.0593836E30f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1418444800) + "'", int4 == (-1418444800));
    }

    @Test
    public void test23034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23034");
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
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(1);
        int int27 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setdepth(1671172080);
        int int30 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-271), (-2070550656));
        boolean boolean36 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-16761866);
        int int39 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 4434960;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 765 + "'", int27 == 765);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
    }

    @Test
    public void test23035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23035");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color();
        int int2 = color1.toIntBits();
        int int3 = com.badlogic.gdx.graphics.Color.rgba4444(color1);
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color1, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.graphics.Color color7 = color1.sub(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color9 = color6.clamp();
        com.badlogic.gdx.graphics.Color color15 = color9.lerp(0.0f, (float) (-768), 0.64705884f, (float) (-973078528), (float) (-427005));
        int int16 = com.badlogic.gdx.graphics.Color.rgba4444(color15);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 65295 + "'", int16 == 65295);
    }

    @Test
    public void test23036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23036");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.r = 65280;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        java.lang.String str17 = lwjgl3ApplicationConfiguration16.title;
        boolean boolean18 = lwjgl3ApplicationConfiguration16.useGL30;
        boolean boolean19 = lwjgl3ApplicationConfiguration16.getwindowDecorated();
        lwjgl3ApplicationConfiguration16.preferencesDirectory = "003060ff";
        int int22 = lwjgl3ApplicationConfiguration16.audioDeviceBufferCount;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration16.windowListener = lwjgl3WindowListener23;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
    }

    @Test
    public void test23037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23037");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-35651584), (float) (-160), (float) (-1686966016), (float) (-75202560));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-548864) + "'", int4 == (-548864));
    }

    @Test
    public void test23038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23038");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color6 = color1.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color7 = color6.clamp();
        int int8 = com.badlogic.gdx.graphics.Color.rgb888(color7);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color13, 16);
        color13.a = 0L;
        com.badlogic.gdx.graphics.Color color18 = color11.mul(color13);
        com.badlogic.gdx.graphics.Color color23 = color11.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color23, 33791);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color23);
        com.badlogic.gdx.graphics.Color color27 = color9.sub(color26);
        com.badlogic.gdx.graphics.Color color28 = color27.clamp();
        float float29 = color27.a;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color27, (-10223606));
        com.badlogic.gdx.graphics.Color color32 = color7.sub(color27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.stencil = 10;
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration33.initialBackgroundColor = color37;
        com.badlogic.gdx.graphics.Color color43 = color37.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color47 = color37.lerp(color45, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color47, (-545421065));
        int int50 = color47.toIntBits();
        com.badlogic.gdx.graphics.Color color51 = color27.sub(color47);
        com.badlogic.gdx.graphics.Color color52 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(color52);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration54);
        lwjgl3ApplicationConfiguration55.setvSyncEnabled(false);
        boolean boolean58 = lwjgl3ApplicationConfiguration55.getuseGL30();
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color62 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color62, 16);
        color62.a = 0L;
        com.badlogic.gdx.graphics.Color color67 = color60.mul(color62);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration68.stencil = 10;
        com.badlogic.gdx.graphics.Color color72 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration68.initialBackgroundColor = color72;
        int int74 = com.badlogic.gdx.graphics.Color.rgb888(color72);
        boolean boolean76 = color72.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration77 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration77.stencil = 10;
        com.badlogic.gdx.graphics.Color color81 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration77.initialBackgroundColor = color81;
        com.badlogic.gdx.graphics.Color color87 = color81.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color88 = color72.mul(color87);
        com.badlogic.gdx.graphics.Color color89 = new com.badlogic.gdx.graphics.Color(color87);
        com.badlogic.gdx.graphics.Color color90 = color62.set(color89);
        lwjgl3ApplicationConfiguration55.setInitialBackgroundColor(color90);
        com.badlogic.gdx.graphics.Color color92 = color53.add(color90);
        com.badlogic.gdx.graphics.Color color93 = color27.mul(color90);
        com.badlogic.gdx.graphics.Color color94 = color93.cpy();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65535 + "'", int8 == 65535);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
// flaky:         org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-142049825) + "'", int50 == (-142049825));
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(color87);
        org.junit.Assert.assertNotNull(color88);
        org.junit.Assert.assertNotNull(color90);
        org.junit.Assert.assertNotNull(color92);
        org.junit.Assert.assertNotNull(color93);
        org.junit.Assert.assertNotNull(color94);
    }

    @Test
    public void test23039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23039");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 117901062, 0.0f, (float) (-3968));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-128) + "'", int3 == (-128));
    }

    @Test
    public void test23040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23040");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 3, (-1.7014117E38f), (float) 3, (float) '#');
        com.badlogic.gdx.graphics.Color color9 = color4.set(0.0f, (float) (-9728477), (float) 509920, (float) (-2146830848));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color9, (-2014279680));
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test23041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23041");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (byte) 0, (-8.952473E30f), (float) (-10224128), (float) 6349110);
        int int5 = color4.toIntBits();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, (-535758336));
        com.badlogic.gdx.graphics.Color color13 = color4.lerp((-1.0407874E38f), (float) 2, (float) (-128), (float) (-67650272), (float) (-805306623));
        color4.g = (-12560);
        com.badlogic.gdx.graphics.Color color20 = color4.add((float) (-456998145), (float) (-97920), (float) (-2014279680), 9.1477E-41f);
        com.badlogic.gdx.graphics.Color color25 = color20.add((float) (-65024), 0.0f, (float) 65530, (float) 184483840);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-16777216) + "'", int5 == (-16777216));
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color25);
    }

    @Test
    public void test23042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23042");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        int int5 = lwjgl3ApplicationConfiguration1.windowMinWidth;
        int int6 = lwjgl3ApplicationConfiguration1.getgles30ContextMinorVersion();
        int int7 = lwjgl3ApplicationConfiguration1.windowMaxHeight;
        lwjgl3ApplicationConfiguration1.setsamples((-2320));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test23043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23043");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(64274);
        java.lang.String str2 = color1.toString();
        com.badlogic.gdx.graphics.Color color3 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color5 = color3.mul((float) (-587202560));
        int int6 = com.badlogic.gdx.graphics.Color.rgba8888(color5);
        color5.r = 0.0f;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000fb12" + "'", str2, "0000fb12");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test23044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23044");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int2 = lwjgl3ApplicationConfiguration1.audioDeviceBufferSize;
        int int3 = lwjgl3ApplicationConfiguration1.windowMinHeight;
        com.badlogic.gdx.Files.FileType fileType4 = lwjgl3ApplicationConfiguration1.getpreferencesFileType();
        boolean boolean5 = color0.equals((java.lang.Object) fileType4);
        int int6 = com.badlogic.gdx.graphics.Color.rgb565(color0);
        int int7 = com.badlogic.gdx.graphics.Color.rgba4444(color0);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(1071676419);
        color9.r = (-4084);
        com.badlogic.gdx.graphics.Color color12 = color9.cpy();
        boolean boolean13 = color0.equals((java.lang.Object) color9);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 512 + "'", int2 == 512);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20160 + "'", int6 == 20160);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 38415 + "'", int7 == 38415);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23045");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-59904), (float) (-67146624), (float) (-3584), (float) (-1664909312));
    }

    @Test
    public void test23046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23046");
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
        int int18 = lwjgl3ApplicationConfiguration1.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration1.windowResizable = true;
        int int21 = lwjgl3ApplicationConfiguration1.a;
        lwjgl3ApplicationConfiguration1.setpreferencesDirectory("830000ff");
        int int24 = lwjgl3ApplicationConfiguration1.g;
        lwjgl3ApplicationConfiguration1.b = (-276908320);
        int int27 = lwjgl3ApplicationConfiguration1.b;
        lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion = 0;
        int int30 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-276908320) + "'", int27 == (-276908320));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16 + "'", int30 == 16);
    }

    @Test
    public void test23047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23047");
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
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 61440;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-537010321);
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.setAudioConfig(256, (-1286733314), 45056);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test23048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23048");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = lwjgl3ApplicationConfiguration1.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = null;
        lwjgl3ApplicationConfiguration1.fullscreenMode = lwjgl3DisplayMode11;
        lwjgl3ApplicationConfiguration1.setTitle("00ffff00");
        boolean boolean15 = lwjgl3ApplicationConfiguration1.disableAudio;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(lwjgl3WindowListener10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23049");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 16);
        float float4 = color1.g;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color1, 512);
        int int7 = com.badlogic.gdx.graphics.Color.rgb565(color1);
        com.badlogic.gdx.graphics.Color color8 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color1, (-622910848));
        com.badlogic.gdx.graphics.Color color12 = color1.mul((float) 777825);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test23050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23050");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        int int5 = lwjgl3ApplicationConfiguration1.samples;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SALMON;
        float float7 = color6.r;
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color6;
        lwjgl3ApplicationConfiguration1.a = 509920;
        lwjgl3ApplicationConfiguration1.setAudioConfig(267782144, 537535241, (-164075620));
        lwjgl3ApplicationConfiguration1.windowMinHeight = 12517631;
        lwjgl3ApplicationConfiguration1.disableAudio = true;
        lwjgl3ApplicationConfiguration1.setDecorated(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
// flaky:         org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test23051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23051");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 52625, (float) 8420355, (float) 117436161, (float) (-14483712));
        int int5 = com.badlogic.gdx.graphics.Color.rgba4444(color4);
        java.lang.String str6 = color4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 65520 + "'", int5 == 65520);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ffffff00" + "'", str6, "ffffff00");
    }

    @Test
    public void test23052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23052");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = lwjgl3ApplicationConfiguration1.hdpiMode;
        int int7 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        int int9 = lwjgl3ApplicationConfiguration1.windowY;
        int int10 = lwjgl3ApplicationConfiguration1.r;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test23053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23053");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GREEN;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-14483712), 0.0f, 0.0f, (float) (-2146830848));
        float float6 = color0.a;
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((float) (-654724064), (float) 16711935, (float) 43371, (float) 100);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color14 = color13.clamp();
        float float15 = color13.r;
        com.badlogic.gdx.graphics.Color color16 = color13.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color17 = color16.clamp();
        com.badlogic.gdx.graphics.Color color18 = color11.set(color17);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(224);
        float float21 = color20.r;
        com.badlogic.gdx.graphics.Color color23 = color20.set((-1077936368));
        int int24 = com.badlogic.gdx.graphics.Color.rgba8888(color23);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color23, (-764808));
        com.badlogic.gdx.graphics.Color color28 = color17.lerp(color23, (-0.36354828f));
        float float29 = color28.b;
        com.badlogic.gdx.graphics.Color color30 = color0.sub(color28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration31.stencil = 10;
        lwjgl3ApplicationConfiguration31.setwindowX((int) (short) 0);
        int int36 = lwjgl3ApplicationConfiguration31.getaudioDeviceBufferSize();
        int int37 = lwjgl3ApplicationConfiguration31.windowHeight;
        lwjgl3ApplicationConfiguration31.disableAudio = false;
        lwjgl3ApplicationConfiguration31.windowMinWidth = (-12);
        lwjgl3ApplicationConfiguration31.setaudioDeviceBufferCount(2113863936);
        lwjgl3ApplicationConfiguration31.windowMaxWidth = (-100466688);
        int int46 = lwjgl3ApplicationConfiguration31.gles30ContextMinorVersion;
        int int47 = lwjgl3ApplicationConfiguration31.getwindowX();
        boolean boolean48 = color0.equals((java.lang.Object) int47);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1077936368) + "'", int24 == (-1077936368));
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 512 + "'", int36 == 512);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 480 + "'", int37 == 480);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test23054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23054");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        int int12 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.stencil = 10;
        lwjgl3ApplicationConfiguration13.setwindowX((int) (short) 0);
        int int18 = lwjgl3ApplicationConfiguration13.getaudioDeviceBufferSize();
        int int19 = lwjgl3ApplicationConfiguration13.b;
        boolean boolean20 = lwjgl3ApplicationConfiguration13.getwindowResizable();
        lwjgl3ApplicationConfiguration13.audioDeviceSimultaneousSources = (short) -1;
        com.badlogic.gdx.graphics.Color color23 = lwjgl3ApplicationConfiguration13.initialBackgroundColor;
        float float24 = color23.b;
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color29, 16);
        color29.a = 0L;
        com.badlogic.gdx.graphics.Color color34 = color27.mul(color29);
        com.badlogic.gdx.graphics.Color color39 = color27.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color39, 33791);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color39);
        com.badlogic.gdx.graphics.Color color43 = color25.sub(color42);
        com.badlogic.gdx.graphics.Color color44 = color43.clamp();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color43, 63488);
        int int47 = com.badlogic.gdx.graphics.Color.rgba4444(color43);
        com.badlogic.gdx.graphics.Color color49 = color23.lerp(color43, (float) (-16580607));
        com.badlogic.gdx.graphics.Color color50 = color49.cpy();
        com.badlogic.gdx.graphics.Color color52 = color49.set(10);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color52;
        lwjgl3ApplicationConfiguration0.windowY = 13770;
        boolean boolean56 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 224 + "'", int47 == 224);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test23055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23055");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-40953856), 150929588, (-14680320));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test23056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23056");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.r = (-10);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setwindowHeight((-15727136));
        int int11 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.depth = (-10508032);
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23057");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        float float2 = color1.b;
        int int3 = com.badlogic.gdx.graphics.Color.rgb565(color1);
        com.badlogic.gdx.graphics.Color color8 = color1.mul((float) (-983040), (float) (-80712576), (float) 1090519033, (-9.238233E37f));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, (-30218));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test23058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23058");
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
        lwjgl3ApplicationConfiguration0.r = 33791;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode16 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode17 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode17;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertNull(lwjgl3DisplayMode16);
    }

    @Test
    public void test23059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23059");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        lwjgl3ApplicationConfiguration1.audioDeviceBufferSize = 163200;
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        lwjgl3ApplicationConfiguration1.windowX = 537535241;
        boolean boolean16 = lwjgl3ApplicationConfiguration1.getwindowDecorated();
        int int17 = lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test23060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23060");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.graphics.Color color12 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int13 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
    }

    @Test
    public void test23061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23061");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-458762), 1897903, (-1), (int) (short) 100, 514080, (-654724064), (-256));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration16.setwindowResizable(false);
        boolean boolean27 = lwjgl3ApplicationConfiguration16.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = lwjgl3ApplicationConfiguration16.windowListener;
        int int29 = lwjgl3ApplicationConfiguration16.samples;
        lwjgl3ApplicationConfiguration16.audioDeviceBufferCount = (-8943616);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration32.stencil = 10;
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration32.initialBackgroundColor = color36;
        lwjgl3ApplicationConfiguration32.setaudioDeviceSimultaneousSources(0);
        boolean boolean40 = lwjgl3ApplicationConfiguration32.getvSyncEnabled();
        lwjgl3ApplicationConfiguration32.setwindowDecorated(false);
        boolean boolean43 = lwjgl3ApplicationConfiguration32.vSyncEnabled;
        lwjgl3ApplicationConfiguration32.r = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration46.stencil = 10;
        int int49 = lwjgl3ApplicationConfiguration46.depth;
        int int50 = lwjgl3ApplicationConfiguration46.stencil;
        lwjgl3ApplicationConfiguration46.depth = 100;
        int int53 = lwjgl3ApplicationConfiguration46.windowMaxWidth;
        int int54 = lwjgl3ApplicationConfiguration46.getwindowMinWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration55.stencil = 10;
        int int58 = lwjgl3ApplicationConfiguration55.b;
        boolean boolean59 = lwjgl3ApplicationConfiguration55.vSyncEnabled;
        lwjgl3ApplicationConfiguration55.setResizable(true);
        lwjgl3ApplicationConfiguration55.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode64 = lwjgl3ApplicationConfiguration55.hdpiMode;
        lwjgl3ApplicationConfiguration46.hdpiMode = hdpiMode64;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration66.stencil = 10;
        com.badlogic.gdx.graphics.Color color70 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration66.initialBackgroundColor = color70;
        lwjgl3ApplicationConfiguration66.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color74 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration66.initialBackgroundColor = color74;
        boolean boolean76 = lwjgl3ApplicationConfiguration66.getwindowResizable();
        int int77 = lwjgl3ApplicationConfiguration66.a;
        boolean boolean78 = lwjgl3ApplicationConfiguration66.windowResizable;
        lwjgl3ApplicationConfiguration66.setdepth((-15514229));
        lwjgl3ApplicationConfiguration66.setaudioDeviceBufferCount(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode83 = lwjgl3ApplicationConfiguration66.hdpiMode;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration32.hdpiMode = hdpiMode83;
        lwjgl3ApplicationConfiguration16.hdpiMode = hdpiMode83;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode83;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(lwjgl3WindowListener28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 16 + "'", int49 == 16);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 8 + "'", int58 == 8);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode64 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode64.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(color74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 8 + "'", int77 == 8);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode83 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode83.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23062");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.windowY = (byte) 1;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int8 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test23063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23063");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        lwjgl3ApplicationConfiguration0.setwindowX(1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.samples = 1621098495;
        lwjgl3ApplicationConfiguration10.g = 16;
        int int15 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration10.b = (-256);
        lwjgl3ApplicationConfiguration10.windowDecorated = false;
        lwjgl3ApplicationConfiguration10.disableAudio(false);
        int int22 = lwjgl3ApplicationConfiguration10.getwindowHeight();
        int int23 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration10.useOpenGL3(true, (-1686966016), (-13081600));
        int int28 = lwjgl3ApplicationConfiguration10.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 480 + "'", int22 == 480);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16 + "'", int28 == 16);
    }

    @Test
    public void test23064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23064");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.depth = (byte) 100;
        lwjgl3ApplicationConfiguration1.windowHeight = 512;
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion((-2147418368));
        int int16 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = (-5898496);
        lwjgl3ApplicationConfiguration1.title = "00ff9cff";
        int int21 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferSize();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
    }

    @Test
    public void test23065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23065");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setTitle("ff00ffff");
        int int13 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test23066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23066");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha(3.860876E-34f, (float) (-1057024512));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test23067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23067");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-131072), (float) 43520, (float) (-512), (float) (-2140897536));
    }

    @Test
    public void test23068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23068");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1248), (float) (-1433600), 0.0f, (-1.2880023E32f));
    }

    @Test
    public void test23069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23069");
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
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(4080, (-15514229), (-458762));
        int int23 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-364790240), (-97785123), (-1664909312));
        lwjgl3ApplicationConfiguration0.windowWidth = (-4194304);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test23070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23070");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode7 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        boolean boolean10 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration11.windowDecorated = true;
        lwjgl3ApplicationConfiguration11.preferencesDirectory = "00830000";
        int int16 = lwjgl3ApplicationConfiguration11.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(lwjgl3DisplayMode7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test23071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23071");
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
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int17 = lwjgl3ApplicationConfiguration16.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration16.setWindowedMode(1519722240, 65456);
        lwjgl3ApplicationConfiguration16.preferencesDirectory = "ffffe1ff";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test23072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23072");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowWidth = 2;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.depth = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.stencil = 10;
        int int21 = lwjgl3ApplicationConfiguration18.depth;
        int int22 = lwjgl3ApplicationConfiguration18.stencil;
        int int23 = lwjgl3ApplicationConfiguration18.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = null;
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration18.hdpiMode = hdpiMode26;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration28.stencil = 10;
        int int31 = lwjgl3ApplicationConfiguration28.b;
        boolean boolean32 = lwjgl3ApplicationConfiguration28.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType33 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration28.setpreferencesFileType(fileType33);
        int int35 = lwjgl3ApplicationConfiguration28.depth;
        lwjgl3ApplicationConfiguration28.windowMaxHeight = (short) 10;
        int int38 = lwjgl3ApplicationConfiguration28.getwindowX();
        int int39 = lwjgl3ApplicationConfiguration28.gles30ContextMajorVersion;
        int int40 = lwjgl3ApplicationConfiguration28.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration41);
        lwjgl3ApplicationConfiguration42.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration42.setsamples((int) (byte) 10);
        int int48 = lwjgl3ApplicationConfiguration42.getaudioDeviceBufferCount();
        int int49 = lwjgl3ApplicationConfiguration42.getwindowY();
        lwjgl3ApplicationConfiguration42.setaudioDeviceBufferSize(1);
        lwjgl3ApplicationConfiguration42.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration54.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration54.setwindowResizable(false);
        lwjgl3ApplicationConfiguration54.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration54.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration54.setuseGL30(false);
        lwjgl3ApplicationConfiguration54.b = 512;
        com.badlogic.gdx.graphics.Color color73 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color74 = new com.badlogic.gdx.graphics.Color();
        int int75 = color74.toIntBits();
        int int76 = com.badlogic.gdx.graphics.Color.rgba4444(color74);
        com.badlogic.gdx.graphics.Color color78 = color73.lerp(color74, 0.0f);
        color78.r = 40664886;
        lwjgl3ApplicationConfiguration54.initialBackgroundColor = color78;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration82 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration83 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration82);
        lwjgl3ApplicationConfiguration83.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode86 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration83.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration42.hdpiMode = hdpiMode86;
        lwjgl3ApplicationConfiguration28.hdpiMode = hdpiMode86;
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode86;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3WindowListener12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + fileType33 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType33.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 16 + "'", int35 == 16);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 640 + "'", int40 == 640);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(color73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(color78);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration83);
        org.junit.Assert.assertTrue("'" + hdpiMode86 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode86.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23073");
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
        int int32 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setTitle("003060ff");
        lwjgl3ApplicationConfiguration0.windowMinWidth = 132184352;
        boolean boolean37 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int38 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType29 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType29.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 640 + "'", int32 == 640);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
    }

    @Test
    public void test23074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23074");
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
        lwjgl3ApplicationConfiguration0.a = 537535241;
        int int37 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener40 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
        org.junit.Assert.assertNull(lwjgl3WindowListener40);
    }

    @Test
    public void test23075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23075");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setsamples((-255));
        com.badlogic.gdx.graphics.Color color8 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test23076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23076");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int6 = lwjgl3ApplicationConfiguration5.windowY;
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration5.initialBackgroundColor;
        int int8 = lwjgl3ApplicationConfiguration5.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration5.gles30ContextMinorVersion = (-243732465);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test23077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23077");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode14 = null;
        lwjgl3ApplicationConfiguration12.fullscreenMode = lwjgl3DisplayMode14;
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration12.setFullscreenMode(displayMode16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test23078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23078");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferCount((-2105736960));
        int int11 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        int int12 = lwjgl3ApplicationConfiguration1.depth;
        lwjgl3ApplicationConfiguration1.vSyncEnabled = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test23079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23079");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (byte) 1, (int) (short) 0, 16711680, (-10224128), (int) (byte) 100, 33791);
        lwjgl3ApplicationConfiguration0.windowWidth = 1621098495;
        java.lang.String str16 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setwindowHeight(0);
        int int19 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.windowX = 258203702;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33791 + "'", int19 == 33791);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
    }

    @Test
    public void test23080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23080");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (byte) 10;
        lwjgl3ApplicationConfiguration0.setTitle("0083ff00");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        int int19 = lwjgl3ApplicationConfiguration16.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration16.hdpiMode = hdpiMode20;
        lwjgl3ApplicationConfiguration16.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = null;
        lwjgl3ApplicationConfiguration16.hdpiMode = hdpiMode24;
        boolean boolean26 = lwjgl3ApplicationConfiguration16.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode27 = null;
        lwjgl3ApplicationConfiguration16.fullscreenMode = lwjgl3DisplayMode27;
        lwjgl3ApplicationConfiguration16.setWindowPosition((int) (byte) 0, 130029600);
        com.badlogic.gdx.Files.FileType fileType33 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("d2b48cff", fileType33);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType33;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-40953856);
        lwjgl3ApplicationConfiguration0.title = "ffffc040";
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + fileType33 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType33.equals(com.badlogic.gdx.Files.FileType.Internal));
    }

    @Test
    public void test23081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23081");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1245052928), (float) 2032, (float) 16777087, (float) (-255));
        color4.r = (-237019999);
        color4.a = (-1248);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(2147483647);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color15;
        com.badlogic.gdx.graphics.Color color21 = color15.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color25 = color15.lerp(color23, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color25, (-545421065));
        int int28 = color25.toIntBits();
        com.badlogic.gdx.graphics.Color color29 = color25.clamp();
        com.badlogic.gdx.graphics.Color color30 = color10.mul(color29);
        color30.b = 61680;
        com.badlogic.gdx.graphics.Color color33 = color4.add(color30);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-142049825) + "'", int28 == (-142049825));
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test23082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23082");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.useGL30;
        int int7 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-16033380), 51855, (-2147481728), 16439278);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-644874240);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        int int19 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean20 = lwjgl3ApplicationConfiguration0.useGL30;
        int int21 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.a = (-1953046272);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test23083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23083");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 16);
        float float4 = color1.g;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color1, 512);
        int int7 = com.badlogic.gdx.graphics.Color.rgb565(color1);
        com.badlogic.gdx.graphics.Color color8 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color1, (-622910848));
        color1.b = 537535241;
        color1.b = 0.0f;
        color1.b = (-16033380);
        float float17 = color1.g;
        float float18 = color1.toFloatBits();
        java.lang.String str19 = color1.toString();
        int int20 = com.badlogic.gdx.graphics.Color.rgba4444(color1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.13333334f + "'", float17 == 0.13333334f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.251E-41f + "'", float18 == 1.251E-41f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "df220000" + "'", str19, "df220000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 447009280 + "'", int20 == 447009280);
    }

    @Test
    public void test23084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23084");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = lwjgl3ApplicationConfiguration1.hdpiMode;
        int int7 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
        lwjgl3ApplicationConfiguration1.windowHeight = 3;
        int int10 = lwjgl3ApplicationConfiguration1.getwindowX();
        lwjgl3ApplicationConfiguration1.stencil = 0;
        lwjgl3ApplicationConfiguration1.useVsync(false);
        lwjgl3ApplicationConfiguration1.g = (-2147451392);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test23085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23085");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.windowHeight = (-10188800);
        boolean boolean15 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-548854);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23086");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration7.windowMaxWidth = (-152);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test23087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23087");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.getwindowY();
        lwjgl3ApplicationConfiguration1.useOpenGL3(true, 640, 1465382614);
        lwjgl3ApplicationConfiguration1.windowY = 640;
        lwjgl3ApplicationConfiguration1.setTitle("ff000000");
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration1.getpreferencesFileType();
        lwjgl3ApplicationConfiguration1.setAudioConfig((-15488), (-243793680), (-123797760));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23088");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.stencil = 786400;
        int int10 = lwjgl3ApplicationConfiguration0.a;
        int int11 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test23089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23089");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType5;
        int int7 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int8 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = (-129957920);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test23090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23090");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 16);
        color3.a = 0L;
        com.badlogic.gdx.graphics.Color color8 = color1.mul(color3);
        com.badlogic.gdx.graphics.Color color13 = color1.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        color1.g = (short) -1;
        com.badlogic.gdx.graphics.Color color16 = color1.clamp();
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color20, 16);
        color20.a = 0L;
        com.badlogic.gdx.graphics.Color color25 = color18.mul(color20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.stencil = 10;
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration26.initialBackgroundColor = color30;
        int int32 = com.badlogic.gdx.graphics.Color.rgb888(color30);
        boolean boolean34 = color30.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration35.stencil = 10;
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration35.initialBackgroundColor = color39;
        com.badlogic.gdx.graphics.Color color45 = color39.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color46 = color30.mul(color45);
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color(color45);
        com.badlogic.gdx.graphics.Color color48 = color20.set(color47);
        float float49 = color48.b;
        com.badlogic.gdx.graphics.Color color50 = com.badlogic.gdx.graphics.Color.FOREST;
        com.badlogic.gdx.graphics.Color color51 = color48.set(color50);
        com.badlogic.gdx.graphics.Color color52 = color16.mul(color51);
        float float53 = color51.a;
        color51.g = 0.0f;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 1.0f + "'", float49 == 1.0f);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 1.0f + "'", float53 == 1.0f);
    }

    @Test
    public void test23091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23091");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.r = (-537010321);
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-1463708416));
        int int16 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test23092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23092");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 16111, (float) 589478435, (float) (-24225), (float) (-560496655));
    }

    @Test
    public void test23093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23093");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        int int8 = lwjgl3ApplicationConfiguration0.getdepth();
        int int9 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(3309388);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-1077952513);
        lwjgl3ApplicationConfiguration0.windowMinHeight = 1820329983;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-872349884));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
    }

    @Test
    public void test23094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23094");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode3 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.depth = 765;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int7 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int8 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.setwindowX((-587202560));
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-5898496), 117436161);
        int int15 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setsamples((-132608));
        lwjgl3ApplicationConfiguration0.windowY = (-151060480);
        org.junit.Assert.assertNull(lwjgl3DisplayMode3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5898496) + "'", int15 == (-5898496));
    }

    @Test
    public void test23095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23095");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        float float6 = color4.toFloatBits();
        java.lang.String str7 = color4.toString();
        boolean boolean9 = color4.equals((java.lang.Object) (-1.7014117E38f));
        float float10 = color4.r;
        float float11 = color4.toFloatBits();
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color4, 1174394321);
        java.lang.String str14 = color4.toString();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00000000" + "'", str7, "00000000");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "dd55dd11" + "'", str14, "dd55dd11");
    }

    @Test
    public void test23096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23096");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowHeight = (-16033380);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType6;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-67146624);
        int int10 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test23097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23097");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int11 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-16124145));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23098");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        java.lang.String str7 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test23099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23099");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setAudioConfig(1621098495, (-2144), (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-3), 483965280);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        int int13 = lwjgl3ApplicationConfiguration11.windowWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
    }

    @Test
    public void test23100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23100");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(8);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-8160));
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test23101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23101");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) -1;
        lwjgl3ApplicationConfiguration0.b = (-16711681);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration12.samples = (-32);
        lwjgl3ApplicationConfiguration12.setBackBufferConfig((-16776704), (-858996736), 132184352, (-480), (-5376), 786400, (-535758336));
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration12.setFullscreenMode(displayMode23);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test23102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23102");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 0;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-545421065));
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-16580607) + "'", int14 == (-16580607));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test23103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23103");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.b = (-16776704);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(2113863936, 52625, (-12));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color21;
        lwjgl3ApplicationConfiguration17.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color25;
        lwjgl3ApplicationConfiguration17.g = 16711680;
        int int29 = lwjgl3ApplicationConfiguration17.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration17.windowHeight = (-59475968);
        com.badlogic.gdx.graphics.Color color32 = lwjgl3ApplicationConfiguration17.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.stencil = 10;
        int int37 = lwjgl3ApplicationConfiguration34.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = null;
        lwjgl3ApplicationConfiguration34.hdpiMode = hdpiMode38;
        boolean boolean40 = lwjgl3ApplicationConfiguration34.getvSyncEnabled();
        boolean boolean41 = lwjgl3ApplicationConfiguration34.vSyncEnabled;
        lwjgl3ApplicationConfiguration34.disableAudio = false;
        lwjgl3ApplicationConfiguration34.b = (-1077952513);
        int int46 = lwjgl3ApplicationConfiguration34.windowMaxHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration47);
        lwjgl3ApplicationConfiguration48.setWindowPosition((int) (short) 10, 10);
        boolean boolean52 = lwjgl3ApplicationConfiguration48.useGL30;
        com.badlogic.gdx.Files.FileType fileType53 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration48.setpreferencesFileType(fileType53);
        lwjgl3ApplicationConfiguration48.g = 100;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration57);
        lwjgl3ApplicationConfiguration58.r = ' ';
        boolean boolean61 = lwjgl3ApplicationConfiguration58.getuseGL30();
        lwjgl3ApplicationConfiguration58.useGL30 = false;
        lwjgl3ApplicationConfiguration58.windowMaxHeight = (-256);
        lwjgl3ApplicationConfiguration58.audioDeviceBufferCount = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration68.stencil = 10;
        int int71 = lwjgl3ApplicationConfiguration68.depth;
        boolean boolean72 = lwjgl3ApplicationConfiguration68.vSyncEnabled;
        lwjgl3ApplicationConfiguration68.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode75 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration68.hdpiMode = hdpiMode75;
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration48.hdpiMode = hdpiMode75;
        lwjgl3ApplicationConfiguration34.hdpiMode = hdpiMode75;
        lwjgl3ApplicationConfiguration33.hdpiMode = hdpiMode75;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode75;
        lwjgl3ApplicationConfiguration0.depth = (-360960);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener84 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + fileType53 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType53.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 16 + "'", int71 == 16);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode75 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode75.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNull(lwjgl3WindowListener84);
    }

    @Test
    public void test23104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23104");
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
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        com.badlogic.gdx.graphics.Color color24 = color21.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration25.initialBackgroundColor = color29;
        int int31 = com.badlogic.gdx.graphics.Color.rgb888(color29);
        boolean boolean33 = color29.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.stencil = 10;
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration34.initialBackgroundColor = color38;
        com.badlogic.gdx.graphics.Color color44 = color38.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color45 = color29.mul(color44);
        com.badlogic.gdx.graphics.Color color47 = color44.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color44, 9);
        com.badlogic.gdx.graphics.Color color51 = color44.set((-4089));
        com.badlogic.gdx.graphics.Color color52 = color44.clamp();
        com.badlogic.gdx.graphics.Color color53 = color52.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color54 = new com.badlogic.gdx.graphics.Color(color52);
        com.badlogic.gdx.graphics.Color color56 = color24.lerp(color52, (float) (-255));
        com.badlogic.gdx.graphics.Color color61 = color52.set((float) (-65281), (float) 8420355, (float) 33021, (-1.5950217E38f));
        com.badlogic.gdx.graphics.Color color62 = com.badlogic.gdx.graphics.Color.SCARLET;
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color(color62);
        com.badlogic.gdx.graphics.Color color64 = com.badlogic.gdx.graphics.Color.GOLD;
        color64.r = 'a';
        com.badlogic.gdx.graphics.Color color67 = new com.badlogic.gdx.graphics.Color(color64);
        com.badlogic.gdx.graphics.Color color68 = color67.premultiplyAlpha();
        boolean boolean69 = color63.equals((java.lang.Object) color67);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color63, (-10188800));
        com.badlogic.gdx.graphics.Color color72 = color61.mul(color63);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color72, (-11554560));
        com.badlogic.gdx.graphics.Color color76 = new com.badlogic.gdx.graphics.Color(2147483647);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration77 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration77.stencil = 10;
        com.badlogic.gdx.graphics.Color color81 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration77.initialBackgroundColor = color81;
        com.badlogic.gdx.graphics.Color color87 = color81.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color89 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color91 = color81.lerp(color89, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color91, (-545421065));
        int int94 = color91.toIntBits();
        com.badlogic.gdx.graphics.Color color95 = color91.clamp();
        com.badlogic.gdx.graphics.Color color96 = color76.mul(color95);
        com.badlogic.gdx.graphics.Color color97 = color72.add(color76);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(color72);
        org.junit.Assert.assertNotNull(color87);
        org.junit.Assert.assertNotNull(color91);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-142049825) + "'", int94 == (-142049825));
        org.junit.Assert.assertNotNull(color95);
        org.junit.Assert.assertNotNull(color96);
        org.junit.Assert.assertNotNull(color97);
    }

    @Test
    public void test23105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23105");
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
        com.badlogic.gdx.graphics.Color color41 = color1.clamp();
        int int42 = com.badlogic.gdx.graphics.Color.rgba8888(color41);
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
        com.badlogic.gdx.graphics.Color color62 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color64 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color66 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color66, 16);
        color66.a = 0L;
        com.badlogic.gdx.graphics.Color color71 = color64.mul(color66);
        com.badlogic.gdx.graphics.Color color76 = color64.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color76, 33791);
        com.badlogic.gdx.graphics.Color color79 = new com.badlogic.gdx.graphics.Color(color76);
        com.badlogic.gdx.graphics.Color color80 = color62.sub(color79);
        com.badlogic.gdx.graphics.Color color81 = color60.set(color79);
        com.badlogic.gdx.graphics.Color color86 = color60.mul((float) (short) 0, (float) (-4089), (-1.7013859E38f), 1.96271E-40f);
        int int87 = com.badlogic.gdx.graphics.Color.argb8888(color60);
        boolean boolean88 = color41.equals((java.lang.Object) int87);
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
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color71);
        org.junit.Assert.assertNotNull(color76);
        org.junit.Assert.assertNotNull(color80);
        org.junit.Assert.assertNotNull(color81);
        org.junit.Assert.assertNotNull(color86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test23106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23106");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.depth = 0;
        lwjgl3ApplicationConfiguration0.b = (-59475968);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color13, 16);
        color13.a = 0L;
        com.badlogic.gdx.graphics.Color color18 = color11.mul(color13);
        com.badlogic.gdx.graphics.Color color23 = color11.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color color25 = color11.set((int) (byte) -1);
        com.badlogic.gdx.graphics.Color color26 = color11.clamp();
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color26;
        boolean boolean29 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-250615296);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-589999), 15339505, (-151165028), 8099135);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test23107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23107");
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
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("d2b48cff");
        lwjgl3ApplicationConfiguration0.setwindowX(18);
        int int18 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test23108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23108");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = 862994742;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-142049825);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        boolean boolean18 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-267452160));
        lwjgl3ApplicationConfiguration0.setsamples(2073378560);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test23109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23109");
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
        int int20 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setdepth((-83886495));
        int int23 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test23110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23110");
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
        com.badlogic.gdx.graphics.Color color55 = color50.sub((float) (byte) 0, (float) (-7555886), (float) (-848128), (float) (byte) 100);
        int int56 = com.badlogic.gdx.graphics.Color.argb8888(color50);
        com.badlogic.gdx.graphics.Color color58 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color60, 16);
        color60.a = 0L;
        com.badlogic.gdx.graphics.Color color65 = color58.mul(color60);
        com.badlogic.gdx.graphics.Color color70 = color58.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color color72 = color50.lerp(color58, 0.0f);
        com.badlogic.gdx.graphics.Color color78 = color58.lerp(0.0f, (float) (-1972440832), (-1.5399916E-33f), 0.0f, (float) (-369098752));
        com.badlogic.gdx.graphics.Color color83 = new com.badlogic.gdx.graphics.Color((float) (-1671024128), (float) 97, (float) (-256), 1.7014117E38f);
        com.badlogic.gdx.graphics.Color color88 = color83.sub((float) (byte) -1, (float) 16776961, (-256.0f), 0.98039216f);
        int int89 = com.badlogic.gdx.graphics.Color.rgba4444(color88);
        com.badlogic.gdx.graphics.Color color90 = color78.sub(color88);
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
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 16777215 + "'", int56 == 16777215);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(color70);
        org.junit.Assert.assertNotNull(color72);
        org.junit.Assert.assertNotNull(color78);
        org.junit.Assert.assertNotNull(color88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 61680 + "'", int89 == 61680);
        org.junit.Assert.assertNotNull(color90);
    }

    @Test
    public void test23111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23111");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.getwindowY();
        int int7 = lwjgl3ApplicationConfiguration1.samples;
        int int8 = lwjgl3ApplicationConfiguration1.windowY;
        lwjgl3ApplicationConfiguration1.useVsync(false);
        lwjgl3ApplicationConfiguration1.setwindowWidth((-2147483648));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test23112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23112");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 6114, (float) 17, (float) 251658240, (float) (-1896305408));
    }

    @Test
    public void test23113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23113");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(1352400896);
    }

    @Test
    public void test23114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23114");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        float float11 = color10.b;
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        color13.g = 0.4392157f;
        com.badlogic.gdx.graphics.Color color16 = color13.clamp();
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test23115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23115");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int16 = com.badlogic.gdx.graphics.Color.rgb888(color15);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertNotNull(color15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test23116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23116");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.depth = 100;
        lwjgl3ApplicationConfiguration0.samples = '4';
        lwjgl3ApplicationConfiguration0.setsamples((-2147413088));
        lwjgl3ApplicationConfiguration0.setdepth(230);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test23117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23117");
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
        lwjgl3ApplicationConfiguration0.windowY = (-8160);
        int int18 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType19 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-512));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + fileType19 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType19.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23118");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (byte) 1, (int) (short) 0, 16711680, (-10224128), (int) (byte) 100, 33791);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        int int17 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
    }

    @Test
    public void test23119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23119");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(2072058111);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) (-38250));
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test23120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23120");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int10 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener11;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-859607296);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration15.setwindowDecorated(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
    }

    @Test
    public void test23121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23121");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.setgles30ContextMajorVersion((-503341578));
        int int10 = lwjgl3ApplicationConfiguration1.getwindowX();
        lwjgl3ApplicationConfiguration1.r = 1465382614;
        boolean boolean13 = lwjgl3ApplicationConfiguration1.windowDecorated;
        int int14 = lwjgl3ApplicationConfiguration1.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        int int19 = lwjgl3ApplicationConfiguration16.depth;
        lwjgl3ApplicationConfiguration16.windowX = (short) 100;
        lwjgl3ApplicationConfiguration16.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        int int26 = lwjgl3ApplicationConfiguration25.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration25.useOpenGL3(true, (-100466688), (-62876));
        lwjgl3ApplicationConfiguration25.setpreferencesDirectory("00000000");
        int int33 = lwjgl3ApplicationConfiguration25.g;
        lwjgl3ApplicationConfiguration25.setdepth(401539072);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode36 = lwjgl3ApplicationConfiguration25.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration37.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration37.windowMaxHeight = (-2147413088);
        com.badlogic.gdx.graphics.Color color48 = lwjgl3ApplicationConfiguration37.initialBackgroundColor;
        int int49 = lwjgl3ApplicationConfiguration37.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType50 = lwjgl3ApplicationConfiguration37.getpreferencesFileType();
        lwjgl3ApplicationConfiguration25.preferencesFileType = fileType50;
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("ff00ff00", fileType50);
        int int53 = lwjgl3ApplicationConfiguration1.a;
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((-1020));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertNull(lwjgl3DisplayMode36);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + fileType50 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType50.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 8 + "'", int53 == 8);
    }

    @Test
    public void test23122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23122");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setsamples((-255));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = lwjgl3ApplicationConfiguration0.hdpiMode;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowHeight = 1174394321;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int13 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test23123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23123");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color();
        int int2 = color1.toIntBits();
        int int3 = com.badlogic.gdx.graphics.Color.rgba4444(color1);
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color1, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.graphics.Color color7 = color1.sub(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        int int9 = com.badlogic.gdx.graphics.Color.rgba8888(color7);
        com.badlogic.gdx.graphics.Color color10 = color7.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color15 = color7.add((float) (-1108741), (float) 16773120, (float) 254, (float) 125953);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test23124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23124");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-134243073), (float) 8099135, 3.860876E-34f, (float) (-2));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-510) + "'", int4 == (-510));
    }

    @Test
    public void test23125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23125");
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
        int int29 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.windowY = 61440;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-262383);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test23126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23126");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        int int1 = com.badlogic.gdx.graphics.Color.rgba8888(color0);
        float float2 = color0.b;
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.stencil = 10;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color9;
        lwjgl3ApplicationConfiguration5.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color13;
        boolean boolean15 = lwjgl3ApplicationConfiguration5.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        lwjgl3ApplicationConfiguration17.windowX = (-503341578);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration17);
        boolean boolean21 = lwjgl3ApplicationConfiguration20.windowDecorated;
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((float) (byte) 10, 0.0f, (float) (-10224128), (float) (-16711681));
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color26);
        com.badlogic.gdx.graphics.Color color28 = color3.mul(color26);
        color3.r = (-1610726212);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color3, 133628160);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13369344 + "'", int1 == 13369344);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test23127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23127");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-294912), 2.3418052E-38f, 3.860876E-34f, (float) (-248276940));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-939524096) + "'", int4 == (-939524096));
    }

    @Test
    public void test23128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23128");
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
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-134360));
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("00000062");
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test23129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23129");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.useGL30;
        int int7 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-16033380), 51855, (-2147481728), 16439278);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-644874240);
        int int15 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        int int16 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-16033380) + "'", int15 == (-16033380));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test23130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23130");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float2 = color1.b;
        int int3 = color1.toIntBits();
        com.badlogic.gdx.graphics.Color color4 = color1.premultiplyAlpha();
        int int5 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((float) (-905969664), (float) (-1075773696), (float) (-7462090), (-4.3199905E37f));
        com.badlogic.gdx.graphics.Color color13 = color11.set((-262352));
        com.badlogic.gdx.graphics.Color color14 = color6.set(color11);
        com.badlogic.gdx.graphics.Color color20 = color14.lerp((float) (-2144089088), (float) (-1281818624), (-1.6974555E38f), 0.0f, (float) (-33824884));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test23131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23131");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration15.g = (-66978332);
        lwjgl3ApplicationConfiguration15.title = "0000fb12";
        java.lang.String str20 = lwjgl3ApplicationConfiguration15.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration15.useVsync(false);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ".prefs/" + "'", str20, ".prefs/");
    }

    @Test
    public void test23132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23132");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        lwjgl3ApplicationConfiguration1.windowMaxHeight = 862994742;
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferSize(50331648);
        int int9 = lwjgl3ApplicationConfiguration1.audioDeviceBufferSize;
        int int10 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, (-240), (-2865));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50331648 + "'", int9 == 50331648);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test23133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23133");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-52344);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setWindowPosition(862994742, (-36880));
        lwjgl3ApplicationConfiguration0.setTitle("0000faff");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
    }

    @Test
    public void test23134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23134");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int11 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(48624);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(652800);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int20 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.stencil = 10;
        int int24 = lwjgl3ApplicationConfiguration21.depth;
        int int25 = lwjgl3ApplicationConfiguration21.stencil;
        int int26 = lwjgl3ApplicationConfiguration21.getwindowY();
        lwjgl3ApplicationConfiguration21.windowMaxHeight = 0;
        lwjgl3ApplicationConfiguration21.setsamples(1677721600);
        lwjgl3ApplicationConfiguration21.a = (byte) 100;
        lwjgl3ApplicationConfiguration21.setgles30ContextMinorVersion((-251659777));
        int int35 = lwjgl3ApplicationConfiguration21.audioDeviceBufferCount;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int37 = lwjgl3ApplicationConfiguration36.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = lwjgl3ApplicationConfiguration36.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.stencil = 10;
        int int43 = lwjgl3ApplicationConfiguration40.b;
        boolean boolean44 = lwjgl3ApplicationConfiguration40.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType45 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration40.setpreferencesFileType(fileType45);
        lwjgl3ApplicationConfiguration36.preferencesFileType = fileType45;
        boolean boolean48 = lwjgl3ApplicationConfiguration36.getwindowDecorated();
        int int49 = lwjgl3ApplicationConfiguration36.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration50);
        lwjgl3ApplicationConfiguration51.setWindowPosition((int) (short) 10, 10);
        boolean boolean55 = lwjgl3ApplicationConfiguration51.useGL30;
        com.badlogic.gdx.Files.FileType fileType56 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration51.setpreferencesFileType(fileType56);
        lwjgl3ApplicationConfiguration51.g = 100;
        lwjgl3ApplicationConfiguration51.setWindowSizeLimits((int) (byte) -1, (int) (byte) -1, (int) (byte) 1, 40664886);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration65.stencil = 10;
        int int68 = lwjgl3ApplicationConfiguration65.depth;
        int int69 = lwjgl3ApplicationConfiguration65.stencil;
        int int70 = lwjgl3ApplicationConfiguration65.getwindowY();
        lwjgl3ApplicationConfiguration65.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration65.setwindowMinWidth(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration75 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration75.stencil = 10;
        int int78 = lwjgl3ApplicationConfiguration75.b;
        boolean boolean79 = lwjgl3ApplicationConfiguration75.vSyncEnabled;
        lwjgl3ApplicationConfiguration75.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType82 = lwjgl3ApplicationConfiguration75.getpreferencesFileType();
        lwjgl3ApplicationConfiguration65.preferencesFileType = fileType82;
        lwjgl3ApplicationConfiguration51.setpreferencesFileType(fileType82);
        lwjgl3ApplicationConfiguration51.setaudioDeviceBufferSize((-569376768));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode87 = lwjgl3ApplicationConfiguration51.hdpiMode;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration21.hdpiMode = hdpiMode87;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode87;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration38);
        org.junit.Assert.assertNull(lwjgl3WindowListener39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + fileType45 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType45.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 16 + "'", int49 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + fileType56 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType56.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 16 + "'", int68 == 16);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 8 + "'", int78 == 8);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + fileType82 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType82.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode87 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode87.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23135");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int22 = lwjgl3ApplicationConfiguration21.getsamples();
        lwjgl3ApplicationConfiguration21.setaudioDeviceBufferSize((-12583680));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test23136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23136");
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
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion(1621098495);
        lwjgl3ApplicationConfiguration1.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration1.windowResizable = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.stencil = 10;
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration22.initialBackgroundColor = color26;
        lwjgl3ApplicationConfiguration22.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration22.samples = (short) -1;
        lwjgl3ApplicationConfiguration22.title = ".prefs/";
        int int34 = lwjgl3ApplicationConfiguration22.windowMaxWidth;
        lwjgl3ApplicationConfiguration22.windowX = (-1671024128);
        lwjgl3ApplicationConfiguration22.useVsync(false);
        lwjgl3ApplicationConfiguration22.setsamples(161902304);
        com.badlogic.gdx.Files.FileType fileType41 = lwjgl3ApplicationConfiguration22.getpreferencesFileType();
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType41;
        lwjgl3ApplicationConfiguration1.disableAudio(false);
        lwjgl3ApplicationConfiguration1.windowHeight = 11311516;
        int int47 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + fileType41 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType41.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
    }

    @Test
    public void test23137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23137");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLUE;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        color1.g = (-1.0f);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color10 = color5.sub((-1.7006882E38f), (float) (-59475968), (float) (-52992), (float) (-2147413088));
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color10);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test23138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23138");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(136);
    }

    @Test
    public void test23139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23139");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-123797760), (float) (-1073750272), (float) (-78188544), (float) (-524));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-9.8607613E-32f) + "'", float4 == (-9.8607613E-32f));
    }

    @Test
    public void test23140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23140");
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
        lwjgl3ApplicationConfiguration12.windowX = (-503341578);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        int int16 = lwjgl3ApplicationConfiguration12.getwindowWidth();
        java.lang.String str17 = lwjgl3ApplicationConfiguration12.preferencesDirectory;
        lwjgl3ApplicationConfiguration12.useGL30 = false;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".prefs/" + "'", str17, ".prefs/");
    }

    @Test
    public void test23141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23141");
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
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00000020", fileType32);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration37);
        lwjgl3ApplicationConfiguration38.setWindowPosition((int) (short) 10, 10);
        boolean boolean42 = lwjgl3ApplicationConfiguration38.useGL30;
        com.badlogic.gdx.Files.FileType fileType43 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration38.setpreferencesFileType(fileType43);
        lwjgl3ApplicationConfiguration38.g = 100;
        lwjgl3ApplicationConfiguration38.r = 3;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration49.stencil = 10;
        int int52 = lwjgl3ApplicationConfiguration49.b;
        boolean boolean53 = lwjgl3ApplicationConfiguration49.vSyncEnabled;
        lwjgl3ApplicationConfiguration49.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode56 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration49.hdpiMode = hdpiMode56;
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode56;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-1057024512);
        boolean boolean62 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int63 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + fileType43 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType43.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 8 + "'", int52 == 8);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode56 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode56.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 9 + "'", int63 == 9);
    }

    @Test
    public void test23142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23142");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-64), (float) (short) 10, (float) (-458762), 0.0f);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, 10187505);
    }

    @Test
    public void test23143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23143");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig(372608, (-1202651136), 131090400);
        int int39 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-271), 0, (-157286400), (-36880), (-134243073), (-2146830848), (-608175));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration48.stencil = 10;
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration48.initialBackgroundColor = color52;
        lwjgl3ApplicationConfiguration48.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color56 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration48.initialBackgroundColor = color56;
        lwjgl3ApplicationConfiguration48.g = 16711680;
        int int60 = lwjgl3ApplicationConfiguration48.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration48.audioDeviceBufferSize = 0;
        int int63 = lwjgl3ApplicationConfiguration48.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int65 = lwjgl3ApplicationConfiguration64.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration64);
        lwjgl3ApplicationConfiguration66.windowMaxHeight = (-16580607);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration69 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration69.stencil = 10;
        int int72 = lwjgl3ApplicationConfiguration69.b;
        boolean boolean73 = lwjgl3ApplicationConfiguration69.vSyncEnabled;
        lwjgl3ApplicationConfiguration69.setuseGL30(false);
        int int76 = lwjgl3ApplicationConfiguration69.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode77 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration69.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration66.hdpiMode = hdpiMode77;
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode77);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1202651136) + "'", int39 == (-1202651136));
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 512 + "'", int65 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration66);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 8 + "'", int72 == 8);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode77 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode77.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23144");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(634911, (-295168), (-133890048), (-152));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-3.3190196E35f) + "'", float4 == (-3.3190196E35f));
    }

    @Test
    public void test23145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23145");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowWidth = 2;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.depth = (byte) 0;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 97;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int29 = lwjgl3ApplicationConfiguration20.gles30ContextMajorVersion;
        int int30 = lwjgl3ApplicationConfiguration20.getgles30ContextMajorVersion();
        int int31 = lwjgl3ApplicationConfiguration20.getsamples();
        com.badlogic.gdx.graphics.Color color32 = lwjgl3ApplicationConfiguration20.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        int int34 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3WindowListener12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test23146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23146");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setTitle("");
        lwjgl3ApplicationConfiguration1.setAudioConfig((-10223606), (int) (byte) 0, (-16711936));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration11.setWindowPosition((-7555886), 863980544);
        lwjgl3ApplicationConfiguration11.b = 0;
        lwjgl3ApplicationConfiguration11.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration11.useGL30 = false;
        boolean boolean21 = lwjgl3ApplicationConfiguration11.disableAudio;
        lwjgl3ApplicationConfiguration11.setAudioConfig((-14606592), (-66797), (-240));
        int int26 = lwjgl3ApplicationConfiguration11.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration11.windowResizable = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-240) + "'", int26 == (-240));
    }

    @Test
    public void test23147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23147");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration1.setdepth((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration1.r = 572587251;
        int int13 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferSize();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
    }

    @Test
    public void test23148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23148");
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
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        boolean boolean18 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int21 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-1618477056);
        lwjgl3ApplicationConfiguration0.setdepth((-12588544));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16711680 + "'", int21 == 16711680);
    }

    @Test
    public void test23149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23149");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-2937600), (float) 53248);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1507799040 + "'", int2 == 1507799040);
    }

    @Test
    public void test23150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23150");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) -1;
        lwjgl3ApplicationConfiguration0.b = (-16711681);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int13 = lwjgl3ApplicationConfiguration12.samples;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test23151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23151");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(65376, 1520501760, 65503, 33536);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.4887191E38f) + "'", float4 == (-1.4887191E38f));
    }

    @Test
    public void test23152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23152");
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
        int int34 = com.badlogic.gdx.graphics.Color.rgba4444(color21);
        com.badlogic.gdx.graphics.Color color40 = color21.lerp((float) 3, (float) 161902304, (float) 585070592, (float) 626699475, (float) 150);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.stencil = 10;
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration41.initialBackgroundColor = color45;
        int int47 = com.badlogic.gdx.graphics.Color.rgb888(color45);
        boolean boolean49 = color45.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration50.stencil = 10;
        com.badlogic.gdx.graphics.Color color54 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration50.initialBackgroundColor = color54;
        com.badlogic.gdx.graphics.Color color60 = color54.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color61 = color45.mul(color60);
        com.badlogic.gdx.graphics.Color color62 = color60.premultiplyAlpha();
        float float63 = color60.b;
        float float64 = color60.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration65.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration65.useVsync(false);
        lwjgl3ApplicationConfiguration65.setwindowWidth((-40036));
        int int78 = lwjgl3ApplicationConfiguration65.getwindowMinWidth();
        boolean boolean79 = color60.equals((java.lang.Object) int78);
        com.badlogic.gdx.graphics.Color color80 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color80, 626699475);
        com.badlogic.gdx.graphics.Color color83 = color60.sub(color80);
        com.badlogic.gdx.graphics.Color color84 = color40.mul(color60);
        com.badlogic.gdx.graphics.Color color85 = new com.badlogic.gdx.graphics.Color(color60);
        com.badlogic.gdx.graphics.Color color86 = new com.badlogic.gdx.graphics.Color(color60);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000000" + "'", str30, "00000000");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 65520 + "'", int34 == 65520);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(color80);
        org.junit.Assert.assertNotNull(color83);
        org.junit.Assert.assertNotNull(color84);
    }

    @Test
    public void test23153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23153");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.windowY = (byte) 1;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-32);
        int int8 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int9 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-32) + "'", int9 == (-32));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test23154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23154");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        java.lang.String str5 = lwjgl3ApplicationConfiguration0.title;
        int int6 = lwjgl3ApplicationConfiguration0.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        lwjgl3ApplicationConfiguration14.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration14.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration14.disableAudio = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode21 = lwjgl3ApplicationConfiguration14.fullscreenMode;
        lwjgl3ApplicationConfiguration14.setBackBufferConfig(0, 62445, (-16), (-637684704), 2016, 634911, (-52992));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = lwjgl3ApplicationConfiguration14.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode30);
        boolean boolean32 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode34 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode34;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertNull(lwjgl3DisplayMode21);
        org.junit.Assert.assertTrue("'" + hdpiMode30 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode30.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration33);
    }

    @Test
    public void test23155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23155");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener19;
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((float) (-16033380), (float) 16197090, (float) 512, (float) (-134360));
        float float26 = color25.toFloatBits();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 2.3509528E-38f + "'", float26 == 2.3509528E-38f);
    }

    @Test
    public void test23156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23156");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        int int9 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-63457);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000000";
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color26 = color21.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color27 = color26.clamp();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration0.samples = (-5510160);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((int) '#');
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 16776980;
        lwjgl3ApplicationConfiguration0.setsamples((-45824));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertNull(lwjgl3DisplayMode15);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test23157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23157");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int17 = lwjgl3ApplicationConfiguration0.depth;
        int int18 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        com.badlogic.gdx.Files.FileType fileType19 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.graphics.Color color20 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + fileType19 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType19.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test23158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23158");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.g = (-40036);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-10);
        boolean boolean18 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test23159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23159");
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
        float float22 = color21.toFloatBits();
        com.badlogic.gdx.graphics.Color color23 = color21.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color28 = color21.mul(2.5207762E-35f, (float) (byte) 0, (-1.460473E38f), 0.0f);
        float float29 = color28.g;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 2.3509886E-38f + "'", float22 == 2.3509886E-38f);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
    }

    @Test
    public void test23160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23160");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType10);
        int int12 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        lwjgl3ApplicationConfiguration14.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        int int21 = lwjgl3ApplicationConfiguration20.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration20.title = "hi!";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration24);
        lwjgl3ApplicationConfiguration25.r = ' ';
        lwjgl3ApplicationConfiguration25.windowMinWidth = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = lwjgl3ApplicationConfiguration25.hdpiMode;
        int int31 = lwjgl3ApplicationConfiguration25.getwindowMinWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration33);
        lwjgl3ApplicationConfiguration34.setWindowPosition((int) (short) 10, 10);
        boolean boolean38 = lwjgl3ApplicationConfiguration34.useGL30;
        lwjgl3ApplicationConfiguration34.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType42 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration34.preferencesFileType = fileType42;
        lwjgl3ApplicationConfiguration25.setPreferencesConfig("", fileType42);
        lwjgl3ApplicationConfiguration20.preferencesFileType = fileType42;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType42;
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.String str49 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration52.stencil = 10;
        com.badlogic.gdx.graphics.Color color56 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration52.initialBackgroundColor = color56;
        lwjgl3ApplicationConfiguration52.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color60 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration52.initialBackgroundColor = color60;
        boolean boolean62 = lwjgl3ApplicationConfiguration52.getwindowResizable();
        int int63 = lwjgl3ApplicationConfiguration52.windowMinWidth;
        lwjgl3ApplicationConfiguration52.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration52.windowMaxHeight = 514080;
        lwjgl3ApplicationConfiguration52.setvSyncEnabled(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration70 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int71 = lwjgl3ApplicationConfiguration70.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration72 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration70);
        int int73 = lwjgl3ApplicationConfiguration70.getaudioDeviceBufferCount();
        java.lang.String str74 = lwjgl3ApplicationConfiguration70.preferencesDirectory;
        lwjgl3ApplicationConfiguration70.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration70.setpreferencesDirectory("0000faff");
        boolean boolean79 = lwjgl3ApplicationConfiguration70.getwindowResizable();
        java.lang.String str80 = lwjgl3ApplicationConfiguration70.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = lwjgl3ApplicationConfiguration70.hdpiMode;
        lwjgl3ApplicationConfiguration52.hdpiMode = hdpiMode81;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode81;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + hdpiMode30 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode30.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + fileType42 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType42.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + ".prefs/" + "'", str49, ".prefs/");
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 512 + "'", int71 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 9 + "'", int73 == 9);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + ".prefs/" + "'", str74, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "0000faff" + "'", str80, "0000faff");
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23161");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(16711680);
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        int int3 = color1.toIntBits();
        com.badlogic.gdx.graphics.Color color4 = color1.cpy();
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65280 + "'", int2 == 65280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65280 + "'", int3 == 65280);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test23162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23162");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.setBackBufferConfig(8, 40664886, 0, (-100466688), 267782144, (-6553036), 16738740);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode15);
        int int17 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferSize();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
    }

    @Test
    public void test23163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23163");
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
        lwjgl3ApplicationConfiguration1.setwindowX(653055);
        lwjgl3ApplicationConfiguration1.setResizable(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
    }

    @Test
    public void test23164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23164");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color6 = color1.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color7 = color6.cpy();
        int int8 = com.badlogic.gdx.graphics.Color.rgb888(color7);
        java.lang.String str9 = color7.toString();
        int int10 = com.badlogic.gdx.graphics.Color.argb8888(color7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        int int14 = lwjgl3ApplicationConfiguration11.b;
        lwjgl3ApplicationConfiguration11.g = '#';
        com.badlogic.gdx.graphics.Color color17 = lwjgl3ApplicationConfiguration11.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color22, 16);
        color22.a = 0L;
        com.badlogic.gdx.graphics.Color color27 = color20.mul(color22);
        com.badlogic.gdx.graphics.Color color32 = color20.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color32, 33791);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color36 = color18.sub(color35);
        com.badlogic.gdx.graphics.Color color37 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color41, 16);
        color41.a = 0L;
        com.badlogic.gdx.graphics.Color color46 = color39.mul(color41);
        com.badlogic.gdx.graphics.Color color51 = color39.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color51, 33791);
        com.badlogic.gdx.graphics.Color color54 = new com.badlogic.gdx.graphics.Color(color51);
        com.badlogic.gdx.graphics.Color color55 = color37.sub(color54);
        com.badlogic.gdx.graphics.Color color56 = color35.set(color54);
        com.badlogic.gdx.graphics.Color color57 = color56.cpy();
        com.badlogic.gdx.graphics.Color color58 = color17.set(color56);
        com.badlogic.gdx.graphics.Color color59 = color7.add(color58);
        com.badlogic.gdx.graphics.Color color64 = color7.mul((float) 1090519033, (float) (-1083713536), (-3.587E-42f), (-1.7014017E38f));
        com.badlogic.gdx.graphics.Color color66 = color7.mul((float) 4);
        int int67 = com.badlogic.gdx.graphics.Color.rgba8888(color7);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65535 + "'", int8 == 65535);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00ffff00" + "'", str9, "00ffff00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 65535 + "'", int10 == 65535);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test23165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23165");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getuseGL30();
        boolean boolean14 = lwjgl3ApplicationConfiguration0.windowResizable;
        com.badlogic.gdx.Files.FileType fileType15 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType15;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Local));
    }

    @Test
    public void test23166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23166");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ORANGE;
        com.badlogic.gdx.graphics.Color color6 = color0.lerp(1.96271E-40f, (float) (-16711936), (float) 1677721600, (float) (-41943040), (-4.319983E37f));
        float float7 = color6.b;
        color6.g = 1671172080;
        com.badlogic.gdx.graphics.Color color10 = color6.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color15 = color10.sub((float) (-17796196), (float) (-1), 0.0f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color20 = color15.set((float) (-129957920), 0.0f, (float) 16710915, (float) (-66978332));
        java.lang.String str21 = color15.toString();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0000ff00" + "'", str21, "0000ff00");
    }

    @Test
    public void test23167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23167");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int13 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color18;
        lwjgl3ApplicationConfiguration14.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration14.samples = (short) -1;
        lwjgl3ApplicationConfiguration14.title = ".prefs/";
        int int26 = lwjgl3ApplicationConfiguration14.windowMaxWidth;
        int int27 = lwjgl3ApplicationConfiguration14.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration14.setwindowX(862994742);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = lwjgl3ApplicationConfiguration30.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode31);
        java.lang.Class<?> wildcardClass33 = hdpiMode31.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration30);
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test23168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23168");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setsamples((-1077952513));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.g;
        boolean boolean12 = lwjgl3ApplicationConfiguration10.vSyncEnabled;
        lwjgl3ApplicationConfiguration10.windowHeight = 6349110;
        int int15 = lwjgl3ApplicationConfiguration10.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration10.g = 1090519033;
        lwjgl3ApplicationConfiguration10.setWindowPosition((-30720), (-16189440));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test23169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23169");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2147420160));
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color7 = color2.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        float float8 = color7.b;
        com.badlogic.gdx.graphics.Color color13 = color7.add((float) 1465382614, 0.0f, (-1.7010254E38f), (float) (-2140996640));
        com.badlogic.gdx.graphics.Color color15 = color7.set(585070592);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((float) (-4089), (float) 16, (float) '#', (-5.875603E37f));
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color20);
        com.badlogic.gdx.graphics.Color color22 = color7.sub(color21);
        com.badlogic.gdx.graphics.Color color23 = color1.mul(color21);
        com.badlogic.gdx.graphics.Color color28 = color23.sub((-4.686841E30f), (float) (-8448), (float) (-6976), (float) 61455);
        com.badlogic.gdx.graphics.Color color34 = color28.lerp((-1.4953815E38f), (-2.4030265E-26f), (-4.2575536E37f), 1.83668E-40f, (-1.6746667E38f));
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color34);
    }

    @Test
    public void test23170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23170");
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
        lwjgl3ApplicationConfiguration1.setWindowedMode((-458762), 16738740);
        lwjgl3ApplicationConfiguration1.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (-149950464);
        lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources = (-7936);
        boolean boolean53 = lwjgl3ApplicationConfiguration1.getvSyncEnabled();
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test23171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23171");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-844509056));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test23172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23172");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration9.useOpenGL3(true, (-100466688), (-62876));
        lwjgl3ApplicationConfiguration9.setwindowHeight((-1077952513));
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration9.setFullscreenMode(displayMode17);
        com.badlogic.gdx.Files.FileType fileType19 = lwjgl3ApplicationConfiguration9.getpreferencesFileType();
        lwjgl3ApplicationConfiguration9.setResizable(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + fileType19 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType19.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23173");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = ' ';
        lwjgl3ApplicationConfiguration0.windowMinHeight = 40664886;
        lwjgl3ApplicationConfiguration0.setwindowX(537535241);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        int int18 = lwjgl3ApplicationConfiguration0.getdepth();
        int int19 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-9728477);
        int int22 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((-1463708416));
        com.badlogic.gdx.graphics.Color color26 = color24.mul((float) 401539072);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color27;
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(color26);
    }

    @Test
    public void test23174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23174");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-15514229);
        lwjgl3ApplicationConfiguration0.windowY = (short) -1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration8.stencil = 10;
        int int11 = lwjgl3ApplicationConfiguration8.depth;
        lwjgl3ApplicationConfiguration8.windowX = (short) 100;
        lwjgl3ApplicationConfiguration8.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType17 = lwjgl3ApplicationConfiguration8.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("d2b48cff", fileType17);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(1610676736);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + fileType17 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType17.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23175");
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
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color64, (-9728477));
        com.badlogic.gdx.graphics.Color color77 = color64.add((-1.4805586E-33f), (float) (-2147451392), (float) (-53504), (float) (-11241472));
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
        org.junit.Assert.assertNotNull(color77);
    }

    @Test
    public void test23176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23176");
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
        boolean boolean22 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
    }

    @Test
    public void test23177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23177");
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
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color24 = color22.mul((float) (-62876));
        color24.a = 16711680;
        com.badlogic.gdx.graphics.Color color31 = color24.mul((float) '#', (float) (-65536), (float) (-65025), (float) 553648000);
        com.badlogic.gdx.graphics.Color color32 = color13.set(color24);
        com.badlogic.gdx.graphics.Color color33 = color24.cpy();
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color33, (-16646400));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color33, (-1328611328));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test23178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23178");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration1.setdisableAudio(true);
        lwjgl3ApplicationConfiguration1.windowDecorated = true;
        lwjgl3ApplicationConfiguration1.setwindowResizable(true);
        int int13 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
        lwjgl3ApplicationConfiguration1.windowMaxHeight = 7048739;
        lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources = (-10188800);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration18);
        lwjgl3ApplicationConfiguration19.r = ' ';
        lwjgl3ApplicationConfiguration19.windowMinWidth = (byte) 0;
        com.badlogic.gdx.graphics.Color color24 = lwjgl3ApplicationConfiguration19.initialBackgroundColor;
        lwjgl3ApplicationConfiguration19.windowX = 10;
        boolean boolean27 = lwjgl3ApplicationConfiguration19.getvSyncEnabled();
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(0.0f, (float) (-503341578), (-1.5399916E-33f), (float) 2);
        com.badlogic.gdx.graphics.Color color34 = color32.set(2147418367);
        com.badlogic.gdx.graphics.Color color35 = color32.cpy();
        float float36 = color35.toFloatBits();
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration39.stencil = 10;
        int int42 = lwjgl3ApplicationConfiguration39.b;
        boolean boolean43 = lwjgl3ApplicationConfiguration39.vSyncEnabled;
        lwjgl3ApplicationConfiguration39.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration39.hdpiMode = hdpiMode46;
        com.badlogic.gdx.Files.FileType fileType48 = lwjgl3ApplicationConfiguration39.getpreferencesFileType();
        lwjgl3ApplicationConfiguration19.setPreferencesConfig("00ff00ff", fileType48);
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType48);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-4.286695E37f) + "'", float36 == (-4.286695E37f));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + fileType48 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType48.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23179");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int11 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.graphics.Color color14 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test23180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23180");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int10 = lwjgl3ApplicationConfiguration9.windowWidth;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 640 + "'", int10 == 640);
    }

    @Test
    public void test23181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23181");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((-2.3999214E22f), (float) (-2147438592), (-1.06102964E37f), (float) (-1895759872));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
    }

    @Test
    public void test23182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23182");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.getwindowY();
        lwjgl3ApplicationConfiguration1.title = "ffffff00";
        int int9 = lwjgl3ApplicationConfiguration1.getwindowHeight();
        lwjgl3ApplicationConfiguration1.setWindowPosition(61444, 1897903);
        lwjgl3ApplicationConfiguration1.setsamples((-844303));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
    }

    @Test
    public void test23183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23183");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color2);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color2);
        com.badlogic.gdx.graphics.Color color5 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color10 = color5.set((float) (-208), (float) (short) 10, (float) (byte) -1, 0.0f);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color5, (-268886016));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.stencil = 10;
        int int16 = lwjgl3ApplicationConfiguration13.depth;
        int int17 = lwjgl3ApplicationConfiguration13.stencil;
        int int18 = lwjgl3ApplicationConfiguration13.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = null;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration13.windowMinHeight = 0;
        int int23 = lwjgl3ApplicationConfiguration13.windowMinHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration13.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.graphics.Color color26 = lwjgl3ApplicationConfiguration13.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color27 = color5.add(color26);
        float float28 = color27.b;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test23184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23184");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setwindowWidth(537535241);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        lwjgl3ApplicationConfiguration12.setWindowPosition((int) (short) 10, 10);
        boolean boolean16 = lwjgl3ApplicationConfiguration12.useGL30;
        com.badlogic.gdx.Files.FileType fileType17 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration12.setpreferencesFileType(fileType17);
        com.badlogic.gdx.Files.FileType fileType19 = lwjgl3ApplicationConfiguration12.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00b48cff", fileType19);
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-52344);
        int int23 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + fileType17 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType17.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType19 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType19.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test23185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23185");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) (byte) 1);
        com.badlogic.gdx.graphics.Color color8 = color1.mul((float) 765, (float) (byte) -1, (float) (short) 100, (float) 100);
        color8.r = (-4.319983E37f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((float) 8616705, (float) (-52344), (float) 63518, (float) 131072);
        com.badlogic.gdx.graphics.Color color16 = color8.mul(color15);
        com.badlogic.gdx.graphics.Color color21 = color8.add((float) (-1), (float) 7680, (float) (-29852), (float) 65536);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color8, 33152);
        com.badlogic.gdx.graphics.Color color24 = color8.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color29 = color24.sub(0.0f, 0.0f, 1.203045E-38f, (float) (-22978560));
        color29.b = 20160;
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
    }

    @Test
    public void test23186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23186");
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
        lwjgl3ApplicationConfiguration12.windowX = (-503341578);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        lwjgl3ApplicationConfiguration15.useOpenGL3(false, 2, 40664886);
        lwjgl3ApplicationConfiguration15.setgles30ContextMinorVersion((-2089026813));
        int int22 = lwjgl3ApplicationConfiguration15.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((float) 18934527, (float) (-844509056), 0.043137256f, (float) 30720);
        lwjgl3ApplicationConfiguration15.setInitialBackgroundColor(color27);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color27);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test23187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23187");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        int int10 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.a = 252;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(215);
        int int19 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
    }

    @Test
    public void test23188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23188");
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
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        com.badlogic.gdx.graphics.Color color24 = color21.cpy();
        int int25 = com.badlogic.gdx.graphics.Color.rgba4444(color21);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((-2144));
        com.badlogic.gdx.graphics.Color color28 = color21.set(color27);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color((float) (-10224128), (float) (-10223606), (float) 1, (float) 10);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color33, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration36.stencil = 10;
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration36.initialBackgroundColor = color40;
        int int42 = com.badlogic.gdx.graphics.Color.rgb888(color40);
        boolean boolean44 = color40.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration45.stencil = 10;
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration45.initialBackgroundColor = color49;
        com.badlogic.gdx.graphics.Color color55 = color49.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color56 = color40.mul(color55);
        com.badlogic.gdx.graphics.Color color58 = color55.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color55, 3);
        com.badlogic.gdx.graphics.Color color62 = color55.set((int) (short) 1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color62, (-40036));
        com.badlogic.gdx.graphics.Color color65 = color62.cpy();
        com.badlogic.gdx.graphics.Color color67 = color65.set((int) 'a');
        com.badlogic.gdx.graphics.Color color69 = color33.lerp(color65, (float) (byte) -1);
        com.badlogic.gdx.graphics.Color color71 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color71, 16);
        com.badlogic.gdx.graphics.Color color79 = color71.lerp((float) (-8160), (float) 1677721600, (-1.4967834E38f), (-5.435091E37f), (-1.7013859E38f));
        com.badlogic.gdx.graphics.Color color80 = new com.badlogic.gdx.graphics.Color(color79);
        com.badlogic.gdx.graphics.Color color81 = color33.set(color79);
        com.badlogic.gdx.graphics.Color color82 = color28.mul(color79);
        com.badlogic.gdx.graphics.Color color87 = color79.add((float) 33021, (float) (-131840), (float) 16197090, 0.011764706f);
        com.badlogic.gdx.graphics.Color color89 = color87.mul((float) 7536639);
        com.badlogic.gdx.graphics.Color color90 = new com.badlogic.gdx.graphics.Color(color87);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNotNull(color79);
        org.junit.Assert.assertNotNull(color81);
        org.junit.Assert.assertNotNull(color82);
        org.junit.Assert.assertNotNull(color87);
        org.junit.Assert.assertNotNull(color89);
    }

    @Test
    public void test23189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23189");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (short) 10;
        int int10 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(16738740, 786400, (int) (byte) -1, 1465382614);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("00f80000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test23190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23190");
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
        int int18 = lwjgl3ApplicationConfiguration12.a;
        lwjgl3ApplicationConfiguration12.setAudioConfig(43371, 653055, 16711918);
        lwjgl3ApplicationConfiguration12.setTitle("827d0100");
        int int25 = lwjgl3ApplicationConfiguration12.getsamples();
        lwjgl3ApplicationConfiguration12.windowMaxHeight = (-516);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration28.stencil = 10;
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration28.initialBackgroundColor = color32;
        lwjgl3ApplicationConfiguration28.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color36 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration28.initialBackgroundColor = color36;
        int int38 = lwjgl3ApplicationConfiguration28.getaudioDeviceBufferSize();
        java.lang.String str39 = lwjgl3ApplicationConfiguration28.title;
        boolean boolean40 = lwjgl3ApplicationConfiguration28.getdisableAudio();
        int int41 = lwjgl3ApplicationConfiguration28.windowX;
        lwjgl3ApplicationConfiguration28.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = lwjgl3ApplicationConfiguration28.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = lwjgl3ApplicationConfiguration28.hdpiMode;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode45);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(lwjgl3DisplayMode14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23191");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.title;
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, (int) (byte) 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration1.setAudioConfig(16711680, 255, (-164075620));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int18 = lwjgl3ApplicationConfiguration17.getsamples();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test23192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23192");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        float float11 = color4.a;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((-65025));
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((float) (short) -1, (float) (-40036), 0.98039216f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color20 = color13.lerp(color18, (float) 786400);
        com.badlogic.gdx.graphics.Color color21 = color20.clamp();
        com.badlogic.gdx.graphics.Color color22 = color4.mul(color20);
        com.badlogic.gdx.graphics.Color color27 = color4.add((float) (-59475968), (float) 16777215, (float) (-1502683136), (float) 640);
        com.badlogic.gdx.graphics.Color color32 = color4.sub((float) (-3616), (-1.0431761E38f), (float) (-548854), (float) (-208));
        com.badlogic.gdx.graphics.Color color37 = color32.sub((float) 8, (-1.1841958E21f), (-5.9150646E37f), (float) 572710365);
        float float38 = color37.toFloatBits();
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 2.3509528E-38f + "'", float38 == 2.3509528E-38f);
    }

    @Test
    public void test23193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23193");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration1.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(480);
        float float9 = color8.b;
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration1.setsamples((-2147483648));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.003921569f + "'", float9 == 0.003921569f);
    }

    @Test
    public void test23194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23194");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 2147418367, (float) '#', (float) 0, (float) 26180);
        float float5 = color4.toFloatBits();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-4.28676E37f) + "'", float5 == (-4.28676E37f));
    }

    @Test
    public void test23195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23195");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.stencil = 786400;
        int int10 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.setsamples(2147418367);
        lwjgl3ApplicationConfiguration0.setwindowWidth(97);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((float) (-990777344), (float) (-268435536), (float) (-1069547520), (float) 512);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode21 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode21;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test23196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23196");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = lwjgl3ApplicationConfiguration9.fullscreenMode;
        lwjgl3ApplicationConfiguration9.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration9.setTitle("00000000");
        int int16 = lwjgl3ApplicationConfiguration9.depth;
        lwjgl3ApplicationConfiguration9.setAudioConfig((-8388608), (-13577603), (-1312));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNull(lwjgl3DisplayMode11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test23197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23197");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        lwjgl3ApplicationConfiguration1.setResizable(true);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferSize = 862994742;
        lwjgl3ApplicationConfiguration1.windowY = 65520;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.stencil = 10;
        int int15 = lwjgl3ApplicationConfiguration12.b;
        boolean boolean16 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        lwjgl3ApplicationConfiguration12.setResizable(true);
        lwjgl3ApplicationConfiguration12.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = lwjgl3ApplicationConfiguration12.hdpiMode;
        lwjgl3ApplicationConfiguration1.hdpiMode = hdpiMode21;
        lwjgl3ApplicationConfiguration1.setwindowX((-16654816));
        lwjgl3ApplicationConfiguration1.useVsync(false);
        lwjgl3ApplicationConfiguration1.useOpenGL3(true, 0, (-835044));
        lwjgl3ApplicationConfiguration1.setWindowedMode((-1010691232), (-101592576));
        int int34 = lwjgl3ApplicationConfiguration1.windowX;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-16654816) + "'", int34 == (-16654816));
    }

    @Test
    public void test23198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23198");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        boolean boolean6 = lwjgl3ApplicationConfiguration5.getwindowResizable();
        int int7 = lwjgl3ApplicationConfiguration5.windowMinHeight;
        lwjgl3ApplicationConfiguration5.stencil = (-4090624);
        int int10 = lwjgl3ApplicationConfiguration5.b;
        int int11 = lwjgl3ApplicationConfiguration5.a;
        lwjgl3ApplicationConfiguration5.setwindowY((-84934912));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = lwjgl3ApplicationConfiguration5.hdpiMode;
        lwjgl3ApplicationConfiguration5.setwindowHeight((-1967617));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23199");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        lwjgl3ApplicationConfiguration0.r = (byte) 10;
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-151165028), 0);
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-2137691648);
    }

    @Test
    public void test23200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23200");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 16);
        color3.a = 0L;
        com.badlogic.gdx.graphics.Color color8 = color1.mul(color3);
        com.badlogic.gdx.graphics.Color color13 = color1.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color13, 33791);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color13);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        int int18 = com.badlogic.gdx.graphics.Color.rgb888(color17);
        color17.a = 0.7490196f;
        com.badlogic.gdx.graphics.Color color22 = color17.mul((float) (-171008));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 33791 + "'", int18 == 33791);
        org.junit.Assert.assertNotNull(color22);
    }

    @Test
    public void test23201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23201");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.a = 2016;
        lwjgl3ApplicationConfiguration0.b = (-458762);
        int int19 = lwjgl3ApplicationConfiguration0.r;
        int int20 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration21.r = (-2639616);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2016 + "'", int20 == 2016);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
    }

    @Test
    public void test23202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23202");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        float float13 = color12.a;
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration1.setWindowSizeLimits((-65025), (-52344), (-654724064), 786400);
        int int20 = lwjgl3ApplicationConfiguration1.windowMaxWidth;
        boolean boolean21 = lwjgl3ApplicationConfiguration1.vSyncEnabled;
        int int22 = lwjgl3ApplicationConfiguration1.getsamples();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-654724064) + "'", int20 == (-654724064));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test23203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23203");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int10 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        int int11 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((float) 786400, (float) (-6553036), (float) (-255), (float) (-622910848));
        int int17 = com.badlogic.gdx.graphics.Color.rgba8888(color16);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        com.badlogic.gdx.graphics.Color color20 = color19.cpy();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        boolean boolean22 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int23 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-16777216) + "'", int17 == (-16777216));
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test23204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23204");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-92044800);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-251658240);
        lwjgl3ApplicationConfiguration0.title = "9fff00ff";
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test23205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23205");
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
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-15), (-8160), (-172470016), (-848128));
        boolean boolean30 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setTitle("9fff00ff");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 480 + "'", int18 == 480);
        org.junit.Assert.assertNotNull(color21);
// flaky:         org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-9.039009E37f) + "'", float23 == (-9.039009E37f));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration31);
    }

    @Test
    public void test23206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23206");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-159514627));
    }

    @Test
    public void test23207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23207");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color1, 125);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test23208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23208");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 16773120;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener12;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
    }

    @Test
    public void test23209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23209");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.windowHeight = (-668991488);
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.windowMinWidth = 65376;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
    }

    @Test
    public void test23210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23210");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) -1;
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.g = 514080;
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int16 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int17 = lwjgl3ApplicationConfiguration0.getdepth();
        int int18 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 480 + "'", int16 == 480);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test23211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23211");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        boolean boolean9 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.setaudioDeviceBufferCount(4063);
        int int13 = lwjgl3ApplicationConfiguration10.stencil;
        lwjgl3ApplicationConfiguration10.g = 150929408;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test23212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23212");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int6 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-65280));
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setsamples(62445);
        int int12 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test23213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23213");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.b = (-1077952513);
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int15 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test23214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23214");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.depth = (byte) 100;
        lwjgl3ApplicationConfiguration1.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int15 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test23215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23215");
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
        lwjgl3ApplicationConfiguration1.stencil = 43371;
        lwjgl3ApplicationConfiguration1.windowWidth = (-10223606);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration25.b = 1;
        lwjgl3ApplicationConfiguration25.setwindowHeight((-300062));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
    }

    @Test
    public void test23216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23216");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.98039216f, (float) 2147483647, 0.0f, (float) (-250615296));
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        color5.a = (-780300);
    }

    @Test
    public void test23217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23217");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration63.stencil = 10;
        com.badlogic.gdx.graphics.Color color67 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration63.initialBackgroundColor = color67;
        com.badlogic.gdx.graphics.Color color73 = color67.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color67, (int) (byte) 1);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color67);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color67, 65536);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color67, (-1948738560));
        com.badlogic.gdx.graphics.Color color81 = color67.clamp();
        color67.a = 285212774;
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
        org.junit.Assert.assertNotNull(color73);
        org.junit.Assert.assertNotNull(color81);
    }

    @Test
    public void test23218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23218");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-1721204736), (-9.0836197E18f), (float) (-1308622848), (-1.0407874E38f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
    }

    @Test
    public void test23219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23219");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-1077936368), (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setTitle("00000000");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.windowWidth = 43520;
        int int18 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1077936368) + "'", int18 == (-1077936368));
    }

    @Test
    public void test23220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23220");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration7.setgles30ContextMinorVersion(8);
        int int10 = lwjgl3ApplicationConfiguration7.windowMinHeight;
        lwjgl3ApplicationConfiguration7.windowMaxHeight = (-2147413088);
        lwjgl3ApplicationConfiguration7.depth = 514080;
        int int15 = lwjgl3ApplicationConfiguration7.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration7.setaudioDeviceBufferCount(150929408);
        boolean boolean18 = lwjgl3ApplicationConfiguration7.windowResizable;
        int int19 = lwjgl3ApplicationConfiguration7.samples;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test23221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23221");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 786400;
        lwjgl3ApplicationConfiguration0.setwindowX(61680);
    }

    @Test
    public void test23222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23222");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.stencil = 10;
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration24.initialBackgroundColor = color28;
        int int30 = com.badlogic.gdx.graphics.Color.rgb888(color28);
        boolean boolean32 = color28.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.stencil = 10;
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration33.initialBackgroundColor = color37;
        com.badlogic.gdx.graphics.Color color43 = color37.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color44 = color28.mul(color43);
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color(color43);
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color(color45);
        com.badlogic.gdx.graphics.Color color47 = color45.clamp();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color45, 1671172080);
        com.badlogic.gdx.graphics.Color color50 = color19.add(color45);
        boolean boolean52 = color50.equals((java.lang.Object) (-2013790208));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color50, (-973078528));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test23223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23223");
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
        lwjgl3ApplicationConfiguration12.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration12.setwindowMinWidth((-2009010));
        lwjgl3ApplicationConfiguration12.audioDeviceBufferSize = 16775680;
        int int19 = lwjgl3ApplicationConfiguration12.windowX;
        lwjgl3ApplicationConfiguration12.useOpenGL3(true, 224, (-8607));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test23224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23224");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(252);
    }

    @Test
    public void test23225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23225");
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
        int int20 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setwindowX((-658670879));
        int int23 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test23226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23226");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        lwjgl3ApplicationConfiguration11.setWindowPosition((int) (short) 10, 10);
        boolean boolean15 = lwjgl3ApplicationConfiguration11.useGL30;
        lwjgl3ApplicationConfiguration11.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType19 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration11.preferencesFileType = fileType19;
        int int21 = lwjgl3ApplicationConfiguration11.depth;
        lwjgl3ApplicationConfiguration11.audioDeviceBufferCount = '#';
        lwjgl3ApplicationConfiguration11.windowResizable = false;
        com.badlogic.gdx.Files.FileType fileType26 = lwjgl3ApplicationConfiguration11.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType26;
        lwjgl3ApplicationConfiguration0.windowX = (-80712576);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-243793680), (-2141126656));
        boolean boolean33 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + fileType19 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType19.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test23227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23227");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int11 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 0;
        int int16 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration17.audioDeviceSimultaneousSources = (-147130608);
        lwjgl3ApplicationConfiguration17.setAudioConfig((-5543167), 35, (-187027200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
    }

    @Test
    public void test23228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23228");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((-1.0899702E38f), (float) (-810483712), (-5.7740937E37f), (float) 1664768000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test23229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23229");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.a = 3;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-864551100), 65280);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-59244732));
        lwjgl3ApplicationConfiguration0.setAudioConfig((-2105736960), (-589825), (-410255360));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test23230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23230");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        int int5 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-80712576);
        int int9 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-8160);
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test23231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23231");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        int int8 = lwjgl3ApplicationConfiguration1.getwindowY();
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferSize(1);
        int int11 = lwjgl3ApplicationConfiguration1.windowWidth;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
    }

    @Test
    public void test23232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23232");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(6);
    }

    @Test
    public void test23233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23233");
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
        lwjgl3ApplicationConfiguration12.windowX = (-503341578);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        lwjgl3ApplicationConfiguration15.useOpenGL3(false, 2, 40664886);
        lwjgl3ApplicationConfiguration15.setgles30ContextMinorVersion((-2089026813));
        int int22 = lwjgl3ApplicationConfiguration15.windowMaxWidth;
        lwjgl3ApplicationConfiguration15.windowMaxHeight = (-2122350847);
        lwjgl3ApplicationConfiguration15.gles30ContextMajorVersion = (-7708);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test23234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23234");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-654724064);
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test23235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23235");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.g = (-2105736960);
        lwjgl3ApplicationConfiguration0.g = (-250615296);
        int int16 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int18 = lwjgl3ApplicationConfiguration17.g;
        lwjgl3ApplicationConfiguration17.windowMinHeight = (-8454400);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.stencil = 10;
        int int24 = lwjgl3ApplicationConfiguration21.b;
        boolean boolean25 = lwjgl3ApplicationConfiguration21.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType26 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration21.setpreferencesFileType(fileType26);
        int int28 = lwjgl3ApplicationConfiguration21.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        lwjgl3ApplicationConfiguration21.setaudioDeviceBufferSize(8925);
        int int32 = lwjgl3ApplicationConfiguration21.getaudioDeviceBufferSize();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration33);
        lwjgl3ApplicationConfiguration34.setWindowPosition((int) (short) 10, 10);
        boolean boolean38 = lwjgl3ApplicationConfiguration34.useGL30;
        int int39 = lwjgl3ApplicationConfiguration34.getwindowY();
        int int40 = lwjgl3ApplicationConfiguration34.samples;
        int int41 = lwjgl3ApplicationConfiguration34.samples;
        lwjgl3ApplicationConfiguration34.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = lwjgl3ApplicationConfiguration34.hdpiMode;
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration17.useVsync(true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-250615296) + "'", int18 == (-250615296));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8925 + "'", int32 == 8925);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23236");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setwindowHeight((-100466688));
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color15;
        lwjgl3ApplicationConfiguration11.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration11.depth = 8925;
        lwjgl3ApplicationConfiguration11.windowMinHeight = 509920;
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration11.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00b48cff", fileType23);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-90112), (-16646400), 17392);
        boolean boolean29 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration30);
    }

    @Test
    public void test23237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23237");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setsamples((-1077952513));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.g;
        lwjgl3ApplicationConfiguration10.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration10.setwindowWidth((-1972440832));
        lwjgl3ApplicationConfiguration10.r = (-1662054400);
        lwjgl3ApplicationConfiguration10.setwindowDecorated(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test23238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23238");
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
        color19.g = 537535241;
        com.badlogic.gdx.graphics.Color color28 = color19.mul(2.3509886E-38f, (float) 100, (float) (-2147483648), (float) (-65025));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.stencil = 10;
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration29.initialBackgroundColor = color33;
        lwjgl3ApplicationConfiguration29.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color37 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration29.initialBackgroundColor = color37;
        boolean boolean39 = lwjgl3ApplicationConfiguration29.getwindowResizable();
        int int40 = lwjgl3ApplicationConfiguration29.a;
        boolean boolean41 = lwjgl3ApplicationConfiguration29.windowResizable;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration29);
        lwjgl3ApplicationConfiguration29.vSyncEnabled = false;
        boolean boolean45 = lwjgl3ApplicationConfiguration29.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration29);
        int int47 = lwjgl3ApplicationConfiguration29.getwindowWidth();
        boolean boolean48 = color19.equals((java.lang.Object) int47);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 640 + "'", int47 == 640);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test23239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23239");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.windowY = (byte) 1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.stencil = 10;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color9;
        lwjgl3ApplicationConfiguration5.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color13;
        boolean boolean15 = lwjgl3ApplicationConfiguration5.getwindowResizable();
        lwjgl3ApplicationConfiguration5.windowMinWidth = 509920;
        boolean boolean18 = lwjgl3ApplicationConfiguration5.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        int int23 = lwjgl3ApplicationConfiguration20.depth;
        int int24 = lwjgl3ApplicationConfiguration20.stencil;
        int int25 = lwjgl3ApplicationConfiguration20.getwindowY();
        lwjgl3ApplicationConfiguration20.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration20.setwindowMinWidth(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.stencil = 10;
        int int33 = lwjgl3ApplicationConfiguration30.b;
        boolean boolean34 = lwjgl3ApplicationConfiguration30.vSyncEnabled;
        lwjgl3ApplicationConfiguration30.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType37 = lwjgl3ApplicationConfiguration30.getpreferencesFileType();
        lwjgl3ApplicationConfiguration20.preferencesFileType = fileType37;
        lwjgl3ApplicationConfiguration5.setPreferencesConfig("hi!", fileType37);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType37);
        int int41 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.setwindowY((-85504));
        int int44 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int45 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + fileType37 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType37.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 16 + "'", int41 == 16);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-85504) + "'", int44 == (-85504));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-85504) + "'", int45 == (-85504));
    }

    @Test
    public void test23240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23240");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-16181535));
        com.badlogic.gdx.graphics.Color color2 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color1, (-2144));
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test23241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23241");
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
        com.badlogic.gdx.graphics.Color color19 = color18.cpy();
        com.badlogic.gdx.graphics.Color color21 = color19.set(16766720);
        com.badlogic.gdx.graphics.Color color22 = color21.clamp();
        com.badlogic.gdx.graphics.Color color27 = color21.set((float) (-352419840), (float) 16776961, (float) (-241208591), (float) 64274);
        com.badlogic.gdx.graphics.Color color28 = color21.clamp();
        com.badlogic.gdx.graphics.Color color30 = color21.set(635295);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color30, (-510));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
    }

    @Test
    public void test23242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23242");
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
        com.badlogic.gdx.graphics.Color color22 = color20.set((-2063361));
        com.badlogic.gdx.graphics.Color color23 = color22.cpy();
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color23);
        com.badlogic.gdx.graphics.Color color25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color26 = color23.set(color25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test23243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23243");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 8, (float) (-64), (float) (-608), (-4.2866305E37f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.4906038E38f) + "'", float4 == (-1.4906038E38f));
    }

    @Test
    public void test23244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23244");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.a = (-1);
        int int4 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(130029600);
        lwjgl3ApplicationConfiguration0.windowMinWidth = 33791;
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.title;
        int int10 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode15;
        int int17 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 480 + "'", int17 == 480);
    }

    @Test
    public void test23245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23245");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        int int5 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
    }

    @Test
    public void test23246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23246");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int4 = lwjgl3ApplicationConfiguration3.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration3.windowListener;
        int int7 = lwjgl3ApplicationConfiguration3.getsamples();
        com.badlogic.gdx.Files.FileType fileType8 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration3.preferencesFileType = fileType8;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color15;
        com.badlogic.gdx.graphics.Color color21 = color15.add((float) 10, (float) 100, (float) 1L, (float) 0);
        float float22 = color15.b;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color15;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 255;
        com.badlogic.gdx.graphics.Color color26 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-537067520);
        int int29 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test23247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23247");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        int int8 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener9;
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int12 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int13 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test23248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23248");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.windowX = 33791;
        lwjgl3ApplicationConfiguration1.useOpenGL3(true, 131072, 9);
        lwjgl3ApplicationConfiguration1.windowMinWidth = (-30692);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test23249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23249");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.setBackBufferConfig(653055, (-5543167), 8616705, 2147418367, (-52344), (-1778519256), 1953529918);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = null;
        lwjgl3ApplicationConfiguration1.fullscreenMode = lwjgl3DisplayMode18;
        lwjgl3ApplicationConfiguration1.setWindowPosition((-151390720), (-9));
        int int23 = lwjgl3ApplicationConfiguration1.getwindowX();
        int int24 = lwjgl3ApplicationConfiguration1.windowMaxWidth;
        lwjgl3ApplicationConfiguration1.disableAudio = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-151390720) + "'", int23 == (-151390720));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test23250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23250");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.b = (-16776704);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        int int13 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        int int14 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test23251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23251");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int10 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener11;
        lwjgl3ApplicationConfiguration0.depth = (-22);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("9c663200");
        lwjgl3ApplicationConfiguration0.windowX = (-129957920);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration19.useGL30 = true;
        lwjgl3ApplicationConfiguration19.setwindowResizable(true);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((float) 100, (float) 2, (float) 6349110, (float) 607);
        com.badlogic.gdx.graphics.Color color33 = color28.set((float) (-2147451392), (-1.2320282E38f), (float) (-52344), 100.0f);
        com.badlogic.gdx.graphics.Color color35 = color33.mul((float) (-1245052928));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color33, (-4628480));
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(color33);
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color35);
    }

    @Test
    public void test23252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23252");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((-1.657167E38f), (float) (-12791616), (float) 16315920);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test23253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23253");
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
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        color21.a = (-9.071428E37f);
        com.badlogic.gdx.graphics.Color color30 = color21.sub((float) 483965280, (float) 2080210944, (float) (-1879059712), (-8.772646E37f));
        color30.a = 0.516129f;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(color30);
    }

    @Test
    public void test23254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23254");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565(2.5243549E-29f, 0.12549019f, (float) (-4249857));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-131745568) + "'", int3 == (-131745568));
    }

    @Test
    public void test23255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23255");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-2.315247E-14f), (float) 7, (float) 215, (float) 1519722240);
    }

    @Test
    public void test23256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23256");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-38416));
    }

    @Test
    public void test23257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23257");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        boolean boolean3 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int4 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int5 = lwjgl3ApplicationConfiguration0.b;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(0);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 1897903;
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int14 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test23258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23258");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(480);
        lwjgl3ApplicationConfiguration0.windowX = (-234887936);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
    }

    @Test
    public void test23259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23259");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        lwjgl3ApplicationConfiguration1.audioDeviceBufferSize = 163200;
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferCount(65535);
        lwjgl3ApplicationConfiguration1.setdepth(5);
        lwjgl3ApplicationConfiguration1.setResizable(false);
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (-1233169392);
        lwjgl3ApplicationConfiguration1.useGL30 = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23260");
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
        int int18 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setWindowPosition(65376, (-668991488));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test23261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23261");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (short) 10, (float) (-4089), (float) 8, (float) 65535);
        float float5 = color4.r;
        int int6 = com.badlogic.gdx.graphics.Color.argb8888(color4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-65281) + "'", int6 == (-65281));
    }

    @Test
    public void test23262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23262");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int13 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.windowMaxHeight = (byte) -1;
        lwjgl3ApplicationConfiguration21.setwindowResizable(false);
        lwjgl3ApplicationConfiguration21.vSyncEnabled = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration29);
        int int31 = lwjgl3ApplicationConfiguration30.samples;
        lwjgl3ApplicationConfiguration30.setwindowY(9);
        lwjgl3ApplicationConfiguration30.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration30.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int40 = lwjgl3ApplicationConfiguration39.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType42 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration39.setPreferencesConfig("", fileType42);
        lwjgl3ApplicationConfiguration30.setpreferencesFileType(fileType42);
        lwjgl3ApplicationConfiguration30.windowMinWidth = (byte) 0;
        lwjgl3ApplicationConfiguration30.windowHeight = (-2147481728);
        com.badlogic.gdx.Files.FileType fileType49 = lwjgl3ApplicationConfiguration30.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration51.stencil = 10;
        int int54 = lwjgl3ApplicationConfiguration51.b;
        boolean boolean55 = lwjgl3ApplicationConfiguration51.vSyncEnabled;
        lwjgl3ApplicationConfiguration51.setuseGL30(false);
        int int58 = lwjgl3ApplicationConfiguration51.getwindowY();
        int int59 = lwjgl3ApplicationConfiguration51.audioDeviceBufferCount;
        int int60 = lwjgl3ApplicationConfiguration51.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration61.stencil = 10;
        int int64 = lwjgl3ApplicationConfiguration61.b;
        boolean boolean65 = lwjgl3ApplicationConfiguration61.vSyncEnabled;
        lwjgl3ApplicationConfiguration61.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration61.hdpiMode = hdpiMode68;
        com.badlogic.gdx.Files.FileType fileType70 = lwjgl3ApplicationConfiguration61.getpreferencesFileType();
        lwjgl3ApplicationConfiguration51.setpreferencesFileType(fileType70);
        lwjgl3ApplicationConfiguration30.setPreferencesConfig("00ffffff", fileType70);
        lwjgl3ApplicationConfiguration21.setPreferencesConfig("00000000", fileType70);
        com.badlogic.gdx.Files.FileType fileType74 = lwjgl3ApplicationConfiguration21.getpreferencesFileType();
        lwjgl3ApplicationConfiguration21.r = 53488;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode77 = lwjgl3ApplicationConfiguration21.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode77);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertTrue("'" + fileType42 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType42.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + fileType49 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType49.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 8 + "'", int54 == 8);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 9 + "'", int59 == 9);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 8 + "'", int64 == 8);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode68 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode68.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + fileType70 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType70.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType74 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType74.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode77 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode77.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23263");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color6 = color1.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color8 = color1.set(8);
        com.badlogic.gdx.graphics.Color color10 = color1.set(586415136);
        com.badlogic.gdx.graphics.Color color12 = color10.set((-1246176));
        color12.g = (-2147420160);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test23264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23264");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.depth = 100;
        lwjgl3ApplicationConfiguration0.samples = '4';
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setwindowX((-2129657856));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.stencil = 10;
        int int17 = lwjgl3ApplicationConfiguration14.depth;
        lwjgl3ApplicationConfiguration14.windowX = (short) 100;
        lwjgl3ApplicationConfiguration14.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration14.getpreferencesFileType();
        int int24 = lwjgl3ApplicationConfiguration14.getwindowY();
        lwjgl3ApplicationConfiguration14.samples = 512;
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.CHARTREUSE;
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color27);
        com.badlogic.gdx.graphics.Color color29 = color27.clamp();
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color27);
        boolean boolean31 = lwjgl3ApplicationConfiguration14.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration32.windowMaxHeight = (byte) -1;
        lwjgl3ApplicationConfiguration32.setwindowResizable(false);
        lwjgl3ApplicationConfiguration32.windowHeight = 765;
        boolean boolean39 = lwjgl3ApplicationConfiguration32.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration40);
        lwjgl3ApplicationConfiguration41.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode44);
        com.badlogic.gdx.Files.FileType fileType48 = lwjgl3ApplicationConfiguration14.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType48;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration41);
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + fileType48 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType48.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23265");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-16580607);
        lwjgl3ApplicationConfiguration0.title = "ffa5ff00";
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 1895825408, 24801);
        int int13 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test23266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23266");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int12 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.stencil = 10;
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color19;
        lwjgl3ApplicationConfiguration15.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration15.setFullscreenMode(displayMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        int int26 = lwjgl3ApplicationConfiguration15.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration15.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode29);
        boolean boolean32 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-65025), (int) (byte) 10, (-4090624), 3);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-352419840));
        lwjgl3ApplicationConfiguration0.depth = (-214280192);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setdepth((-255));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test23267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23267");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        boolean boolean8 = lwjgl3ApplicationConfiguration1.getwindowResizable();
        java.lang.String str9 = lwjgl3ApplicationConfiguration1.preferencesDirectory;
        int int10 = lwjgl3ApplicationConfiguration1.audioDeviceBufferCount;
        int int11 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        int int12 = lwjgl3ApplicationConfiguration1.samples;
        int int13 = lwjgl3ApplicationConfiguration1.windowMinWidth;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test23268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23268");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.r = 65280;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration16.windowMaxWidth = 16738740;
        int int19 = lwjgl3ApplicationConfiguration16.samples;
        lwjgl3ApplicationConfiguration16.samples = 586415136;
        lwjgl3ApplicationConfiguration16.windowMinWidth = (-1126760448);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test23269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23269");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean5 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-22);
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        int int12 = lwjgl3ApplicationConfiguration9.b;
        boolean boolean13 = lwjgl3ApplicationConfiguration9.vSyncEnabled;
        lwjgl3ApplicationConfiguration9.setuseGL30(false);
        int int16 = lwjgl3ApplicationConfiguration9.getwindowY();
        int int17 = lwjgl3ApplicationConfiguration9.audioDeviceBufferCount;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration9.setWindowListener(lwjgl3WindowListener18);
        boolean boolean20 = lwjgl3ApplicationConfiguration9.useGL30;
        lwjgl3ApplicationConfiguration9.samples = 480;
        java.lang.String str23 = lwjgl3ApplicationConfiguration9.preferencesDirectory;
        int int24 = lwjgl3ApplicationConfiguration9.windowY;
        int int25 = lwjgl3ApplicationConfiguration9.windowMaxWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.stencil = 10;
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration27.setFullscreenMode(displayMode30);
        lwjgl3ApplicationConfiguration27.windowY = (short) 100;
        com.badlogic.gdx.Files.FileType fileType34 = lwjgl3ApplicationConfiguration27.preferencesFileType;
        lwjgl3ApplicationConfiguration9.setPreferencesConfig("ff00000a", fileType34);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ".prefs/" + "'", str23, ".prefs/");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + fileType34 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType34.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23270");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int13 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setdepth((-208));
        lwjgl3ApplicationConfiguration0.title = "228b00ff";
        lwjgl3ApplicationConfiguration0.depth = (-279552);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23271");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.stencil = 786400;
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((-3776));
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color13;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test23272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23272");
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
        lwjgl3ApplicationConfiguration1.windowHeight = (-16033380);
        lwjgl3ApplicationConfiguration1.windowResizable = true;
        lwjgl3ApplicationConfiguration1.windowMinWidth = 863980544;
        lwjgl3ApplicationConfiguration1.setwindowResizable(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test23273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23273");
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
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion(1621098495);
        lwjgl3ApplicationConfiguration1.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration1.windowResizable = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.stencil = 10;
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration22.initialBackgroundColor = color26;
        lwjgl3ApplicationConfiguration22.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration22.samples = (short) -1;
        lwjgl3ApplicationConfiguration22.title = ".prefs/";
        int int34 = lwjgl3ApplicationConfiguration22.windowMaxWidth;
        lwjgl3ApplicationConfiguration22.windowX = (-1671024128);
        lwjgl3ApplicationConfiguration22.useVsync(false);
        lwjgl3ApplicationConfiguration22.setsamples(161902304);
        com.badlogic.gdx.Files.FileType fileType41 = lwjgl3ApplicationConfiguration22.getpreferencesFileType();
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType41;
        lwjgl3ApplicationConfiguration1.disableAudio(false);
        java.lang.String str45 = lwjgl3ApplicationConfiguration1.preferencesDirectory;
        lwjgl3ApplicationConfiguration1.disableAudio = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + fileType41 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType41.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ".prefs/" + "'", str45, ".prefs/");
    }

    @Test
    public void test23274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23274");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (-256);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = 765;
        lwjgl3ApplicationConfiguration1.setWindowPosition((-2144), (-129024));
        int int14 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferSize();
        java.lang.String str15 = lwjgl3ApplicationConfiguration1.preferencesDirectory;
        int int16 = lwjgl3ApplicationConfiguration1.getwindowY();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-129024) + "'", int16 == (-129024));
    }

    @Test
    public void test23275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23275");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("00000200");
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(200);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
    }

    @Test
    public void test23276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23276");
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
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setwindowX((-2305));
        int int25 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-16569), (-1418444800), (-1647337440), 63341);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + fileType17 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType17.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2305) + "'", int25 == (-2305));
    }

    @Test
    public void test23277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23277");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = ' ';
        lwjgl3ApplicationConfiguration0.windowMinHeight = 40664886;
        lwjgl3ApplicationConfiguration0.setwindowX(537535241);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 0;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.windowX = (-101592576);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode24 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertNull(lwjgl3DisplayMode24);
    }

    @Test
    public void test23278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23278");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color();
        int int2 = color1.toIntBits();
        int int3 = com.badlogic.gdx.graphics.Color.rgba4444(color1);
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color1, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color11, 16);
        color11.a = 0L;
        com.badlogic.gdx.graphics.Color color16 = color9.mul(color11);
        com.badlogic.gdx.graphics.Color color21 = color9.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color21, 33791);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color25 = color7.sub(color24);
        com.badlogic.gdx.graphics.Color color26 = color6.mul(color24);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color6, (-32));
        color6.a = (-2147413088);
        com.badlogic.gdx.graphics.Color color36 = color6.lerp((float) (-534781952), (float) 2263808, (float) (-1551892480), (float) (-3091), (float) (-33488896));
        com.badlogic.gdx.graphics.Color color41 = color36.mul((-1.1972631E38f), (float) 163200, (float) 16448510, (float) 65520);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color41);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color41);
    }

    @Test
    public void test23279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23279");
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
        float float23 = color21.r;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color29 = color24.mul((float) 267782144, (float) (byte) 1, (float) 40664886, 1.0f);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.stencil = 10;
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration30.initialBackgroundColor = color34;
        int int36 = com.badlogic.gdx.graphics.Color.rgb888(color34);
        boolean boolean38 = color34.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration39.stencil = 10;
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration39.initialBackgroundColor = color43;
        com.badlogic.gdx.graphics.Color color49 = color43.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color50 = color34.mul(color49);
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color(color49);
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color(color51);
        com.badlogic.gdx.graphics.Color color53 = color29.mul(color52);
        com.badlogic.gdx.graphics.Color color54 = new com.badlogic.gdx.graphics.Color(color29);
        int int55 = com.badlogic.gdx.graphics.Color.rgba8888(color54);
        int int56 = com.badlogic.gdx.graphics.Color.rgba4444(color54);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color54, (-2147438592));
        com.badlogic.gdx.graphics.Color color60 = color54.mul((-1.043444E38f));
        com.badlogic.gdx.graphics.Color color61 = new com.badlogic.gdx.graphics.Color(color60);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(color60);
    }

    @Test
    public void test23280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23280");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        lwjgl3ApplicationConfiguration0.setTitle("");
        int int13 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((-65025));
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((float) (short) -1, (float) (-40036), 0.98039216f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color22 = color15.lerp(color20, (float) 786400);
        com.badlogic.gdx.graphics.Color color23 = color22.clamp();
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color25);
        color26.b = 0.0f;
        float float29 = color26.a;
        com.badlogic.gdx.graphics.Color color30 = color22.sub(color26);
        com.badlogic.gdx.graphics.Color color31 = color26.cpy();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float35 = color34.a;
        com.badlogic.gdx.graphics.Color color37 = color34.mul((float) (-1034));
        com.badlogic.gdx.graphics.Color color38 = color31.sub(color37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.39215687f + "'", float29 == 0.39215687f);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
    }

    @Test
    public void test23281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23281");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.title;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-786496);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(607);
        int int17 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int20 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 640 + "'", int17 == 640);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 607 + "'", int20 == 607);
    }

    @Test
    public void test23282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23282");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-7936), (float) (-62710876), (float) (-23808), (float) 16773632);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-512) + "'", int4 == (-512));
    }

    @Test
    public void test23283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23283");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setsamples(28901);
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (-15724560));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23284");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int11 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color17 = color12.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        int int18 = com.badlogic.gdx.graphics.Color.argb8888(color12);
        int int19 = com.badlogic.gdx.graphics.Color.rgb565(color12);
        color12.g = (short) 0;
        int int22 = com.badlogic.gdx.graphics.Color.rgba4444(color12);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color12;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-16711936) + "'", int18 == (-16711936));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2016 + "'", int19 == 2016);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
    }

    @Test
    public void test23285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23285");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-587202560), (float) (-497025568), 0.0f, (-1.4805586E-33f));
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color4, (-63488));
        com.badlogic.gdx.graphics.Color color11 = color4.mul((float) 32767, 0.0f, (-6.5765565E26f), (float) (-16646145));
        com.badlogic.gdx.graphics.Color color13 = color11.mul((-1.5399916E-33f));
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test23286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23286");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int11 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        int int14 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23287");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TAN;
        java.lang.String str1 = color0.toString();
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color7, 16);
        color7.a = 0L;
        com.badlogic.gdx.graphics.Color color12 = color5.mul(color7);
        com.badlogic.gdx.graphics.Color color17 = color5.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        color5.g = (short) -1;
        com.badlogic.gdx.graphics.Color color21 = color5.set(1);
        int int22 = color21.toIntBits();
        com.badlogic.gdx.graphics.Color color24 = color21.set((-2023680));
        com.badlogic.gdx.graphics.Color color26 = color0.lerp(color24, (float) 6156);
        com.badlogic.gdx.graphics.Color color28 = color24.set(501619680);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00ffff7f" + "'", str1, "00ffff7f");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2130771967 + "'", int2 == 2130771967);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16777216 + "'", int22 == 16777216);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test23288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23288");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setdepth(16738740);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-208);
        lwjgl3ApplicationConfiguration0.stencil = (-266338527);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        boolean boolean20 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23289");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 65280, (float) 3371073, (float) (-44544), (float) (-648224));
        com.badlogic.gdx.graphics.Color color9 = color4.sub((float) 16448510, (float) (-805306623), (float) (-525980), (float) 5959920);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test23290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23290");
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
        lwjgl3ApplicationConfiguration1.disableAudio(true);
        int int42 = lwjgl3ApplicationConfiguration1.windowHeight;
        int int43 = lwjgl3ApplicationConfiguration1.b;
        int int44 = lwjgl3ApplicationConfiguration1.g;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 480 + "'", int42 == 480);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 8 + "'", int44 == 8);
    }

    @Test
    public void test23291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23291");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 2014, (float) (-16711510), (float) (-134283774));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1476446208) + "'", int3 == (-1476446208));
    }

    @Test
    public void test23292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23292");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        java.lang.String str7 = lwjgl3ApplicationConfiguration6.getpreferencesDirectory();
        int int8 = lwjgl3ApplicationConfiguration6.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration6);
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color15 = color10.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        int int16 = com.badlogic.gdx.graphics.Color.argb8888(color10);
        color10.a = (-2147481728);
        color10.r = 0.06666667f;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color10);
        lwjgl3ApplicationConfiguration9.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.stencil = 10;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color27;
        int int29 = com.badlogic.gdx.graphics.Color.rgb888(color27);
        boolean boolean31 = color27.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration32.stencil = 10;
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration32.initialBackgroundColor = color36;
        com.badlogic.gdx.graphics.Color color42 = color36.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color43 = color27.mul(color42);
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color(color42);
        float float45 = color44.toFloatBits();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color44, (-251659777));
        com.badlogic.gdx.graphics.Color color49 = color10.lerp(color44, (float) (-134360));
        float float50 = color49.a;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-16711936) + "'", int16 == (-16711936));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 2.3509886E-38f + "'", float45 == 2.3509886E-38f);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.0f + "'", float50 == 0.0f);
    }

    @Test
    public void test23293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23293");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, 7680);
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.windowX = 4063;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int20 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7680 + "'", int16 == 7680);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
    }

    @Test
    public void test23294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23294");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int13 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(626699475);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-116391936);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test23295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23295");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType5;
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-654724064);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.g = 54992;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
    }

    @Test
    public void test23296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23296");
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
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int17 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test23297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23297");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode3 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.title = "";
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setTitle("d2b48cff");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 62445;
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(0.98039216f, (float) 2147483647, 0.0f, (float) (-250615296));
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        float float18 = color16.g;
        float float19 = color16.a;
        org.junit.Assert.assertNull(lwjgl3DisplayMode3);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test23298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23298");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 9, (float) (-569376768), (float) 1769996257, (-1.7011944E38f));
        int int5 = com.badlogic.gdx.graphics.Color.rgba4444(color4);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((-637684704));
        com.badlogic.gdx.graphics.Color color13 = color7.lerp((float) (-7555886), (float) 1769996257, (float) (-10188800), (float) 537535241, (float) 65280);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        int int15 = color14.toIntBits();
        com.badlogic.gdx.graphics.Color color16 = color13.add(color14);
        color14.r = (-62876);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.stencil = 10;
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration19.initialBackgroundColor = color23;
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color26 = color23.sub(color25);
        com.badlogic.gdx.graphics.Color color32 = color25.lerp((float) 509920, (float) (-1671024128), (float) '#', (float) (-15), (float) 25500);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        float float35 = color34.b;
        com.badlogic.gdx.graphics.Color color40 = color34.sub(0.0f, (float) (-848128), (float) (-8257792), (-5.0593836E30f));
        com.badlogic.gdx.graphics.Color color41 = color25.set(color34);
        com.badlogic.gdx.graphics.Color color42 = color34.clamp();
        com.badlogic.gdx.graphics.Color color43 = color14.set(color34);
        com.badlogic.gdx.graphics.Color color49 = color43.lerp((float) 607, (float) 16711935, (float) (-5376), (float) 131, (float) 167772160);
        com.badlogic.gdx.graphics.Color color50 = color4.set(color49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 61680 + "'", int5 == 61680);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52224 + "'", int15 == 52224);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color50);
    }

    @Test
    public void test23299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23299");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-208), (float) (-8257792), (float) 586415136, (float) 7680);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color4, (-1644162816));
    }

    @Test
    public void test23300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23300");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float2 = color1.b;
        int int3 = color1.toIntBits();
        com.badlogic.gdx.graphics.Color color4 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color1, 43371);
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color11, 16);
        color11.a = 0L;
        com.badlogic.gdx.graphics.Color color16 = color9.mul(color11);
        com.badlogic.gdx.graphics.Color color21 = color9.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color21, 33791);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color25 = color7.sub(color24);
        com.badlogic.gdx.graphics.Color color26 = color25.clamp();
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.VIOLET;
        com.badlogic.gdx.graphics.Color color29 = color27.mul((float) (-65025));
        float float30 = color27.b;
        com.badlogic.gdx.graphics.Color color31 = color25.sub(color27);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color31, (-22978560));
        com.badlogic.gdx.graphics.Color color34 = color1.add(color31);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-0.0f) + "'", float30 == (-0.0f));
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color34);
    }

    @Test
    public void test23301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23301");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1465382614, (int) ' ');
        int int18 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.a = 0;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 134217728;
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test23302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23302");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color11, 16);
        float float14 = color11.g;
        int int15 = com.badlogic.gdx.graphics.Color.rgba8888(color11);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color11);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color16;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color16, 1953529918);
        com.badlogic.gdx.graphics.Color color25 = color16.lerp((float) 10551039, 1.050568E-37f, (float) (-143104), (float) (-16), (float) (-1050128));
        float float26 = color16.g;
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33791 + "'", int15 == 33791);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
    }

    @Test
    public void test23303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23303");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.7011532E38f), (-1.7000424E38f), 1.7014117E38f, (float) 2016);
    }

    @Test
    public void test23304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23304");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 61141, (float) 6332926, (float) (-8708864), (float) (-11520));
    }

    @Test
    public void test23305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23305");
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
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 39951;
        int int59 = lwjgl3ApplicationConfiguration0.b;
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
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test23306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23306");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = lwjgl3ApplicationConfiguration1.fullscreenMode;
        int int19 = lwjgl3ApplicationConfiguration1.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration1.windowWidth = 2147483647;
        boolean boolean22 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        lwjgl3ApplicationConfiguration1.windowMinHeight = 1090519033;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration25);
        lwjgl3ApplicationConfiguration26.r = ' ';
        boolean boolean29 = lwjgl3ApplicationConfiguration26.getuseGL30();
        lwjgl3ApplicationConfiguration26.useGL30 = false;
        lwjgl3ApplicationConfiguration26.windowMaxHeight = (-256);
        com.badlogic.gdx.graphics.Color color34 = lwjgl3ApplicationConfiguration26.initialBackgroundColor;
        int int35 = color34.toIntBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration36.stencil = 10;
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration36.initialBackgroundColor = color40;
        com.badlogic.gdx.graphics.Color color46 = color40.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color50 = color40.lerp(color48, (float) 100L);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration51);
        lwjgl3ApplicationConfiguration52.setvSyncEnabled(false);
        boolean boolean55 = lwjgl3ApplicationConfiguration52.getuseGL30();
        com.badlogic.gdx.graphics.Color color57 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color59 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color59, 16);
        color59.a = 0L;
        com.badlogic.gdx.graphics.Color color64 = color57.mul(color59);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration65.stencil = 10;
        com.badlogic.gdx.graphics.Color color69 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration65.initialBackgroundColor = color69;
        int int71 = com.badlogic.gdx.graphics.Color.rgb888(color69);
        boolean boolean73 = color69.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration74.stencil = 10;
        com.badlogic.gdx.graphics.Color color78 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration74.initialBackgroundColor = color78;
        com.badlogic.gdx.graphics.Color color84 = color78.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color85 = color69.mul(color84);
        com.badlogic.gdx.graphics.Color color86 = new com.badlogic.gdx.graphics.Color(color84);
        com.badlogic.gdx.graphics.Color color87 = color59.set(color86);
        lwjgl3ApplicationConfiguration52.setInitialBackgroundColor(color87);
        com.badlogic.gdx.graphics.Color color89 = color50.sub(color87);
        com.badlogic.gdx.graphics.Color color90 = color34.mul(color89);
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color34;
        lwjgl3ApplicationConfiguration1.setTitle("6a400000");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertNull(lwjgl3DisplayMode18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-16777216) + "'", int35 == (-16777216));
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(color84);
        org.junit.Assert.assertNotNull(color85);
        org.junit.Assert.assertNotNull(color87);
        org.junit.Assert.assertNotNull(color89);
        org.junit.Assert.assertNotNull(color90);
    }

    @Test
    public void test23307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23307");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        java.lang.String str7 = lwjgl3ApplicationConfiguration6.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration6.setWindowListener(lwjgl3WindowListener8);
        lwjgl3ApplicationConfiguration6.setuseGL30(true);
        lwjgl3ApplicationConfiguration6.b = (-30218);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
    }

    @Test
    public void test23308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23308");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color2);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color2);
        com.badlogic.gdx.graphics.Color color9 = color2.set((float) 509920, 0.0f, 0.0f, (float) (byte) 1);
        int int10 = com.badlogic.gdx.graphics.Color.rgba8888(color2);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((float) (-654724064), (float) 16711935, (float) 43371, (float) 100);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color18 = color17.clamp();
        float float19 = color17.r;
        com.badlogic.gdx.graphics.Color color20 = color17.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color21 = color20.clamp();
        com.badlogic.gdx.graphics.Color color22 = color15.set(color21);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(224);
        float float25 = color24.r;
        com.badlogic.gdx.graphics.Color color27 = color24.set((-1077936368));
        int int28 = com.badlogic.gdx.graphics.Color.rgba8888(color27);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color27, (-764808));
        com.badlogic.gdx.graphics.Color color32 = color21.lerp(color27, (-0.36354828f));
        com.badlogic.gdx.graphics.Color color33 = color2.mul(color21);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-16776961) + "'", int10 == (-16776961));
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1077936368) + "'", int28 == (-1077936368));
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test23309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23309");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.windowMinWidth = 16711425;
        int int11 = lwjgl3ApplicationConfiguration0.getdepth();
        int int12 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test23310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23310");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType5;
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setsamples((int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-6168960), 7956480, (-142049825));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test23311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23311");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory(".prefs/");
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setdepth(8388863);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test23312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23312");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        int int13 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("00ff0000");
        int int18 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        org.junit.Assert.assertNull(lwjgl3DisplayMode10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 640 + "'", int18 == 640);
    }

    @Test
    public void test23313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23313");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        int int11 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-52344);
        lwjgl3ApplicationConfiguration0.setwindowY((-434372608));
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-6168960));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test23314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23314");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(8925);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int12 = lwjgl3ApplicationConfiguration11.getwindowX();
        lwjgl3ApplicationConfiguration11.windowHeight = 16714230;
        boolean boolean15 = lwjgl3ApplicationConfiguration11.disableAudio;
        int int16 = lwjgl3ApplicationConfiguration11.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
    }

    @Test
    public void test23315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23315");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.graphics.Color color4 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int5 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.stencil = 10;
        int int9 = lwjgl3ApplicationConfiguration6.depth;
        lwjgl3ApplicationConfiguration6.windowX = (short) 100;
        lwjgl3ApplicationConfiguration6.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration6.getpreferencesFileType();
        int int16 = lwjgl3ApplicationConfiguration6.getwindowY();
        lwjgl3ApplicationConfiguration6.samples = 512;
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.CHARTREUSE;
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color color21 = color19.clamp();
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color19);
        boolean boolean23 = lwjgl3ApplicationConfiguration6.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.windowMaxHeight = (byte) -1;
        lwjgl3ApplicationConfiguration24.setwindowResizable(false);
        lwjgl3ApplicationConfiguration24.windowHeight = 765;
        boolean boolean31 = lwjgl3ApplicationConfiguration24.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration32);
        lwjgl3ApplicationConfiguration33.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.setWindowedMode(553246727, 55001);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration33);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23316");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.windowHeight = 765;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        int int8 = lwjgl3ApplicationConfiguration0.getwindowY();
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.title;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test23317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23317");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setdepth(16738740);
        lwjgl3ApplicationConfiguration0.windowHeight = (-21376768);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        int int20 = lwjgl3ApplicationConfiguration17.b;
        boolean boolean21 = lwjgl3ApplicationConfiguration17.vSyncEnabled;
        lwjgl3ApplicationConfiguration17.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType24 = lwjgl3ApplicationConfiguration17.getpreferencesFileType();
        lwjgl3ApplicationConfiguration17.setwindowWidth(537535241);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration28);
        lwjgl3ApplicationConfiguration29.setWindowPosition((int) (short) 10, 10);
        boolean boolean33 = lwjgl3ApplicationConfiguration29.useGL30;
        com.badlogic.gdx.Files.FileType fileType34 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration29.setpreferencesFileType(fileType34);
        com.badlogic.gdx.Files.FileType fileType36 = lwjgl3ApplicationConfiguration29.getpreferencesFileType();
        lwjgl3ApplicationConfiguration17.setPreferencesConfig("00b48cff", fileType36);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("47ff40ff", fileType36);
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-19712);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + fileType24 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType24.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + fileType34 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType34.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType36 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType36.equals(com.badlogic.gdx.Files.FileType.Internal));
    }

    @Test
    public void test23318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23318");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 267782144, (float) 16711935, (float) 10, (float) 10L);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color11 = color5.lerp((float) (-59089), (-7.686287E37f), (float) 2135687168, (float) 215, (float) 2088192);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test23319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23319");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        boolean boolean10 = lwjgl3ApplicationConfiguration1.getwindowDecorated();
        int int11 = lwjgl3ApplicationConfiguration1.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration1.setBackBufferConfig((-72375429), 63488, (-2416640), 41418752, 64272, 0, (-23808));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test23320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23320");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(480);
        int int9 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        int int12 = lwjgl3ApplicationConfiguration0.samples;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23321");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int6 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.setWindowedMode(40664886, 3309388);
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.windowWidth = 537535241;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test23322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23322");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration7.setgles30ContextMinorVersion(8);
        int int10 = lwjgl3ApplicationConfiguration7.windowMinHeight;
        lwjgl3ApplicationConfiguration7.windowMaxHeight = (-2147413088);
        lwjgl3ApplicationConfiguration7.depth = 514080;
        int int15 = lwjgl3ApplicationConfiguration7.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration7.setBackBufferConfig(285212672, (-48896), (-107), 1090519033, (-560496655), (int) 'a', (-810483712));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test23323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23323");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int49 = lwjgl3ApplicationConfiguration48.windowMaxHeight;
        int int50 = lwjgl3ApplicationConfiguration48.samples;
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
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test23324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23324");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int17 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        boolean boolean20 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener21;
        lwjgl3ApplicationConfiguration0.setwindowWidth(372608);
        lwjgl3ApplicationConfiguration0.a = (-38836256);
        lwjgl3ApplicationConfiguration0.depth = (-622910848);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test23325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23325");
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
        lwjgl3ApplicationConfiguration0.depth = 15215850;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test23326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23326");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color2 = color1.clamp();
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((float) (short) -1, (float) (-40036), 0.98039216f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color8 = color1.add(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        java.lang.String str10 = color9.toString();
        com.badlogic.gdx.graphics.Color color11 = color9.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color9);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0000faff" + "'", str10, "0000faff");
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test23327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23327");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(2014);
    }

    @Test
    public void test23328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23328");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        int int7 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (-117620736);
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
    }

    @Test
    public void test23329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23329");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        float float6 = color4.toFloatBits();
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((float) 480, (float) (-16777216), (float) (-4089), (float) (-16711681));
        java.lang.String str13 = color12.toString();
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color15 = color4.sub(color12);
        int int16 = color15.toIntBits();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ff000000" + "'", str13, "ff000000");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test23330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23330");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration19.setwindowMinWidth(0);
        int int22 = lwjgl3ApplicationConfiguration19.windowMinWidth;
        lwjgl3ApplicationConfiguration19.setWindowSizeLimits(28901, (-9728477), (-288146049), (int) (short) 100);
        int int28 = lwjgl3ApplicationConfiguration19.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test23331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23331");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (byte) 10;
        lwjgl3ApplicationConfiguration0.setTitle("0083ff00");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        int int19 = lwjgl3ApplicationConfiguration16.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration16.hdpiMode = hdpiMode20;
        lwjgl3ApplicationConfiguration16.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = null;
        lwjgl3ApplicationConfiguration16.hdpiMode = hdpiMode24;
        boolean boolean26 = lwjgl3ApplicationConfiguration16.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode27 = null;
        lwjgl3ApplicationConfiguration16.fullscreenMode = lwjgl3DisplayMode27;
        lwjgl3ApplicationConfiguration16.setWindowPosition((int) (byte) 0, 130029600);
        com.badlogic.gdx.Files.FileType fileType33 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("d2b48cff", fileType33);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType33;
        int int36 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-69737088));
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 1140850688;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + fileType33 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType33.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 16 + "'", int36 == 16);
    }

    @Test
    public void test23332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23332");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color6 = color0.lerp((float) (byte) 10, (float) 1465382614, (float) 40664886, (float) (-1L), (float) (-2147413088));
        int int7 = com.badlogic.gdx.graphics.Color.rgb565(color6);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color11, 16);
        color11.a = 0L;
        com.badlogic.gdx.graphics.Color color16 = color9.mul(color11);
        com.badlogic.gdx.graphics.Color color21 = color9.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color9, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color25 = color6.lerp(color9, (float) (-129024));
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color((float) 267782144, (float) '4', (float) 1677721600, (float) 512);
        com.badlogic.gdx.graphics.Color color31 = color9.add(color30);
        com.badlogic.gdx.graphics.Color color32 = color9.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color34 = color9.mul((float) 7);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color34);
    }

    @Test
    public void test23333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23333");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-21376768), (float) (-192), (float) (-2130706432), (-5.848603E37f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-6.4052174E37f) + "'", float4 == (-6.4052174E37f));
    }

    @Test
    public void test23334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23334");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType9;
        lwjgl3ApplicationConfiguration1.windowDecorated = true;
        lwjgl3ApplicationConfiguration1.setdepth(64274);
        lwjgl3ApplicationConfiguration1.setResizable(false);
        int int17 = lwjgl3ApplicationConfiguration1.getwindowY();
        lwjgl3ApplicationConfiguration1.setwindowY(2457600);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 765 + "'", int17 == 765);
    }

    @Test
    public void test23335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23335");
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
        com.badlogic.gdx.graphics.Color color28 = color23.mul(1.0f, (float) 43371, (float) (-4089), (-1.7014117E38f));
        com.badlogic.gdx.graphics.Color color30 = color23.set((int) (short) 1);
        com.badlogic.gdx.graphics.Color color35 = color30.add((float) (-2105736960), (-1.1841958E21f), (float) 43371, (float) (-116));
        color35.b = (-7798785);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color35, 16777087);
        float float40 = color35.g;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
    }

    @Test
    public void test23336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23336");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        java.lang.String str41 = lwjgl3ApplicationConfiguration1.title;
        int int42 = lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion;
        int int43 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        boolean boolean45 = lwjgl3ApplicationConfiguration44.getwindowDecorated();
        lwjgl3ApplicationConfiguration44.setResizable(true);
        lwjgl3ApplicationConfiguration44.setTitle("00ff0000");
        java.lang.String str50 = lwjgl3ApplicationConfiguration44.preferencesDirectory;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + ".prefs/" + "'", str50, ".prefs/");
    }

    @Test
    public void test23337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23337");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1465382614, (int) ' ');
        int int18 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test23338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23338");
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
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 634911;
        int int25 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test23339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23339");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
    }

    @Test
    public void test23340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23340");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(8);
        color1.g = (-1077952513);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.windowMaxHeight = (byte) -1;
        boolean boolean8 = lwjgl3ApplicationConfiguration5.disableAudio;
        lwjgl3ApplicationConfiguration5.audioDeviceBufferCount = 0;
        lwjgl3ApplicationConfiguration5.preferencesDirectory = "00000000";
        boolean boolean13 = color1.equals((java.lang.Object) "00000000");
        com.badlogic.gdx.graphics.Color color18 = color1.add((-1.6619504E38f), (-7.948861E37f), (float) (-16973056), (float) (-1074216555));
        color18.g = (-536870912);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test23341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23341");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        int int5 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setResizable(false);
        lwjgl3ApplicationConfiguration1.setdepth(0);
        lwjgl3ApplicationConfiguration1.setgles30ContextMajorVersion((-10223606));
        lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources = (-76353280);
        lwjgl3ApplicationConfiguration1.setTitle("827d0100");
        int int16 = lwjgl3ApplicationConfiguration1.samples;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test23342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23342");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (-256);
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration1.initialBackgroundColor;
        int int10 = lwjgl3ApplicationConfiguration1.windowHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int20 = lwjgl3ApplicationConfiguration11.gles30ContextMajorVersion;
        int int21 = lwjgl3ApplicationConfiguration11.getgles30ContextMajorVersion();
        int int22 = lwjgl3ApplicationConfiguration11.getsamples();
        com.badlogic.gdx.graphics.Color color23 = lwjgl3ApplicationConfiguration11.initialBackgroundColor;
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration1.disableAudio = true;
        int int27 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test23343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23343");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2147482368));
        int int2 = com.badlogic.gdx.graphics.Color.rgb888(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8388613 + "'", int2 == 8388613);
    }

    @Test
    public void test23344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23344");
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
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color45, 16);
        color45.a = 0L;
        com.badlogic.gdx.graphics.Color color50 = color43.mul(color45);
        com.badlogic.gdx.graphics.Color color55 = color43.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color color57 = color43.set((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color43;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener59 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.Files.FileType fileType60 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.graphics.Color color61 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.g = 8616705;
        lwjgl3ApplicationConfiguration0.windowWidth = (-116);
        lwjgl3ApplicationConfiguration0.title = "";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNull(lwjgl3WindowListener59);
        org.junit.Assert.assertTrue("'" + fileType60 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType60.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color61);
    }

    @Test
    public void test23345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23345");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-2147413088);
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color16 = color11.set((float) 65295, (float) (-10224128), 0.0f, (float) (-256));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color16, (-1677068797));
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test23346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23346");
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
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(1);
        int int27 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setdepth(1671172080);
        int int30 = lwjgl3ApplicationConfiguration0.samples;
        int int31 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.windowMinWidth = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 765 + "'", int27 == 765);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test23347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23347");
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
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color19, (int) 'a');
        float float23 = color19.r;
        com.badlogic.gdx.graphics.Color color24 = color19.clamp();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration25);
        lwjgl3ApplicationConfiguration26.setvSyncEnabled(false);
        boolean boolean29 = lwjgl3ApplicationConfiguration26.getuseGL30();
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color33, 16);
        color33.a = 0L;
        com.badlogic.gdx.graphics.Color color38 = color31.mul(color33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration39.stencil = 10;
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration39.initialBackgroundColor = color43;
        int int45 = com.badlogic.gdx.graphics.Color.rgb888(color43);
        boolean boolean47 = color43.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration48.stencil = 10;
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration48.initialBackgroundColor = color52;
        com.badlogic.gdx.graphics.Color color58 = color52.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color59 = color43.mul(color58);
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color(color58);
        com.badlogic.gdx.graphics.Color color61 = color33.set(color60);
        lwjgl3ApplicationConfiguration26.setInitialBackgroundColor(color61);
        lwjgl3ApplicationConfiguration26.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration65.stencil = 10;
        com.badlogic.gdx.graphics.Color color69 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration65.initialBackgroundColor = color69;
        int int71 = com.badlogic.gdx.graphics.Color.rgb888(color69);
        boolean boolean73 = color69.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration74.stencil = 10;
        com.badlogic.gdx.graphics.Color color78 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration74.initialBackgroundColor = color78;
        com.badlogic.gdx.graphics.Color color84 = color78.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color85 = color69.mul(color84);
        com.badlogic.gdx.graphics.Color color86 = color84.premultiplyAlpha();
        float float87 = color84.b;
        float float88 = color84.toFloatBits();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color84, (-8257792));
        lwjgl3ApplicationConfiguration26.initialBackgroundColor = color84;
        com.badlogic.gdx.graphics.Color color92 = color24.sub(color84);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color92, 63151);
        com.badlogic.gdx.graphics.Color color95 = color92.cpy();
        com.badlogic.gdx.graphics.Color color96 = new com.badlogic.gdx.graphics.Color(color92);
        float float97 = color92.a;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(color84);
        org.junit.Assert.assertNotNull(color85);
        org.junit.Assert.assertNotNull(color86);
        org.junit.Assert.assertTrue("'" + float87 + "' != '" + 0.0f + "'", float87 == 0.0f);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + 0.0f + "'", float88 == 0.0f);
        org.junit.Assert.assertNotNull(color92);
        org.junit.Assert.assertNotNull(color95);
        org.junit.Assert.assertTrue("'" + float97 + "' != '" + 0.06666667f + "'", float97 == 0.06666667f);
    }

    @Test
    public void test23348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23348");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        int int5 = lwjgl3ApplicationConfiguration1.samples;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SALMON;
        float float7 = color6.r;
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color6;
        lwjgl3ApplicationConfiguration1.a = 509920;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion(874470038);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
// flaky:         org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test23349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23349");
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
        float float27 = color23.b;
        com.badlogic.gdx.graphics.Color color32 = color23.add((-7.6098303E37f), (-1.0632526E37f), (float) (-810483712), (float) 16253056);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color26);
// flaky:         org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNotNull(color32);
    }

    @Test
    public void test23350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23350");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        int int6 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, 8925);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color0);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-16711936) + "'", int6 == (-16711936));
    }

    @Test
    public void test23351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23351");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int5 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.windowMinHeight = 579543807;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test23352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23352");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-654724064));
        float float2 = color1.b;
        int int3 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        com.badlogic.gdx.graphics.Color color4 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        float float6 = color5.g;
        java.lang.String str7 = color5.toString();
        com.badlogic.gdx.graphics.Color color8 = color5.clamp();
        com.badlogic.gdx.graphics.Color color9 = color1.set(color8);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.7058824f + "'", float2 == 0.7058824f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-654724064) + "'", int3 == (-654724064));
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0000005c" + "'", str7, "0000005c");
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test23353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23353");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 60160, 3.57E-43f, (float) (-33554397), (float) 1507799040);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test23354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23354");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration2.windowMaxHeight = (-16580607);
        int int5 = lwjgl3ApplicationConfiguration2.r;
        lwjgl3ApplicationConfiguration2.setWindowedMode((-4089), (-10224128));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
    }

    @Test
    public void test23355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23355");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        lwjgl3ApplicationConfiguration0.setdepth(786400);
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int11 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        int int12 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test23356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23356");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        int int16 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 480 + "'", int16 == 480);
    }

    @Test
    public void test23357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23357");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.setgles30ContextMajorVersion((-503341578));
        int int10 = lwjgl3ApplicationConfiguration1.getwindowX();
        lwjgl3ApplicationConfiguration1.r = 1465382614;
        boolean boolean13 = lwjgl3ApplicationConfiguration1.windowDecorated;
        int int14 = lwjgl3ApplicationConfiguration1.g;
        lwjgl3ApplicationConfiguration1.preferencesDirectory = "ff00e6ff";
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test23358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23358");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration16.windowMinWidth = 63151;
        lwjgl3ApplicationConfiguration16.stencil = 536867136;
        lwjgl3ApplicationConfiguration16.setTitle("9c663200");
        lwjgl3ApplicationConfiguration16.setAudioConfig(1020460416, 0, 1310975);
        int int27 = lwjgl3ApplicationConfiguration16.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration16.gles30ContextMajorVersion = (-150339737);
        int int30 = lwjgl3ApplicationConfiguration16.depth;
        boolean boolean31 = lwjgl3ApplicationConfiguration16.vSyncEnabled;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16 + "'", int30 == 16);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test23359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23359");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        lwjgl3ApplicationConfiguration0.setsamples(1677721600);
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color11 = color10.clamp();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test23360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23360");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-218136491), (float) (-1827840), (float) (-1442906112), (float) 36578);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-460434658) + "'", int4 == (-460434658));
    }

    @Test
    public void test23361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23361");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        lwjgl3ApplicationConfiguration1.windowY = (short) 1;
        int int8 = lwjgl3ApplicationConfiguration1.getgles30ContextMajorVersion();
        int int9 = lwjgl3ApplicationConfiguration1.getwindowHeight();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
    }

    @Test
    public void test23362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23362");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration1.a;
        int int9 = lwjgl3ApplicationConfiguration1.getaudioDeviceSimultaneousSources();
        int int10 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration1.setwindowHeight(8);
        lwjgl3ApplicationConfiguration1.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.stencil = 10;
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color19;
        lwjgl3ApplicationConfiguration15.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color23;
        boolean boolean25 = lwjgl3ApplicationConfiguration15.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        lwjgl3ApplicationConfiguration15.setResizable(true);
        java.lang.String str29 = lwjgl3ApplicationConfiguration15.title;
        int int30 = lwjgl3ApplicationConfiguration15.g;
        int int31 = lwjgl3ApplicationConfiguration15.getaudioDeviceBufferSize();
        int int32 = lwjgl3ApplicationConfiguration15.getaudioDeviceBufferSize();
        java.lang.String str33 = lwjgl3ApplicationConfiguration15.preferencesDirectory;
        int int34 = lwjgl3ApplicationConfiguration15.windowWidth;
        boolean boolean35 = lwjgl3ApplicationConfiguration15.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = lwjgl3ApplicationConfiguration15.hdpiMode;
        lwjgl3ApplicationConfiguration1.hdpiMode = hdpiMode36;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 512 + "'", int32 == 512);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ".prefs/" + "'", str33, ".prefs/");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 640 + "'", int34 == 640);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23363");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(1519722240);
    }

    @Test
    public void test23364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23364");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        int int8 = lwjgl3ApplicationConfiguration0.getwindowX();
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int13 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 480 + "'", int13 == 480);
    }

    @Test
    public void test23365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23365");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888(2.2786278E-38f, (float) (-1864926), (float) (-2880), (float) (-858996736));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-152354816) + "'", int4 == (-152354816));
    }

    @Test
    public void test23366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23366");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.depth = (byte) 100;
        lwjgl3ApplicationConfiguration1.preferencesDirectory = ".prefs/";
        int int14 = lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion;
        int int15 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferSize();
        int int16 = lwjgl3ApplicationConfiguration1.windowY;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((float) (-255), (float) 6349110, (float) 1677721600, (float) 512);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color21, 267782144);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.stencil = 10;
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration24.initialBackgroundColor = color28;
        int int30 = com.badlogic.gdx.graphics.Color.rgb888(color28);
        boolean boolean32 = color28.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.stencil = 10;
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration33.initialBackgroundColor = color37;
        com.badlogic.gdx.graphics.Color color43 = color37.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color44 = color28.mul(color43);
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color(color28);
        float float46 = color45.a;
        float float47 = color45.g;
        com.badlogic.gdx.graphics.Color color49 = color21.lerp(color45, (float) (-541344));
        com.badlogic.gdx.graphics.Color color50 = color45.clamp();
        com.badlogic.gdx.graphics.Color color51 = color50.clamp();
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color51);
        color51.r = 0.0f;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.0f + "'", float46 == 0.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color51);
    }

    @Test
    public void test23367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23367");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color4.lerp(color12, (float) 100L);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        com.badlogic.gdx.graphics.Color color20 = color14.mul(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color14);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test23368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23368");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int13 = lwjgl3ApplicationConfiguration0.windowY;
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.setsamples((-208));
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        int int21 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
    }

    @Test
    public void test23369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23369");
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
        lwjgl3ApplicationConfiguration0.depth = (-80712576);
        boolean boolean18 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23370");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = lwjgl3ApplicationConfiguration1.windowListener;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration1.preferencesFileType;
        int int7 = lwjgl3ApplicationConfiguration1.windowMinWidth;
        lwjgl3ApplicationConfiguration1.r = (-109670400);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(lwjgl3WindowListener5);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test23371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23371");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener63 = lwjgl3ApplicationConfiguration1.windowListener;
        int int64 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        lwjgl3ApplicationConfiguration1.windowMinWidth = 252;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration67 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration67.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration67.setwindowResizable(false);
        lwjgl3ApplicationConfiguration67.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration67.gles30ContextMajorVersion = 0;
        int int82 = lwjgl3ApplicationConfiguration67.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration83 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration67);
        int int84 = lwjgl3ApplicationConfiguration67.depth;
        int int85 = lwjgl3ApplicationConfiguration67.getaudioDeviceBufferSize();
        com.badlogic.gdx.Files.FileType fileType86 = lwjgl3ApplicationConfiguration67.getpreferencesFileType();
        int int87 = lwjgl3ApplicationConfiguration67.windowY;
        com.badlogic.gdx.Files.FileType fileType88 = lwjgl3ApplicationConfiguration67.getpreferencesFileType();
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType88;
        int int90 = lwjgl3ApplicationConfiguration1.getdepth();
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
        org.junit.Assert.assertNull(lwjgl3WindowListener63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 640 + "'", int64 == 640);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 512 + "'", int85 == 512);
        org.junit.Assert.assertTrue("'" + fileType86 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType86.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + fileType88 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType88.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 16 + "'", int90 == 16);
    }

    @Test
    public void test23372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23372");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration7.setaudioDeviceBufferCount((int) (short) 0);
        lwjgl3ApplicationConfiguration7.audioDeviceSimultaneousSources = 534839040;
        boolean boolean13 = lwjgl3ApplicationConfiguration7.getwindowResizable();
        lwjgl3ApplicationConfiguration7.windowDecorated = true;
        lwjgl3ApplicationConfiguration7.setgles30ContextMajorVersion((-1478332187));
        lwjgl3ApplicationConfiguration7.useGL30 = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test23373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23373");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1775677440, (float) (-234887936), (float) 2088960, (-1.697907E38f));
    }

    @Test
    public void test23374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23374");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 18005600, (float) 1928432384, (float) (-1476446208), (float) 2);
    }

    @Test
    public void test23375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23375");
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
        java.lang.String str23 = color21.toString();
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color24, (-4466532));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.stencil = 10;
        lwjgl3ApplicationConfiguration27.setwindowX((int) (short) 0);
        int int32 = lwjgl3ApplicationConfiguration27.getaudioDeviceBufferSize();
        int int33 = lwjgl3ApplicationConfiguration27.windowHeight;
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color((float) (-208), (float) (-8257792), (float) 586415136, (float) 7680);
        com.badlogic.gdx.graphics.Color color39 = color38.clamp();
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color38);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color38);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color38);
        com.badlogic.gdx.graphics.Color color43 = color24.mul(color38);
        com.badlogic.gdx.graphics.Color color45 = color38.set(8925);
        color38.b = (-292614145);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00000000" + "'", str23, "00000000");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 512 + "'", int32 == 512);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 480 + "'", int33 == 480);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color45);
    }

    @Test
    public void test23376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23376");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.b = 512;
        com.badlogic.gdx.Files.FileType fileType20 = com.badlogic.gdx.Files.FileType.Classpath;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("d2b48cff", fileType20);
        lwjgl3ApplicationConfiguration0.g = 862994742;
        int int24 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.Files.FileType fileType25 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration26.r = (-65281);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.Classpath + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.Classpath));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.Classpath + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.Classpath));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
    }

    @Test
    public void test23377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23377");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        int int8 = lwjgl3ApplicationConfiguration1.depth;
        lwjgl3ApplicationConfiguration1.windowWidth = (byte) 1;
        lwjgl3ApplicationConfiguration1.setsamples(0);
        int int13 = lwjgl3ApplicationConfiguration1.windowWidth;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test23378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23378");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("88ff0000");
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test23379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23379");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-2013790208), (-1.4887191E38f), (float) (-2147483104), (float) (-1647337440));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
    }

    @Test
    public void test23380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23380");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setwindowWidth((-40036));
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-62876);
        lwjgl3ApplicationConfiguration0.b = (-654724064);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        int int19 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test23381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23381");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.stencil = 10;
        int int10 = lwjgl3ApplicationConfiguration7.depth;
        int int11 = lwjgl3ApplicationConfiguration7.stencil;
        int int12 = lwjgl3ApplicationConfiguration7.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration7.setHdpiMode(hdpiMode13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration7.hdpiMode = hdpiMode15;
        lwjgl3ApplicationConfiguration1.setHdpiMode(hdpiMode15);
        lwjgl3ApplicationConfiguration1.windowDecorated = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode20 = lwjgl3ApplicationConfiguration1.fullscreenMode;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNull(lwjgl3DisplayMode20);
    }

    @Test
    public void test23382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23382");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int6 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.windowY;
        boolean boolean11 = lwjgl3ApplicationConfiguration9.windowDecorated;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test23383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23383");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-10224128), (-658939904), (-25680), 65407);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-786944) + "'", int4 == (-786944));
    }

    @Test
    public void test23384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23384");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.r = 130029600;
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode9);
        int int11 = lwjgl3ApplicationConfiguration1.b;
        int int12 = lwjgl3ApplicationConfiguration1.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test23385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23385");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 0);
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
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color27);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int32 = lwjgl3ApplicationConfiguration31.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration31);
        boolean boolean34 = color30.equals((java.lang.Object) lwjgl3ApplicationConfiguration31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration31.setFullscreenMode(displayMode35);
        com.badlogic.gdx.Files.FileType fileType37 = lwjgl3ApplicationConfiguration31.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00ffff00", fileType37);
        int int39 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.b = (-2132469248);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 512 + "'", int32 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + fileType37 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType37.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 16 + "'", int39 == 16);
    }

    @Test
    public void test23386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23386");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(65533, (-1804247040), 64799, 624);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-5.316911E36f) + "'", float4 == (-5.316911E36f));
    }

    @Test
    public void test23387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23387");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.b = (-1077952513);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-208);
        int int14 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        java.lang.String str17 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23388");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration2.windowMaxHeight = (-16580607);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.stencil = 10;
        int int8 = lwjgl3ApplicationConfiguration5.b;
        boolean boolean9 = lwjgl3ApplicationConfiguration5.vSyncEnabled;
        lwjgl3ApplicationConfiguration5.setuseGL30(false);
        int int12 = lwjgl3ApplicationConfiguration5.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration2.hdpiMode = hdpiMode13;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        int int19 = lwjgl3ApplicationConfiguration16.b;
        boolean boolean20 = lwjgl3ApplicationConfiguration16.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType21 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType21);
        int int23 = lwjgl3ApplicationConfiguration16.depth;
        lwjgl3ApplicationConfiguration16.windowMaxHeight = (short) 10;
        int int26 = lwjgl3ApplicationConfiguration16.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.stencil = 10;
        int int30 = lwjgl3ApplicationConfiguration27.b;
        boolean boolean31 = lwjgl3ApplicationConfiguration27.vSyncEnabled;
        lwjgl3ApplicationConfiguration27.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType34 = lwjgl3ApplicationConfiguration27.getpreferencesFileType();
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration36.stencil = 10;
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration36.initialBackgroundColor = color40;
        int int42 = com.badlogic.gdx.graphics.Color.rgb888(color40);
        boolean boolean44 = color40.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration45.stencil = 10;
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration45.initialBackgroundColor = color49;
        com.badlogic.gdx.graphics.Color color55 = color49.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color56 = color40.mul(color55);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color55, (int) 'a');
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color55);
        float float60 = color55.a;
        lwjgl3ApplicationConfiguration2.setInitialBackgroundColor(color55);
        boolean boolean62 = lwjgl3ApplicationConfiguration2.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + fileType21 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType21.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + fileType34 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType34.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.06666667f + "'", float60 == 0.06666667f);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test23389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23389");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode7 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        boolean boolean10 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(lwjgl3DisplayMode7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test23390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23390");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color11, 16);
        float float14 = color11.g;
        int int15 = com.badlogic.gdx.graphics.Color.rgba8888(color11);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color11);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color16;
        boolean boolean18 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.title = "0083ff00";
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 862994742, 0);
        boolean boolean25 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setAudioConfig(65339, (-1972440832), (-1328611328));
        boolean boolean30 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33791 + "'", int15 == 33791);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test23391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23391");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(16711680);
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        int int3 = color1.toIntBits();
        com.badlogic.gdx.graphics.Color color4 = color1.cpy();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color1, (-269418496));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65280 + "'", int2 == 65280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65280 + "'", int3 == 65280);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test23392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23392");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-1077936368));
        int int6 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "827d0100";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1077936368) + "'", int6 == (-1077936368));
    }

    @Test
    public void test23393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23393");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color2 = color1.clamp();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration3.stencil = 10;
        int int6 = lwjgl3ApplicationConfiguration3.depth;
        int int7 = lwjgl3ApplicationConfiguration3.stencil;
        lwjgl3ApplicationConfiguration3.gles30ContextMajorVersion = (-16580607);
        boolean boolean10 = lwjgl3ApplicationConfiguration3.disableAudio;
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration3.initialBackgroundColor;
        color11.g = (-1.7013599E38f);
        com.badlogic.gdx.graphics.Color color18 = color11.add((float) 40664886, (float) 1621098495, (float) 0L, (float) (-864551100));
        com.badlogic.gdx.graphics.Color color23 = color11.mul((-1.7013599E38f), (-1.1841958E21f), (float) 480, (float) 514080);
        com.badlogic.gdx.graphics.Color color24 = color1.sub(color23);
        com.badlogic.gdx.graphics.Color color29 = color23.mul((float) (-2089026813), (float) (-164075620), (float) (-2147099648), (float) 2147483647);
        int int30 = color29.toIntBits();
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color29);
        int int32 = com.badlogic.gdx.graphics.Color.rgba4444(color29);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.valueOf("00ffffff");
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(0.0f, (-5.435091E37f), (float) (-266942944), (float) (-1778519256));
        com.badlogic.gdx.graphics.Color color41 = com.badlogic.gdx.graphics.Color.GRAY;
        float float42 = color41.toFloatBits();
        com.badlogic.gdx.graphics.Color color43 = color40.add(color41);
        com.badlogic.gdx.graphics.Color color45 = color35.lerp(color41, 6.336457E-39f);
        com.badlogic.gdx.graphics.Color color46 = color33.mul(color41);
        com.badlogic.gdx.graphics.Color color48 = color33.mul(0.0f);
        color33.b = 0.0f;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-4.2535296E37f) + "'", float42 == (-4.2535296E37f));
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color48);
    }

    @Test
    public void test23394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23394");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 267782144, (float) (-16711681), (-1.6988936E38f));
        com.badlogic.gdx.graphics.Color color9 = color4.sub((float) 537535241, (float) 34816, (float) (-267452160), (float) (-66978332));
        float float10 = color4.a;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color4, 0);
        int int13 = color4.toIntBits();
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test23395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23395");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = color0.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color12 = color0.set((float) (-234887936), (float) 63136, (float) 301989649, 9.1655E-41f);
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
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color32, (int) 'a');
        color32.r = 0.0f;
        com.badlogic.gdx.graphics.Color color42 = color32.add((float) (-15514229), (float) 14417949, (float) 514080, (float) 862994742);
        int int43 = com.badlogic.gdx.graphics.Color.argb8888(color42);
        float float44 = color42.b;
        com.badlogic.gdx.graphics.Color color45 = color0.set(color42);
        float float46 = color0.r;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-16711681) + "'", int43 == (-16711681));
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.0f + "'", float46 == 0.0f);
    }

    @Test
    public void test23396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23396");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2147420160));
        com.badlogic.gdx.graphics.Color color3 = color1.set((-188));
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test23397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23397");
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
        int int19 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        boolean boolean20 = lwjgl3ApplicationConfiguration1.disableAudio;
        lwjgl3ApplicationConfiguration1.setWindowedMode((-427567), 61141);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(lwjgl3DisplayMode15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 640 + "'", int19 == 640);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23398");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-4227072));
    }

    @Test
    public void test23399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23399");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-16730996), (-6.643261E35f), (float) (-1041420), 4.6994E-41f);
    }

    @Test
    public void test23400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23400");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SLATE;
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration3.stencil = 10;
        int int6 = lwjgl3ApplicationConfiguration3.b;
        lwjgl3ApplicationConfiguration3.g = '#';
        lwjgl3ApplicationConfiguration3.setBackBufferConfig((int) ' ', (int) (byte) 1, (int) (short) 0, 16711680, (-10224128), (int) (byte) 100, 33791);
        boolean boolean17 = color2.equals((java.lang.Object) (byte) 100);
        com.badlogic.gdx.graphics.Color color18 = color0.sub(color2);
        color18.a = 41418752;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test23401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23401");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.setResizable(true);
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources(6528502);
        lwjgl3ApplicationConfiguration1.setuseGL30(false);
        lwjgl3ApplicationConfiguration1.setgles30ContextMajorVersion(0);
        java.lang.String str15 = lwjgl3ApplicationConfiguration1.preferencesDirectory;
        lwjgl3ApplicationConfiguration1.useOpenGL3(true, (-10223606), (-668991488));
        int int20 = lwjgl3ApplicationConfiguration1.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.stencil = 10;
        lwjgl3ApplicationConfiguration22.setwindowX((int) (short) 0);
        int int27 = lwjgl3ApplicationConfiguration22.getaudioDeviceBufferSize();
        int int28 = lwjgl3ApplicationConfiguration22.windowHeight;
        lwjgl3ApplicationConfiguration22.disableAudio = false;
        lwjgl3ApplicationConfiguration22.windowMinWidth = (-12);
        com.badlogic.gdx.Files.FileType fileType33 = lwjgl3ApplicationConfiguration22.getpreferencesFileType();
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("ffe5ff00", fileType33);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 480 + "'", int28 == 480);
        org.junit.Assert.assertTrue("'" + fileType33 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType33.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23402");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration7.setgles30ContextMinorVersion(8);
        int int10 = lwjgl3ApplicationConfiguration7.windowMinHeight;
        lwjgl3ApplicationConfiguration7.windowMaxHeight = (-2147413088);
        lwjgl3ApplicationConfiguration7.depth = 514080;
        int int15 = lwjgl3ApplicationConfiguration7.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration7.setaudioDeviceBufferCount(150929408);
        boolean boolean18 = lwjgl3ApplicationConfiguration7.windowResizable;
        java.lang.String str19 = lwjgl3ApplicationConfiguration7.getpreferencesDirectory();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".prefs/" + "'", str19, ".prefs/");
    }

    @Test
    public void test23403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23403");
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
        com.badlogic.gdx.graphics.Color color24 = color21.set(100);
        com.badlogic.gdx.graphics.Color color29 = color21.add((float) (byte) 100, (float) (short) 0, 0.0f, (-2.647102E-20f));
        float float30 = color29.g;
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color((float) '#', (float) (short) -1, (-4.319983E37f), 10.0f);
        com.badlogic.gdx.graphics.Color color40 = color35.add((-1.6947657E38f), (float) 9, (float) (-15), (float) (-16842496));
        com.badlogic.gdx.graphics.Color color41 = color29.set(color40);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color41, (-47940));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
    }

    @Test
    public void test23404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23404");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565(0.50196075f, (-1.7006102E38f), (float) 1090519295);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test23405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23405");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.setgles30ContextMajorVersion((-503341578));
        int int10 = lwjgl3ApplicationConfiguration1.getwindowX();
        lwjgl3ApplicationConfiguration1.r = 1465382614;
        boolean boolean13 = lwjgl3ApplicationConfiguration1.windowDecorated;
        int int14 = lwjgl3ApplicationConfiguration1.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        int int19 = lwjgl3ApplicationConfiguration16.depth;
        lwjgl3ApplicationConfiguration16.windowX = (short) 100;
        lwjgl3ApplicationConfiguration16.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        int int26 = lwjgl3ApplicationConfiguration25.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration25.useOpenGL3(true, (-100466688), (-62876));
        lwjgl3ApplicationConfiguration25.setpreferencesDirectory("00000000");
        int int33 = lwjgl3ApplicationConfiguration25.g;
        lwjgl3ApplicationConfiguration25.setdepth(401539072);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode36 = lwjgl3ApplicationConfiguration25.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration37.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration37.windowMaxHeight = (-2147413088);
        com.badlogic.gdx.graphics.Color color48 = lwjgl3ApplicationConfiguration37.initialBackgroundColor;
        int int49 = lwjgl3ApplicationConfiguration37.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType50 = lwjgl3ApplicationConfiguration37.getpreferencesFileType();
        lwjgl3ApplicationConfiguration25.preferencesFileType = fileType50;
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("ff00ff00", fileType50);
        int int53 = lwjgl3ApplicationConfiguration1.a;
        com.badlogic.gdx.Files.FileType fileType54 = lwjgl3ApplicationConfiguration1.getpreferencesFileType();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertNull(lwjgl3DisplayMode36);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + fileType50 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType50.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 8 + "'", int53 == 8);
        org.junit.Assert.assertTrue("'" + fileType54 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType54.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23406");
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
        lwjgl3ApplicationConfiguration0.windowX = 587202560;
        com.badlogic.gdx.graphics.Color color32 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
        org.junit.Assert.assertNotNull(color32);
    }

    @Test
    public void test23407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23407");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = 2016;
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration1.windowMaxHeight = 0;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
    }

    @Test
    public void test23408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23408");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 480, (float) 537535241, (float) 10, 1.96271E-40f);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color4, 224);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((float) 10, (float) (-2147483648), (float) 267782144, (-5.0593836E30f));
        com.badlogic.gdx.graphics.Color color13 = color4.lerp(color11, (float) (-2144));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        lwjgl3ApplicationConfiguration15.setWindowPosition((int) (short) 10, 10);
        boolean boolean19 = lwjgl3ApplicationConfiguration15.useGL30;
        com.badlogic.gdx.Files.FileType fileType20 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType20);
        int int22 = lwjgl3ApplicationConfiguration15.windowHeight;
        lwjgl3ApplicationConfiguration15.setWindowPosition((-503341578), 862994742);
        com.badlogic.gdx.Files.FileType fileType27 = com.badlogic.gdx.Files.FileType.Classpath;
        lwjgl3ApplicationConfiguration15.setPreferencesConfig("00ffff00", fileType27);
        lwjgl3ApplicationConfiguration15.setDecorated(false);
        boolean boolean31 = color4.equals((java.lang.Object) lwjgl3ApplicationConfiguration15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration32.stencil = 10;
        int int35 = lwjgl3ApplicationConfiguration32.depth;
        java.lang.String str36 = lwjgl3ApplicationConfiguration32.title;
        lwjgl3ApplicationConfiguration32.setpreferencesDirectory("hi!");
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color42, 16);
        color42.a = 0L;
        com.badlogic.gdx.graphics.Color color47 = color40.mul(color42);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(color42);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration49.stencil = 10;
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration49.initialBackgroundColor = color53;
        int int55 = com.badlogic.gdx.graphics.Color.rgb888(color53);
        boolean boolean57 = color53.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration58.stencil = 10;
        com.badlogic.gdx.graphics.Color color62 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration58.initialBackgroundColor = color62;
        com.badlogic.gdx.graphics.Color color68 = color62.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color69 = color53.mul(color68);
        com.badlogic.gdx.graphics.Color color70 = new com.badlogic.gdx.graphics.Color(color68);
        float float71 = color70.r;
        com.badlogic.gdx.graphics.Color color72 = color48.mul(color70);
        lwjgl3ApplicationConfiguration32.initialBackgroundColor = color70;
        int int74 = lwjgl3ApplicationConfiguration32.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration32.disableAudio = true;
        boolean boolean77 = lwjgl3ApplicationConfiguration32.getwindowDecorated();
        boolean boolean78 = color4.equals((java.lang.Object) lwjgl3ApplicationConfiguration32);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 480 + "'", int22 == 480);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.Classpath + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.Classpath));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 16 + "'", int35 == 16);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 1.0f + "'", float71 == 1.0f);
        org.junit.Assert.assertNotNull(color72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test23409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23409");
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
        int int22 = lwjgl3ApplicationConfiguration1.windowY;
        lwjgl3ApplicationConfiguration1.g = 5959695;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 61440 + "'", int22 == 61440);
    }

    @Test
    public void test23410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23410");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setTitle("");
        int int7 = lwjgl3ApplicationConfiguration1.windowMinHeight;
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion((-100466688));
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color10);
        float float12 = color10.toFloatBits();
        com.badlogic.gdx.graphics.Color color13 = color10.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        int int16 = lwjgl3ApplicationConfiguration15.samples;
        lwjgl3ApplicationConfiguration15.setwindowY(9);
        lwjgl3ApplicationConfiguration15.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration15.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int25 = lwjgl3ApplicationConfiguration24.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType27 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration24.setPreferencesConfig("", fileType27);
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType27);
        lwjgl3ApplicationConfiguration15.windowY = (byte) -1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color((float) 16, (float) 1465382614, (float) 9, (float) ' ');
        lwjgl3ApplicationConfiguration32.initialBackgroundColor = color37;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration39.stencil = 10;
        lwjgl3ApplicationConfiguration39.setwindowX((int) (short) 0);
        int int44 = lwjgl3ApplicationConfiguration39.getaudioDeviceBufferSize();
        int int45 = lwjgl3ApplicationConfiguration39.windowHeight;
        lwjgl3ApplicationConfiguration39.setaudioDeviceBufferSize(480);
        int int48 = lwjgl3ApplicationConfiguration39.getsamples();
        lwjgl3ApplicationConfiguration39.audioDeviceBufferSize = 0;
        int int51 = lwjgl3ApplicationConfiguration39.samples;
        int int52 = lwjgl3ApplicationConfiguration39.getwindowHeight();
        lwjgl3ApplicationConfiguration39.setsamples((-786496));
        boolean boolean55 = color37.equals((java.lang.Object) (-786496));
        color37.g = (-33280);
        com.badlogic.gdx.graphics.Color color58 = color13.add(color37);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(color10);
// flaky:         org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-4.1842102E-19f) + "'", float12 == (-4.1842102E-19f));
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration32);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 512 + "'", int44 == 512);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 480 + "'", int45 == 480);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 480 + "'", int52 == 480);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(color58);
    }

    @Test
    public void test23411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23411");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color3, 16);
        color3.a = 0L;
        com.badlogic.gdx.graphics.Color color8 = color1.mul(color3);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.stencil = 10;
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration10.initialBackgroundColor = color14;
        int int16 = com.badlogic.gdx.graphics.Color.rgb888(color14);
        boolean boolean18 = color14.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.stencil = 10;
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration19.initialBackgroundColor = color23;
        com.badlogic.gdx.graphics.Color color29 = color23.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color30 = color14.mul(color29);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color29);
        float float32 = color31.r;
        com.badlogic.gdx.graphics.Color color33 = color9.mul(color31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.stencil = 10;
        lwjgl3ApplicationConfiguration34.setwindowX((int) (short) 0);
        int int39 = lwjgl3ApplicationConfiguration34.getaudioDeviceBufferSize();
        int int40 = lwjgl3ApplicationConfiguration34.windowHeight;
        lwjgl3ApplicationConfiguration34.setaudioDeviceBufferSize(480);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.OLIVE;
        lwjgl3ApplicationConfiguration34.initialBackgroundColor = color43;
        float float45 = color43.toFloatBits();
        float float46 = color43.b;
        int int47 = com.badlogic.gdx.graphics.Color.argb8888(color43);
        com.badlogic.gdx.graphics.Color color48 = color31.add(color43);
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color((float) (byte) 100, (float) (-1948738560), 0.53333336f, (float) (-129024));
        com.badlogic.gdx.graphics.Color color54 = color53.cpy();
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color(color54);
        com.badlogic.gdx.graphics.Color color56 = color43.add(color55);
        com.badlogic.gdx.graphics.Color color61 = color55.sub((float) (-102387), (float) (-1677068797), (float) (-591104), (-1.7013967E38f));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 480 + "'", int40 == 480);
        org.junit.Assert.assertNotNull(color43);
// flaky:         org.junit.Assert.assertTrue("'" + float45 + "' != '" + (-9.039009E37f) + "'", float45 == (-9.039009E37f));
// flaky:         org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.53333336f + "'", float46 == 0.53333336f);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-65400) + "'", int47 == (-65400));
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color61);
    }

    @Test
    public void test23412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23412");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(1174394321);
        com.badlogic.gdx.graphics.Color color6 = color1.sub((float) (-2320), 0.39215687f, (-1.0407874E38f), (float) (-848128));
        com.badlogic.gdx.graphics.Color color7 = color1.clamp();
        float float8 = color1.g;
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.60784316f + "'", float8 == 0.60784316f);
    }

    @Test
    public void test23413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23413");
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
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int29 = lwjgl3ApplicationConfiguration20.gles30ContextMajorVersion;
        int int30 = lwjgl3ApplicationConfiguration20.getgles30ContextMajorVersion();
        int int31 = lwjgl3ApplicationConfiguration20.getsamples();
        lwjgl3ApplicationConfiguration20.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration20.r = 65280;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration37.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration37.setwindowResizable(false);
        lwjgl3ApplicationConfiguration37.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration37.gles30ContextMajorVersion = 0;
        int int52 = lwjgl3ApplicationConfiguration37.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration54.stencil = 10;
        int int57 = lwjgl3ApplicationConfiguration54.depth;
        lwjgl3ApplicationConfiguration54.windowX = (short) 100;
        lwjgl3ApplicationConfiguration54.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType63 = lwjgl3ApplicationConfiguration54.getpreferencesFileType();
        int int64 = lwjgl3ApplicationConfiguration54.getwindowY();
        lwjgl3ApplicationConfiguration54.samples = 512;
        com.badlogic.gdx.graphics.Color color67 = lwjgl3ApplicationConfiguration54.initialBackgroundColor;
        int int68 = lwjgl3ApplicationConfiguration54.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode69 = lwjgl3ApplicationConfiguration54.hdpiMode;
        lwjgl3ApplicationConfiguration53.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode69);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration73 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration36);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 16 + "'", int57 == 16);
        org.junit.Assert.assertTrue("'" + fileType63 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType63.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode69 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode69.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration73);
    }

    @Test
    public void test23414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23414");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((-157713664), 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        int int12 = lwjgl3ApplicationConfiguration9.depth;
        lwjgl3ApplicationConfiguration9.windowX = (short) 100;
        lwjgl3ApplicationConfiguration9.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType18 = lwjgl3ApplicationConfiguration9.getpreferencesFileType();
        int int19 = lwjgl3ApplicationConfiguration9.getwindowY();
        lwjgl3ApplicationConfiguration9.samples = 512;
        com.badlogic.gdx.graphics.Color color22 = lwjgl3ApplicationConfiguration9.initialBackgroundColor;
        lwjgl3ApplicationConfiguration9.setwindowResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration9);
        lwjgl3ApplicationConfiguration25.setwindowHeight(2016);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = lwjgl3ApplicationConfiguration25.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode28;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + fileType18 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType18.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + hdpiMode28 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode28.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23415");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        int int10 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test23416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23416");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setTitle("");
        lwjgl3ApplicationConfiguration1.setAudioConfig((-10223606), (int) (byte) 0, (-16711936));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration11.setWindowPosition((-7555886), 863980544);
        lwjgl3ApplicationConfiguration11.windowWidth = 765;
        lwjgl3ApplicationConfiguration11.setWindowSizeLimits((-100466688), (-11554560), (-2147418368), (-266942944));
        lwjgl3ApplicationConfiguration11.windowResizable = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test23417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23417");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration7.getwindowResizable();
        java.lang.Class<?> wildcardClass9 = lwjgl3ApplicationConfiguration7.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test23418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23418");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode7 = null;
        lwjgl3ApplicationConfiguration1.fullscreenMode = lwjgl3DisplayMode7;
        boolean boolean9 = lwjgl3ApplicationConfiguration1.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.stencil = 10;
        int int13 = lwjgl3ApplicationConfiguration10.depth;
        int int14 = lwjgl3ApplicationConfiguration10.stencil;
        lwjgl3ApplicationConfiguration10.gles30ContextMajorVersion = (-16580607);
        boolean boolean17 = lwjgl3ApplicationConfiguration10.disableAudio;
        com.badlogic.gdx.graphics.Color color18 = lwjgl3ApplicationConfiguration10.initialBackgroundColor;
        color18.r = (-256);
        com.badlogic.gdx.graphics.Color color21 = color18.cpy();
        com.badlogic.gdx.graphics.Color color23 = color18.set((-1047199744));
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((-1020));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test23419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23419");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.stencil = 10;
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration21.initialBackgroundColor = color25;
        lwjgl3ApplicationConfiguration21.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color29 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration21.initialBackgroundColor = color29;
        int int31 = lwjgl3ApplicationConfiguration21.getaudioDeviceBufferSize();
        java.lang.String str32 = lwjgl3ApplicationConfiguration21.title;
        boolean boolean33 = lwjgl3ApplicationConfiguration21.getdisableAudio();
        int int34 = lwjgl3ApplicationConfiguration21.windowX;
        lwjgl3ApplicationConfiguration21.setwindowY((int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration37.stencil = 10;
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration37.initialBackgroundColor = color41;
        lwjgl3ApplicationConfiguration37.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration37.initialBackgroundColor = color45;
        lwjgl3ApplicationConfiguration37.g = 16711680;
        int int49 = lwjgl3ApplicationConfiguration37.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration37.audioDeviceBufferSize = 0;
        int int52 = lwjgl3ApplicationConfiguration37.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int54 = lwjgl3ApplicationConfiguration53.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration53);
        lwjgl3ApplicationConfiguration55.windowMaxHeight = (-16580607);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration58.stencil = 10;
        int int61 = lwjgl3ApplicationConfiguration58.b;
        boolean boolean62 = lwjgl3ApplicationConfiguration58.vSyncEnabled;
        lwjgl3ApplicationConfiguration58.setuseGL30(false);
        int int65 = lwjgl3ApplicationConfiguration58.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode66 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration55.hdpiMode = hdpiMode66;
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration21.hdpiMode = hdpiMode66;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode66;
        lwjgl3ApplicationConfiguration0.setdepth(115683360);
        int int74 = lwjgl3ApplicationConfiguration0.g;
        int int75 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 512 + "'", int54 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration55);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 8 + "'", int61 == 8);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode66 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode66.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 8 + "'", int74 == 8);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1077936368) + "'", int75 == (-1077936368));
    }

    @Test
    public void test23420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23420");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.99215686f, (float) (-265216), (-1.5466959E26f), (float) (-30720));
    }

    @Test
    public void test23421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23421");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration51.stencil = 10;
        int int54 = lwjgl3ApplicationConfiguration51.b;
        boolean boolean55 = lwjgl3ApplicationConfiguration51.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType56 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration51.setpreferencesFileType(fileType56);
        int int58 = lwjgl3ApplicationConfiguration51.depth;
        lwjgl3ApplicationConfiguration51.windowX = 765;
        int int61 = lwjgl3ApplicationConfiguration51.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode62 = lwjgl3ApplicationConfiguration51.hdpiMode;
        java.lang.String str63 = lwjgl3ApplicationConfiguration51.getpreferencesDirectory();
        com.badlogic.gdx.graphics.Color color64 = lwjgl3ApplicationConfiguration51.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color66 = color64.set(16766720);
        com.badlogic.gdx.graphics.Color color67 = color50.set(color66);
        com.badlogic.gdx.graphics.Color color69 = color66.set(1677721600);
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 8 + "'", int54 == 8);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + fileType56 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType56.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 16 + "'", int58 == 16);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode62 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode62.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + ".prefs/" + "'", str63, ".prefs/");
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color66);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertNotNull(color69);
    }

    @Test
    public void test23422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23422");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.useGL30;
        java.lang.String str7 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-59244732));
        int int10 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test23423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23423");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        int int8 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        lwjgl3ApplicationConfiguration1.setwindowResizable(false);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((-5543167));
        float float13 = color12.a;
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color12);
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color12);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 640 + "'", int8 == 640);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.003921569f + "'", float13 == 0.003921569f);
    }

    @Test
    public void test23424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23424");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int6 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-1145544766);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-44188));
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int16 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test23425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23425");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-10223606), 16777215);
        lwjgl3ApplicationConfiguration0.windowX = 1900764;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffc62000";
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
    }

    @Test
    public void test23426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23426");
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
        int int19 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int20 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType17 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType17.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test23427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23427");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(100);
        int int2 = com.badlogic.gdx.graphics.Color.rgb565(color1);
        com.badlogic.gdx.graphics.Color color7 = color1.sub((float) 63518, (float) 863980544, (float) 8616705, (float) (-151165028));
        com.badlogic.gdx.graphics.Color color8 = color1.clamp();
        com.badlogic.gdx.graphics.Color color13 = color8.sub(1.251E-41f, (float) 65516, (float) (-164075620), (float) (-199756800));
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color16 = color15.clamp();
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((float) (short) -1, (float) (-40036), 0.98039216f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color22 = color15.add(color21);
        com.badlogic.gdx.graphics.Color color23 = color21.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color28 = color23.mul((float) 1610676736, (float) 150929588, (-7.948861E37f), (float) 252);
        com.badlogic.gdx.graphics.Color color33 = color23.set((float) 32767, 1.0215423E26f, 0.0f, (float) (-2140955648));
        com.badlogic.gdx.graphics.Color color34 = color33.cpy();
        int int35 = color34.toIntBits();
        com.badlogic.gdx.graphics.Color color36 = color13.mul(color34);
        float float37 = color13.g;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 65535 + "'", int35 == 65535);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
    }

    @Test
    public void test23428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23428");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-2800), (-1.694714E38f), (float) (-218136491), (-8.952473E30f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-172032000) + "'", int4 == (-172032000));
    }

    @Test
    public void test23429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23429");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = 765;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("00ffff00");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    }

    @Test
    public void test23430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23430");
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
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-65536);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 4063, 0);
        int int28 = lwjgl3ApplicationConfiguration0.b;
        int int29 = lwjgl3ApplicationConfiguration0.windowMinHeight;
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test23431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23431");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        lwjgl3ApplicationConfiguration13.setWindowPosition((int) (short) 10, 10);
        boolean boolean17 = lwjgl3ApplicationConfiguration13.useGL30;
        int int18 = lwjgl3ApplicationConfiguration13.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration13.windowWidth = (-16711681);
        int int21 = lwjgl3ApplicationConfiguration13.g;
        lwjgl3ApplicationConfiguration13.setaudioDeviceSimultaneousSources((-16711681));
        int int24 = lwjgl3ApplicationConfiguration13.getwindowMinWidth();
        lwjgl3ApplicationConfiguration13.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int28 = lwjgl3ApplicationConfiguration27.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = lwjgl3ApplicationConfiguration27.windowListener;
        int int31 = lwjgl3ApplicationConfiguration27.getsamples();
        com.badlogic.gdx.Files.FileType fileType32 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration27.preferencesFileType = fileType32;
        com.badlogic.gdx.Files.FileType fileType34 = lwjgl3ApplicationConfiguration27.getpreferencesFileType();
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration37);
        lwjgl3ApplicationConfiguration38.setvSyncEnabled(false);
        boolean boolean41 = lwjgl3ApplicationConfiguration38.getuseGL30();
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color45, 16);
        color45.a = 0L;
        com.badlogic.gdx.graphics.Color color50 = color43.mul(color45);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration51.stencil = 10;
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration51.initialBackgroundColor = color55;
        int int57 = com.badlogic.gdx.graphics.Color.rgb888(color55);
        boolean boolean59 = color55.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration60.stencil = 10;
        com.badlogic.gdx.graphics.Color color64 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration60.initialBackgroundColor = color64;
        com.badlogic.gdx.graphics.Color color70 = color64.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color71 = color55.mul(color70);
        com.badlogic.gdx.graphics.Color color72 = new com.badlogic.gdx.graphics.Color(color70);
        com.badlogic.gdx.graphics.Color color73 = color45.set(color72);
        lwjgl3ApplicationConfiguration38.setInitialBackgroundColor(color73);
        com.badlogic.gdx.graphics.Color color75 = color36.add(color73);
        com.badlogic.gdx.graphics.Color color80 = color73.mul((float) 640, (float) (-2147418368), (float) 100, (float) (-52344));
        com.badlogic.gdx.graphics.Color color81 = new com.badlogic.gdx.graphics.Color(color80);
        int int82 = com.badlogic.gdx.graphics.Color.rgba8888(color80);
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color80);
        int int84 = lwjgl3ApplicationConfiguration27.windowMaxHeight;
        lwjgl3ApplicationConfiguration27.windowDecorated = true;
        com.badlogic.gdx.Files.FileType fileType87 = lwjgl3ApplicationConfiguration27.preferencesFileType;
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType87);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("228b00ff", fileType87);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-99160321);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration29);
        org.junit.Assert.assertNull(lwjgl3WindowListener30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType34 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType34.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(color70);
        org.junit.Assert.assertNotNull(color71);
        org.junit.Assert.assertNotNull(color73);
        org.junit.Assert.assertNotNull(color75);
        org.junit.Assert.assertNotNull(color80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-16711936) + "'", int82 == (-16711936));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + fileType87 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType87.equals(com.badlogic.gdx.Files.FileType.Internal));
    }

    @Test
    public void test23432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23432");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int12 = lwjgl3ApplicationConfiguration0.samples;
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
    }

    @Test
    public void test23433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23433");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setWindowPosition(863980544, (-1));
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff00ff");
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
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color13);
        float float31 = color30.a;
        com.badlogic.gdx.graphics.Color color32 = color30.cpy();
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color30);
        int int34 = com.badlogic.gdx.graphics.Color.rgba4444(color33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration35.stencil = 10;
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration35.initialBackgroundColor = color39;
        com.badlogic.gdx.graphics.Color color45 = color39.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color49 = color39.lerp(color47, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color49, (-545421065));
        color49.a = 1L;
        com.badlogic.gdx.graphics.Color color58 = color49.mul((float) (-10223606), (float) (-40036), (float) 100, (float) (-16711681));
        com.badlogic.gdx.graphics.Color color63 = color58.sub((float) 509920, (-9.238233E37f), (float) (-16), (float) 2);
        com.badlogic.gdx.graphics.Color color64 = color58.clamp();
        color58.a = 7048739;
        com.badlogic.gdx.graphics.Color color68 = color33.lerp(color58, (-1.7005698E38f));
        int int69 = com.badlogic.gdx.graphics.Color.rgb565(color58);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color58;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2047 + "'", int69 == 2047);
    }

    @Test
    public void test23434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23434");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int14 = lwjgl3ApplicationConfiguration13.windowMinHeight;
        int int15 = lwjgl3ApplicationConfiguration13.windowMaxWidth;
        lwjgl3ApplicationConfiguration13.r = (-557670656);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test23435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23435");
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
        int int21 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.disableAudio = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 765 + "'", int21 == 765);
    }

    @Test
    public void test23436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23436");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.7013928E38f), (float) 2113863936, (float) (-480788480), (float) (byte) 0);
        color4.r = 0.5019608f;
    }

    @Test
    public void test23437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23437");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.setBackBufferConfig(8, 40664886, 0, (-100466688), 267782144, (-6553036), 16738740);
        lwjgl3ApplicationConfiguration1.title = ".prefs/";
        lwjgl3ApplicationConfiguration1.r = 16777200;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.preferencesDirectory = "00ffff00";
        lwjgl3ApplicationConfiguration1.setBackBufferConfig(125, 2073378560, (-43264), (-587202560), 1895825408, (-134243073), (-10846208));
        lwjgl3ApplicationConfiguration1.title = "fff70fff";
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
    }

    @Test
    public void test23438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23438");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration0.windowHeight = (-255);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        int int12 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test23439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23439");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-151);
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int12 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test23440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23440");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.getwindowY();
        int int7 = lwjgl3ApplicationConfiguration1.samples;
        int int8 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.useGL30 = true;
        lwjgl3ApplicationConfiguration1.stencil = (-271);
        boolean boolean13 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.disableAudio(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test23441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23441");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1465382614, (int) ' ');
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 40664886;
        lwjgl3ApplicationConfiguration0.samples = 0;
        lwjgl3ApplicationConfiguration0.samples = 0;
        int int24 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test23442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23442");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        lwjgl3ApplicationConfiguration11.setgles30ContextMinorVersion(653055);
        int int15 = lwjgl3ApplicationConfiguration11.depth;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test23443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23443");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 589478435, (float) 2260992, (float) (-1216), (float) (-39384064));
    }

    @Test
    public void test23444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23444");
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
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test23445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23445");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, 0.0f, (float) 61455, (float) 2047);
        int int5 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 65535 + "'", int5 == 65535);
    }

    @Test
    public void test23446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23446");
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
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.a = (-2103508992);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
    }

    @Test
    public void test23447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23447");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        int int10 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int11 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 640 + "'", int10 == 640);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test23448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23448");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        float float13 = color12.a;
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration1.windowX = 'a';
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, (int) '4', 1677721600);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration1.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration1.setWindowedMode(16776961, (-129024));
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((-1077936368));
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color((float) 786400, (float) (-6553036), (float) (-255), (float) (-622910848));
        float float33 = color32.toFloatBits();
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color36 = color27.lerp(color32, (-1.0393939E38f));
        color27.g = 0.8f;
        lwjgl3ApplicationConfiguration1.setInitialBackgroundColor(color27);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 3.57E-43f + "'", float33 == 3.57E-43f);
        org.junit.Assert.assertNotNull(color36);
    }

    @Test
    public void test23449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23449");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        int int5 = lwjgl3ApplicationConfiguration1.getwindowX();
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration1.setAudioConfig(0, (-8656), (-36592));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test23450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23450");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        boolean boolean6 = lwjgl3ApplicationConfiguration5.getwindowResizable();
        lwjgl3ApplicationConfiguration5.setWindowSizeLimits((-1948738560), 372608, (-29852), (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.stencil = 10;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration12.initialBackgroundColor = color16;
        float float18 = color16.toFloatBits();
        java.lang.String str19 = color16.toString();
        boolean boolean21 = color16.equals((java.lang.Object) (-1.7014117E38f));
        com.badlogic.gdx.graphics.Color color26 = color16.sub((float) (-2144), (float) (-15), (float) 401539072, (float) (-553651968));
        float float27 = color26.r;
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color29, 16);
        float float32 = color29.g;
        int int33 = com.badlogic.gdx.graphics.Color.rgba8888(color29);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color29);
        float float35 = color34.r;
        com.badlogic.gdx.graphics.Color color37 = color34.mul((float) (short) 0);
        com.badlogic.gdx.graphics.Color color38 = color26.add(color37);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color38;
        boolean boolean40 = lwjgl3ApplicationConfiguration5.windowResizable;
        lwjgl3ApplicationConfiguration5.setgles30ContextMajorVersion((-176009952));
        lwjgl3ApplicationConfiguration5.b = (-2147483646);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "00000000" + "'", str19, "00000000");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 33791 + "'", int33 == 33791);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test23451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23451");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.a = (-6553036);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int17 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int20 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.windowX = 51855;
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(618586833);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 640 + "'", int20 == 640);
    }

    @Test
    public void test23452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23452");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = ' ';
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-62876);
        int int14 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setwindowY(491505);
        lwjgl3ApplicationConfiguration0.r = (-90624);
        int int19 = lwjgl3ApplicationConfiguration0.a;
        int int20 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test23453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23453");
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
        int int19 = lwjgl3ApplicationConfiguration1.getwindowHeight();
        java.lang.String str20 = lwjgl3ApplicationConfiguration1.title;
        com.badlogic.gdx.Files.FileType fileType21 = lwjgl3ApplicationConfiguration1.preferencesFileType;
        lwjgl3ApplicationConfiguration1.setdisableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = (-238034928);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 480 + "'", int19 == 480);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + fileType21 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType21.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
    }

    @Test
    public void test23454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23454");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        int int3 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-41943040);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((float) 786400, (float) (-6553036), (float) (-255), (float) (-622910848));
        int int11 = com.badlogic.gdx.graphics.Color.rgba8888(color10);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color12;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = lwjgl3ApplicationConfiguration0.hdpiMode;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-16777216) + "'", int11 == (-16777216));
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23455");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        boolean boolean10 = lwjgl3ApplicationConfiguration1.getwindowDecorated();
        int int11 = lwjgl3ApplicationConfiguration1.getdepth();
        int int12 = lwjgl3ApplicationConfiguration1.getwindowX();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test23456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23456");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.getsamples();
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-15514229), 2016, 0, 1677721600, 0, (-16580607), 100);
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (-848128), 509920, 863980544, 2550, (-208), (-8160));
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-10188800);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
    }

    @Test
    public void test23457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23457");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(480);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.OLIVE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test23458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23458");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = lwjgl3ApplicationConfiguration1.windowListener;
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources(1621098495);
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion((-256));
        boolean boolean15 = lwjgl3ApplicationConfiguration1.useGL30;
        int int16 = lwjgl3ApplicationConfiguration1.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        int int20 = lwjgl3ApplicationConfiguration17.depth;
        int int21 = lwjgl3ApplicationConfiguration17.stencil;
        int int22 = lwjgl3ApplicationConfiguration17.getwindowY();
        lwjgl3ApplicationConfiguration17.windowMaxHeight = 0;
        lwjgl3ApplicationConfiguration17.windowResizable = true;
        int int27 = lwjgl3ApplicationConfiguration17.windowMaxHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration17.windowListener = lwjgl3WindowListener28;
        lwjgl3ApplicationConfiguration17.setwindowY((-2147420160));
        int int32 = lwjgl3ApplicationConfiguration17.getwindowMinWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = lwjgl3ApplicationConfiguration17.hdpiMode;
        lwjgl3ApplicationConfiguration1.setHdpiMode(hdpiMode33);
        int int35 = lwjgl3ApplicationConfiguration1.audioDeviceBufferCount;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(lwjgl3WindowListener10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode33 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode33.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
    }

    @Test
    public void test23459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23459");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.a = 3;
        lwjgl3ApplicationConfiguration0.a = 786400;
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test23460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23460");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color1 = color0.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color7 = color0.lerp((-1.5466959E26f), (float) 31, (float) (-235258384), (float) (-503316480), (float) 32);
        color7.b = (-8303);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test23461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23461");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.windowY = (byte) 1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.stencil = 10;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color9;
        lwjgl3ApplicationConfiguration5.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color13;
        boolean boolean15 = lwjgl3ApplicationConfiguration5.getwindowResizable();
        lwjgl3ApplicationConfiguration5.windowMinWidth = 509920;
        boolean boolean18 = lwjgl3ApplicationConfiguration5.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        int int23 = lwjgl3ApplicationConfiguration20.depth;
        int int24 = lwjgl3ApplicationConfiguration20.stencil;
        int int25 = lwjgl3ApplicationConfiguration20.getwindowY();
        lwjgl3ApplicationConfiguration20.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration20.setwindowMinWidth(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.stencil = 10;
        int int33 = lwjgl3ApplicationConfiguration30.b;
        boolean boolean34 = lwjgl3ApplicationConfiguration30.vSyncEnabled;
        lwjgl3ApplicationConfiguration30.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType37 = lwjgl3ApplicationConfiguration30.getpreferencesFileType();
        lwjgl3ApplicationConfiguration20.preferencesFileType = fileType37;
        lwjgl3ApplicationConfiguration5.setPreferencesConfig("hi!", fileType37);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType37);
        lwjgl3ApplicationConfiguration0.windowMinHeight = (-16711936);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "666a0000";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + fileType37 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType37.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23462");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = 765;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.graphics.Color color16 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int17 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test23463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23463");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.depth = (byte) 100;
        lwjgl3ApplicationConfiguration1.setDecorated(false);
        lwjgl3ApplicationConfiguration1.setuseGL30(true);
        int int16 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setpreferencesDirectory("ff0000ff");
        lwjgl3ApplicationConfiguration1.samples = (-2147438592);
        lwjgl3ApplicationConfiguration1.setResizable(false);
        int int23 = lwjgl3ApplicationConfiguration1.depth;
        lwjgl3ApplicationConfiguration1.setwindowDecorated(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test23464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23464");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        lwjgl3ApplicationConfiguration0.setsamples(1677721600);
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration11.setaudioDeviceSimultaneousSources(615183);
        int int14 = lwjgl3ApplicationConfiguration11.depth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test23465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23465");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 65439, (float) 16774156, 0.0f, (-1.4805586E-33f));
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color();
        com.badlogic.gdx.graphics.Color color8 = color4.lerp(color6, (float) (-150208512));
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test23466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23466");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-52344);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration6.getpreferencesFileType();
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration6.preferencesFileType;
        lwjgl3ApplicationConfiguration6.windowX = 572587251;
        lwjgl3ApplicationConfiguration6.setWindowSizeLimits(13770, 0, (-1476467812), (-225));
        lwjgl3ApplicationConfiguration6.setwindowMinWidth((-427567));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23467");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.a = 3;
        lwjgl3ApplicationConfiguration0.a = 786400;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int13 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 40664886;
        lwjgl3ApplicationConfiguration0.title = "ffff0000";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test23468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23468");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setsamples(25500);
        lwjgl3ApplicationConfiguration0.windowX = 13260;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
    }

    @Test
    public void test23469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23469");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources = (-32);
        int int9 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferSize((-9216));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test23470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23470");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 31, (float) (-245925));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-60818524) + "'", int2 == (-60818524));
    }

    @Test
    public void test23471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23471");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int5 = lwjgl3ApplicationConfiguration4.audioDeviceBufferSize;
        int int6 = lwjgl3ApplicationConfiguration4.windowMinHeight;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration4.getpreferencesFileType();
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("00000000", fileType7);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = (-16776961);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color15;
        com.badlogic.gdx.graphics.Color color21 = color15.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color25 = color15.lerp(color23, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color25, (-545421065));
        color25.a = 1L;
        com.badlogic.gdx.graphics.Color color34 = color25.mul((float) (-10223606), (float) (-40036), (float) 100, (float) (-16711681));
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color34);
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color35;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration37.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration37.setwindowResizable(false);
        int int48 = lwjgl3ApplicationConfiguration37.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration49.stencil = 10;
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration49.initialBackgroundColor = color53;
        int int55 = com.badlogic.gdx.graphics.Color.rgb888(color53);
        boolean boolean57 = color53.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration58.stencil = 10;
        com.badlogic.gdx.graphics.Color color62 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration58.initialBackgroundColor = color62;
        com.badlogic.gdx.graphics.Color color68 = color62.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color69 = color53.mul(color68);
        com.badlogic.gdx.graphics.Color color70 = color68.premultiplyAlpha();
        color68.g = 537535241;
        lwjgl3ApplicationConfiguration37.initialBackgroundColor = color68;
        com.badlogic.gdx.graphics.Color color74 = color35.add(color68);
        color35.a = 0.0f;
        com.badlogic.gdx.graphics.Color color77 = new com.badlogic.gdx.graphics.Color(color35);
        com.badlogic.gdx.graphics.Color color82 = new com.badlogic.gdx.graphics.Color((float) (-535758336), (float) (-16640), (-1.4805586E-33f), (float) 3309388);
        com.badlogic.gdx.graphics.Color color83 = color35.mul(color82);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNotNull(color70);
        org.junit.Assert.assertNotNull(color74);
        org.junit.Assert.assertNotNull(color83);
    }

    @Test
    public void test23472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23472");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration6.windowListener = lwjgl3WindowListener7;
        int int9 = lwjgl3ApplicationConfiguration6.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode10 = lwjgl3ApplicationConfiguration6.hdpiMode;
        lwjgl3ApplicationConfiguration6.setWindowSizeLimits((-5600), (-25500), (-3456), 11059605);
        boolean boolean16 = lwjgl3ApplicationConfiguration6.getwindowResizable();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + hdpiMode10 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode10.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test23473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23473");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.samples = 6349110;
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setWindowedMode((-2147483648), (-7936));
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setwindowX(61680);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
    }

    @Test
    public void test23474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23474");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-17690880));
        int int2 = com.badlogic.gdx.graphics.Color.rgba4444(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60928 + "'", int2 == 60928);
    }
}
