import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        int int10 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources = (-80712576);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.stencil = 10;
        int int16 = lwjgl3ApplicationConfiguration13.depth;
        int int17 = lwjgl3ApplicationConfiguration13.stencil;
        int int18 = lwjgl3ApplicationConfiguration13.getwindowY();
        lwjgl3ApplicationConfiguration13.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration13.windowHeight = (-255);
        int int23 = lwjgl3ApplicationConfiguration13.getwindowHeight();
        com.badlogic.gdx.Files.FileType fileType24 = lwjgl3ApplicationConfiguration13.preferencesFileType;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType24;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-255) + "'", int23 == (-255));
        org.junit.Assert.assertTrue("'" + fileType24 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType24.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
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
        int int37 = lwjgl3ApplicationConfiguration0.b;
        int int38 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int4 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener5;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode7 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode7;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(8925, (-1430550), (-153276416), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-97785123) + "'", int4 == (-97785123));
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-15514229), (-1.6948306E38f), (float) (-16711681), (-1.689904E38f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int13 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.a = (-129024);
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-16255486);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode19 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode19;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
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
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color((float) 512, (float) (-5543167), (float) (-2146830848), (float) (-2147483648));
        com.badlogic.gdx.graphics.Color color50 = color39.sub(color49);
        com.badlogic.gdx.graphics.Color color52 = color50.mul((float) 9);
        com.badlogic.gdx.graphics.Color color57 = color50.mul((float) (-536870912), (-4.6884985E37f), (float) 12517631, 0.92941177f);
        com.badlogic.gdx.graphics.Color color58 = new com.badlogic.gdx.graphics.Color(color50);
        com.badlogic.gdx.graphics.Color color59 = color50.clamp();
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
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color59);
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(63518);
        com.badlogic.gdx.graphics.Color color3 = color1.mul(1.6210985E9f);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1465382614, (int) ' ');
        int int18 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 0;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) (byte) 10);
        int int23 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int24 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLUE;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color color2 = color0.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color6, 16);
        color6.a = 0L;
        com.badlogic.gdx.graphics.Color color11 = color4.mul(color6);
        com.badlogic.gdx.graphics.Color color16 = color4.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        color4.g = (short) -1;
        com.badlogic.gdx.graphics.Color color19 = color0.add(color4);
        float float20 = color19.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.stencil = 10;
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration21.initialBackgroundColor = color25;
        com.badlogic.gdx.graphics.Color color31 = color25.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color32 = color19.set(color25);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color19);
// flaky:         org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
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
        lwjgl3ApplicationConfiguration0.b = (-2105736960);
        lwjgl3ApplicationConfiguration0.windowWidth = 16738740;
        int int24 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int25 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 480 + "'", int24 == 480);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int9 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.windowHeight = (-545421065);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(63518);
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.g = 63456;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ff00000a";
        lwjgl3ApplicationConfiguration0.title = "ffffff64";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(lwjgl3DisplayMode10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 63518 + "'", int16 == 63518);
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
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
        boolean boolean20 = lwjgl3ApplicationConfiguration15.getvSyncEnabled();
        lwjgl3ApplicationConfiguration15.title = "";
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
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
        int int16 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setAudioConfig(2135687168, (-16646400), (-57871));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode7 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration8.stencil = 10;
        int int11 = lwjgl3ApplicationConfiguration8.depth;
        int int12 = lwjgl3ApplicationConfiguration8.stencil;
        int int13 = lwjgl3ApplicationConfiguration8.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = null;
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode14);
        int int16 = lwjgl3ApplicationConfiguration8.windowY;
        lwjgl3ApplicationConfiguration8.preferencesDirectory = "00000000";
        lwjgl3ApplicationConfiguration8.windowY = 8;
        int int21 = lwjgl3ApplicationConfiguration8.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.stencil = 10;
        int int25 = lwjgl3ApplicationConfiguration22.b;
        boolean boolean26 = lwjgl3ApplicationConfiguration22.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType27 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType27);
        int int29 = lwjgl3ApplicationConfiguration22.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        boolean boolean31 = lwjgl3ApplicationConfiguration22.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration32.stencil = 10;
        int int35 = lwjgl3ApplicationConfiguration32.depth;
        int int36 = lwjgl3ApplicationConfiguration32.stencil;
        int int37 = lwjgl3ApplicationConfiguration32.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = null;
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode38);
        int int40 = lwjgl3ApplicationConfiguration32.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.stencil = 10;
        int int44 = lwjgl3ApplicationConfiguration41.b;
        boolean boolean45 = lwjgl3ApplicationConfiguration41.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType46 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration41.setpreferencesFileType(fileType46);
        int int48 = lwjgl3ApplicationConfiguration41.depth;
        lwjgl3ApplicationConfiguration41.windowX = 765;
        int int51 = lwjgl3ApplicationConfiguration41.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = lwjgl3ApplicationConfiguration41.hdpiMode;
        lwjgl3ApplicationConfiguration32.hdpiMode = hdpiMode52;
        lwjgl3ApplicationConfiguration22.hdpiMode = hdpiMode52;
        lwjgl3ApplicationConfiguration8.hdpiMode = hdpiMode52;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(lwjgl3DisplayMode7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 16 + "'", int35 == 16);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 8 + "'", int44 == 8);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + fileType46 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType46.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 16 + "'", int48 == 16);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode52 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode52.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        int int9 = lwjgl3ApplicationConfiguration7.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration7.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration7.vSyncEnabled = false;
        int int14 = lwjgl3ApplicationConfiguration7.windowMinHeight;
        int int15 = lwjgl3ApplicationConfiguration7.getwindowMinWidth();
        boolean boolean16 = lwjgl3ApplicationConfiguration7.windowResizable;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("00ff00ff");
        color1.g = 224;
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int10 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        int int15 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-59475968), (float) (-20224), (-5.338441E37f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-36577280) + "'", int3 == (-36577280));
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.stencil = 10;
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration24.initialBackgroundColor = color28;
        lwjgl3ApplicationConfiguration24.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration24.initialBackgroundColor = color32;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.stencil = 10;
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration34.initialBackgroundColor = color38;
        com.badlogic.gdx.graphics.Color color44 = color38.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color48 = color38.lerp(color46, (float) 100L);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration49);
        lwjgl3ApplicationConfiguration50.setvSyncEnabled(false);
        boolean boolean53 = lwjgl3ApplicationConfiguration50.getuseGL30();
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color57 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color57, 16);
        color57.a = 0L;
        com.badlogic.gdx.graphics.Color color62 = color55.mul(color57);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration63.stencil = 10;
        com.badlogic.gdx.graphics.Color color67 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration63.initialBackgroundColor = color67;
        int int69 = com.badlogic.gdx.graphics.Color.rgb888(color67);
        boolean boolean71 = color67.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration72 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration72.stencil = 10;
        com.badlogic.gdx.graphics.Color color76 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration72.initialBackgroundColor = color76;
        com.badlogic.gdx.graphics.Color color82 = color76.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color83 = color67.mul(color82);
        com.badlogic.gdx.graphics.Color color84 = new com.badlogic.gdx.graphics.Color(color82);
        com.badlogic.gdx.graphics.Color color85 = color57.set(color84);
        lwjgl3ApplicationConfiguration50.setInitialBackgroundColor(color85);
        com.badlogic.gdx.graphics.Color color87 = color48.sub(color85);
        com.badlogic.gdx.graphics.Color color89 = color32.lerp(color48, 100.0f);
        com.badlogic.gdx.graphics.Color color90 = color23.sub(color89);
        java.lang.String str91 = color23.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(color82);
        org.junit.Assert.assertNotNull(color83);
        org.junit.Assert.assertNotNull(color85);
        org.junit.Assert.assertNotNull(color87);
        org.junit.Assert.assertNotNull(color89);
        org.junit.Assert.assertNotNull(color90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "fd800000" + "'", str91, "fd800000");
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.depth = (byte) 100;
        lwjgl3ApplicationConfiguration1.preferencesDirectory = ".prefs/";
        int int14 = lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion;
        int int15 = lwjgl3ApplicationConfiguration1.windowMaxWidth;
        lwjgl3ApplicationConfiguration1.depth = (-569376768);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.stencil = 10;
        int int21 = lwjgl3ApplicationConfiguration18.b;
        boolean boolean22 = lwjgl3ApplicationConfiguration18.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType23 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration18.setpreferencesFileType(fileType23);
        int int25 = lwjgl3ApplicationConfiguration18.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration18);
        boolean boolean27 = lwjgl3ApplicationConfiguration18.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration29);
        lwjgl3ApplicationConfiguration30.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration30.setsamples((int) (byte) 10);
        int int36 = lwjgl3ApplicationConfiguration30.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration30.windowHeight = (byte) 1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.stencil = 10;
        int int43 = lwjgl3ApplicationConfiguration40.depth;
        lwjgl3ApplicationConfiguration40.windowX = (short) 100;
        lwjgl3ApplicationConfiguration40.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType49 = lwjgl3ApplicationConfiguration40.getpreferencesFileType();
        lwjgl3ApplicationConfiguration30.setPreferencesConfig("ff000000", fileType49);
        lwjgl3ApplicationConfiguration18.setPreferencesConfig("", fileType49);
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType49);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 16 + "'", int43 == 16);
        org.junit.Assert.assertTrue("'" + fileType49 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType49.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = lwjgl3ApplicationConfiguration1.windowListener;
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources(1621098495);
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion((-256));
        lwjgl3ApplicationConfiguration1.windowMaxWidth = 63518;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(lwjgl3WindowListener10);
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode7 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        int int8 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int9 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(lwjgl3DisplayMode7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
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
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color29, (-65280));
        com.badlogic.gdx.graphics.Color color62 = color29.lerp((float) (-92), (float) (-67146624), 0.9647059f, (-8.952473E30f), (float) (-142049937));
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color(color62);
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
        org.junit.Assert.assertNotNull(color62);
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(13770);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
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
        java.lang.String str27 = lwjgl3ApplicationConfiguration0.title;
        int int28 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16 + "'", int28 == 16);
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.PINK;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul(1.96271E-40f);
        float float4 = color1.r;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.96271E-40f + "'", float4 == 1.96271E-40f);
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-1));
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int10 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 61680;
        int int13 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
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
        com.badlogic.gdx.graphics.Color color94 = color84.set(16776960);
        com.badlogic.gdx.graphics.Color color95 = new com.badlogic.gdx.graphics.Color(color84);
        java.lang.Class<?> wildcardClass96 = color95.getClass();
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
        org.junit.Assert.assertNotNull(color94);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-16033380));
        float float2 = color1.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration3.stencil = 10;
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration3.initialBackgroundColor = color7;
        lwjgl3ApplicationConfiguration3.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration3.samples = (short) -1;
        lwjgl3ApplicationConfiguration3.title = ".prefs/";
        int int15 = lwjgl3ApplicationConfiguration3.g;
        lwjgl3ApplicationConfiguration3.setWindowSizeLimits(63488, 267782144, 6349110, (-2147481728));
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color24, 16);
        color24.a = 0L;
        com.badlogic.gdx.graphics.Color color29 = color22.mul(color24);
        com.badlogic.gdx.graphics.Color color34 = color22.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color color36 = color22.set((int) (byte) -1);
        com.badlogic.gdx.graphics.Color color37 = color22.clamp();
        float float38 = color37.toFloatBits();
        lwjgl3ApplicationConfiguration3.setInitialBackgroundColor(color37);
        com.badlogic.gdx.graphics.Color color44 = color37.mul((float) 1677721600, 0.02745098f, (float) (-1286733314), (float) 6528502);
        com.badlogic.gdx.graphics.Color color45 = color1.add(color37);
        int int46 = com.badlogic.gdx.graphics.Color.rgba8888(color45);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.043137256f + "'", float2 == 0.043137256f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-1.7014117E38f) + "'", float38 == (-1.7014117E38f));
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-15574529) + "'", int46 == (-15574529));
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((-1.7014103E38f), (float) 184540928, (float) (-7798785), (float) (-64));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16320) + "'", int4 == (-16320));
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ORANGE;
        com.badlogic.gdx.graphics.Color color6 = color0.lerp(1.96271E-40f, (float) (-16711936), (float) 1677721600, (float) (-41943040), (-4.319983E37f));
        com.badlogic.gdx.graphics.Color color8 = color0.set(65520);
        com.badlogic.gdx.graphics.Color color13 = color0.add((-1.9187849E28f), (float) (-1107701632), (-7.098843E32f), (float) 1465382614);
        com.badlogic.gdx.graphics.Color color18 = color13.set((float) 63456, (float) (-157286400), (float) (-95486193), (float) 777825);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((-0.36354828f), (-8.706443E37f), 3.57E-43f, (-4.7519946E37f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1543503872) + "'", int4 == (-1543503872));
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int12 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1593770240), (-7937), (-151165028));
        int int19 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1075773696), 26180, (-59244732), (-65280), (-95486193), (-983040), 1820329983);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-7667072));
        int int2 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7667072) + "'", int2 == (-7667072));
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration51);
        int int53 = lwjgl3ApplicationConfiguration51.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration54.stencil = 10;
        com.badlogic.gdx.graphics.Color color58 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration54.initialBackgroundColor = color58;
        int int60 = com.badlogic.gdx.graphics.Color.rgb888(color58);
        boolean boolean62 = color58.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration63.stencil = 10;
        com.badlogic.gdx.graphics.Color color67 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration63.initialBackgroundColor = color67;
        com.badlogic.gdx.graphics.Color color73 = color67.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color74 = color58.mul(color73);
        com.badlogic.gdx.graphics.Color color76 = color73.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color73, 3);
        com.badlogic.gdx.graphics.Color color80 = color73.set((int) (short) 1);
        lwjgl3ApplicationConfiguration51.setInitialBackgroundColor(color80);
        com.badlogic.gdx.graphics.Color color82 = color80.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color84 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color84, 16);
        float float87 = color84.g;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color84, 512);
        int int90 = com.badlogic.gdx.graphics.Color.rgb565(color84);
        com.badlogic.gdx.graphics.Color color91 = color84.premultiplyAlpha();
        java.lang.String str92 = color91.toString();
        com.badlogic.gdx.graphics.Color color93 = new com.badlogic.gdx.graphics.Color(color91);
        com.badlogic.gdx.graphics.Color color94 = color82.add(color91);
        com.badlogic.gdx.graphics.Color color95 = color38.sub(color82);
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
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 640 + "'", int53 == 640);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(color73);
        org.junit.Assert.assertNotNull(color74);
        org.junit.Assert.assertNotNull(color76);
        org.junit.Assert.assertNotNull(color80);
        org.junit.Assert.assertNotNull(color82);
        org.junit.Assert.assertTrue("'" + float87 + "' != '" + 0.0f + "'", float87 == 0.0f);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(color91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "00000000" + "'", str92, "00000000");
        org.junit.Assert.assertNotNull(color94);
        org.junit.Assert.assertNotNull(color95);
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-45312), (float) 4080, (float) (-15), (float) 514080);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((int) '4');
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color6, (-100466688));
        com.badlogic.gdx.graphics.Color color9 = color4.mul(color6);
        com.badlogic.gdx.graphics.Color color14 = color6.sub((float) 16119270, (float) 1500, (float) (-243732465), (float) 251658240);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color2);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color2);
        com.badlogic.gdx.graphics.Color color9 = color2.set((float) 509920, 0.0f, 0.0f, (float) (byte) 1);
        color2.g = 0.0f;
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color2);
        color12.r = (-1);
        int int15 = com.badlogic.gdx.graphics.Color.rgb888(color12);
        com.badlogic.gdx.graphics.Color color20 = color12.set((float) 163200, (-8.491742E37f), (float) (-5510160), (float) (-352419840));
        float float21 = color20.a;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-16711680) + "'", int15 == (-16711680));
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
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
        int int19 = lwjgl3ApplicationConfiguration1.getsamples();
        lwjgl3ApplicationConfiguration1.setwindowX((int) ' ');
        com.badlogic.gdx.Files.FileType fileType22 = lwjgl3ApplicationConfiguration1.preferencesFileType;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode23 = null;
        lwjgl3ApplicationConfiguration1.fullscreenMode = lwjgl3DisplayMode23;
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode25);
        int int27 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + fileType22 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType22.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16 + "'", int27 == 16);
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
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
        color21.b = 0.13725491f;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.CORAL;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color7);
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
        int int32 = com.badlogic.gdx.graphics.Color.argb8888(color30);
        com.badlogic.gdx.graphics.Color color33 = color30.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.stencil = 10;
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration34.initialBackgroundColor = color38;
        int int40 = com.badlogic.gdx.graphics.Color.rgb888(color38);
        boolean boolean42 = color38.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.stencil = 10;
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration43.initialBackgroundColor = color47;
        com.badlogic.gdx.graphics.Color color53 = color47.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color54 = color38.mul(color53);
        com.badlogic.gdx.graphics.Color color56 = color53.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color53, 9);
        com.badlogic.gdx.graphics.Color color60 = color53.set((-4089));
        com.badlogic.gdx.graphics.Color color61 = color53.clamp();
        com.badlogic.gdx.graphics.Color color62 = color61.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color(color61);
        com.badlogic.gdx.graphics.Color color65 = color33.lerp(color61, (float) (-255));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration66.stencil = 10;
        com.badlogic.gdx.graphics.Color color70 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration66.initialBackgroundColor = color70;
        lwjgl3ApplicationConfiguration66.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color74 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration66.initialBackgroundColor = color74;
        java.lang.String str76 = color74.toString();
        com.badlogic.gdx.graphics.Color color77 = color33.add(color74);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color77);
        int int79 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration80 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration80.stencil = 10;
        com.badlogic.gdx.graphics.Color color84 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration80.initialBackgroundColor = color84;
        int int86 = com.badlogic.gdx.graphics.Color.rgb888(color84);
        boolean boolean88 = color84.equals((java.lang.Object) (short) -1);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color84;
        int int90 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(color74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "000000ff" + "'", str76, "000000ff");
        org.junit.Assert.assertNotNull(color77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 16 + "'", int79 == 16);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 8 + "'", int90 == 8);
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        int int8 = lwjgl3ApplicationConfiguration1.getwindowWidth();
        lwjgl3ApplicationConfiguration1.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color15;
        lwjgl3ApplicationConfiguration11.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color19;
        boolean boolean21 = lwjgl3ApplicationConfiguration11.getwindowResizable();
        lwjgl3ApplicationConfiguration11.setgles30ContextMinorVersion(2147418367);
        lwjgl3ApplicationConfiguration11.setTitle("");
        int int26 = lwjgl3ApplicationConfiguration11.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.stencil = 10;
        int int30 = lwjgl3ApplicationConfiguration27.b;
        lwjgl3ApplicationConfiguration27.g = '#';
        lwjgl3ApplicationConfiguration27.a = 3;
        boolean boolean35 = lwjgl3ApplicationConfiguration27.getdisableAudio();
        lwjgl3ApplicationConfiguration27.useOpenGL3(false, (-864551100), 65280);
        int int40 = lwjgl3ApplicationConfiguration27.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int42 = lwjgl3ApplicationConfiguration41.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration41);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener44 = lwjgl3ApplicationConfiguration41.windowListener;
        int int45 = lwjgl3ApplicationConfiguration41.getsamples();
        com.badlogic.gdx.Files.FileType fileType46 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration41.preferencesFileType = fileType46;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration48.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration48.setwindowResizable(false);
        int int59 = lwjgl3ApplicationConfiguration48.gles30ContextMajorVersion;
        int int60 = lwjgl3ApplicationConfiguration48.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener61 = null;
        lwjgl3ApplicationConfiguration48.setWindowListener(lwjgl3WindowListener61);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration63.stencil = 10;
        com.badlogic.gdx.graphics.Color color67 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration63.initialBackgroundColor = color67;
        lwjgl3ApplicationConfiguration63.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode71 = null;
        lwjgl3ApplicationConfiguration63.setFullscreenMode(displayMode71);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration73 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration63);
        int int74 = lwjgl3ApplicationConfiguration63.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration63.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode77 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration63.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration41.hdpiMode = hdpiMode77;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration1.hdpiMode = hdpiMode77;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 640 + "'", int8 == 640);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 512 + "'", int42 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration43);
        org.junit.Assert.assertNull(lwjgl3WindowListener44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + fileType46 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType46.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 3 + "'", int74 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode77 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode77.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLUE;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(130029600);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration4.stencil = 10;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration4.initialBackgroundColor = color8;
        int int10 = com.badlogic.gdx.graphics.Color.rgb888(color8);
        boolean boolean12 = color8.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.stencil = 10;
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration13.initialBackgroundColor = color17;
        com.badlogic.gdx.graphics.Color color23 = color17.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color24 = color8.mul(color23);
        com.badlogic.gdx.graphics.Color color26 = color23.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color23, 3);
        com.badlogic.gdx.graphics.Color color30 = color23.set((int) (short) 1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color30, (-40036));
        com.badlogic.gdx.graphics.Color color33 = color3.sub(color30);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color40 = color35.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color42 = color35.set(8);
        com.badlogic.gdx.graphics.Color color43 = color3.mul(color42);
        com.badlogic.gdx.graphics.Color color44 = color3.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color(color3);
        com.badlogic.gdx.graphics.Color color47 = color0.lerp(color45, (float) (-1430550));
        float float48 = color0.a;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color0, 1704604416);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 1.0f + "'", float48 == 1.0f);
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-284884992), 0.0f, (float) (-1216512000), (float) (-46648832));
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int11 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff80ff");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((-1.7013956E38f), (float) (-150339737), (float) 40704, (float) (-1778519256));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2137714688) + "'", int4 == (-2137714688));
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
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
        lwjgl3ApplicationConfiguration0.a = (-16033380);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3WindowListener12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-270575616), (-1.6473633E38f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        int int10 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int11 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        int int12 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.setwindowMinWidth(252);
        int int15 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 640 + "'", int10 == 640);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean3 = lwjgl3ApplicationConfiguration2.getdisableAudio();
        int int4 = lwjgl3ApplicationConfiguration2.gles30ContextMajorVersion;
        boolean boolean5 = lwjgl3ApplicationConfiguration2.vSyncEnabled;
        lwjgl3ApplicationConfiguration2.setAudioConfig((-2147418368), 650565, 11059605);
        lwjgl3ApplicationConfiguration2.windowResizable = true;
        lwjgl3ApplicationConfiguration2.setpreferencesDirectory("00b48cff");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener18;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode7;
        int int9 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(615183, (-2140996640), 9, 301989632, (-208), 49121, 7712224);
        com.badlogic.gdx.Files.FileType fileType18 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.b = 65536;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + fileType18 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType18.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration7.windowResizable = false;
        boolean boolean10 = lwjgl3ApplicationConfiguration7.getdisableAudio();
        lwjgl3ApplicationConfiguration7.title = "0001e000";
        lwjgl3ApplicationConfiguration7.setpreferencesDirectory("00000020");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-3456), (-1.4805586E-33f), (float) 1055, (float) 15);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6186856E38f) + "'", float4 == (-1.6186856E38f));
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-1778519256), 0.003921569f, (float) (-6168960), (float) (-1107701632));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1480550400) + "'", int4 == (-1480550400));
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, (float) 16711425, (float) (-497025568), (float) (-16730996));
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
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
        lwjgl3ApplicationConfiguration7.g = 34680;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.depth = 100;
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int8 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-256);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode11);
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(10);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
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
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.stencil = 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode21 = lwjgl3ApplicationConfiguration18.fullscreenMode;
        lwjgl3ApplicationConfiguration18.title = "";
        com.badlogic.gdx.graphics.Color color24 = lwjgl3ApplicationConfiguration18.initialBackgroundColor;
        lwjgl3ApplicationConfiguration18.setTitle("d2b48cff");
        lwjgl3ApplicationConfiguration18.audioDeviceSimultaneousSources = 62445;
        com.badlogic.gdx.Files.FileType fileType29 = lwjgl3ApplicationConfiguration18.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ff008300", fileType29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode31 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-864551100);
        lwjgl3ApplicationConfiguration0.windowX = 653051;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 43371 + "'", int16 == 43371);
        org.junit.Assert.assertNull(lwjgl3DisplayMode21);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + fileType29 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType29.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3DisplayMode31);
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        java.lang.String str7 = lwjgl3ApplicationConfiguration6.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = null;
        lwjgl3ApplicationConfiguration6.fullscreenMode = lwjgl3DisplayMode8;
        int int10 = lwjgl3ApplicationConfiguration6.getwindowWidth();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 640 + "'", int10 == 640);
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(1.06321716E37f, (-5.435091E37f), (float) (-2305), (float) 16771616);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7014117E38f) + "'", float4 == (-1.7014117E38f));
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) -1);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color1, 65535);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 16777215;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color6 = color0.lerp((float) (byte) 10, (float) 1465382614, (float) 40664886, (float) (-1L), (float) (-2147413088));
        com.badlogic.gdx.graphics.Color color11 = color6.sub((float) (-8708864), (float) 1157627903, (float) (-2147451392), (float) (-1069547520));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-2144), 131072, 16738740, (-2147481728));
        int int20 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int21 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 640 + "'", int21 == 640);
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.depth = 100;
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int8 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.stencil = 10;
        int int12 = lwjgl3ApplicationConfiguration9.b;
        boolean boolean13 = lwjgl3ApplicationConfiguration9.vSyncEnabled;
        lwjgl3ApplicationConfiguration9.setResizable(true);
        lwjgl3ApplicationConfiguration9.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = lwjgl3ApplicationConfiguration9.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode18;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
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
        lwjgl3ApplicationConfiguration36.setwindowWidth((-59404));
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
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-65280));
        com.badlogic.gdx.graphics.Color color6 = color1.add((float) (-65280), (float) 16776961, (float) 63488, (float) (-16776961));
        float float7 = color6.a;
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType5;
        lwjgl3ApplicationConfiguration0.r = (-458762);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration0.setwindowWidth(65280);
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType5;
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = lwjgl3ApplicationConfiguration0.hdpiMode;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.r = (-28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.b = (-17796196);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener11;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int14 = lwjgl3ApplicationConfiguration13.getaudioDeviceBufferSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-10), (float) (-16580607), (float) (-13126704), (float) 537535241);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(862994742);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color9 = color4.sub(color7);
        color4.g = 61445;
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(131072);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color1, 48624);
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12312063 + "'", int4 == 12312063);
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        int int8 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        int int9 = lwjgl3ApplicationConfiguration7.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration7.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        int int12 = lwjgl3ApplicationConfiguration7.audioDeviceBufferSize;
        int int13 = lwjgl3ApplicationConfiguration7.windowHeight;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 480 + "'", int13 == 480);
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
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
        boolean boolean43 = lwjgl3ApplicationConfiguration0.windowDecorated;
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
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
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(33021);
        com.badlogic.gdx.graphics.Color color33 = color28.add(color32);
        com.badlogic.gdx.graphics.Color color34 = color33.clamp();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        lwjgl3ApplicationConfiguration1.audioDeviceBufferSize = 163200;
        lwjgl3ApplicationConfiguration1.setwindowResizable(true);
        int int14 = lwjgl3ApplicationConfiguration1.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = lwjgl3ApplicationConfiguration1.hdpiMode;
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferCount(49121);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration9.useOpenGL3(true, (-100466688), (-62876));
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration9.getpreferencesFileType();
        com.badlogic.gdx.Files.FileType fileType16 = lwjgl3ApplicationConfiguration9.preferencesFileType;
        lwjgl3ApplicationConfiguration9.setaudioDeviceBufferSize((-503316225));
        int int19 = lwjgl3ApplicationConfiguration9.getwindowMinWidth();
        lwjgl3ApplicationConfiguration9.setBackBufferConfig((-59404), 0, (-52320), 117436161, (-2013790208), 131, 4096);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType16 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType16.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-164075620), 65520, (-15196159), (-3792896));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-150997092) + "'", int4 == (-150997092));
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
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
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color20);
        int int22 = com.badlogic.gdx.graphics.Color.rgba8888(color20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (byte) 10;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-5543167), (float) 1L, (-7.733328E7f), (float) (-480788480));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2130771968) + "'", int4 == (-2130771968));
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
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
        lwjgl3ApplicationConfiguration12.setsamples(537535241);
        int int17 = lwjgl3ApplicationConfiguration12.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        lwjgl3ApplicationConfiguration12.useVsync(false);
        int int21 = lwjgl3ApplicationConfiguration12.windowMinHeight;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-4247562), 652800, 862994742, 13260);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-53258) + "'", int4 == (-53258));
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((-9.29437E37f), (float) (-5898496), (float) 2088192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1606230784 + "'", int3 == 1606230784);
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(65533, (-133934), 40664886, 20480);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6415963E38f) + "'", float4 == (-1.6415963E38f));
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-458762), (float) 1677721600, (float) 3309388, (float) (byte) 100);
        color4.b = (-4089);
        int int7 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        com.badlogic.gdx.graphics.Color color12 = color4.mul((float) (-52992), (-4.286638E37f), (-1.674149E38f), (-1.6983845E38f));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-251659777) + "'", int7 == (-251659777));
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
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
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-220), (-29852), (-32160), 16);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7013895E38f) + "'", float4 == (-1.7013895E38f));
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
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
        int int16 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration17.setpreferencesDirectory("ff7b0000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration10.setdisableAudio(false);
        lwjgl3ApplicationConfiguration10.windowMaxWidth = (-28);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        boolean boolean10 = lwjgl3ApplicationConfiguration1.vSyncEnabled;
        int int11 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration1.setwindowMinWidth(65535);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        int int17 = lwjgl3ApplicationConfiguration16.samples;
        lwjgl3ApplicationConfiguration16.setwindowY(9);
        lwjgl3ApplicationConfiguration16.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration16.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int26 = lwjgl3ApplicationConfiguration25.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType28 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration25.setPreferencesConfig("", fileType28);
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int33 = lwjgl3ApplicationConfiguration32.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = lwjgl3ApplicationConfiguration32.windowListener;
        int int36 = lwjgl3ApplicationConfiguration32.getsamples();
        com.badlogic.gdx.Files.FileType fileType37 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration32.preferencesFileType = fileType37;
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("hi!", fileType37);
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("", fileType37);
        java.lang.String str41 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        int int42 = lwjgl3ApplicationConfiguration1.samples;
        int int43 = lwjgl3ApplicationConfiguration1.g;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 512 + "'", int33 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration34);
        org.junit.Assert.assertNull(lwjgl3WindowListener35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + fileType37 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType37.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode3 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowWidth(267782144);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.title = "8304f664";
        org.junit.Assert.assertNull(lwjgl3DisplayMode3);
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 3, (-1.7014117E38f), (float) 3, (float) '#');
        int int5 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-16711681) + "'", int5 == (-16711681));
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((-1.5950217E38f), (float) 572710365, (float) 64799);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-31) + "'", int3 == (-31));
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-33584897), (float) 161902304, (float) (-92044800), (float) 7536639);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-256) + "'", int4 == (-256));
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(40664886);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-256);
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
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
        lwjgl3ApplicationConfiguration0.setwindowHeight((-2147413088));
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        int int18 = lwjgl3ApplicationConfiguration0.stencil;
        int int19 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (-497025568), (-1948738560), 862994742);
        boolean boolean27 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        int int30 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 640 + "'", int19 == 640);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1948738560) + "'", int30 == (-1948738560));
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        int int10 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.g = (-592316);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 640 + "'", int10 == 640);
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
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
        boolean boolean41 = lwjgl3ApplicationConfiguration1.getwindowResizable();
        lwjgl3ApplicationConfiguration1.useVsync(true);
        lwjgl3ApplicationConfiguration1.setTitle("8304f664");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ".prefs/" + "'", str40, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.setBackBufferConfig((-16580607), 163200, (-654724064), (-32), 0, (int) (byte) 1, 7680);
        lwjgl3ApplicationConfiguration1.vSyncEnabled = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        java.lang.String str7 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.useOpenGL3(false, 480, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.setgles30ContextMajorVersion((-16));
        lwjgl3ApplicationConfiguration1.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration1.windowListener = lwjgl3WindowListener17;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration7.setgles30ContextMinorVersion(8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration7.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration7.setAudioConfig((-7667072), (int) (short) -1, (-185651200));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
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
        lwjgl3ApplicationConfiguration10.setaudioDeviceBufferCount((-2320));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        int int10 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        int int11 = lwjgl3ApplicationConfiguration1.getdepth();
        int int12 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.preferencesDirectory = "ffffe0ff";
        boolean boolean15 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((-1.7007336E38f), (float) 64274, (float) 5959695, 0.0f);
        color20.r = 224;
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color20;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.getwindowY();
        int int7 = lwjgl3ApplicationConfiguration1.samples;
        int int8 = lwjgl3ApplicationConfiguration1.samples;
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration1.preferencesFileType;
        lwjgl3ApplicationConfiguration1.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration1.windowWidth = 16711935;
        lwjgl3ApplicationConfiguration1.setaudioDeviceBufferCount((-518062050));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
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
        int int17 = lwjgl3ApplicationConfiguration1.getwindowX();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-2130902528), (-2.12998554E9f), (float) 2113863936, (float) 63488);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-256) + "'", int4 == (-256));
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-2305), (-622910848), (-16640), (-1895829248));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7011781E38f) + "'", float4 == (-1.7011781E38f));
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
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
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.samples = (-458762);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(537535241);
        int int18 = lwjgl3ApplicationConfiguration0.windowX;
        int int19 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 765 + "'", int18 == 765);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        lwjgl3ApplicationConfiguration15.r = ' ';
        lwjgl3ApplicationConfiguration15.windowResizable = false;
        int int20 = lwjgl3ApplicationConfiguration15.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.stencil = 10;
        int int24 = lwjgl3ApplicationConfiguration21.depth;
        int int25 = lwjgl3ApplicationConfiguration21.stencil;
        int int26 = lwjgl3ApplicationConfiguration21.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = null;
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration21.hdpiMode = hdpiMode29;
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode29);
        boolean boolean33 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.title = "830000ff";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
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
        int int40 = lwjgl3ApplicationConfiguration0.g;
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
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
        lwjgl3ApplicationConfiguration0.stencil = (-438453248);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-535758336), (-1246176), 65533, (-1728));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-132608) + "'", int4 == (-132608));
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-16580607), (-5.435091E37f), (float) 250, (float) 61455);
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(100);
        int int2 = com.badlogic.gdx.graphics.Color.rgb565(color1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color1);
        float float4 = color1.g;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((int) 'a');
        lwjgl3ApplicationConfiguration1.a = (-233897984);
        lwjgl3ApplicationConfiguration1.setWindowPosition(5959909, (-16776704));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int6 = lwjgl3ApplicationConfiguration5.windowY;
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration5.initialBackgroundColor;
        int int8 = com.badlogic.gdx.graphics.Color.argb8888(color7);
        com.badlogic.gdx.graphics.Color color10 = color7.set(16777216);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(color7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33791 + "'", int8 == 33791);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
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
        lwjgl3ApplicationConfiguration0.title = "ff7b0000";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
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
        com.badlogic.gdx.graphics.Color color18 = lwjgl3ApplicationConfiguration1.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color23 = color21.mul((float) (-62876));
        color23.a = 16711680;
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
        com.badlogic.gdx.graphics.Color color48 = color45.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color color50 = color23.lerp(color48, (-1.5399916E-33f));
        com.badlogic.gdx.graphics.Color color55 = color50.sub((float) 16711935, (float) (short) 100, 0.0f, (-1.6947657E38f));
        com.badlogic.gdx.graphics.Color color56 = color18.mul(color50);
        com.badlogic.gdx.graphics.Color color58 = color18.mul((-1.7010254E38f));
        color58.b = 1677721600;
        float float61 = color58.toFloatBits();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color58, (-1430550));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + (-1.6947657E38f) + "'", float61 == (-1.6947657E38f));
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
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
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(33791);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration15.audioDeviceSimultaneousSources = (-2140996640);
        boolean boolean18 = lwjgl3ApplicationConfiguration15.disableAudio;
        int int19 = lwjgl3ApplicationConfiguration15.b;
        lwjgl3ApplicationConfiguration15.disableAudio(false);
        lwjgl3ApplicationConfiguration15.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration15.setWindowedMode(1174394321, (-307859744));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-1143431937), 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(51855);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, 52625);
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-10223606), (float) 65295, 0.0f, (float) (-164075620));
        java.lang.Class<?> wildcardClass5 = color4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        int int12 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.title;
        int int14 = lwjgl3ApplicationConfiguration0.a;
        int int15 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.setAudioConfig(509920, 863980544, 2);
        int int8 = lwjgl3ApplicationConfiguration1.windowMaxHeight;
        int int9 = lwjgl3ApplicationConfiguration1.a;
        int int10 = lwjgl3ApplicationConfiguration1.r;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        int int19 = lwjgl3ApplicationConfiguration16.depth;
        lwjgl3ApplicationConfiguration16.windowX = (short) 100;
        lwjgl3ApplicationConfiguration16.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        int int26 = lwjgl3ApplicationConfiguration25.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration25.useOpenGL3(true, (-100466688), (-62876));
        lwjgl3ApplicationConfiguration25.setwindowHeight((-1077952513));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = lwjgl3ApplicationConfiguration25.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int43 = lwjgl3ApplicationConfiguration34.gles30ContextMajorVersion;
        int int44 = lwjgl3ApplicationConfiguration34.getgles30ContextMajorVersion();
        int int45 = lwjgl3ApplicationConfiguration34.getsamples();
        lwjgl3ApplicationConfiguration34.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration34.r = 65280;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration51.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration51.setwindowResizable(false);
        lwjgl3ApplicationConfiguration51.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration51.gles30ContextMajorVersion = 0;
        int int66 = lwjgl3ApplicationConfiguration51.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration67 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration51);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration68.stencil = 10;
        int int71 = lwjgl3ApplicationConfiguration68.depth;
        lwjgl3ApplicationConfiguration68.windowX = (short) 100;
        lwjgl3ApplicationConfiguration68.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType77 = lwjgl3ApplicationConfiguration68.getpreferencesFileType();
        int int78 = lwjgl3ApplicationConfiguration68.getwindowY();
        lwjgl3ApplicationConfiguration68.samples = 512;
        com.badlogic.gdx.graphics.Color color81 = lwjgl3ApplicationConfiguration68.initialBackgroundColor;
        int int82 = lwjgl3ApplicationConfiguration68.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode83 = lwjgl3ApplicationConfiguration68.hdpiMode;
        lwjgl3ApplicationConfiguration67.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode83);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
        org.junit.Assert.assertNull(lwjgl3WindowListener33);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration50);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 16 + "'", int71 == 16);
        org.junit.Assert.assertTrue("'" + fileType77 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType77.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertNotNull(color81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 3 + "'", int82 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode83 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode83.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-32));
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color20 = color15.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        int int21 = com.badlogic.gdx.graphics.Color.argb8888(color15);
        int int22 = com.badlogic.gdx.graphics.Color.rgb565(color15);
        float float23 = color15.a;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-16711936) + "'", int21 == (-16711936));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2016 + "'", int22 == 2016);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxWidth = (short) -1;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-185651200), (-537010321));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1465382614, (int) ' ');
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 40664886;
        int int20 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.title = "d2b48cff";
        int int23 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setAudioConfig(1621098495, (-12), (-227328));
        lwjgl3ApplicationConfiguration0.setdepth(0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
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
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setwindowHeight((-57871));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
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
        boolean boolean45 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        lwjgl3ApplicationConfiguration1.setWindowPosition(100, (-569376768));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(234);
        float float2 = color1.toFloatBits();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.8685626E25f) + "'", float2 == (-3.8685626E25f));
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
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
        int int39 = com.badlogic.gdx.graphics.Color.argb8888(color17);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 33791 + "'", int39 == 33791);
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(32767, (-5375136), (-134217944), (-3792896), 0, (-3232), 16771616);
        int int19 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(1619023104);
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.getwindowY();
        int int7 = lwjgl3ApplicationConfiguration1.samples;
        int int8 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowDecorated(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration1.getwindowDecorated();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(579543807, 5, (-116), (-1905328384));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7395329) + "'", int4 == (-7395329));
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
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
        lwjgl3ApplicationConfiguration0.setdepth((-164075620));
        lwjgl3ApplicationConfiguration0.b = (-1948738560);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((float) 2550, (float) (-503341578), (float) 1671172080, (-5.875603E37f));
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color24);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color25;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setTitle("");
        int int7 = lwjgl3ApplicationConfiguration1.windowMinHeight;
        lwjgl3ApplicationConfiguration1.disableAudio = true;
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (-16654816);
        lwjgl3ApplicationConfiguration1.r = (-4090624);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
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
        lwjgl3ApplicationConfiguration0.setTitle("827d0100");
        lwjgl3ApplicationConfiguration0.setWindowedMode((-7462090), (-1445928036));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color2 = color1.clamp();
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((float) (short) -1, (float) (-40036), 0.98039216f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color8 = color1.add(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color13 = color11.mul((float) (-62876));
        color13.a = 16711680;
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
        com.badlogic.gdx.graphics.Color color38 = color35.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color color40 = color13.lerp(color38, (-1.5399916E-33f));
        com.badlogic.gdx.graphics.Color color42 = color8.lerp(color13, (float) 862994742);
        float float43 = color42.g;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
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
        int int15 = lwjgl3ApplicationConfiguration10.windowY;
        boolean boolean16 = lwjgl3ApplicationConfiguration10.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener17);
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.depth = 0;
        lwjgl3ApplicationConfiguration0.windowMinHeight = 1610676736;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode11;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-36));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9180) + "'", int1 == (-9180));
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode7;
        lwjgl3ApplicationConfiguration0.b = 401539072;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SKY;
        color0.g = 0L;
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color((-2147481728));
        com.badlogic.gdx.graphics.Color color11 = color5.lerp((float) (byte) 10, (float) 16711680, (float) (short) 0, (float) 224, (-1.7013599E38f));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration12.setwindowResizable(false);
        int int23 = lwjgl3ApplicationConfiguration12.gles30ContextMajorVersion;
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
        com.badlogic.gdx.graphics.Color color45 = color43.premultiplyAlpha();
        color43.g = 537535241;
        lwjgl3ApplicationConfiguration12.initialBackgroundColor = color43;
        int int49 = color43.toIntBits();
        com.badlogic.gdx.graphics.Color color51 = color11.lerp(color43, (-5.435091E37f));
        com.badlogic.gdx.graphics.Color color52 = color3.set(color11);
        com.badlogic.gdx.graphics.Color color53 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color54 = new com.badlogic.gdx.graphics.Color();
        int int55 = color54.toIntBits();
        int int56 = com.badlogic.gdx.graphics.Color.rgba4444(color54);
        com.badlogic.gdx.graphics.Color color58 = color53.lerp(color54, 0.0f);
        com.badlogic.gdx.graphics.Color color59 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.graphics.Color color60 = color54.sub(color59);
        com.badlogic.gdx.graphics.Color color61 = new com.badlogic.gdx.graphics.Color(color60);
        int int62 = com.badlogic.gdx.graphics.Color.rgba8888(color60);
        com.badlogic.gdx.graphics.Color color63 = color3.add(color60);
        float float64 = color3.g;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-256) + "'", int49 == (-256));
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration1.samples = (byte) -1;
        boolean boolean6 = lwjgl3ApplicationConfiguration1.getuseGL30();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
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
        lwjgl3ApplicationConfiguration0.setwindowHeight((-2147413088));
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        int int18 = lwjgl3ApplicationConfiguration0.stencil;
        int int19 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (-497025568), (-1948738560), 862994742);
        int int27 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 640 + "'", int19 == 640);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        int int10 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-17796196));
        int int15 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        int int16 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
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
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.stencil = 10;
        int int37 = lwjgl3ApplicationConfiguration34.depth;
        lwjgl3ApplicationConfiguration34.windowX = (short) 100;
        lwjgl3ApplicationConfiguration34.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType43 = lwjgl3ApplicationConfiguration34.getpreferencesFileType();
        int int44 = lwjgl3ApplicationConfiguration34.getwindowY();
        lwjgl3ApplicationConfiguration34.samples = 512;
        com.badlogic.gdx.graphics.Color color47 = lwjgl3ApplicationConfiguration34.initialBackgroundColor;
        int int48 = color47.toIntBits();
        com.badlogic.gdx.graphics.Color color49 = color33.mul(color47);
        com.badlogic.gdx.graphics.Color color51 = color33.set((-271));
        int int52 = com.badlogic.gdx.graphics.Color.rgb888(color51);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 16 + "'", int37 == 16);
        org.junit.Assert.assertTrue("'" + fileType43 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType43.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(color47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 12991 + "'", int48 == 12991);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 16777214 + "'", int52 == 16777214);
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-7798785));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode11;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1465382614, (int) ' ');
        int int18 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 0;
        lwjgl3ApplicationConfiguration0.setwindowWidth(16738740);
        lwjgl3ApplicationConfiguration0.windowMinWidth = (-36880);
        boolean boolean25 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int26 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        int int29 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1929379839, (float) (-2147420160), (float) 17392, (float) 65295);
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-65536), 63519);
        lwjgl3ApplicationConfiguration0.windowY = 626699475;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
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
        lwjgl3ApplicationConfiguration0.setdepth(16777216);
        com.badlogic.gdx.Files.FileType fileType46 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-569376768));
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
        org.junit.Assert.assertTrue("'" + fileType46 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType46.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = color4.mul((float) (-214280192));
        int int13 = com.badlogic.gdx.graphics.Color.rgba4444(color4);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        lwjgl3ApplicationConfiguration0.windowMinHeight = 0;
        int int10 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration12.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration0.b = (-52320);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-65), (-92044800), (-548854), (-905969664));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        int int5 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setsamples((-545421065));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration8.windowWidth = 65534;
        lwjgl3ApplicationConfiguration8.title = "ffa5ff00";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 640 + "'", int5 == 640);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-648224), (int) (short) 1, (-1049600), 2046, 512, (-5376), 16439278);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.stencil = 10;
        int int21 = lwjgl3ApplicationConfiguration18.depth;
        lwjgl3ApplicationConfiguration18.windowX = (short) 100;
        lwjgl3ApplicationConfiguration18.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType27 = lwjgl3ApplicationConfiguration18.getpreferencesFileType();
        lwjgl3ApplicationConfiguration18.setaudioDeviceBufferCount((int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = lwjgl3ApplicationConfiguration18.windowListener;
        lwjgl3ApplicationConfiguration18.windowWidth = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration33);
        lwjgl3ApplicationConfiguration34.setWindowPosition((int) (short) 10, 10);
        boolean boolean38 = lwjgl3ApplicationConfiguration34.useGL30;
        com.badlogic.gdx.Files.FileType fileType39 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration34.setpreferencesFileType(fileType39);
        lwjgl3ApplicationConfiguration34.g = 100;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration43);
        lwjgl3ApplicationConfiguration44.r = ' ';
        boolean boolean47 = lwjgl3ApplicationConfiguration44.getuseGL30();
        lwjgl3ApplicationConfiguration44.useGL30 = false;
        lwjgl3ApplicationConfiguration44.windowMaxHeight = (-256);
        lwjgl3ApplicationConfiguration44.audioDeviceBufferCount = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration54.stencil = 10;
        int int57 = lwjgl3ApplicationConfiguration54.depth;
        boolean boolean58 = lwjgl3ApplicationConfiguration54.vSyncEnabled;
        lwjgl3ApplicationConfiguration54.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode61 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration54.hdpiMode = hdpiMode61;
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration34.hdpiMode = hdpiMode61;
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode61;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00ffffff";
        lwjgl3ApplicationConfiguration0.setTitle("ffffff00");
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int73 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3WindowListener30);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + fileType39 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType39.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 16 + "'", int57 == 16);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode61 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode61.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1671024128), (-1.6997759E38f), (float) (-63457), 2.3418052E-38f);
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
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
        lwjgl3ApplicationConfiguration1.windowHeight = 100;
        int int20 = lwjgl3ApplicationConfiguration1.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion((-40036));
        boolean boolean23 = lwjgl3ApplicationConfiguration1.disableAudio;
        int int24 = lwjgl3ApplicationConfiguration1.r;
        lwjgl3ApplicationConfiguration1.windowMinWidth = (-6168960);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1621098495 + "'", int20 == 1621098495);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration9.setWindowSizeLimits((-16), (-256), (-16777216), 0);
        com.badlogic.gdx.graphics.Color color16 = lwjgl3ApplicationConfiguration9.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) '#', (float) (-16580607), (float) (-40036), (float) 2);
        com.badlogic.gdx.graphics.Color color6 = color4.set(863980544);
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.GOLD;
        color7.r = 'a';
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color12 = color4.set(color7);
        color7.b = (-4628480);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 100);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        lwjgl3ApplicationConfiguration1.setResizable(true);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferSize = 862994742;
        int int10 = lwjgl3ApplicationConfiguration1.r;
        int int11 = lwjgl3ApplicationConfiguration1.windowMaxWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources(0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setdepth((-4227072));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((-5.0593836E30f), (float) (-1504), 6.152978E-39f, (float) (-16777116));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1512046592) + "'", int4 == (-1512046592));
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
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
        lwjgl3ApplicationConfiguration7.setdisableAudio(false);
        boolean boolean23 = lwjgl3ApplicationConfiguration7.windowResizable;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
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
        com.badlogic.gdx.graphics.Color color58 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color60 = color58.mul((float) (byte) 1);
        com.badlogic.gdx.graphics.Color color65 = color58.mul((float) 765, (float) (byte) -1, (float) (short) 100, (float) 100);
        com.badlogic.gdx.graphics.Color color67 = color65.mul((-1.7014117E38f));
        color67.r = (-8.952473E30f);
        com.badlogic.gdx.graphics.Color color70 = color56.add(color67);
        com.badlogic.gdx.graphics.Color color71 = com.badlogic.gdx.graphics.Color.GOLD;
        color71.r = 'a';
        com.badlogic.gdx.graphics.Color color74 = new com.badlogic.gdx.graphics.Color(color71);
        com.badlogic.gdx.graphics.Color color75 = new com.badlogic.gdx.graphics.Color(color74);
        com.badlogic.gdx.graphics.Color color76 = new com.badlogic.gdx.graphics.Color(color74);
        com.badlogic.gdx.graphics.Color color81 = color76.mul((float) 3855, (-1.648194E38f), (float) (-16711681), 6.1897002E29f);
        com.badlogic.gdx.graphics.Color color83 = color67.lerp(color81, (float) 50331648);
        float float84 = color83.r;
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
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertNotNull(color70);
        org.junit.Assert.assertNotNull(color71);
        org.junit.Assert.assertNotNull(color81);
        org.junit.Assert.assertNotNull(color83);
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 1.0f + "'", float84 == 1.0f);
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-16320), (float) 63456, (-4.2535296E37f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1564672) + "'", int3 == (-1564672));
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 0, (float) 2550, (float) (-138042720), 0.0f);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-1216));
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        int int9 = lwjgl3ApplicationConfiguration0.r;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowX = (-1049600);
        lwjgl3ApplicationConfiguration0.samples = (-53258);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((-1.4967834E38f), 0.516129f, (-1.7013899E38f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2147450112) + "'", int3 == (-2147450112));
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration7.getwindowResizable();
        boolean boolean9 = lwjgl3ApplicationConfiguration7.getvSyncEnabled();
        int int10 = lwjgl3ApplicationConfiguration7.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = ' ';
        int int12 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.a = (-1);
        int int4 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(130029600);
        lwjgl3ApplicationConfiguration0.windowMinWidth = 33791;
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) 33791, (float) (-16777085), (float) (-3060), (float) 16751871);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
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
        lwjgl3ApplicationConfiguration0.samples = 16769311;
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
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
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
        int int19 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.b = 704;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        lwjgl3ApplicationConfiguration0.b = (-100466688);
        lwjgl3ApplicationConfiguration0.a = (-1948738560);
        lwjgl3ApplicationConfiguration0.g = (-2147418368);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        int int14 = lwjgl3ApplicationConfiguration11.b;
        boolean boolean15 = lwjgl3ApplicationConfiguration11.vSyncEnabled;
        lwjgl3ApplicationConfiguration11.setuseGL30(false);
        int int18 = lwjgl3ApplicationConfiguration11.getwindowY();
        int int19 = lwjgl3ApplicationConfiguration11.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration11.setdisableAudio(true);
        int int22 = lwjgl3ApplicationConfiguration11.windowWidth;
        int int23 = lwjgl3ApplicationConfiguration11.getwindowY();
        int int24 = lwjgl3ApplicationConfiguration11.getgles30ContextMajorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        int int28 = lwjgl3ApplicationConfiguration25.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = null;
        lwjgl3ApplicationConfiguration25.hdpiMode = hdpiMode29;
        lwjgl3ApplicationConfiguration25.gles30ContextMajorVersion = 8;
        lwjgl3ApplicationConfiguration25.setwindowX(1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration37.stencil = 10;
        int int40 = lwjgl3ApplicationConfiguration37.depth;
        lwjgl3ApplicationConfiguration37.windowX = (short) 100;
        lwjgl3ApplicationConfiguration37.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType46 = lwjgl3ApplicationConfiguration37.getpreferencesFileType();
        int int47 = lwjgl3ApplicationConfiguration37.getwindowY();
        lwjgl3ApplicationConfiguration37.windowDecorated = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration51);
        lwjgl3ApplicationConfiguration52.setWindowPosition((int) (short) 10, 10);
        boolean boolean56 = lwjgl3ApplicationConfiguration52.useGL30;
        com.badlogic.gdx.Files.FileType fileType57 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration52.setpreferencesFileType(fileType57);
        com.badlogic.gdx.Files.FileType fileType59 = lwjgl3ApplicationConfiguration52.getpreferencesFileType();
        lwjgl3ApplicationConfiguration37.setPreferencesConfig("", fileType59);
        lwjgl3ApplicationConfiguration35.setPreferencesConfig("ff000000", fileType59);
        lwjgl3ApplicationConfiguration11.preferencesFileType = fileType59;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType59);
        java.lang.String str64 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 640 + "'", int22 == 640);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 16 + "'", int40 == 16);
        org.junit.Assert.assertTrue("'" + fileType46 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType46.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + fileType57 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType57.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType59 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType59.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        java.lang.String str5 = lwjgl3ApplicationConfiguration0.title;
        int int6 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".prefs/" + "'", str4, ".prefs/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-243732465), (float) (short) -1, (float) (-2137691648), (float) 117436161);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3840) + "'", int4 == (-3840));
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) 18005600);
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration5);
        lwjgl3ApplicationConfiguration6.r = ' ';
        lwjgl3ApplicationConfiguration6.windowResizable = false;
        int int11 = lwjgl3ApplicationConfiguration6.windowX;
        lwjgl3ApplicationConfiguration6.setResizable(true);
        lwjgl3ApplicationConfiguration6.windowMinWidth = (-654724064);
        boolean boolean16 = color1.equals((java.lang.Object) (-654724064));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-65536) + "'", int4 == (-65536));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-1536), (-8257792), 1157627903, 1522259828);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7012561E38f) + "'", float4 == (-1.7012561E38f));
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-16730996));
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(1090519033);
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 8616705, (float) (-1248), (float) (-1073807540), (float) (-2096826780));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7014117E38f) + "'", float4 == (-1.7014117E38f));
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        int int10 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
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
        int int15 = lwjgl3ApplicationConfiguration0.g;
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-8453888);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
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
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(16754175);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color4.lerp(color12, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color14, (-545421065));
        color14.a = 1L;
        com.badlogic.gdx.graphics.Color color23 = color14.mul(0.0f, (float) 34816, (-1.7014086E38f), (float) (-548854));
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((-1245052928));
        boolean boolean26 = color23.equals((java.lang.Object) (-1245052928));
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        boolean boolean8 = color4.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color4, (int) (byte) 0);
        color4.a = 16711935;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.stencil = 10;
        int int16 = lwjgl3ApplicationConfiguration13.depth;
        int int17 = lwjgl3ApplicationConfiguration13.stencil;
        lwjgl3ApplicationConfiguration13.gles30ContextMajorVersion = (-16580607);
        boolean boolean20 = lwjgl3ApplicationConfiguration13.disableAudio;
        com.badlogic.gdx.graphics.Color color21 = lwjgl3ApplicationConfiguration13.initialBackgroundColor;
        color21.r = (-256);
        com.badlogic.gdx.graphics.Color color25 = color4.lerp(color21, (-1.7008689E38f));
        com.badlogic.gdx.graphics.Color color26 = color21.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color21, (-35651584));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
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
        boolean boolean23 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean24 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-14483712), (float) 1664640000, (float) (-11554560), (float) (-387200));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-38784) + "'", int4 == (-38784));
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        int int10 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.title = "ff000000";
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
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
        lwjgl3ApplicationConfiguration11.disableAudio(true);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ".prefs/" + "'", str35, ".prefs/");
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color6 = color1.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color12 = color1.mul((float) 16745216, (float) (-864551100), (float) (-13200330), (float) (-6168960));
        com.badlogic.gdx.graphics.Color color17 = color1.add((-1.7013956E38f), (float) (-2160), (float) (-1077936368), (float) (-321707263));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
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
        lwjgl3ApplicationConfiguration7.depth = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration18);
        com.badlogic.gdx.graphics.Color color20 = lwjgl3ApplicationConfiguration18.initialBackgroundColor;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(100);
        int int2 = com.badlogic.gdx.graphics.Color.rgb565(color1);
        com.badlogic.gdx.graphics.Color color7 = color1.sub((float) 63518, (float) 863980544, (float) 8616705, (float) (-151165028));
        com.badlogic.gdx.graphics.Color color9 = color1.mul((float) (-237));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.stencil = 10;
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration29.initialBackgroundColor = color33;
        int int35 = com.badlogic.gdx.graphics.Color.rgb888(color33);
        boolean boolean37 = color33.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.stencil = 10;
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration38.initialBackgroundColor = color42;
        com.badlogic.gdx.graphics.Color color48 = color42.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color49 = color33.mul(color48);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color33, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color52 = color28.add(color33);
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color54 = com.badlogic.gdx.graphics.Color.CLEAR;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color54, 32256);
        com.badlogic.gdx.graphics.Color color57 = color53.mul(color54);
        float float58 = color53.b;
        com.badlogic.gdx.graphics.Color color59 = color53.premultiplyAlpha();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 0.0f + "'", float58 == 0.0f);
        org.junit.Assert.assertNotNull(color59);
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setTitle("");
        lwjgl3ApplicationConfiguration1.disableAudio = false;
        lwjgl3ApplicationConfiguration1.depth = 50331648;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration11.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration11.vSyncEnabled = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setdisableAudio(false);
        lwjgl3ApplicationConfiguration1.title = ".prefs/";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = null;
        lwjgl3ApplicationConfiguration1.fullscreenMode = lwjgl3DisplayMode6;
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = (-548854);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = lwjgl3ApplicationConfiguration1.windowListener;
        lwjgl3ApplicationConfiguration1.useOpenGL3(true, 150929408, (-10188800));
        lwjgl3ApplicationConfiguration1.setDecorated(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNull(lwjgl3WindowListener11);
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((-1.7004772E38f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
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
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((-7555886));
        com.badlogic.gdx.graphics.Color color21 = color16.mul((-1.5399916E-33f), (float) 509920, (float) 512, (-1.0f));
        com.badlogic.gdx.graphics.Color color22 = color21.cpy();
        int int23 = com.badlogic.gdx.graphics.Color.rgb888(color22);
        com.badlogic.gdx.graphics.Color color24 = color12.mul(color22);
        int int25 = com.badlogic.gdx.graphics.Color.rgb888(color12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-16777216) + "'", int11 == (-16777216));
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 65535 + "'", int23 == 65535);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setTitle("");
        lwjgl3ApplicationConfiguration1.setAudioConfig((-10223606), (int) (byte) 0, (-16711936));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration11.setWindowPosition((-7555886), 863980544);
        lwjgl3ApplicationConfiguration11.b = 0;
        lwjgl3ApplicationConfiguration11.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration11.setgles30ContextMinorVersion(0);
        int int21 = lwjgl3ApplicationConfiguration11.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration11.setdisableAudio(false);
        int int24 = lwjgl3ApplicationConfiguration11.getwindowX();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10223606) + "'", int21 == (-10223606));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7555886) + "'", int24 == (-7555886));
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        int int24 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        float float1 = color0.r;
        com.badlogic.gdx.graphics.Color color2 = color0.premultiplyAlpha();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration3.stencil = 10;
        lwjgl3ApplicationConfiguration3.setwindowX((int) (short) 0);
        int int8 = lwjgl3ApplicationConfiguration3.getaudioDeviceBufferSize();
        int int9 = lwjgl3ApplicationConfiguration3.b;
        boolean boolean10 = lwjgl3ApplicationConfiguration3.getwindowResizable();
        lwjgl3ApplicationConfiguration3.audioDeviceSimultaneousSources = (short) -1;
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration3.initialBackgroundColor;
        float float14 = color13.b;
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color19, 16);
        color19.a = 0L;
        com.badlogic.gdx.graphics.Color color24 = color17.mul(color19);
        com.badlogic.gdx.graphics.Color color29 = color17.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color29, 33791);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color33 = color15.sub(color32);
        com.badlogic.gdx.graphics.Color color34 = color33.clamp();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color33, 63488);
        int int37 = com.badlogic.gdx.graphics.Color.rgba4444(color33);
        com.badlogic.gdx.graphics.Color color39 = color13.lerp(color33, (float) (-16580607));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color39, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color((float) (-10224128), (float) (-10223606), (float) 1, (float) 10);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color46, 0);
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
        com.badlogic.gdx.graphics.Color color71 = color68.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color68, 3);
        com.badlogic.gdx.graphics.Color color75 = color68.set((int) (short) 1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color75, (-40036));
        com.badlogic.gdx.graphics.Color color78 = color75.cpy();
        com.badlogic.gdx.graphics.Color color80 = color78.set((int) 'a');
        com.badlogic.gdx.graphics.Color color82 = color46.lerp(color78, (float) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration83 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration84 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration83);
        com.badlogic.gdx.graphics.Color color85 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color86 = new com.badlogic.gdx.graphics.Color(color85);
        lwjgl3ApplicationConfiguration83.setInitialBackgroundColor(color85);
        com.badlogic.gdx.graphics.Color color88 = color82.set(color85);
        com.badlogic.gdx.graphics.Color color89 = color39.add(color82);
        com.badlogic.gdx.graphics.Color color90 = color2.sub(color89);
        color90.a = 0.9647059f;
        com.badlogic.gdx.graphics.Color color93 = new com.badlogic.gdx.graphics.Color(color90);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(color13);
// flaky:         org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.516129f + "'", float14 == 0.516129f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 224 + "'", int37 == 224);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNotNull(color71);
        org.junit.Assert.assertNotNull(color75);
        org.junit.Assert.assertNotNull(color78);
        org.junit.Assert.assertNotNull(color80);
        org.junit.Assert.assertNotNull(color82);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration84);
        org.junit.Assert.assertNotNull(color85);
        org.junit.Assert.assertNotNull(color88);
        org.junit.Assert.assertNotNull(color89);
        org.junit.Assert.assertNotNull(color90);
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.useVsync(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        boolean boolean3 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-10));
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int7 = lwjgl3ApplicationConfiguration0.g;
        int int8 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode9 = lwjgl3ApplicationConfiguration0.hdpiMode;
        int int10 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode9 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode9.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        boolean boolean6 = lwjgl3ApplicationConfiguration5.getwindowResizable();
        int int7 = lwjgl3ApplicationConfiguration5.windowMinHeight;
        lwjgl3ApplicationConfiguration5.stencil = (-4090624);
        int int10 = lwjgl3ApplicationConfiguration5.b;
        int int11 = lwjgl3ApplicationConfiguration5.a;
        lwjgl3ApplicationConfiguration5.setWindowedMode(26180, (-10));
        lwjgl3ApplicationConfiguration5.stencil = (-2147099648);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
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
        lwjgl3ApplicationConfiguration11.useVsync(false);
        lwjgl3ApplicationConfiguration11.useGL30 = false;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.CORAL;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color9);
        int int11 = com.badlogic.gdx.graphics.Color.rgb565(color9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(color7);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 635295 + "'", int11 == 635295);
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("00000100");
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
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
        lwjgl3ApplicationConfiguration1.windowHeight = 100;
        int int20 = lwjgl3ApplicationConfiguration1.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion((-40036));
        boolean boolean23 = lwjgl3ApplicationConfiguration1.disableAudio;
        lwjgl3ApplicationConfiguration1.g = 97;
        java.lang.Class<?> wildcardClass26 = lwjgl3ApplicationConfiguration1.getClass();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1621098495 + "'", int20 == 1621098495);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        lwjgl3ApplicationConfiguration1.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration1.setTitle(".prefs/");
        lwjgl3ApplicationConfiguration1.g = (short) 10;
        int int12 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        boolean boolean13 = lwjgl3ApplicationConfiguration1.getdisableAudio();
        lwjgl3ApplicationConfiguration1.setwindowWidth((-8323073));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-415027232), (float) 65535, (float) 250, (float) 1090519295);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.6947917E38f) + "'", float4 == (-1.6947917E38f));
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        int int14 = lwjgl3ApplicationConfiguration11.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = null;
        lwjgl3ApplicationConfiguration11.hdpiMode = hdpiMode15;
        boolean boolean17 = lwjgl3ApplicationConfiguration11.getvSyncEnabled();
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.CORAL;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color18);
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
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color24);
        float float42 = color41.a;
        int int43 = com.badlogic.gdx.graphics.Color.argb8888(color41);
        com.badlogic.gdx.graphics.Color color44 = color41.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration45.stencil = 10;
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration45.initialBackgroundColor = color49;
        int int51 = com.badlogic.gdx.graphics.Color.rgb888(color49);
        boolean boolean53 = color49.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration54.stencil = 10;
        com.badlogic.gdx.graphics.Color color58 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration54.initialBackgroundColor = color58;
        com.badlogic.gdx.graphics.Color color64 = color58.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color65 = color49.mul(color64);
        com.badlogic.gdx.graphics.Color color67 = color64.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color64, 9);
        com.badlogic.gdx.graphics.Color color71 = color64.set((-4089));
        com.badlogic.gdx.graphics.Color color72 = color64.clamp();
        com.badlogic.gdx.graphics.Color color73 = color72.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color74 = new com.badlogic.gdx.graphics.Color(color72);
        com.badlogic.gdx.graphics.Color color76 = color44.lerp(color72, (float) (-255));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration77 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration77.stencil = 10;
        com.badlogic.gdx.graphics.Color color81 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration77.initialBackgroundColor = color81;
        lwjgl3ApplicationConfiguration77.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color85 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration77.initialBackgroundColor = color85;
        java.lang.String str87 = color85.toString();
        com.badlogic.gdx.graphics.Color color88 = color44.add(color85);
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color88);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color88;
        lwjgl3ApplicationConfiguration0.setTitle("00200000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertNotNull(color71);
        org.junit.Assert.assertNotNull(color72);
        org.junit.Assert.assertNotNull(color73);
        org.junit.Assert.assertNotNull(color76);
        org.junit.Assert.assertNotNull(color85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "9a330065" + "'", str87, "9a330065");
        org.junit.Assert.assertNotNull(color88);
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLACK;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((float) (short) 10, (float) 786400, (float) 7680, (float) 1953529918);
        com.badlogic.gdx.graphics.Color color7 = color0.mul(color6);
        com.badlogic.gdx.graphics.Color color12 = color7.mul((float) (-4628480), (float) (-8160), (float) (-60572), (-1.0f));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = 765;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 8, 0.0f, (float) 65535);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color16;
        com.badlogic.gdx.graphics.Color color18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color19 = color16.add(color18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        int int5 = lwjgl3ApplicationConfiguration1.samples;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SALMON;
        float float7 = color6.r;
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color6;
        lwjgl3ApplicationConfiguration1.setWindowedMode((int) (byte) 100, 130029600);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration1.fullscreenMode = lwjgl3DisplayMode12;
        int int14 = lwjgl3ApplicationConfiguration1.windowHeight;
        lwjgl3ApplicationConfiguration1.stencil = (-8440880);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 130029600 + "'", int14 == 130029600);
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
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
        int int18 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        int int19 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(230);
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
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
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-983040), (-12), 26180);
        lwjgl3ApplicationConfiguration0.setWindowPosition(16711927, 13260);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-5510160));
        com.badlogic.gdx.graphics.Color color6 = color1.set((float) 1090519033, (float) 16711918, (float) 301989632, (float) 132184352);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.samples = 6349110;
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.disableAudio;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.samples = 65535;
        lwjgl3ApplicationConfiguration0.r = 16777216;
        lwjgl3ApplicationConfiguration0.setwindowY(61455);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-53504);
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
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
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-307859744));
        lwjgl3ApplicationConfiguration0.setwindowX(7712224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowY(8925);
        lwjgl3ApplicationConfiguration0.g = 33791;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode15;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color21;
        lwjgl3ApplicationConfiguration17.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color25;
        boolean boolean27 = lwjgl3ApplicationConfiguration17.getwindowResizable();
        lwjgl3ApplicationConfiguration17.windowMinWidth = 509920;
        boolean boolean30 = lwjgl3ApplicationConfiguration17.disableAudio;
        int int31 = lwjgl3ApplicationConfiguration17.r;
        lwjgl3ApplicationConfiguration17.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration35.stencil = 10;
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration35.initialBackgroundColor = color39;
        lwjgl3ApplicationConfiguration35.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration35.initialBackgroundColor = color43;
        boolean boolean45 = lwjgl3ApplicationConfiguration35.getwindowResizable();
        lwjgl3ApplicationConfiguration35.windowMinWidth = 509920;
        boolean boolean48 = lwjgl3ApplicationConfiguration35.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration50.stencil = 10;
        int int53 = lwjgl3ApplicationConfiguration50.depth;
        int int54 = lwjgl3ApplicationConfiguration50.stencil;
        int int55 = lwjgl3ApplicationConfiguration50.getwindowY();
        lwjgl3ApplicationConfiguration50.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration50.setwindowMinWidth(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration60.stencil = 10;
        int int63 = lwjgl3ApplicationConfiguration60.b;
        boolean boolean64 = lwjgl3ApplicationConfiguration60.vSyncEnabled;
        lwjgl3ApplicationConfiguration60.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType67 = lwjgl3ApplicationConfiguration60.getpreferencesFileType();
        lwjgl3ApplicationConfiguration50.preferencesFileType = fileType67;
        lwjgl3ApplicationConfiguration35.setPreferencesConfig("hi!", fileType67);
        lwjgl3ApplicationConfiguration17.setPreferencesConfig("00000000", fileType67);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType67;
        lwjgl3ApplicationConfiguration0.windowMaxWidth = 1677721600;
        lwjgl3ApplicationConfiguration0.windowMinHeight = 32256;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration76 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 16 + "'", int53 == 16);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 8 + "'", int63 == 8);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + fileType67 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType67.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration76);
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        int int8 = lwjgl3ApplicationConfiguration0.windowY;
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
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
        int int27 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.windowMinWidth = 2080210944;
        int int30 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2080210944 + "'", int30 == 2080210944);
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
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
        boolean boolean23 = lwjgl3ApplicationConfiguration1.windowDecorated;
        int int24 = lwjgl3ApplicationConfiguration1.audioDeviceBufferSize;
        int int25 = lwjgl3ApplicationConfiguration1.windowHeight;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1077952513) + "'", int24 == (-1077952513));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 480 + "'", int25 == 480);
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 26180, (float) (-241208591), (-1.6997759E38f), (float) 2135687168);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-7.638613E37f) + "'", float4 == (-7.638613E37f));
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
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
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setwindowY((-16838768));
        boolean boolean18 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-1629421568), (float) (-848128), (float) (-1929445376), (float) 13260);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-248276940) + "'", int4 == (-248276940));
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setsamples((-1077952513));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration10.gles30ContextMajorVersion = 25500;
        lwjgl3ApplicationConfiguration10.windowMinWidth = 4080;
        int int16 = lwjgl3ApplicationConfiguration10.windowMinWidth;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4080 + "'", int16 == 4080);
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-541344));
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int13 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setwindowY(163200);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        int int18 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
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
        int int16 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
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
        int int21 = lwjgl3ApplicationConfiguration20.depth;
        int int22 = lwjgl3ApplicationConfiguration20.windowHeight;
        lwjgl3ApplicationConfiguration20.setWindowSizeLimits(653051, (-1087242240), (-241208591), 1519722240);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 480 + "'", int22 == 480);
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.a = 862994742;
        lwjgl3ApplicationConfiguration0.setWindowedMode((-4089), (-622910848));
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode11;
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration1.windowX;
        lwjgl3ApplicationConfiguration1.setResizable(true);
        lwjgl3ApplicationConfiguration1.windowMinWidth = (-654724064);
        lwjgl3ApplicationConfiguration1.a = (-255);
        lwjgl3ApplicationConfiguration1.g = (-644874240);
        int int15 = lwjgl3ApplicationConfiguration1.g;
        lwjgl3ApplicationConfiguration1.r = (-67650272);
        int int18 = lwjgl3ApplicationConfiguration1.windowMinWidth;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-644874240) + "'", int15 == (-644874240));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-654724064) + "'", int18 == (-654724064));
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
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
        com.badlogic.gdx.graphics.Color color19 = color0.cpy();
        com.badlogic.gdx.graphics.Color color20 = color19.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color19, 254);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.windowHeight = (byte) 1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        int int14 = lwjgl3ApplicationConfiguration11.depth;
        lwjgl3ApplicationConfiguration11.windowX = (short) 100;
        lwjgl3ApplicationConfiguration11.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration11.getpreferencesFileType();
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("ff000000", fileType20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration1.windowListener = lwjgl3WindowListener22;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration24);
        int int26 = lwjgl3ApplicationConfiguration25.samples;
        lwjgl3ApplicationConfiguration25.setwindowY(9);
        lwjgl3ApplicationConfiguration25.setWindowPosition(1465382614, (int) '#');
        lwjgl3ApplicationConfiguration25.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int35 = lwjgl3ApplicationConfiguration34.audioDeviceBufferSize;
        com.badlogic.gdx.Files.FileType fileType37 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("", fileType37);
        lwjgl3ApplicationConfiguration25.setpreferencesFileType(fileType37);
        lwjgl3ApplicationConfiguration25.windowY = (byte) -1;
        int int42 = lwjgl3ApplicationConfiguration25.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration25.title = "00ffff00";
        com.badlogic.gdx.Files.FileType fileType45 = lwjgl3ApplicationConfiguration25.preferencesFileType;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType45);
        int int47 = lwjgl3ApplicationConfiguration1.getgles30ContextMajorVersion();
        int int48 = lwjgl3ApplicationConfiguration1.depth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode49 = lwjgl3ApplicationConfiguration1.hdpiMode;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 512 + "'", int35 == 512);
        org.junit.Assert.assertTrue("'" + fileType37 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType37.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + fileType45 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType45.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 16 + "'", int48 == 16);
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) '4');
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (-100466688));
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        color4.a = (-15728640);
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        int int10 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((-497025568));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 640 + "'", int10 == 640);
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-65536) + "'", int2 == (-65536));
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-1463708416));
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) 401539072);
        com.badlogic.gdx.graphics.Color color8 = color3.add((float) (-864551100), (float) 15215850, (float) (-2865), (-1.7013899E38f));
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int5 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        int int8 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        java.lang.String str2 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        java.lang.String str5 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int8 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".prefs/" + "'", str2, ".prefs/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".prefs/" + "'", str5, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(2);
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
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
        java.lang.String str23 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.disableAudio(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ".prefs/" + "'", str23, ".prefs/");
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(753537263);
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(63232);
        float float2 = color1.r;
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-10223606));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration2.stencil = 10;
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration2.initialBackgroundColor = color6;
        com.badlogic.gdx.graphics.Color color12 = color6.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color16 = color6.lerp(color14, (float) 100L);
        com.badlogic.gdx.graphics.Color color18 = color1.lerp(color14, (-1.648194E38f));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.stencil = 10;
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration19.initialBackgroundColor = color23;
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color26 = color23.sub(color25);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration28.stencil = 10;
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration28.initialBackgroundColor = color32;
        com.badlogic.gdx.graphics.Color color38 = color32.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color42 = color32.lerp(color40, (float) 100L);
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        com.badlogic.gdx.graphics.Color color48 = color42.mul(color47);
        float float49 = color42.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration50.stencil = 10;
        com.badlogic.gdx.graphics.Color color54 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration50.initialBackgroundColor = color54;
        lwjgl3ApplicationConfiguration50.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color58 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration50.initialBackgroundColor = color58;
        lwjgl3ApplicationConfiguration50.g = 16711680;
        lwjgl3ApplicationConfiguration50.setpreferencesDirectory("");
        lwjgl3ApplicationConfiguration50.setResizable(true);
        boolean boolean66 = color42.equals((java.lang.Object) true);
        com.badlogic.gdx.graphics.Color color67 = color27.add(color42);
        float float68 = color27.g;
        com.badlogic.gdx.graphics.Color color69 = color1.mul(color27);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color27, (-2147418368));
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 1.0f + "'", float49 == 1.0f);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 1.0f + "'", float68 == 1.0f);
        org.junit.Assert.assertNotNull(color69);
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-65280));
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode9 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 16751871;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(lwjgl3DisplayMode9);
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.b = 6528502;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration1.hdpiMode;
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration1.initialBackgroundColor;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(0, 862994742, (-67095094), (-15728400));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.2880023E32f) + "'", float4 == (-1.2880023E32f));
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 16);
        com.badlogic.gdx.graphics.Color color9 = color1.lerp((float) (-8160), (float) 1677721600, (-1.4967834E38f), (-5.435091E37f), (-1.7013859E38f));
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        lwjgl3ApplicationConfiguration12.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration12.setFullscreenMode(displayMode16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        int int19 = lwjgl3ApplicationConfiguration18.audioDeviceBufferCount;
        int int20 = lwjgl3ApplicationConfiguration18.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration18.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration18.samples = (-5543167);
        lwjgl3ApplicationConfiguration18.disableAudio(false);
        boolean boolean27 = color10.equals((java.lang.Object) lwjgl3ApplicationConfiguration18);
        com.badlogic.gdx.graphics.Color color28 = color10.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color28, (-589825));
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
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
        int int18 = lwjgl3ApplicationConfiguration10.a;
        lwjgl3ApplicationConfiguration10.setdepth((-2144));
        int int21 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration10.disableAudio = false;
        lwjgl3ApplicationConfiguration10.setwindowResizable(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
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
        java.lang.String str25 = color23.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "00000000" + "'", str25, "00000000");
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
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
        int int14 = lwjgl3ApplicationConfiguration1.windowMinWidth;
        lwjgl3ApplicationConfiguration1.setwindowResizable(false);
        lwjgl3ApplicationConfiguration1.setTitle("00200000");
        lwjgl3ApplicationConfiguration1.b = (-6168960);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
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
        lwjgl3ApplicationConfiguration0.setwindowHeight((-2147413088));
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        int int18 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setwindowY(16777087);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (byte) 0, (-8.952473E30f), (float) (-10224128), (float) 6349110);
        int int5 = color4.toIntBits();
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color11 = color6.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        int int12 = com.badlogic.gdx.graphics.Color.argb8888(color6);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color6, 8925);
        com.badlogic.gdx.graphics.Color color19 = color6.sub((float) 167772160, (float) (-100466688), (float) 0, (float) (-164075620));
        com.badlogic.gdx.graphics.Color color20 = color4.mul(color19);
        com.badlogic.gdx.graphics.Color color25 = color20.set(0.0f, 1.0f, (float) 2147418367, (float) (-9728477));
        int int26 = com.badlogic.gdx.graphics.Color.rgba4444(color20);
        com.badlogic.gdx.graphics.Color color28 = color20.mul(0.9843137f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-16777216) + "'", int5 == (-16777216));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-16711936) + "'", int12 == (-16711936));
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4080 + "'", int26 == 4080);
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
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
        int int14 = lwjgl3ApplicationConfiguration11.getwindowX();
        int int15 = lwjgl3ApplicationConfiguration11.gles30ContextMajorVersion;
        int int16 = lwjgl3ApplicationConfiguration11.windowY;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig(988257285, 2097152, (-1233169392));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType5;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-7555886);
        lwjgl3ApplicationConfiguration0.g = (-551618560);
        lwjgl3ApplicationConfiguration0.stencil = (-5543167);
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        lwjgl3ApplicationConfiguration0.a = 3;
        com.badlogic.gdx.graphics.Color color8 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
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
        com.badlogic.gdx.graphics.Color color31 = color29.premultiplyAlpha();
        color29.g = 537535241;
        com.badlogic.gdx.graphics.Color color38 = color29.mul(2.3509886E-38f, (float) 100, (float) (-2147483648), (float) (-65025));
        com.badlogic.gdx.graphics.Color color39 = color29.cpy();
        boolean boolean40 = color8.equals((java.lang.Object) color29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
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
        color67.b = (-9.29437E37f);
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
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-1396305920), (-5465700), 0, 150929408);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1394631680) + "'", int4 == (-1394631680));
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-250674975), (float) 5959909);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1519776768 + "'", int2 == 1519776768);
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(59670);
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
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
        boolean boolean35 = lwjgl3ApplicationConfiguration0.getuseGL30();
        boolean boolean36 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int7 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int11 = lwjgl3ApplicationConfiguration0.r;
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
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
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int48 = lwjgl3ApplicationConfiguration0.samples;
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.MAROON;
        java.lang.String str1 = color0.toString();
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color0);
        color0.b = (-2.5901116E33f);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ff000000" + "'", str1, "ff000000");
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
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
        int int19 = lwjgl3ApplicationConfiguration0.a;
        int int20 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.windowHeight = (-12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + fileType17 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType17.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.samples = (short) -1;
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 65536;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-16252195));
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int18 = lwjgl3ApplicationConfiguration17.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = lwjgl3ApplicationConfiguration17.windowListener;
        int int21 = lwjgl3ApplicationConfiguration17.getsamples();
        com.badlogic.gdx.Files.FileType fileType22 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration17.preferencesFileType = fileType22;
        lwjgl3ApplicationConfiguration1.setPreferencesConfig("hi!", fileType22);
        lwjgl3ApplicationConfiguration1.setWindowedMode((-164075620), 39951);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
        org.junit.Assert.assertNull(lwjgl3WindowListener20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + fileType22 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType22.equals(com.badlogic.gdx.Files.FileType.Internal));
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-150997092), (-214280192), (-151), (-7937));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.701194E38f) + "'", float4 == (-1.701194E38f));
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(777825, 65504, (-149950464), 234);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-83886495) + "'", int4 == (-83886495));
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
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
        float float19 = color18.toFloatBits();
        com.badlogic.gdx.graphics.Color color24 = color18.mul((-1.7013956E38f), (float) (-2140955648), (float) 64274, (float) (-384));
        float float25 = color24.g;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-0.0f) + "'", float25 == (-0.0f));
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(862994742);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color15 = color10.lerp(color12, (float) (-5543167));
        com.badlogic.gdx.graphics.Color color16 = color15.cpy();
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.stencil = 10;
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration18.initialBackgroundColor = color22;
        com.badlogic.gdx.graphics.Color color28 = color22.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color32 = color22.lerp(color30, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color32, (-545421065));
        color32.a = 1L;
        com.badlogic.gdx.graphics.Color color41 = color32.mul((float) (-10223606), (float) (-40036), (float) 100, (float) (-16711681));
        com.badlogic.gdx.graphics.Color color46 = color32.sub((float) (-864551100), (float) 1L, (float) 'a', (float) (-16711936));
        com.badlogic.gdx.graphics.Color color48 = color17.lerp(color32, (float) (byte) 0);
        float float49 = color17.toFloatBits();
        com.badlogic.gdx.graphics.Color color54 = color17.mul((float) 16777087, (float) (-1049600), (float) (-1), (float) (-14483712));
        com.badlogic.gdx.graphics.Color color55 = color15.add(color54);
        com.badlogic.gdx.graphics.Color color56 = color55.clamp();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color48);
// flaky:         org.junit.Assert.assertTrue("'" + float49 + "' != '" + 3.57E-43f + "'", float49 == 3.57E-43f);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color56);
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        int int8 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int11 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        int int12 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-2147418368));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration2.getwindowY();
        int int4 = lwjgl3ApplicationConfiguration2.audioDeviceBufferCount;
        java.lang.String str5 = lwjgl3ApplicationConfiguration2.preferencesDirectory;
        lwjgl3ApplicationConfiguration2.setvSyncEnabled(false);
        int int8 = lwjgl3ApplicationConfiguration2.getwindowMinWidth();
        int int9 = lwjgl3ApplicationConfiguration2.windowY;
        lwjgl3ApplicationConfiguration2.setgles30ContextMajorVersion(16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".prefs/" + "'", str5, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 16738740, 9.44502E21f, (float) (-16777116), (float) (-9));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7014117E38f) + "'", float4 == (-1.7014117E38f));
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-10));
        int int2 = com.badlogic.gdx.graphics.Color.rgba4444(color1);
        int int3 = com.badlogic.gdx.graphics.Color.rgb565(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65534 + "'", int2 == 65534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65535 + "'", int3 == 65535);
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
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
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color31, 43371);
        float float36 = color31.b;
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color(color31);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.3548387f + "'", float36 == 0.3548387f);
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean42 = lwjgl3ApplicationConfiguration41.getuseGL30();
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
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.samples = (-129024);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode16 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(lwjgl3DisplayMode16);
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-1.5172445E23f), (float) (-26), (float) (-151390720), (float) 16712191);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.5292872E38f) + "'", float4 == (-1.5292872E38f));
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration3.stencil = 10;
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration3.initialBackgroundColor = color7;
        int int9 = com.badlogic.gdx.graphics.Color.rgb888(color7);
        boolean boolean11 = color7.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.stencil = 10;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration12.initialBackgroundColor = color16;
        com.badlogic.gdx.graphics.Color color22 = color16.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color23 = color7.mul(color22);
        com.badlogic.gdx.graphics.Color color25 = color22.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color22, 3);
        com.badlogic.gdx.graphics.Color color29 = color22.set((int) (short) 1);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.graphics.Color color31 = color29.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color29, 16253056);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color31);
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.g = 16711680;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int13 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int14 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-654724064), (float) 862994742, 1.203045E-38f, 0.9411765f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-242) + "'", int4 == (-242));
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
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
        int int16 = lwjgl3ApplicationConfiguration0.r;
        int int17 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertNull(lwjgl3DisplayMode15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
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
        lwjgl3ApplicationConfiguration0.setwindowHeight((-2147413088));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.stencil = 10;
        int int18 = lwjgl3ApplicationConfiguration15.b;
        boolean boolean19 = lwjgl3ApplicationConfiguration15.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType20 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType20);
        int int22 = lwjgl3ApplicationConfiguration15.depth;
        lwjgl3ApplicationConfiguration15.windowX = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.stencil = 10;
        int int28 = lwjgl3ApplicationConfiguration25.b;
        boolean boolean29 = lwjgl3ApplicationConfiguration25.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType30 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration25.setpreferencesFileType(fileType30);
        com.badlogic.gdx.Files.FileType fileType32 = lwjgl3ApplicationConfiguration25.preferencesFileType;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType32);
        com.badlogic.gdx.Files.FileType fileType34 = lwjgl3ApplicationConfiguration15.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType34;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + fileType30 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType30.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + fileType34 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType34.equals(com.badlogic.gdx.Files.FileType.Absolute));
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
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
        int int12 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-6168960), (float) (-2865), (float) (-5510160));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8656) + "'", int3 == (-8656));
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) 65536, (float) 16711680, (float) (-1286733314), (-4.253659E37f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-65536) + "'", int4 == (-65536));
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.stencil = 10;
        int int19 = lwjgl3ApplicationConfiguration16.depth;
        int int20 = lwjgl3ApplicationConfiguration16.stencil;
        int int21 = lwjgl3ApplicationConfiguration16.getwindowY();
        lwjgl3ApplicationConfiguration16.setaudioDeviceSimultaneousSources((-1));
        lwjgl3ApplicationConfiguration16.windowHeight = (-255);
        int int26 = lwjgl3ApplicationConfiguration16.getwindowHeight();
        com.badlogic.gdx.Files.FileType fileType27 = lwjgl3ApplicationConfiguration16.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00ff00ff", fileType27);
        int int29 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int30 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-255) + "'", int26 == (-255));
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 640 + "'", int29 == 640);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
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
        java.lang.String str17 = lwjgl3ApplicationConfiguration16.getpreferencesDirectory();
        int int18 = lwjgl3ApplicationConfiguration16.getdepth();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".prefs/" + "'", str17, ".prefs/");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.getwindowY();
        lwjgl3ApplicationConfiguration1.useOpenGL3(true, 640, 1465382614);
        lwjgl3ApplicationConfiguration1.a = (-10223606);
        int int13 = lwjgl3ApplicationConfiguration1.windowY;
        int int14 = lwjgl3ApplicationConfiguration1.getdepth();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int9 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.windowHeight = (-545421065);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(63518);
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.g = 63456;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ff00000a";
        int int21 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(lwjgl3DisplayMode10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 63518 + "'", int16 == 63518);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) (-62876));
        color3.a = 16711680;
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color3);
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
        int int32 = com.badlogic.gdx.graphics.Color.rgb565(color26);
        com.badlogic.gdx.graphics.Color color33 = color3.set(color26);
        com.badlogic.gdx.graphics.Color color34 = com.badlogic.gdx.graphics.Color.TEAL;
        color34.g = 1;
        com.badlogic.gdx.graphics.Color color42 = color34.lerp((float) (-32), 10.0f, (-1.0f), (float) (-32), (float) 634911);
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color44, 16);
        float float47 = color44.g;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color44, 512);
        int int50 = com.badlogic.gdx.graphics.Color.rgb565(color44);
        com.badlogic.gdx.graphics.Color color51 = color44.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color52 = color42.mul(color51);
        com.badlogic.gdx.graphics.Color color53 = color26.sub(color51);
        float float54 = color53.b;
        com.badlogic.gdx.graphics.Color color55 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color56 = color53.set(color55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.0f + "'", float54 == 0.0f);
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = lwjgl3ApplicationConfiguration1.windowListener;
        int int22 = lwjgl3ApplicationConfiguration1.a;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNull(lwjgl3WindowListener21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        lwjgl3ApplicationConfiguration0.setsamples(1677721600);
        lwjgl3ApplicationConfiguration0.a = (byte) 100;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-251659777));
        lwjgl3ApplicationConfiguration0.setTitle("0000faff");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
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
        lwjgl3ApplicationConfiguration11.setwindowDecorated(true);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-537010321));
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.b = (short) 0;
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = 765;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 8, 0.0f, (float) 65535);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color16;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1671172080, (int) '4');
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 16711927, (float) (-129024), (float) (-26), (float) 240);
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int50 = lwjgl3ApplicationConfiguration41.gles30ContextMajorVersion;
        int int51 = lwjgl3ApplicationConfiguration41.getgles30ContextMajorVersion();
        int int52 = lwjgl3ApplicationConfiguration41.getsamples();
        boolean boolean53 = lwjgl3ApplicationConfiguration41.disableAudio;
        int int54 = lwjgl3ApplicationConfiguration41.r;
        com.badlogic.gdx.graphics.Color color56 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color58 = color56.mul((float) (byte) 1);
        com.badlogic.gdx.graphics.Color color63 = color56.mul((float) 765, (float) (byte) -1, (float) (short) 100, (float) 100);
        com.badlogic.gdx.graphics.Color color65 = color63.mul((-1.7014117E38f));
        color65.r = (-8.952473E30f);
        lwjgl3ApplicationConfiguration41.initialBackgroundColor = color65;
        com.badlogic.gdx.graphics.Color color69 = color38.set(color65);
        com.badlogic.gdx.graphics.Color color74 = color38.mul((-1.7003146E38f), (float) 653055, (float) (-185651200), (float) 11267082);
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNotNull(color74);
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
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
        lwjgl3ApplicationConfiguration0.b = (-1430550);
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
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
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
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 480 + "'", int16 == 480);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 585070592, (float) (-654724064));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-256) + "'", int2 == (-256));
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 62445, (float) (-560496655));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-218557696) + "'", int2 == (-218557696));
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
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
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.CLEAR;
        int int25 = com.badlogic.gdx.graphics.Color.rgb888(color24);
        com.badlogic.gdx.graphics.Color color26 = color19.add(color24);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32256 + "'", int25 == 32256);
        org.junit.Assert.assertNotNull(color26);
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration11.disableAudio(false);
        lwjgl3ApplicationConfiguration11.useGL30 = false;
        lwjgl3ApplicationConfiguration11.setResizable(true);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.setAudioConfig(509920, 863980544, 2);
        int int8 = lwjgl3ApplicationConfiguration1.windowMaxHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration9);
        lwjgl3ApplicationConfiguration10.r = ' ';
        boolean boolean13 = lwjgl3ApplicationConfiguration10.getuseGL30();
        lwjgl3ApplicationConfiguration10.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration17.setwindowResizable(false);
        lwjgl3ApplicationConfiguration17.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration17.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration17.setWindowedMode(1465382614, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType35 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration17.setpreferencesFileType(fileType35);
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("ff000000", fileType35);
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration1.windowListener = lwjgl3WindowListener39;
        lwjgl3ApplicationConfiguration1.g = 1465382614;
        int int43 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + fileType35 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType35.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration7.setgles30ContextMinorVersion(8);
        int int10 = lwjgl3ApplicationConfiguration7.windowMinHeight;
        lwjgl3ApplicationConfiguration7.windowMaxHeight = (-2147413088);
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = 63518;
        lwjgl3ApplicationConfiguration7.setvSyncEnabled(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
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
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        int int26 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration28.stencil = 10;
        int int31 = lwjgl3ApplicationConfiguration28.depth;
        lwjgl3ApplicationConfiguration28.windowX = (short) 100;
        lwjgl3ApplicationConfiguration28.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType37 = lwjgl3ApplicationConfiguration28.getpreferencesFileType();
        int int38 = lwjgl3ApplicationConfiguration28.getwindowY();
        lwjgl3ApplicationConfiguration28.windowDecorated = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration42);
        lwjgl3ApplicationConfiguration43.setWindowPosition((int) (short) 10, 10);
        boolean boolean47 = lwjgl3ApplicationConfiguration43.useGL30;
        com.badlogic.gdx.Files.FileType fileType48 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration43.setpreferencesFileType(fileType48);
        com.badlogic.gdx.Files.FileType fileType50 = lwjgl3ApplicationConfiguration43.getpreferencesFileType();
        lwjgl3ApplicationConfiguration28.setPreferencesConfig("", fileType50);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffffe0ff", fileType50);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-1463708416));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16 + "'", int31 == 16);
        org.junit.Assert.assertTrue("'" + fileType37 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType37.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + fileType48 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType48.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType50 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType50.equals(com.badlogic.gdx.Files.FileType.Internal));
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        int int15 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.samples = (-2147482368);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode8;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
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
        lwjgl3ApplicationConfiguration9.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration9.setsamples((-2140825088));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100466688) + "'", int15 == (-100466688));
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
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
        lwjgl3ApplicationConfiguration1.b = (-9792000);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType5);
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (short) 10;
        lwjgl3ApplicationConfiguration0.setAudioConfig(40664886, 1677721600, 43371);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((-1216512000));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        boolean boolean10 = lwjgl3ApplicationConfiguration1.vSyncEnabled;
        int int11 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration1.setwindowMinWidth(65535);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode14);
        int int16 = lwjgl3ApplicationConfiguration1.windowY;
        lwjgl3ApplicationConfiguration1.useVsync(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
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
        int int19 = com.badlogic.gdx.graphics.Color.rgba4444(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.stencil = 10;
        int int23 = lwjgl3ApplicationConfiguration20.b;
        boolean boolean24 = lwjgl3ApplicationConfiguration20.vSyncEnabled;
        com.badlogic.gdx.Files.FileType fileType25 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration20.setpreferencesFileType(fileType25);
        int int27 = lwjgl3ApplicationConfiguration20.depth;
        lwjgl3ApplicationConfiguration20.useOpenGL3(true, (-1077936368), (int) (short) 100);
        boolean boolean32 = lwjgl3ApplicationConfiguration20.windowResizable;
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color((float) 0L, (float) 640, (float) ' ', (float) (-1));
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(color37);
        lwjgl3ApplicationConfiguration20.initialBackgroundColor = color38;
        com.badlogic.gdx.graphics.Color color41 = color18.lerp(color38, 0.0f);
        int int42 = com.badlogic.gdx.graphics.Color.argb8888(color41);
        int int43 = com.badlogic.gdx.graphics.Color.rgb565(color41);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16 + "'", int27 == 16);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
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
        int int24 = color21.toIntBits();
        float float25 = color21.toFloatBits();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 33021 + "'", int24 == 33021);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 4.6272E-41f + "'", float25 == 4.6272E-41f);
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
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
        java.lang.String str24 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
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
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color44, 3);
        int int50 = com.badlogic.gdx.graphics.Color.rgb565(color44);
        com.badlogic.gdx.graphics.Color color55 = color44.add((-8.772646E37f), (float) 131, (float) 863980544, (float) (-251659777));
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color((float) (byte) 0, (-8.952473E30f), (float) (-10224128), (float) 6349110);
        int int61 = color60.toIntBits();
        com.badlogic.gdx.graphics.Color color62 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color67 = color62.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        int int68 = com.badlogic.gdx.graphics.Color.argb8888(color62);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color62, 8925);
        com.badlogic.gdx.graphics.Color color75 = color62.sub((float) 167772160, (float) (-100466688), (float) 0, (float) (-164075620));
        com.badlogic.gdx.graphics.Color color76 = color60.mul(color75);
        com.badlogic.gdx.graphics.Color color81 = color76.set(0.0f, 1.0f, (float) 2147418367, (float) (-9728477));
        com.badlogic.gdx.graphics.Color color82 = color44.set(color81);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color82;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode84 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode84;
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ".prefs/" + "'", str24, ".prefs/");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-16777216) + "'", int61 == (-16777216));
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-16711936) + "'", int68 == (-16711936));
        org.junit.Assert.assertNotNull(color75);
        org.junit.Assert.assertNotNull(color76);
        org.junit.Assert.assertNotNull(color81);
        org.junit.Assert.assertNotNull(color82);
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        int int7 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration8.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration8.setwindowResizable(false);
        lwjgl3ApplicationConfiguration8.setwindowMinWidth((int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        lwjgl3ApplicationConfiguration22.r = ' ';
        lwjgl3ApplicationConfiguration22.windowResizable = false;
        int int27 = lwjgl3ApplicationConfiguration22.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration28.stencil = 10;
        int int31 = lwjgl3ApplicationConfiguration28.depth;
        int int32 = lwjgl3ApplicationConfiguration28.stencil;
        int int33 = lwjgl3ApplicationConfiguration28.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode34 = null;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration28.hdpiMode = hdpiMode36;
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.g = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16 + "'", int31 == 16);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        int int10 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.disableAudio = true;
        lwjgl3ApplicationConfiguration1.preferencesDirectory = ".prefs/";
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(0.0f, (float) 3840, (float) 5, (float) (-133934));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.49023438f + "'", float4 == 0.49023438f);
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setsamples((-438453248));
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(16777214);
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-32);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener12;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
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
        int int22 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.setTitle("9c663200");
        lwjgl3ApplicationConfiguration0.title = "00000900";
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(401539072);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color1, (-100466688));
        com.badlogic.gdx.graphics.Color color5 = color1.set((-22978560));
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.TEAL;
        float float7 = color6.r;
        com.badlogic.gdx.graphics.Color color8 = color6.clamp();
        com.badlogic.gdx.graphics.Color color9 = color1.add(color6);
        color6.r = (-1233169392);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
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
        int int42 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-2147450112));
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration0.b = 0;
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33791 + "'", int15 == 33791);
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SLATE;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) 9, (float) (byte) 10, (float) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color11 = color6.mul((float) 1L, (float) 3, (float) 0, 1.0f);
        boolean boolean12 = color0.equals((java.lang.Object) color6);
        float float13 = color6.b;
        int int14 = com.badlogic.gdx.graphics.Color.rgba4444(color6);
        com.badlogic.gdx.graphics.Color color15 = color6.cpy();
        com.badlogic.gdx.graphics.Color color16 = color15.clamp();
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((float) 131090400, (-1.6473113E38f), (float) (-29852), (float) (short) 10);
        com.badlogic.gdx.graphics.Color color22 = color15.sub(color21);
        int int23 = com.badlogic.gdx.graphics.Color.rgb565(color21);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-0.0f) + "'", float13 == (-0.0f));
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 61440 + "'", int14 == 61440);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 63488 + "'", int23 == 63488);
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.g = '#';
        com.badlogic.gdx.graphics.Color color6 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
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
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color30, 16);
        color30.a = 0L;
        com.badlogic.gdx.graphics.Color color35 = color28.mul(color30);
        com.badlogic.gdx.graphics.Color color40 = color28.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color40, 33791);
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(color40);
        com.badlogic.gdx.graphics.Color color44 = color26.sub(color43);
        com.badlogic.gdx.graphics.Color color45 = color24.set(color43);
        com.badlogic.gdx.graphics.Color color46 = color45.cpy();
        com.badlogic.gdx.graphics.Color color47 = color6.set(color45);
        int int48 = com.badlogic.gdx.graphics.Color.rgb565(color47);
        int int49 = color47.toIntBits();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1055 + "'", int48 == 1055);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 16745216 + "'", int49 == 16745216);
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
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
        lwjgl3ApplicationConfiguration0.b = 131072;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.windowWidth = 483965280;
        java.lang.String str18 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) (-62876));
        float float4 = color3.toFloatBits();
        com.badlogic.gdx.graphics.Color color6 = color3.set((-9728477));
        float float7 = color6.g;
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.41960785f + "'", float7 == 0.41960785f);
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration1.setsamples((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration1.setwindowWidth(0);
        lwjgl3ApplicationConfiguration1.depth = (byte) 100;
        lwjgl3ApplicationConfiguration1.windowDecorated = true;
        lwjgl3ApplicationConfiguration1.setWindowSizeLimits((-185651200), 1465382614, (-9), (-5898496));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.getwindowY();
        int int7 = lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration8.stencil = 10;
        int int11 = lwjgl3ApplicationConfiguration8.b;
        lwjgl3ApplicationConfiguration8.g = '#';
        lwjgl3ApplicationConfiguration8.a = 3;
        boolean boolean16 = lwjgl3ApplicationConfiguration8.getdisableAudio();
        lwjgl3ApplicationConfiguration8.useOpenGL3(false, (-864551100), 65280);
        int int21 = lwjgl3ApplicationConfiguration8.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int23 = lwjgl3ApplicationConfiguration22.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = lwjgl3ApplicationConfiguration22.windowListener;
        int int26 = lwjgl3ApplicationConfiguration22.getsamples();
        com.badlogic.gdx.Files.FileType fileType27 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration22.preferencesFileType = fileType27;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration29.setwindowResizable(false);
        int int40 = lwjgl3ApplicationConfiguration29.gles30ContextMajorVersion;
        int int41 = lwjgl3ApplicationConfiguration29.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3ApplicationConfiguration29.setWindowListener(lwjgl3WindowListener42);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration44.stencil = 10;
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration44.initialBackgroundColor = color48;
        lwjgl3ApplicationConfiguration44.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode52 = null;
        lwjgl3ApplicationConfiguration44.setFullscreenMode(displayMode52);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration44);
        int int55 = lwjgl3ApplicationConfiguration44.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration44.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode58 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration22.hdpiMode = hdpiMode58;
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration1.hdpiMode = hdpiMode58;
        boolean boolean64 = lwjgl3ApplicationConfiguration1.vSyncEnabled;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
        org.junit.Assert.assertNull(lwjgl3WindowListener25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode58 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode58.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.r = 65280;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        java.lang.String str17 = lwjgl3ApplicationConfiguration16.title;
        int int18 = lwjgl3ApplicationConfiguration16.getwindowY();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.g = (-40036);
        com.badlogic.gdx.Files.FileType fileType16 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-11554560), (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((-1077952513));
        int int23 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + fileType16 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType16.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
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
        lwjgl3ApplicationConfiguration1.setWindowSizeLimits((-52320), (-14483712), (-1613299457), (-3584));
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
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color2 = color1.clamp();
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((float) (short) -1, (float) (-40036), 0.98039216f, (float) (short) 10);
        com.badlogic.gdx.graphics.Color color8 = color1.add(color7);
        float float9 = color1.toFloatBits();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.661535E38f) + "'", float9 == (-1.661535E38f));
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        float float2 = color1.b;
        int int3 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int13 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
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
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration1.windowHeight = 9;
        boolean boolean6 = lwjgl3ApplicationConfiguration1.windowDecorated;
        int int7 = lwjgl3ApplicationConfiguration1.windowHeight;
        lwjgl3ApplicationConfiguration1.useGL30 = true;
        lwjgl3ApplicationConfiguration1.disableAudio(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
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
        int int25 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean27 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 765;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener5;
        lwjgl3ApplicationConfiguration0.windowY = 131072;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(6528502);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = lwjgl3ApplicationConfiguration0.windowListener;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int13 = lwjgl3ApplicationConfiguration0.windowMaxHeight;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertNull(lwjgl3WindowListener11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = ' ';
        lwjgl3ApplicationConfiguration0.windowMinHeight = 40664886;
        lwjgl3ApplicationConfiguration0.setwindowX(537535241);
        lwjgl3ApplicationConfiguration0.r = (byte) -1;
        int int18 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setTitle("ffffffff");
        lwjgl3ApplicationConfiguration0.setsamples(63232);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
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
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 131072;
        int int17 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 401539072 + "'", int13 == 401539072);
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        lwjgl3ApplicationConfiguration0.setsamples(1677721600);
        int int10 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration11.windowWidth = (-13126704);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color4.lerp(color12, (float) 100L);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        com.badlogic.gdx.graphics.Color color20 = color14.mul(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        lwjgl3ApplicationConfiguration22.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        int int26 = lwjgl3ApplicationConfiguration25.getgles30ContextMinorVersion();
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color28);
        lwjgl3ApplicationConfiguration25.initialBackgroundColor = color28;
        color28.b = 537535241;
        com.badlogic.gdx.graphics.Color color33 = color14.add(color28);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color28, 1090519033);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setwindowWidth((-40036));
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-62876);
        lwjgl3ApplicationConfiguration0.b = (-654724064);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(8);
        color24.g = (-1077952513);
        com.badlogic.gdx.graphics.Color color27 = color24.premultiplyAlpha();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color24);
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
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
        boolean boolean16 = lwjgl3ApplicationConfiguration15.windowDecorated;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((float) (byte) 10, 0.0f, (float) (-10224128), (float) (-16711681));
        lwjgl3ApplicationConfiguration15.setInitialBackgroundColor(color21);
        int int23 = lwjgl3ApplicationConfiguration15.samples;
        int int24 = lwjgl3ApplicationConfiguration15.windowMaxHeight;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.windowHeight = (-8257792);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        boolean boolean16 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
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
        int int37 = color31.toIntBits();
        int int38 = com.badlogic.gdx.graphics.Color.rgba4444(color31);
        com.badlogic.gdx.graphics.Color color43 = color31.sub(0.0f, (float) (-100466688), (float) 3309388, (float) 537535241);
        com.badlogic.gdx.graphics.Color color45 = color31.mul((float) (-100466688));
        com.badlogic.gdx.graphics.Color color50 = color45.sub((float) (byte) 1, (float) 5, 1.43E-43f, 0.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-256) + "'", int37 == (-256));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-256) + "'", int38 == (-256));
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color50);
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(130029600);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration2.stencil = 10;
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration2.initialBackgroundColor = color6;
        int int8 = com.badlogic.gdx.graphics.Color.rgb888(color6);
        boolean boolean10 = color6.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.stencil = 10;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color15;
        com.badlogic.gdx.graphics.Color color21 = color15.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color22 = color6.mul(color21);
        com.badlogic.gdx.graphics.Color color24 = color21.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color21, 3);
        com.badlogic.gdx.graphics.Color color28 = color21.set((int) (short) 1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color28, (-40036));
        com.badlogic.gdx.graphics.Color color31 = color1.sub(color28);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color31);
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
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
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (byte) -1;
        lwjgl3ApplicationConfiguration0.depth = 43371;
        lwjgl3ApplicationConfiguration0.samples = 63232;
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color4.lerp(color12, (float) 100L);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((float) 8, (float) 640, (float) (byte) 1, (float) 1465382614);
        com.badlogic.gdx.graphics.Color color20 = color14.mul(color19);
        float float21 = color14.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.stencil = 10;
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration22.initialBackgroundColor = color26;
        lwjgl3ApplicationConfiguration22.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color30 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration22.initialBackgroundColor = color30;
        lwjgl3ApplicationConfiguration22.g = 16711680;
        lwjgl3ApplicationConfiguration22.setpreferencesDirectory("");
        lwjgl3ApplicationConfiguration22.setResizable(true);
        boolean boolean38 = color14.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass39 = color14.getClass();
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) -1;
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-250615296);
        lwjgl3ApplicationConfiguration0.windowMaxWidth = ' ';
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
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
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((float) (-5465700), (float) 52625, (float) (short) 1, (float) 7077476);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color20;
        lwjgl3ApplicationConfiguration0.g = (-251659777);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode24 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode24;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration8.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
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
        int int23 = lwjgl3ApplicationConfiguration1.a;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.samples = 512;
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.a = 1677721600;
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 0);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 37670;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
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
        int int37 = lwjgl3ApplicationConfiguration1.windowMaxHeight;
        lwjgl3ApplicationConfiguration1.setWindowedMode((-149950464), (-7462090));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.stencil = 10;
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration29.initialBackgroundColor = color33;
        int int35 = com.badlogic.gdx.graphics.Color.rgb888(color33);
        boolean boolean37 = color33.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.stencil = 10;
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration38.initialBackgroundColor = color42;
        com.badlogic.gdx.graphics.Color color48 = color42.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color49 = color33.mul(color48);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color33, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color52 = color28.add(color33);
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color54 = com.badlogic.gdx.graphics.Color.CLEAR;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color54, 32256);
        com.badlogic.gdx.graphics.Color color57 = color53.mul(color54);
        float float58 = color53.b;
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color((float) (-4089), (float) (-62876), (float) (-864551100), (float) (-16711681));
        java.lang.String str64 = color63.toString();
        com.badlogic.gdx.graphics.Color color66 = color53.lerp(color63, 0.0f);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color53, 7712224);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 0.0f + "'", float58 == 0.0f);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "00000000" + "'", str64, "00000000");
        org.junit.Assert.assertNotNull(color66);
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((-4.2535625E37f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.samples = (byte) 0;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 8420355, (-1077936368));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((-1.9216791E33f), 2.3509886E-38f, (-1.6975328E38f), (float) (-63488));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16189440) + "'", int4 == (-16189440));
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-905969664), (-8.772646E37f), (-1.6995508E38f), (-1.7013862E38f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, (float) (-503341578), (-1.5399916E-33f), (float) 2);
        com.badlogic.gdx.graphics.Color color6 = color4.set(2147418367);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color9 = color8.clamp();
        float float10 = color8.r;
        int int11 = com.badlogic.gdx.graphics.Color.rgb888(color8);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color8, 1953529918);
        com.badlogic.gdx.graphics.Color color14 = color6.set(color8);
        com.badlogic.gdx.graphics.Color color19 = color6.set((float) (-134360), (float) (-369098752), (float) (-805306623), (float) 3309388);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((float) 786400, (float) (-6553036), (float) (-255), (float) (-622910848));
        int int25 = com.badlogic.gdx.graphics.Color.rgba8888(color24);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color28 = color6.add(color27);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-16777216) + "'", int25 == (-16777216));
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
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
        com.badlogic.gdx.graphics.Color color28 = color23.add((-7.948861E37f), (float) 16724807, (float) 586415136, (-1.7010224E38f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 65533, (-1.6973261E38f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16973056) + "'", int2 == (-16973056));
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
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
        com.badlogic.gdx.graphics.Color color27 = color26.cpy();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color26, (-9371842));
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
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
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
        lwjgl3ApplicationConfiguration0.a = 167772160;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 184540928;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(16777215, 0, 9, (-100466688), 1465382614, 0, 640);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int14 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode15);
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = 0;
        int int8 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-33584897);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
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
        com.badlogic.gdx.graphics.Color color27 = color21.add(1.0f, (float) 10L, 0.0f, (float) 6349110);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color29, 16);
        float float32 = color29.g;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color29, 512);
        int int35 = com.badlogic.gdx.graphics.Color.rgb565(color29);
        com.badlogic.gdx.graphics.Color color36 = color29.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color29, (-622910848));
        com.badlogic.gdx.graphics.Color color39 = color21.sub(color29);
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color((float) 25500, (float) 3855, (float) 863980544, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color44, 3309388);
        com.badlogic.gdx.graphics.Color color47 = color21.sub(color44);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(color44);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color47);
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        float float1 = color0.r;
        com.badlogic.gdx.graphics.Color color2 = color0.premultiplyAlpha();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration3.stencil = 10;
        lwjgl3ApplicationConfiguration3.setwindowX((int) (short) 0);
        int int8 = lwjgl3ApplicationConfiguration3.getaudioDeviceBufferSize();
        int int9 = lwjgl3ApplicationConfiguration3.b;
        boolean boolean10 = lwjgl3ApplicationConfiguration3.getwindowResizable();
        lwjgl3ApplicationConfiguration3.audioDeviceSimultaneousSources = (short) -1;
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration3.initialBackgroundColor;
        float float14 = color13.b;
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color19, 16);
        color19.a = 0L;
        com.badlogic.gdx.graphics.Color color24 = color17.mul(color19);
        com.badlogic.gdx.graphics.Color color29 = color17.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color29, 33791);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color33 = color15.sub(color32);
        com.badlogic.gdx.graphics.Color color34 = color33.clamp();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color33, 63488);
        int int37 = com.badlogic.gdx.graphics.Color.rgba4444(color33);
        com.badlogic.gdx.graphics.Color color39 = color13.lerp(color33, (float) (-16580607));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color39, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color((float) (-10224128), (float) (-10223606), (float) 1, (float) 10);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color46, 0);
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
        com.badlogic.gdx.graphics.Color color71 = color68.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color68, 3);
        com.badlogic.gdx.graphics.Color color75 = color68.set((int) (short) 1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color75, (-40036));
        com.badlogic.gdx.graphics.Color color78 = color75.cpy();
        com.badlogic.gdx.graphics.Color color80 = color78.set((int) 'a');
        com.badlogic.gdx.graphics.Color color82 = color46.lerp(color78, (float) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration83 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration84 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration83);
        com.badlogic.gdx.graphics.Color color85 = com.badlogic.gdx.graphics.Color.RED;
        com.badlogic.gdx.graphics.Color color86 = new com.badlogic.gdx.graphics.Color(color85);
        lwjgl3ApplicationConfiguration83.setInitialBackgroundColor(color85);
        com.badlogic.gdx.graphics.Color color88 = color82.set(color85);
        com.badlogic.gdx.graphics.Color color89 = color39.add(color82);
        com.badlogic.gdx.graphics.Color color90 = color2.sub(color89);
        java.lang.Class<?> wildcardClass91 = color89.getClass();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(color13);
// flaky:         org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 224 + "'", int37 == 224);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNotNull(color71);
        org.junit.Assert.assertNotNull(color75);
        org.junit.Assert.assertNotNull(color78);
        org.junit.Assert.assertNotNull(color80);
        org.junit.Assert.assertNotNull(color82);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration84);
        org.junit.Assert.assertNotNull(color85);
        org.junit.Assert.assertNotNull(color88);
        org.junit.Assert.assertNotNull(color89);
        org.junit.Assert.assertNotNull(color90);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setsamples((-1077952513));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferCount;
        int int12 = lwjgl3ApplicationConfiguration10.g;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int2 = lwjgl3ApplicationConfiguration0.windowMinHeight;
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.windowWidth = (-4090624);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ff000064");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
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
        boolean boolean14 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-150016000), (-1.6480626E38f), (float) 1535);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 391425 + "'", int3 == 391425);
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration23.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration23.setpreferencesDirectory("");
        lwjgl3ApplicationConfiguration23.setBackBufferConfig(8925, 63151, (-2105736960), (-16711936), (-1), 0, (-1));
        int int39 = lwjgl3ApplicationConfiguration23.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration23.windowX = 97;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
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
        int int21 = lwjgl3ApplicationConfiguration20.depth;
        int int22 = lwjgl3ApplicationConfiguration20.windowHeight;
        int int23 = lwjgl3ApplicationConfiguration20.windowHeight;
        lwjgl3ApplicationConfiguration20.setdepth(7712224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 480 + "'", int22 == 480);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 480 + "'", int23 == 480);
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (byte) 0, 765);
        com.badlogic.gdx.Files.FileType fileType9 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.preferencesFileType = fileType9;
        java.lang.String str11 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration1.setdisableAudio(false);
        lwjgl3ApplicationConfiguration1.setAudioConfig(16777215, 16738740, (-1));
        lwjgl3ApplicationConfiguration1.setResizable(false);
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
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
        float float31 = color29.toFloatBits();
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color38 = color33.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        int int39 = com.badlogic.gdx.graphics.Color.argb8888(color33);
        int int40 = com.badlogic.gdx.graphics.Color.rgba8888(color33);
        com.badlogic.gdx.graphics.Color color41 = com.badlogic.gdx.graphics.Color.VIOLET;
        com.badlogic.gdx.graphics.Color color43 = color41.mul((float) (-65025));
        float float44 = color41.b;
        com.badlogic.gdx.graphics.Color color45 = color33.mul(color41);
        com.badlogic.gdx.graphics.Color color46 = color29.sub(color45);
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color(color29);
        color47.r = 0.0f;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 9.44502E21f + "'", float31 == 9.44502E21f);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-16711936) + "'", int39 == (-16711936));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 16711935 + "'", int40 == 16711935);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color46);
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (-256);
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration1.initialBackgroundColor;
        lwjgl3ApplicationConfiguration1.gles30ContextMajorVersion = 33791;
        lwjgl3ApplicationConfiguration1.setwindowDecorated(true);
        int int14 = lwjgl3ApplicationConfiguration1.getdepth();
        lwjgl3ApplicationConfiguration1.g = 0;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        lwjgl3ApplicationConfiguration1.windowMinWidth = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = lwjgl3ApplicationConfiguration1.hdpiMode;
        int int7 = lwjgl3ApplicationConfiguration1.getwindowMinWidth();
        java.lang.String str8 = lwjgl3ApplicationConfiguration1.getpreferencesDirectory();
        int int9 = lwjgl3ApplicationConfiguration1.getwindowHeight();
        int int10 = lwjgl3ApplicationConfiguration1.r;
        lwjgl3ApplicationConfiguration1.audioDeviceBufferSize = 14420470;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        int int9 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-16654816));
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 653051;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
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
        lwjgl3ApplicationConfiguration14.gles30ContextMajorVersion = 16727030;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-16189440), (float) (-218557696), (float) (-156));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4836) + "'", int3 == (-4836));
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
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
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-1077936368);
        int int39 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(0.0f, (float) (-503341578), (-1.5399916E-33f), (float) 2);
        com.badlogic.gdx.graphics.Color color7 = color5.set(2147418367);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color9 = color0.sub(color7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.stencil = 10;
        int int13 = lwjgl3ApplicationConfiguration10.b;
        lwjgl3ApplicationConfiguration10.g = '#';
        com.badlogic.gdx.graphics.Color color16 = lwjgl3ApplicationConfiguration10.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color21, 16);
        color21.a = 0L;
        com.badlogic.gdx.graphics.Color color26 = color19.mul(color21);
        com.badlogic.gdx.graphics.Color color31 = color19.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color31, 33791);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color31);
        com.badlogic.gdx.graphics.Color color35 = color17.sub(color34);
        com.badlogic.gdx.graphics.Color color36 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color40, 16);
        color40.a = 0L;
        com.badlogic.gdx.graphics.Color color45 = color38.mul(color40);
        com.badlogic.gdx.graphics.Color color50 = color38.mul((float) 0L, (float) 3, (float) (-255), (float) 33791);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color50, 33791);
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(color50);
        com.badlogic.gdx.graphics.Color color54 = color36.sub(color53);
        com.badlogic.gdx.graphics.Color color55 = color34.set(color53);
        com.badlogic.gdx.graphics.Color color56 = color55.cpy();
        com.badlogic.gdx.graphics.Color color57 = color16.set(color55);
        com.badlogic.gdx.graphics.Color color58 = com.badlogic.gdx.graphics.Color.CHARTREUSE;
        com.badlogic.gdx.graphics.Color color59 = color57.mul(color58);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color57, 5959695);
        com.badlogic.gdx.graphics.Color color63 = color0.lerp(color57, 0.33333334f);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(color63);
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        int int5 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int6 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.r = 8;
        lwjgl3ApplicationConfiguration0.windowHeight = 0;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(0);
        lwjgl3ApplicationConfiguration0.windowWidth = (-369098752);
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        lwjgl3ApplicationConfiguration0.setwindowX(1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        int int13 = lwjgl3ApplicationConfiguration10.getaudioDeviceBufferCount();
        boolean boolean14 = lwjgl3ApplicationConfiguration10.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        com.badlogic.gdx.Files.FileType fileType16 = lwjgl3ApplicationConfiguration15.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType16;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + fileType16 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType16.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
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
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
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
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        boolean boolean13 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.windowMinWidth = 230;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) (byte) 1);
        com.badlogic.gdx.graphics.Color color8 = color1.sub((float) 10, (float) (-16711681), (float) (-6553036), (float) (-65280));
        color8.b = 1953529918;
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType5;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-7555886);
        lwjgl3ApplicationConfiguration0.g = (-551618560);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-16654816), 1071676419, 0, (-67168768), (-548854), 650565, (-237019999));
        boolean boolean20 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.r = 8;
        lwjgl3ApplicationConfiguration0.windowHeight = 0;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(0);
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str4 = lwjgl3ApplicationConfiguration0.title;
        java.lang.String str5 = lwjgl3ApplicationConfiguration0.title;
        int int6 = lwjgl3ApplicationConfiguration0.getsamples();
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.g = (-2147420160);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        int int6 = lwjgl3ApplicationConfiguration1.getwindowY();
        int int7 = lwjgl3ApplicationConfiguration1.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration1.useGL30 = true;
        lwjgl3ApplicationConfiguration1.setaudioDeviceSimultaneousSources((-534781952));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
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
        int int52 = color47.toIntBits();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65535 + "'", int8 == 65535);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-142049825) + "'", int50 == (-142049825));
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-142049825) + "'", int52 == (-142049825));
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        int int9 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("00830000");
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.windowMinWidth = 61379;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-2144), (float) (-5600), (float) (-28));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-868) + "'", int3 == (-868));
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
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
        int int15 = lwjgl3ApplicationConfiguration0.windowMaxWidth;
        lwjgl3ApplicationConfiguration0.r = 52625;
        com.badlogic.gdx.Files.FileType fileType18 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.windowX = (-7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + fileType18 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType18.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 2147418367, (float) '#', (float) 0, (float) 26180);
        color4.g = (-79474432);
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration8.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration8.setdisableAudio(true);
        lwjgl3ApplicationConfiguration8.windowDecorated = true;
        lwjgl3ApplicationConfiguration8.setwindowResizable(true);
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration8.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType20;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
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
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.LIME;
        com.badlogic.gdx.graphics.Color color27 = color22.mul((float) 1L, (float) 3, (float) 0, 1.0f);
        float float28 = color27.a;
        com.badlogic.gdx.graphics.Color color30 = color19.lerp(color27, (float) 863980544);
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
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color(color35);
        float float53 = color52.a;
        com.badlogic.gdx.graphics.Color color54 = color52.cpy();
        com.badlogic.gdx.graphics.Color color56 = color19.lerp(color54, (float) (-1202651136));
        com.badlogic.gdx.graphics.Color color57 = new com.badlogic.gdx.graphics.Color(color54);
        com.badlogic.gdx.graphics.Color color58 = new com.badlogic.gdx.graphics.Color(color54);
        java.lang.Object obj59 = null;
        boolean boolean60 = color54.equals(obj59);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
// flaky:         org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int3 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int5 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.r = (-65536);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int6 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        boolean boolean5 = lwjgl3ApplicationConfiguration1.useGL30;
        com.badlogic.gdx.Files.FileType fileType6 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration1.setpreferencesFileType(fileType6);
        lwjgl3ApplicationConfiguration1.g = 100;
        int int10 = lwjgl3ApplicationConfiguration1.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration1.setwindowWidth((-545421065));
        boolean boolean13 = lwjgl3ApplicationConfiguration1.windowResizable;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-10223606), 100.0f, (float) (short) 0, (float) ' ');
        float float6 = color0.g;
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color0);
        float float8 = color0.g;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, (-622910848));
        com.badlogic.gdx.graphics.Color color11 = color0.cpy();
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color0, 13159);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration2.windowMaxHeight = (-16580607);
        boolean boolean5 = lwjgl3ApplicationConfiguration2.getdisableAudio();
        lwjgl3ApplicationConfiguration2.setgles30ContextMajorVersion(16711425);
        int int8 = lwjgl3ApplicationConfiguration2.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16711425 + "'", int8 == 16711425);
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) 131, (-4.253659E37f), (float) (-1074216555), (float) (-16777116));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-50331648) + "'", int4 == (-50331648));
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
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
        int int38 = lwjgl3ApplicationConfiguration36.getaudioDeviceBufferCount();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
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
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int17 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.stencil = (-237);
        lwjgl3ApplicationConfiguration0.windowWidth = (-150361792);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
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
        boolean boolean16 = lwjgl3ApplicationConfiguration15.windowDecorated;
        java.lang.String str17 = lwjgl3ApplicationConfiguration15.title;
        int int18 = lwjgl3ApplicationConfiguration15.windowMaxWidth;
        lwjgl3ApplicationConfiguration15.setTitle("hi!");
        lwjgl3ApplicationConfiguration15.setwindowMinWidth(536867136);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(65280);
        com.badlogic.gdx.graphics.Color color2 = color1.clamp();
        color2.g = 0.13725491f;
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) (-7395329), 0.9047619f, (float) (-28));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-68) + "'", int3 == (-68));
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
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
        int int21 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        lwjgl3ApplicationConfiguration0.windowY = 163200;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        boolean boolean26 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(634911, 491505, (-2130706432), 268369920);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(16724807, (-858996736), (-9728477), 193);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.r = ' ';
        boolean boolean4 = lwjgl3ApplicationConfiguration1.getuseGL30();
        lwjgl3ApplicationConfiguration1.useGL30 = false;
        lwjgl3ApplicationConfiguration1.windowMaxHeight = (-256);
        lwjgl3ApplicationConfiguration1.audioDeviceBufferCount = 765;
        lwjgl3ApplicationConfiguration1.setWindowPosition((-2144), (-129024));
        int int14 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferSize();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = null;
        lwjgl3ApplicationConfiguration1.fullscreenMode = lwjgl3DisplayMode15;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.windowMaxHeight = (-2147413088);
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setdepth(16769056);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.8784314f, (float) (-235258384), (float) 7536639, (-3.915235E-31f));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, 653055);
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
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
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int15 = lwjgl3ApplicationConfiguration0.windowY;
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(2097152, 2113863936, (-29852), (-172470016));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-7.6098303E37f) + "'", float4 == (-7.6098303E37f));
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int17 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
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
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color24);
        float float42 = color41.a;
        int int43 = com.badlogic.gdx.graphics.Color.argb8888(color41);
        com.badlogic.gdx.graphics.Color color44 = color41.cpy();
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color(color41);
        com.badlogic.gdx.graphics.Color color50 = color45.set((float) 786400, (float) (-65280), (float) (-65280), (float) (byte) -1);
        com.badlogic.gdx.graphics.Color color55 = color45.sub((float) (-2147483648), (float) (-864551100), (float) 130029600, (float) (-16777216));
        float float56 = color45.r;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color45;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 1.0f + "'", float56 == 1.0f);
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 0);
        float float2 = color1.b;
        float float3 = color1.toFloatBits();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
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
        float float54 = color29.toFloatBits();
        com.badlogic.gdx.graphics.Color color59 = color29.mul((float) (-6555919), (float) (-59475968), (float) 30720, (float) 255);
        int int60 = com.badlogic.gdx.graphics.Color.rgb565(color59);
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
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.0f + "'", float54 == 0.0f);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CORAL;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, 33791);
        com.badlogic.gdx.graphics.Color color4 = color0.set((-5898496));
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color0);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        com.badlogic.gdx.Files.FileType fileType5 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType5;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getuseGL30();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.windowX = (-157286400);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode13 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setdepth((-598736));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(lwjgl3DisplayMode13);
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.stencil = 765;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        boolean boolean15 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setwindowHeight(167772160);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((-1.2880023E32f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setdepth(1953529918);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setwindowX(1610676736);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-40036), 43371, (-2147481728), (-2147418368), 224, 1174394321, (-4089));
        boolean boolean21 = lwjgl3ApplicationConfiguration0.useGL30;
        int int22 = lwjgl3ApplicationConfiguration0.a;
        int int23 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setWindowPosition((-57968640), (-3091));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2147418368) + "'", int22 == (-2147418368));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.CORAL;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color7);
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
        int int32 = com.badlogic.gdx.graphics.Color.argb8888(color30);
        com.badlogic.gdx.graphics.Color color33 = color30.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.stencil = 10;
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration34.initialBackgroundColor = color38;
        int int40 = com.badlogic.gdx.graphics.Color.rgb888(color38);
        boolean boolean42 = color38.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.stencil = 10;
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration43.initialBackgroundColor = color47;
        com.badlogic.gdx.graphics.Color color53 = color47.add((float) 10, (float) 100, (float) 1L, (float) 0);
        com.badlogic.gdx.graphics.Color color54 = color38.mul(color53);
        com.badlogic.gdx.graphics.Color color56 = color53.mul((float) (short) 1);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color53, 9);
        com.badlogic.gdx.graphics.Color color60 = color53.set((-4089));
        com.badlogic.gdx.graphics.Color color61 = color53.clamp();
        com.badlogic.gdx.graphics.Color color62 = color61.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color(color61);
        com.badlogic.gdx.graphics.Color color65 = color33.lerp(color61, (float) (-255));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration66.stencil = 10;
        com.badlogic.gdx.graphics.Color color70 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration66.initialBackgroundColor = color70;
        lwjgl3ApplicationConfiguration66.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.graphics.Color color74 = com.badlogic.gdx.graphics.Color.BLUE;
        lwjgl3ApplicationConfiguration66.initialBackgroundColor = color74;
        java.lang.String str76 = color74.toString();
        com.badlogic.gdx.graphics.Color color77 = color33.add(color74);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color77);
        java.lang.String str79 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setWindowPosition((-16730996), (-15574529));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(color74);
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "0000ff00" + "'", str76, "0000ff00");
        org.junit.Assert.assertNotNull(color77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + ".prefs/" + "'", str79, ".prefs/");
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-256), (float) 6349110, (float) 40664886, (float) 'a');
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color11 = color5.set((float) (-52992), (float) (-12588544), (float) 16716287, 0.0f);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color5);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 64274, (float) (-2147481728), (-6.540879E32f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1762787328) + "'", int3 == (-1762787328));
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
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
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration45);
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        int int6 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.setWindowPosition((-6168960), (-1536));
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int11 = lwjgl3ApplicationConfiguration0.getwindowMinWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        int int4 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-16580607);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int10 = lwjgl3ApplicationConfiguration0.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration11.setwindowX((-5375136));
        lwjgl3ApplicationConfiguration11.windowMaxWidth = 230;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-415027232), 54992, 7956480, (-1636));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2621472) + "'", int4 == (-2621472));
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int2 = lwjgl3ApplicationConfiguration1.samples;
        lwjgl3ApplicationConfiguration1.setwindowY(9);
        int int5 = lwjgl3ApplicationConfiguration1.samples;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SALMON;
        float float7 = color6.r;
        lwjgl3ApplicationConfiguration1.initialBackgroundColor = color6;
        lwjgl3ApplicationConfiguration1.setWindowedMode((int) (byte) 100, 130029600);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration1.fullscreenMode = lwjgl3DisplayMode12;
        lwjgl3ApplicationConfiguration1.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration1.useVsync(false);
        int int18 = lwjgl3ApplicationConfiguration1.getaudioDeviceBufferCount();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (int) (short) 1);
        float float4 = color1.b;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color1, (-90112));
        int int7 = color1.toIntBits();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.003921569f + "'", float4 == 0.003921569f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10551039 + "'", int7 == 10551039);
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
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
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration41);
        lwjgl3ApplicationConfiguration42.setWindowPosition((int) (short) 10, 10);
        boolean boolean46 = lwjgl3ApplicationConfiguration42.useGL30;
        com.badlogic.gdx.Files.FileType fileType47 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration42.setpreferencesFileType(fileType47);
        com.badlogic.gdx.Files.FileType fileType49 = lwjgl3ApplicationConfiguration42.getpreferencesFileType();
        int int50 = lwjgl3ApplicationConfiguration42.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration51.stencil = 10;
        int int54 = lwjgl3ApplicationConfiguration51.b;
        boolean boolean55 = lwjgl3ApplicationConfiguration51.vSyncEnabled;
        lwjgl3ApplicationConfiguration51.setuseGL30(false);
        int int58 = lwjgl3ApplicationConfiguration51.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode59 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration51.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration51.windowDecorated = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration65);
        lwjgl3ApplicationConfiguration66.r = ' ';
        lwjgl3ApplicationConfiguration66.windowResizable = false;
        int int71 = lwjgl3ApplicationConfiguration66.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration72 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration72.stencil = 10;
        int int75 = lwjgl3ApplicationConfiguration72.depth;
        int int76 = lwjgl3ApplicationConfiguration72.stencil;
        int int77 = lwjgl3ApplicationConfiguration72.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode78 = null;
        lwjgl3ApplicationConfiguration72.setHdpiMode(hdpiMode78);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode80 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration72.hdpiMode = hdpiMode80;
        lwjgl3ApplicationConfiguration66.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration42.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode80;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration86 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration86.gles30ContextMajorVersion = (-20224);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + fileType47 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType47.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + fileType49 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType49.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 512 + "'", int50 == 512);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 8 + "'", int54 == 8);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode59 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode59.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 16 + "'", int75 == 16);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode80 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode80.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration86);
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        color2.b = 0.0f;
        float float5 = color2.a;
        color2.a = (-1.674149E38f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.39215687f + "'", float5 == 0.39215687f);
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-25595);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration2);
        org.junit.Assert.assertNull(lwjgl3WindowListener3);
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-786496);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(480);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
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
        int int28 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-848128) + "'", int28 == (-848128));
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
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
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "9c663200";
        boolean boolean35 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setwindowY((-40036));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.stencil = 10;
        int int13 = lwjgl3ApplicationConfiguration10.b;
        boolean boolean14 = lwjgl3ApplicationConfiguration10.vSyncEnabled;
        lwjgl3ApplicationConfiguration10.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration10.hdpiMode = hdpiMode17;
        com.badlogic.gdx.Files.FileType fileType19 = lwjgl3ApplicationConfiguration10.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType19);
        int int21 = lwjgl3ApplicationConfiguration0.depth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int23 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + fileType19 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType19.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
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
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-208));
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 193;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
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
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color16 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        color16.b = (-13577603);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration1.setHdpiMode(hdpiMode4);
        lwjgl3ApplicationConfiguration1.setgles30ContextMinorVersion(234);
        int int8 = lwjgl3ApplicationConfiguration1.getgles30ContextMajorVersion();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
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
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
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
        com.badlogic.gdx.graphics.Color color46 = color41.set((float) (-40036), (float) (short) 10, 1.0f, (float) (-1));
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color41;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color46);
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        int int1 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((-1728));
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        com.badlogic.gdx.graphics.Color color5 = color0.add(color3);
        float float6 = color0.a;
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-131072) + "'", int1 == (-131072));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1090519033 + "'", int4 == 1090519033);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration9.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration9.useOpenGL3(true, (-100466688), (-62876));
        lwjgl3ApplicationConfiguration9.setpreferencesDirectory("00000000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.stencil = 10;
        int int20 = lwjgl3ApplicationConfiguration17.b;
        lwjgl3ApplicationConfiguration17.g = '#';
        lwjgl3ApplicationConfiguration17.a = 3;
        boolean boolean25 = lwjgl3ApplicationConfiguration17.getdisableAudio();
        lwjgl3ApplicationConfiguration17.useOpenGL3(false, (-864551100), 65280);
        int int30 = lwjgl3ApplicationConfiguration17.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int32 = lwjgl3ApplicationConfiguration31.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = lwjgl3ApplicationConfiguration31.windowListener;
        int int35 = lwjgl3ApplicationConfiguration31.getsamples();
        com.badlogic.gdx.Files.FileType fileType36 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration31.preferencesFileType = fileType36;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration38.setwindowResizable(false);
        int int49 = lwjgl3ApplicationConfiguration38.gles30ContextMajorVersion;
        int int50 = lwjgl3ApplicationConfiguration38.windowMinWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener51 = null;
        lwjgl3ApplicationConfiguration38.setWindowListener(lwjgl3WindowListener51);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration53.stencil = 10;
        com.badlogic.gdx.graphics.Color color57 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration53.initialBackgroundColor = color57;
        lwjgl3ApplicationConfiguration53.b = (byte) 0;
        com.badlogic.gdx.Graphics.DisplayMode displayMode61 = null;
        lwjgl3ApplicationConfiguration53.setFullscreenMode(displayMode61);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration53);
        int int64 = lwjgl3ApplicationConfiguration53.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration53.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode67 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration53.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration31.hdpiMode = hdpiMode67;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode67);
        int int73 = lwjgl3ApplicationConfiguration9.getwindowX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 512 + "'", int32 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration33);
        org.junit.Assert.assertNull(lwjgl3WindowListener34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + fileType36 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType36.equals(com.badlogic.gdx.Files.FileType.Internal));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + hdpiMode67 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode67.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 16 + "'", int73 == 16);
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.r = 0;
        int int14 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-4090624));
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((float) 7680, (float) 10L, (float) (-36880), (float) (-65280));
        com.badlogic.gdx.graphics.Color color8 = color1.lerp(color6, (float) 301989632);
        float float9 = color1.r;
        int int10 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-65536) + "'", int10 == (-65536));
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
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
        lwjgl3ApplicationConfiguration0.samples = 2560;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-16252195), (-520093697), (-8708864), (-9));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-35) + "'", int4 == (-35));
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 2113863936, (-0.0f), (float) (-97785123), (-1.674149E38f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4096) + "'", int4 == (-4096));
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLD;
        color0.r = 'a';
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color5 = color3.mul((float) (-2063361));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) 33791, (float) 6528502, (float) 1519722240);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int6 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((float) (-208), (float) (-8257792), (float) 586415136, (float) 7680);
        com.badlogic.gdx.graphics.Color color12 = color11.clamp();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        int int14 = com.badlogic.gdx.graphics.Color.rgba8888(color11);
        com.badlogic.gdx.graphics.Color color15 = color11.clamp();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 65535 + "'", int14 == 65535);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-1929445376), (float) 16745216, (float) (-1049600), (float) (-1543503872));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-117620736) + "'", int4 == (-117620736));
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((int) (byte) 0);
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color9);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color4;
        lwjgl3ApplicationConfiguration0.b = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = ' ';
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("0000faff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        lwjgl3ApplicationConfiguration0.setwindowX(1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.samples = 1621098495;
        lwjgl3ApplicationConfiguration10.setwindowMinWidth(62445);
        int int15 = lwjgl3ApplicationConfiguration10.windowMaxHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = lwjgl3ApplicationConfiguration10.hdpiMode;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(hdpiMode16);
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 765, (float) 16776980, (float) (-16776704), (float) 2147190528);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
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
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(33791);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 131090400;
        lwjgl3ApplicationConfiguration0.setdepth((-1463708416));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-2147475712), 0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        int int3 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowX = (short) 100;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, (int) (byte) 100);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowY(8925);
        lwjgl3ApplicationConfiguration0.g = 33791;
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.windowMinHeight = 16111;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
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
        com.badlogic.gdx.graphics.Color color25 = color19.sub((float) 2, 0.49803922f, (float) (-654724064), 0.49803922f);
        int int26 = com.badlogic.gdx.graphics.Color.argb8888(color19);
        int int27 = com.badlogic.gdx.graphics.Color.rgba4444(color19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32767 + "'", int26 == 32767);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2032 + "'", int27 == 2032);
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
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
        float float22 = color19.b;
        float float23 = color19.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration24.useVsync(false);
        lwjgl3ApplicationConfiguration24.setwindowWidth((-40036));
        int int37 = lwjgl3ApplicationConfiguration24.getwindowMinWidth();
        boolean boolean38 = color19.equals((java.lang.Object) int37);
        com.badlogic.gdx.graphics.Color color39 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color39, 626699475);
        com.badlogic.gdx.graphics.Color color42 = color19.sub(color39);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color39, 41851);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color42);
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration1.setWindowPosition((int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration1.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration1);
        lwjgl3ApplicationConfiguration7.windowResizable = false;
        lwjgl3ApplicationConfiguration7.windowResizable = false;
        boolean boolean12 = lwjgl3ApplicationConfiguration7.getuseGL30();
        boolean boolean13 = lwjgl3ApplicationConfiguration7.getwindowResizable();
        lwjgl3ApplicationConfiguration7.r = 2113863936;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 1310975, (-1.9216791E33f), (float) (-60572), (float) (-321707263));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1102400) + "'", int4 == (-1102400));
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 0, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setwindowMinWidth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useGL30 = false;
    }
}
