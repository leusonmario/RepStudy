import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.a = (-167706623);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.g = (-12989440);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-16646400);
        int int21 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration24.setpreferencesFileType(fileType25);
        lwjgl3ApplicationConfiguration24.disableAudio = true;
        lwjgl3ApplicationConfiguration24.initialVisible = true;
        int int31 = lwjgl3ApplicationConfiguration24.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration24.b = (-62986);
        lwjgl3ApplicationConfiguration24.b = 2;
        int int36 = lwjgl3ApplicationConfiguration24.windowHeight;
        boolean boolean37 = lwjgl3ApplicationConfiguration24.disableAudio;
        boolean boolean38 = lwjgl3ApplicationConfiguration24.useGL30;
        lwjgl3ApplicationConfiguration24.setAudioConfig(852308735, 50, 284196832);
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float45 = color44.a;
        com.badlogic.gdx.graphics.Color color51 = color44.lerp((float) (-16741598), (float) 16580354, (-0.0f), (float) (-187392), (float) (-10420224));
        lwjgl3ApplicationConfiguration24.setInitialBackgroundColor(color44);
        com.badlogic.gdx.graphics.Color color54 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color55 = com.badlogic.gdx.graphics.Color.BLACK;
        float float56 = color55.r;
        color55.r = 1671296512;
        com.badlogic.gdx.graphics.Color color59 = color54.sub(color55);
        color55.r = 166464000;
        com.badlogic.gdx.graphics.Color color62 = color44.sub(color55);
        com.badlogic.gdx.graphics.Color color68 = color62.lerp((float) (-401145600), (float) 16710672, (-1.61126566E9f), (float) (-117440768), (float) (-1407090));
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color62;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-167706623) + "'", int21 == (-167706623));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 480 + "'", int36 == 480);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 1.0f + "'", float45 == 1.0f);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color55);
// flaky:         org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.062745094f + "'", float56 == 0.062745094f);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color68);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.windowResizable;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        java.lang.Class<?> wildcardClass10 = color9.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("4169e1ff");
        int int14 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1241350299), 15687677);
        int int18 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        int int20 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15687677 + "'", int20 == 15687677);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
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
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-652800));
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, 650250);
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 650250 + "'", int4 == 650250);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        lwjgl3ApplicationConfiguration15.setWindowedMode((-126), (-392448));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = lwjgl3ApplicationConfiguration0.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener15;
        lwjgl3ApplicationConfiguration0.setWindowPosition((-3342337), (-219211274));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float9 = color8.a;
        int int10 = color8.toIntBits();
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color8, (-68060));
        com.badlogic.gdx.graphics.Color color14 = color8.clamp();
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, 130560);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration8.setpreferencesFileType(fileType9);
        lwjgl3ApplicationConfiguration8.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration8.setPreferencesConfig("", fileType14);
        lwjgl3ApplicationConfiguration8.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        lwjgl3ApplicationConfiguration18.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration21.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration21.samples = (-1);
        lwjgl3ApplicationConfiguration21.setgles30ContextMajorVersion(1677696502);
        boolean boolean28 = lwjgl3ApplicationConfiguration21.getwindowDecorated();
        lwjgl3ApplicationConfiguration21.setaudioDeviceBufferCount((-33488131));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration31.setpreferencesFileType(fileType32);
        lwjgl3ApplicationConfiguration31.disableAudio = true;
        int int36 = lwjgl3ApplicationConfiguration31.windowY;
        int int37 = lwjgl3ApplicationConfiguration31.audioDeviceBufferCount;
        int int38 = lwjgl3ApplicationConfiguration31.a;
        boolean boolean39 = lwjgl3ApplicationConfiguration31.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration31.hdpiMode = hdpiMode40;
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode40;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowY((-11280864));
        java.lang.String str51 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ".prefs/" + "'", str51, ".prefs/");
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.depth = (-232);
        boolean boolean10 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int13 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        lwjgl3ApplicationConfiguration0.title = "6b8e23ff";
        int int7 = lwjgl3ApplicationConfiguration0.samples;
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setwindowX(4590);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        int int8 = lwjgl3ApplicationConfiguration0.r;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.b = (-57312);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
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
        com.badlogic.gdx.graphics.Color color48 = color36.clamp();
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color(color36);
        java.lang.String str50 = color49.toString();
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
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ff00ff00" + "'", str50, "ff00ff00");
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-262646));
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (-16777216));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean15 = lwjgl3ApplicationConfiguration14.getuseGL30();
        int int16 = lwjgl3ApplicationConfiguration14.windowX;
        int int17 = lwjgl3ApplicationConfiguration14.depth;
        lwjgl3ApplicationConfiguration14.disableAudio(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-518062112), (-1.7763297E-15f), (float) (-1778384896), (float) (-2013855488));
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig((-14540110), 1114112, (-78));
        int int30 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GREEN;
        int int1 = com.badlogic.gdx.graphics.Color.rgba8888(color0);
        com.badlogic.gdx.graphics.Color color3 = color0.set(256);
        com.badlogic.gdx.graphics.Color color4 = color3.clamp();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((-335));
        com.badlogic.gdx.graphics.Color color7 = color6.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color8 = color7.cpy();
        com.badlogic.gdx.graphics.Color color14 = color8.lerp((float) (-8202), (float) (-7680), (-1.6973618E38f), (float) 1642083276, (float) (-8142));
        com.badlogic.gdx.graphics.Color color15 = color3.sub(color8);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color8, (-133756680));
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color23 = color18.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color18);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color31 = color26.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color39 = color33.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color40 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str41 = color40.toString();
        com.badlogic.gdx.graphics.Color color43 = color33.lerp(color40, (-8.0750596E37f));
        boolean boolean44 = color26.equals((java.lang.Object) color33);
        com.badlogic.gdx.graphics.Color color45 = color25.add(color26);
        com.badlogic.gdx.graphics.Color color46 = com.badlogic.gdx.graphics.Color.SCARLET;
        color46.b = '#';
        com.badlogic.gdx.graphics.Color color49 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color51 = color46.lerp(color49, (float) 1L);
        com.badlogic.gdx.graphics.Color color52 = com.badlogic.gdx.graphics.Color.SALMON;
        float float53 = color52.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str55 = lwjgl3ApplicationConfiguration54.title;
        com.badlogic.gdx.graphics.Color color56 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color56, 16);
        lwjgl3ApplicationConfiguration54.setInitialBackgroundColor(color56);
        com.badlogic.gdx.graphics.Color color64 = color56.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color66 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color72 = color66.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color73 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str74 = color73.toString();
        com.badlogic.gdx.graphics.Color color76 = color66.lerp(color73, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color77 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color77, 16);
        com.badlogic.gdx.graphics.Color color80 = color76.sub(color77);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color77, 1677696502);
        com.badlogic.gdx.graphics.Color color83 = color56.sub(color77);
        com.badlogic.gdx.graphics.Color color84 = color52.add(color77);
        com.badlogic.gdx.graphics.Color color86 = color49.lerp(color77, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color87 = color45.set(color77);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color77, (-66048));
        com.badlogic.gdx.graphics.Color color91 = color77.set(16776960);
        com.badlogic.gdx.graphics.Color color92 = color8.set(color91);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-16777216) + "'", int1 == (-16777216));
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "00ff0000" + "'", str41, "00ff0000");
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
// flaky:         org.junit.Assert.assertTrue("'" + float53 + "' != '" + (-1.7013959E38f) + "'", float53 == (-1.7013959E38f));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color72);
        org.junit.Assert.assertNotNull(color73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "00ff0000" + "'", str74, "00ff0000");
        org.junit.Assert.assertNotNull(color76);
        org.junit.Assert.assertNotNull(color77);
        org.junit.Assert.assertNotNull(color80);
        org.junit.Assert.assertNotNull(color83);
        org.junit.Assert.assertNotNull(color84);
        org.junit.Assert.assertNotNull(color86);
        org.junit.Assert.assertNotNull(color87);
        org.junit.Assert.assertNotNull(color91);
        org.junit.Assert.assertNotNull(color92);
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(1671296512);
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        float float3 = color1.r;
        com.badlogic.gdx.graphics.Color color9 = color1.lerp((float) (-570425600), (float) 247, (float) (-49695), 6.466791E-24f, (float) (-517931008));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.3882353f + "'", float3 == 0.3882353f);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
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
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        int int20 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = lwjgl3ApplicationConfiguration0.windowListener;
        boolean boolean22 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration23.audioDeviceBufferCount = 2088960;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNull(lwjgl3WindowListener21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode10 = lwjgl3ApplicationConfiguration0.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int12 = lwjgl3ApplicationConfiguration11.getaudioDeviceBufferSize();
        boolean boolean13 = lwjgl3ApplicationConfiguration11.windowResizable;
        lwjgl3ApplicationConfiguration11.disableAudio = false;
        lwjgl3ApplicationConfiguration11.setwindowHeight((int) (byte) 10);
        int int18 = lwjgl3ApplicationConfiguration11.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration19.setpreferencesFileType(fileType20);
        lwjgl3ApplicationConfiguration19.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration19.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration19.g = (short) 0;
        lwjgl3ApplicationConfiguration19.windowX = 35;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = lwjgl3ApplicationConfiguration19.hdpiMode;
        lwjgl3ApplicationConfiguration11.hdpiMode = hdpiMode31;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode31;
        lwjgl3ApplicationConfiguration0.setwindowWidth((-68935680));
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        int int38 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setwindowWidth((-204539423));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + hdpiMode10 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode10.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (-262646));
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int14 = lwjgl3ApplicationConfiguration13.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration6.preferencesFileType;
        boolean boolean8 = lwjgl3ApplicationConfiguration6.getdisableAudio();
        lwjgl3ApplicationConfiguration6.samples = 16777215;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration6);
        lwjgl3ApplicationConfiguration6.disableAudio(true);
        int int14 = lwjgl3ApplicationConfiguration6.a;
        int int15 = lwjgl3ApplicationConfiguration6.depth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
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
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        com.badlogic.gdx.Files.FileType fileType27 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean28 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-232);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-668991488), (-16711680), 6528000, 165813744);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-3.32307E36f) + "'", float4 == (-3.32307E36f));
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, (float) 1, 0.13333334f, 1.561203E-39f);
        com.badlogic.gdx.graphics.Color color6 = color4.mul((float) 100);
        com.badlogic.gdx.graphics.Color color11 = color4.add((float) (-1611265692), (float) 6147990, (float) (-1291845633), (float) 63736);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color4);
        int int13 = com.badlogic.gdx.graphics.Color.argb8888(color12);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        int int15 = com.badlogic.gdx.graphics.Color.rgb565(color14);
        int int16 = color14.toIntBits();
        com.badlogic.gdx.graphics.Color color17 = color14.cpy();
        com.badlogic.gdx.graphics.Color color18 = color12.mul(color17);
        com.badlogic.gdx.graphics.Color color23 = color12.mul((-1.515294E38f), (float) (-1562574848), 0.11764706f, (float) (-2304));
        com.badlogic.gdx.graphics.Color color28 = color23.mul((float) 5496352, (float) 16646400, (-1.6097692E-27f), (float) (-946176));
        int int29 = com.badlogic.gdx.graphics.Color.rgb565(color28);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-16711936) + "'", int13 == (-16711936));
        org.junit.Assert.assertNotNull(color14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.samples = (short) 1;
        lwjgl3ApplicationConfiguration10.setwindowHeight(35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration15.setwindowWidth((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration20.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration20.samples = (-1);
        lwjgl3ApplicationConfiguration20.useGL30 = true;
        lwjgl3ApplicationConfiguration20.setpreferencesDirectory("ffff72ff");
        int int29 = lwjgl3ApplicationConfiguration20.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration20.windowY = 20188;
        int int32 = lwjgl3ApplicationConfiguration20.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = lwjgl3ApplicationConfiguration20.hdpiMode;
        lwjgl3ApplicationConfiguration15.hdpiMode = hdpiMode33;
        lwjgl3ApplicationConfiguration10.setHdpiMode(hdpiMode33);
        int int36 = lwjgl3ApplicationConfiguration10.getaudioDeviceBufferCount();
        boolean boolean37 = lwjgl3ApplicationConfiguration10.getwindowDecorated();
        lwjgl3ApplicationConfiguration10.setpreferencesDirectory("009df663");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode33 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode33.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
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
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean18 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        boolean boolean21 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.r = 196080;
        int int24 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-2140995584));
        org.junit.Assert.assertNull(fileType14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 100, (float) (short) 0, (float) 640);
        color4.g = 167247232;
        java.lang.String str7 = color4.toString();
        float float8 = color4.a;
        com.badlogic.gdx.graphics.Color color13 = color4.set((float) (-3367410), (float) 983023, (-1.50936576E8f), (float) (-131072));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ffff00ff" + "'", str7, "ffff00ff");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration6.setaudioDeviceSimultaneousSources((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = lwjgl3ApplicationConfiguration6.windowListener;
        int int10 = lwjgl3ApplicationConfiguration6.samples;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertNull(lwjgl3WindowListener9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 217570864, (float) (-383778816), 1.7633333E-30f, (float) 9);
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1342044720, (float) 5403904, (float) 240, (float) 620756973);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        int int18 = lwjgl3ApplicationConfiguration0.samples;
        int int19 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setWindowedMode((-2132934656), 14500320);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 9, (float) (-50135050), (float) 100, (float) (-255));
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = color6.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str14 = color13.toString();
        com.badlogic.gdx.graphics.Color color16 = color6.lerp(color13, (-8.0750596E37f));
        boolean boolean17 = color4.equals((java.lang.Object) color13);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color23 = color18.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color18);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color31 = color26.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color39 = color33.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color40 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str41 = color40.toString();
        com.badlogic.gdx.graphics.Color color43 = color33.lerp(color40, (-8.0750596E37f));
        boolean boolean44 = color26.equals((java.lang.Object) color33);
        com.badlogic.gdx.graphics.Color color45 = color25.add(color26);
        com.badlogic.gdx.graphics.Color color46 = com.badlogic.gdx.graphics.Color.SCARLET;
        color46.b = '#';
        com.badlogic.gdx.graphics.Color color49 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color51 = color46.lerp(color49, (float) 1L);
        com.badlogic.gdx.graphics.Color color52 = com.badlogic.gdx.graphics.Color.SALMON;
        float float53 = color52.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str55 = lwjgl3ApplicationConfiguration54.title;
        com.badlogic.gdx.graphics.Color color56 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color56, 16);
        lwjgl3ApplicationConfiguration54.setInitialBackgroundColor(color56);
        com.badlogic.gdx.graphics.Color color64 = color56.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color66 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color72 = color66.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color73 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str74 = color73.toString();
        com.badlogic.gdx.graphics.Color color76 = color66.lerp(color73, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color77 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color77, 16);
        com.badlogic.gdx.graphics.Color color80 = color76.sub(color77);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color77, 1677696502);
        com.badlogic.gdx.graphics.Color color83 = color56.sub(color77);
        com.badlogic.gdx.graphics.Color color84 = color52.add(color77);
        com.badlogic.gdx.graphics.Color color86 = color49.lerp(color77, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color87 = color45.set(color77);
        java.lang.String str88 = color77.toString();
        com.badlogic.gdx.graphics.Color color89 = color4.set(color77);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00ff0000" + "'", str14, "00ff0000");
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "00ff0000" + "'", str41, "00ff0000");
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
// flaky:         org.junit.Assert.assertTrue("'" + float53 + "' != '" + (-1.7013959E38f) + "'", float53 == (-1.7013959E38f));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color72);
        org.junit.Assert.assertNotNull(color73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "00ff0000" + "'", str74, "00ff0000");
        org.junit.Assert.assertNotNull(color76);
        org.junit.Assert.assertNotNull(color77);
        org.junit.Assert.assertNotNull(color80);
        org.junit.Assert.assertNotNull(color83);
        org.junit.Assert.assertNotNull(color84);
        org.junit.Assert.assertNotNull(color86);
        org.junit.Assert.assertNotNull(color87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "00000000" + "'", str88, "00000000");
        org.junit.Assert.assertNotNull(color89);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, 10224804);
        int int19 = lwjgl3ApplicationConfiguration0.g;
        boolean boolean20 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = lwjgl3ApplicationConfiguration0.hdpiMode;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-8414));
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color1, (-16450560));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 587202527 + "'", int2 == 587202527);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-57088));
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((-5.915194E37f), (float) 2080800, (float) 255, (float) (-1291845888));
        com.badlogic.gdx.graphics.Color color7 = color1.sub(color6);
        color1.r = (-563347472);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
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
        int int20 = lwjgl3ApplicationConfiguration16.getwindowY();
        lwjgl3ApplicationConfiguration16.setaudioDeviceBufferCount(852308735);
        int int23 = lwjgl3ApplicationConfiguration16.windowHeight;
        int int24 = lwjgl3ApplicationConfiguration16.samples;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 480 + "'", int23 == 480);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        float float1 = color0.b;
        com.badlogic.gdx.graphics.Color color6 = color0.set((float) (-805306422), (float) (-16515072), (float) (-568254208), (float) 3104);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-80190464), 371093301, 57856, (-393464));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8424192) + "'", int4 == (-8424192));
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
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
        com.badlogic.gdx.graphics.Color color17 = color8.clamp();
        float float18 = color17.g;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 58111, (float) 100, (float) (-95), (float) (-2105704448));
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
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
        com.badlogic.gdx.graphics.Color color53 = color12.set(10.0f, (float) (-1562574848), (float) 640, (float) 'a');
        com.badlogic.gdx.graphics.Color color54 = com.badlogic.gdx.graphics.Color.ORANGE;
        com.badlogic.gdx.graphics.Color color55 = color12.add(color54);
        com.badlogic.gdx.graphics.Color color56 = color12.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color61 = color12.add(3.202403E-39f, (float) (-57312), (float) (-13562097), (float) 65508);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "030c00fc" + "'", str9, "030c00fc");
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
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color61);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-117456896), (float) 14317056, (float) 2285311, 0.6117647f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-65380) + "'", int4 == (-65380));
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration13.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration13.samples = (-1);
        lwjgl3ApplicationConfiguration13.useGL30 = true;
        lwjgl3ApplicationConfiguration13.setpreferencesDirectory("ffff72ff");
        int int22 = lwjgl3ApplicationConfiguration13.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration13.windowY = 20188;
        int int25 = lwjgl3ApplicationConfiguration13.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = lwjgl3ApplicationConfiguration13.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode26;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration28.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration28.windowX = 100;
        int int33 = lwjgl3ApplicationConfiguration28.g;
        com.badlogic.gdx.Files.FileType fileType34 = lwjgl3ApplicationConfiguration28.getpreferencesFileType();
        int int35 = lwjgl3ApplicationConfiguration28.b;
        lwjgl3ApplicationConfiguration28.windowDecorated = true;
        com.badlogic.gdx.Files.FileType fileType38 = lwjgl3ApplicationConfiguration28.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType38);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration40.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3ApplicationConfiguration40.windowListener = lwjgl3WindowListener43;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + fileType34 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType34.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + fileType38 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType38.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration40);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
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
        lwjgl3ApplicationConfiguration16.useOpenGL3(false, 497025024, (-63616));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".prefs/" + "'", str19, ".prefs/");
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-16777248), (float) 16776960, 8.908043E-39f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-256) + "'", int3 == (-256));
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int6 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.stencil = (short) 100;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.r = (-4096);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration12.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration12.samples = '4';
        int int17 = lwjgl3ApplicationConfiguration12.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType22 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration18.setPreferencesConfig("hi!", fileType22);
        lwjgl3ApplicationConfiguration12.preferencesFileType = fileType22;
        lwjgl3ApplicationConfiguration12.setInitialVisible(false);
        lwjgl3ApplicationConfiguration12.audioDeviceBufferSize = (byte) 0;
        lwjgl3ApplicationConfiguration12.setpreferencesDirectory("000000ff");
        int int31 = lwjgl3ApplicationConfiguration12.b;
        lwjgl3ApplicationConfiguration12.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration34.setpreferencesFileType(fileType35);
        lwjgl3ApplicationConfiguration34.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("", fileType40);
        lwjgl3ApplicationConfiguration34.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration34);
        lwjgl3ApplicationConfiguration44.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration44);
        int int48 = lwjgl3ApplicationConfiguration47.a;
        lwjgl3ApplicationConfiguration47.initialVisible = true;
        lwjgl3ApplicationConfiguration47.setAudioConfig(63736, (-134217728), 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str57 = lwjgl3ApplicationConfiguration56.title;
        lwjgl3ApplicationConfiguration56.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration56.setgles30ContextMinorVersion(65295);
        boolean boolean62 = lwjgl3ApplicationConfiguration56.getwindowResizable();
        int int63 = lwjgl3ApplicationConfiguration56.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration56.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration67 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration67.setDecorated(false);
        lwjgl3ApplicationConfiguration67.a = (byte) 10;
        boolean boolean72 = lwjgl3ApplicationConfiguration67.initialVisible;
        int int73 = lwjgl3ApplicationConfiguration67.b;
        lwjgl3ApplicationConfiguration67.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color76 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration67.initialBackgroundColor = color76;
        boolean boolean78 = lwjgl3ApplicationConfiguration67.useGL30;
        com.badlogic.gdx.Files.FileType fileType79 = lwjgl3ApplicationConfiguration67.preferencesFileType;
        lwjgl3ApplicationConfiguration56.setPreferencesConfig("", fileType79);
        lwjgl3ApplicationConfiguration47.setPreferencesConfig("ffffffb2", fileType79);
        lwjgl3ApplicationConfiguration12.setpreferencesFileType(fileType79);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType79);
        boolean boolean84 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + fileType22 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType22.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration44);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 8 + "'", int48 == 8);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 512 + "'", int63 == 512);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 8 + "'", int73 == 8);
        org.junit.Assert.assertNotNull(color76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + fileType79 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType79.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-10), (-1103230192), (-2490368), (-7905), (-63751), (-532099584), 537395200);
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, (-518127616));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int6 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.stencil = (short) 100;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.r = (-4096);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int9 = lwjgl3ApplicationConfiguration0.windowX;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
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
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color42 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color43 = color41.set(color42);
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color(color41);
        com.badlogic.gdx.graphics.Color color46 = color27.lerp(color44, (float) (-1291845633));
        int int47 = com.badlogic.gdx.graphics.Color.rgb888(color27);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(color27);
        int int49 = com.badlogic.gdx.graphics.Color.rgb565(color27);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ffffffff" + "'", str34, "ffffffff");
        org.junit.Assert.assertNotNull(color35);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color46);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.FOREST;
        int int1 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        int int2 = color0.toIntBits();
        color0.g = 512;
        float float5 = color0.toFloatBits();
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color15 = color9.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color16 = color7.mul(color15);
        int int17 = com.badlogic.gdx.graphics.Color.argb8888(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str19 = lwjgl3ApplicationConfiguration18.title;
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color20, 16);
        lwjgl3ApplicationConfiguration18.setInitialBackgroundColor(color20);
        int int24 = lwjgl3ApplicationConfiguration18.g;
        boolean boolean25 = color16.equals((java.lang.Object) lwjgl3ApplicationConfiguration18);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(25500);
        color27.g = (-1.6615402E38f);
        com.badlogic.gdx.graphics.Color color30 = color16.set(color27);
        float float31 = color27.a;
        com.badlogic.gdx.graphics.Color color33 = color0.lerp(color27, (float) (-58475));
        com.badlogic.gdx.graphics.Color color38 = color27.set((float) 16772625, (float) (-23877346), (float) (-69373504), (float) (-65023));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration39.setpreferencesFileType(fileType40);
        lwjgl3ApplicationConfiguration39.useVsync(false);
        lwjgl3ApplicationConfiguration39.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration39);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration46);
        int int48 = lwjgl3ApplicationConfiguration46.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration46.setwindowX((-14513374));
        lwjgl3ApplicationConfiguration46.preferencesDirectory = "ff660000";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener53 = null;
        lwjgl3ApplicationConfiguration46.windowListener = lwjgl3WindowListener53;
        lwjgl3ApplicationConfiguration46.stencil = 35904;
        int int57 = lwjgl3ApplicationConfiguration46.g;
        lwjgl3ApplicationConfiguration46.setAudioConfig((-65400), (-16711923), (-2140995584));
        boolean boolean62 = color27.equals((java.lang.Object) lwjgl3ApplicationConfiguration46);
        color27.b = (-33576664);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.3326216E-38f + "'", float5 == 2.3326216E-38f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16711935 + "'", int17 == 16711935);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.6117647f + "'", float31 == 0.6117647f);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration46);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 8 + "'", int57 == 8);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.windowWidth = (-8672);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int13 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(61440);
        com.badlogic.gdx.graphics.Color color3 = color1.set((-1081344));
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setTitle("ffff0200");
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-37995);
        int int14 = lwjgl3ApplicationConfiguration0.stencil;
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 16777215;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 1799159552;
        lwjgl3ApplicationConfiguration0.r = 62730;
        int int13 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
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
        com.badlogic.gdx.graphics.Color color26 = color15.lerp((float) 16711935, (float) (-40036), (float) (-1306385665), (float) (-10420224), (-1.7005551E38f));
        int int27 = com.badlogic.gdx.graphics.Color.rgba8888(color26);
        int int28 = com.badlogic.gdx.graphics.Color.rgba8888(color26);
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16777215 + "'", int27 == 16777215);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16777215 + "'", int28 == 16777215);
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((-255.0f), (float) 65519);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-239) + "'", int2 == (-239));
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
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
        int int20 = lwjgl3ApplicationConfiguration16.getwindowY();
        lwjgl3ApplicationConfiguration16.setaudioDeviceSimultaneousSources((-14513374));
        lwjgl3ApplicationConfiguration16.useGL30 = false;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GREEN;
        com.badlogic.gdx.graphics.Color color6 = color0.lerp((-4.581683E37f), (float) 20160, (float) 13260, (float) (-187392), (float) (-1879860224));
        color6.r = 0.44444445f;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color6, (-134355456));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color6, (-112792302));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color6, 653309);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((float) 160, (float) 1070333936, (float) (-1311232), (float) 40462);
        com.badlogic.gdx.graphics.Color color20 = color6.sub(color19);
        float float21 = color20.r;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.g = (short) 0;
        lwjgl3ApplicationConfiguration0.windowX = 35;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 56864, 151015132);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration17.setpreferencesFileType(fileType18);
        lwjgl3ApplicationConfiguration17.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration17.setPreferencesConfig("", fileType23);
        lwjgl3ApplicationConfiguration17.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration17);
        lwjgl3ApplicationConfiguration27.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration27);
        lwjgl3ApplicationConfiguration27.title = "004e4edc";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration33.setFullscreenMode(displayMode34);
        com.badlogic.gdx.Files.FileType fileType36 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration33.setpreferencesFileType(fileType36);
        lwjgl3ApplicationConfiguration33.b = 6529016;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = lwjgl3ApplicationConfiguration33.hdpiMode;
        lwjgl3ApplicationConfiguration27.hdpiMode = hdpiMode40;
        lwjgl3ApplicationConfiguration16.hdpiMode = hdpiMode40;
        int int43 = lwjgl3ApplicationConfiguration16.windowHeight;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration30);
        org.junit.Assert.assertTrue("'" + fileType36 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType36.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 480 + "'", int43 == 480);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int18 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int19 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str20 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ".prefs/" + "'", str20, ".prefs/");
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-240);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (-56576), 63736, (-248), 63736, 0, (-65400));
        lwjgl3ApplicationConfiguration0.g = (-1175296);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
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
        lwjgl3ApplicationConfiguration0.b = 34277;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((-6.311853E36f), (float) (-318963712), 0.0f, 3.57E-43f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
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
        lwjgl3ApplicationConfiguration8.setpreferencesDirectory("fffff6e0");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        lwjgl3ApplicationConfiguration8.setBackBufferConfig(14811391, 30600, (-1105680), 587202559, (-136), 16774389, (-405213696));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 480 + "'", int26 == 480);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration31);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.r = 1677696502;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.windowY = 65290;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-1011333568));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2147424768));
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-7876885), (float) 0L, (float) 6529016, (-0.49791527f));
        com.badlogic.gdx.graphics.Color color6 = color4.set(537395200);
        color4.g = 2;
        int int9 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        com.badlogic.gdx.graphics.Color color14 = color4.sub((float) 3570, (float) 56864, (float) (-2304), (float) (-33463396));
        int int15 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 570294272 + "'", int9 == 570294272);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 65535 + "'", int15 == 65535);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
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
        com.badlogic.gdx.graphics.Color color46 = color41.mul((float) (-379904), (float) ' ', (float) 16711935, (float) (-32770560));
        int int47 = color41.toIntBits();
        int int48 = com.badlogic.gdx.graphics.Color.rgb888(color41);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color41, (-16385536));
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ffff0000" + "'", str34, "ffff0000");
        org.junit.Assert.assertNotNull(color35);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
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
        lwjgl3ApplicationConfiguration0.b = 34277;
        lwjgl3ApplicationConfiguration0.setwindowY(63488);
        boolean boolean16 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.windowX = 1442840575;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 33488386, (float) 61450, (-1.6986602E38f), 0.0f);
        com.badlogic.gdx.graphics.Color color10 = color4.lerp((float) 61680, (float) 3570, 2.5908401E33f, (float) (-988889088), (float) 267321600);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (-262144));
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, 480, (int) '#', (int) 'a', 1677696502, (int) '#', (int) (short) 0);
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration15.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Files.FileType fileType18 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType18);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(65295, 10224804);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertTrue("'" + fileType18 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType18.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-1904640), (-1828912896), 130816, 520093696);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.5149045E38f) + "'", float4 == (-1.5149045E38f));
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.a = (-167706623);
        lwjgl3ApplicationConfiguration0.setwindowY(0);
        int int14 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.title = "ffffffee";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
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
        lwjgl3ApplicationConfiguration13.setaudioDeviceBufferCount((-14492160));
        lwjgl3ApplicationConfiguration13.setwindowDecorated(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-194841600);
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        int int2 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.title = "f3f000ff";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (-262646));
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.getaudioDeviceSimultaneousSources();
        java.lang.String str12 = lwjgl3ApplicationConfiguration10.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
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
        int int12 = lwjgl3ApplicationConfiguration7.g;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, (-4.28676E37f), 0.057594743f, (float) (-254));
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (-2091510));
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (int) 'a');
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) (short) 0);
        float float6 = color0.a;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(63518);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.graphics.Color color5 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color2, 16);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color2);
        com.badlogic.gdx.graphics.Color color10 = color2.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str20 = color19.toString();
        com.badlogic.gdx.graphics.Color color22 = color12.lerp(color19, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color23, 16);
        com.badlogic.gdx.graphics.Color color26 = color22.sub(color23);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color23, 1677696502);
        com.badlogic.gdx.graphics.Color color29 = color2.sub(color23);
        java.lang.String str30 = color2.toString();
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color((-1.6950243E38f), 2.9692728E-8f, (float) (-2147483648), (float) 1L);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color35);
        int int37 = com.badlogic.gdx.graphics.Color.argb8888(color35);
        int int38 = com.badlogic.gdx.graphics.Color.argb8888(color35);
        com.badlogic.gdx.graphics.Color color39 = color2.add(color35);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00ff0000" + "'", str20, "00ff0000");
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000000" + "'", str30, "00000000");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-16777216) + "'", int37 == (-16777216));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-16777216) + "'", int38 == (-16777216));
        org.junit.Assert.assertNotNull(color39);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, (int) (byte) 100);
        color4.r = 31;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration12.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration12.disableAudio = true;
        int int17 = lwjgl3ApplicationConfiguration12.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = lwjgl3ApplicationConfiguration12.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration20.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration20.windowX = 100;
        int int25 = lwjgl3ApplicationConfiguration20.g;
        com.badlogic.gdx.Files.FileType fileType26 = lwjgl3ApplicationConfiguration20.preferencesFileType;
        lwjgl3ApplicationConfiguration12.setPreferencesConfig("4169e1ff", fileType26);
        boolean boolean28 = lwjgl3ApplicationConfiguration12.initialVisible;
        int int29 = lwjgl3ApplicationConfiguration12.getaudioDeviceSimultaneousSources();
        boolean boolean30 = color4.equals((java.lang.Object) int29);
        color4.g = 65025;
        int int33 = color4.toIntBits();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 16 + "'", int29 == 16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-48037919) + "'", int33 == (-48037919));
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
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
        lwjgl3ApplicationConfiguration15.g = 2047;
        int int40 = lwjgl3ApplicationConfiguration15.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + fileType31 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType31.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 16 + "'", int40 == 16);
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        lwjgl3ApplicationConfiguration0.title = "";
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.g = ' ';
        com.badlogic.gdx.graphics.Color color8 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
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
        int int40 = com.badlogic.gdx.graphics.Color.rgb565(color9);
        com.badlogic.gdx.graphics.Color color45 = color9.mul((float) (byte) 0, (float) (byte) 100, (float) 35, (float) (-255));
        com.badlogic.gdx.graphics.Color color50 = color9.mul(0.0f, (float) 6529016, (float) (short) 100, (float) (-1));
        com.badlogic.gdx.graphics.Color color51 = color8.sub(color50);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color8, (-262176));
        float float54 = color8.r;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(color8);
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
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2047 + "'", int40 == 2047);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 1.0f + "'", float54 == 1.0f);
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-33488131);
        lwjgl3ApplicationConfiguration0.setwindowX((-16734721));
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-58475));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-510);
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        int int17 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int18 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 480 + "'", int17 == 480);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setsamples(1671296512);
        int int15 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int16 = lwjgl3ApplicationConfiguration0.g;
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration18.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration18.windowX = 100;
        int int23 = lwjgl3ApplicationConfiguration18.g;
        com.badlogic.gdx.Files.FileType fileType24 = lwjgl3ApplicationConfiguration18.getpreferencesFileType();
        boolean boolean25 = lwjgl3ApplicationConfiguration18.windowDecorated;
        int int26 = lwjgl3ApplicationConfiguration18.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType27 = lwjgl3ApplicationConfiguration18.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType27);
        com.badlogic.gdx.Files.FileType fileType29 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int30 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + fileType24 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType24.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType29 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType29.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 480 + "'", int30 == 480);
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowX = 512;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setsamples(256);
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.graphics.Color color17 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.a = (-327680);
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ffff72ff" + "'", str15, "ffff72ff");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        int int11 = color1.toIntBits();
        com.badlogic.gdx.graphics.Color color16 = color1.add((float) 16744272, (float) (-49400), (float) 1799159552, (float) 20188);
        float float17 = color1.a;
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((float) (-16189440), (float) 16711680, (-1.6969465E38f), (float) (-135823360));
        com.badlogic.gdx.graphics.Color color23 = color1.sub(color22);
        int int24 = com.badlogic.gdx.graphics.Color.rgb565(color23);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16711935 + "'", int11 == 16711935);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 63519 + "'", int24 == 63519);
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(65024);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-1562574848));
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("0000ee00");
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0000ee00" + "'", str12, "0000ee00");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.a = (-167706623);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff09f6");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
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
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color12, 14);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color27 = color12.lerp(0.0f, (float) (-1056), (float) (-402678048), (-8.089319E30f), (float) 1442840575);
        float float28 = color27.g;
        com.badlogic.gdx.graphics.Color color33 = color27.sub((float) (-940), (float) (-2137260032), (float) (-1268), (float) (-820510720));
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00ff0000" + "'", str9, "00ff0000");
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.06666667f + "'", float18 == 0.06666667f);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.title = "8ff00000";
        int int9 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(184504044);
        int int12 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration13.setWindowedMode(1, 10);
        int int19 = lwjgl3ApplicationConfiguration13.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = lwjgl3ApplicationConfiguration13.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setdepth(46544);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-851456), (-16777184));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        com.badlogic.gdx.Files.FileType fileType4 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.windowHeight = 35;
        java.lang.String str7 = lwjgl3ApplicationConfiguration0.title;
        int int8 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int9 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowY = 3582;
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color12;
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(13260);
        com.badlogic.gdx.graphics.Color color3 = color1.set(16193265);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-65400));
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.graphics.Color color8 = color1.lerp((-1.3685977E38f), (float) (-318963712), (float) 16777206, 6.645736E35f, (float) (-2097152256));
        com.badlogic.gdx.graphics.Color color9 = color1.premultiplyAlpha();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1996488960) + "'", int2 == (-1996488960));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color6 = color1.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color14 = color9.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color22 = color16.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str24 = color23.toString();
        com.badlogic.gdx.graphics.Color color26 = color16.lerp(color23, (-8.0750596E37f));
        boolean boolean27 = color9.equals((java.lang.Object) color16);
        com.badlogic.gdx.graphics.Color color28 = color8.add(color9);
        com.badlogic.gdx.graphics.Color color30 = color0.lerp(color8, (float) (-14540110));
        int int31 = com.badlogic.gdx.graphics.Color.rgb565(color0);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color37 = color0.set((float) 31334400, (-1.701282E38f), (float) (-786912), (float) (-16711923));
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(color0);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00ff0000" + "'", str24, "00ff0000");
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2047 + "'", int31 == 2047);
        org.junit.Assert.assertNotNull(color37);
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.useVsync(true);
        int int13 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.setAudioConfig((-68022262), 16711680, (-19889));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration18.setpreferencesFileType(fileType19);
        lwjgl3ApplicationConfiguration18.useVsync(false);
        lwjgl3ApplicationConfiguration18.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration18.a = (-62986);
        lwjgl3ApplicationConfiguration18.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration18.hdpiMode = hdpiMode30;
        boolean boolean32 = lwjgl3ApplicationConfiguration18.windowDecorated;
        boolean boolean33 = lwjgl3ApplicationConfiguration18.getwindowDecorated();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration34.setWindowedMode(1, 10);
        int int40 = lwjgl3ApplicationConfiguration34.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3ApplicationConfiguration42.setFullscreenMode(displayMode43);
        lwjgl3ApplicationConfiguration42.samples = (-1);
        lwjgl3ApplicationConfiguration42.useGL30 = true;
        lwjgl3ApplicationConfiguration42.setpreferencesDirectory("ffff72ff");
        int int51 = lwjgl3ApplicationConfiguration42.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration42.windowY = 20188;
        int int54 = lwjgl3ApplicationConfiguration42.getaudioDeviceBufferCount();
        com.badlogic.gdx.Files.FileType fileType55 = lwjgl3ApplicationConfiguration42.preferencesFileType;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("6b8e23ff", fileType55);
        lwjgl3ApplicationConfiguration18.setpreferencesFileType(fileType55);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str59 = lwjgl3ApplicationConfiguration58.title;
        int int60 = lwjgl3ApplicationConfiguration58.samples;
        com.badlogic.gdx.Files.FileType fileType61 = lwjgl3ApplicationConfiguration58.getpreferencesFileType();
        int int62 = lwjgl3ApplicationConfiguration58.gles30ContextMinorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode63 = lwjgl3ApplicationConfiguration58.hdpiMode;
        lwjgl3ApplicationConfiguration18.hdpiMode = hdpiMode63;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode63;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode30 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode30.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 9 + "'", int54 == 9);
        org.junit.Assert.assertTrue("'" + fileType55 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType55.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + fileType61 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType61.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode63 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode63.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
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
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-56576));
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-201326593));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNull(fileType20);
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setwindowX((-14513374));
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        com.badlogic.gdx.graphics.Color color16 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        color16.r = 16777200;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.setwindowX((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = lwjgl3ApplicationConfiguration7.fullscreenMode;
        boolean boolean11 = lwjgl3ApplicationConfiguration7.windowResizable;
        lwjgl3ApplicationConfiguration7.disableAudio = false;
        lwjgl3ApplicationConfiguration7.setDecorated(false);
        lwjgl3ApplicationConfiguration7.setwindowX(6180224);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(lwjgl3DisplayMode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.useVsync(false);
        int int10 = lwjgl3ApplicationConfiguration0.getsamples();
        int int11 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.r = (-1610678528);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
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
        int int15 = lwjgl3ApplicationConfiguration14.r;
        boolean boolean16 = lwjgl3ApplicationConfiguration14.getdisableAudio();
        int int17 = lwjgl3ApplicationConfiguration14.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        int int19 = lwjgl3ApplicationConfiguration18.windowWidth;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 640 + "'", int19 == 640);
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int23 = lwjgl3ApplicationConfiguration22.getaudioDeviceBufferSize();
        boolean boolean24 = lwjgl3ApplicationConfiguration22.windowResizable;
        int int25 = lwjgl3ApplicationConfiguration22.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration22.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        lwjgl3ApplicationConfiguration28.setaudioDeviceSimultaneousSources((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType31 = lwjgl3ApplicationConfiguration28.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType31;
        int int33 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setsamples((-16777199));
        int int36 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        java.lang.String str37 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setwindowY((-58475));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration28);
        org.junit.Assert.assertTrue("'" + fileType31 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType31.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "4169e1ff" + "'", str37, "4169e1ff");
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(167247232);
        com.badlogic.gdx.graphics.Color color2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color4 = color1.lerp(color2, (float) 61695);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 0);
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration10.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration10.samples = '4';
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration10.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType15;
        lwjgl3ApplicationConfiguration0.windowY = 52;
        int int19 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int20 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
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
        lwjgl3ApplicationConfiguration10.audioDeviceSimultaneousSources = (-45840);
        int int27 = lwjgl3ApplicationConfiguration10.windowY;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.561203E-39f + "'", float20 == 1.561203E-39f);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.g = 16580354;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.g = (-134610432);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("ffff65b6");
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((-8.089319E30f), (-1.6894161E38f), (float) (-32768), (float) (-1669267456), (float) (-1728));
        com.badlogic.gdx.graphics.Color color12 = color7.set((float) (-148496), (float) (-15146705), (float) 50134532, 0.35483873f);
        color12.r = (-554880);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int2 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-50135050), (-16), (-4849409));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color16 = color11.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color16, 100);
        com.badlogic.gdx.graphics.Color color20 = color16.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color20, 8897069);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color28 = color23.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color23);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color29);
        int int31 = com.badlogic.gdx.graphics.Color.argb8888(color30);
        int int32 = com.badlogic.gdx.graphics.Color.rgba8888(color30);
        com.badlogic.gdx.graphics.Color color34 = color20.lerp(color30, (float) 1044480);
        com.badlogic.gdx.graphics.Color color39 = color34.add((float) '4', (float) 10, (float) (short) 1, 0.69803923f);
        float float40 = color34.r;
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color34);
        float float42 = color41.r;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color41);
        int int44 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16777215 + "'", int31 == 16777215);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-256) + "'", int32 == (-256));
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, 130560);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-167706623), 8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration13.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration13.windowX = 100;
        int int18 = lwjgl3ApplicationConfiguration13.g;
        com.badlogic.gdx.Files.FileType fileType19 = lwjgl3ApplicationConfiguration13.getpreferencesFileType();
        int int20 = lwjgl3ApplicationConfiguration13.b;
        lwjgl3ApplicationConfiguration13.windowDecorated = true;
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration13.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00000000", fileType23);
        int int25 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("ffdff600");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + fileType19 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType19.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
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
        lwjgl3ApplicationConfiguration0.windowX = (-65025);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setwindowY((-32768));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 35904, (float) (-2112), (float) (-8960), (float) (-1303445504));
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        int int16 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) (byte) 1);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(250675200);
        int int21 = com.badlogic.gdx.graphics.Color.rgb565(color20);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        int int23 = lwjgl3ApplicationConfiguration0.windowX;
        com.badlogic.gdx.Files.FileType fileType24 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int25 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3936 + "'", int21 == 3936);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(fileType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        lwjgl3ApplicationConfiguration0.title = "";
        int int8 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setTitle("ffff0200");
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int13 = lwjgl3ApplicationConfiguration0.getwindowY();
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-13));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ffff0200" + "'", str14, "ffff0200");
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int11 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 480 + "'", int7 == 480);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
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
        lwjgl3ApplicationConfiguration0.g = (-270598144);
        int int24 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        boolean boolean25 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
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
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int16 = lwjgl3ApplicationConfiguration0.windowWidth;
        boolean boolean17 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
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
        lwjgl3ApplicationConfiguration10.title = "004e4edc";
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        color16.b = (-383778816);
        lwjgl3ApplicationConfiguration10.setInitialBackgroundColor(color16);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color16, 47616);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int2 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        int int5 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 640 + "'", int5 == 640);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
    }

    @Test
    public void test16628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16628");
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
        int int16 = lwjgl3ApplicationConfiguration10.windowY;
        boolean boolean17 = lwjgl3ApplicationConfiguration10.initialVisible;
        lwjgl3ApplicationConfiguration10.setvSyncEnabled(false);
        int int20 = lwjgl3ApplicationConfiguration10.windowWidth;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 640 + "'", int20 == 640);
    }

    @Test
    public void test16629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16629");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (int) 'a');
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str7 = color6.toString();
        com.badlogic.gdx.graphics.Color color8 = color3.sub(color6);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color14 = color9.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color9);
        int int16 = com.badlogic.gdx.graphics.Color.argb8888(color9);
        com.badlogic.gdx.graphics.Color color18 = color9.mul((float) (-262646));
        com.badlogic.gdx.graphics.Color color19 = color6.sub(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int21 = lwjgl3ApplicationConfiguration20.getaudioDeviceBufferSize();
        boolean boolean22 = lwjgl3ApplicationConfiguration20.windowResizable;
        lwjgl3ApplicationConfiguration20.disableAudio = false;
        lwjgl3ApplicationConfiguration20.setResizable(true);
        lwjgl3ApplicationConfiguration20.setwindowX(10);
        lwjgl3ApplicationConfiguration20.gles30ContextMinorVersion = 151015132;
        com.badlogic.gdx.Files.FileType fileType31 = lwjgl3ApplicationConfiguration20.preferencesFileType;
        boolean boolean32 = lwjgl3ApplicationConfiguration20.windowDecorated;
        boolean boolean33 = lwjgl3ApplicationConfiguration20.getwindowDecorated();
        boolean boolean34 = color19.equals((java.lang.Object) lwjgl3ApplicationConfiguration20);
        com.badlogic.gdx.graphics.Color color35 = color19.clamp();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00ff0000" + "'", str7, "00ff0000");
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1291845633) + "'", int16 == (-1291845633));
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + fileType31 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType31.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(color35);
    }

    @Test
    public void test16630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16630");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 16776960, (float) 1242931200, (float) (-7424), (float) (-554880));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-128) + "'", int4 == (-128));
    }

    @Test
    public void test16631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16631");
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
        int int60 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-469852380);
        lwjgl3ApplicationConfiguration0.windowY = (-112792302);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-81856144);
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
    }

    @Test
    public void test16632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16632");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int13 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test16633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16633");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(512, 33554431, (-1879860224), 16776961, (-65024), 65024, (-2147222656));
        lwjgl3ApplicationConfiguration0.windowHeight = (-1902614);
        lwjgl3ApplicationConfiguration0.a = 0;
        boolean boolean25 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int26 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-65024) + "'", int26 == (-65024));
    }

    @Test
    public void test16634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16634");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int7 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.windowWidth = (-1241350299);
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int16 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test16635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16635");
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
        int int37 = com.badlogic.gdx.graphics.Color.rgba8888(color22);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color22, 16252680);
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color22);
        color40.g = (-1.6947657E38f);
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color((-66048));
        int int45 = com.badlogic.gdx.graphics.Color.rgba8888(color44);
        com.badlogic.gdx.graphics.Color color46 = color40.mul(color44);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color44, (-1146897));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 16711935 + "'", int37 == 16711935);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-66048) + "'", int45 == (-66048));
        org.junit.Assert.assertNotNull(color46);
    }

    @Test
    public void test16636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16636");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.windowX = (-5867520);
    }

    @Test
    public void test16637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16637");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.67129651E9f, (float) (-14540110), (float) 2, (-1.5659187E38f));
        com.badlogic.gdx.graphics.Color color5 = color4.cpy();
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((float) 65295, (float) 100, (-1.7013859E38f), 0.0f);
        boolean boolean11 = color4.equals((java.lang.Object) (-1.7013859E38f));
        com.badlogic.gdx.graphics.Color color16 = color4.sub((float) 1878880718, (float) (-156), (-0.49791527f), (-1.6973618E38f));
        color4.g = (-16777119);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(0.8888889f, (float) (-7876885), (-1.24151398E9f), (float) (-250675216));
        com.badlogic.gdx.graphics.Color color24 = color4.sub(color23);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test16638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16638");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-362144));
    }

    @Test
    public void test16639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16639");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1176616480), (float) (-16581120), (float) 512, 0.0f);
    }

    @Test
    public void test16640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16640");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color color14 = color5.add((float) 65024, (float) (-2130837248), (float) (-255), (float) 31334400);
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color20 = color15.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color21);
        java.lang.String str23 = color21.toString();
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color26 = color14.lerp(color24, (-1.515294E38f));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color24, (-587202461));
        int int29 = com.badlogic.gdx.graphics.Color.rgba4444(color24);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.SCARLET;
        com.badlogic.gdx.graphics.Color color32 = color31.clamp();
        com.badlogic.gdx.graphics.Color color33 = color24.set(color32);
        float float34 = color32.a;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ffffffff" + "'", str23, "ffffffff");
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 99 + "'", int29 == 99);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
    }

    @Test
    public void test16641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16641");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) 3570, (float) (-12597000), (float) 151015132, (float) 140834847);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test16642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16642");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        boolean boolean9 = lwjgl3ApplicationConfiguration7.vSyncEnabled;
        lwjgl3ApplicationConfiguration7.g = 'a';
        lwjgl3ApplicationConfiguration7.disableAudio = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        int int15 = lwjgl3ApplicationConfiguration14.audioDeviceSimultaneousSources;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test16643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16643");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setwindowWidth(97);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.valueOf("ffffffb6");
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color12;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test16644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16644");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration8.audioDeviceSimultaneousSources;
        boolean boolean11 = lwjgl3ApplicationConfiguration8.getuseGL30();
        lwjgl3ApplicationConfiguration8.setTitle("ffffffb6");
        boolean boolean14 = lwjgl3ApplicationConfiguration8.getdisableAudio();
        java.lang.String str15 = lwjgl3ApplicationConfiguration8.preferencesDirectory;
        int int16 = lwjgl3ApplicationConfiguration8.getwindowWidth();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
    }

    @Test
    public void test16645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16645");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-369624832), (float) (-65358), (float) (-40036), 0.9529412f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-9474482) + "'", int4 == (-9474482));
    }

    @Test
    public void test16646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16646");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.windowX = (-16741598);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test16647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16647");
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
        lwjgl3ApplicationConfiguration0.a = (-183869281);
        int int17 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.windowHeight = 16773629;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0000ee00" + "'", str12, "0000ee00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
    }

    @Test
    public void test16648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16648");
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
        lwjgl3ApplicationConfiguration16.setAudioConfig((-335), (-2147483648), (-587202461));
        lwjgl3ApplicationConfiguration16.windowY = 65280;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
    }

    @Test
    public void test16649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16649");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (byte) 10, (float) 491322945, (float) (-36), 7.175E-43f);
    }

    @Test
    public void test16650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16650");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setdepth(61680);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int17 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 61680 + "'", int17 == 61680);
    }

    @Test
    public void test16651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16651");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode((-240), 16711858);
        java.lang.String str16 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ffff0200" + "'", str16, "ffff0200");
    }

    @Test
    public void test16652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16652");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.title = "000000ff";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16653");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.windowY = (-50135050);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode20 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color28 = color23.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        color23.g = 151015132;
        com.badlogic.gdx.graphics.Color color35 = color23.sub((float) 10L, (float) 480, (float) (-1611265692), (float) (-8672));
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color23);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color23;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(16707600);
        int int42 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.Files.FileType fileType43 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-6132);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertTrue("'" + fileType43 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType43.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test16654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16654");
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
        boolean boolean19 = lwjgl3ApplicationConfiguration0.disableAudio;
        boolean boolean20 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test16655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16655");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1241513983), 6147990);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowWidth(268493567);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration16.useGL30 = false;
        lwjgl3ApplicationConfiguration16.windowX = (-10518528);
        int int21 = lwjgl3ApplicationConfiguration16.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration16.setaudioDeviceSimultaneousSources((-8));
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
    }

    @Test
    public void test16656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16656");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 1799159552;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
    }

    @Test
    public void test16657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16657");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffff0000";
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.title;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3ApplicationConfiguration0.b = (-26);
        lwjgl3ApplicationConfiguration0.setsamples((-7739648));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test16658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16658");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 2097152, (float) 65290, (float) (-333580800), (float) (-2550));
    }

    @Test
    public void test16659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16659");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 120, (float) (-7632), (float) (-336199680), (-1.6996446E38f));
    }

    @Test
    public void test16660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16660");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color7);
        color7.r = (-65400);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test16661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16661");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration8.audioDeviceSimultaneousSources;
        boolean boolean11 = lwjgl3ApplicationConfiguration8.getuseGL30();
        lwjgl3ApplicationConfiguration8.setTitle("ffffffb6");
        boolean boolean14 = lwjgl3ApplicationConfiguration8.getdisableAudio();
        java.lang.String str15 = lwjgl3ApplicationConfiguration8.preferencesDirectory;
        lwjgl3ApplicationConfiguration8.windowX = (-1844510720);
        lwjgl3ApplicationConfiguration8.setResizable(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
    }

    @Test
    public void test16662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16662");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-67280896));
    }

    @Test
    public void test16663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16663");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color19 = color13.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color20 = color11.mul(color19);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color28 = color22.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color28.g = (short) 1;
        com.badlogic.gdx.graphics.Color color32 = color20.lerp(color28, (float) 25500);
        com.badlogic.gdx.graphics.Color color37 = color20.mul(0.0f, (float) (-8142), (float) (-1562574848), (-1.0f));
        color20.g = '#';
        com.badlogic.gdx.graphics.Color color40 = color9.set(color20);
        com.badlogic.gdx.graphics.Color color45 = color40.set((float) (-12775665), (float) (-2147483392), (float) (-2027264), (float) 16640);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ffffffff" + "'", str8, "ffffffff");
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color45);
    }

    @Test
    public void test16664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16664");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration12.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration12.useVsync(false);
        lwjgl3ApplicationConfiguration12.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        lwjgl3ApplicationConfiguration19.audioDeviceBufferSize = (-10420224);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType23);
        lwjgl3ApplicationConfiguration22.useVsync(false);
        lwjgl3ApplicationConfiguration22.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        lwjgl3ApplicationConfiguration29.setwindowX((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType32 = lwjgl3ApplicationConfiguration29.getpreferencesFileType();
        int int33 = lwjgl3ApplicationConfiguration29.gles30ContextMinorVersion;
        int int34 = lwjgl3ApplicationConfiguration29.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration35.setdepth((int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType38 = lwjgl3ApplicationConfiguration35.preferencesFileType;
        lwjgl3ApplicationConfiguration29.setpreferencesFileType(fileType38);
        lwjgl3ApplicationConfiguration19.preferencesFileType = fileType38;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType38;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration29);
        org.junit.Assert.assertNull(fileType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
        org.junit.Assert.assertTrue("'" + fileType38 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType38.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test16665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16665");
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
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16666");
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
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        boolean boolean29 = color26.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.graphics.Color color34 = color26.sub((float) 0L, (-4.2865007E37f), 2.3509886E-38f, (float) (-8672));
        float float35 = color26.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration36.setpreferencesFileType(fileType37);
        lwjgl3ApplicationConfiguration36.useVsync(false);
        lwjgl3ApplicationConfiguration36.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration36);
        boolean boolean44 = lwjgl3ApplicationConfiguration36.windowDecorated;
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.GREEN;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color45);
        com.badlogic.gdx.graphics.Color color51 = color45.set((-2.231065E33f), (float) (-65486), (float) (-56576), (-1.6482297E38f));
        com.badlogic.gdx.graphics.Color color52 = color26.mul(color51);
        float float53 = color52.toFloatBits();
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color((-2147483392));
        com.badlogic.gdx.graphics.Color color56 = color52.add(color55);
        com.badlogic.gdx.graphics.Color color62 = color56.lerp((float) (-13708800), (float) (-353108224), (float) (-24103296), (float) (-2140930048), (float) (-16581375));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.7014117E38f) + "'", float35 == (-1.7014117E38f));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color62);
    }

    @Test
    public void test16667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16667");
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
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        int int18 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        boolean boolean21 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-150994945);
        int int24 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
    }

    @Test
    public void test16668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16668");
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
        int int17 = lwjgl3ApplicationConfiguration12.getaudioDeviceSimultaneousSources();
        boolean boolean18 = lwjgl3ApplicationConfiguration12.initialVisible;
        boolean boolean19 = lwjgl3ApplicationConfiguration12.disableAudio;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test16669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16669");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-222));
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int15 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 480 + "'", int7 == 480);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test16670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16670");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.stencil = (-1);
        int int7 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(16769536);
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16671");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color3 = color0.set(35);
        com.badlogic.gdx.graphics.Color color4 = color0.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color9 = color0.mul(0.0f, (float) 65535, (float) (-32), (float) (-1));
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color17 = color12.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = color11.sub(color17);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color11, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color26 = color11.mul((float) (-222), (-1.5084639E38f), (float) (-62986), (float) (-16741598));
        float float27 = color26.r;
        com.badlogic.gdx.graphics.Color color28 = color26.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color30 = color9.lerp(color26, (float) 16580354);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color40 = color34.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color41 = color32.mul(color40);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color43 = color26.set(color42);
        float float44 = color26.b;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-0.0f) + "'", float27 == (-0.0f));
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
    }

    @Test
    public void test16672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16672");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-33488131));
        int int10 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int12 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = lwjgl3ApplicationConfiguration0.hdpiMode;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener15);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test16673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16673");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int12 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.windowY = (-752);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test16674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16674");
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
        int int21 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setwindowWidth((-52));
        int int26 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test16675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16675");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 16777215;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.windowHeight = (-524800);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test16676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16676");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BLACK;
        float float3 = color2.r;
        color2.r = 1671296512;
        com.badlogic.gdx.graphics.Color color6 = color1.sub(color2);
        float float7 = color2.g;
        com.badlogic.gdx.graphics.Color color8 = color2.clamp();
        int int9 = com.badlogic.gdx.graphics.Color.argb8888(color8);
        int int10 = com.badlogic.gdx.graphics.Color.rgb888(color8);
        com.badlogic.gdx.graphics.Color color15 = color8.set((-4.26002E37f), (-5.4452915E37f), 0.0f, (float) 1857089546);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-65400.0f) + "'", float3 == (-65400.0f));
        org.junit.Assert.assertNotNull(color6);
// flaky:         org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-65536) + "'", int9 == (-65536));
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16711680 + "'", int10 == 16711680);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test16677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16677");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int8 = lwjgl3ApplicationConfiguration0.getsamples();
        int int9 = lwjgl3ApplicationConfiguration0.getsamples();
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.setwindowWidth((-8414));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test16678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16678");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-780810), (float) 4874240, (-6.9119856E37f), (float) 653309);
    }

    @Test
    public void test16679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16679");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffffff00");
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.stencil = 16776961;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test16680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16680");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        int int16 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        int int19 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setTitle("ff9df663");
        lwjgl3ApplicationConfiguration0.windowWidth = (-61200);
        boolean boolean24 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test16681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16681");
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
        int int38 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode35 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode35.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
    }

    @Test
    public void test16682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16682");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ORANGE;
        int int1 = color0.toIntBits();
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color7 = color2.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color2);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color color10 = color0.mul(color9);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0.0f, (float) 1, 0.13333334f, 1.561203E-39f);
        boolean boolean16 = color10.equals((java.lang.Object) color15);
        int int17 = color15.toIntBits();
        com.badlogic.gdx.graphics.Color color22 = color15.sub((float) (-16768992), (-1.6419017E38f), (float) (-32), (float) (-1728));
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((float) (-128512), (float) (-1902614), (float) 573767680, (float) (-1));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color27, 1878880718);
        com.badlogic.gdx.graphics.Color color30 = color22.add(color27);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-16777216) + "'", int1 == (-16777216));
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2293504 + "'", int17 == 2293504);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color30);
    }

    @Test
    public void test16683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16683");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color8 = color7.clamp();
        color7.a = (-1.4936944E38f);
        com.badlogic.gdx.graphics.Color color12 = color7.set(33554176);
        com.badlogic.gdx.graphics.Color color14 = color12.mul(0.0f);
        color12.a = (-4.5858366E37f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test16684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16684");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-8520704));
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        color1.a = 15924678;
    }

    @Test
    public void test16685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16685");
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
        int int19 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.title = "4169e1ff";
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-485166560);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test16686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16686");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int13 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(31, (-524536), (-16776961), (-61455), 5147940, (-16777215), 640);
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int24 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-68022262);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test16687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16687");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GREEN;
        com.badlogic.gdx.graphics.Color color6 = color0.lerp((-4.581683E37f), (float) 20160, (float) 13260, (float) (-187392), (float) (-1879860224));
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color6, (-27809536));
        com.badlogic.gdx.graphics.Color color10 = color6.mul((float) 1794115036);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.WHITE;
        com.badlogic.gdx.graphics.Color color12 = color10.sub(color11);
        com.badlogic.gdx.graphics.Color color13 = color12.clamp();
        float float14 = color13.a;
        com.badlogic.gdx.graphics.Color color19 = color13.set((float) (-128508928), (-2.6999944E36f), (float) 570425395, (float) 1175278);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color25 = color20.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color20);
        int int27 = com.badlogic.gdx.graphics.Color.argb8888(color20);
        color20.g = 1671296512;
        com.badlogic.gdx.graphics.Color color34 = color20.sub((-0.0f), (float) (-567943452), (float) (short) 10, (float) 2);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color34, 65535);
        com.badlogic.gdx.graphics.Color color41 = color34.sub((float) (-3145729), (-1.6960587E38f), (float) 49939200, (float) (-34));
        color41.b = 3.6948E-41f;
        com.badlogic.gdx.graphics.Color color44 = color19.mul(color41);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
// flaky:         org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color44);
    }

    @Test
    public void test16688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16688");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.g = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int13 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test16689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16689");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (int) 'a');
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str7 = color6.toString();
        com.badlogic.gdx.graphics.Color color8 = color3.sub(color6);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration10.disableAudio = true;
        int int15 = lwjgl3ApplicationConfiguration10.windowY;
        int int16 = lwjgl3ApplicationConfiguration10.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration10.gles30ContextMajorVersion = 16777215;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        boolean boolean20 = lwjgl3ApplicationConfiguration10.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        lwjgl3ApplicationConfiguration21.setwindowWidth((-268566528));
        int int24 = lwjgl3ApplicationConfiguration21.getdepth();
        boolean boolean25 = color9.equals((java.lang.Object) lwjgl3ApplicationConfiguration21);
        com.badlogic.gdx.graphics.Color color26 = color9.premultiplyAlpha();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00ff0000" + "'", str7, "00ff0000");
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(color26);
    }

    @Test
    public void test16690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16690");
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
        com.badlogic.gdx.graphics.Color color24 = color23.clamp();
        int int25 = com.badlogic.gdx.graphics.Color.rgb565(color24);
        com.badlogic.gdx.graphics.Color color30 = color24.sub((float) (-16777184), (float) (-132758), (float) 26129, (float) (-61363200));
        boolean boolean32 = color30.equals((java.lang.Object) 2.950215E-39f);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 63488 + "'", int25 == 63488);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test16691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16691");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-2147438080));
        lwjgl3ApplicationConfiguration0.title = "f3c766e0";
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test16692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16692");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BLACK;
        float float3 = color2.r;
        color2.r = 1671296512;
        com.badlogic.gdx.graphics.Color color6 = color1.sub(color2);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color8 = color1.clamp();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color1, (-16646400));
        int int11 = com.badlogic.gdx.graphics.Color.rgba4444(color1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (-4325408));
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3855 + "'", int11 == 3855);
    }

    @Test
    public void test16693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16693");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-512);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(16711858);
        int int19 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test16694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16694");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test16695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16695");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowY = 20188;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-22));
        int int17 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test16696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16696");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int6 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.title = "00000000";
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.depth = 16188608;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNull(lwjgl3WindowListener10);
    }

    @Test
    public void test16697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16697");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int13 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-78), (-1), (-1902614), 0, (-65486), (-1), 2);
        int int22 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration23.gles30ContextMinorVersion = (-14671700);
        lwjgl3ApplicationConfiguration23.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration28);
    }

    @Test
    public void test16698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16698");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-9.2908733E13f), (float) (-8407040), (float) (-1984), (float) (-13562097));
    }

    @Test
    public void test16699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16699");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode((-225), 300883446);
    }

    @Test
    public void test16700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16700");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.String str5 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int6 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.title = "ffff09f6";
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.stencil = 1442840575;
        lwjgl3ApplicationConfiguration0.setwindowWidth((-16711681));
        int int14 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".prefs/" + "'", str5, ".prefs/");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test16701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16701");
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
        java.lang.String str16 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16702");
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
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color32 = color27.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color27);
        int int34 = com.badlogic.gdx.graphics.Color.argb8888(color27);
        color27.g = 1671296512;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color27, (-8672));
        int int39 = com.badlogic.gdx.graphics.Color.rgb565(color27);
        com.badlogic.gdx.graphics.Color color41 = color27.mul((float) 13119);
        com.badlogic.gdx.graphics.Color color42 = color41.cpy();
        float float43 = color41.toFloatBits();
        int int44 = com.badlogic.gdx.graphics.Color.rgb565(color41);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color41;
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 65295 + "'", int16 == 65295);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 56864 + "'", int39 == 56864);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + (-4.28676E37f) + "'", float43 == (-4.28676E37f));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 65504 + "'", int44 == 65504);
    }

    @Test
    public void test16703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16703");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration8.setaudioDeviceBufferSize(0);
        int int11 = lwjgl3ApplicationConfiguration8.gles30ContextMajorVersion;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test16704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16704");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 10);
        int int10 = lwjgl3ApplicationConfiguration0.getdepth();
        int int11 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-65025));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode14 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode14;
        int int16 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 63488;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test16705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16705");
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
        int int23 = lwjgl3ApplicationConfiguration0.g;
        int int24 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
    }

    @Test
    public void test16706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16706");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-7876885));
        int int14 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test16707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16707");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 56864;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-520093706);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test16708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16708");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-128512));
        com.badlogic.gdx.graphics.Color color2 = color1.clamp();
        color2.a = 65522;
        float float5 = color2.b;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.039215688f + "'", float5 == 0.039215688f);
    }

    @Test
    public void test16709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16709");
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
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        int int18 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test16710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16710");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.r = 63519;
        com.badlogic.gdx.graphics.Color color11 = color4.mul(5.8756265E-29f, (float) 402587648, (float) 786, (float) 33488896);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test16711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16711");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.setwindowY(100);
        lwjgl3ApplicationConfiguration0.setwindowWidth(56864);
        int int9 = lwjgl3ApplicationConfiguration0.depth;
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test16712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16712");
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
        lwjgl3ApplicationConfiguration0.depth = (-379904);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-178), (-8520704));
        lwjgl3ApplicationConfiguration0.setWindowPosition((-4326480), (-790528));
        boolean boolean55 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode57 = lwjgl3ApplicationConfiguration56.fullscreenMode;
        com.badlogic.gdx.Files.FileType fileType58 = lwjgl3ApplicationConfiguration56.getpreferencesFileType();
        lwjgl3ApplicationConfiguration56.setuseGL30(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + fileType16 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType16.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + fileType43 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType43.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration56);
        org.junit.Assert.assertNull(lwjgl3DisplayMode57);
        org.junit.Assert.assertTrue("'" + fileType58 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType58.equals(com.badlogic.gdx.Files.FileType.Local));
    }

    @Test
    public void test16713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16713");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setwindowHeight(50200831);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test16714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16714");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16715");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-336199680), (float) 61680, (-1.7005843E38f), (float) 3581985);
    }

    @Test
    public void test16716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16716");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration8.setuseGL30(false);
        java.lang.String str11 = lwjgl3ApplicationConfiguration8.getpreferencesDirectory();
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
    }

    @Test
    public void test16717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16717");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        int int8 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setsamples((-184549888));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 480 + "'", int8 == 480);
    }

    @Test
    public void test16718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16718");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        int int7 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-201326593);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-8672));
        lwjgl3ApplicationConfiguration0.setsamples((-379904));
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setwindowWidth((-14033920));
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16719");
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
        lwjgl3ApplicationConfiguration12.setDecorated(false);
        lwjgl3ApplicationConfiguration12.setInitialVisible(true);
        lwjgl3ApplicationConfiguration12.setuseGL30(true);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test16720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16720");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 3276808, (float) 266342400, 0.057594743f, (float) 1L);
        int int5 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16776974 + "'", int5 == 16776974);
    }

    @Test
    public void test16721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16721");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration12.setFullscreenMode(displayMode13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test16722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16722");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean12 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setWindowedMode((-79360), 41903542);
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 3104;
        int int20 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test16723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16723");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        float float7 = color5.g;
        float float8 = color5.b;
        float float9 = color5.a;
        com.badlogic.gdx.graphics.Color color14 = color5.set((float) (-81856144), (float) (-144), (float) (-50331648), (float) (-33560280));
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test16724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16724");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        int int4 = lwjgl3ApplicationConfiguration0.samples;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.windowResizable;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int7 = lwjgl3ApplicationConfiguration0.windowY;
        int int8 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 640 + "'", int8 == 640);
    }

    @Test
    public void test16725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16725");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((-1.7009445E38f), 0.9254902f, (float) 6529016, (float) 620756973);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test16726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16726");
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
        float float24 = color10.b;
        com.badlogic.gdx.graphics.Color color25 = color10.clamp();
        float float26 = color25.b;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color25);
        com.badlogic.gdx.graphics.Color color28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color29 = color27.set(color28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
    }

    @Test
    public void test16727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16727");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int10 = lwjgl3ApplicationConfiguration0.a;
        int int11 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-62986) + "'", int11 == (-62986));
        org.junit.Assert.assertNull(lwjgl3WindowListener12);
    }

    @Test
    public void test16728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16728");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff09f6");
        lwjgl3ApplicationConfiguration0.samples = (-1090519041);
        lwjgl3ApplicationConfiguration0.setsamples((-2146959360));
        lwjgl3ApplicationConfiguration0.windowWidth = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test16729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16729");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setAudioConfig(512, (-14540110), (int) (byte) 1);
        int int13 = lwjgl3ApplicationConfiguration8.getwindowY();
        boolean boolean14 = lwjgl3ApplicationConfiguration8.getwindowResizable();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test16730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16730");
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
        lwjgl3ApplicationConfiguration0.depth = (-579592);
        boolean boolean21 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16731");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int2 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int7 = lwjgl3ApplicationConfiguration6.getaudioDeviceBufferSize();
        boolean boolean8 = lwjgl3ApplicationConfiguration6.windowResizable;
        int int9 = lwjgl3ApplicationConfiguration6.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration6.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration6);
        lwjgl3ApplicationConfiguration12.setaudioDeviceSimultaneousSources((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration12.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffffffb6", fileType15);
        lwjgl3ApplicationConfiguration0.setwindowWidth(6356992);
        int int19 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
    }

    @Test
    public void test16732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16732");
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
        com.badlogic.gdx.graphics.Color color31 = color21.add(2.2591532E-38f, (-1.5822227E38f), (float) (-1056), (float) (-270598144));
        com.badlogic.gdx.graphics.Color color32 = color21.premultiplyAlpha();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
    }

    @Test
    public void test16733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16733");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 167247232;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int13 = lwjgl3ApplicationConfiguration12.stencil;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test16734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16734");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color18.g = (short) 1;
        com.badlogic.gdx.graphics.Color color22 = color10.lerp(color18, (float) 25500);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(color10);
        int int24 = com.badlogic.gdx.graphics.Color.rgba4444(color23);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color23);
        float float26 = color23.g;
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color23);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 65520 + "'", int24 == 65520);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
    }

    @Test
    public void test16735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16735");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        color9.a = (-1308557313);
        color9.b = (-30592);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test16736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16736");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-4.2867603E37f), 9.18893E-39f, (float) 1794115036, (float) (-10));
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = color10.mul((-1.0f), (float) 1677696502, (float) 65024, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color16 = color4.sub(color15);
        com.badlogic.gdx.graphics.Color color21 = color16.sub((-4.785221E37f), (float) 573767680, (float) 1785, (float) (-8142));
        com.badlogic.gdx.graphics.Color color23 = color16.set(1872756736);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test16737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16737");
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
        lwjgl3ApplicationConfiguration10.setsamples(4030);
        int int17 = lwjgl3ApplicationConfiguration10.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration10.setaudioDeviceSimultaneousSources((-2208384));
        lwjgl3ApplicationConfiguration10.setwindowResizable(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test16738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16738");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-33488131);
        lwjgl3ApplicationConfiguration0.windowY = 3;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test16739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16739");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 16193265, 0.0f, (float) 195848, (-1.2574151E28f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.7014117E38f + "'", float4 == 1.7014117E38f);
    }

    @Test
    public void test16740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16740");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        int int12 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
    }

    @Test
    public void test16741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16741");
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
        int int19 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener20;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-536969804));
        boolean boolean24 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int25 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color31 = color26.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color36 = color31.mul((-1.0f), (float) 1677696502, (float) 65024, (float) (short) 1);
        color31.a = 20188;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color31, (-79360));
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color31;
        com.badlogic.gdx.graphics.Color color42 = color31.premultiplyAlpha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 480 + "'", int19 == 480);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 480 + "'", int25 == 480);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color42);
    }

    @Test
    public void test16742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16742");
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
        int int12 = lwjgl3ApplicationConfiguration0.depth;
        int int13 = lwjgl3ApplicationConfiguration0.g;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test16743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16743");
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
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16744");
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
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test16745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16745");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(9.4661864E-29f, (float) (-398458880), (-1.5875967E38f), (float) (-26));
        int int5 = com.badlogic.gdx.graphics.Color.rgb565(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test16746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16746");
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
        int int15 = lwjgl3ApplicationConfiguration8.b;
        java.lang.String str16 = lwjgl3ApplicationConfiguration8.getpreferencesDirectory();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".prefs/" + "'", str16, ".prefs/");
    }

    @Test
    public void test16747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16747");
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
        lwjgl3ApplicationConfiguration0.setwindowY((-78));
        lwjgl3ApplicationConfiguration0.setwindowHeight((-8160));
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 620626176;
        int int24 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
    }

    @Test
    public void test16748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16748");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.windowX = 160;
        java.lang.String str7 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
    }

    @Test
    public void test16749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16749");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(250675200);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color7 = color2.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color2);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        int int10 = com.badlogic.gdx.graphics.Color.argb8888(color9);
        int int11 = com.badlogic.gdx.graphics.Color.argb8888(color9);
        com.badlogic.gdx.graphics.Color color13 = color9.set(3);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color13);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color14, (-1661466122));
        com.badlogic.gdx.graphics.Color color18 = color1.lerp(color14, (float) (-340262899));
        int int19 = color18.toIntBits();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test16750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16750");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-487968), (float) (-8814784));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1789779968) + "'", int2 == (-1789779968));
    }

    @Test
    public void test16751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16751");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (short) 0, (float) 2016, (float) (-66048), (float) 16711425);
        float float5 = color4.b;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color11 = color6.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color6);
        int int13 = com.badlogic.gdx.graphics.Color.argb8888(color6);
        color6.g = 1671296512;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color6, (-8672));
        int int18 = com.badlogic.gdx.graphics.Color.rgb565(color6);
        com.badlogic.gdx.graphics.Color color20 = color6.mul((float) 13119);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color20);
        com.badlogic.gdx.graphics.Color color22 = color4.add(color21);
        com.badlogic.gdx.graphics.Color color24 = color4.set(573767680);
        com.badlogic.gdx.graphics.Color color29 = color24.add((float) (-1573120), 0.0f, (float) (-65486), 9.1837E-41f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56864 + "'", int18 == 56864);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
    }

    @Test
    public void test16752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16752");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int9 = lwjgl3ApplicationConfiguration8.windowWidth;
        java.lang.String str10 = lwjgl3ApplicationConfiguration8.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = lwjgl3ApplicationConfiguration8.fullscreenMode;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3DisplayMode11);
    }

    @Test
    public void test16753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16753");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean17 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int18 = lwjgl3ApplicationConfiguration0.getdepth();
        int int19 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test16754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16754");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 65526, 7.9996E-41f, (-1.6012534E38f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-134852608) + "'", int3 == (-134852608));
    }

    @Test
    public void test16755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16755");
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
        int int20 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int21 = lwjgl3ApplicationConfiguration0.g;
        boolean boolean22 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.a = 16776959;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(16);
        lwjgl3ApplicationConfiguration0.a = (-16896512);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16756");
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
        com.badlogic.gdx.graphics.Color color45 = color43.mul((float) (byte) 10);
        com.badlogic.gdx.graphics.Color color47 = color45.set((-1234862334));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
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
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color47);
    }

    @Test
    public void test16757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16757");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.a = (-790528);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
    }

    @Test
    public void test16758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16758");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-61455), (float) 195840, (float) (-16646400), (float) (-232));
        float float5 = color4.g;
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test16759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16759");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-3200), (float) (-40036), (float) (-1306385665), (float) 58111);
        com.badlogic.gdx.graphics.Color color6 = color4.set((-16252928));
        float float7 = color6.a;
        com.badlogic.gdx.graphics.Color color9 = color6.set((-403734016));
        int int10 = com.badlogic.gdx.graphics.Color.rgb565(color9);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59247 + "'", int10 == 59247);
    }

    @Test
    public void test16760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16760");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color2 = color0.mul(color1);
        color0.g = 6147990;
        com.badlogic.gdx.graphics.Color color5 = color0.clamp();
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((-4.2867603E37f), 9.18893E-39f, (float) 1794115036, (float) (-10));
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color16 = color11.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color21 = color16.mul((-1.0f), (float) 1677696502, (float) 65024, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color22 = color10.sub(color21);
        com.badlogic.gdx.graphics.Color color23 = color5.mul(color22);
        float float24 = color23.b;
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color23);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color25, (-80190464));
        float float28 = color25.a;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.9843137f + "'", float28 == 0.9843137f);
    }

    @Test
    public void test16761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16761");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str2 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.windowHeight = 1;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 65280;
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".prefs/" + "'", str2, ".prefs/");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
    }

    @Test
    public void test16762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16762");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color3 = color0.set(35);
        com.badlogic.gdx.graphics.Color color4 = color0.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color9 = color0.mul(0.0f, (float) 65535, (float) (-32), (float) (-1));
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color17 = color12.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = color11.sub(color17);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color11, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color26 = color11.mul((float) (-222), (-1.5084639E38f), (float) (-62986), (float) (-16741598));
        float float27 = color26.r;
        com.badlogic.gdx.graphics.Color color28 = color26.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color30 = color9.lerp(color26, (float) 16580354);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.SCARLET;
        color31.b = '#';
        com.badlogic.gdx.graphics.Color color34 = color9.add(color31);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color34, (-469444608));
        float float37 = color34.a;
        float float38 = color34.toFloatBits();
        com.badlogic.gdx.graphics.Color color44 = color34.lerp((float) (-14883840), (float) (-52608), (-4.596073E37f), (float) (-61440), (float) 371093301);
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color(2.2822268E-32f, (float) 1677786624, (float) 246, (-32.498047f));
        com.badlogic.gdx.graphics.Color color50 = color34.set(color49);
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color(color49);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-0.0f) + "'", float27 == (-0.0f));
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 7.7492E-41f + "'", float38 == 7.7492E-41f);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color50);
    }

    @Test
    public void test16763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16763");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int7 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color14 = color12.set(color13);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color12;
        lwjgl3ApplicationConfiguration0.setdepth(151015132);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(61455);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test16764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16764");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        int int2 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.a = 0;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test16765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16765");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-567943452);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        lwjgl3ApplicationConfiguration0.title = "00000011";
        int int11 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-57375));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test16766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16766");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration9.setwindowX((int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = lwjgl3ApplicationConfiguration9.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode14;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        boolean boolean20 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setAudioConfig(1038163712, (-65024), 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test16767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16767");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, 16);
        float float3 = color0.toFloatBits();
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.valueOf("ffffff00");
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str9 = color8.toString();
        com.badlogic.gdx.graphics.Color color11 = color8.set((-62986));
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str13 = color12.toString();
        com.badlogic.gdx.graphics.Color color15 = color12.set((-62986));
        com.badlogic.gdx.graphics.Color color16 = color11.sub(color15);
        com.badlogic.gdx.graphics.Color color17 = color7.sub(color11);
        com.badlogic.gdx.graphics.Color color22 = color7.sub((float) 16711425, (float) 14, (-1.4523669E17f), 1.561203E-39f);
        com.badlogic.gdx.graphics.Color color23 = color5.mul(color22);
        float float24 = color22.g;
        com.badlogic.gdx.graphics.Color color26 = color22.set((-283184896));
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color22, (-2131886080));
        com.badlogic.gdx.graphics.Color color30 = color22.set(47887);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.561203E-39f + "'", float3 == 1.561203E-39f);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00ff0000" + "'", str9, "00ff0000");
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ffff09f6" + "'", str13, "ffff09f6");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color30);
    }

    @Test
    public void test16768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16768");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowY = 20188;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int13 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1980237824), (-56576), (-15237120), (-35402), (-134242816), (-13500161), (-823132400));
        boolean boolean22 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test16769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16769");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) (-567943452), 0.69803923f, 2.9056E-41f, (float) 16776960);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration11.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration11.windowX = 100;
        int int16 = lwjgl3ApplicationConfiguration11.stencil;
        int int17 = lwjgl3ApplicationConfiguration11.windowY;
        lwjgl3ApplicationConfiguration11.a = 43268;
        int int20 = lwjgl3ApplicationConfiguration11.gles30ContextMinorVersion;
        int int21 = lwjgl3ApplicationConfiguration11.getwindowX();
        com.badlogic.gdx.graphics.Color color22 = lwjgl3ApplicationConfiguration11.initialBackgroundColor;
        color22.a = 35;
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color22);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration27.setpreferencesFileType(fileType28);
        lwjgl3ApplicationConfiguration27.useVsync(false);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration27.initialBackgroundColor = color32;
        int int34 = lwjgl3ApplicationConfiguration27.depth;
        lwjgl3ApplicationConfiguration27.windowResizable = false;
        com.badlogic.gdx.graphics.Color color37 = lwjgl3ApplicationConfiguration27.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color39 = color26.lerp(color37, (float) 0L);
        com.badlogic.gdx.graphics.Color color40 = color5.set(color37);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color40, 16777081);
        com.badlogic.gdx.graphics.Color color43 = color40.premultiplyAlpha();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 16 + "'", int34 == 16);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color43);
    }

    @Test
    public void test16770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16770");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-47972106));
    }

    @Test
    public void test16771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16771");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.setdepth((-1562574848));
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test16772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16772");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (-1), (-270598144));
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
        lwjgl3ApplicationConfiguration0.stencil = (-2142638528);
        lwjgl3ApplicationConfiguration0.r = 4095;
        boolean boolean26 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-514080));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test16773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16773");
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
        com.badlogic.gdx.graphics.Color color39 = color33.add((float) (-393464), (float) (-32784), (float) 587162524, (float) (-65784));
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
        org.junit.Assert.assertNotNull(color39);
    }

    @Test
    public void test16774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16774");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int11 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.setwindowX((-268501024));
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        com.badlogic.gdx.Files.FileType fileType16 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setsamples(1426063359);
        int int19 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + fileType16 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType16.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test16775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16775");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 93, (float) 1051918336, (-1.39674476E14f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-256) + "'", int3 == (-256));
    }

    @Test
    public void test16776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16776");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        lwjgl3ApplicationConfiguration0.setwindowWidth(20160);
        int int14 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-14622977));
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-2228480), (-598016));
        lwjgl3ApplicationConfiguration0.windowX = (-1771051008);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
    }

    @Test
    public void test16777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16777");
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
        lwjgl3ApplicationConfiguration0.windowY = 3;
        lwjgl3ApplicationConfiguration0.setsamples((-84));
        int int18 = lwjgl3ApplicationConfiguration0.stencil;
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        boolean boolean20 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNull(fileType13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test16778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16778");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        lwjgl3ApplicationConfiguration0.title = "";
        int int8 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setTitle("ffff0200");
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int13 = lwjgl3ApplicationConfiguration0.depth;
        int int14 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test16779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16779");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SCARLET;
        color0.b = '#';
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.ORANGE;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color3, (-524536));
        color3.r = (-510);
        com.badlogic.gdx.graphics.Color color9 = color0.lerp(color3, (float) 3306396);
        int int10 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        java.lang.String str11 = color3.toString();
        java.lang.String str12 = color3.toString();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-65784) + "'", int10 == (-65784));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "feff08ff" + "'", str11, "feff08ff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "feff08ff" + "'", str12, "feff08ff");
    }

    @Test
    public void test16780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16780");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration11.setFullscreenMode(displayMode17);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test16781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16781");
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
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        lwjgl3ApplicationConfiguration13.windowResizable = false;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16782");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str1 = color0.toString();
        color0.g = 16;
        int int4 = com.badlogic.gdx.graphics.Color.rgb888(color0);
        color0.a = (-1.5822227E38f);
        float float7 = color0.b;
        com.badlogic.gdx.graphics.Color color12 = color0.mul((float) (-918031), (float) 41903542, (float) 1, (float) (-16207360));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000" + "'", str1, "00000000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1044480 + "'", int4 == 1044480);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test16783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16783");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setsamples(151015132);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener12;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode14 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode14;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 4064, 0, (-1677417472), (-134351107), (-573603840), (-16097));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test16784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16784");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color11 = color5.mul((float) 61680, (-5.360365E37f), (float) (-10), (float) (-16776961));
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(3);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color13, (-16734721));
        color13.a = 480;
        color13.a = (-2336);
        com.badlogic.gdx.graphics.Color color21 = color13.mul((float) 3);
        com.badlogic.gdx.graphics.Color color23 = color5.lerp(color21, (float) (-2147477600));
        com.badlogic.gdx.graphics.Color color24 = color5.clamp();
        com.badlogic.gdx.graphics.Color color29 = color24.set(4.4933517E-27f, (float) (-469444608), (-1.609322E29f), (-5.904214E20f));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
    }

    @Test
    public void test16785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16785");
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
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 11280416;
        int int21 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int22 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test16786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16786");
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
        lwjgl3ApplicationConfiguration20.windowResizable = false;
        int int23 = lwjgl3ApplicationConfiguration20.getdepth();
        int int24 = lwjgl3ApplicationConfiguration20.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration20.setsamples(15990783);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
    }

    @Test
    public void test16787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16787");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.setwindowX((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration7.getpreferencesFileType();
        lwjgl3ApplicationConfiguration7.windowY = 16;
        int int13 = lwjgl3ApplicationConfiguration7.stencil;
        lwjgl3ApplicationConfiguration7.depth = (-3211280);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test16788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16788");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration18);
        lwjgl3ApplicationConfiguration18.depth = 150405120;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-16719105) + "'", int23 == (-16719105));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-15144036) + "'", int30 == (-15144036));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration31);
    }

    @Test
    public void test16789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16789");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color19 = color10.mul(color18);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color10, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color22 = color10.cpy();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
    }

    @Test
    public void test16790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16790");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int7 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-8160);
        int int10 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = ".prefs/";
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-40224));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16791");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.title = "ffff72ff";
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.windowY = 6529016;
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setAudioConfig(33488896, 1677721600, 16252680);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = 1557110528;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test16792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16792");
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
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color16;
        int int18 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int21 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test16793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16793");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode9 = lwjgl3ApplicationConfiguration0.hdpiMode;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setWindowedMode(1073680896, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode9 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode9.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test16794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16794");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.title = "8ff00000";
        int int9 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(184504044);
        int int12 = lwjgl3ApplicationConfiguration0.g;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int14 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test16795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16795");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-906037750));
        lwjgl3ApplicationConfiguration0.samples = 402653183;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test16796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16796");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.FOREST;
        int int1 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.graphics.Color color6 = color0.add((float) (-1966080), (float) (-16711936), 0.0f, (float) 65520);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int8 = lwjgl3ApplicationConfiguration7.getaudioDeviceBufferSize();
        boolean boolean9 = lwjgl3ApplicationConfiguration7.windowResizable;
        lwjgl3ApplicationConfiguration7.disableAudio = false;
        lwjgl3ApplicationConfiguration7.setResizable(true);
        lwjgl3ApplicationConfiguration7.setwindowX(10);
        int int16 = lwjgl3ApplicationConfiguration7.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        int int18 = lwjgl3ApplicationConfiguration7.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration7.initialBackgroundColor;
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration7.setFullscreenMode(displayMode20);
        int int22 = lwjgl3ApplicationConfiguration7.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration7.setWindowedMode(512, (-68935680));
        com.badlogic.gdx.graphics.Color color26 = lwjgl3ApplicationConfiguration7.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color27 = color6.sub(color26);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test16797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16797");
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
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-118095928);
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
    public void test16798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16798");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("ff9df663");
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test16799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16799");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str1 = color0.toString();
        com.badlogic.gdx.graphics.Color color6 = color0.sub((float) 16711935, (float) 1671296512, (float) 8897069, (-1.6947917E38f));
        float float7 = color0.toFloatBits();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00ff0000" + "'", str1, "00ff0000");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-4.2535296E37f) + "'", float7 == (-4.2535296E37f));
    }

    @Test
    public void test16800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16800");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = lwjgl3ApplicationConfiguration0.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener15;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test16801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16801");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setAudioConfig(43268, (-254), 167247232);
        int int15 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.r = (-2013384960);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener9);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
    }

    @Test
    public void test16802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16802");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(0.0f, (-1.6969465E38f), (float) (short) 10, (float) (-55800));
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color((float) (-128512), (float) (-1902614), (float) 573767680, (float) (-1));
        com.badlogic.gdx.graphics.Color color16 = color9.lerp(color14, (float) (-1109610));
        color16.a = (-124);
        com.badlogic.gdx.graphics.Color color19 = color1.sub(color16);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((-335));
        com.badlogic.gdx.graphics.Color color22 = color21.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color23 = color16.add(color21);
        com.badlogic.gdx.graphics.Color color28 = color16.sub((float) (-203427056), (float) 511, (float) (-520094721), (float) (-1619001344));
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test16803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16803");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 16776960, (-4.28676E37f), (-1.7013632E38f), (float) (-2147483392));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (-17827072));
    }

    @Test
    public void test16804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16804");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 587162524;
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int12 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setwindowHeight((-30216482));
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setWindowedMode(1051918336, 70560);
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertNull(fileType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test16805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16805");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration15.useVsync(false);
        lwjgl3ApplicationConfiguration15.setWindowedMode(512, (int) '#');
        int int23 = lwjgl3ApplicationConfiguration15.stencil;
        int int24 = lwjgl3ApplicationConfiguration15.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration15.stencil = (byte) 0;
        lwjgl3ApplicationConfiguration15.setWindowedMode(16, (-78));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration15.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration33.setFullscreenMode(displayMode34);
        lwjgl3ApplicationConfiguration33.windowX = 100;
        int int38 = lwjgl3ApplicationConfiguration33.g;
        com.badlogic.gdx.Files.FileType fileType39 = lwjgl3ApplicationConfiguration33.getpreferencesFileType();
        boolean boolean40 = lwjgl3ApplicationConfiguration33.windowDecorated;
        lwjgl3ApplicationConfiguration33.setwindowX((-1291845633));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode45 = null;
        lwjgl3ApplicationConfiguration44.setFullscreenMode(displayMode45);
        lwjgl3ApplicationConfiguration44.windowX = 100;
        int int49 = lwjgl3ApplicationConfiguration44.g;
        com.badlogic.gdx.Files.FileType fileType50 = lwjgl3ApplicationConfiguration44.getpreferencesFileType();
        int int51 = lwjgl3ApplicationConfiguration44.b;
        lwjgl3ApplicationConfiguration44.windowDecorated = true;
        com.badlogic.gdx.Files.FileType fileType54 = lwjgl3ApplicationConfiguration44.preferencesFileType;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("00ff0000", fileType54);
        lwjgl3ApplicationConfiguration32.preferencesFileType = fileType54;
        com.badlogic.gdx.Files.FileType fileType57 = lwjgl3ApplicationConfiguration32.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType57;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int61 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int62 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.r = (-1034);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
        org.junit.Assert.assertTrue("'" + fileType39 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType39.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
        org.junit.Assert.assertTrue("'" + fileType50 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType50.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 8 + "'", int51 == 8);
        org.junit.Assert.assertTrue("'" + fileType54 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType54.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType57 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType57.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 16 + "'", int62 == 16);
    }

    @Test
    public void test16806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16806");
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
        int int22 = lwjgl3ApplicationConfiguration16.depth;
        lwjgl3ApplicationConfiguration16.setaudioDeviceBufferCount(4030);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
    }

    @Test
    public void test16807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16807");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration11.windowListener;
        lwjgl3ApplicationConfiguration11.setTitle("00000011");
        boolean boolean17 = lwjgl3ApplicationConfiguration11.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16808");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("0000ee00");
        color1.r = 2.3418052E-38f;
        com.badlogic.gdx.graphics.Color color4 = color1.cpy();
        com.badlogic.gdx.graphics.Color color5 = color1.clamp();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test16809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16809");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-19456), (float) (-1363456), (float) 16252680, 2.2822268E-32f);
    }

    @Test
    public void test16810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16810");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-1241350299));
        int int7 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.a = 99;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BLACK;
        float float11 = color10.r;
        com.badlogic.gdx.graphics.Color color16 = color10.sub((float) (-14513374), (float) 151015132, 0.0f, (float) 1L);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color10);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color17;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(color10);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test16811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16811");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int8 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setWindowedMode(852308735, 2002848);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test16812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16812");
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
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color41, (-257551));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color41, (-58475));
        com.badlogic.gdx.graphics.Color color50 = color41.sub((float) 15397887, (float) 130816, 4.0487513E-19f, (float) (-2146504448));
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ffff0000" + "'", str11, "ffff0000");
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-4.28676E37f) + "'", float30 == (-4.28676E37f));
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color50);
    }

    @Test
    public void test16813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16813");
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
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int18 = lwjgl3ApplicationConfiguration0.samples;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test16814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16814");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(3);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (-16734721));
        color1.a = 480;
        color1.a = (-2336);
        com.badlogic.gdx.graphics.Color color9 = color1.mul((float) 3);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color9, 47);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.valueOf("6af005dc");
        com.badlogic.gdx.graphics.Color color15 = color9.sub(color14);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test16815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16815");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(16768546);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test16816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16816");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color16 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int17 = com.badlogic.gdx.graphics.Color.rgba4444(color16);
        org.junit.Assert.assertNotNull(color16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 61440 + "'", int17 == 61440);
    }

    @Test
    public void test16817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16817");
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
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-2147483648);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16818");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int13 = lwjgl3ApplicationConfiguration12.getaudioDeviceBufferSize();
        boolean boolean14 = lwjgl3ApplicationConfiguration12.windowResizable;
        lwjgl3ApplicationConfiguration12.disableAudio = false;
        lwjgl3ApplicationConfiguration12.setResizable(true);
        lwjgl3ApplicationConfiguration12.setwindowX(10);
        int int21 = lwjgl3ApplicationConfiguration12.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration23.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration23.samples = '4';
        com.badlogic.gdx.Files.FileType fileType28 = lwjgl3ApplicationConfiguration23.preferencesFileType;
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType28);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType28;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = lwjgl3ApplicationConfiguration0.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode32 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNull(lwjgl3DisplayMode32);
    }

    @Test
    public void test16819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16819");
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
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
    }

    @Test
    public void test16820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16820");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int8 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-790528);
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test16821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16821");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color6 = color1.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color14 = color9.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color22 = color16.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str24 = color23.toString();
        com.badlogic.gdx.graphics.Color color26 = color16.lerp(color23, (-8.0750596E37f));
        boolean boolean27 = color9.equals((java.lang.Object) color16);
        com.badlogic.gdx.graphics.Color color28 = color8.add(color9);
        com.badlogic.gdx.graphics.Color color30 = color0.lerp(color8, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color37 = color32.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        float float38 = color32.r;
        com.badlogic.gdx.graphics.Color color40 = color0.lerp(color32, (float) 0);
        float float41 = color32.r;
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color47 = color32.mul((float) (-8520704), (-1.7013873E38f), (-1.7014022E38f), (float) 16519665);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color32, 4590);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00ff0000" + "'", str24, "00ff0000");
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.0f + "'", float41 == 0.0f);
        org.junit.Assert.assertNotNull(color47);
    }

    @Test
    public void test16822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16822");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) (byte) 100, (float) 41903542, (float) (short) 10, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color7 = color6.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color7, 1);
        float float10 = color7.r;
        com.badlogic.gdx.graphics.Color color11 = color0.sub(color7);
        com.badlogic.gdx.graphics.Color color16 = color11.set((float) (short) 100, 2.3418409E-38f, (float) 6147990, (-1.7014086E38f));
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color11);
        int int18 = com.badlogic.gdx.graphics.Color.argb8888(color11);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16711935 + "'", int18 == 16711935);
    }

    @Test
    public void test16823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16823");
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
        boolean boolean19 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test16824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16824");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int20 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test16825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16825");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        int int16 = lwjgl3ApplicationConfiguration0.windowY;
        int int17 = lwjgl3ApplicationConfiguration0.getdepth();
        int int18 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setdepth(0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test16826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16826");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode10 = lwjgl3ApplicationConfiguration0.hdpiMode;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.initialVisible;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1809335264);
        org.junit.Assert.assertTrue("'" + hdpiMode10 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode10.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test16827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16827");
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
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType17);
        lwjgl3ApplicationConfiguration16.disableAudio = true;
        lwjgl3ApplicationConfiguration16.initialVisible = true;
        int int23 = lwjgl3ApplicationConfiguration16.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration16.b = (-62986);
        lwjgl3ApplicationConfiguration16.b = 2;
        lwjgl3ApplicationConfiguration16.setwindowX((int) 'a');
        int int30 = lwjgl3ApplicationConfiguration16.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration31.setDecorated(false);
        lwjgl3ApplicationConfiguration31.a = (byte) 10;
        boolean boolean36 = lwjgl3ApplicationConfiguration31.initialVisible;
        int int37 = lwjgl3ApplicationConfiguration31.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = lwjgl3ApplicationConfiguration31.windowListener;
        lwjgl3ApplicationConfiguration31.setvSyncEnabled(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType42 = null;
        lwjgl3ApplicationConfiguration41.setpreferencesFileType(fileType42);
        lwjgl3ApplicationConfiguration41.disableAudio = true;
        lwjgl3ApplicationConfiguration41.setsamples((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType50 = null;
        lwjgl3ApplicationConfiguration49.setpreferencesFileType(fileType50);
        lwjgl3ApplicationConfiguration49.useVsync(false);
        lwjgl3ApplicationConfiguration49.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration49.a = (-62986);
        lwjgl3ApplicationConfiguration49.setdisableAudio(true);
        boolean boolean61 = lwjgl3ApplicationConfiguration49.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode64 = null;
        lwjgl3ApplicationConfiguration63.setFullscreenMode(displayMode64);
        lwjgl3ApplicationConfiguration63.windowX = 100;
        int int68 = lwjgl3ApplicationConfiguration63.g;
        com.badlogic.gdx.Files.FileType fileType69 = lwjgl3ApplicationConfiguration63.getpreferencesFileType();
        lwjgl3ApplicationConfiguration49.setPreferencesConfig("ffffff00", fileType69);
        lwjgl3ApplicationConfiguration41.setPreferencesConfig("ffff72ff", fileType69);
        lwjgl3ApplicationConfiguration31.setpreferencesFileType(fileType69);
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType69);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00004edc", fileType69);
        int int75 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.title = "ffff3322";
        boolean boolean78 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-7424));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener38);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 8 + "'", int68 == 8);
        org.junit.Assert.assertTrue("'" + fileType69 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType69.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test16828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16828");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TAN;
        com.badlogic.gdx.graphics.Color color1 = color0.clamp();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test16829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16829");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        int int8 = lwjgl3ApplicationConfiguration0.stencil;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.stencil = (byte) 0;
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color17 = color12.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color17, 100);
        com.badlogic.gdx.graphics.Color color21 = color17.mul(100.0f);
        com.badlogic.gdx.graphics.Color color26 = color21.sub((float) (byte) 0, (float) (-65280), (float) 65295, 0.0f);
        com.badlogic.gdx.graphics.Color color28 = color26.set((int) (short) 100);
        com.badlogic.gdx.graphics.Color color33 = color28.mul((float) (-1241513983), (float) (-16711680), (-5.387877E37f), (float) 61450);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3ApplicationConfiguration35.setFullscreenMode(displayMode36);
        lwjgl3ApplicationConfiguration35.windowX = 100;
        int int40 = lwjgl3ApplicationConfiguration35.g;
        java.lang.String str41 = lwjgl3ApplicationConfiguration35.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration35.setwindowResizable(false);
        int int44 = lwjgl3ApplicationConfiguration35.samples;
        lwjgl3ApplicationConfiguration35.setpreferencesDirectory("ff660000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode49 = null;
        lwjgl3ApplicationConfiguration48.setFullscreenMode(displayMode49);
        lwjgl3ApplicationConfiguration48.windowX = 100;
        int int53 = lwjgl3ApplicationConfiguration48.stencil;
        int int54 = lwjgl3ApplicationConfiguration48.windowY;
        lwjgl3ApplicationConfiguration48.a = 43268;
        int int57 = lwjgl3ApplicationConfiguration48.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType58 = lwjgl3ApplicationConfiguration48.preferencesFileType;
        lwjgl3ApplicationConfiguration35.setPreferencesConfig("ffff65b6", fileType58);
        boolean boolean60 = lwjgl3ApplicationConfiguration35.getdisableAudio();
        int int61 = lwjgl3ApplicationConfiguration35.getwindowY();
        com.badlogic.gdx.Files.FileType fileType62 = lwjgl3ApplicationConfiguration35.getpreferencesFileType();
        com.badlogic.gdx.graphics.Color color67 = new com.badlogic.gdx.graphics.Color((float) 6147990, (float) (byte) -1, (float) (-61455), (float) 15687677);
        lwjgl3ApplicationConfiguration35.setInitialBackgroundColor(color67);
        com.badlogic.gdx.graphics.Color color70 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float71 = color70.a;
        int int72 = color70.toIntBits();
        com.badlogic.gdx.graphics.Color color74 = color70.mul((float) (-255));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color74, 0);
        com.badlogic.gdx.graphics.Color color77 = color67.sub(color74);
        com.badlogic.gdx.graphics.Color color78 = color28.mul(color77);
        color28.a = 47;
        com.badlogic.gdx.graphics.Color color82 = color28.mul((-7.5108E-22f));
        int int83 = color82.toIntBits();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ".prefs/" + "'", str41, ".prefs/");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertTrue("'" + fileType58 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType58.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + fileType62 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType62.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 1.0f + "'", float71 == 1.0f);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(color74);
        org.junit.Assert.assertNotNull(color77);
        org.junit.Assert.assertNotNull(color78);
        org.junit.Assert.assertNotNull(color82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test16830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16830");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-25088), (float) (-1669267456), (-5.8895436E-22f), (float) (-10223586));
    }

    @Test
    public void test16831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16831");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-968892160), (float) (-53504), (-6.6305225E35f), 2.2822268E-32f);
    }

    @Test
    public void test16832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16832");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration6.setaudioDeviceSimultaneousSources((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration6.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration6);
        java.lang.String str11 = lwjgl3ApplicationConfiguration10.title;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16833");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.initialVisible;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration12.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration12.disableAudio = true;
        int int17 = lwjgl3ApplicationConfiguration12.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = lwjgl3ApplicationConfiguration12.fullscreenMode;
        lwjgl3ApplicationConfiguration12.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration12.setwindowY((int) '#');
        lwjgl3ApplicationConfiguration12.setwindowHeight((int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration25.setFullscreenMode(displayMode26);
        lwjgl3ApplicationConfiguration25.samples = (-1);
        lwjgl3ApplicationConfiguration25.useGL30 = true;
        lwjgl3ApplicationConfiguration25.setpreferencesDirectory("ffff72ff");
        int int34 = lwjgl3ApplicationConfiguration25.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration25.windowY = 20188;
        int int37 = lwjgl3ApplicationConfiguration25.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = lwjgl3ApplicationConfiguration25.hdpiMode;
        lwjgl3ApplicationConfiguration12.hdpiMode = hdpiMode38;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode38;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-124);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 150405120;
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode18);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test16834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16834");
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
        com.badlogic.gdx.Files.FileType fileType16 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int17 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int18 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + fileType16 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType16.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20160 + "'", int17 == 20160);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
    }

    @Test
    public void test16835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16835");
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
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 34303;
        java.lang.String str18 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".prefs/" + "'", str18, ".prefs/");
    }

    @Test
    public void test16836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16836");
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
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        boolean boolean18 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffffffb6";
        int int21 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.title = "fff3bb22";
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test16837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16837");
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
        lwjgl3ApplicationConfiguration0.windowHeight = (-2105704448);
        int int22 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int23 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 587202559;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test16838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16838");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-1241350299);
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowHeight = 13260;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test16839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16839");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int9 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        int int12 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test16840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16840");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(3, 8897069);
        lwjgl3ApplicationConfiguration0.setsamples(65295);
        int int17 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 655360;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 480 + "'", int17 == 480);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
    }

    @Test
    public void test16841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16841");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("ffff09f6");
        com.badlogic.gdx.graphics.Color color2 = color1.clamp();
        com.badlogic.gdx.graphics.Color color3 = color2.clamp();
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color3, 2046);
        com.badlogic.gdx.graphics.Color color6 = color3.clamp();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test16842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16842");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.b = (-1109610);
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setwindowX(165813744);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
    }

    @Test
    public void test16843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16843");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16844");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-40036);
        lwjgl3ApplicationConfiguration0.a = (-16844545);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 31334400;
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test16845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16845");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-1611265692);
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.r = 0;
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test16846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16846");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setwindowWidth(1794115036);
        lwjgl3ApplicationConfiguration0.g = 1044480;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-16711680), (-524869), 34277, (-18), (-1203355648), (-175017984), (-96));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean25 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test16847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16847");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.g = (short) 0;
        lwjgl3ApplicationConfiguration0.setwindowX(2016);
        lwjgl3ApplicationConfiguration0.setwindowY((-16174642));
        lwjgl3ApplicationConfiguration0.windowX = (-1612709888);
    }

    @Test
    public void test16848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16848");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 18453, (-1.594866E38f), (float) (-232), (float) (-728785));
    }

    @Test
    public void test16849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16849");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 16712445, (float) (-1628), (float) (-8520704), 6.466791E-24f);
    }

    @Test
    public void test16850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16850");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.6614816E38f), (-3.9429004E34f), (float) 20942, 0.99215686f);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SCARLET;
        color5.b = '#';
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color10 = color5.lerp(color8, (float) 1L);
        color8.g = (byte) 10;
        float float13 = color8.b;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(251658239);
        com.badlogic.gdx.graphics.Color color17 = color8.lerp(color15, (float) (-2176));
        float float18 = color8.toFloatBits();
        com.badlogic.gdx.graphics.Color color19 = color8.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.06666667f + "'", float13 == 0.06666667f);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 9.1477E-41f + "'", float18 == 9.1477E-41f);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test16851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16851");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-16646655), (float) 14336, (float) (-2072248832));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-273088512) + "'", int3 == (-273088512));
    }

    @Test
    public void test16852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16852");
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
        lwjgl3ApplicationConfiguration12.disableAudio(false);
        lwjgl3ApplicationConfiguration12.a = 5147940;
        int int17 = lwjgl3ApplicationConfiguration12.windowY;
        boolean boolean18 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        boolean boolean19 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        java.lang.String str20 = lwjgl3ApplicationConfiguration12.title;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16853");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-254));
        int int11 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test16854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16854");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float2 = color1.a;
        int int3 = color1.toIntBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType5 = null;
        lwjgl3ApplicationConfiguration4.setpreferencesFileType(fileType5);
        lwjgl3ApplicationConfiguration4.useVsync(false);
        lwjgl3ApplicationConfiguration4.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration4);
        boolean boolean12 = lwjgl3ApplicationConfiguration4.getwindowResizable();
        boolean boolean13 = color1.equals((java.lang.Object) lwjgl3ApplicationConfiguration4);
        lwjgl3ApplicationConfiguration4.preferencesDirectory = "ffffffff";
        int int16 = lwjgl3ApplicationConfiguration4.windowWidth;
        lwjgl3ApplicationConfiguration4.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration4.setaudioDeviceBufferSize((-2208384));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
    }

    @Test
    public void test16855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16855");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-1241513983);
        int int13 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.stencil = 34303;
        int int16 = lwjgl3ApplicationConfiguration0.windowWidth;
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16856");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setWindowedMode(166464502, 16711425);
        int int10 = lwjgl3ApplicationConfiguration0.windowX;
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test16857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16857");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        lwjgl3ApplicationConfiguration9.disableAudio = true;
        lwjgl3ApplicationConfiguration9.setwindowResizable(true);
        int int14 = lwjgl3ApplicationConfiguration9.a;
        boolean boolean15 = lwjgl3ApplicationConfiguration9.windowResizable;
        lwjgl3ApplicationConfiguration9.windowWidth = 26163;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16858");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setTitle("0ff00000");
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setTitle("ffbdfbb0");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 480, (-134217728));
        int int12 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration13.windowY = (-63240);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 480 + "'", int1 == 480);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
    }

    @Test
    public void test16859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16859");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color color14 = color5.add((float) 65024, (float) (-2130837248), (float) (-255), (float) 31334400);
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.FOREST;
        int int16 = com.badlogic.gdx.graphics.Color.argb8888(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int18 = lwjgl3ApplicationConfiguration17.getaudioDeviceBufferSize();
        boolean boolean19 = lwjgl3ApplicationConfiguration17.windowResizable;
        lwjgl3ApplicationConfiguration17.depth = (short) 10;
        lwjgl3ApplicationConfiguration17.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color33 = color27.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color34 = color25.mul(color33);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color25, (int) (byte) 0);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color25;
        com.badlogic.gdx.graphics.Color color38 = color15.set(color25);
        java.lang.String str39 = color15.toString();
        com.badlogic.gdx.graphics.Color color40 = color14.mul(color15);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-224) + "'", int16 == (-224));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "00000000" + "'", str39, "00000000");
        org.junit.Assert.assertNotNull(color40);
    }

    @Test
    public void test16860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16860");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float2 = color1.a;
        int int3 = color1.toIntBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType5 = null;
        lwjgl3ApplicationConfiguration4.setpreferencesFileType(fileType5);
        lwjgl3ApplicationConfiguration4.useVsync(false);
        lwjgl3ApplicationConfiguration4.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration4);
        boolean boolean12 = lwjgl3ApplicationConfiguration4.getwindowResizable();
        boolean boolean13 = color1.equals((java.lang.Object) lwjgl3ApplicationConfiguration4);
        int int14 = lwjgl3ApplicationConfiguration4.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = null;
        lwjgl3ApplicationConfiguration4.fullscreenMode = lwjgl3DisplayMode15;
        lwjgl3ApplicationConfiguration4.setsamples((-130050));
        lwjgl3ApplicationConfiguration4.useOpenGL3(true, 12346080, 62730);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test16861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16861");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color6 = color4.set((int) (short) 0);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, 61450);
        int int9 = color4.toIntBits();
        int int10 = color4.toIntBits();
        color4.g = 0.0f;
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5374198 + "'", int9 == 5374198);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5374198 + "'", int10 == 5374198);
    }

    @Test
    public void test16862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16862");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        com.badlogic.gdx.graphics.Color color13 = color6.sub((float) 1557110528, (float) (-1), (float) 65293, (float) 1878880718);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((float) (-2147483392), (float) 195848, (-1.6880791E38f), (float) 3345345);
        com.badlogic.gdx.graphics.Color color20 = color6.lerp(color18, 1.3387762E-8f);
        float float21 = color20.b;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ffffff00" + "'", str8, "ffffff00");
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test16863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16863");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        lwjgl3ApplicationConfiguration0.setwindowWidth(20160);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 97;
        boolean boolean16 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int17 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean18 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test16864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16864");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration8.setpreferencesFileType(fileType9);
        lwjgl3ApplicationConfiguration8.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration8.setPreferencesConfig("", fileType14);
        lwjgl3ApplicationConfiguration8.g = (short) 0;
        lwjgl3ApplicationConfiguration8.windowX = 35;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = lwjgl3ApplicationConfiguration8.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode20;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertNull(lwjgl3WindowListener25);
    }

    @Test
    public void test16865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16865");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        int int8 = lwjgl3ApplicationConfiguration0.stencil;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.stencil = (byte) 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(16, (-78));
        int int15 = lwjgl3ApplicationConfiguration0.samples;
        int int16 = lwjgl3ApplicationConfiguration0.getsamples();
        int int17 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(536870912, (-56577), (-1628563456), (-2228480), (-16741598), (-66048), (-67611904));
        boolean boolean26 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test16866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16866");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int9 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.samples = (-47784960);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-1478492160);
        int int14 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 640 + "'", int14 == 640);
    }

    @Test
    public void test16867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16867");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-61440), 0.972549f, (float) (-41231), (float) (-126));
        com.badlogic.gdx.graphics.Color color9 = color4.add(6.162976E-33f, (float) (-2550), (float) 61421, (float) (-145));
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test16868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16868");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.a = 3;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-1179648));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test16869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16869");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-78), (float) (-2560), 0.0f, (float) (-4096));
        int int5 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test16870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16870");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.r = 63519;
        com.badlogic.gdx.graphics.Color color8 = color4.set(512);
        com.badlogic.gdx.graphics.Color color10 = color4.set(63519);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color12 = color10.cpy();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test16871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16871");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.title = "hi!";
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 16777196;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
    }

    @Test
    public void test16872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16872");
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
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.windowWidth = (-3600);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test16873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16873");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.title = "ffff09f6";
        lwjgl3ApplicationConfiguration0.setwindowY((-1902614));
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(14);
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test16874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16874");
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
        com.badlogic.gdx.graphics.Color color17 = lwjgl3ApplicationConfiguration16.initialBackgroundColor;
        int int18 = lwjgl3ApplicationConfiguration16.getsamples();
        lwjgl3ApplicationConfiguration16.setdepth(10224804);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test16875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16875");
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
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color8, 0);
        boolean boolean23 = color8.equals((java.lang.Object) (-7168));
        int int24 = com.badlogic.gdx.graphics.Color.rgba4444(color8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test16876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16876");
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
        java.lang.String str16 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.g = (-1628);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16877");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-1183514624));
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test16878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16878");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        float float4 = color2.b;
        float float5 = color2.r;
        com.badlogic.gdx.graphics.Color color10 = color2.set((float) (byte) 1, (float) (byte) 10, 0.0f, 0.69803923f);
        com.badlogic.gdx.graphics.Color color11 = color2.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration12.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration12.samples = (-1);
        boolean boolean17 = lwjgl3ApplicationConfiguration12.initialVisible;
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.BLACK;
        float float19 = color18.r;
        com.badlogic.gdx.graphics.Color color24 = color18.set((float) 0L, (float) 1671296512, (float) 255, (-5.387877E37f));
        lwjgl3ApplicationConfiguration12.initialBackgroundColor = color18;
        com.badlogic.gdx.graphics.Color color26 = color18.cpy();
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color28 = color11.mul(color27);
        float float29 = color28.g;
        float float30 = color28.a;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
// flaky:         org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
    }

    @Test
    public void test16879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16879");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test16880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16880");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        int int7 = com.badlogic.gdx.graphics.Color.rgba8888(color5);
        com.badlogic.gdx.graphics.Color color9 = color5.mul((float) 14);
        com.badlogic.gdx.graphics.Color color10 = color5.clamp();
        com.badlogic.gdx.graphics.Color color11 = color5.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color16 = color5.sub((float) 3845, 6.466791E-24f, (float) (-1034), (float) (-512064));
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int19 = lwjgl3ApplicationConfiguration18.getaudioDeviceBufferSize();
        boolean boolean20 = lwjgl3ApplicationConfiguration18.windowResizable;
        int int21 = lwjgl3ApplicationConfiguration18.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration18.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration18);
        com.badlogic.gdx.graphics.Color color25 = lwjgl3ApplicationConfiguration24.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color31 = color26.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color34 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color39 = color34.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color47 = color41.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color48 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str49 = color48.toString();
        com.badlogic.gdx.graphics.Color color51 = color41.lerp(color48, (-8.0750596E37f));
        boolean boolean52 = color34.equals((java.lang.Object) color41);
        com.badlogic.gdx.graphics.Color color53 = color33.add(color34);
        float float54 = color53.b;
        com.badlogic.gdx.graphics.Color color55 = color25.set(color53);
        int int56 = com.badlogic.gdx.graphics.Color.rgb888(color55);
        com.badlogic.gdx.graphics.Color color57 = color17.sub(color55);
        color17.a = (-236257520);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-65281) + "'", int7 == (-65281));
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "00ff0000" + "'", str49, "00ff0000");
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 1.0f + "'", float54 == 1.0f);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 16777215 + "'", int56 == 16777215);
        org.junit.Assert.assertNotNull(color57);
    }

    @Test
    public void test16881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16881");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888(0.1254902f, (float) 256, (float) (-65536), (float) 166464502);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test16882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16882");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-10223617), (float) 15598079);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test16883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16883");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int8 = lwjgl3ApplicationConfiguration7.getwindowY();
        boolean boolean9 = lwjgl3ApplicationConfiguration7.getdisableAudio();
        lwjgl3ApplicationConfiguration7.setwindowWidth(5147940);
        int int12 = lwjgl3ApplicationConfiguration7.getgles30ContextMinorVersion();
        boolean boolean13 = lwjgl3ApplicationConfiguration7.vSyncEnabled;
        int int14 = lwjgl3ApplicationConfiguration7.getwindowY();
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test16884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16884");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration17.setpreferencesFileType(fileType18);
        lwjgl3ApplicationConfiguration17.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration17.setPreferencesConfig("", fileType23);
        com.badlogic.gdx.Files.FileType fileType25 = lwjgl3ApplicationConfiguration17.preferencesFileType;
        lwjgl3ApplicationConfiguration17.gles30ContextMinorVersion = 587162524;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration28.setpreferencesFileType(fileType29);
        lwjgl3ApplicationConfiguration28.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration28.setPreferencesConfig("", fileType34);
        int int36 = lwjgl3ApplicationConfiguration28.r;
        int int37 = lwjgl3ApplicationConfiguration28.getwindowY();
        lwjgl3ApplicationConfiguration28.setTitle(".prefs/");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode42 = null;
        lwjgl3ApplicationConfiguration41.setFullscreenMode(displayMode42);
        com.badlogic.gdx.Files.FileType fileType44 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration41.setpreferencesFileType(fileType44);
        lwjgl3ApplicationConfiguration41.setwindowY(100);
        lwjgl3ApplicationConfiguration41.r = 0;
        lwjgl3ApplicationConfiguration41.setsamples(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType53 = null;
        lwjgl3ApplicationConfiguration52.setpreferencesFileType(fileType53);
        lwjgl3ApplicationConfiguration52.disableAudio = true;
        lwjgl3ApplicationConfiguration52.initialVisible = true;
        int int59 = lwjgl3ApplicationConfiguration52.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration52.b = (-62986);
        lwjgl3ApplicationConfiguration52.b = 2;
        lwjgl3ApplicationConfiguration52.setwindowX((int) 'a');
        lwjgl3ApplicationConfiguration52.setsamples((int) (short) 10);
        lwjgl3ApplicationConfiguration52.g = 65295;
        boolean boolean70 = lwjgl3ApplicationConfiguration52.initialVisible;
        com.badlogic.gdx.Files.FileType fileType71 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration52.setpreferencesFileType(fileType71);
        lwjgl3ApplicationConfiguration41.preferencesFileType = fileType71;
        lwjgl3ApplicationConfiguration28.setPreferencesConfig("00000000", fileType71);
        lwjgl3ApplicationConfiguration17.setpreferencesFileType(fileType71);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType71);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration77 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener16);
        org.junit.Assert.assertNull(fileType25);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + fileType44 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType44.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 512 + "'", int59 == 512);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + fileType71 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType71.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration77);
    }

    @Test
    public void test16885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16885");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-2143297280), (float) 8256822, (float) 41903542, (-5.360365E37f));
        float float5 = color4.toFloatBits();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.3509528E-38f + "'", float5 == 2.3509528E-38f);
    }

    @Test
    public void test16886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16886");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-58475), (float) (-2336), (float) (-27133), (float) (-178));
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
    }

    @Test
    public void test16887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16887");
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
        lwjgl3ApplicationConfiguration0.g = (-1627389952);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test16888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16888");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode17 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode17;
        lwjgl3ApplicationConfiguration0.depth = (-10158080);
        com.badlogic.gdx.graphics.Color color21 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.samples = (-150994945);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
    }

    @Test
    public void test16889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16889");
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
        boolean boolean22 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration23.setAudioConfig((-7168), (-81856144), 63518);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
    }

    @Test
    public void test16890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16890");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int9 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16891");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-1241513983);
        int int13 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.stencil = 34303;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int17 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 640 + "'", int17 == 640);
    }

    @Test
    public void test16892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16892");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1562574848), (float) (-31), (float) (-4096), (float) (-270335746));
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.OLIVE;
        java.lang.String str6 = color5.toString();
        com.badlogic.gdx.graphics.Color color8 = color5.mul((float) (-2076210));
        com.badlogic.gdx.graphics.Color color10 = color4.lerp(color8, (-1.6986602E38f));
        int int11 = com.badlogic.gdx.graphics.Color.rgba4444(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration12.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration12.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration12.setPreferencesConfig("", fileType18);
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration12.preferencesFileType;
        int int21 = lwjgl3ApplicationConfiguration12.samples;
        int int22 = lwjgl3ApplicationConfiguration12.windowHeight;
        lwjgl3ApplicationConfiguration12.useOpenGL3(false, (int) 'a', (-16711680));
        boolean boolean27 = lwjgl3ApplicationConfiguration12.getdisableAudio();
        int int28 = lwjgl3ApplicationConfiguration12.b;
        boolean boolean29 = color8.equals((java.lang.Object) lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(color5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(fileType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 480 + "'", int22 == 480);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test16893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16893");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SCARLET;
        color0.b = '#';
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) 1L);
        color3.g = (byte) 10;
        float float8 = color3.b;
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(251658239);
        com.badlogic.gdx.graphics.Color color12 = color3.lerp(color10, (float) (-2176));
        float float13 = color12.b;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color12, 0);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test16894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16894");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20160);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        int int7 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNull(lwjgl3DisplayMode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test16895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16895");
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
        color22.r = (-22);
        com.badlogic.gdx.graphics.Color color31 = color22.lerp((float) (-1056), (float) 385941504, (float) (-240), (float) 20160, 0.03137255f);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color22, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color31);
    }

    @Test
    public void test16896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16896");
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
        lwjgl3ApplicationConfiguration0.windowWidth = (-240);
        int int17 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-240) + "'", int17 == (-240));
    }

    @Test
    public void test16897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16897");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        int int7 = lwjgl3ApplicationConfiguration0.getdepth();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setwindowY((-153734400));
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test16898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16898");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("00000000");
        com.badlogic.gdx.graphics.Color color2 = color1.cpy();
        com.badlogic.gdx.graphics.Color color7 = color1.set((float) (-3145729), (float) 251649808, (float) (-131072), (float) (-636610560));
        int int8 = com.badlogic.gdx.graphics.Color.rgba4444(color1);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3840 + "'", int8 == 3840);
    }

    @Test
    public void test16899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16899");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(3);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (-16734721));
        com.badlogic.gdx.graphics.Color color8 = color1.mul((float) 65025, (float) (-34), (float) 50200831, (-1.7013883E38f));
        com.badlogic.gdx.graphics.Color color10 = color8.set((-2147283968));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color8, 1426063356);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test16900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16900");
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
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.windowX = 385941504;
        int int19 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 385941504 + "'", int19 == 385941504);
    }

    @Test
    public void test16901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16901");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 167247232;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 1671296512;
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int17 = lwjgl3ApplicationConfiguration16.getaudioDeviceBufferSize();
        boolean boolean18 = lwjgl3ApplicationConfiguration16.windowResizable;
        lwjgl3ApplicationConfiguration16.disableAudio = false;
        lwjgl3ApplicationConfiguration16.setResizable(true);
        lwjgl3ApplicationConfiguration16.setwindowX(10);
        int int25 = lwjgl3ApplicationConfiguration16.getwindowY();
        lwjgl3ApplicationConfiguration16.setaudioDeviceBufferCount(20160);
        int int28 = lwjgl3ApplicationConfiguration16.windowHeight;
        boolean boolean29 = lwjgl3ApplicationConfiguration16.getvSyncEnabled();
        lwjgl3ApplicationConfiguration16.setaudioDeviceBufferSize((-248));
        int int32 = lwjgl3ApplicationConfiguration16.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration16.windowResizable = true;
        boolean boolean35 = lwjgl3ApplicationConfiguration16.getdisableAudio();
        int int36 = lwjgl3ApplicationConfiguration16.b;
        boolean boolean37 = lwjgl3ApplicationConfiguration16.getwindowDecorated();
        lwjgl3ApplicationConfiguration16.setgles30ContextMajorVersion((-61440));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration40.vSyncEnabled = false;
        int int51 = lwjgl3ApplicationConfiguration40.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration40.samples = (-8520704);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode54 = lwjgl3ApplicationConfiguration40.hdpiMode;
        lwjgl3ApplicationConfiguration16.hdpiMode = hdpiMode54;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode54;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 480 + "'", int28 == 480);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 16 + "'", int32 == 16);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 16 + "'", int51 == 16);
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test16902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16902");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 16714240, (float) (-9702176));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-256) + "'", int2 == (-256));
    }

    @Test
    public void test16903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16903");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test16904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16904");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.getdepth();
        int int8 = lwjgl3ApplicationConfiguration0.windowWidth;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 640 + "'", int8 == 640);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test16905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16905");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration8.setpreferencesFileType(fileType9);
        lwjgl3ApplicationConfiguration8.disableAudio = true;
        int int13 = lwjgl3ApplicationConfiguration8.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode14 = lwjgl3ApplicationConfiguration8.fullscreenMode;
        lwjgl3ApplicationConfiguration8.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration8.setwindowY((int) '#');
        lwjgl3ApplicationConfiguration8.setwindowHeight((int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration21.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration21.samples = (-1);
        lwjgl3ApplicationConfiguration21.useGL30 = true;
        lwjgl3ApplicationConfiguration21.setpreferencesDirectory("ffff72ff");
        int int30 = lwjgl3ApplicationConfiguration21.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration21.windowY = 20188;
        int int33 = lwjgl3ApplicationConfiguration21.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode34 = lwjgl3ApplicationConfiguration21.hdpiMode;
        lwjgl3ApplicationConfiguration8.hdpiMode = hdpiMode34;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode34;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode14);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode34 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode34.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test16906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16906");
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
        int int18 = lwjgl3ApplicationConfiguration17.getgles30ContextMinorVersion();
        int int19 = lwjgl3ApplicationConfiguration17.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
    }

    @Test
    public void test16907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16907");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.windowHeight = 'a';
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.g = (-15146705);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(fileType11);
    }

    @Test
    public void test16908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16908");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-32768), (-1.6880791E38f), (float) (-1904640), (float) (-126105600));
    }

    @Test
    public void test16909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16909");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setwindowX(16776961);
        int int12 = lwjgl3ApplicationConfiguration0.stencil;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-2132934656);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16910");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int8 = lwjgl3ApplicationConfiguration0.b;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowX();
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.samples = (-65358);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode14 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode14;
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(lwjgl3WindowListener11);
    }

    @Test
    public void test16911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16911");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration8.setpreferencesFileType(fileType9);
        lwjgl3ApplicationConfiguration8.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration8.setPreferencesConfig("", fileType14);
        lwjgl3ApplicationConfiguration8.g = (short) 0;
        lwjgl3ApplicationConfiguration8.windowX = 35;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = lwjgl3ApplicationConfiguration8.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode20;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration22.getpreferencesFileType();
        lwjgl3ApplicationConfiguration22.gles30ContextMinorVersion = 6529016;
        lwjgl3ApplicationConfiguration22.setdepth((-848640));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test16912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16912");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        com.badlogic.gdx.graphics.Color color11 = color9.clamp();
        int int12 = com.badlogic.gdx.graphics.Color.rgba4444(color9);
        com.badlogic.gdx.graphics.Color color17 = color9.add((float) 34303, (float) 1557110528, (-1.6947138E38f), (float) (-248));
        int int18 = color9.toIntBits();
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color20 = color19.premultiplyAlpha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4095 + "'", int12 == 4095);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65535 + "'", int18 == 65535);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test16913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16913");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-16777184));
        float float2 = color1.b;
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((float) 'a', 0.13333334f, (float) 240, (float) 8160);
        com.badlogic.gdx.graphics.Color color8 = color1.mul(color7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test16914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16914");
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
        lwjgl3ApplicationConfiguration10.setwindowHeight((-333580800));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16915");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CLEAR;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-1980237824), 9.18893E-39f, (-4.153069E34f), (float) (-50135050));
        com.badlogic.gdx.graphics.Color color6 = color0.clamp();
        int int7 = com.badlogic.gdx.graphics.Color.rgb888(color6);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test16916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16916");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.useGL30;
        int int7 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 480 + "'", int7 == 480);
    }

    @Test
    public void test16917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16917");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.depth = 9;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 640 + "'", int7 == 640);
    }

    @Test
    public void test16918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16918");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-65400));
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) 1677786624, (float) (-112792302), (-5.6035425E37f), (float) 1671168000, (float) (-16719105));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 16761475);
        int int10 = com.badlogic.gdx.graphics.Color.rgb888(color1);
        java.lang.Class<?> wildcardClass11 = color1.getClass();
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12931096 + "'", int10 == 12931096);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16919");
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
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-2142638528);
        boolean boolean18 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (-30592), 3840, (-1625292800), 0, 536871167, 234872319);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16920");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        float float4 = color2.b;
        float float5 = color2.r;
        com.badlogic.gdx.graphics.Color color10 = color2.set((float) (byte) 1, (float) (byte) 10, 0.0f, 0.69803923f);
        com.badlogic.gdx.graphics.Color color11 = color2.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration12.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration12.samples = (-1);
        boolean boolean17 = lwjgl3ApplicationConfiguration12.initialVisible;
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.BLACK;
        float float19 = color18.r;
        com.badlogic.gdx.graphics.Color color24 = color18.set((float) 0L, (float) 1671296512, (float) 255, (-5.387877E37f));
        lwjgl3ApplicationConfiguration12.initialBackgroundColor = color18;
        com.badlogic.gdx.graphics.Color color26 = color18.cpy();
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color28 = color11.mul(color27);
        color28.b = 1442840575;
        com.badlogic.gdx.graphics.Color color31 = color28.clamp();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color31, (-66048));
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color31);
    }

    @Test
    public void test16921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16921");
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
        int int15 = lwjgl3ApplicationConfiguration14.windowWidth;
        lwjgl3ApplicationConfiguration14.setdepth((-524536));
        java.lang.String str18 = lwjgl3ApplicationConfiguration14.title;
        lwjgl3ApplicationConfiguration14.setgles30ContextMinorVersion((-1904640));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16922");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16923");
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
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int14 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test16924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16924");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.windowWidth = (-570490625);
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
    }

    @Test
    public void test16925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16925");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int9 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-57400));
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int13 = lwjgl3ApplicationConfiguration0.r;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        int int15 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test16926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16926");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) '4');
    }

    @Test
    public void test16927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16927");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(512, 33554431, (-1879860224), 16776961, (-65024), 65024, (-2147222656));
        lwjgl3ApplicationConfiguration0.windowHeight = (-1902614);
        lwjgl3ApplicationConfiguration0.a = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode25 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode25;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color29;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener31);
        int int33 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 512 + "'", int33 == 512);
    }

    @Test
    public void test16928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16928");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.graphics.Color color12 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color13 = color12.cpy();
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test16929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16929");
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
        boolean boolean16 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration19.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration19.samples = '4';
        int int24 = lwjgl3ApplicationConfiguration19.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType29 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration25.setPreferencesConfig("hi!", fileType29);
        lwjgl3ApplicationConfiguration19.preferencesFileType = fileType29;
        lwjgl3ApplicationConfiguration19.setInitialVisible(false);
        lwjgl3ApplicationConfiguration19.audioDeviceBufferSize = (byte) 0;
        lwjgl3ApplicationConfiguration19.vSyncEnabled = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = lwjgl3ApplicationConfiguration19.windowListener;
        int int39 = lwjgl3ApplicationConfiguration19.b;
        lwjgl3ApplicationConfiguration19.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration19.r = (-2146721792);
        com.badlogic.gdx.Files.FileType fileType44 = lwjgl3ApplicationConfiguration19.preferencesFileType;
        lwjgl3ApplicationConfiguration17.setPreferencesConfig("ffffff00", fileType44);
        int int46 = lwjgl3ApplicationConfiguration17.windowY;
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + fileType29 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType29.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNull(lwjgl3WindowListener38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8 + "'", int39 == 8);
        org.junit.Assert.assertTrue("'" + fileType44 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType44.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test16930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16930");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode3;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration5.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration5.disableAudio = true;
        lwjgl3ApplicationConfiguration5.setsamples((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType14);
        lwjgl3ApplicationConfiguration13.useVsync(false);
        lwjgl3ApplicationConfiguration13.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration13.a = (-62986);
        lwjgl3ApplicationConfiguration13.setdisableAudio(true);
        boolean boolean25 = lwjgl3ApplicationConfiguration13.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration27.setFullscreenMode(displayMode28);
        lwjgl3ApplicationConfiguration27.windowX = 100;
        int int32 = lwjgl3ApplicationConfiguration27.g;
        com.badlogic.gdx.Files.FileType fileType33 = lwjgl3ApplicationConfiguration27.getpreferencesFileType();
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("ffffff00", fileType33);
        lwjgl3ApplicationConfiguration5.setPreferencesConfig("ffff72ff", fileType33);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-2143297280), 1470693630, (-47784960));
        boolean boolean42 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.title = "fffe1200";
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertTrue("'" + fileType33 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType33.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3WindowListener37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test16931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16931");
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
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-1562574848));
        java.lang.String str20 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 60426;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ".prefs/" + "'", str20, ".prefs/");
    }

    @Test
    public void test16932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16932");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int8 = lwjgl3ApplicationConfiguration7.getwindowY();
        boolean boolean9 = lwjgl3ApplicationConfiguration7.getdisableAudio();
        int int10 = lwjgl3ApplicationConfiguration7.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration7.useOpenGL3(false, (-536870912), (-34668816));
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
    }

    @Test
    public void test16933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16933");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        java.lang.String str7 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.r = (-50135050);
        lwjgl3ApplicationConfiguration0.windowY = (-27133);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.b = (-30474240);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16934");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.windowY = 20188;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.samples = (-62527);
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) ' ');
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test16935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16935");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color19 = color13.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color20 = color11.mul(color19);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color28 = color22.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color28.g = (short) 1;
        com.badlogic.gdx.graphics.Color color32 = color20.lerp(color28, (float) 25500);
        com.badlogic.gdx.graphics.Color color37 = color20.mul(0.0f, (float) (-8142), (float) (-1562574848), (-1.0f));
        color20.g = '#';
        com.badlogic.gdx.graphics.Color color40 = color9.set(color20);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color20);
        float float42 = color41.g;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ffffff00" + "'", str8, "ffffff00");
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 35.0f + "'", float42 == 35.0f);
    }

    @Test
    public void test16936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16936");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setdepth((-1109610));
        int int15 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.title = "ffff65b6";
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
    }

    @Test
    public void test16937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16937");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = color12.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color18.g = (short) 1;
        com.badlogic.gdx.graphics.Color color22 = color10.lerp(color18, (float) 25500);
        com.badlogic.gdx.graphics.Color color23 = color10.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((float) 2550, (float) 16744272, (float) (-2113928961), (float) (-402678048));
        com.badlogic.gdx.graphics.Color color29 = color10.set(color28);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color29);
    }

    @Test
    public void test16938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16938");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int12 = lwjgl3ApplicationConfiguration0.depth;
        int int13 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int14 = lwjgl3ApplicationConfiguration0.b;
        int int15 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
    }

    @Test
    public void test16939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16939");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20160);
        int int5 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType8);
        lwjgl3ApplicationConfiguration7.useVsync(false);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration7.initialBackgroundColor = color12;
        lwjgl3ApplicationConfiguration7.setDecorated(false);
        lwjgl3ApplicationConfiguration7.setaudioDeviceBufferSize((-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str20 = lwjgl3ApplicationConfiguration19.title;
        lwjgl3ApplicationConfiguration19.a = (-1);
        boolean boolean23 = lwjgl3ApplicationConfiguration19.vSyncEnabled;
        int int24 = lwjgl3ApplicationConfiguration19.windowHeight;
        lwjgl3ApplicationConfiguration19.setuseGL30(false);
        lwjgl3ApplicationConfiguration19.setwindowX((int) (short) 10);
        lwjgl3ApplicationConfiguration19.setWindowPosition(61450, (-1562574848));
        lwjgl3ApplicationConfiguration19.gles30ContextMajorVersion = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode34 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration19.hdpiMode = hdpiMode34;
        lwjgl3ApplicationConfiguration18.hdpiMode = hdpiMode34;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode34;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-47972106);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 480 + "'", int24 == 480);
        org.junit.Assert.assertTrue("'" + hdpiMode34 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode34.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test16940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16940");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 100;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test16941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16941");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        int int22 = lwjgl3ApplicationConfiguration15.g;
        int int23 = lwjgl3ApplicationConfiguration15.samples;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test16942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16942");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.a = 246;
        int int14 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration15.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str22 = lwjgl3ApplicationConfiguration21.title;
        lwjgl3ApplicationConfiguration21.a = (-1);
        boolean boolean25 = lwjgl3ApplicationConfiguration21.vSyncEnabled;
        lwjgl3ApplicationConfiguration21.setgles30ContextMajorVersion((-50135050));
        com.badlogic.gdx.Files.FileType fileType28 = lwjgl3ApplicationConfiguration21.getpreferencesFileType();
        lwjgl3ApplicationConfiguration15.setPreferencesConfig("ffff0100", fileType28);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType28;
        int int31 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode32 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode32;
        com.badlogic.gdx.Files.FileType fileType34 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.windowWidth = (-18);
        boolean boolean37 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.Files.FileType fileType38 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(65534);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + fileType34 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType34.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + fileType38 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType38.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test16943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16943");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-4.2826227E37f), (float) 1175278, (float) (-1562574848), (float) (-1573120));
        int int5 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16711680 + "'", int5 == 16711680);
    }

    @Test
    public void test16944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16944");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1, (float) 20160, (float) 0, (float) (byte) -1);
        java.lang.Object obj5 = null;
        boolean boolean6 = color4.equals(obj5);
        color4.a = 1.66464E8f;
        color4.a = (-1996488960);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test16945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16945");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setwindowX((-1291845633));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration11.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration11.windowX = 100;
        int int16 = lwjgl3ApplicationConfiguration11.g;
        com.badlogic.gdx.Files.FileType fileType17 = lwjgl3ApplicationConfiguration11.getpreferencesFileType();
        int int18 = lwjgl3ApplicationConfiguration11.b;
        lwjgl3ApplicationConfiguration11.windowDecorated = true;
        com.badlogic.gdx.Files.FileType fileType21 = lwjgl3ApplicationConfiguration11.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00ff0000", fileType21);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 166464000, (-335));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int32 = lwjgl3ApplicationConfiguration31.getaudioDeviceBufferSize();
        boolean boolean33 = lwjgl3ApplicationConfiguration31.windowResizable;
        int int34 = lwjgl3ApplicationConfiguration31.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration31.setvSyncEnabled(false);
        boolean boolean37 = lwjgl3ApplicationConfiguration31.getvSyncEnabled();
        lwjgl3ApplicationConfiguration31.r = 140834847;
        com.badlogic.gdx.Files.FileType fileType40 = lwjgl3ApplicationConfiguration31.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType40);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + fileType17 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType17.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + fileType21 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType21.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 512 + "'", int32 == 512);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + fileType40 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType40.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test16946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16946");
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
        lwjgl3ApplicationConfiguration7.setBackBufferConfig(41903542, (-222), 0, (int) (short) 100, 1044480, (-8672), 52);
        boolean boolean22 = lwjgl3ApplicationConfiguration7.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration7.setWindowListener(lwjgl3WindowListener23);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16947");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 10;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int9 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.depth = 8897069;
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test16948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16948");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color17 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int18 = com.badlogic.gdx.graphics.Color.rgb565(color17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNull(fileType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2047 + "'", int18 == 2047);
    }

    @Test
    public void test16949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16949");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        int int7 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(9);
        int int10 = lwjgl3ApplicationConfiguration0.b;
        int int11 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test16950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16950");
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
        lwjgl3ApplicationConfiguration0.setTitle("ffffffb2");
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
    }

    @Test
    public void test16951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16951");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        int int5 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setdepth(100);
        lwjgl3ApplicationConfiguration0.b = 480;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-2350080);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test16952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16952");
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
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean18 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.title = "ff00ffff";
        org.junit.Assert.assertNull(fileType14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test16953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16953");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int8 = lwjgl3ApplicationConfiguration0.b;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowX();
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-22);
        int int14 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(lwjgl3WindowListener11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test16954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16954");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha(0.0f, (float) (-59894));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15272970) + "'", int2 == (-15272970));
    }

    @Test
    public void test16955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16955");
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
        int int13 = lwjgl3ApplicationConfiguration0.stencil;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode14 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setsamples((-53504));
        boolean boolean17 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int18 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(lwjgl3DisplayMode14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test16956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16956");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-1879113728), (float) 8925, (-0.49999902f), (-1.7013873E38f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-32512) + "'", int4 == (-32512));
    }

    @Test
    public void test16957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16957");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(0.6313726f, (float) (-16731648), (float) 33423457, (float) (-7632));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.694782E38f) + "'", float4 == (-1.694782E38f));
    }

    @Test
    public void test16958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16958");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(20160);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int16 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test16959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16959");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str1 = color0.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (-33488131));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color0, (-1644167168));
        int int6 = com.badlogic.gdx.graphics.Color.rgba8888(color0);
        java.lang.Object obj7 = null;
        boolean boolean8 = color0.equals(obj7);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00ff0000" + "'", str1, "00ff0000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test16960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16960");
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
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(3104);
        com.badlogic.gdx.graphics.Color color37 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(fileType14);
        org.junit.Assert.assertNull(fileType17);
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(color37);
    }

    @Test
    public void test16961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16961");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((-1.7014092E38f), (float) (-16896));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4308480) + "'", int2 == (-4308480));
    }

    @Test
    public void test16962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16962");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, (float) 1, 0.13333334f, 1.561203E-39f);
        com.badlogic.gdx.graphics.Color color6 = color4.mul((float) 100);
        com.badlogic.gdx.graphics.Color color11 = color4.add((float) (-1611265692), (float) 6147990, (float) (-1291845633), (float) 63736);
        color4.a = (-1611265692);
        com.badlogic.gdx.graphics.Color color15 = color4.set((-318963712));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test16963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16963");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration8.getaudioDeviceBufferCount();
        int int11 = lwjgl3ApplicationConfiguration8.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration8.windowHeight = (-587202461);
        lwjgl3ApplicationConfiguration8.setWindowPosition(100, (-33488131));
        int int17 = lwjgl3ApplicationConfiguration8.getwindowX();
        int int18 = lwjgl3ApplicationConfiguration8.samples;
        lwjgl3ApplicationConfiguration8.setAudioConfig((-1573120), (-16), (-10158080));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test16964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16964");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ORANGE;
        int int1 = color0.toIntBits();
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color7 = color2.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color2);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color color10 = color0.mul(color9);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0.0f, (float) 1, 0.13333334f, 1.561203E-39f);
        boolean boolean16 = color10.equals((java.lang.Object) color15);
        float float17 = color10.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int19 = lwjgl3ApplicationConfiguration18.getaudioDeviceBufferSize();
        int int20 = lwjgl3ApplicationConfiguration18.b;
        lwjgl3ApplicationConfiguration18.useGL30 = false;
        int int23 = lwjgl3ApplicationConfiguration18.getgles30ContextMinorVersion();
        boolean boolean24 = lwjgl3ApplicationConfiguration18.getwindowDecorated();
        int int25 = lwjgl3ApplicationConfiguration18.getwindowY();
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        lwjgl3ApplicationConfiguration18.setInitialBackgroundColor(color30);
        boolean boolean32 = color10.equals((java.lang.Object) lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-65538) + "'", int1 == (-65538));
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.5243549E-29f + "'", float17 == 2.5243549E-29f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test16965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16965");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(1323222528);
    }

    @Test
    public void test16966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16966");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-262144), (-270335746), (-65280), (-48));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6814215E38f) + "'", float4 == (-1.6814215E38f));
    }

    @Test
    public void test16967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16967");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(65024);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-940), 2, 35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType14);
        lwjgl3ApplicationConfiguration13.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("", fileType19);
        lwjgl3ApplicationConfiguration13.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration13.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration13.setWindowPosition(3, 8897069);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        lwjgl3ApplicationConfiguration13.a = (-255);
        int int31 = lwjgl3ApplicationConfiguration13.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration32.setpreferencesFileType(fileType33);
        lwjgl3ApplicationConfiguration32.disableAudio = true;
        lwjgl3ApplicationConfiguration32.initialVisible = true;
        int int39 = lwjgl3ApplicationConfiguration32.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration32.b = (-62986);
        lwjgl3ApplicationConfiguration32.b = 2;
        lwjgl3ApplicationConfiguration32.setwindowX((int) 'a');
        int int46 = lwjgl3ApplicationConfiguration32.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType49 = null;
        lwjgl3ApplicationConfiguration48.setpreferencesFileType(fileType49);
        lwjgl3ApplicationConfiguration48.useVsync(false);
        lwjgl3ApplicationConfiguration48.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration48.a = (-62986);
        lwjgl3ApplicationConfiguration48.setdisableAudio(true);
        boolean boolean60 = lwjgl3ApplicationConfiguration48.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode63 = null;
        lwjgl3ApplicationConfiguration62.setFullscreenMode(displayMode63);
        lwjgl3ApplicationConfiguration62.windowX = 100;
        int int67 = lwjgl3ApplicationConfiguration62.g;
        com.badlogic.gdx.Files.FileType fileType68 = lwjgl3ApplicationConfiguration62.getpreferencesFileType();
        lwjgl3ApplicationConfiguration48.setPreferencesConfig("ffffff00", fileType68);
        lwjgl3ApplicationConfiguration32.setPreferencesConfig("000000ff", fileType68);
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType68);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType68);
        lwjgl3ApplicationConfiguration0.setwindowY(2016);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-117440768), (-524536));
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-1034));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 8 + "'", int67 == 8);
        org.junit.Assert.assertTrue("'" + fileType68 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType68.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test16968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16968");
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
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-529006382);
        boolean boolean21 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        int int24 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test16969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16969");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 2016;
        int int13 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 480 + "'", int13 == 480);
    }

    @Test
    public void test16970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16970");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.b = (-1109610);
        int int11 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode14 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode14;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1109610) + "'", int11 == (-1109610));
    }

    @Test
    public void test16971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16971");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-33488131));
        lwjgl3ApplicationConfiguration0.setdepth((-1241350299));
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test16972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16972");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType8);
        lwjgl3ApplicationConfiguration7.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("", fileType13);
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration7.preferencesFileType;
        int int16 = lwjgl3ApplicationConfiguration7.samples;
        int int17 = lwjgl3ApplicationConfiguration7.windowHeight;
        lwjgl3ApplicationConfiguration7.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color22 = lwjgl3ApplicationConfiguration7.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color22, 43268);
        int int25 = com.badlogic.gdx.graphics.Color.rgb888(color22);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color22);
        float float27 = color22.a;
        color22.r = 2.2591532E-38f;
        boolean boolean30 = color6.equals((java.lang.Object) 2.2591532E-38f);
        com.badlogic.gdx.graphics.Color color35 = color6.sub((-1.6415966E38f), (float) 31334400, (float) (-2147222656), (-1.7013583E38f));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color6, (-65042));
        int int38 = com.badlogic.gdx.graphics.Color.rgba8888(color6);
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color((-1.6969465E38f), (float) 130560, (float) (-2142638528), (float) 166464502);
        com.badlogic.gdx.graphics.Color color48 = color43.mul((float) (short) -1, (float) 50, (float) (-50135050), (float) 65290);
        com.badlogic.gdx.graphics.Color color49 = color6.set(color48);
        com.badlogic.gdx.graphics.Color color51 = color48.set(32);
        int int52 = com.badlogic.gdx.graphics.Color.rgba4444(color48);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(fileType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 480 + "'", int17 == 480);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11280416 + "'", int25 == 11280416);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1175278 + "'", int38 == 1175278);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test16973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16973");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.windowWidth = (-2130837248);
        int int13 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test16974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16974");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 62144, (float) (-467664896), (float) 6356992);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-304152576) + "'", int3 == (-304152576));
    }

    @Test
    public void test16975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16975");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int8 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(573767680);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration14.setpreferencesFileType(fileType15);
        lwjgl3ApplicationConfiguration14.useVsync(false);
        lwjgl3ApplicationConfiguration14.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        lwjgl3ApplicationConfiguration23.disableAudio = true;
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color31 = color26.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str32 = color31.toString();
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color33);
        int int35 = com.badlogic.gdx.graphics.Color.rgba4444(color34);
        com.badlogic.gdx.graphics.Color color36 = color31.mul(color34);
        color36.a = 65504;
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color36;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration41.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration41.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration41.gles30ContextMajorVersion = 10;
        lwjgl3ApplicationConfiguration41.setwindowHeight(151015132);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration41);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration60.audioDeviceBufferSize = ' ';
        boolean boolean63 = lwjgl3ApplicationConfiguration60.getwindowResizable();
        com.badlogic.gdx.Files.FileType fileType64 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration60.preferencesFileType = fileType64;
        lwjgl3ApplicationConfiguration58.setPreferencesConfig("ffffffff", fileType64);
        int int67 = lwjgl3ApplicationConfiguration58.getaudioDeviceBufferSize();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration68.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration71 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration68);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener72 = null;
        lwjgl3ApplicationConfiguration71.windowListener = lwjgl3WindowListener72;
        lwjgl3ApplicationConfiguration71.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType76 = lwjgl3ApplicationConfiguration71.getpreferencesFileType();
        lwjgl3ApplicationConfiguration58.setpreferencesFileType(fileType76);
        lwjgl3ApplicationConfiguration23.setPreferencesConfig(".prefs/", fileType76);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType76;
        java.lang.Class<?> wildcardClass80 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ffff0000" + "'", str32, "ffff0000");
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4080 + "'", int35 == 4080);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + fileType64 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType64.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 512 + "'", int67 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration71);
        org.junit.Assert.assertTrue("'" + fileType76 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType76.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test16976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16976");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        float float4 = color2.b;
        float float5 = color2.r;
        com.badlogic.gdx.graphics.Color color10 = color2.set((float) (byte) 1, (float) (byte) 10, 0.0f, 0.69803923f);
        com.badlogic.gdx.graphics.Color color11 = color2.cpy();
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color17 = color12.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color25 = color20.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color33 = color27.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color34 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str35 = color34.toString();
        com.badlogic.gdx.graphics.Color color37 = color27.lerp(color34, (-8.0750596E37f));
        boolean boolean38 = color20.equals((java.lang.Object) color27);
        com.badlogic.gdx.graphics.Color color39 = color19.add(color20);
        com.badlogic.gdx.graphics.Color color45 = color20.lerp(0.19607843f, (float) 167247232, (float) 16777215, (float) 587162524, 0.0f);
        com.badlogic.gdx.graphics.Color color46 = color11.add(color20);
        int int47 = com.badlogic.gdx.graphics.Color.argb8888(color11);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color49 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color(color49);
        com.badlogic.gdx.graphics.Color color52 = color49.set(35);
        com.badlogic.gdx.graphics.Color color53 = color49.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color58 = color49.mul(0.0f, (float) 65535, (float) (-32), (float) (-1));
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color61 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color66 = color61.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color67 = color60.sub(color66);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color60, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color70 = new com.badlogic.gdx.graphics.Color(color60);
        com.badlogic.gdx.graphics.Color color75 = color60.mul((float) (-222), (-1.5084639E38f), (float) (-62986), (float) (-16741598));
        float float76 = color75.r;
        com.badlogic.gdx.graphics.Color color77 = color75.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color79 = color58.lerp(color75, (float) 16580354);
        com.badlogic.gdx.graphics.Color color81 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color83 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color89 = color83.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color90 = color81.mul(color89);
        com.badlogic.gdx.graphics.Color color91 = new com.badlogic.gdx.graphics.Color(color81);
        com.badlogic.gdx.graphics.Color color92 = color75.set(color91);
        com.badlogic.gdx.graphics.Color color93 = color11.mul(color75);
        com.badlogic.gdx.graphics.Color color94 = color93.premultiplyAlpha();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "00ff0000" + "'", str35, "00ff0000");
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1291845888) + "'", int47 == (-1291845888));
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNotNull(color66);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertNotNull(color75);
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + (-0.0f) + "'", float76 == (-0.0f));
        org.junit.Assert.assertNotNull(color77);
        org.junit.Assert.assertNotNull(color79);
        org.junit.Assert.assertNotNull(color89);
        org.junit.Assert.assertNotNull(color90);
        org.junit.Assert.assertNotNull(color92);
        org.junit.Assert.assertNotNull(color93);
        org.junit.Assert.assertNotNull(color94);
    }

    @Test
    public void test16977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16977");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(0, (-5001), 47, (-262646));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1083648) + "'", int4 == (-1083648));
    }

    @Test
    public void test16978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16978");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration8.windowX = 100;
        int int13 = lwjgl3ApplicationConfiguration8.g;
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration8.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType14;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-147861504));
        int int18 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 640 + "'", int18 == 640);
    }

    @Test
    public void test16979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16979");
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
        lwjgl3ApplicationConfiguration0.title = "ffffff22";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode17 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        int int18 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(93);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-262176), (-1581148), (-358913));
        lwjgl3ApplicationConfiguration0.title = "ffffde00";
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertNull(lwjgl3DisplayMode17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
    }

    @Test
    public void test16980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16980");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("01000000");
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.MAROON;
        float float3 = color2.toFloatBits();
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color2);
        com.badlogic.gdx.graphics.Color color5 = color4.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setDecorated(false);
        lwjgl3ApplicationConfiguration6.a = (byte) 10;
        boolean boolean11 = lwjgl3ApplicationConfiguration6.initialVisible;
        int int12 = lwjgl3ApplicationConfiguration6.b;
        lwjgl3ApplicationConfiguration6.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration6.initialBackgroundColor = color15;
        com.badlogic.gdx.graphics.Color color17 = color15.clamp();
        int int18 = com.badlogic.gdx.graphics.Color.rgba4444(color15);
        com.badlogic.gdx.graphics.Color color19 = color5.set(color15);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((float) 6356992, (float) (-254), 1.0f, (float) (byte) 1);
        float float25 = color24.b;
        com.badlogic.gdx.graphics.Color color26 = color19.mul(color24);
        com.badlogic.gdx.graphics.Color color27 = color1.sub(color19);
        com.badlogic.gdx.graphics.Color color29 = color19.mul((float) 1070333936);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.5243549E-29f + "'", float3 == 2.5243549E-29f);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3855 + "'", int18 == 3855);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color29);
    }

    @Test
    public void test16981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16981");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1784676352), (-33576664), (-2146562048));
        int int18 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test16982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16982");
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
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color27.r = 63519;
        com.badlogic.gdx.graphics.Color color35 = color27.lerp((float) 1, (-1.6974137E38f), (float) 9, 0.19607843f, (float) (-255));
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color35);
        com.badlogic.gdx.graphics.Color color41 = color36.mul((float) 16252680, (float) 3570, (float) (-10158080), (float) (-65358));
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color36);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color36;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration44.setDecorated(false);
        lwjgl3ApplicationConfiguration44.a = (byte) 10;
        boolean boolean49 = lwjgl3ApplicationConfiguration44.initialVisible;
        int int50 = lwjgl3ApplicationConfiguration44.b;
        lwjgl3ApplicationConfiguration44.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color53 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration44.initialBackgroundColor = color53;
        com.badlogic.gdx.graphics.Color color55 = color53.cpy();
        int int56 = com.badlogic.gdx.graphics.Color.rgb888(color53);
        com.badlogic.gdx.graphics.Color color57 = color36.add(color53);
        int int58 = com.badlogic.gdx.graphics.Color.rgba8888(color53);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 8 + "'", int50 == 8);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 65280 + "'", int56 == 65280);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 16711935 + "'", int58 == 16711935);
    }

    @Test
    public void test16983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16983");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1135083520), (float) (-56576), 0.0f, (float) 548143203);
    }

    @Test
    public void test16984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16984");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        int int7 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.windowX = 6147990;
        int int10 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 640 + "'", int10 == 640);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test16985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16985");
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
        lwjgl3ApplicationConfiguration0.useVsync(false);
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
    public void test16986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16986");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration24.windowListener = lwjgl3WindowListener25;
        int int27 = lwjgl3ApplicationConfiguration24.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode28 = lwjgl3ApplicationConfiguration24.fullscreenMode;
        lwjgl3ApplicationConfiguration24.setwindowX((-16));
        int int31 = lwjgl3ApplicationConfiguration24.getsamples();
        lwjgl3ApplicationConfiguration24.audioDeviceBufferSize = 640;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 43268 + "'", int27 == 43268);
        org.junit.Assert.assertNull(lwjgl3DisplayMode28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test16987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16987");
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
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (byte) 0;
        lwjgl3ApplicationConfiguration0.windowY = (-262646);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "eff1ff00";
        int int21 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 480 + "'", int21 == 480);
    }

    @Test
    public void test16988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16988");
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
        int int18 = lwjgl3ApplicationConfiguration17.g;
        lwjgl3ApplicationConfiguration17.setaudioDeviceBufferCount(65520);
        int int21 = lwjgl3ApplicationConfiguration17.getwindowHeight();
        int int22 = lwjgl3ApplicationConfiguration17.getdepth();
        lwjgl3ApplicationConfiguration17.audioDeviceBufferCount = 35;
        int int25 = lwjgl3ApplicationConfiguration17.getwindowHeight();
        lwjgl3ApplicationConfiguration17.windowHeight = (-12989440);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 480 + "'", int21 == 480);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 480 + "'", int25 == 480);
    }

    @Test
    public void test16989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16989");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color13 = color7.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str15 = color14.toString();
        com.badlogic.gdx.graphics.Color color17 = color7.lerp(color14, (-8.0750596E37f));
        boolean boolean18 = color0.equals((java.lang.Object) color7);
        com.badlogic.gdx.graphics.Color color20 = color0.set(20188);
        float float21 = color0.b;
        color0.g = 0.30588236f;
        com.badlogic.gdx.graphics.Color color28 = color0.add(4.8303113E-18f, (float) 100L, (-1.6482297E38f), 0.0f);
        int int29 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color0, 3381300);
        com.badlogic.gdx.graphics.Color color33 = color0.set(855638050);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "00ff0000" + "'", str15, "00ff0000");
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.30588236f + "'", float21 == 0.30588236f);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-603914496) + "'", int29 == (-603914496));
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test16990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16990");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((-1.4690555E38f), 0.6156863f, (float) (-1610612736));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2147443456) + "'", int3 == (-2147443456));
    }

    @Test
    public void test16991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16991");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) (-567943452), 0.69803923f, 2.9056E-41f, (float) 16776960);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration11.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration11.windowX = 100;
        int int16 = lwjgl3ApplicationConfiguration11.stencil;
        int int17 = lwjgl3ApplicationConfiguration11.windowY;
        lwjgl3ApplicationConfiguration11.a = 43268;
        int int20 = lwjgl3ApplicationConfiguration11.gles30ContextMinorVersion;
        int int21 = lwjgl3ApplicationConfiguration11.getwindowX();
        com.badlogic.gdx.graphics.Color color22 = lwjgl3ApplicationConfiguration11.initialBackgroundColor;
        color22.a = 35;
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color22);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration27.setpreferencesFileType(fileType28);
        lwjgl3ApplicationConfiguration27.useVsync(false);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration27.initialBackgroundColor = color32;
        int int34 = lwjgl3ApplicationConfiguration27.depth;
        lwjgl3ApplicationConfiguration27.windowResizable = false;
        com.badlogic.gdx.graphics.Color color37 = lwjgl3ApplicationConfiguration27.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color39 = color26.lerp(color37, (float) 0L);
        com.badlogic.gdx.graphics.Color color40 = color5.set(color37);
        int int41 = com.badlogic.gdx.graphics.Color.rgba4444(color40);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 16 + "'", int34 == 16);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3855 + "'", int41 == 3855);
    }

    @Test
    public void test16992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16992");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-33488131), (float) (-327680), 0.0f, (-4.8515605E37f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-137625600) + "'", int4 == (-137625600));
    }

    @Test
    public void test16993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16993");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (-262646));
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration12.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration12.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration12.setPreferencesConfig("", fileType18);
        lwjgl3ApplicationConfiguration12.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        lwjgl3ApplicationConfiguration12.b = '4';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration12.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = lwjgl3ApplicationConfiguration12.hdpiMode;
        lwjgl3ApplicationConfiguration10.hdpiMode = hdpiMode27;
        int int29 = lwjgl3ApplicationConfiguration10.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration10.windowWidth = 61599;
        java.lang.String str32 = lwjgl3ApplicationConfiguration10.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ".prefs/" + "'", str32, ".prefs/");
    }

    @Test
    public void test16994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16994");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        float float7 = color5.g;
        com.badlogic.gdx.graphics.Color color8 = color5.cpy();
        color8.g = 0.69411767f;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test16995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16995");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-1291845633));
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.samples = (-598016);
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = lwjgl3ApplicationConfiguration0.windowListener;
        int int18 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNull(lwjgl3WindowListener17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test16996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16996");
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
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color34 = color0.cpy();
        com.badlogic.gdx.graphics.Color color39 = color34.set((-1.003567E38f), (float) (-16), (-65358.0f), (-1.46358192E17f));
        com.badlogic.gdx.graphics.Color color40 = color34.premultiplyAlpha();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-4.2866305E37f) + "'", float1 == (-4.2866305E37f));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "33000022" + "'", str22, "33000022");
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
    }

    @Test
    public void test16997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16997");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 640 + "'", int10 == 640);
        org.junit.Assert.assertNull(lwjgl3DisplayMode11);
    }

    @Test
    public void test16998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16998");
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
        boolean boolean39 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.a = (-187392);
        com.badlogic.gdx.Files.FileType fileType44 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + fileType36 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType36.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + fileType44 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType44.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test16999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16999");
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
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (byte) 0;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("000000ff");
        int int19 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = (-128508928);
        lwjgl3ApplicationConfiguration0.samples = 26129;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
    }

    @Test
    public void test17000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test17000");
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
        boolean boolean23 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.b = (-16777200);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int28 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 41903542 + "'", int28 == 41903542);
    }
}
