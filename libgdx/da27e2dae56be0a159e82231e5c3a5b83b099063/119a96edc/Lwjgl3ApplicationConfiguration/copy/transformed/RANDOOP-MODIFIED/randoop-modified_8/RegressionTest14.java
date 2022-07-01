import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test07001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07001");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CHARTREUSE;
        color0.a = 1.00579765E-28f;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (-1879860224));
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = color5.set(402587648);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test07002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07002");
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
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color45 = color43.mul((float) (-16646400));
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color((float) (-2143297280), (float) 8256822, (float) 41903542, (-5.360365E37f));
        com.badlogic.gdx.graphics.Color color51 = color45.mul(color50);
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color(color50);
        com.badlogic.gdx.graphics.Color color57 = color50.mul((float) (-68060), (-1.701307E38f), (float) (-8160), (float) 10);
        com.badlogic.gdx.graphics.Color color58 = color57.premultiplyAlpha();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-256) + "'", int2 == (-256));
        org.junit.Assert.assertNotNull(color3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(color6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-256) + "'", int7 == (-256));
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color58);
    }

    @Test
    public void test07003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07003");
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
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-16252928), 7576628, 7576628, (-56576), (-270598144), 130560, (-587726848));
        int int27 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int28 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test07004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07004");
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
        lwjgl3ApplicationConfiguration0.windowWidth = (-587202461);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1));
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int23 = lwjgl3ApplicationConfiguration0.windowX;
        int int24 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration25.setwindowWidth((int) (byte) 100);
        lwjgl3ApplicationConfiguration25.setWindowedMode(56864, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode33 = lwjgl3ApplicationConfiguration25.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration34.setpreferencesFileType(fileType35);
        lwjgl3ApplicationConfiguration34.disableAudio = true;
        int int39 = lwjgl3ApplicationConfiguration34.windowY;
        int int40 = lwjgl3ApplicationConfiguration34.audioDeviceBufferCount;
        int int41 = lwjgl3ApplicationConfiguration34.a;
        boolean boolean42 = lwjgl3ApplicationConfiguration34.getvSyncEnabled();
        lwjgl3ApplicationConfiguration34.windowHeight = 'a';
        com.badlogic.gdx.Graphics.DisplayMode displayMode45 = null;
        lwjgl3ApplicationConfiguration34.setFullscreenMode(displayMode45);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType48 = null;
        lwjgl3ApplicationConfiguration47.setpreferencesFileType(fileType48);
        lwjgl3ApplicationConfiguration47.setsamples((int) (short) 0);
        int int52 = lwjgl3ApplicationConfiguration47.getgles30ContextMinorVersion();
        int int53 = lwjgl3ApplicationConfiguration47.g;
        lwjgl3ApplicationConfiguration47.title = "00000000";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode56 = lwjgl3ApplicationConfiguration47.hdpiMode;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration25.hdpiMode = hdpiMode56;
        lwjgl3ApplicationConfiguration25.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode62 = null;
        lwjgl3ApplicationConfiguration61.setFullscreenMode(displayMode62);
        com.badlogic.gdx.Files.FileType fileType64 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration61.setpreferencesFileType(fileType64);
        lwjgl3ApplicationConfiguration61.audioDeviceBufferSize = (short) 1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = lwjgl3ApplicationConfiguration61.hdpiMode;
        lwjgl3ApplicationConfiguration25.hdpiMode = hdpiMode68;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode68;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 61450 + "'", int23 == 61450);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNull(lwjgl3DisplayMode33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 8 + "'", int53 == 8);
        org.junit.Assert.assertTrue("'" + hdpiMode56 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode56.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + fileType64 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType64.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode68 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode68.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test07005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07005");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int14 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.samples = 1070333936;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test07006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07006");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((-1.0612943E37f), (float) 933216288, (float) (-1635873500), (float) (-57375));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-209) + "'", int4 == (-209));
    }

    @Test
    public void test07007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07007");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-256), (-65025));
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float10 = color9.a;
        com.badlogic.gdx.graphics.Color color15 = color9.mul((float) 8, (float) 1677696502, (float) 0L, (float) 43268);
        int int16 = com.badlogic.gdx.graphics.Color.rgba4444(color9);
        com.badlogic.gdx.graphics.Color color17 = color9.cpy();
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        int int19 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        int int24 = lwjgl3ApplicationConfiguration0.a;
        int int25 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 65295 + "'", int16 == 65295);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test07008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07008");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.setwindowX((int) (byte) 100);
        lwjgl3ApplicationConfiguration7.setaudioDeviceBufferSize((-40036));
        lwjgl3ApplicationConfiguration7.setgles30ContextMinorVersion(16711680);
        boolean boolean14 = lwjgl3ApplicationConfiguration7.windowResizable;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test07009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07009");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-150), (float) (-12460032), 4.0487513E-19f, (float) 256);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6975328E38f) + "'", float4 == (-1.6975328E38f));
    }

    @Test
    public void test07010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07010");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        lwjgl3ApplicationConfiguration0.depth = (short) -1;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color19, (int) 'a');
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color19;
        color19.g = (-62986);
        org.junit.Assert.assertNotNull(color19);
    }

    @Test
    public void test07011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07011");
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
        lwjgl3ApplicationConfiguration13.stencil = (-95);
        int int20 = lwjgl3ApplicationConfiguration13.samples;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test07012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07012");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 100);
        java.lang.String str5 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1794115036);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.depth = 8160;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int14 = lwjgl3ApplicationConfiguration13.getaudioDeviceBufferSize();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.windowResizable;
        lwjgl3ApplicationConfiguration13.depth = (short) 10;
        lwjgl3ApplicationConfiguration13.useOpenGL3(false, 0, 0);
        int int22 = lwjgl3ApplicationConfiguration13.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration23.setpreferencesFileType(fileType24);
        lwjgl3ApplicationConfiguration23.useVsync(false);
        lwjgl3ApplicationConfiguration23.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration23.a = (-62986);
        lwjgl3ApplicationConfiguration23.setdisableAudio(true);
        boolean boolean35 = lwjgl3ApplicationConfiguration23.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3ApplicationConfiguration37.setFullscreenMode(displayMode38);
        lwjgl3ApplicationConfiguration37.windowX = 100;
        int int42 = lwjgl3ApplicationConfiguration37.g;
        com.badlogic.gdx.Files.FileType fileType43 = lwjgl3ApplicationConfiguration37.getpreferencesFileType();
        lwjgl3ApplicationConfiguration23.setPreferencesConfig("ffffff00", fileType43);
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType43);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType43);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-871890944), 43268);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".prefs/" + "'", str5, ".prefs/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertTrue("'" + fileType43 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType43.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07013");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-16711680));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color1, (-16734721));
        com.badlogic.gdx.graphics.Color color4 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color9 = color4.add((float) (byte) 100, (float) 41903542, (float) (short) 10, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color11 = color10.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color11, 1);
        float float14 = color11.r;
        com.badlogic.gdx.graphics.Color color15 = color4.sub(color11);
        com.badlogic.gdx.graphics.Color color16 = color1.set(color4);
        int int17 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2560) + "'", int17 == (-2560));
    }

    @Test
    public void test07014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07014");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float9 = color8.a;
        int int10 = color8.toIntBits();
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color19 = color13.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str21 = color20.toString();
        com.badlogic.gdx.graphics.Color color23 = color13.lerp(color20, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color24, 16);
        com.badlogic.gdx.graphics.Color color27 = color23.sub(color24);
        color23.r = 0.0f;
        boolean boolean30 = color8.equals((java.lang.Object) color23);
        float float31 = color23.r;
        java.lang.String str32 = color23.toString();
        com.badlogic.gdx.graphics.Color color33 = color23.cpy();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "00ff0000" + "'", str21, "00ff0000");
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0000ee00" + "'", str32, "0000ee00");
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test07015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07015");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.r = 3;
        int int15 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration16.setwindowHeight((int) (short) 0);
        int int19 = lwjgl3ApplicationConfiguration16.depth;
        lwjgl3ApplicationConfiguration16.windowY = (-14883840);
        boolean boolean22 = lwjgl3ApplicationConfiguration16.vSyncEnabled;
        int int23 = lwjgl3ApplicationConfiguration16.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 640 + "'", int23 == 640);
    }

    @Test
    public void test07016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07016");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16711425);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 35;
        lwjgl3ApplicationConfiguration0.windowY = (-736);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test07017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07017");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(167709184, 195840);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-2304);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.title;
        int int10 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test07018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07018");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color7 = color2.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = color1.sub(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color1);
        int int10 = color9.toIntBits();
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color12 = color11.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color12, 1);
        int int15 = color12.toIntBits();
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color17 = color9.mul(color16);
        color9.r = (-65358);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-16252928) + "'", int15 == (-16252928));
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test07019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07019");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((-2.7927927E30f), (float) (-3200), (float) (-16794448));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-208896000) + "'", int3 == (-208896000));
    }

    @Test
    public void test07020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07020");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SKY;
        int int1 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str3 = lwjgl3ApplicationConfiguration2.title;
        lwjgl3ApplicationConfiguration2.a = (-1);
        boolean boolean6 = lwjgl3ApplicationConfiguration2.vSyncEnabled;
        lwjgl3ApplicationConfiguration2.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration2.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color10 = color0.mul(color9);
        color9.g = (-135823360);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color9, (-1677417472));
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test07021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07021");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(20160);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setwindowY((-16777199));
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int20 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test07022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07022");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-10223772));
    }

    @Test
    public void test07023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07023");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-7876885), (float) 0L, (float) 6529016, (-0.49791527f));
        com.badlogic.gdx.graphics.Color color6 = color4.set(537395200);
        color4.g = 2;
        int int9 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        com.badlogic.gdx.graphics.Color color14 = color4.sub((float) 3570, (float) 56864, (float) (-2304), (float) (-33463396));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color14, (-570425600));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 570294272 + "'", int9 == 570294272);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test07024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07024");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("000000ff");
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test07025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07025");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 10;
        int int7 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test07026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07026");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 852308735, (float) (-3584), (-4.28676E37f), (float) (-532099584));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7014117E38f) + "'", float4 == (-1.7014117E38f));
    }

    @Test
    public void test07027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07027");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        lwjgl3ApplicationConfiguration0.setwindowHeight(151015132);
        lwjgl3ApplicationConfiguration0.r = (-940);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration19.setpreferencesFileType(fileType20);
        lwjgl3ApplicationConfiguration19.useVsync(false);
        lwjgl3ApplicationConfiguration19.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration19);
        boolean boolean27 = lwjgl3ApplicationConfiguration19.getwindowResizable();
        java.lang.String str28 = lwjgl3ApplicationConfiguration19.title;
        boolean boolean29 = lwjgl3ApplicationConfiguration19.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration30.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration30.windowX = 100;
        int int35 = lwjgl3ApplicationConfiguration30.g;
        com.badlogic.gdx.Files.FileType fileType36 = lwjgl3ApplicationConfiguration30.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration37.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType41 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration37.setPreferencesConfig("hi!", fileType41);
        lwjgl3ApplicationConfiguration30.setpreferencesFileType(fileType41);
        lwjgl3ApplicationConfiguration30.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration46);
        java.lang.String str48 = lwjgl3ApplicationConfiguration46.title;
        lwjgl3ApplicationConfiguration46.audioDeviceBufferCount = 16;
        com.badlogic.gdx.Files.FileType fileType51 = lwjgl3ApplicationConfiguration46.getpreferencesFileType();
        lwjgl3ApplicationConfiguration19.preferencesFileType = fileType51;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType51);
        com.badlogic.gdx.Files.FileType fileType54 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + fileType36 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType36.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType41 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType41.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration46);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + fileType51 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType51.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + fileType54 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType54.equals(com.badlogic.gdx.Files.FileType.Absolute));
    }

    @Test
    public void test07028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07028");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(3, 8897069);
        lwjgl3ApplicationConfiguration0.g = (-62986);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration17.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration17.samples = (-1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType26 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration22.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration17.setpreferencesFileType(fileType26);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType26);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.Absolute));
    }

    @Test
    public void test07029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07029");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16711425);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color17 = color14.set(35);
        com.badlogic.gdx.graphics.Color color18 = color14.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color23 = color14.mul(0.0f, (float) 65535, (float) (-32), (float) (-1));
        int int24 = com.badlogic.gdx.graphics.Color.rgba4444(color14);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        boolean boolean26 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setWindowPosition((-650250), 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test07030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07030");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.depth = 13260;
        int int11 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
    }

    @Test
    public void test07031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07031");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowY = 20188;
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int13 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration14.setpreferencesFileType(fileType15);
        lwjgl3ApplicationConfiguration14.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration14.setPreferencesConfig("", fileType20);
        java.lang.String str22 = lwjgl3ApplicationConfiguration14.preferencesDirectory;
        int int23 = lwjgl3ApplicationConfiguration14.getgles30ContextMajorVersion();
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration14.preferencesFileType = fileType24;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration26.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration26.windowX = 100;
        int int31 = lwjgl3ApplicationConfiguration26.stencil;
        int int32 = lwjgl3ApplicationConfiguration26.windowY;
        lwjgl3ApplicationConfiguration26.a = 43268;
        int int35 = lwjgl3ApplicationConfiguration26.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration26.setdepth(512);
        lwjgl3ApplicationConfiguration26.g = (byte) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration40.setpreferencesFileType(fileType41);
        lwjgl3ApplicationConfiguration40.useVsync(false);
        lwjgl3ApplicationConfiguration40.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration40.a = (-62986);
        lwjgl3ApplicationConfiguration40.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration40.hdpiMode = hdpiMode52;
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration14.hdpiMode = hdpiMode52;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode52 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode52.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test07032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07032");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode13 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.windowResizable;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration15.disableAudio = true;
        int int20 = lwjgl3ApplicationConfiguration15.windowY;
        int int21 = lwjgl3ApplicationConfiguration15.audioDeviceBufferCount;
        int int22 = lwjgl3ApplicationConfiguration15.a;
        boolean boolean23 = lwjgl3ApplicationConfiguration15.getvSyncEnabled();
        com.badlogic.gdx.Files.FileType fileType24 = lwjgl3ApplicationConfiguration15.preferencesFileType;
        int int25 = lwjgl3ApplicationConfiguration15.gles30ContextMinorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = lwjgl3ApplicationConfiguration15.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration15.windowListener = lwjgl3WindowListener27;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration29.setWindowedMode(1, 10);
        int int35 = lwjgl3ApplicationConfiguration29.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = lwjgl3ApplicationConfiguration29.hdpiMode;
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode36;
        int int39 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertNull(lwjgl3DisplayMode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(fileType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
    }

    @Test
    public void test07033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07033");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        com.badlogic.gdx.graphics.Color color13 = color6.sub((-1.5862616E29f), 0.0f, (float) (-56576), (float) 178);
        float float14 = color13.a;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ffffffff" + "'", str8, "ffffffff");
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test07034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07034");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-270598144);
        lwjgl3ApplicationConfiguration0.windowHeight = (-232);
        lwjgl3ApplicationConfiguration0.setdepth((-823132400));
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-270598144) + "'", int16 == (-270598144));
    }

    @Test
    public void test07035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07035");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.67129651E9f, (float) (-14540110), (float) 2, (-1.5659187E38f));
        com.badlogic.gdx.graphics.Color color6 = color4.mul(2.75501E-40f);
        int int7 = com.badlogic.gdx.graphics.Color.rgb565(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color6);
        color6.r = (-254);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color6);
        int int12 = com.badlogic.gdx.graphics.Color.rgb565(color11);
        float float13 = color11.r;
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color11);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-16125952) + "'", int12 == (-16125952));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-254.0f) + "'", float13 == (-254.0f));
    }

    @Test
    public void test07036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07036");
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
        int int60 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 512 + "'", int60 == 512);
    }

    @Test
    public void test07037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07037");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.OLIVE;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color0, 16776961);
        color0.r = 1.5062675E-38f;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test07038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07038");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 972951537, (float) 2047, 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-65280) + "'", int3 == (-65280));
    }

    @Test
    public void test07039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07039");
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
        int int14 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(1932040192);
        java.lang.String str17 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test07040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07040");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) 168296448);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test07041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07041");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration15.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration15.setPreferencesConfig("", fileType21);
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration15.preferencesFileType;
        lwjgl3ApplicationConfiguration15.gles30ContextMinorVersion = 587162524;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration26.setpreferencesFileType(fileType27);
        lwjgl3ApplicationConfiguration26.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration26.setPreferencesConfig("", fileType32);
        int int34 = lwjgl3ApplicationConfiguration26.r;
        int int35 = lwjgl3ApplicationConfiguration26.getwindowY();
        lwjgl3ApplicationConfiguration26.setTitle(".prefs/");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3ApplicationConfiguration39.setFullscreenMode(displayMode40);
        com.badlogic.gdx.Files.FileType fileType42 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration39.setpreferencesFileType(fileType42);
        lwjgl3ApplicationConfiguration39.setwindowY(100);
        lwjgl3ApplicationConfiguration39.r = 0;
        lwjgl3ApplicationConfiguration39.setsamples(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType51 = null;
        lwjgl3ApplicationConfiguration50.setpreferencesFileType(fileType51);
        lwjgl3ApplicationConfiguration50.disableAudio = true;
        lwjgl3ApplicationConfiguration50.initialVisible = true;
        int int57 = lwjgl3ApplicationConfiguration50.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration50.b = (-62986);
        lwjgl3ApplicationConfiguration50.b = 2;
        lwjgl3ApplicationConfiguration50.setwindowX((int) 'a');
        lwjgl3ApplicationConfiguration50.setsamples((int) (short) 10);
        lwjgl3ApplicationConfiguration50.g = 65295;
        boolean boolean68 = lwjgl3ApplicationConfiguration50.initialVisible;
        com.badlogic.gdx.Files.FileType fileType69 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration50.setpreferencesFileType(fileType69);
        lwjgl3ApplicationConfiguration39.preferencesFileType = fileType69;
        lwjgl3ApplicationConfiguration26.setPreferencesConfig("00000000", fileType69);
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType69);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType69);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode75 = lwjgl3ApplicationConfiguration0.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration76 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration76.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration76.title = "";
        int int87 = lwjgl3ApplicationConfiguration76.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Graphics.DisplayMode displayMode88 = null;
        lwjgl3ApplicationConfiguration76.setFullscreenMode(displayMode88);
        int int90 = lwjgl3ApplicationConfiguration76.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration76.setwindowDecorated(false);
        int int93 = lwjgl3ApplicationConfiguration76.getgles30ContextMajorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode94 = lwjgl3ApplicationConfiguration76.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode94;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNull(fileType23);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + fileType42 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType42.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 512 + "'", int57 == 512);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + fileType69 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType69.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + hdpiMode75 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode75.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 16 + "'", int87 == 16);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 512 + "'", int90 == 512);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 3 + "'", int93 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode94 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode94.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test07042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07042");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.g = (short) 0;
        lwjgl3ApplicationConfiguration0.windowX = 35;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(0);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int15 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test07043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07043");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.a = 8;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-1007));
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-25100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test07044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07044");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        int int3 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-3056));
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int8 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setsamples((-95));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void test07045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07045");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig((-11604982), 16777215, (-14492160));
        int int17 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        lwjgl3ApplicationConfiguration0.samples = 6147990;
        java.lang.String str22 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        boolean boolean23 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-11604982) + "'", int17 == (-11604982));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ".prefs/" + "'", str22, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test07046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07046");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        boolean boolean11 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.useGL30;
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-534773760);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
    }

    @Test
    public void test07047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07047");
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
        java.lang.String str18 = lwjgl3ApplicationConfiguration16.title;
        lwjgl3ApplicationConfiguration16.audioDeviceBufferCount = 16;
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color28 = color23.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color29 = color22.sub(color28);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color22, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color22);
        com.badlogic.gdx.graphics.Color color37 = color22.mul((float) (-222), (-1.5084639E38f), (float) (-62986), (float) (-16741598));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration38);
        boolean boolean42 = color37.equals((java.lang.Object) lwjgl3ApplicationConfiguration38);
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color37);
        float float44 = color37.a;
        com.badlogic.gdx.graphics.Color color46 = color37.mul((float) (-975375));
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color(color46);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-0.0f) + "'", float44 == (-0.0f));
        org.junit.Assert.assertNotNull(color46);
    }

    @Test
    public void test07048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07048");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((-4.386452E37f), (float) (-858993545));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test07049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07049");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color3 = color1.cpy();
        int int4 = com.badlogic.gdx.graphics.Color.rgb888(color1);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color11);
        int int13 = com.badlogic.gdx.graphics.Color.argb8888(color12);
        int int14 = com.badlogic.gdx.graphics.Color.rgba8888(color12);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color12, (-15667200));
        com.badlogic.gdx.graphics.Color color17 = color1.set(color12);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color17, 0);
        int int20 = com.badlogic.gdx.graphics.Color.argb8888(color17);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test07050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07050");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowX = (-4051712);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test07051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07051");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        int int9 = lwjgl3ApplicationConfiguration0.g;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int15 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test07052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07052");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setdepth(4095);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test07053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07053");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test07054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07054");
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
        lwjgl3ApplicationConfiguration0.r = (-8142);
        java.lang.String str18 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test07055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07055");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.r = 140834847;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration14.setWindowedMode(1, 10);
        boolean boolean20 = lwjgl3ApplicationConfiguration14.getwindowResizable();
        lwjgl3ApplicationConfiguration14.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        lwjgl3ApplicationConfiguration14.setwindowX((-14513374));
        lwjgl3ApplicationConfiguration14.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = lwjgl3ApplicationConfiguration14.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode28;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.setDecorated(false);
        lwjgl3ApplicationConfiguration30.a = (byte) 10;
        boolean boolean35 = lwjgl3ApplicationConfiguration30.initialVisible;
        int int36 = lwjgl3ApplicationConfiguration30.b;
        lwjgl3ApplicationConfiguration30.setAudioConfig(0, 43268, 9);
        int int41 = lwjgl3ApplicationConfiguration30.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration30.setaudioDeviceBufferSize((-1902614));
        int int44 = lwjgl3ApplicationConfiguration30.a;
        boolean boolean45 = lwjgl3ApplicationConfiguration30.windowDecorated;
        int int46 = lwjgl3ApplicationConfiguration30.gles30ContextMinorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = lwjgl3ApplicationConfiguration30.hdpiMode;
        com.badlogic.gdx.Files.FileType fileType48 = lwjgl3ApplicationConfiguration30.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType48);
        java.lang.String str50 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
        org.junit.Assert.assertTrue("'" + hdpiMode28 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode28.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode47 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode47.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + fileType48 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType48.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test07056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07056");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.67741936f, (float) 14500320, (-1.6947916E38f), (float) (-33576664));
        int int5 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11337472 + "'", int5 == 11337472);
    }

    @Test
    public void test07057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07057");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-327229440), (-18), (-14033920), (-3600));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4608) + "'", int4 == (-4608));
    }

    @Test
    public void test07058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07058");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int12 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1677786624, (-10), 3306396, 3306396, (-1562574848), (-334888960), (int) '4');
        int int21 = lwjgl3ApplicationConfiguration0.r;
        java.lang.String str22 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener23;
        int int25 = lwjgl3ApplicationConfiguration0.samples;
        int int26 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1677786624 + "'", int21 == 1677786624);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ".prefs/" + "'", str22, ".prefs/");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1677786624 + "'", int26 == 1677786624);
    }

    @Test
    public void test07059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07059");
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
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
    }

    @Test
    public void test07060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07060");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((-1.6949741E38f), (float) 61599, 1.6776994E7f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07061");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color7 = color2.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = color1.sub(color7);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color1);
        float float12 = color11.g;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test07062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07062");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int16 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-33488131) + "'", int15 == (-33488131));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-10) + "'", int16 == (-10));
    }

    @Test
    public void test07063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07063");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.a;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test07064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07064");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode(56864, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.b = (-34881504);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertNull(lwjgl3DisplayMode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test07065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07065");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.windowY = 20188;
        int int4 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int6 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration8.setpreferencesFileType(fileType9);
        lwjgl3ApplicationConfiguration8.useVsync(false);
        lwjgl3ApplicationConfiguration8.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        boolean boolean16 = lwjgl3ApplicationConfiguration8.windowDecorated;
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.GREEN;
        lwjgl3ApplicationConfiguration8.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration8.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration8.b = (-10);
        lwjgl3ApplicationConfiguration8.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str27 = lwjgl3ApplicationConfiguration26.title;
        int int28 = lwjgl3ApplicationConfiguration26.samples;
        com.badlogic.gdx.Files.FileType fileType29 = lwjgl3ApplicationConfiguration26.getpreferencesFileType();
        lwjgl3ApplicationConfiguration8.setPreferencesConfig("001cff00", fileType29);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType29;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + fileType29 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType29.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07066");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-6.6305225E35f), (float) (-16777216), (float) (-1489440), (-1.7009445E38f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-3.3087225E-23f) + "'", float4 == (-3.3087225E-23f));
    }

    @Test
    public void test07067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07067");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration8.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        lwjgl3ApplicationConfiguration11.b = 284196832;
        lwjgl3ApplicationConfiguration11.title = "4169e1ff";
        boolean boolean16 = lwjgl3ApplicationConfiguration11.getwindowResizable();
        int int17 = lwjgl3ApplicationConfiguration11.getgles30ContextMajorVersion();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test07068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07068");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(20188);
        com.badlogic.gdx.graphics.Color color6 = color1.add((float) 16776994, (float) (-1714481152), (float) 14, (float) (-33488896));
        com.badlogic.gdx.graphics.Color color11 = color1.add((float) 16711425, (float) 53562, (-1.7013372E38f), 2.950215E-39f);
        int int12 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-65536) + "'", int12 == (-65536));
    }

    @Test
    public void test07069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07069");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration6.preferencesFileType;
        boolean boolean8 = lwjgl3ApplicationConfiguration6.getdisableAudio();
        lwjgl3ApplicationConfiguration6.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration6.setwindowX(16580354);
        lwjgl3ApplicationConfiguration6.disableAudio(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test07070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07070");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-8320);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 640 + "'", int7 == 640);
    }

    @Test
    public void test07071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07071");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(7576628);
    }

    @Test
    public void test07072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07072");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.initialVisible;
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07073");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.String str5 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.initialVisible;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".prefs/" + "'", str5, ".prefs/");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test07074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07074");
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
        int int31 = color30.toIntBits();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16777215 + "'", int31 == 16777215);
    }

    @Test
    public void test07075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07075");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        int int2 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-22));
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = lwjgl3ApplicationConfiguration0.hdpiMode;
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test07076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07076");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("00004edc");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration2.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration2.windowX = 100;
        int int7 = lwjgl3ApplicationConfiguration2.g;
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration2.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration9.setPreferencesConfig("hi!", fileType13);
        lwjgl3ApplicationConfiguration2.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration2.setaudioDeviceBufferCount(9);
        boolean boolean18 = lwjgl3ApplicationConfiguration2.useGL30;
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration2.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color20 = lwjgl3ApplicationConfiguration2.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color20, (-59894));
        boolean boolean23 = color1.equals((java.lang.Object) color20);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test07077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07077");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int8 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.title = "ffff0000";
        int int12 = lwjgl3ApplicationConfiguration0.windowY;
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test07078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07078");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20160);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        int int7 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.r = (-416907264);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test07079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07079");
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
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int22 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 640 + "'", int22 == 640);
    }

    @Test
    public void test07080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07080");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int15 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.title = "4169e1ff";
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean21 = lwjgl3ApplicationConfiguration0.initialVisible;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test07081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07081");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        int int14 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        int int17 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowY = (-1222144);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
    }

    @Test
    public void test07082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07082");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setwindowHeight(397865479);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test07083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07083");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-16450560), (-1.6950243E38f), (float) (-16777200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-182451712) + "'", int3 == (-182451712));
    }

    @Test
    public void test07084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07084");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setwindowX((int) 'a');
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int15 = lwjgl3ApplicationConfiguration0.a;
        int int16 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode17 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode17;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-383778816));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNull(fileType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test07085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07085");
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf(".prefs/");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".p\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07086");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str6 = color5.toString();
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        int int9 = com.badlogic.gdx.graphics.Color.rgba4444(color8);
        com.badlogic.gdx.graphics.Color color10 = color5.mul(color8);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color8, (-32));
        int int13 = com.badlogic.gdx.graphics.Color.argb8888(color8);
        float float14 = color8.b;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ffffff00" + "'", str6, "ffffff00");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16777198 + "'", int13 == 16777198);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.93333334f + "'", float14 == 0.93333334f);
    }

    @Test
    public void test07087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07087");
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
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((-0.49791527f), (float) 8, (float) (-32), (float) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.setDecorated(false);
        lwjgl3ApplicationConfiguration21.a = (byte) 10;
        boolean boolean26 = lwjgl3ApplicationConfiguration21.initialVisible;
        int int27 = lwjgl3ApplicationConfiguration21.b;
        lwjgl3ApplicationConfiguration21.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color30 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration21.initialBackgroundColor = color30;
        com.badlogic.gdx.graphics.Color color32 = color30.clamp();
        com.badlogic.gdx.graphics.Color color34 = color20.lerp(color32, (float) (-2336));
        com.badlogic.gdx.graphics.Color color35 = color15.add(color20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str37 = lwjgl3ApplicationConfiguration36.title;
        lwjgl3ApplicationConfiguration36.a = (-1);
        boolean boolean40 = lwjgl3ApplicationConfiguration36.vSyncEnabled;
        lwjgl3ApplicationConfiguration36.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color43 = lwjgl3ApplicationConfiguration36.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color(color43);
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color((-16711680));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color46, (-16734721));
        com.badlogic.gdx.graphics.Color color49 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color54 = color49.add((float) (byte) 100, (float) 41903542, (float) (short) 10, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color color55 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color56 = color55.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color56, 1);
        float float59 = color56.r;
        com.badlogic.gdx.graphics.Color color60 = color49.sub(color56);
        com.badlogic.gdx.graphics.Color color61 = color46.set(color49);
        com.badlogic.gdx.graphics.Color color62 = color44.add(color49);
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color(color62);
        com.badlogic.gdx.graphics.Color color64 = color35.set(color62);
        com.badlogic.gdx.graphics.Color color65 = color35.clamp();
        java.lang.Object obj66 = null;
        boolean boolean67 = color35.equals(obj66);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test07088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07088");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration14.setpreferencesFileType(fileType15);
        lwjgl3ApplicationConfiguration14.disableAudio = true;
        int int19 = lwjgl3ApplicationConfiguration14.windowY;
        int int20 = lwjgl3ApplicationConfiguration14.audioDeviceBufferCount;
        int int21 = lwjgl3ApplicationConfiguration14.a;
        lwjgl3ApplicationConfiguration14.depth = (-232);
        lwjgl3ApplicationConfiguration14.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration14.r = (-10887648);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int29 = lwjgl3ApplicationConfiguration28.getaudioDeviceBufferSize();
        boolean boolean30 = lwjgl3ApplicationConfiguration28.windowResizable;
        int int31 = lwjgl3ApplicationConfiguration28.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration28.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration28);
        com.badlogic.gdx.graphics.Color color35 = lwjgl3ApplicationConfiguration34.initialBackgroundColor;
        lwjgl3ApplicationConfiguration34.setpreferencesDirectory("ff660000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = lwjgl3ApplicationConfiguration34.hdpiMode;
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration8.hdpiMode = hdpiMode38;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNull(fileType13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test07089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07089");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color color14 = color8.mul(0.06666667f, (float) (-58475), (float) (-16734721), (float) 1044480);
        color8.b = (-1.7013859E38f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(167247232);
        com.badlogic.gdx.graphics.Color color19 = color8.set(color18);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        int int21 = com.badlogic.gdx.graphics.Color.rgb565(color20);
        com.badlogic.gdx.graphics.Color color22 = color8.sub(color20);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color32 = color26.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color33 = color24.mul(color32);
        com.badlogic.gdx.graphics.Color color38 = color33.sub((float) (short) -1, (float) (-1306385665), (float) (-262646), (float) 100L);
        int int39 = color33.toIntBits();
        float float40 = color33.a;
        com.badlogic.gdx.graphics.Color color41 = color22.sub(color33);
        float float42 = color41.toFloatBits();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 65504 + "'", int21 == 65504);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 16777215 + "'", int39 == 16777215);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
    }

    @Test
    public void test07090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07090");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        int int8 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-3315);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test07091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07091");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test07092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07092");
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
        lwjgl3ApplicationConfiguration0.setwindowHeight((-262646));
        lwjgl3ApplicationConfiguration0.setwindowY((int) (short) 100);
        lwjgl3ApplicationConfiguration0.r = (-567943452);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener19;
        boolean boolean21 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.SCARLET;
        com.badlogic.gdx.graphics.Color color23 = color22.clamp();
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color22;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test07093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07093");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        com.badlogic.gdx.graphics.Color color11 = color9.cpy();
        color9.a = (-65025);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((float) (-469852380), (-7.501805E37f), (float) (-234885152), 0.0f);
        com.badlogic.gdx.graphics.Color color19 = color9.mul(color18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color19);
    }

    @Test
    public void test07094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07094");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setwindowWidth(97);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int12 = lwjgl3ApplicationConfiguration0.b;
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
    }

    @Test
    public void test07095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07095");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.b = 100;
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        boolean boolean17 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setwindowY((-554880));
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test07096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07096");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowWidth = 65522;
        lwjgl3ApplicationConfiguration0.windowWidth = 6356992;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1879860224), (int) (short) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(0);
        boolean boolean21 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test07097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07097");
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
        int int18 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 63488, (-52786));
        lwjgl3ApplicationConfiguration0.a = (-16);
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 640 + "'", int18 == 640);
    }

    @Test
    public void test07098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07098");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.getdepth();
        int int8 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setwindowX((-80190464));
        int int11 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 640 + "'", int8 == 640);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test07099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07099");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-1879024896));
    }

    @Test
    public void test07100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07100");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) ' ');
        java.lang.Object obj2 = null;
        boolean boolean3 = color1.equals(obj2);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color6 = color1.set(63488);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test07101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07101");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        int int4 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setwindowHeight(25500);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
    }

    @Test
    public void test07102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07102");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-16711936), (float) (-16711680), (float) (-65024), 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color12 = color7.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color13 = color6.sub(color12);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color6, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color19 = color17.mul((float) (-14513374));
        com.badlogic.gdx.graphics.Color color20 = color16.set(color17);
        com.badlogic.gdx.graphics.Color color21 = color17.cpy();
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.VIOLET;
        com.badlogic.gdx.graphics.Color color28 = color22.lerp((float) (byte) 100, (float) 8, (float) 10, (float) 9, (float) (-1611265692));
        com.badlogic.gdx.graphics.Color color29 = color17.mul(color28);
        com.badlogic.gdx.graphics.Color color30 = color28.premultiplyAlpha();
        int int31 = color28.toIntBits();
        com.badlogic.gdx.graphics.Color color33 = color28.mul((-6.041497E37f));
        com.badlogic.gdx.graphics.Color color34 = color4.set(color28);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
    }

    @Test
    public void test07103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07103");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-134217728), (float) (-587726848), (float) 573767680, (float) (-50396672));
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((-335));
        com.badlogic.gdx.graphics.Color color7 = color6.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color9 = color4.sub(color8);
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color11 = color10.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color11, 1);
        int int14 = color11.toIntBits();
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color20 = color15.add((-5.68232E37f), 1.00579765E-28f, (float) 2147483647, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color21 = color8.mul(color20);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 524288 + "'", int14 == 524288);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
    }

    @Test
    public void test07104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07104");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(3);
        color1.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color4 = color1.clamp();
        com.badlogic.gdx.graphics.Color color9 = color4.sub((float) (-14540110), (float) (short) -1, (float) (-14513374), (float) 2);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color4, 652800);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color16.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color16, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color23 = color16.mul((float) 16580354);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((float) (-33488131), (float) 255, (float) 6356992, 1.67129651E9f);
        com.badlogic.gdx.graphics.Color color30 = color23.lerp(color28, (float) 2783);
        com.badlogic.gdx.graphics.Color color31 = color4.set(color23);
        int int32 = com.badlogic.gdx.graphics.Color.rgb565(color31);
        com.badlogic.gdx.graphics.Color color37 = color31.sub((-1.00817643E31f), 1.6598767E-38f, (float) 166464000, (-6.6305225E35f));
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2047 + "'", int32 == 2047);
        org.junit.Assert.assertNotNull(color37);
    }

    @Test
    public void test07105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07105");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.gles30ContextMajorVersion;
        int int11 = lwjgl3ApplicationConfiguration9.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1677696502 + "'", int10 == 1677696502);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test07106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07106");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
    }

    @Test
    public void test07107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07107");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        int int8 = lwjgl3ApplicationConfiguration0.stencil;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.stencil = (byte) 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(16, (-78));
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-334888960));
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration0.setwindowY((-3056));
        java.lang.String str23 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int24 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ".prefs/" + "'", str23, ".prefs/");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3056) + "'", int24 == (-3056));
    }

    @Test
    public void test07108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07108");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        int int10 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowWidth = (-14622977);
        lwjgl3ApplicationConfiguration0.setsamples(573767680);
        int int18 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test07109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07109");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        color1.g = 16777215;
        color1.a = (-8.0750596E37f);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color1);
        int int10 = com.badlogic.gdx.graphics.Color.rgb888(color9);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-248) + "'", int10 == (-248));
    }

    @Test
    public void test07110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07110");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode12;
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-240), (-334888960), 3104);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test07111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07111");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1441792), (float) 16580354, 4.5183064E-38f, 0.0f);
    }

    @Test
    public void test07112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07112");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-393464), (float) (-251850752), 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 150470656 + "'", int3 == 150470656);
    }

    @Test
    public void test07113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07113");
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
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.samples = 640;
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration0.setsamples((-32));
        int int22 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-33488131) + "'", int22 == (-33488131));
    }

    @Test
    public void test07114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07114");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TAN;
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.VIOLET;
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) (byte) 100, (float) 8, (float) 10, (float) 9, (float) (-1611265692));
        int int8 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color10 = color0.sub(color1);
        color1.g = (-254);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType14);
        lwjgl3ApplicationConfiguration13.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("", fileType19);
        java.lang.String str21 = lwjgl3ApplicationConfiguration13.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        lwjgl3ApplicationConfiguration13.setgles30ContextMajorVersion((-33488131));
        int int25 = lwjgl3ApplicationConfiguration13.windowY;
        boolean boolean26 = color1.equals((java.lang.Object) lwjgl3ApplicationConfiguration13);
        java.lang.String str27 = color1.toString();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "02fe0000" + "'", str27, "02fe0000");
    }

    @Test
    public void test07115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07115");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int12 = lwjgl3ApplicationConfiguration0.r;
        int int13 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.title = "0ff00000";
        int int16 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
    }

    @Test
    public void test07116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07116");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(3);
        color1.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color4 = color1.clamp();
        com.badlogic.gdx.graphics.Color color9 = color4.sub((float) (-14540110), (float) (short) -1, (float) (-14513374), (float) 2);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color4, 652800);
        com.badlogic.gdx.graphics.Color color17 = color4.lerp((float) 2129951, (float) (-16769793), (float) (-68935680), (float) (-8142), (float) (-65042));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, 0);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test07117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07117");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int10 = com.badlogic.gdx.graphics.Color.rgba4444(color9);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color14 = color12.mul(color13);
        color12.g = 6147990;
        com.badlogic.gdx.graphics.Color color17 = color12.clamp();
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((-4.2867603E37f), 9.18893E-39f, (float) 1794115036, (float) (-10));
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color28 = color23.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color33 = color28.mul((-1.0f), (float) 1677696502, (float) 65024, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color34 = color22.sub(color33);
        com.badlogic.gdx.graphics.Color color35 = color17.mul(color34);
        float float36 = color35.b;
        boolean boolean37 = color9.equals((java.lang.Object) float36);
        org.junit.Assert.assertNotNull(color9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 65517 + "'", int10 == 65517);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test07118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07118");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration3.windowListener = lwjgl3WindowListener4;
        lwjgl3ApplicationConfiguration3.setwindowResizable(true);
        lwjgl3ApplicationConfiguration3.windowY = 1939603456;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
    }

    @Test
    public void test07119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07119");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BLACK;
        float float3 = color2.r;
        color2.r = 1671296512;
        com.badlogic.gdx.graphics.Color color6 = color1.sub(color2);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color8 = color1.clamp();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color8, 0);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test07120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07120");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setAudioConfig(852308735, 50, 284196832);
        int int19 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(13260);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration24.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration24.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration24.gles30ContextMajorVersion = 10;
        lwjgl3ApplicationConfiguration24.setwindowHeight(151015132);
        lwjgl3ApplicationConfiguration24.setTitle("88bb2222");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType44 = null;
        lwjgl3ApplicationConfiguration43.setpreferencesFileType(fileType44);
        lwjgl3ApplicationConfiguration43.disableAudio = true;
        lwjgl3ApplicationConfiguration43.initialVisible = true;
        int int50 = lwjgl3ApplicationConfiguration43.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration43.b = (-62986);
        lwjgl3ApplicationConfiguration43.b = 2;
        lwjgl3ApplicationConfiguration43.setwindowX((int) 'a');
        lwjgl3ApplicationConfiguration43.setsamples((int) (short) 10);
        lwjgl3ApplicationConfiguration43.g = 65295;
        boolean boolean61 = lwjgl3ApplicationConfiguration43.initialVisible;
        com.badlogic.gdx.Files.FileType fileType62 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration43.setpreferencesFileType(fileType62);
        lwjgl3ApplicationConfiguration24.setpreferencesFileType(fileType62);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType62;
        lwjgl3ApplicationConfiguration0.samples = 49939200;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 512 + "'", int50 == 512);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + fileType62 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType62.equals(com.badlogic.gdx.Files.FileType.Local));
    }

    @Test
    public void test07121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07121");
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
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(0.0f, (-1.6969465E38f), (float) (short) 10, (float) (-55800));
        com.badlogic.gdx.graphics.Color color39 = color37.set(0);
        float float40 = color39.b;
        com.badlogic.gdx.graphics.Color color46 = color39.lerp((float) (-8672), (-1.7013047E38f), 1.0f, (float) (-2147424768), (float) (-535426560));
        com.badlogic.gdx.graphics.Color color47 = color25.add(color46);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00ff0000" + "'", str22, "00ff0000");
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color47);
    }

    @Test
    public void test07122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07122");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 65504, (float) (-13562097), (float) 1671168000, (float) 16777196);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7005843E38f) + "'", float4 == (-1.7005843E38f));
    }

    @Test
    public void test07123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07123");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int13 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        int int15 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.title = "ffff0000";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test07124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07124");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-2147483392), (float) (-1610612736), (float) (-3200), (float) (-65438));
    }

    @Test
    public void test07125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07125");
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
        lwjgl3ApplicationConfiguration15.g = 43268;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration18.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration18.setwindowY((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType31 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration18.setpreferencesFileType(fileType31);
        lwjgl3ApplicationConfiguration15.preferencesFileType = fileType31;
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration15.setFullscreenMode(displayMode34);
        lwjgl3ApplicationConfiguration15.setResizable(false);
        lwjgl3ApplicationConfiguration15.setuseGL30(true);
        lwjgl3ApplicationConfiguration15.g = (-65279);
        lwjgl3ApplicationConfiguration15.gles30ContextMajorVersion = 247;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + fileType31 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType31.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07126");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 1);
        int int13 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test07127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07127");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 43268, 9);
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1902614));
        int int14 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = lwjgl3ApplicationConfiguration0.hdpiMode;
        int int18 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.setDecorated(false);
        lwjgl3ApplicationConfiguration19.a = (byte) 10;
        boolean boolean24 = lwjgl3ApplicationConfiguration19.initialVisible;
        int int25 = lwjgl3ApplicationConfiguration19.b;
        lwjgl3ApplicationConfiguration19.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode29 = lwjgl3ApplicationConfiguration19.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration30.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration30.samples = (-1);
        lwjgl3ApplicationConfiguration30.setgles30ContextMajorVersion(1677696502);
        boolean boolean37 = lwjgl3ApplicationConfiguration30.getwindowDecorated();
        lwjgl3ApplicationConfiguration30.setaudioDeviceBufferCount((-33488131));
        int int40 = lwjgl3ApplicationConfiguration30.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration30);
        lwjgl3ApplicationConfiguration30.gles30ContextMajorVersion = (-10);
        int int44 = lwjgl3ApplicationConfiguration30.windowHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType46 = null;
        lwjgl3ApplicationConfiguration45.setpreferencesFileType(fileType46);
        lwjgl3ApplicationConfiguration45.useVsync(false);
        com.badlogic.gdx.graphics.Color color50 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration45.initialBackgroundColor = color50;
        lwjgl3ApplicationConfiguration45.setDecorated(false);
        int int54 = lwjgl3ApplicationConfiguration45.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration45.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration45);
        lwjgl3ApplicationConfiguration57.setwindowDecorated(false);
        int int60 = lwjgl3ApplicationConfiguration57.getgles30ContextMajorVersion();
        boolean boolean61 = lwjgl3ApplicationConfiguration57.getwindowDecorated();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode64 = null;
        lwjgl3ApplicationConfiguration63.setFullscreenMode(displayMode64);
        lwjgl3ApplicationConfiguration63.windowX = 100;
        int int68 = lwjgl3ApplicationConfiguration63.g;
        int int69 = lwjgl3ApplicationConfiguration63.getwindowY();
        com.badlogic.gdx.Files.FileType fileType70 = lwjgl3ApplicationConfiguration63.getpreferencesFileType();
        lwjgl3ApplicationConfiguration57.setPreferencesConfig("88bb2222", fileType70);
        lwjgl3ApplicationConfiguration30.setpreferencesFileType(fileType70);
        lwjgl3ApplicationConfiguration19.preferencesFileType = fileType70;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType70;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration75 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener76 = null;
        lwjgl3ApplicationConfiguration75.setWindowListener(lwjgl3WindowListener76);
        lwjgl3ApplicationConfiguration75.setwindowResizable(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration28);
        org.junit.Assert.assertNull(lwjgl3DisplayMode29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 480 + "'", int44 == 480);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 9 + "'", int54 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 8 + "'", int68 == 8);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + fileType70 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType70.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration75);
    }

    @Test
    public void test07128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07128");
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
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.valueOf("8ff00000");
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color26, (-1902614));
        com.badlogic.gdx.graphics.Color color30 = color19.lerp(color26, (float) 65280);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color36 = color31.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(color31);
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(color37);
        java.lang.String str39 = color37.toString();
        int int40 = com.badlogic.gdx.graphics.Color.rgba4444(color37);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color37);
        com.badlogic.gdx.graphics.Color color42 = color26.add(color41);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16777215 + "'", int20 == 16777215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-256) + "'", int21 == (-256));
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ffffff00" + "'", str39, "ffffff00");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 65520 + "'", int40 == 65520);
        org.junit.Assert.assertNotNull(color42);
    }

    @Test
    public void test07129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07129");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(16648950);
        color1.g = 0.9882353f;
    }

    @Test
    public void test07130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07130");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration21.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration21.windowX = 100;
        int int26 = lwjgl3ApplicationConfiguration21.g;
        int int27 = lwjgl3ApplicationConfiguration21.getwindowY();
        com.badlogic.gdx.Files.FileType fileType28 = lwjgl3ApplicationConfiguration21.getpreferencesFileType();
        lwjgl3ApplicationConfiguration15.preferencesFileType = fileType28;
        int int30 = lwjgl3ApplicationConfiguration15.getaudioDeviceBufferSize();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
    }

    @Test
    public void test07131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07131");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        boolean boolean11 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.stencil = 20160;
        int int14 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test07132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07132");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.r = 3;
        int int15 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration16.setwindowX(2048);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
    }

    @Test
    public void test07133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07133");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration34.setpreferencesFileType(fileType35);
        lwjgl3ApplicationConfiguration34.disableAudio = true;
        int int39 = lwjgl3ApplicationConfiguration34.windowY;
        int int40 = lwjgl3ApplicationConfiguration34.audioDeviceBufferCount;
        int int41 = lwjgl3ApplicationConfiguration34.a;
        boolean boolean42 = lwjgl3ApplicationConfiguration34.getvSyncEnabled();
        lwjgl3ApplicationConfiguration34.windowHeight = 'a';
        com.badlogic.gdx.Graphics.DisplayMode displayMode45 = null;
        lwjgl3ApplicationConfiguration34.setFullscreenMode(displayMode45);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType48 = null;
        lwjgl3ApplicationConfiguration47.setpreferencesFileType(fileType48);
        lwjgl3ApplicationConfiguration47.setsamples((int) (short) 0);
        int int52 = lwjgl3ApplicationConfiguration47.getgles30ContextMinorVersion();
        int int53 = lwjgl3ApplicationConfiguration47.g;
        lwjgl3ApplicationConfiguration47.title = "00000000";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode56 = lwjgl3ApplicationConfiguration47.hdpiMode;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode56);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean60 = lwjgl3ApplicationConfiguration0.initialVisible;
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 8 + "'", int53 == 8);
        org.junit.Assert.assertTrue("'" + hdpiMode56 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode56.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test07134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07134");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        int int7 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-201326593);
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-1056), (-1291845888));
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test07135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07135");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = 0;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-1068630016);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test07136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07136");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1, (float) 20160, (float) 0, (float) (byte) -1);
        java.lang.Object obj5 = null;
        boolean boolean6 = color4.equals(obj5);
        color4.a = 1.66464E8f;
        com.badlogic.gdx.graphics.Color color13 = color4.mul((-4.7832737E37f), (float) (-1024), (float) 251658239, (float) (-251850752));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test07137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07137");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 100;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        int int10 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test07138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07138");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        int int9 = com.badlogic.gdx.graphics.Color.rgba4444(color6);
        com.badlogic.gdx.graphics.Color color11 = color6.set(0);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ffffff00" + "'", str8, "ffffff00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65520 + "'", int9 == 65520);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test07139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07139");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int13 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 240, (-335609856));
        int int20 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.windowWidth = (-16838160);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
    }

    @Test
    public void test07140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07140");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.windowY = 43268;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(587162524, (-16252928), (int) 'a', (-16711923), 2147483647, (-222), 25500);
        int int18 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
    }

    @Test
    public void test07141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07141");
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
        java.lang.String str19 = lwjgl3ApplicationConfiguration16.preferencesDirectory;
        lwjgl3ApplicationConfiguration16.setgles30ContextMinorVersion((int) (short) 0);
        boolean boolean22 = lwjgl3ApplicationConfiguration16.vSyncEnabled;
        lwjgl3ApplicationConfiguration16.setvSyncEnabled(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".prefs/" + "'", str19, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test07142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07142");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TAN;
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.VIOLET;
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) (byte) 100, (float) 8, (float) 10, (float) 9, (float) (-1611265692));
        int int8 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color10 = color0.sub(color1);
        color1.g = (-254);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType14);
        lwjgl3ApplicationConfiguration13.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("", fileType19);
        java.lang.String str21 = lwjgl3ApplicationConfiguration13.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        lwjgl3ApplicationConfiguration13.setgles30ContextMajorVersion((-33488131));
        int int25 = lwjgl3ApplicationConfiguration13.windowY;
        boolean boolean26 = color1.equals((java.lang.Object) lwjgl3ApplicationConfiguration13);
        int int27 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 50200576 + "'", int27 == 50200576);
    }

    @Test
    public void test07143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07143");
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
        lwjgl3ApplicationConfiguration0.b = (-59160);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setdepth(64783);
        int int27 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.setdepth(167247232);
        com.badlogic.gdx.graphics.Color color30 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (-67611904));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(color30);
    }

    @Test
    public void test07144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07144");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-383778816), 1857089546, 2, (-2147483616));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-3.9273083E34f) + "'", float4 == (-3.9273083E34f));
    }

    @Test
    public void test07145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07145");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int10 = lwjgl3ApplicationConfiguration0.a;
        int int11 = lwjgl3ApplicationConfiguration0.b;
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
    }

    @Test
    public void test07146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07146");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-148446976), 0.0f, (float) 65504, (float) 15);
        float float5 = color4.b;
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test07147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07147");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.r = 1677696502;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType21 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertNull(fileType21);
    }

    @Test
    public void test07148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07148");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-554880), 8897069);
        lwjgl3ApplicationConfiguration0.setwindowX((-768));
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff65b6");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration13.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration13.windowX = 100;
        int int18 = lwjgl3ApplicationConfiguration13.stencil;
        int int19 = lwjgl3ApplicationConfiguration13.windowY;
        lwjgl3ApplicationConfiguration13.a = 43268;
        int int22 = lwjgl3ApplicationConfiguration13.gles30ContextMinorVersion;
        int int23 = lwjgl3ApplicationConfiguration13.getwindowX();
        com.badlogic.gdx.graphics.Color color24 = lwjgl3ApplicationConfiguration13.initialBackgroundColor;
        color24.a = 35;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color((-0.49791527f), (float) 8, (float) (-32), (float) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setDecorated(false);
        lwjgl3ApplicationConfiguration34.a = (byte) 10;
        boolean boolean39 = lwjgl3ApplicationConfiguration34.initialVisible;
        int int40 = lwjgl3ApplicationConfiguration34.b;
        lwjgl3ApplicationConfiguration34.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration34.initialBackgroundColor = color43;
        com.badlogic.gdx.graphics.Color color45 = color43.clamp();
        com.badlogic.gdx.graphics.Color color47 = color33.lerp(color45, (float) (-2336));
        com.badlogic.gdx.graphics.Color color48 = color28.add(color33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str50 = lwjgl3ApplicationConfiguration49.title;
        lwjgl3ApplicationConfiguration49.a = (-1);
        boolean boolean53 = lwjgl3ApplicationConfiguration49.vSyncEnabled;
        lwjgl3ApplicationConfiguration49.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color56 = lwjgl3ApplicationConfiguration49.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color57 = new com.badlogic.gdx.graphics.Color(color56);
        com.badlogic.gdx.graphics.Color color59 = new com.badlogic.gdx.graphics.Color((-16711680));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color59, (-16734721));
        com.badlogic.gdx.graphics.Color color62 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color67 = color62.add((float) (byte) 100, (float) 41903542, (float) (short) 10, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color color68 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color69 = color68.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color69, 1);
        float float72 = color69.r;
        com.badlogic.gdx.graphics.Color color73 = color62.sub(color69);
        com.badlogic.gdx.graphics.Color color74 = color59.set(color62);
        com.badlogic.gdx.graphics.Color color75 = color57.add(color62);
        com.badlogic.gdx.graphics.Color color76 = new com.badlogic.gdx.graphics.Color(color75);
        com.badlogic.gdx.graphics.Color color77 = color48.set(color75);
        com.badlogic.gdx.graphics.Color color78 = color48.clamp();
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color78;
        com.badlogic.gdx.graphics.Color color81 = color78.set(65517);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + 0.0f + "'", float72 == 0.0f);
        org.junit.Assert.assertNotNull(color73);
        org.junit.Assert.assertNotNull(color74);
        org.junit.Assert.assertNotNull(color75);
        org.junit.Assert.assertNotNull(color77);
        org.junit.Assert.assertNotNull(color78);
        org.junit.Assert.assertNotNull(color81);
    }

    @Test
    public void test07149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07149");
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
        java.lang.String str23 = lwjgl3ApplicationConfiguration9.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration9.setInitialVisible(true);
        int int26 = lwjgl3ApplicationConfiguration9.g;
        lwjgl3ApplicationConfiguration9.setBackBufferConfig(16710672, (-57375), 57856, 0, (-134242816), (-81856144), (-1407090));
        boolean boolean35 = lwjgl3ApplicationConfiguration9.windowResizable;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 640 + "'", int14 == 640);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ".prefs/" + "'", str23, ".prefs/");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-9216) + "'", int26 == (-9216));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test07150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07150");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-398458880), (float) 285212671, (float) 7576628, (float) (-1966080));
        com.badlogic.gdx.graphics.Color color5 = color4.cpy();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test07151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07151");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2146504448));
    }

    @Test
    public void test07152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07152");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3ApplicationConfiguration0.b = (-33162750);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(16580354);
        int int14 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test07153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07153");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration6.preferencesFileType;
        lwjgl3ApplicationConfiguration6.useGL30 = true;
        lwjgl3ApplicationConfiguration6.useOpenGL3(true, 2047, (-49167));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07154");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888(1.5134407E-19f, (float) (-33162750), (float) (-32));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8160) + "'", int3 == (-8160));
    }

    @Test
    public void test07155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07155");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowWidth = (-18);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test07156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07156");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener15;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test07157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07157");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration6.setaudioDeviceSimultaneousSources((int) (byte) 100);
        int int9 = lwjgl3ApplicationConfiguration6.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test07158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07158");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode9 = lwjgl3ApplicationConfiguration0.hdpiMode;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode9 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode9.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test07159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07159");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (short) 100, 2.1862947E-38f, (float) 2147483647, 1.68296448E8f);
        int int5 = com.badlogic.gdx.graphics.Color.argb8888(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-65281) + "'", int5 == (-65281));
    }

    @Test
    public void test07160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07160");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration19.setpreferencesFileType(fileType20);
        lwjgl3ApplicationConfiguration19.useVsync(false);
        lwjgl3ApplicationConfiguration19.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration26);
        lwjgl3ApplicationConfiguration27.setInitialVisible(true);
        lwjgl3ApplicationConfiguration27.setwindowX(20160);
        lwjgl3ApplicationConfiguration27.setwindowResizable(false);
        int int34 = lwjgl3ApplicationConfiguration27.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int36 = lwjgl3ApplicationConfiguration35.getaudioDeviceBufferSize();
        boolean boolean37 = lwjgl3ApplicationConfiguration35.windowResizable;
        int int38 = lwjgl3ApplicationConfiguration35.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration35.setvSyncEnabled(false);
        boolean boolean41 = lwjgl3ApplicationConfiguration35.getvSyncEnabled();
        lwjgl3ApplicationConfiguration35.r = 140834847;
        lwjgl3ApplicationConfiguration35.setResizable(true);
        boolean boolean46 = lwjgl3ApplicationConfiguration35.getdisableAudio();
        int int47 = lwjgl3ApplicationConfiguration35.getwindowX();
        com.badlogic.gdx.Files.FileType fileType48 = lwjgl3ApplicationConfiguration35.getpreferencesFileType();
        lwjgl3ApplicationConfiguration27.preferencesFileType = fileType48;
        lwjgl3ApplicationConfiguration16.preferencesFileType = fileType48;
        int int51 = lwjgl3ApplicationConfiguration16.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 512 + "'", int36 == 512);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + fileType48 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType48.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 16 + "'", int51 == 16);
    }

    @Test
    public void test07161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07161");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.039215688f, (float) (-906037750), (float) (-1222144), (float) (-2147424768));
    }

    @Test
    public void test07162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07162");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 10;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 0;
        int int16 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setwindowY(495);
        lwjgl3ApplicationConfiguration0.a = (-16252928);
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
    }

    @Test
    public void test07163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07163");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((-8.815718E32f), 0.0f, (float) (-1880097264), (float) (-56577));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-848655) + "'", int4 == (-848655));
    }

    @Test
    public void test07164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07164");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-8407040), 65290, 983023, (-13641696));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6995945E38f) + "'", float4 == (-1.6995945E38f));
    }

    @Test
    public void test07165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07165");
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
        com.badlogic.gdx.graphics.Color color21 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.g = 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode((-270598144), (-469852380));
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1291902430), (-61455));
        lwjgl3ApplicationConfiguration0.r = 1570376701;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(16743932);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color21);
    }

    @Test
    public void test07166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07166");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-33488131));
        int int10 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.windowWidth = (-68060);
        lwjgl3ApplicationConfiguration0.b = (-152494080);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test07167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07167");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("ffff0080");
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test07168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07168");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 43268, 9);
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1902614));
        int int14 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode19 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.windowY = (-335609856);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNull(lwjgl3DisplayMode19);
    }

    @Test
    public void test07169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07169");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.audioDeviceBufferSize = (-10420224);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration10.useVsync(false);
        lwjgl3ApplicationConfiguration10.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        lwjgl3ApplicationConfiguration17.setwindowX((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration17.getpreferencesFileType();
        int int21 = lwjgl3ApplicationConfiguration17.gles30ContextMinorVersion;
        int int22 = lwjgl3ApplicationConfiguration17.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.setdepth((int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType26 = lwjgl3ApplicationConfiguration23.preferencesFileType;
        lwjgl3ApplicationConfiguration17.setpreferencesFileType(fileType26);
        lwjgl3ApplicationConfiguration7.preferencesFileType = fileType26;
        lwjgl3ApplicationConfiguration7.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration7.setWindowListener(lwjgl3WindowListener31);
        boolean boolean33 = lwjgl3ApplicationConfiguration7.getwindowResizable();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertNull(fileType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test07170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07170");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.GREEN;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-18881792);
        int int15 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.title = "fc0000ff";
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test07171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07171");
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
        lwjgl3ApplicationConfiguration0.b = (-59160);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setdepth(64783);
        int int27 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.setdepth(167247232);
        int int30 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test07172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07172");
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
        com.badlogic.gdx.graphics.Color color39 = color37.set((-16580863));
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
        org.junit.Assert.assertNotNull(color39);
    }

    @Test
    public void test07173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07173");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, (int) (byte) 100);
        color4.r = 31;
        com.badlogic.gdx.graphics.Color color16 = color4.add((float) 63519, (-1.6789801E38f), (-1.6950243E38f), (float) 1671296512);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.BLACK;
        float float18 = color17.r;
        com.badlogic.gdx.graphics.Color color23 = color17.set((-8.0750596E37f), 0.0f, (float) (-1L), (float) 65024);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color36 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color36, 16);
        com.badlogic.gdx.graphics.Color color39 = color35.sub(color36);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color36, 1677696502);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color36, 480);
        com.badlogic.gdx.graphics.Color color44 = color17.add(color36);
        float float45 = color36.toFloatBits();
        com.badlogic.gdx.graphics.Color color50 = color36.add((float) (-579592), (float) (-17826304), (-5.360365E37f), (float) 57856);
        com.badlogic.gdx.graphics.Color color51 = color4.sub(color50);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
// flaky:         org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "00ff0000" + "'", str33, "00ff0000");
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 2.1862947E-38f + "'", float45 == 2.1862947E-38f);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color51);
    }

    @Test
    public void test07174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07174");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(2.2407642E-38f, (-4.731522E-22f), 0.73333335f, (float) 16711425);
        int int5 = com.badlogic.gdx.graphics.Color.rgba4444(color4);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, (-570425600));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 191 + "'", int5 == 191);
    }

    @Test
    public void test07175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07175");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-33488131);
        lwjgl3ApplicationConfiguration0.setwindowX((-16734721));
        int int11 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-270598144), (-10420224), 35, 65296, (-16711936), 16648950, (-1));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 34303;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-983040);
        lwjgl3ApplicationConfiguration0.b = 14500320;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test07176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07176");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.windowX = (short) 1;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 16776959;
        int int13 = lwjgl3ApplicationConfiguration0.depth;
        int int14 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.a = 16252680;
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test07177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07177");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        int int5 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test07178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07178");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int14 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        int int17 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(8, (-537010176), 512, 765, (-536969804), (-554880), 64783);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color((float) (byte) 1, 0.0f, (float) (byte) 0, (float) (byte) 100);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color31, (int) 'a');
        com.badlogic.gdx.graphics.Color color34 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color36 = color31.lerp(color34, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color37 = color30.mul(color36);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color37);
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color((-1.5086754E38f), (float) (-436443648), (float) 250675200, (float) 160);
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color((-11604982));
        boolean boolean46 = color43.equals((java.lang.Object) (-11604982));
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color54 = color48.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color54.g = 0.0f;
        com.badlogic.gdx.graphics.Color color58 = color43.lerp(color54, (-1.6950762E38f));
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color((float) 1, (float) (-10887648), (float) (byte) 10, (-1.4936944E38f));
        com.badlogic.gdx.graphics.Color color64 = new com.badlogic.gdx.graphics.Color(color63);
        float float65 = color64.g;
        com.badlogic.gdx.graphics.Color color67 = color64.mul((float) (-34));
        com.badlogic.gdx.graphics.Color color68 = color58.add(color64);
        com.badlogic.gdx.graphics.Color color69 = color37.mul(color58);
        com.badlogic.gdx.graphics.Color color74 = color58.set((float) (-1033186560), (float) (-15663392), (float) (-1407090), (-1.7013861E38f));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 0.0f + "'", float65 == 0.0f);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNotNull(color74);
    }

    @Test
    public void test07179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07179");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color19 = color10.mul(color18);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color10, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color22 = color10.cpy();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        color22.g = (-4.2867603E37f);
        com.badlogic.gdx.graphics.Color color26 = color22.clamp();
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color22);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color26);
    }

    @Test
    public void test07180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07180");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 402587648, 2.950215E-39f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-256) + "'", int2 == (-256));
    }

    @Test
    public void test07181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07181");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowWidth(0);
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int15 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        java.lang.Class<?> wildcardClass16 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07182");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-524536), (float) 6180224, (float) (-138133248), 0.6156863f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-6.0989976E37f) + "'", float4 == (-6.0989976E37f));
    }

    @Test
    public void test07183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07183");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.b = 1677786624;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.depth = 34277;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowResizable;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test07184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07184");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-1143197184), (float) (-820510720), (float) (byte) -1, (float) (-4626));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-65262) + "'", int4 == (-65262));
    }

    @Test
    public void test07185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07185");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color13 = color7.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str15 = color14.toString();
        com.badlogic.gdx.graphics.Color color17 = color7.lerp(color14, (-8.0750596E37f));
        boolean boolean18 = color0.equals((java.lang.Object) color7);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color24 = color7.set(0.0f, (float) (-790528), (float) (-14911125), 0.0f);
        int int25 = com.badlogic.gdx.graphics.Color.rgba4444(color24);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "00ff0000" + "'", str15, "00ff0000");
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test07186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07186");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-255), 100.0f, (float) (byte) 100, (float) 41903542);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str11 = color10.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color10, 1);
        com.badlogic.gdx.graphics.Color color18 = color10.mul((float) 41903542, (float) (-8672), (float) (-50135050), (float) (-10));
        com.badlogic.gdx.graphics.Color color24 = color18.lerp((float) (-65025), (-0.0f), (float) (-65486), (float) (byte) 10, (float) (-1L));
        com.badlogic.gdx.graphics.Color color29 = color24.set((float) 1, (float) 255, (-5.68232E37f), (float) 1677696502);
        float float30 = color24.toFloatBits();
        com.badlogic.gdx.graphics.Color color31 = color4.mul(color24);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color31, 97);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(3);
        com.badlogic.gdx.graphics.Color color40 = color35.set((-6.878755E37f), 2.4259024E-18f, (float) (-2560), 0.0f);
        com.badlogic.gdx.graphics.Color color41 = color31.set(color40);
        int int42 = com.badlogic.gdx.graphics.Color.rgba4444(color31);
        float float43 = color31.toFloatBits();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ffffff00" + "'", str11, "ffffff00");
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-4.28676E37f) + "'", float30 == (-4.28676E37f));
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
    }

    @Test
    public void test07187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07187");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        int int8 = lwjgl3ApplicationConfiguration0.stencil;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        java.lang.String str12 = lwjgl3ApplicationConfiguration11.title;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07188");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str9 = color8.toString();
        com.badlogic.gdx.graphics.Color color11 = color1.lerp(color8, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color12, 16);
        com.badlogic.gdx.graphics.Color color15 = color11.sub(color12);
        com.badlogic.gdx.graphics.Color color21 = color12.lerp(100.0f, (-1.0f), (float) 6529016, (float) (-254), (float) (-248));
        com.badlogic.gdx.graphics.Color color23 = color21.mul((float) (-7936));
        color21.b = (-65279);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00000000" + "'", str9, "00000000");
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test07189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07189");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.audioDeviceBufferSize = (-10420224);
        boolean boolean10 = lwjgl3ApplicationConfiguration7.getwindowDecorated();
        boolean boolean11 = lwjgl3ApplicationConfiguration7.disableAudio;
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration7.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration7.useGL30 = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test07190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07190");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int6 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 640 + "'", int6 == 640);
    }

    @Test
    public void test07191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07191");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.title = "ffff0200";
        lwjgl3ApplicationConfiguration0.setWindowedMode((-16711936), 8897069);
        boolean boolean16 = lwjgl3ApplicationConfiguration0.windowResizable;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration17.setpreferencesFileType(fileType18);
        lwjgl3ApplicationConfiguration17.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration17.setPreferencesConfig("", fileType23);
        lwjgl3ApplicationConfiguration17.g = (short) 0;
        lwjgl3ApplicationConfiguration17.windowX = 35;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.setDecorated(false);
        lwjgl3ApplicationConfiguration29.a = (byte) 10;
        boolean boolean34 = lwjgl3ApplicationConfiguration29.initialVisible;
        int int35 = lwjgl3ApplicationConfiguration29.b;
        lwjgl3ApplicationConfiguration29.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType38 = lwjgl3ApplicationConfiguration29.preferencesFileType;
        lwjgl3ApplicationConfiguration17.setpreferencesFileType(fileType38);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType38);
        int int41 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + fileType38 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType38.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 43268 + "'", int41 == 43268);
    }

    @Test
    public void test07192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07192");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-128512), (float) (-251850752), (float) 47, (float) 1642083276);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((-14622977));
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color17 = color11.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color18 = color9.mul(color17);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color26 = color20.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color26.g = (short) 1;
        com.badlogic.gdx.graphics.Color color30 = color18.lerp(color26, (float) 25500);
        com.badlogic.gdx.graphics.Color color35 = color18.mul(0.0f, (float) (-8142), (float) (-1562574848), (-1.0f));
        com.badlogic.gdx.graphics.Color color36 = color7.set(color18);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(color18);
        com.badlogic.gdx.graphics.Color color39 = color6.lerp(color37, (float) 56864);
        com.badlogic.gdx.graphics.Color color40 = color4.sub(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
    }

    @Test
    public void test07193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07193");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, (-8160));
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
    }

    @Test
    public void test07194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07194");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowWidth(0);
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int15 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType17);
        lwjgl3ApplicationConfiguration16.disableAudio = true;
        lwjgl3ApplicationConfiguration16.initialVisible = true;
        int int23 = lwjgl3ApplicationConfiguration16.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration16.b = (-62986);
        lwjgl3ApplicationConfiguration16.b = 2;
        int int28 = lwjgl3ApplicationConfiguration16.windowHeight;
        boolean boolean29 = lwjgl3ApplicationConfiguration16.disableAudio;
        boolean boolean30 = lwjgl3ApplicationConfiguration16.useGL30;
        lwjgl3ApplicationConfiguration16.setAudioConfig(852308735, 50, 284196832);
        int int35 = lwjgl3ApplicationConfiguration16.getdepth();
        lwjgl3ApplicationConfiguration16.setgles30ContextMajorVersion(13260);
        lwjgl3ApplicationConfiguration16.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration40.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration40.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration40.gles30ContextMajorVersion = 10;
        lwjgl3ApplicationConfiguration40.setwindowHeight(151015132);
        lwjgl3ApplicationConfiguration40.setTitle("88bb2222");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType60 = null;
        lwjgl3ApplicationConfiguration59.setpreferencesFileType(fileType60);
        lwjgl3ApplicationConfiguration59.disableAudio = true;
        lwjgl3ApplicationConfiguration59.initialVisible = true;
        int int66 = lwjgl3ApplicationConfiguration59.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration59.b = (-62986);
        lwjgl3ApplicationConfiguration59.b = 2;
        lwjgl3ApplicationConfiguration59.setwindowX((int) 'a');
        lwjgl3ApplicationConfiguration59.setsamples((int) (short) 10);
        lwjgl3ApplicationConfiguration59.g = 65295;
        boolean boolean77 = lwjgl3ApplicationConfiguration59.initialVisible;
        com.badlogic.gdx.Files.FileType fileType78 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration59.setpreferencesFileType(fileType78);
        lwjgl3ApplicationConfiguration40.setpreferencesFileType(fileType78);
        lwjgl3ApplicationConfiguration16.preferencesFileType = fileType78;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType78);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 480 + "'", int28 == 480);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 16 + "'", int35 == 16);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 512 + "'", int66 == 512);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + fileType78 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType78.equals(com.badlogic.gdx.Files.FileType.Local));
    }

    @Test
    public void test07195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07195");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration6.initialBackgroundColor;
        int int8 = lwjgl3ApplicationConfiguration6.windowY;
        lwjgl3ApplicationConfiguration6.useOpenGL3(false, (-340262899), 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test07196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07196");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.setwindowX((-62986));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration14.setpreferencesFileType(fileType15);
        lwjgl3ApplicationConfiguration14.useVsync(false);
        lwjgl3ApplicationConfiguration14.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        int int24 = lwjgl3ApplicationConfiguration22.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration25.setwindowWidth((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration30.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration30.samples = (-1);
        lwjgl3ApplicationConfiguration30.useGL30 = true;
        lwjgl3ApplicationConfiguration30.setpreferencesDirectory("ffff72ff");
        int int39 = lwjgl3ApplicationConfiguration30.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration30.windowY = 20188;
        int int42 = lwjgl3ApplicationConfiguration30.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = lwjgl3ApplicationConfiguration30.hdpiMode;
        lwjgl3ApplicationConfiguration25.hdpiMode = hdpiMode43;
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode43);
        com.badlogic.gdx.graphics.Color color47 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int48 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 9 + "'", int42 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
    }

    @Test
    public void test07197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07197");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.depth = (-537010176);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-50396672), (int) '#');
        lwjgl3ApplicationConfiguration0.setwindowX((-393464));
        int int19 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-393464) + "'", int19 == (-393464));
    }

    @Test
    public void test07198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07198");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.r = (-587202461);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int18 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test07199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07199");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 4590, (-1.114131E-10f), (float) (-1313754704));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1856073728) + "'", int3 == (-1856073728));
    }

    @Test
    public void test07200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07200");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.r = 140834847;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setTitle("ffff0080");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test07201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07201");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1932040192, 0.0f, (-255.0f), (float) (-16581120));
    }

    @Test
    public void test07202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07202");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        com.badlogic.gdx.Files.FileType fileType4 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int5 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int6 = lwjgl3ApplicationConfiguration0.samples;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07203");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CHARTREUSE;
        color0.r = (-16776961);
        int int3 = com.badlogic.gdx.graphics.Color.rgb888(color0);
        int int4 = com.badlogic.gdx.graphics.Color.rgb565(color0);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 39936 + "'", int3 == 39936);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16188608 + "'", int4 == 16188608);
    }

    @Test
    public void test07204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07204");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-1056));
        com.badlogic.gdx.graphics.Color color6 = color1.set((float) (-1313754704), 65024.0f, (float) (-2496512), (-4.153069E34f));
        int int7 = com.badlogic.gdx.graphics.Color.rgb565(color6);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2016 + "'", int7 == 2016);
    }

    @Test
    public void test07205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07205");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        int int6 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType8);
        lwjgl3ApplicationConfiguration7.disableAudio = true;
        int int12 = lwjgl3ApplicationConfiguration7.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode13 = lwjgl3ApplicationConfiguration7.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration15.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration15.windowX = 100;
        int int20 = lwjgl3ApplicationConfiguration15.g;
        com.badlogic.gdx.Files.FileType fileType21 = lwjgl3ApplicationConfiguration15.preferencesFileType;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("4169e1ff", fileType21);
        lwjgl3ApplicationConfiguration7.title = "ffff72ff";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = lwjgl3ApplicationConfiguration7.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode25);
        boolean boolean27 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = lwjgl3ApplicationConfiguration0.windowListener;
        int int29 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + fileType21 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType21.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test07206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07206");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        int int6 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setAudioConfig(1677696502, (-10420224), (-16));
        int int11 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int12 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test07207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07207");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        lwjgl3ApplicationConfiguration0.setdepth(0);
        lwjgl3ApplicationConfiguration0.setwindowX(640);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("0ff00000");
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test07208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07208");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int16 = lwjgl3ApplicationConfiguration15.getaudioDeviceBufferSize();
        boolean boolean17 = lwjgl3ApplicationConfiguration15.windowResizable;
        lwjgl3ApplicationConfiguration15.disableAudio = false;
        lwjgl3ApplicationConfiguration15.setwindowHeight((int) (byte) 10);
        int int22 = lwjgl3ApplicationConfiguration15.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration23.setpreferencesFileType(fileType24);
        lwjgl3ApplicationConfiguration23.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration23.setPreferencesConfig("", fileType29);
        lwjgl3ApplicationConfiguration23.g = (short) 0;
        lwjgl3ApplicationConfiguration23.windowX = 35;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode35 = lwjgl3ApplicationConfiguration23.hdpiMode;
        lwjgl3ApplicationConfiguration15.hdpiMode = hdpiMode35;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode35;
        boolean boolean38 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-636610560));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode35 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode35.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test07209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07209");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(20160);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color20.r = 63519;
        com.badlogic.gdx.graphics.Color color28 = color20.lerp((float) 1, (-1.6974137E38f), (float) 9, 0.19607843f, (float) (-255));
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color28);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        boolean boolean31 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 1044480;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test07210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07210");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(15687677);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode9 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3DisplayMode9);
    }

    @Test
    public void test07211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07211");
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
        int int30 = lwjgl3ApplicationConfiguration16.depth;
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration16.setFullscreenMode(displayMode31);
        int int33 = lwjgl3ApplicationConfiguration16.g;
        int int34 = lwjgl3ApplicationConfiguration16.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration16.setwindowHeight((-8414));
        lwjgl3ApplicationConfiguration16.setvSyncEnabled(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16 + "'", int30 == 16);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 16 + "'", int34 == 16);
    }

    @Test
    public void test07212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07212");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int13 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test07213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07213");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha(0.0f, (float) (-1203355648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test07214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07214");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int15 = lwjgl3ApplicationConfiguration14.getsamples();
        int int16 = lwjgl3ApplicationConfiguration14.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration17.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration17.windowX = 100;
        int int22 = lwjgl3ApplicationConfiguration17.g;
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration17.getpreferencesFileType();
        lwjgl3ApplicationConfiguration17.initialVisible = false;
        int int26 = lwjgl3ApplicationConfiguration17.getaudioDeviceBufferSize();
        boolean boolean27 = lwjgl3ApplicationConfiguration17.initialVisible;
        com.badlogic.gdx.Files.FileType fileType28 = lwjgl3ApplicationConfiguration17.preferencesFileType;
        lwjgl3ApplicationConfiguration14.preferencesFileType = fileType28;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07215");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color7 = color2.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = color1.sub(color7);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color14 = color12.mul((float) (-14513374));
        com.badlogic.gdx.graphics.Color color15 = color11.set(color12);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color11, 0);
        com.badlogic.gdx.graphics.Color color22 = color11.sub((-1.7005551E38f), (float) 1044480, 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color23 = color22.clamp();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color23, (-1879860224));
        com.badlogic.gdx.graphics.Color color26 = color23.cpy();
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color23);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color26);
    }

    @Test
    public void test07216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07216");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 50, (float) 256, (float) (-16794448));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1308688384) + "'", int3 == (-1308688384));
    }

    @Test
    public void test07217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07217");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 16707600, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration19.windowResizable = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
    }

    @Test
    public void test07218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07218");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int7 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.r = (-1109610);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00001100";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test07219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07219");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        color4.b = 65025;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str8 = lwjgl3ApplicationConfiguration7.title;
        lwjgl3ApplicationConfiguration7.a = (-1);
        boolean boolean11 = lwjgl3ApplicationConfiguration7.vSyncEnabled;
        lwjgl3ApplicationConfiguration7.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color14 = lwjgl3ApplicationConfiguration7.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color17 = color4.sub(color15);
        float float18 = color17.toFloatBits();
        com.badlogic.gdx.graphics.Color color20 = color17.mul((float) 13260);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color17, 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 2.3418052E-38f + "'", float18 == 2.3418052E-38f);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test07220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07220");
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
        int int19 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1728));
        int int22 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
    }

    @Test
    public void test07221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07221");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (byte) 1;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-1610612736);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1439745), (-1439745));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
    }

    @Test
    public void test07222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07222");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-61200), 0.13333334f, (-2.32278428E17f), (float) (-96));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-4.8515605E37f) + "'", float4 == (-4.8515605E37f));
    }

    @Test
    public void test07223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07223");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.windowHeight = 'a';
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        int int15 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test07224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07224");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-134242816), (float) (-2105704448), (-4.454078E37f), (float) (-65568));
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((-918031));
        com.badlogic.gdx.graphics.Color color7 = color4.set(color6);
        com.badlogic.gdx.graphics.Color color8 = color4.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color9 = color8.cpy();
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test07225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07225");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        boolean boolean11 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-78), (-16734721));
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("00004edc");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test07226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07226");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean10 = lwjgl3ApplicationConfiguration0.initialVisible;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test07227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07227");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 6180224, (float) (-259084), (float) 70560, (-2.9090986E28f));
    }

    @Test
    public void test07228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07228");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444(0.039179448f, (float) (-570490625), (float) (-1056), (float) 4065);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-201169) + "'", int4 == (-201169));
    }

    @Test
    public void test07229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07229");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowWidth(0);
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int14 = lwjgl3ApplicationConfiguration0.windowY;
        int int15 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test07230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07230");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        lwjgl3ApplicationConfiguration0.setwindowHeight(151015132);
        lwjgl3ApplicationConfiguration0.setTitle("88bb2222");
        int int19 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int20 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.title = "ffffffb2";
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(8897069);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 151015132 + "'", int19 == 151015132);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test07231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07231");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.windowHeight = (-2117940064);
        int int19 = lwjgl3ApplicationConfiguration0.stencil;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration20.setgles30ContextMinorVersion(1557110528);
        lwjgl3ApplicationConfiguration20.setuseGL30(true);
        lwjgl3ApplicationConfiguration20.setwindowWidth((-16646400));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
    }

    @Test
    public void test07232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07232");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-2147438080));
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setDecorated(false);
        lwjgl3ApplicationConfiguration6.a = (byte) 10;
        boolean boolean11 = lwjgl3ApplicationConfiguration6.initialVisible;
        int int12 = lwjgl3ApplicationConfiguration6.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration6.windowListener;
        lwjgl3ApplicationConfiguration6.setvSyncEnabled(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType17);
        lwjgl3ApplicationConfiguration16.disableAudio = true;
        lwjgl3ApplicationConfiguration16.setsamples((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration24.setpreferencesFileType(fileType25);
        lwjgl3ApplicationConfiguration24.useVsync(false);
        lwjgl3ApplicationConfiguration24.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration24.a = (-62986);
        lwjgl3ApplicationConfiguration24.setdisableAudio(true);
        boolean boolean36 = lwjgl3ApplicationConfiguration24.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration38.setFullscreenMode(displayMode39);
        lwjgl3ApplicationConfiguration38.windowX = 100;
        int int43 = lwjgl3ApplicationConfiguration38.g;
        com.badlogic.gdx.Files.FileType fileType44 = lwjgl3ApplicationConfiguration38.getpreferencesFileType();
        lwjgl3ApplicationConfiguration24.setPreferencesConfig("ffffff00", fileType44);
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("ffff72ff", fileType44);
        lwjgl3ApplicationConfiguration6.setpreferencesFileType(fileType44);
        com.badlogic.gdx.Files.FileType fileType48 = lwjgl3ApplicationConfiguration6.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType48);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration50.initialVisible = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener53 = null;
        lwjgl3ApplicationConfiguration50.windowListener = lwjgl3WindowListener53;
        java.lang.String str55 = lwjgl3ApplicationConfiguration50.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
        org.junit.Assert.assertTrue("'" + fileType44 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType44.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType48 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType48.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration50);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + ".prefs/" + "'", str55, ".prefs/");
    }

    @Test
    public void test07233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07233");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.windowY = (-50396672);
        lwjgl3ApplicationConfiguration0.setwindowWidth((-1241513983));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test07234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07234");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration6.setAudioConfig(1677696502, (-50396672), 2);
        int int11 = lwjgl3ApplicationConfiguration6.getwindowWidth();
        lwjgl3ApplicationConfiguration6.disableAudio(false);
        int int14 = lwjgl3ApplicationConfiguration6.getaudioDeviceBufferCount();
        boolean boolean15 = lwjgl3ApplicationConfiguration6.windowResizable;
        lwjgl3ApplicationConfiguration6.setwindowX((-3200));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test07235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07235");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowWidth = 65522;
        lwjgl3ApplicationConfiguration0.b = 11280416;
        lwjgl3ApplicationConfiguration0.windowWidth = (-65400);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(0);
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int22 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test07236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07236");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 'a', (-1.0f), (float) '#', (float) 1L);
        int int5 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        int int6 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, 184504044);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16711935 + "'", int5 == 16711935);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-16711681) + "'", int6 == (-16711681));
    }

    @Test
    public void test07237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07237");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-32770560), (float) (-1980237824), 4.6550913E-6f, 1.7347235E-18f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 916455424 + "'", int4 == 916455424);
    }

    @Test
    public void test07238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07238");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 65025, (float) (-397537), (float) (-16777216), (float) 32);
    }

    @Test
    public void test07239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07239");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.67129651E9f, (float) (-14540110), (float) 2, (-1.5659187E38f));
        com.badlogic.gdx.graphics.Color color5 = color4.cpy();
        int int6 = com.badlogic.gdx.graphics.Color.rgba8888(color5);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-16711936) + "'", int6 == (-16711936));
    }

    @Test
    public void test07240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07240");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = lwjgl3ApplicationConfiguration15.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration15.initialBackgroundColor;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertNotNull(color19);
    }

    @Test
    public void test07241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07241");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-469852380);
        lwjgl3ApplicationConfiguration0.setWindowedMode(4095, 50918400);
        int int14 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-194841600);
        lwjgl3ApplicationConfiguration0.windowX = (-85425);
        int int19 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 50918400 + "'", int19 == 50918400);
    }

    @Test
    public void test07242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07242");
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
        com.badlogic.gdx.graphics.Color color30 = color24.lerp(1.0f, (float) 13119, (float) (-16777199), (float) (-16711680), (float) (-201326593));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str32 = lwjgl3ApplicationConfiguration31.title;
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color33, 16);
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color33);
        com.badlogic.gdx.graphics.Color color41 = color33.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color49 = color43.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color50 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str51 = color50.toString();
        com.badlogic.gdx.graphics.Color color53 = color43.lerp(color50, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color54 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color54, 16);
        com.badlogic.gdx.graphics.Color color57 = color53.sub(color54);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color54, 1677696502);
        com.badlogic.gdx.graphics.Color color60 = color33.sub(color54);
        int int61 = com.badlogic.gdx.graphics.Color.argb8888(color54);
        com.badlogic.gdx.graphics.Color color62 = color30.set(color54);
        int int63 = color54.toIntBits();
        com.badlogic.gdx.graphics.Color color64 = com.badlogic.gdx.graphics.Color.SCARLET;
        color64.b = '#';
        com.badlogic.gdx.graphics.Color color67 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color69 = color64.lerp(color67, (float) 1L);
        com.badlogic.gdx.graphics.Color color70 = color67.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color71 = new com.badlogic.gdx.graphics.Color(color70);
        com.badlogic.gdx.graphics.Color color72 = color54.sub(color70);
        float float73 = color72.toFloatBits();
        com.badlogic.gdx.graphics.Color color78 = color72.sub((float) (-823132400), 0.016916571f, (float) (-14368), (float) 16649715);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16777215 + "'", int20 == 16777215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-256) + "'", int21 == (-256));
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "00ff0000" + "'", str51, "00ff0000");
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNotNull(color70);
        org.junit.Assert.assertNotNull(color72);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + 0.0f + "'", float73 == 0.0f);
        org.junit.Assert.assertNotNull(color78);
    }

    @Test
    public void test07243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07243");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration8.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        boolean boolean12 = lwjgl3ApplicationConfiguration11.windowResizable;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test07244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07244");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(65295);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-335), (-14492160));
        int int13 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 2099200;
        lwjgl3ApplicationConfiguration0.title = "ffffffb2";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.windowX = 10224804;
        int int22 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode23 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode23;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test07245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07245");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 167247232;
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        int int22 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int23 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 640 + "'", int22 == 640);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test07246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07246");
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
        int int16 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int18 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test07247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07247");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.GREEN;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.b = (-10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(0);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        boolean boolean21 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType23);
        lwjgl3ApplicationConfiguration22.useVsync(false);
        lwjgl3ApplicationConfiguration22.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        boolean boolean30 = lwjgl3ApplicationConfiguration22.windowDecorated;
        lwjgl3ApplicationConfiguration22.useVsync(false);
        lwjgl3ApplicationConfiguration22.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration35.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration35.setwindowResizable(true);
        int int40 = lwjgl3ApplicationConfiguration35.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode41 = lwjgl3ApplicationConfiguration35.hdpiMode;
        lwjgl3ApplicationConfiguration22.hdpiMode = hdpiMode41;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode41);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-57312), (-134242816));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode41 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode41.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test07248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07248");
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
        lwjgl3ApplicationConfiguration0.windowHeight = 97;
        int int16 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-50396672));
        boolean boolean19 = lwjgl3ApplicationConfiguration0.initialVisible;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test07249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07249");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-16711698), (float) (-65025), (float) (-246), (float) (-19889));
    }

    @Test
    public void test07250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07250");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 100;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode10;
        lwjgl3ApplicationConfiguration0.setdepth((-148446976));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test07251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07251");
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
        int int60 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setwindowY(16580354);
        int int63 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener64 = lwjgl3ApplicationConfiguration0.windowListener;
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 512 + "'", int60 == 512);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 480 + "'", int63 == 480);
        org.junit.Assert.assertNull(lwjgl3WindowListener64);
    }

    @Test
    public void test07252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07252");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.g = (short) 0;
        lwjgl3ApplicationConfiguration0.windowX = 35;
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(63736);
        int int15 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setAudioConfig(570425395, (-27133), 2147483647);
        int int20 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.stencil = (-45390);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-37995));
        int int25 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test07253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07253");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        int int8 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int9 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.b = 587202559;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(640);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test07254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07254");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str3 = color2.toString();
        com.badlogic.gdx.graphics.Color color5 = color2.set((-62986));
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str7 = color6.toString();
        com.badlogic.gdx.graphics.Color color9 = color6.set((-62986));
        com.badlogic.gdx.graphics.Color color10 = color5.sub(color9);
        com.badlogic.gdx.graphics.Color color11 = color0.add(color9);
        float float12 = color9.a;
        int int13 = com.badlogic.gdx.graphics.Color.rgb565(color9);
        com.badlogic.gdx.graphics.Color color18 = color9.mul(7.34684E-40f, (float) (-3600), (float) 3581985, 0.0f);
        int int19 = color9.toIntBits();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00ff0000" + "'", str3, "00ff0000");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ffff09f6" + "'", str7, "ffff09f6");
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test07255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07255");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        int int8 = lwjgl3ApplicationConfiguration0.r;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration13.setFullscreenMode(displayMode14);
        com.badlogic.gdx.Files.FileType fileType16 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration13.setwindowY(100);
        lwjgl3ApplicationConfiguration13.r = 0;
        lwjgl3ApplicationConfiguration13.setsamples(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration24.setpreferencesFileType(fileType25);
        lwjgl3ApplicationConfiguration24.disableAudio = true;
        lwjgl3ApplicationConfiguration24.initialVisible = true;
        int int31 = lwjgl3ApplicationConfiguration24.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration24.b = (-62986);
        lwjgl3ApplicationConfiguration24.b = 2;
        lwjgl3ApplicationConfiguration24.setwindowX((int) 'a');
        lwjgl3ApplicationConfiguration24.setsamples((int) (short) 10);
        lwjgl3ApplicationConfiguration24.g = 65295;
        boolean boolean42 = lwjgl3ApplicationConfiguration24.initialVisible;
        com.badlogic.gdx.Files.FileType fileType43 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration24.setpreferencesFileType(fileType43);
        lwjgl3ApplicationConfiguration13.preferencesFileType = fileType43;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00000000", fileType43);
        int int47 = lwjgl3ApplicationConfiguration0.samples;
        int int48 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int49 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color52 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color57 = color52.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color58 = color51.sub(color57);
        com.badlogic.gdx.graphics.Color color59 = new com.badlogic.gdx.graphics.Color(color51);
        int int60 = color59.toIntBits();
        com.badlogic.gdx.graphics.Color color61 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color62 = color61.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color62, 1);
        int int65 = color62.toIntBits();
        com.badlogic.gdx.graphics.Color color66 = new com.badlogic.gdx.graphics.Color(color62);
        com.badlogic.gdx.graphics.Color color67 = color59.mul(color66);
        com.badlogic.gdx.graphics.Color color68 = color66.clamp();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color66);
        int int70 = com.badlogic.gdx.graphics.Color.rgba4444(color66);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + fileType16 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType16.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + fileType43 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType43.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 16 + "'", int49 == 16);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-16252928) + "'", int65 == (-16252928));
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 15 + "'", int70 == 15);
    }

    @Test
    public void test07256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07256");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int5 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-587726848);
        int int8 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void test07257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07257");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration8.getaudioDeviceBufferCount();
        int int11 = lwjgl3ApplicationConfiguration8.getwindowWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration8.windowListener = lwjgl3WindowListener12;
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration8.preferencesFileType;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
        org.junit.Assert.assertNull(fileType14);
    }

    @Test
    public void test07258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07258");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setWindowPosition(6528000, 0);
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.WHITE;
        com.badlogic.gdx.graphics.Color color11 = color10.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color13 = color10.mul((-1.7005551E38f));
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test07259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07259");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) -1);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((float) 6356992, (float) 16, (float) (-65024), (float) 2016);
        com.badlogic.gdx.graphics.Color color8 = color1.lerp(color6, (-5.68232E37f));
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.ORANGE;
        com.badlogic.gdx.graphics.Color color15 = color10.sub((float) 43268, (float) '#', (float) (-512), (float) (-65400));
        com.badlogic.gdx.graphics.Color color16 = color6.sub(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color17, 1543479776);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test07260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07260");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1241513983), 6147990);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNull(fileType14);
    }

    @Test
    public void test07261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07261");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-270598144);
        int int12 = lwjgl3ApplicationConfiguration0.r;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test07262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07262");
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
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int16 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode19 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode19);
    }

    @Test
    public void test07263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07263");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-10));
    }

    @Test
    public void test07264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07264");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.setdepth((-1562574848));
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.depth = 65535;
        lwjgl3ApplicationConfiguration0.setwindowY((-8142));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test07265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07265");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.b = 100;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration14.windowX = 100;
        int int19 = lwjgl3ApplicationConfiguration14.g;
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration14.getpreferencesFileType();
        lwjgl3ApplicationConfiguration14.initialVisible = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int25 = lwjgl3ApplicationConfiguration24.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration24.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType28 = lwjgl3ApplicationConfiguration24.preferencesFileType;
        lwjgl3ApplicationConfiguration14.setPreferencesConfig("ffffffff", fileType28);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("4169e1ff", fileType28);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-14513374);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07266");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        com.badlogic.gdx.Files.FileType fileType4 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int5 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration8.windowX = 100;
        int int13 = lwjgl3ApplicationConfiguration8.g;
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration8.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType19 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration15.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration8.setpreferencesFileType(fileType19);
        lwjgl3ApplicationConfiguration8.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration24);
        java.lang.String str26 = lwjgl3ApplicationConfiguration24.title;
        lwjgl3ApplicationConfiguration24.audioDeviceBufferCount = 16;
        lwjgl3ApplicationConfiguration24.setwindowWidth(34303);
        com.badlogic.gdx.Files.FileType fileType31 = lwjgl3ApplicationConfiguration24.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType31;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType19 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType19.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + fileType31 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType31.equals(com.badlogic.gdx.Files.FileType.Absolute));
    }

    @Test
    public void test07267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07267");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-65568));
        color1.b = (-459000);
    }

    @Test
    public void test07268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07268");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((-1.6988335E38f), (float) (-8407040));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2143795200) + "'", int2 == (-2143795200));
    }

    @Test
    public void test07269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07269");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.initialVisible;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode3 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        int int4 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 480 + "'", int1 == 480);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(lwjgl3DisplayMode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test07270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07270");
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
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType17);
        lwjgl3ApplicationConfiguration16.disableAudio = true;
        lwjgl3ApplicationConfiguration16.b = (short) -1;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float25 = color24.a;
        int int26 = color24.toIntBits();
        lwjgl3ApplicationConfiguration16.initialBackgroundColor = color24;
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color35 = color29.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color36 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str37 = color36.toString();
        com.badlogic.gdx.graphics.Color color39 = color29.lerp(color36, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color40 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color40, 16);
        com.badlogic.gdx.graphics.Color color43 = color39.sub(color40);
        color39.r = 0.0f;
        boolean boolean46 = color24.equals((java.lang.Object) color39);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color39;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-1904640));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-33488131) + "'", int15 == (-33488131));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "00ff0000" + "'", str37, "00ff0000");
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test07271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07271");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        java.lang.String str7 = lwjgl3ApplicationConfiguration0.title;
        int int8 = lwjgl3ApplicationConfiguration0.g;
        int int9 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        int int12 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.windowHeight = (-55800);
        lwjgl3ApplicationConfiguration0.windowWidth = 520091936;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test07272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07272");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int11 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.windowX = (-3062);
        lwjgl3ApplicationConfiguration0.b = (-1170);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-16794448), 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test07273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07273");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        lwjgl3ApplicationConfiguration0.title = "";
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowHeight = (-194841600);
        lwjgl3ApplicationConfiguration0.windowWidth = (-128);
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test07274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07274");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 65533, (float) 1677721600, (-1.7009715E38f), (float) 61455);
    }

    @Test
    public void test07275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07275");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(2047);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color1, (-2176));
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8943616) + "'", int4 == (-8943616));
    }

    @Test
    public void test07276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07276");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.r = 1677696502;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int19 = lwjgl3ApplicationConfiguration18.getgles30ContextMinorVersion();
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color20, (-256));
        int int23 = color20.toIntBits();
        lwjgl3ApplicationConfiguration18.setInitialBackgroundColor(color20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration18);
        lwjgl3ApplicationConfiguration18.setAudioConfig((-1034), (-15144036), 1677721600);
        int int30 = lwjgl3ApplicationConfiguration18.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-16719105) + "'", int23 == (-16719105));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-15144036) + "'", int30 == (-15144036));
    }

    @Test
    public void test07277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07277");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        boolean boolean18 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test07278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07278");
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
        int int17 = lwjgl3ApplicationConfiguration10.getwindowY();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test07279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07279");
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
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration18.setpreferencesFileType(fileType19);
        lwjgl3ApplicationConfiguration18.disableAudio = true;
        int int23 = lwjgl3ApplicationConfiguration18.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode24 = lwjgl3ApplicationConfiguration18.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration26.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration26.windowX = 100;
        int int31 = lwjgl3ApplicationConfiguration26.g;
        com.badlogic.gdx.Files.FileType fileType32 = lwjgl3ApplicationConfiguration26.preferencesFileType;
        lwjgl3ApplicationConfiguration18.setPreferencesConfig("4169e1ff", fileType32);
        boolean boolean34 = lwjgl3ApplicationConfiguration18.initialVisible;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration35.setpreferencesFileType(fileType36);
        lwjgl3ApplicationConfiguration35.disableAudio = true;
        int int40 = lwjgl3ApplicationConfiguration35.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode41 = lwjgl3ApplicationConfiguration35.fullscreenMode;
        lwjgl3ApplicationConfiguration35.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration35.setwindowY((int) '#');
        int int46 = lwjgl3ApplicationConfiguration35.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode48 = null;
        lwjgl3ApplicationConfiguration47.setFullscreenMode(displayMode48);
        lwjgl3ApplicationConfiguration47.windowX = 100;
        int int52 = lwjgl3ApplicationConfiguration47.stencil;
        int int53 = lwjgl3ApplicationConfiguration47.windowY;
        lwjgl3ApplicationConfiguration47.a = 43268;
        int int56 = lwjgl3ApplicationConfiguration47.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration47.setdepth(512);
        lwjgl3ApplicationConfiguration47.g = (byte) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType62 = null;
        lwjgl3ApplicationConfiguration61.setpreferencesFileType(fileType62);
        lwjgl3ApplicationConfiguration61.useVsync(false);
        lwjgl3ApplicationConfiguration61.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration61.a = (-62986);
        lwjgl3ApplicationConfiguration61.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode73 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration61.hdpiMode = hdpiMode73;
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration35.hdpiMode = hdpiMode73;
        lwjgl3ApplicationConfiguration18.hdpiMode = hdpiMode73;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode73;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode79 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode73 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode73.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNull(lwjgl3DisplayMode79);
    }

    @Test
    public void test07280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07280");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.GREEN;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.b = (-10);
        lwjgl3ApplicationConfiguration0.windowY = (-32);
        lwjgl3ApplicationConfiguration0.windowX = 716800;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test07281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07281");
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
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test07282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07282");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-4106));
        lwjgl3ApplicationConfiguration0.setwindowY(63519);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(150470656);
    }

    @Test
    public void test07283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07283");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-33488131));
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration0.windowListener;
        int int14 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test07284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07284");
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
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test07285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07285");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-1562574848), 1.5612034E-37f, (float) (-918031));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-28458960) + "'", int3 == (-28458960));
    }

    @Test
    public void test07286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07286");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffff0000";
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.title;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        int int10 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
    }

    @Test
    public void test07287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07287");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration3.windowListener = lwjgl3WindowListener4;
        boolean boolean6 = lwjgl3ApplicationConfiguration3.getdisableAudio();
        lwjgl3ApplicationConfiguration3.windowWidth = (-12632257);
        lwjgl3ApplicationConfiguration3.setaudioDeviceSimultaneousSources((-11280864));
        lwjgl3ApplicationConfiguration3.gles30ContextMinorVersion = 0;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test07288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07288");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        int int9 = com.badlogic.gdx.graphics.Color.rgba4444(color6);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color15 = color10.set((float) 15687677, (float) 2, (float) 1L, (float) (-240));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration16.setwindowResizable(true);
        lwjgl3ApplicationConfiguration16.gles30ContextMajorVersion = (-567943452);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration16.windowListener = lwjgl3WindowListener23;
        lwjgl3ApplicationConfiguration16.setdepth((-16741598));
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color36 = color30.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color37 = color28.mul(color36);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color28, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color40 = color28.cpy();
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color28);
        com.badlogic.gdx.graphics.Color color42 = color15.set(color28);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        color43.g = 35;
        int int46 = com.badlogic.gdx.graphics.Color.rgba4444(color43);
        com.badlogic.gdx.graphics.Color color47 = color15.add(color43);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color47, 3570);
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color(color47);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ffffff0e" + "'", str8, "ffffff0e");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65520 + "'", int9 == 65520);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 191759 + "'", int46 == 191759);
        org.junit.Assert.assertNotNull(color47);
    }

    @Test
    public void test07289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07289");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color18.g = (short) 1;
        com.badlogic.gdx.graphics.Color color22 = color10.lerp(color18, (float) 25500);
        int int23 = com.badlogic.gdx.graphics.Color.rgba8888(color22);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color22);
        java.lang.String str25 = color24.toString();
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-256) + "'", int23 == (-256));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ffffff00" + "'", str25, "ffffff00");
    }

    @Test
    public void test07290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07290");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode11;
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test07291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07291");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowWidth = 65522;
        lwjgl3ApplicationConfiguration0.windowWidth = 6356992;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1879860224), (int) (short) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int22 = lwjgl3ApplicationConfiguration21.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = lwjgl3ApplicationConfiguration21.windowListener;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener23);
    }

    @Test
    public void test07292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07292");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        color0.a = (short) 10;
        float float3 = color0.toFloatBits();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-6.490371E32f) + "'", float3 == (-6.490371E32f));
    }

    @Test
    public void test07293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07293");
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
        int int31 = lwjgl3ApplicationConfiguration0.depth;
        int int32 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16 + "'", int31 == 16);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test07294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07294");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int12 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1677786624, (-10), 3306396, 3306396, (-1562574848), (-334888960), (int) '4');
        int int21 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        int int24 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.samples = 13090;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1677786624 + "'", int21 == 1677786624);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test07295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07295");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 2550, (float) (-3584), (float) (-1880097264), (float) 653309);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-22573) + "'", int4 == (-22573));
    }

    @Test
    public void test07296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07296");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) 1);
        lwjgl3ApplicationConfiguration0.depth = (-510);
        lwjgl3ApplicationConfiguration0.setwindowY((-532209));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test07297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07297");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-1224736769));
    }

    @Test
    public void test07298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07298");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) '#', (-5.360365E37f), 3.6969962E36f, 0.0f);
    }

    @Test
    public void test07299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07299");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int9 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
    }

    @Test
    public void test07300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07300");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        int int13 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int14 = lwjgl3ApplicationConfiguration0.g;
        int int15 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.samples = 25500;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-10026973));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test07301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07301");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.windowY = (-2147283968);
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int11 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.windowHeight = (-140517376);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
    }

    @Test
    public void test07302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07302");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-268), (float) 15397887, (float) 25500, (float) 14317056);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7013871E38f) + "'", float4 == (-1.7013871E38f));
    }

    @Test
    public void test07303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07303");
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
        boolean boolean21 = lwjgl3ApplicationConfiguration16.vSyncEnabled;
        int int22 = lwjgl3ApplicationConfiguration16.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration16.setdepth(0);
        int int25 = lwjgl3ApplicationConfiguration16.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test07304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07304");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-840));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test07305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07305");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-1308557313), 0, (-570490625), 4607);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test07306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07306");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.0f), (float) (-14492160), 0.0f, (float) (-12775665));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration5.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration5.useVsync(false);
        lwjgl3ApplicationConfiguration5.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration5.a = (-62986);
        int int15 = lwjgl3ApplicationConfiguration5.windowY;
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color22 = color20.set((int) (short) 0);
        lwjgl3ApplicationConfiguration5.setInitialBackgroundColor(color22);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color22, 1677696502);
        boolean boolean26 = color4.equals((java.lang.Object) 1677696502);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test07307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07307");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 6147990, (float) (byte) -1, (float) (-61455), (float) 15687677);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
    }

    @Test
    public void test07308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07308");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("00ffff00");
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test07309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07309");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CLEAR;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-1980237824), 9.18893E-39f, (-4.153069E34f), (float) (-50135050));
        com.badlogic.gdx.graphics.Color color6 = color0.clamp();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color0, 184504044);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test07310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07310");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(131072);
    }

    @Test
    public void test07311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07311");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GREEN;
        com.badlogic.gdx.graphics.Color color6 = color0.lerp((-4.581683E37f), (float) 20160, (float) 13260, (float) (-187392), (float) (-1879860224));
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color6, (-27809536));
        com.badlogic.gdx.graphics.Color color10 = color6.mul((float) 1794115036);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.WHITE;
        com.badlogic.gdx.graphics.Color color12 = color10.sub(color11);
        com.badlogic.gdx.graphics.Color color13 = color12.clamp();
        com.badlogic.gdx.graphics.Color color18 = color12.set((float) (-1929387520), (float) (byte) -1, (float) 65024, (float) 32);
        float float19 = color18.a;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }

    @Test
    public void test07312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07312");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.windowY = 20188;
        lwjgl3ApplicationConfiguration0.setwindowY(12263936);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test07313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07313");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setsamples(1785);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test07314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07314");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        int int14 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        int int17 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowWidth = 1426063359;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
    }

    @Test
    public void test07315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07315");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color6 = color4.set((int) (short) 0);
        com.badlogic.gdx.graphics.Color color11 = color4.set(7.175E-43f, (float) 1610620896, (float) (-1116802816), 0.05882353f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test07316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07316");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color19 = color13.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str21 = color20.toString();
        com.badlogic.gdx.graphics.Color color23 = color13.lerp(color20, (-8.0750596E37f));
        int int24 = com.badlogic.gdx.graphics.Color.rgb888(color23);
        int int25 = com.badlogic.gdx.graphics.Color.rgba8888(color23);
        float float26 = color23.toFloatBits();
        float float27 = color23.r;
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color23);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        int int30 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "00ff0000" + "'", str21, "00ff0000");
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16711935 + "'", int24 == 16711935);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-16711936) + "'", int25 == (-16711936));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 2.3418409E-38f + "'", float26 == 2.3418409E-38f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16 + "'", int30 == 16);
    }

    @Test
    public void test07317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07317");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(61455);
        float float2 = color1.toFloatBits();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9164568E-30f + "'", float2 == 5.9164568E-30f);
    }

    @Test
    public void test07318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07318");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.b = 1677786624;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test07319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07319");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-110329856));
    }

    @Test
    public void test07320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07320");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration8.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration8.fullscreenMode;
        int int13 = lwjgl3ApplicationConfiguration8.getsamples();
        com.badlogic.gdx.graphics.Color color14 = lwjgl3ApplicationConfiguration8.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color16 = color14.mul(0.0f);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test07321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07321");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(20160);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int16 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        int int19 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test07322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07322");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.windowResizable;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setdepth((-19889));
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
    }

    @Test
    public void test07323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07323");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
    }

    @Test
    public void test07324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07324");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = lwjgl3ApplicationConfiguration0.hdpiMode;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test07325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07325");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("ff00ffff");
        com.badlogic.gdx.graphics.Color color2 = color1.premultiplyAlpha();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test07326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07326");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setdepth((-1879860224));
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test07327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07327");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setwindowX(1677786624);
        lwjgl3ApplicationConfiguration0.samples = (-1233649409);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07328");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2113928961));
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color7 = color1.set((float) 191759, (-1.7014053E38f), (-1.6948277E38f), 4.5183064E-38f);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test07329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07329");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color7 = color2.add((-5.76451956E17f), 2.87E-42f, 0.44444445f, 5.0192666E30f);
        com.badlogic.gdx.graphics.Color color12 = color2.mul((float) (-95), (float) 15990783, (float) 16580354, 3.4084816E-37f);
        int int13 = com.badlogic.gdx.graphics.Color.argb8888(color12);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 255 + "'", int13 == 255);
    }

    @Test
    public void test07330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07330");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.getdepth();
        int int8 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 640 + "'", int8 == 640);
    }

    @Test
    public void test07331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07331");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(65295);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-335), (-14492160));
        int int13 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 2099200;
        com.badlogic.gdx.graphics.Color color16 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration17.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration17.windowX = 100;
        int int22 = lwjgl3ApplicationConfiguration17.g;
        java.lang.String str23 = lwjgl3ApplicationConfiguration17.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration17.setwindowResizable(false);
        int int26 = lwjgl3ApplicationConfiguration17.samples;
        lwjgl3ApplicationConfiguration17.setwindowX(16776961);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = lwjgl3ApplicationConfiguration17.windowListener;
        com.badlogic.gdx.Files.FileType fileType30 = lwjgl3ApplicationConfiguration17.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType30);
        lwjgl3ApplicationConfiguration0.g = '#';
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ".prefs/" + "'", str23, ".prefs/");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(lwjgl3WindowListener29);
        org.junit.Assert.assertTrue("'" + fileType30 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType30.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07332");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        int int10 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setwindowX(19040);
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
    }

    @Test
    public void test07333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07333");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(2303);
    }

    @Test
    public void test07334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07334");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 318766848, (float) 28172, (float) (-63751));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-345) + "'", int3 == (-345));
    }

    @Test
    public void test07335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07335");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-9216), (float) (-183869281), 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-585105408) + "'", int3 == (-585105408));
    }

    @Test
    public void test07336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07336");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffff0000";
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.title;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-8160);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test07337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07337");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GREEN;
        com.badlogic.gdx.graphics.Color color6 = color0.lerp((-4.581683E37f), (float) 20160, (float) 13260, (float) (-187392), (float) (-1879860224));
        color6.r = 0.44444445f;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color6, (-134355456));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color6, (-112792302));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color6, 653309);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((float) (-62986), (float) 'a', (float) '4', (float) (short) 10);
        float float20 = color19.b;
        com.badlogic.gdx.graphics.Color color21 = color6.mul(color19);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color6);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(color21);
    }

    @Test
    public void test07338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07338");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-567943452);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        int int11 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test07339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07339");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int13 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test07340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07340");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color color6 = color0.add((float) '#', (float) (-13500161), (float) 512, (float) (-335));
        java.lang.String str7 = color6.toString();
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color10 = color6.set((-383778816));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ff00ff00" + "'", str7, "ff00ff00");
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test07341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07341");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-4.2867603E37f), 9.18893E-39f, (float) 1794115036, (float) (-10));
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = color10.mul((-1.0f), (float) 1677696502, (float) 65024, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color16 = color4.sub(color15);
        com.badlogic.gdx.graphics.Color color17 = color16.premultiplyAlpha();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration18.setpreferencesFileType(fileType19);
        lwjgl3ApplicationConfiguration18.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration18.setPreferencesConfig("", fileType24);
        lwjgl3ApplicationConfiguration18.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration18.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration18.depth = (-537010176);
        lwjgl3ApplicationConfiguration18.setWindowedMode((-50396672), (int) '#');
        lwjgl3ApplicationConfiguration18.setwindowX((-393464));
        com.badlogic.gdx.graphics.Color color37 = lwjgl3ApplicationConfiguration18.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color39 = color17.lerp(color37, 4.5183064E-38f);
        float float40 = color17.toFloatBits();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
    }

    @Test
    public void test07342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07342");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        lwjgl3ApplicationConfiguration0.setwindowHeight(151015132);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration17.setsamples(43268);
        int int20 = lwjgl3ApplicationConfiguration17.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration17.setaudioDeviceBufferCount(1671168000);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test07343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07343");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        boolean boolean5 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test07344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07344");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-2048), (-1.6012534E38f), 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 134217728 + "'", int3 == 134217728);
    }

    @Test
    public void test07345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07345");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test07346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07346");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        int int3 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int5 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        int int8 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".prefs/" + "'", str4, ".prefs/");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test07347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07347");
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
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.samples = (-2097152);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test07348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07348");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("0000639c");
        java.lang.String str2 = color1.toString();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000639c" + "'", str2, "0000639c");
    }

    @Test
    public void test07349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07349");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        int int6 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ff660000";
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        int int13 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test07350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07350");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TAN;
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.VIOLET;
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) (byte) 100, (float) 8, (float) 10, (float) 9, (float) (-1611265692));
        int int8 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color10 = color0.sub(color1);
        color1.g = (-254);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType14);
        lwjgl3ApplicationConfiguration13.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("", fileType19);
        java.lang.String str21 = lwjgl3ApplicationConfiguration13.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        lwjgl3ApplicationConfiguration13.setgles30ContextMajorVersion((-33488131));
        int int25 = lwjgl3ApplicationConfiguration13.windowY;
        boolean boolean26 = color1.equals((java.lang.Object) lwjgl3ApplicationConfiguration13);
        int int27 = com.badlogic.gdx.graphics.Color.rgb565(color1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color1, (-12460032));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration30.setpreferencesFileType(fileType31);
        lwjgl3ApplicationConfiguration30.disableAudio = true;
        lwjgl3ApplicationConfiguration30.initialVisible = true;
        int int37 = lwjgl3ApplicationConfiguration30.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration30.b = (-62986);
        lwjgl3ApplicationConfiguration30.b = 2;
        lwjgl3ApplicationConfiguration30.setpreferencesDirectory("");
        int int44 = lwjgl3ApplicationConfiguration30.getaudioDeviceSimultaneousSources();
        int int45 = lwjgl3ApplicationConfiguration30.samples;
        lwjgl3ApplicationConfiguration30.setDecorated(false);
        lwjgl3ApplicationConfiguration30.audioDeviceSimultaneousSources = 33488386;
        boolean boolean50 = lwjgl3ApplicationConfiguration30.windowDecorated;
        lwjgl3ApplicationConfiguration30.a = 16252680;
        boolean boolean53 = color1.equals((java.lang.Object) lwjgl3ApplicationConfiguration30);
        int int54 = lwjgl3ApplicationConfiguration30.stencil;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-512064) + "'", int27 == (-512064));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 16 + "'", int44 == 16);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test07351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07351");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07352");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration24.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration24.samples = '4';
        int int29 = lwjgl3ApplicationConfiguration24.r;
        lwjgl3ApplicationConfiguration24.setwindowY(1671296512);
        lwjgl3ApplicationConfiguration24.setAudioConfig(640, 8897069, (-62986));
        boolean boolean36 = color22.equals((java.lang.Object) (-62986));
        com.badlogic.gdx.graphics.Color color37 = color22.cpy();
        float float38 = color37.toFloatBits();
        float float39 = color37.toFloatBits();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-4.2866305E37f) + "'", float38 == (-4.2866305E37f));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-4.2866305E37f) + "'", float39 == (-4.2866305E37f));
    }

    @Test
    public void test07353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07353");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-7876885), (float) 0L, (float) 6529016, (-0.49791527f));
        com.badlogic.gdx.graphics.Color color6 = color4.set(537395200);
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color6);
        color6.a = (-968892160);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2099200 + "'", int7 == 2099200);
    }

    @Test
    public void test07354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07354");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-255), 100.0f, (float) (byte) 100, (float) 41903542);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str11 = color10.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color10, 1);
        com.badlogic.gdx.graphics.Color color18 = color10.mul((float) 41903542, (float) (-8672), (float) (-50135050), (float) (-10));
        com.badlogic.gdx.graphics.Color color24 = color18.lerp((float) (-65025), (-0.0f), (float) (-65486), (float) (byte) 10, (float) (-1L));
        com.badlogic.gdx.graphics.Color color29 = color24.set((float) 1, (float) 255, (-5.68232E37f), (float) 1677696502);
        float float30 = color24.toFloatBits();
        com.badlogic.gdx.graphics.Color color31 = color4.mul(color24);
        int int32 = com.badlogic.gdx.graphics.Color.rgba4444(color4);
        com.badlogic.gdx.graphics.Color color33 = color4.clamp();
        int int34 = com.badlogic.gdx.graphics.Color.rgba8888(color33);
        java.lang.String str35 = color33.toString();
        int int36 = com.badlogic.gdx.graphics.Color.rgb565(color33);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ffff0000" + "'", str11, "ffff0000");
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-4.28676E37f) + "'", float30 == (-4.28676E37f));
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3855 + "'", int32 == 3855);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 16711935 + "'", int34 == 16711935);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "00ff00ff" + "'", str35, "00ff00ff");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2016 + "'", int36 == 2016);
    }

    @Test
    public void test07355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07355");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType3 = null;
        lwjgl3ApplicationConfiguration2.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration2.useVsync(false);
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration2.initialBackgroundColor = color7;
        int int9 = com.badlogic.gdx.graphics.Color.rgba8888(color7);
        com.badlogic.gdx.graphics.Color color11 = color7.mul((float) 14);
        com.badlogic.gdx.graphics.Color color12 = color0.add(color7);
        color7.r = (-1671233536);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65281) + "'", int9 == (-65281));
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test07356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07356");
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
        int int26 = lwjgl3ApplicationConfiguration8.windowHeight;
        int int27 = lwjgl3ApplicationConfiguration8.getwindowY();
        int int28 = lwjgl3ApplicationConfiguration8.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration30.setpreferencesFileType(fileType31);
        lwjgl3ApplicationConfiguration30.useVsync(false);
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration30.initialBackgroundColor = color35;
        lwjgl3ApplicationConfiguration30.setDecorated(false);
        int int39 = lwjgl3ApplicationConfiguration30.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration30.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration30);
        lwjgl3ApplicationConfiguration42.setwindowDecorated(false);
        int int45 = lwjgl3ApplicationConfiguration42.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration42.setgles30ContextMajorVersion(266342400);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener48 = null;
        lwjgl3ApplicationConfiguration42.setWindowListener(lwjgl3WindowListener48);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int51 = lwjgl3ApplicationConfiguration50.getaudioDeviceBufferSize();
        int int52 = lwjgl3ApplicationConfiguration50.b;
        lwjgl3ApplicationConfiguration50.useGL30 = false;
        int int55 = lwjgl3ApplicationConfiguration50.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration50.g = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode58 = null;
        lwjgl3ApplicationConfiguration50.fullscreenMode = lwjgl3DisplayMode58;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener60 = null;
        lwjgl3ApplicationConfiguration50.setWindowListener(lwjgl3WindowListener60);
        com.badlogic.gdx.Files.FileType fileType62 = lwjgl3ApplicationConfiguration50.getpreferencesFileType();
        lwjgl3ApplicationConfiguration42.setpreferencesFileType(fileType62);
        lwjgl3ApplicationConfiguration8.setPreferencesConfig("00ffffff", fileType62);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 480 + "'", int26 == 480);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 512 + "'", int51 == 512);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 8 + "'", int52 == 8);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + fileType62 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType62.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07357");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((-5.360365E37f), (float) (-167706623), (float) (-14911125), (float) (-1291845633));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
    }

    @Test
    public void test07358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07358");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLACK;
        float float1 = color0.r;
        com.badlogic.gdx.graphics.Color color6 = color0.set((-8.0750596E37f), 0.0f, (float) (-1L), (float) 65024);
        float float7 = color0.g;
        com.badlogic.gdx.graphics.Color color8 = color0.cpy();
        int int9 = com.badlogic.gdx.graphics.Color.rgb888(color8);
        com.badlogic.gdx.graphics.Color color11 = color8.mul(0.0f);
        float float12 = color8.a;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test07359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07359");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("ff4eb2ff");
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test07360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07360");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(65024);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-1562574848));
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("0000ee00");
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int17 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-194841600), (-27133));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0000ee00" + "'", str12, "0000ee00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test07361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07361");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        lwjgl3ApplicationConfiguration0.setwindowWidth(20160);
        int int14 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int15 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration17.useOpenGL3(false, (-8202), (-1311232));
        java.lang.String str22 = lwjgl3ApplicationConfiguration17.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ".prefs/" + "'", str22, ".prefs/");
    }

    @Test
    public void test07362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07362");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = lwjgl3ApplicationConfiguration0.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("001cff00");
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-1880421376);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test07363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07363");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-2345472), (float) (-15860224), (float) (-14911125), 9.4661864E-29f);
    }

    @Test
    public void test07364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07364");
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
        int int15 = lwjgl3ApplicationConfiguration12.getgles30ContextMajorVersion();
        boolean boolean16 = lwjgl3ApplicationConfiguration12.getwindowDecorated();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration18.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration18.windowX = 100;
        int int23 = lwjgl3ApplicationConfiguration18.g;
        int int24 = lwjgl3ApplicationConfiguration18.getwindowY();
        com.badlogic.gdx.Files.FileType fileType25 = lwjgl3ApplicationConfiguration18.getpreferencesFileType();
        lwjgl3ApplicationConfiguration12.setPreferencesConfig("88bb2222", fileType25);
        lwjgl3ApplicationConfiguration12.b = (-68060);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07365");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(1.7633333E-30f, (float) 16193265, (float) (-15859955), (float) (-27809536));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-65536) + "'", int4 == (-65536));
    }

    @Test
    public void test07366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07366");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color8 = color3.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color3);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color16 = color11.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color24 = color18.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str26 = color25.toString();
        com.badlogic.gdx.graphics.Color color28 = color18.lerp(color25, (-8.0750596E37f));
        boolean boolean29 = color11.equals((java.lang.Object) color18);
        com.badlogic.gdx.graphics.Color color30 = color10.add(color11);
        com.badlogic.gdx.graphics.Color color32 = color2.lerp(color10, (float) (-14540110));
        int int33 = com.badlogic.gdx.graphics.Color.rgb565(color2);
        com.badlogic.gdx.graphics.Color color38 = color2.mul((float) (byte) 0, (float) (byte) 100, (float) 35, (float) (-255));
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color2);
        com.badlogic.gdx.graphics.Color color40 = color0.sub(color39);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color0);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00ff0000" + "'", str26, "00ff0000");
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2016 + "'", int33 == 2016);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color40);
    }

    @Test
    public void test07367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07367");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType4 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int5 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 640 + "'", int5 == 640);
    }

    @Test
    public void test07368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07368");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color3 = color1.cpy();
        int int4 = com.badlogic.gdx.graphics.Color.rgb888(color1);
        color1.r = (-2147222656);
        com.badlogic.gdx.graphics.Color color11 = color1.mul((float) (-1103230192), (float) 65520, (-4.2535955E37f), (float) (-18));
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test07369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07369");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.b = 100;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int20 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
    }

    @Test
    public void test07370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07370");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int11 = lwjgl3ApplicationConfiguration0.windowX;
        int int12 = lwjgl3ApplicationConfiguration0.depth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener13;
        lwjgl3ApplicationConfiguration0.g = 250675200;
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test07371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07371");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        int int25 = lwjgl3ApplicationConfiguration24.windowX;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test07372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07372");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (short) 10, 2.1862947E-38f, (float) (-603982879), (float) (-579592));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8685688) + "'", int4 == (-8685688));
    }

    @Test
    public void test07373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07373");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        int int8 = lwjgl3ApplicationConfiguration0.r;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int10 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int11 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int13 = lwjgl3ApplicationConfiguration12.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 640 + "'", int10 == 640);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
    }

    @Test
    public void test07374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07374");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha(1.561203E-39f, (float) 44405);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11323275 + "'", int2 == 11323275);
    }

    @Test
    public void test07375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07375");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.g = 6356992;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int14 = lwjgl3ApplicationConfiguration0.a;
        int int15 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.windowX = 1162137;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test07376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07376");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLACK;
        float float1 = color0.r;
        com.badlogic.gdx.graphics.Color color6 = color0.set((-8.0750596E37f), 0.0f, (float) (-1L), (float) 65024);
        com.badlogic.gdx.graphics.Color color7 = color0.cpy();
        com.badlogic.gdx.graphics.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color9 = color7.set(color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test07377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07377");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) 852308735);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test07378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07378");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 41903542;
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType11);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.r = (-65024);
        lwjgl3ApplicationConfiguration0.depth = (-59160);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration21.stencil = 12;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
    }

    @Test
    public void test07379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07379");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-50135050), (float) (-232), (-0.49791527f), (float) 168296448);
        color4.r = (-19889);
    }

    @Test
    public void test07380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07380");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        lwjgl3ApplicationConfiguration0.setwindowWidth(20160);
        lwjgl3ApplicationConfiguration0.setwindowY(13119);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode19 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertNull(lwjgl3DisplayMode19);
    }

    @Test
    public void test07381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07381");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(151015132, (-203427056), 16711425, (-392448), (-535426560), (-262646), 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test07382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07382");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.setwindowX(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration12.stencil = '#';
        lwjgl3ApplicationConfiguration12.setAudioConfig((int) '4', (-541699), 140834847);
        int int19 = lwjgl3ApplicationConfiguration12.windowY;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test07383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07383");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.title = "000000ff";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration10.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration10.windowX = 100;
        boolean boolean15 = lwjgl3ApplicationConfiguration10.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration17.setpreferencesFileType(fileType18);
        lwjgl3ApplicationConfiguration17.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration17.setPreferencesConfig("", fileType23);
        lwjgl3ApplicationConfiguration17.g = (short) 0;
        lwjgl3ApplicationConfiguration17.windowX = 35;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.setDecorated(false);
        lwjgl3ApplicationConfiguration29.a = (byte) 10;
        boolean boolean34 = lwjgl3ApplicationConfiguration29.initialVisible;
        int int35 = lwjgl3ApplicationConfiguration29.b;
        lwjgl3ApplicationConfiguration29.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType38 = lwjgl3ApplicationConfiguration29.preferencesFileType;
        lwjgl3ApplicationConfiguration17.setpreferencesFileType(fileType38);
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("ffffff22", fileType38);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType38;
        int int42 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + fileType38 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType38.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
    }

    @Test
    public void test07384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07384");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color13 = color12.cpy();
        int int14 = com.badlogic.gdx.graphics.Color.argb8888(color13);
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.FOREST;
        int int16 = com.badlogic.gdx.graphics.Color.argb8888(color15);
        com.badlogic.gdx.graphics.Color color18 = color13.lerp(color15, (float) (-50396672));
        int int19 = com.badlogic.gdx.graphics.Color.argb8888(color18);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color26 = color21.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color27);
        com.badlogic.gdx.graphics.Color color29 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color34 = color29.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color42 = color36.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str44 = color43.toString();
        com.badlogic.gdx.graphics.Color color46 = color36.lerp(color43, (-8.0750596E37f));
        boolean boolean47 = color29.equals((java.lang.Object) color36);
        com.badlogic.gdx.graphics.Color color48 = color28.add(color29);
        com.badlogic.gdx.graphics.Color color50 = color20.lerp(color28, (float) (-14540110));
        int int51 = com.badlogic.gdx.graphics.Color.rgb565(color20);
        com.badlogic.gdx.graphics.Color color52 = color18.sub(color20);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color18;
        boolean boolean54 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.g = (-16711936);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.windowHeight = 17992800;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-65536) + "'", int14 == (-65536));
        org.junit.Assert.assertNotNull(color15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(color18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-65536) + "'", int19 == (-65536));
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "00ff0000" + "'", str44, "00ff0000");
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color50);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2016 + "'", int51 == 2016);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test07385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07385");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.g = 31334400;
        lwjgl3ApplicationConfiguration0.depth = (-254);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-16711680), (-128512));
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.depth = 2080800;
    }

    @Test
    public void test07386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07386");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration8.setaudioDeviceBufferCount(1651519680);
        java.lang.String str11 = lwjgl3ApplicationConfiguration8.title;
        boolean boolean12 = lwjgl3ApplicationConfiguration8.getwindowResizable();
        boolean boolean13 = lwjgl3ApplicationConfiguration8.getdisableAudio();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test07387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07387");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-2146721792), (float) (-67111040), (float) 167709184, (float) 8256822);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
    }

    @Test
    public void test07388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07388");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int7 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.windowX = (-1901311);
        int int11 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.g = 151015132;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.b = 0;
        lwjgl3ApplicationConfiguration0.windowX = (-975375);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test07389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07389");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str3 = color2.toString();
        com.badlogic.gdx.graphics.Color color5 = color2.set((-62986));
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str7 = color6.toString();
        com.badlogic.gdx.graphics.Color color9 = color6.set((-62986));
        com.badlogic.gdx.graphics.Color color10 = color5.sub(color9);
        com.badlogic.gdx.graphics.Color color11 = color0.add(color9);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 100, (float) (short) 0, (float) 640);
        com.badlogic.gdx.graphics.Color color21 = color16.add((-8.0750596E37f), (float) 20188, (float) 10L, (float) 31334400);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color23 = color22.clamp();
        com.badlogic.gdx.graphics.Color color25 = color9.lerp(color23, (float) (-83820544));
        java.lang.String str26 = color9.toString();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00ff0000" + "'", str3, "00ff0000");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ffff09f6" + "'", str7, "ffff09f6");
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
    }

    @Test
    public void test07390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07390");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = null;
        lwjgl3ApplicationConfiguration15.fullscreenMode = lwjgl3DisplayMode18;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
    }

    @Test
    public void test07391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07391");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setgles30ContextMajorVersion((int) ' ');
        lwjgl3ApplicationConfiguration8.disableAudio(false);
        int int13 = lwjgl3ApplicationConfiguration8.getdepth();
        lwjgl3ApplicationConfiguration8.b = 0;
        int int16 = lwjgl3ApplicationConfiguration8.windowY;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test07392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07392");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        int int5 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setdepth(100);
        lwjgl3ApplicationConfiguration0.b = 480;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test07393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07393");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setwindowHeight((-15925492));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test07394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07394");
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
        lwjgl3ApplicationConfiguration0.title = "0000f600";
        com.badlogic.gdx.Files.FileType fileType21 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((-8414));
        int int24 = com.badlogic.gdx.graphics.Color.argb8888(color23);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color23;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (-532209));
        lwjgl3ApplicationConfiguration0.samples = (-383778816);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = lwjgl3ApplicationConfiguration0.hdpiMode;
        int int34 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(fileType21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 587202527 + "'", int24 == 587202527);
        org.junit.Assert.assertTrue("'" + hdpiMode33 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode33.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-532209) + "'", int34 == (-532209));
    }

    @Test
    public void test07395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07395");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.setwindowX((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration7.getpreferencesFileType();
        int int11 = lwjgl3ApplicationConfiguration7.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration7.initialVisible = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration15.useVsync(false);
        lwjgl3ApplicationConfiguration15.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        lwjgl3ApplicationConfiguration23.setAudioConfig(512, (-14540110), (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.setDecorated(false);
        lwjgl3ApplicationConfiguration29.a = (byte) 10;
        boolean boolean34 = lwjgl3ApplicationConfiguration29.initialVisible;
        int int35 = lwjgl3ApplicationConfiguration29.b;
        lwjgl3ApplicationConfiguration29.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType38 = lwjgl3ApplicationConfiguration29.preferencesFileType;
        lwjgl3ApplicationConfiguration23.setPreferencesConfig(".prefs/", fileType38);
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("ffff72ff", fileType38);
        com.badlogic.gdx.graphics.Color color41 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        float float42 = color41.r;
        lwjgl3ApplicationConfiguration7.initialBackgroundColor = color41;
        int int44 = com.badlogic.gdx.graphics.Color.rgb888(color41);
        int int45 = color41.toIntBits();
        com.badlogic.gdx.graphics.Color color47 = color41.set((-53504));
        int int48 = com.badlogic.gdx.graphics.Color.rgb888(color47);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + fileType38 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType38.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color41);
// flaky:         org.junit.Assert.assertTrue("'" + float42 + "' != '" + 60426.0f + "'", float42 == 60426.0f);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 502661120 + "'", int44 == 502661120);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 15408630 + "'", int45 == 15408630);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 16777007 + "'", int48 == 16777007);
    }

    @Test
    public void test07396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07396");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        com.badlogic.gdx.Files.FileType fileType4 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setwindowX((-187392));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType8);
        lwjgl3ApplicationConfiguration7.disableAudio = true;
        lwjgl3ApplicationConfiguration7.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration7.getpreferencesFileType();
        lwjgl3ApplicationConfiguration7.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType17 = lwjgl3ApplicationConfiguration7.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration19.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration19.samples = (-1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType28 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration24.setPreferencesConfig("hi!", fileType28);
        lwjgl3ApplicationConfiguration19.setpreferencesFileType(fileType28);
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("00ff0000", fileType28);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType28;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-652800));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-14513408), 49939200, (-246), (-15333376), (-499968), 19040, 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(fileType14);
        org.junit.Assert.assertNull(fileType17);
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.Absolute));
    }

    @Test
    public void test07397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07397");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.r = (-219211274);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(fileType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test07398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07398");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(1610620896);
        color1.g = (-0.49999902f);
    }

    @Test
    public void test07399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07399");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration3.windowListener = lwjgl3WindowListener4;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration3.fullscreenMode;
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.SALMON;
        float float8 = color7.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str10 = lwjgl3ApplicationConfiguration9.title;
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color11, 16);
        lwjgl3ApplicationConfiguration9.setInitialBackgroundColor(color11);
        com.badlogic.gdx.graphics.Color color19 = color11.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color27 = color21.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str29 = color28.toString();
        com.badlogic.gdx.graphics.Color color31 = color21.lerp(color28, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color32, 16);
        com.badlogic.gdx.graphics.Color color35 = color31.sub(color32);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color32, 1677696502);
        com.badlogic.gdx.graphics.Color color38 = color11.sub(color32);
        com.badlogic.gdx.graphics.Color color39 = color7.add(color32);
        color32.r = (-5.387877E37f);
        lwjgl3ApplicationConfiguration3.setInitialBackgroundColor(color32);
        java.lang.String str43 = color32.toString();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertNotNull(color7);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-4.253659E37f) + "'", float8 == (-4.253659E37f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "00000000" + "'", str29, "00000000");
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "00000000" + "'", str43, "00000000");
    }

    @Test
    public void test07400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07400");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.windowY = (-50135050);
        int int20 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.windowWidth = (-1635873500);
        boolean boolean25 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test07401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07401");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.samples = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test07402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07402");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        int int4 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0.0f, (float) 1, 0.13333334f, 1.561203E-39f);
        com.badlogic.gdx.graphics.Color color11 = color9.mul((float) 100);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.g = (-8202);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test07403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07403");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test07404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07404");
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
        lwjgl3ApplicationConfiguration13.stencil = (-95);
        int int20 = lwjgl3ApplicationConfiguration13.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test07405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07405");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(394264576, (-16646655), (-56610), 64990);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6881455E38f) + "'", float4 == (-1.6881455E38f));
    }

    @Test
    public void test07406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07406");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration12.depth = 12263936;
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test07407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07407");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-8142), (float) 122400, (float) (-240), (float) (-51667488));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (-8));
    }

    @Test
    public void test07408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07408");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.setdepth(65290);
        int int17 = lwjgl3ApplicationConfiguration0.stencil;
        boolean boolean18 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test07409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07409");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowWidth((-524536));
        boolean boolean18 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test07410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07410");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        int int8 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.r = (-36608);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test07411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07411");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(453010332);
        float float2 = color1.a;
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.6117647f + "'", float2 == 0.6117647f);
    }

    @Test
    public void test07412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07412");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) 16776960, (-1.6974137E38f), (float) (-831521423), (-5.915194E37f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16777216) + "'", int4 == (-16777216));
    }

    @Test
    public void test07413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07413");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.samples = 255;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(140834847);
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener14;
        int int16 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
    }

    @Test
    public void test07414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07414");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888(0.0f, (-1.7009626E38f), 1.5612034E-37f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test07415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07415");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType63 = null;
        lwjgl3ApplicationConfiguration62.setpreferencesFileType(fileType63);
        lwjgl3ApplicationConfiguration62.useVsync(false);
        lwjgl3ApplicationConfiguration62.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration69 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration62);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration70 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration69);
        lwjgl3ApplicationConfiguration70.setAudioConfig(512, (-14540110), (int) (byte) 1);
        lwjgl3ApplicationConfiguration70.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener77 = lwjgl3ApplicationConfiguration70.windowListener;
        lwjgl3ApplicationConfiguration70.audioDeviceBufferSize = (-33488896);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration80 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration80.setDecorated(false);
        lwjgl3ApplicationConfiguration80.a = (byte) 10;
        boolean boolean85 = lwjgl3ApplicationConfiguration80.initialVisible;
        int int86 = lwjgl3ApplicationConfiguration80.b;
        int int87 = lwjgl3ApplicationConfiguration80.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration88 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration80);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode89 = lwjgl3ApplicationConfiguration88.hdpiMode;
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
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
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration69);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration70);
        org.junit.Assert.assertNull(lwjgl3WindowListener77);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 8 + "'", int86 == 8);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration88);
        org.junit.Assert.assertTrue("'" + hdpiMode89 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode89.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test07416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07416");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 1);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color7 = color2.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color7, 100);
        com.badlogic.gdx.graphics.Color color11 = color7.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color11, 8897069);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color19 = color14.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color20);
        int int22 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        int int23 = com.badlogic.gdx.graphics.Color.rgba8888(color21);
        com.badlogic.gdx.graphics.Color color25 = color11.lerp(color21, (float) 1044480);
        com.badlogic.gdx.graphics.Color color30 = color25.add((float) '4', (float) 10, (float) (short) 1, 0.69803923f);
        float float31 = color25.r;
        com.badlogic.gdx.graphics.Color color32 = color1.mul(color25);
        com.badlogic.gdx.graphics.Color color33 = color25.clamp();
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color40 = color38.set((int) (short) 0);
        int int41 = com.badlogic.gdx.graphics.Color.rgba4444(color38);
        java.lang.String str42 = color38.toString();
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color48 = color43.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color(color43);
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color(color49);
        int int51 = com.badlogic.gdx.graphics.Color.argb8888(color50);
        int int52 = com.badlogic.gdx.graphics.Color.argb8888(color50);
        com.badlogic.gdx.graphics.Color color54 = color50.set(3);
        com.badlogic.gdx.graphics.Color color55 = color38.set(color54);
        com.badlogic.gdx.graphics.Color color60 = color55.add((float) 61455, (float) 512, (float) (-2219520), (float) 2147483647);
        com.badlogic.gdx.graphics.Color color62 = color25.lerp(color60, (-5.915194E37f));
        com.badlogic.gdx.graphics.Color color67 = color60.add(2.541842E-29f, (float) (-345), (float) 16703520, (float) (-78));
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16777215 + "'", int22 == 16777215);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-256) + "'", int23 == (-256));
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "00000000" + "'", str42, "00000000");
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1291845633) + "'", int51 == (-1291845633));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1291845633) + "'", int52 == (-1291845633));
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color67);
    }

    @Test
    public void test07417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07417");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 16777196, (-2.231065E33f), (-1.6986602E38f), (float) 3381300);
        float float5 = color4.r;
        com.badlogic.gdx.graphics.Color color6 = color4.premultiplyAlpha();
        color6.g = 5496352;
        color6.b = (-262384);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test07418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07418");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType4 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.windowY = (-668991488);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test07419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07419");
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
        int int18 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color26 = color20.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str28 = color27.toString();
        com.badlogic.gdx.graphics.Color color30 = color20.lerp(color27, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color31, 16);
        com.badlogic.gdx.graphics.Color color34 = color30.sub(color31);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        int int36 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int37 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.graphics.Color color38 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color41 = com.badlogic.gdx.graphics.Color.BLACK;
        float float42 = color41.r;
        color41.r = 1671296512;
        com.badlogic.gdx.graphics.Color color45 = color40.sub(color41);
        com.badlogic.gdx.graphics.Color color47 = color45.set(1664640000);
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color52.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color(color52);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color52, (int) (byte) 100);
        color52.r = 31;
        com.badlogic.gdx.graphics.Color color64 = color52.add((float) 63519, (-1.6789801E38f), (-1.6950243E38f), (float) 1671296512);
        com.badlogic.gdx.graphics.Color color65 = color45.add(color64);
        com.badlogic.gdx.graphics.Color color66 = color38.mul(color64);
        com.badlogic.gdx.graphics.Color color67 = color64.clamp();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 61450 + "'", int18 == 61450);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00ff0000" + "'", str28, "00ff0000");
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-469852380) + "'", int36 == (-469852380));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color41);
// flaky:         org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(color66);
        org.junit.Assert.assertNotNull(color67);
    }

    @Test
    public void test07420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07420");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16777215);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int15 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean16 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int18 = lwjgl3ApplicationConfiguration17.getaudioDeviceBufferSize();
        boolean boolean19 = lwjgl3ApplicationConfiguration17.windowResizable;
        int int20 = lwjgl3ApplicationConfiguration17.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration17.setvSyncEnabled(false);
        int int23 = lwjgl3ApplicationConfiguration17.getwindowHeight();
        lwjgl3ApplicationConfiguration17.setpreferencesDirectory("ffffff22");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str28 = lwjgl3ApplicationConfiguration27.title;
        lwjgl3ApplicationConfiguration27.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration27.setgles30ContextMinorVersion(65295);
        boolean boolean33 = lwjgl3ApplicationConfiguration27.getwindowResizable();
        int int34 = lwjgl3ApplicationConfiguration27.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration27.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.setDecorated(false);
        lwjgl3ApplicationConfiguration38.a = (byte) 10;
        boolean boolean43 = lwjgl3ApplicationConfiguration38.initialVisible;
        int int44 = lwjgl3ApplicationConfiguration38.b;
        lwjgl3ApplicationConfiguration38.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color47 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration38.initialBackgroundColor = color47;
        boolean boolean49 = lwjgl3ApplicationConfiguration38.useGL30;
        com.badlogic.gdx.Files.FileType fileType50 = lwjgl3ApplicationConfiguration38.preferencesFileType;
        lwjgl3ApplicationConfiguration27.setPreferencesConfig("", fileType50);
        lwjgl3ApplicationConfiguration17.setPreferencesConfig("01000000", fileType50);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType50;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 480 + "'", int23 == 480);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 8 + "'", int44 == 8);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + fileType50 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType50.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07421");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(65024);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test07422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07422");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test07423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07423");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = (-7680);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test07424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07424");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.g = (short) 0;
        int int10 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setdepth(19040);
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int14 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(fileType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test07425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07425");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((-4.2535296E37f), (float) (-33488131), 2.209062E-18f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test07426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07426");
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
        int int16 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.r = (-33566977);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 61440;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test07427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07427");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-33488131);
        lwjgl3ApplicationConfiguration0.setwindowX((-16734721));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-2336), 7576628, (-15671025), (-65536), (-1241350299), (-65281), 63519);
        boolean boolean19 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 70560;
        int int22 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.stencil = (-1241350299);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode25 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode25;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 70560 + "'", int22 == 70560);
    }

    @Test
    public void test07428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07428");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        lwjgl3ApplicationConfiguration0.stencil = 524288;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test07429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07429");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        lwjgl3ApplicationConfiguration0.setwindowHeight(151015132);
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = lwjgl3ApplicationConfiguration0.hdpiMode;
        int int20 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setdepth((-119406593));
        int int23 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-62986) + "'", int23 == (-62986));
    }

    @Test
    public void test07430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07430");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowWidth = 65522;
        lwjgl3ApplicationConfiguration0.b = 11280416;
        lwjgl3ApplicationConfiguration0.windowWidth = (-65400);
        int int17 = lwjgl3ApplicationConfiguration0.g;
        int int18 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int19 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.depth = 2080800;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 480 + "'", int18 == 480);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test07431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07431");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (-262646));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode9 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode9;
        int int11 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test07432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07432");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        int int8 = lwjgl3ApplicationConfiguration0.stencil;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration0.windowX;
        int int12 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test07433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07433");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) (-65400));
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color3);
        com.badlogic.gdx.graphics.Color color9 = color4.add((float) (-187392), (float) (-1308557313), (float) (-78), (float) 167247232);
        int int10 = color4.toIntBits();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-16777216) + "'", int10 == (-16777216));
    }

    @Test
    public void test07434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07434");
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
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-469852380);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("ffffffb6");
        lwjgl3ApplicationConfiguration0.setwindowWidth((-8064));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
    }

    @Test
    public void test07435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07435");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-567943452);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int11 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test07436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07436");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444(0.7137255f, 2.3326216E-38f, (-2.32278428E17f), (float) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 41110 + "'", int4 == 41110);
    }

    @Test
    public void test07437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07437");
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
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test07438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07438");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1611265692), (-50135050));
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-61455);
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener16;
        lwjgl3ApplicationConfiguration0.stencil = (-15925492);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
    }

    @Test
    public void test07439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07439");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-9.997505E37f), (float) (-1224736769), 0.19607843f, (float) (-1912602624));
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((float) (byte) 1, 0.0f, (float) (byte) 0, (float) (byte) 100);
        float float10 = color9.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int12 = lwjgl3ApplicationConfiguration11.getaudioDeviceBufferSize();
        boolean boolean13 = lwjgl3ApplicationConfiguration11.windowResizable;
        lwjgl3ApplicationConfiguration11.depth = (short) 10;
        lwjgl3ApplicationConfiguration11.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color27 = color21.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color28 = color19.mul(color27);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color19, (int) (byte) 0);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color19;
        int int32 = com.badlogic.gdx.graphics.Color.argb8888(color19);
        com.badlogic.gdx.graphics.Color color33 = color19.clamp();
        float float34 = color33.g;
        com.badlogic.gdx.graphics.Color color35 = color33.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color36 = color9.set(color35);
        com.badlogic.gdx.graphics.Color color37 = color4.mul(color35);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
    }

    @Test
    public void test07440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07440");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.b = 100;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test07441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07441");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 8755, (float) (-268471552), (float) (-61363200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1346503680) + "'", int3 == (-1346503680));
    }

    @Test
    public void test07442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07442");
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
        lwjgl3ApplicationConfiguration10.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration10.setWindowedMode((-2), (int) (short) 100);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
    }

    @Test
    public void test07443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07443");
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
        float float12 = color11.r;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.67129651E9f + "'", float12 == 1.67129651E9f);
    }

    @Test
    public void test07444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07444");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.r = 1677696502;
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 2147483647);
        int int21 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean23 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test07445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07445");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-2146721792), (-8.1830974E37f), (-1.7013873E38f), (-1.3685977E38f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
    }

    @Test
    public void test07446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07446");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-529433536));
    }

    @Test
    public void test07447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07447");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int2 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        boolean boolean5 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.stencil = 166464502;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration8.windowX = 100;
        int int13 = lwjgl3ApplicationConfiguration8.g;
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration8.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType19 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration15.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration8.setpreferencesFileType(fileType19);
        lwjgl3ApplicationConfiguration8.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration24.setpreferencesFileType(fileType25);
        lwjgl3ApplicationConfiguration24.setsamples((int) (short) 0);
        int int29 = lwjgl3ApplicationConfiguration24.getgles30ContextMinorVersion();
        int int30 = lwjgl3ApplicationConfiguration24.g;
        lwjgl3ApplicationConfiguration24.title = "00000000";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = lwjgl3ApplicationConfiguration24.hdpiMode;
        lwjgl3ApplicationConfiguration8.hdpiMode = hdpiMode33;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode33;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode36 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType19 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType19.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + hdpiMode33 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode33.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNull(lwjgl3DisplayMode36);
    }

    @Test
    public void test07448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07448");
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
        lwjgl3ApplicationConfiguration26.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration26.setFullscreenMode(displayMode29);
        java.lang.String str31 = lwjgl3ApplicationConfiguration26.getpreferencesDirectory();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ffffff00" + "'", str31, "ffffff00");
    }

    @Test
    public void test07449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07449");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        int int11 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        int int13 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setdepth(1664640000);
        lwjgl3ApplicationConfiguration0.g = 65290;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test07450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07450");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.r = 63519;
        com.badlogic.gdx.graphics.Color color8 = color4.set(512);
        com.badlogic.gdx.graphics.Color color10 = color4.set(63519);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color10, 15);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test07451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07451");
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
        int int14 = lwjgl3ApplicationConfiguration13.a;
        lwjgl3ApplicationConfiguration13.initialVisible = true;
        int int17 = lwjgl3ApplicationConfiguration13.a;
        int int18 = lwjgl3ApplicationConfiguration13.a;
        lwjgl3ApplicationConfiguration13.setgles30ContextMajorVersion(512);
        java.lang.String str21 = lwjgl3ApplicationConfiguration13.preferencesDirectory;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test07452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07452");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-61455));
        lwjgl3ApplicationConfiguration0.depth = (-32);
        int int16 = lwjgl3ApplicationConfiguration0.r;
        int int17 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertNull(lwjgl3WindowListener9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 480 + "'", int17 == 480);
    }

    @Test
    public void test07453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07453");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test07454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07454");
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
        color8.a = (-402678048);
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
    }

    @Test
    public void test07455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07455");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        lwjgl3ApplicationConfiguration0.setwindowY((int) ' ');
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.windowWidth = (-16734721);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.windowHeight = (short) 10;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test07456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07456");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.graphics.Color color12 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (-68935680));
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test07457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07457");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) (-567943452), 0.69803923f, 2.9056E-41f, (float) 16776960);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color10);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test07458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07458");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((-4.596073E37f), (float) 1175295, (float) 61680, (float) 41110);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 233437642 + "'", int4 == 233437642);
    }

    @Test
    public void test07459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07459");
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
        lwjgl3ApplicationConfiguration10.setpreferencesDirectory("ffff09f6");
        int int18 = lwjgl3ApplicationConfiguration10.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration10.setgles30ContextMajorVersion(587162524);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration10.setWindowListener(lwjgl3WindowListener21);
        int int23 = lwjgl3ApplicationConfiguration10.getwindowHeight();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 480 + "'", int23 == 480);
    }

    @Test
    public void test07460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07460");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(284196832);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        boolean boolean10 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test07461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07461");
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
        boolean boolean12 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int13 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test07462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07462");
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
        int int14 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-20236800), 2154067, (-16777216));
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test07463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07463");
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
        lwjgl3ApplicationConfiguration0.windowY = 1677696502;
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = lwjgl3ApplicationConfiguration0.windowListener;
        int int18 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowX = 16771591;
        boolean boolean21 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
        org.junit.Assert.assertNull(lwjgl3WindowListener17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test07464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07464");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int15 = lwjgl3ApplicationConfiguration14.getsamples();
        lwjgl3ApplicationConfiguration14.vSyncEnabled = false;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test07465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07465");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 0);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07466");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color7 = color2.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = color1.sub(color7);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color15 = color1.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        int int16 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color26 = color20.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color27 = color18.mul(color26);
        int int28 = com.badlogic.gdx.graphics.Color.argb8888(color27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str30 = lwjgl3ApplicationConfiguration29.title;
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color31, 16);
        lwjgl3ApplicationConfiguration29.setInitialBackgroundColor(color31);
        int int35 = lwjgl3ApplicationConfiguration29.g;
        boolean boolean36 = color27.equals((java.lang.Object) lwjgl3ApplicationConfiguration29);
        com.badlogic.gdx.graphics.Color color37 = color1.add(color27);
        com.badlogic.gdx.graphics.Color color38 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color43 = color38.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color44 = color37.set(color43);
        float float45 = color43.toFloatBits();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16711935 + "'", int16 == 16711935);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16711935 + "'", int28 == 16711935);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 2.3509886E-38f + "'", float45 == 2.3509886E-38f);
    }

    @Test
    public void test07467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07467");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int7 = lwjgl3ApplicationConfiguration0.windowX;
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode11;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
    }

    @Test
    public void test07468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07468");
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
        lwjgl3ApplicationConfiguration0.title = "ffff72ff";
        int int18 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = lwjgl3ApplicationConfiguration0.windowListener;
        int int22 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int23 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertNull(lwjgl3WindowListener21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
    }

    @Test
    public void test07469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07469");
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
        int int40 = com.badlogic.gdx.graphics.Color.rgb888(color9);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 16777215 + "'", int40 == 16777215);
    }

    @Test
    public void test07470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07470");
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
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("9c810000");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test07471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07471");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setAudioConfig(512, (-14540110), (int) (byte) 1);
        int int13 = lwjgl3ApplicationConfiguration8.getwindowY();
        int int14 = lwjgl3ApplicationConfiguration8.getwindowWidth();
        int int15 = lwjgl3ApplicationConfiguration8.getwindowHeight();
        lwjgl3ApplicationConfiguration8.setgles30ContextMinorVersion(93);
        lwjgl3ApplicationConfiguration8.setaudioDeviceBufferCount(140834847);
        lwjgl3ApplicationConfiguration8.initialVisible = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 640 + "'", int14 == 640);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
    }

    @Test
    public void test07472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07472");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((-6.041497E37f), (-1.4957742E38f), (float) 511);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15841 + "'", int3 == 15841);
    }

    @Test
    public void test07473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07473");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (int) 'a');
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color6 = color3.clamp();
        int int7 = com.badlogic.gdx.graphics.Color.rgb888(color3);
        com.badlogic.gdx.graphics.Color color9 = color3.mul((float) (-16719105));
        float float10 = color9.toFloatBits();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65535 + "'", int7 == 65535);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test07474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07474");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration19.disableAudio = true;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
    }

    @Test
    public void test07475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07475");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType4 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType4);
        lwjgl3ApplicationConfiguration0.setTitle("4169e1ff");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((float) 1, (float) 20160, (float) 0, (float) (byte) -1);
        float float17 = color16.a;
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.BLACK;
        float float19 = color18.r;
        com.badlogic.gdx.graphics.Color color24 = color18.set((-8.0750596E37f), 0.0f, (float) (-1L), (float) 65024);
        com.badlogic.gdx.graphics.Color color25 = color18.cpy();
        com.badlogic.gdx.graphics.Color color26 = color18.clamp();
        com.badlogic.gdx.graphics.Color color27 = color16.add(color26);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16711935;
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNotNull(color18);
// flaky:         org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.67741936f + "'", float19 == 0.67741936f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test07476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07476");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 16737792, (float) 65024, (-6.9603414E19f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-65536) + "'", int3 == (-65536));
    }

    @Test
    public void test07477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07477");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.setwindowX((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration7.getpreferencesFileType();
        lwjgl3ApplicationConfiguration7.windowY = 16;
        lwjgl3ApplicationConfiguration7.audioDeviceBufferCount = '#';
        lwjgl3ApplicationConfiguration7.disableAudio(false);
        int int17 = lwjgl3ApplicationConfiguration7.getaudioDeviceBufferCount();
        boolean boolean18 = lwjgl3ApplicationConfiguration7.vSyncEnabled;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test07478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07478");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.g = (short) 0;
        lwjgl3ApplicationConfiguration0.windowX = 35;
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(63736);
        int int15 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test07479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07479");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str2 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setwindowHeight(6529016);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8224;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".prefs/" + "'", str2, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3WindowListener5);
    }

    @Test
    public void test07480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07480");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-49167));
    }

    @Test
    public void test07481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07481");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, 0.0f, (float) (-2143795200), (float) 34244);
    }

    @Test
    public void test07482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07482");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-33488131));
        int int10 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-18432);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test07483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07483");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        lwjgl3ApplicationConfiguration0.setwindowWidth(20160);
        int int14 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int15 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = lwjgl3ApplicationConfiguration17.fullscreenMode;
        int int19 = lwjgl3ApplicationConfiguration17.audioDeviceSimultaneousSources;
        int int20 = lwjgl3ApplicationConfiguration17.getsamples();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertNull(lwjgl3DisplayMode18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test07484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07484");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffffff22");
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test07485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07485");
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
        com.badlogic.gdx.graphics.Color color21 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.BLACK;
        float float23 = color22.r;
        com.badlogic.gdx.graphics.Color color28 = color22.set((-8.0750596E37f), 0.0f, (float) (-1L), (float) 65024);
        java.lang.Object obj29 = null;
        boolean boolean30 = color28.equals(obj29);
        com.badlogic.gdx.graphics.Color color31 = color21.mul(color28);
        com.badlogic.gdx.graphics.Color color32 = color28.cpy();
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color28);
        float float34 = color28.a;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
    }

    @Test
    public void test07486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07486");
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
        int int20 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 32;
        int int23 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000011";
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-65400);
        lwjgl3ApplicationConfiguration0.windowX = 65367;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
    }

    @Test
    public void test07487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07487");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int13 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
    }

    @Test
    public void test07488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07488");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        int int4 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        com.badlogic.gdx.Files.FileType fileType5 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8704;
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 640 + "'", int4 == 640);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test07489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07489");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color11 = color4.mul((float) 16580354);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((float) (-33488131), (float) 255, (float) 6356992, 1.67129651E9f);
        com.badlogic.gdx.graphics.Color color18 = color11.lerp(color16, (float) 2783);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color20 = color19.cpy();
        int int21 = com.badlogic.gdx.graphics.Color.argb8888(color20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str23 = lwjgl3ApplicationConfiguration22.title;
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color24, 16);
        lwjgl3ApplicationConfiguration22.setInitialBackgroundColor(color24);
        com.badlogic.gdx.graphics.Color color32 = color24.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color40 = color34.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color41 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str42 = color41.toString();
        com.badlogic.gdx.graphics.Color color44 = color34.lerp(color41, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color45, 16);
        com.badlogic.gdx.graphics.Color color48 = color44.sub(color45);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color45, 1677696502);
        com.badlogic.gdx.graphics.Color color51 = color24.sub(color45);
        com.badlogic.gdx.graphics.Color color52 = color20.mul(color45);
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(color45);
        com.badlogic.gdx.graphics.Color color55 = color18.lerp(color53, 0.9411765f);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-65536) + "'", int21 == (-65536));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "00ff0000" + "'", str42, "00ff0000");
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color55);
    }

    @Test
    public void test07490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07490");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        lwjgl3ApplicationConfiguration16.useVsync(false);
        int int19 = lwjgl3ApplicationConfiguration16.getaudioDeviceSimultaneousSources();
        int int20 = lwjgl3ApplicationConfiguration16.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
    }

    @Test
    public void test07491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07491");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444(0.0f, 2.4259024E-18f, (float) 195848, (float) (-358913));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1179663) + "'", int4 == (-1179663));
    }

    @Test
    public void test07492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07492");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color color14 = color9.sub((float) (byte) 0, (float) (-65280), (float) 65295, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color14);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test07493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07493");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) 33554431, (float) (-63751), 0.0f, (-1.6978801E38f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16318464) + "'", int4 == (-16318464));
    }

    @Test
    public void test07494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07494");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.setWindowedMode((-840), 502661120);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07495");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setwindowX((int) 'a');
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration15.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration15.setPreferencesConfig("", fileType21);
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration15.preferencesFileType;
        int int24 = lwjgl3ApplicationConfiguration15.samples;
        int int25 = lwjgl3ApplicationConfiguration15.windowHeight;
        lwjgl3ApplicationConfiguration15.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.Files.FileType fileType31 = com.badlogic.gdx.Files.FileType.Classpath;
        lwjgl3ApplicationConfiguration15.setPreferencesConfig("00ff0000", fileType31);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType31;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16718848;
        int int36 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNull(fileType14);
        org.junit.Assert.assertNull(fileType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 480 + "'", int25 == 480);
        org.junit.Assert.assertTrue("'" + fileType31 + "' != '" + com.badlogic.gdx.Files.FileType.Classpath + "'", fileType31.equals(com.badlogic.gdx.Files.FileType.Classpath));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
    }

    @Test
    public void test07496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07496");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-2147483648), 0, 495, 587162524, (-61455), 53562, (-64));
        boolean boolean24 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test07497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07497");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 0);
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode10 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener12;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.a = (-21504);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test07498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07498");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        lwjgl3ApplicationConfiguration0.setdepth(0);
        lwjgl3ApplicationConfiguration0.setwindowX(640);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (short) 1;
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.samples = 1677786624;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType17);
        lwjgl3ApplicationConfiguration16.useVsync(false);
        lwjgl3ApplicationConfiguration16.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.setDecorated(false);
        lwjgl3ApplicationConfiguration25.a = (byte) 10;
        int int30 = lwjgl3ApplicationConfiguration25.getdepth();
        lwjgl3ApplicationConfiguration25.setdepth(100);
        lwjgl3ApplicationConfiguration25.b = 480;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration25);
        java.lang.String str36 = lwjgl3ApplicationConfiguration25.preferencesDirectory;
        lwjgl3ApplicationConfiguration25.setdisableAudio(false);
        com.badlogic.gdx.Files.FileType fileType39 = lwjgl3ApplicationConfiguration25.preferencesFileType;
        lwjgl3ApplicationConfiguration23.setpreferencesFileType(fileType39);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType39);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16 + "'", int30 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ".prefs/" + "'", str36, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType39 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType39.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test07499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07499");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 587202560, (float) (-52608), (float) (-10553861), (float) (-2176));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7014117E38f) + "'", float4 == (-1.7014117E38f));
    }

    @Test
    public void test07500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07500");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration16.setWindowedMode(1, 10);
        int int22 = lwjgl3ApplicationConfiguration16.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration24.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration24.samples = (-1);
        lwjgl3ApplicationConfiguration24.useGL30 = true;
        lwjgl3ApplicationConfiguration24.setpreferencesDirectory("ffff72ff");
        int int33 = lwjgl3ApplicationConfiguration24.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration24.windowY = 20188;
        int int36 = lwjgl3ApplicationConfiguration24.getaudioDeviceBufferCount();
        com.badlogic.gdx.Files.FileType fileType37 = lwjgl3ApplicationConfiguration24.preferencesFileType;
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("6b8e23ff", fileType37);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener40 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener40;
        int int42 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean43 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertTrue("'" + fileType37 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType37.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-62986) + "'", int42 == (-62986));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }
}
