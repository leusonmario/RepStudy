import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.Graphics.Monitor monitor0 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.getPrimaryMonitor();
            org.junit.Assert.fail("Expected exception of type com.badlogic.gdx.utils.GdxRuntimeException; message: Couldn't load shared library 'libgdx64.so' for target: Linux, 64-bit");
        } catch (com.badlogic.gdx.utils.GdxRuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode0 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        java.lang.Class<?> wildcardClass1 = hdpiMode0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode0 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode0.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.Graphics.Monitor[] monitorArray0 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.getMonitors();
            org.junit.Assert.fail("Expected exception of type java.lang.ExceptionInInitializerError; message: null");
        } catch (java.lang.ExceptionInInitializerError e) {
        // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.depth = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 10);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        lwjgl3ApplicationConfiguration0.depth = 480;
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setwindowWidth(100);
        int int18 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 480 + "'", int18 == 480);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setAudioConfig(3, 1, 640);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        boolean boolean16 = lwjgl3ApplicationConfiguration13.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = lwjgl3ApplicationConfiguration13.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode17);
        java.lang.Class<?> wildcardClass19 = hdpiMode17.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.title;
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setdepth((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowWidth = 100;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) '#', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) (short) 10, 480);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.samples = 100;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        java.lang.String str5 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".prefs/" + "'", str5, ".prefs/");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration16.setwindowWidth((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean17 = lwjgl3ApplicationConfiguration0.disableAudio;
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.g = (short) -1;
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str12 = lwjgl3ApplicationConfiguration11.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration11.windowListener = lwjgl3WindowListener13;
        lwjgl3ApplicationConfiguration11.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration11.stencil = ' ';
        int int19 = lwjgl3ApplicationConfiguration11.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration11.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int7 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.stencil = 8;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.a = 512;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int16 = lwjgl3ApplicationConfiguration0.windowWidth;
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int14 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener14;
        lwjgl3ApplicationConfiguration0.windowHeight = (byte) 0;
        int int18 = lwjgl3ApplicationConfiguration0.samples;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str5 = lwjgl3ApplicationConfiguration4.getpreferencesDirectory();
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration4.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType6;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        java.lang.Class<?> wildcardClass10 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".prefs/" + "'", str5, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        java.lang.Class<?> wildcardClass10 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) -1);
        int int16 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int13 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 480;
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        int int19 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 480 + "'", int19 == 480);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((-1));
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        lwjgl3ApplicationConfiguration0.b = 16;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int16 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 640;
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        boolean boolean21 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3WindowListener10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = '4';
        boolean boolean8 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int11 = lwjgl3ApplicationConfiguration0.windowX;
        java.lang.Class<?> wildcardClass12 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (short) 0;
        int int13 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.graphics.Color color14 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.samples = (byte) 10;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 480 + "'", int13 == 480);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean8 = lwjgl3ApplicationConfiguration7.getdisableAudio();
        boolean boolean9 = lwjgl3ApplicationConfiguration7.getwindowDecorated();
        boolean boolean10 = lwjgl3ApplicationConfiguration7.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str12 = lwjgl3ApplicationConfiguration11.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration11.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration11.hdpiMode = hdpiMode15;
        lwjgl3ApplicationConfiguration11.setWindowPosition((int) (short) 0, 100);
        int int20 = lwjgl3ApplicationConfiguration11.getwindowWidth();
        lwjgl3ApplicationConfiguration11.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration11.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType25 = lwjgl3ApplicationConfiguration11.preferencesFileType;
        lwjgl3ApplicationConfiguration11.useVsync(false);
        boolean boolean28 = lwjgl3ApplicationConfiguration11.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str30 = lwjgl3ApplicationConfiguration29.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration29.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration29.hdpiMode = hdpiMode33;
        lwjgl3ApplicationConfiguration29.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.graphics.Color color38 = lwjgl3ApplicationConfiguration29.initialBackgroundColor;
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color38;
        lwjgl3ApplicationConfiguration7.setInitialBackgroundColor(color38);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color38;
        java.lang.Class<?> wildcardClass42 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 640 + "'", int20 == 640);
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ".prefs/" + "'", str30, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode33 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode33.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration8.setWindowPosition((int) (short) 1, 0);
        lwjgl3ApplicationConfiguration8.setaudioDeviceBufferSize((int) (short) 1);
        int int14 = lwjgl3ApplicationConfiguration8.a;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.a = 512;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        lwjgl3ApplicationConfiguration0.windowY = 8;
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) (byte) 10, 8, 10, 10, 10, 3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((-1));
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        lwjgl3ApplicationConfiguration0.b = 16;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(8, (int) (short) 100, (int) (byte) 1, 8, (-1), (-1), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.Files.FileType fileType2 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean4 = lwjgl3ApplicationConfiguration3.getdisableAudio();
        boolean boolean5 = lwjgl3ApplicationConfiguration3.getwindowDecorated();
        boolean boolean6 = lwjgl3ApplicationConfiguration3.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = lwjgl3ApplicationConfiguration3.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode7;
        int int9 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType2 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType2.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((-1));
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int11 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        java.lang.Class<?> wildcardClass12 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 1, 9, (int) (byte) 10, 480, 0, 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 1, (int) (byte) -1);
        boolean boolean27 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setdepth((int) (short) 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 16, 0, 3, (int) (short) 0, (int) (byte) -1, (int) (byte) 100);
        int int18 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) (short) -1);
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 10);
        boolean boolean16 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(480);
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        boolean boolean13 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.a = 512;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        lwjgl3ApplicationConfiguration0.windowY = 8;
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        java.lang.Class<?> wildcardClass7 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.disableAudio;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.depth = 8;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', 9, (int) ' ', (int) (byte) 10, (int) ' ', 10, 9);
        lwjgl3ApplicationConfiguration0.windowX = 2;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (short) -1;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.stencil = (byte) -1;
        boolean boolean23 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowX = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode18;
        lwjgl3ApplicationConfiguration0.windowWidth = 9;
        int int22 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16);
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int14 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 640 + "'", int14 == 640);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        java.lang.String str3 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str6 = lwjgl3ApplicationConfiguration5.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration5.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration5.hdpiMode = hdpiMode9;
        lwjgl3ApplicationConfiguration5.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str14 = lwjgl3ApplicationConfiguration13.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration13.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean19 = lwjgl3ApplicationConfiguration13.vSyncEnabled;
        lwjgl3ApplicationConfiguration13.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType22 = lwjgl3ApplicationConfiguration13.preferencesFileType;
        lwjgl3ApplicationConfiguration5.preferencesFileType = fileType22;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType22);
        int int25 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".prefs/" + "'", str3, ".prefs/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode9 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode9.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + fileType22 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType22.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 16 + "'", int25 == 16);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = '4';
        int int8 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = ".prefs/";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 480 + "'", int8 == 480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = '4';
        int int8 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 480 + "'", int8 == 480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) (short) -1);
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((-1));
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode15;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode17 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode17;
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setsamples((int) ' ');
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(10);
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int17 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = '4';
        int int8 = lwjgl3ApplicationConfiguration0.windowHeight;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int10 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 480 + "'", int8 == 480);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.Class<?> wildcardClass10 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = '4';
        boolean boolean8 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 512;
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(10);
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener9;
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 640, 100);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(10);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int4 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(0);
        lwjgl3ApplicationConfiguration0.setwindowWidth(16);
        java.lang.Class<?> wildcardClass10 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 1;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 8);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, 9, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        int int18 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 2;
        lwjgl3ApplicationConfiguration0.depth = 480;
        int int11 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str13 = lwjgl3ApplicationConfiguration12.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration12.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean18 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        lwjgl3ApplicationConfiguration12.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType21 = lwjgl3ApplicationConfiguration12.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType21);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 480;
        int int29 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + fileType21 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType21.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getsamples();
        int int4 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int5 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 480 + "'", int4 == 480);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 16, (int) (short) 10);
        int int12 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.stencil = (byte) -1;
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (-1));
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        boolean boolean20 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener14;
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setsamples(97);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.setwindowWidth(10);
        int int9 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int4 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getuseGL30();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setwindowWidth(512);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setdepth(16);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) -1, (int) '4');
        int int18 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 640 + "'", int18 == 640);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int4 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.windowHeight = (byte) 100;
        java.lang.Class<?> wildcardClass11 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 480 + "'", int4 == 480);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) '#', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.windowX = 512;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.g = 52;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.windowY = ' ';
        int int14 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType17;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode19 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode19;
        int int21 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        int int22 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int23 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str9 = lwjgl3ApplicationConfiguration8.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration8.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean14 = lwjgl3ApplicationConfiguration8.vSyncEnabled;
        lwjgl3ApplicationConfiguration8.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType17 = lwjgl3ApplicationConfiguration8.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType17;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str20 = lwjgl3ApplicationConfiguration19.getpreferencesDirectory();
        com.badlogic.gdx.Files.FileType fileType21 = lwjgl3ApplicationConfiguration19.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean23 = lwjgl3ApplicationConfiguration22.getdisableAudio();
        boolean boolean24 = lwjgl3ApplicationConfiguration22.getwindowDecorated();
        boolean boolean25 = lwjgl3ApplicationConfiguration22.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = lwjgl3ApplicationConfiguration22.hdpiMode;
        lwjgl3ApplicationConfiguration19.hdpiMode = hdpiMode26;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode26;
        lwjgl3ApplicationConfiguration0.b = 0;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (short) -1;
        int int33 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + fileType17 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType17.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ".prefs/" + "'", str20, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType21 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType21.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 640 + "'", int33 == 640);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition(3, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int16 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.useVsync(true);
        int int19 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setdepth(97);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 10);
        lwjgl3ApplicationConfiguration0.stencil = (short) 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(2);
        java.lang.Class<?> wildcardClass6 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowX = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode18;
        lwjgl3ApplicationConfiguration0.windowWidth = 9;
        int int22 = lwjgl3ApplicationConfiguration0.windowX;
        int int23 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType9);
        lwjgl3ApplicationConfiguration0.g = 16;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int16 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = '4';
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        lwjgl3ApplicationConfiguration0.setsamples(16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        boolean boolean18 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.Files.FileType fileType19 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + fileType19 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType19.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int6 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.a = 480;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration11.title = "";
        lwjgl3ApplicationConfiguration11.windowHeight = 512;
        lwjgl3ApplicationConfiguration11.setwindowY((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.g = (short) -1;
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.title = "";
        int int14 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.windowY = ' ';
        int int14 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) (byte) -1);
        int int17 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode4 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 2;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNull(lwjgl3DisplayMode4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode13;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int16 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.g = '4';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str14 = lwjgl3ApplicationConfiguration13.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration13.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean19 = lwjgl3ApplicationConfiguration13.vSyncEnabled;
        lwjgl3ApplicationConfiguration13.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean22 = lwjgl3ApplicationConfiguration13.disableAudio;
        lwjgl3ApplicationConfiguration13.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = lwjgl3ApplicationConfiguration13.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration13.hdpiMode = hdpiMode26;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode26;
        lwjgl3ApplicationConfiguration0.setwindowX((-1));
        int int31 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 480;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.depth = 'a';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str13 = lwjgl3ApplicationConfiguration12.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration12.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean18 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        int int19 = lwjgl3ApplicationConfiguration12.getwindowY();
        int int20 = lwjgl3ApplicationConfiguration12.getdepth();
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration12.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration12.g = '4';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str26 = lwjgl3ApplicationConfiguration25.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration25.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean31 = lwjgl3ApplicationConfiguration25.vSyncEnabled;
        lwjgl3ApplicationConfiguration25.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean34 = lwjgl3ApplicationConfiguration25.disableAudio;
        lwjgl3ApplicationConfiguration25.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = lwjgl3ApplicationConfiguration25.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration25.hdpiMode = hdpiMode38;
        lwjgl3ApplicationConfiguration12.hdpiMode = hdpiMode38;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode38;
        java.lang.Class<?> wildcardClass42 = hdpiMode38.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ".prefs/" + "'", str26, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode37 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode37.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int4 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.windowY = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode7 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        java.lang.Class<?> wildcardClass8 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 480 + "'", int4 == 480);
        org.junit.Assert.assertNull(lwjgl3DisplayMode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.Files.FileType fileType2 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 100);
        lwjgl3ApplicationConfiguration0.a = 16;
        lwjgl3ApplicationConfiguration0.windowWidth = 640;
        int int10 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType2 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType2.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int8 = lwjgl3ApplicationConfiguration0.depth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str10 = lwjgl3ApplicationConfiguration9.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration9.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration9.hdpiMode = hdpiMode13;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode13);
        int int16 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 480 + "'", int16 == 480);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.windowY = ' ';
        int int14 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.windowWidth = (-1);
        int int19 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int3 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, 8);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((int) (short) 10);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 640 + "'", int3 == 640);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (short) 1, 100);
        lwjgl3ApplicationConfiguration0.setsamples(100);
        int int21 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.a = '#';
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setwindowX((int) '4');
        int int6 = lwjgl3ApplicationConfiguration0.stencil;
        int int7 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int13 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode14 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode14;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        boolean boolean18 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        lwjgl3ApplicationConfiguration0.depth = 480;
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setwindowWidth(100);
        int int18 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (-1), 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 480 + "'", int18 == 480);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 480;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int13 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration0.r = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str13 = lwjgl3ApplicationConfiguration12.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration12.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration12.hdpiMode = hdpiMode16;
        lwjgl3ApplicationConfiguration12.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.graphics.Color color21 = lwjgl3ApplicationConfiguration12.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color21;
        lwjgl3ApplicationConfiguration0.samples = (byte) -1;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(color21);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.windowX = (short) 10;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.r = (byte) 1;
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) -1);
        int int16 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(10);
        lwjgl3ApplicationConfiguration0.b = 10;
        lwjgl3ApplicationConfiguration0.windowWidth = (short) 10;
        int int16 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(512);
        int int12 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int13 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) '#', (int) (byte) -1);
        int int17 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int6 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.r = 3;
        lwjgl3ApplicationConfiguration0.setwindowY(0);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((int) (short) -1);
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int17 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int18 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode16 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode16;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean19 = lwjgl3ApplicationConfiguration18.getdisableAudio();
        boolean boolean20 = lwjgl3ApplicationConfiguration18.getwindowDecorated();
        lwjgl3ApplicationConfiguration18.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration18);
        boolean boolean24 = lwjgl3ApplicationConfiguration23.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean26 = lwjgl3ApplicationConfiguration25.getdisableAudio();
        boolean boolean27 = lwjgl3ApplicationConfiguration25.getwindowDecorated();
        lwjgl3ApplicationConfiguration25.setWindowedMode((int) 'a', (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean32 = lwjgl3ApplicationConfiguration31.getdisableAudio();
        int int33 = lwjgl3ApplicationConfiguration31.getwindowWidth();
        java.lang.String str34 = lwjgl3ApplicationConfiguration31.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str37 = lwjgl3ApplicationConfiguration36.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration36.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration36.hdpiMode = hdpiMode40;
        lwjgl3ApplicationConfiguration36.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str45 = lwjgl3ApplicationConfiguration44.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration44.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean50 = lwjgl3ApplicationConfiguration44.vSyncEnabled;
        lwjgl3ApplicationConfiguration44.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType53 = lwjgl3ApplicationConfiguration44.preferencesFileType;
        lwjgl3ApplicationConfiguration36.preferencesFileType = fileType53;
        lwjgl3ApplicationConfiguration31.setPreferencesConfig(".prefs/", fileType53);
        lwjgl3ApplicationConfiguration25.setpreferencesFileType(fileType53);
        lwjgl3ApplicationConfiguration23.preferencesFileType = fileType53;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType53;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass61 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3WindowListener10);
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 640 + "'", int33 == 640);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ".prefs/" + "'", str34, ".prefs/");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ".prefs/" + "'", str37, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ".prefs/" + "'", str45, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + fileType53 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType53.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int5 = lwjgl3ApplicationConfiguration0.b;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferCount;
        int int12 = lwjgl3ApplicationConfiguration10.getsamples();
        lwjgl3ApplicationConfiguration10.setgles30ContextMinorVersion((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.windowWidth = 0;
        lwjgl3ApplicationConfiguration0.windowHeight = (short) -1;
        lwjgl3ApplicationConfiguration0.setwindowY(52);
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.b = 9;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        int int16 = lwjgl3ApplicationConfiguration13.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode17 = lwjgl3ApplicationConfiguration13.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean20 = lwjgl3ApplicationConfiguration19.getdisableAudio();
        int int21 = lwjgl3ApplicationConfiguration19.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration19.title = "";
        lwjgl3ApplicationConfiguration19.setwindowDecorated(true);
        int int26 = lwjgl3ApplicationConfiguration19.r;
        lwjgl3ApplicationConfiguration19.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str31 = lwjgl3ApplicationConfiguration30.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration30.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration30.setgles30ContextMinorVersion(100);
        int int36 = lwjgl3ApplicationConfiguration30.windowX;
        com.badlogic.gdx.Files.FileType fileType37 = lwjgl3ApplicationConfiguration30.getpreferencesFileType();
        lwjgl3ApplicationConfiguration29.setpreferencesFileType(fileType37);
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("hi!", fileType37);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType37);
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType43 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNull(lwjgl3DisplayMode17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ".prefs/" + "'", str31, ".prefs/");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + fileType37 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType37.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType43 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType43.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int4 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = '#';
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 480 + "'", int4 == 480);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(10);
        lwjgl3ApplicationConfiguration0.b = 10;
        lwjgl3ApplicationConfiguration0.setResizable(false);
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.audioDeviceBufferCount = '#';
        boolean boolean13 = lwjgl3ApplicationConfiguration10.windowResizable;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) '4');
        lwjgl3ApplicationConfiguration0.r = 'a';
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration1 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = lwjgl3ApplicationConfiguration0.windowListener;
        int int10 = lwjgl3ApplicationConfiguration0.getdepth();
        int int11 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (short) 0;
        int int13 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setwindowHeight(16);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(0);
        lwjgl3ApplicationConfiguration0.setsamples(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 480 + "'", int13 == 480);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        lwjgl3ApplicationConfiguration0.depth = 480;
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        int int6 = lwjgl3ApplicationConfiguration0.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int13 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 480;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        boolean boolean18 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 16, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.Files.FileType fileType2 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 100);
        int int6 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 512;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType2 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType2.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.g = (short) -1;
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str12 = lwjgl3ApplicationConfiguration11.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration11.windowListener = lwjgl3WindowListener13;
        lwjgl3ApplicationConfiguration11.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration11.stencil = ' ';
        int int19 = lwjgl3ApplicationConfiguration11.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration11.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        com.badlogic.gdx.graphics.Color color24 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        boolean boolean25 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(color24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        int int4 = lwjgl3ApplicationConfiguration0.getdepth();
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int6 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int16 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 640;
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.windowHeight = 3;
        int int27 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.windowX = (short) 10;
        lwjgl3ApplicationConfiguration0.windowY = ' ';
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        int int15 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.windowWidth = 16;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str10 = lwjgl3ApplicationConfiguration9.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration9.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration9.hdpiMode = hdpiMode13;
        lwjgl3ApplicationConfiguration9.setWindowPosition((int) (short) 0, 100);
        int int18 = lwjgl3ApplicationConfiguration9.getwindowWidth();
        lwjgl3ApplicationConfiguration9.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration9.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration9.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType23);
        java.lang.Class<?> wildcardClass25 = fileType23.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 640 + "'", int18 == 640);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode16);
        int int18 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.b = 3;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) -1, 97);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        java.lang.String str3 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.graphics.Color color4 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        java.lang.Class<?> wildcardClass5 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".prefs/" + "'", str3, ".prefs/");
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) 10;
        int int11 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = '#';
        boolean boolean16 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.windowWidth = 16;
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str12 = lwjgl3ApplicationConfiguration11.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration11.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration11.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration11.gles30ContextMajorVersion = '4';
        lwjgl3ApplicationConfiguration11.useOpenGL3(false, 10, (int) ' ');
        lwjgl3ApplicationConfiguration11.setwindowY(640);
        lwjgl3ApplicationConfiguration11.setsamples(16);
        com.badlogic.gdx.Files.FileType fileType27 = lwjgl3ApplicationConfiguration11.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType27;
        int int29 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.initialVisible;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.samples = 512;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int16 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 640;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode19;
        int int21 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setdepth(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int2 = lwjgl3ApplicationConfiguration0.samples;
        int int3 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 480 + "'", int3 == 480);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int5 = lwjgl3ApplicationConfiguration0.b;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (short) 1;
        lwjgl3ApplicationConfiguration0.b = (-1);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(512);
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str13 = lwjgl3ApplicationConfiguration12.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration12.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean18 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        lwjgl3ApplicationConfiguration12.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType21 = lwjgl3ApplicationConfiguration12.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType21);
        int int23 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int24 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        boolean boolean25 = lwjgl3ApplicationConfiguration0.initialVisible;
        boolean boolean26 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + fileType21 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType21.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.setwindowWidth(10);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 'a';
        boolean boolean13 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int12 = lwjgl3ApplicationConfiguration0.g;
        int int13 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory(".prefs/");
        lwjgl3ApplicationConfiguration0.stencil = (short) -1;
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory(".prefs/");
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory(".prefs/");
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener17;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        boolean boolean16 = lwjgl3ApplicationConfiguration13.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = lwjgl3ApplicationConfiguration13.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode17);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int21 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 16;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.windowWidth = 3;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        int int12 = lwjgl3ApplicationConfiguration0.getsamples();
        int int13 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        int int11 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        int int17 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.g = (short) -1;
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.title = "";
        int int14 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.g = '4';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str14 = lwjgl3ApplicationConfiguration13.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration13.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean19 = lwjgl3ApplicationConfiguration13.vSyncEnabled;
        lwjgl3ApplicationConfiguration13.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean22 = lwjgl3ApplicationConfiguration13.disableAudio;
        lwjgl3ApplicationConfiguration13.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = lwjgl3ApplicationConfiguration13.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration13.hdpiMode = hdpiMode26;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode26;
        lwjgl3ApplicationConfiguration0.setwindowX((-1));
        int int31 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.depth = 512;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        java.lang.String str7 = lwjgl3ApplicationConfiguration0.title;
        int int8 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 640 + "'", int8 == 640);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int13 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 480;
        lwjgl3ApplicationConfiguration0.windowWidth = (short) -1;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.r = (byte) 100;
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean9 = lwjgl3ApplicationConfiguration8.vSyncEnabled;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((-1));
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        lwjgl3ApplicationConfiguration0.setwindowHeight(10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str15 = lwjgl3ApplicationConfiguration14.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration14.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration14.hdpiMode = hdpiMode18;
        lwjgl3ApplicationConfiguration14.setWindowPosition((int) (short) 0, 100);
        int int23 = lwjgl3ApplicationConfiguration14.getwindowWidth();
        lwjgl3ApplicationConfiguration14.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration14.setTitle(".prefs/");
        com.badlogic.gdx.graphics.Color color28 = lwjgl3ApplicationConfiguration14.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 640 + "'", int23 == 640);
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int4 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.windowY = 0;
        lwjgl3ApplicationConfiguration0.r = (short) 1;
        int int9 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 480 + "'", int4 == 480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        boolean boolean16 = lwjgl3ApplicationConfiguration13.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = lwjgl3ApplicationConfiguration13.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode17);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int21 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "hi!";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = '4';
        int int8 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        lwjgl3ApplicationConfiguration0.r = (byte) 100;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        int int15 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 480 + "'", int8 == 480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener12;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int4 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getuseGL30();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.r = (byte) 100;
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        java.lang.String str16 = lwjgl3ApplicationConfiguration0.title;
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.a = 512;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 0, 640, 9, (int) (byte) 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.stencil = 2;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int16 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 640;
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        int int13 = lwjgl3ApplicationConfiguration0.r;
        int int14 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int15 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.b = 'a';
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory(".prefs/");
        lwjgl3ApplicationConfiguration0.depth = (byte) 1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean17 = lwjgl3ApplicationConfiguration16.getdisableAudio();
        boolean boolean18 = lwjgl3ApplicationConfiguration16.getwindowDecorated();
        lwjgl3ApplicationConfiguration16.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        boolean boolean22 = lwjgl3ApplicationConfiguration21.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean24 = lwjgl3ApplicationConfiguration23.getdisableAudio();
        boolean boolean25 = lwjgl3ApplicationConfiguration23.getwindowDecorated();
        lwjgl3ApplicationConfiguration23.setWindowedMode((int) 'a', (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean30 = lwjgl3ApplicationConfiguration29.getdisableAudio();
        int int31 = lwjgl3ApplicationConfiguration29.getwindowWidth();
        java.lang.String str32 = lwjgl3ApplicationConfiguration29.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str35 = lwjgl3ApplicationConfiguration34.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration34.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration34.hdpiMode = hdpiMode38;
        lwjgl3ApplicationConfiguration34.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str43 = lwjgl3ApplicationConfiguration42.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration42.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean48 = lwjgl3ApplicationConfiguration42.vSyncEnabled;
        lwjgl3ApplicationConfiguration42.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType51 = lwjgl3ApplicationConfiguration42.preferencesFileType;
        lwjgl3ApplicationConfiguration34.preferencesFileType = fileType51;
        lwjgl3ApplicationConfiguration29.setPreferencesConfig(".prefs/", fileType51);
        lwjgl3ApplicationConfiguration23.setpreferencesFileType(fileType51);
        lwjgl3ApplicationConfiguration21.preferencesFileType = fileType51;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType51);
        boolean boolean57 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 640 + "'", int31 == 640);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ".prefs/" + "'", str32, ".prefs/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ".prefs/" + "'", str35, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + ".prefs/" + "'", str43, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + fileType51 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType51.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int8 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = '4';
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.b = 8;
        java.lang.Class<?> wildcardClass8 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.windowX = (byte) 100;
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener14;
        int int16 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        int int19 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        lwjgl3ApplicationConfiguration0.depth = 480;
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        int int17 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.g = (byte) 1;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) 1;
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int16 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 640;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        boolean boolean22 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) -1);
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setAudioConfig(8, 480, 1);
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int13 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) 0);
        int int10 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(512);
        int int13 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean17 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, 640, 100, (int) (short) 1, (int) 'a', 640, 1);
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, 0);
        lwjgl3ApplicationConfiguration0.r = 16;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) 0);
        int int10 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int11 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 640 + "'", int10 == 640);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(480);
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int11 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int12 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setWindowedMode(9, 32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 512;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setwindowY(97);
        lwjgl3ApplicationConfiguration0.windowX = (byte) 10;
        int int20 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 1;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(9, 16, (int) (byte) 100, 0, (int) 'a', 8, (int) '4');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int13 = lwjgl3ApplicationConfiguration0.windowY;
        int int14 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int15 = lwjgl3ApplicationConfiguration0.samples;
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 1, 9, (int) (byte) 10, 480, 0, 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str32 = lwjgl3ApplicationConfiguration31.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration31.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean37 = lwjgl3ApplicationConfiguration31.vSyncEnabled;
        lwjgl3ApplicationConfiguration31.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration31.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = lwjgl3ApplicationConfiguration31.windowListener;
        lwjgl3ApplicationConfiguration31.title = "";
        lwjgl3ApplicationConfiguration31.audioDeviceBufferSize = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = lwjgl3ApplicationConfiguration31.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode47);
        boolean boolean49 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        int int50 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ".prefs/" + "'", str32, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener42);
        org.junit.Assert.assertTrue("'" + hdpiMode47 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode47.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int15 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str13 = lwjgl3ApplicationConfiguration12.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration12.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration12.hdpiMode = hdpiMode16;
        lwjgl3ApplicationConfiguration12.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.graphics.Color color21 = lwjgl3ApplicationConfiguration12.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color21;
        lwjgl3ApplicationConfiguration0.windowY = 9;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(color21);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16);
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        int int16 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 480 + "'", int16 == 480);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.b = ' ';
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 0;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) 10, (int) (short) 1, 480, 3, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        lwjgl3ApplicationConfiguration0.depth = 480;
        int int14 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int17 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 640 + "'", int14 == 640);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 480 + "'", int17 == 480);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType9);
        lwjgl3ApplicationConfiguration0.g = 16;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        lwjgl3ApplicationConfiguration0.setwindowY((int) ' ');
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        int int19 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.a = (short) 1;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (byte) -1, (int) (short) -1);
        boolean boolean20 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        int int21 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = (byte) 1;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((-1));
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode14 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        int int15 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(lwjgl3DisplayMode14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        int int4 = lwjgl3ApplicationConfiguration0.getdepth();
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.Files.FileType fileType2 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean4 = lwjgl3ApplicationConfiguration3.getdisableAudio();
        boolean boolean5 = lwjgl3ApplicationConfiguration3.getwindowDecorated();
        boolean boolean6 = lwjgl3ApplicationConfiguration3.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = lwjgl3ApplicationConfiguration3.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode7;
        int int9 = lwjgl3ApplicationConfiguration0.g;
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (short) 100;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (short) 10, 9, (int) (byte) -1, 640, 16, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType2 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType2.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((-1));
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.stencil = (short) -1;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 1, 3);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        int int21 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (byte) -1);
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.setwindowWidth(0);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory(".prefs/");
        int int14 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener15;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int16 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(480);
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        boolean boolean13 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration14.vSyncEnabled = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        java.lang.String str7 = lwjgl3ApplicationConfiguration0.title;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.b = 1;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, 52, (int) '#');
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int16 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int4 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int5 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(512);
        lwjgl3ApplicationConfiguration0.setwindowX(1);
        java.lang.Class<?> wildcardClass12 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.windowX = (short) 10;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        int int10 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        lwjgl3ApplicationConfiguration0.depth = 480;
        int int14 = lwjgl3ApplicationConfiguration0.windowWidth;
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 640 + "'", int14 == 640);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        int int7 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean9 = lwjgl3ApplicationConfiguration8.getdisableAudio();
        boolean boolean10 = lwjgl3ApplicationConfiguration8.getwindowDecorated();
        int int11 = lwjgl3ApplicationConfiguration8.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration8.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean15 = lwjgl3ApplicationConfiguration14.getdisableAudio();
        int int16 = lwjgl3ApplicationConfiguration14.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration14.title = "";
        lwjgl3ApplicationConfiguration14.setwindowDecorated(true);
        int int21 = lwjgl3ApplicationConfiguration14.r;
        lwjgl3ApplicationConfiguration14.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str26 = lwjgl3ApplicationConfiguration25.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration25.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration25.setgles30ContextMinorVersion(100);
        int int31 = lwjgl3ApplicationConfiguration25.windowX;
        com.badlogic.gdx.Files.FileType fileType32 = lwjgl3ApplicationConfiguration25.getpreferencesFileType();
        lwjgl3ApplicationConfiguration24.setpreferencesFileType(fileType32);
        lwjgl3ApplicationConfiguration8.setPreferencesConfig("hi!", fileType32);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType32;
        lwjgl3ApplicationConfiguration0.windowX = (short) -1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener38);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ".prefs/" + "'", str26, ".prefs/");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        int int5 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 1;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int12 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.depth = 'a';
        int int12 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory(".prefs/");
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory(".prefs/");
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener17;
        int int19 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', (int) (short) 0);
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.Files.FileType fileType16 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType16 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType16.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowY(0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((-1));
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int14 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setwindowX((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        java.lang.String str3 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) (byte) 0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str11 = lwjgl3ApplicationConfiguration10.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration10.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration10.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration10.windowX = '#';
        lwjgl3ApplicationConfiguration10.setResizable(false);
        lwjgl3ApplicationConfiguration10.setTitle(".prefs/");
        int int22 = lwjgl3ApplicationConfiguration10.g;
        int int23 = lwjgl3ApplicationConfiguration10.r;
        int int24 = lwjgl3ApplicationConfiguration10.b;
        com.badlogic.gdx.graphics.Color color25 = lwjgl3ApplicationConfiguration10.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean27 = lwjgl3ApplicationConfiguration26.getdisableAudio();
        int int28 = lwjgl3ApplicationConfiguration26.getwindowWidth();
        int int29 = lwjgl3ApplicationConfiguration26.windowWidth;
        lwjgl3ApplicationConfiguration26.setwindowX((int) (short) 1);
        int int32 = lwjgl3ApplicationConfiguration26.samples;
        int int33 = lwjgl3ApplicationConfiguration26.getwindowX();
        com.badlogic.gdx.Files.FileType fileType34 = lwjgl3ApplicationConfiguration26.getpreferencesFileType();
        lwjgl3ApplicationConfiguration10.preferencesFileType = fileType34;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType34);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".prefs/" + "'", str3, ".prefs/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 640 + "'", int28 == 640);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 640 + "'", int29 == 640);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + fileType34 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType34.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        int int14 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setdepth((int) (short) 100);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode16);
        int int18 = lwjgl3ApplicationConfiguration0.windowY;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(10);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-1));
        lwjgl3ApplicationConfiguration0.setwindowY((int) (short) 0);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 1;
        int int19 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.Files.FileType fileType2 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean4 = lwjgl3ApplicationConfiguration3.getdisableAudio();
        boolean boolean5 = lwjgl3ApplicationConfiguration3.getwindowDecorated();
        boolean boolean6 = lwjgl3ApplicationConfiguration3.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = lwjgl3ApplicationConfiguration3.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode7;
        int int9 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int12 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType2 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType2.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 100);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int8 = lwjgl3ApplicationConfiguration0.depth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str10 = lwjgl3ApplicationConfiguration9.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration9.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration9.hdpiMode = hdpiMode13;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode13);
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        lwjgl3ApplicationConfiguration0.depth = 480;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str15 = lwjgl3ApplicationConfiguration14.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration14.windowListener = lwjgl3WindowListener16;
        lwjgl3ApplicationConfiguration14.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration14.stencil = ' ';
        int int22 = lwjgl3ApplicationConfiguration14.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration14.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType23;
        int int25 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int26 = lwjgl3ApplicationConfiguration0.getwindowX();
        boolean boolean27 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        int int30 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 640 + "'", int25 == 640);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 640 + "'", int30 == 640);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 1, 9, (int) (byte) 10, 480, 0, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean24 = lwjgl3ApplicationConfiguration23.getdisableAudio();
        int int25 = lwjgl3ApplicationConfiguration23.getaudioDeviceBufferCount();
        int int26 = lwjgl3ApplicationConfiguration23.getsamples();
        int int27 = lwjgl3ApplicationConfiguration23.getwindowHeight();
        lwjgl3ApplicationConfiguration23.setdepth((int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = lwjgl3ApplicationConfiguration23.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean32 = lwjgl3ApplicationConfiguration31.getdisableAudio();
        boolean boolean33 = lwjgl3ApplicationConfiguration31.getwindowDecorated();
        boolean boolean34 = lwjgl3ApplicationConfiguration31.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str36 = lwjgl3ApplicationConfiguration35.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration35.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration35.hdpiMode = hdpiMode39;
        lwjgl3ApplicationConfiguration35.setWindowPosition((int) (short) 0, 100);
        int int44 = lwjgl3ApplicationConfiguration35.getwindowWidth();
        lwjgl3ApplicationConfiguration35.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration35.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType49 = lwjgl3ApplicationConfiguration35.preferencesFileType;
        lwjgl3ApplicationConfiguration35.useVsync(false);
        boolean boolean52 = lwjgl3ApplicationConfiguration35.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str54 = lwjgl3ApplicationConfiguration53.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration53.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode57 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration53.hdpiMode = hdpiMode57;
        lwjgl3ApplicationConfiguration53.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.graphics.Color color62 = lwjgl3ApplicationConfiguration53.initialBackgroundColor;
        lwjgl3ApplicationConfiguration35.initialBackgroundColor = color62;
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color62);
        com.badlogic.gdx.Files.FileType fileType65 = lwjgl3ApplicationConfiguration31.getpreferencesFileType();
        lwjgl3ApplicationConfiguration23.preferencesFileType = fileType65;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType65;
        int int68 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(640);
        lwjgl3ApplicationConfiguration0.setWindowPosition(2, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 480 + "'", int27 == 480);
        org.junit.Assert.assertNull(lwjgl3WindowListener30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ".prefs/" + "'", str36, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 640 + "'", int44 == 640);
        org.junit.Assert.assertTrue("'" + fileType49 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType49.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + ".prefs/" + "'", str54, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode57 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode57.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertTrue("'" + fileType65 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType65.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.stencil = 10;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 2;
        int int9 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) 'a');
        lwjgl3ApplicationConfiguration0.windowY = 9;
        lwjgl3ApplicationConfiguration0.stencil = 640;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int4 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.windowY = 0;
        int int7 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 16, (int) '4', 480, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 480 + "'", int4 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 640 + "'", int7 == 640);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int5 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str7 = lwjgl3ApplicationConfiguration6.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration6.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean12 = lwjgl3ApplicationConfiguration6.vSyncEnabled;
        lwjgl3ApplicationConfiguration6.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean15 = lwjgl3ApplicationConfiguration6.disableAudio;
        lwjgl3ApplicationConfiguration6.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = null;
        lwjgl3ApplicationConfiguration6.fullscreenMode = lwjgl3DisplayMode18;
        boolean boolean20 = lwjgl3ApplicationConfiguration6.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str23 = lwjgl3ApplicationConfiguration22.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration22.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean28 = lwjgl3ApplicationConfiguration22.vSyncEnabled;
        lwjgl3ApplicationConfiguration22.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration22.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration22.audioDeviceSimultaneousSources = (short) 10;
        lwjgl3ApplicationConfiguration22.setdisableAudio(true);
        lwjgl3ApplicationConfiguration22.useOpenGL3(true, 1, 3);
        lwjgl3ApplicationConfiguration22.setwindowY(1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str45 = lwjgl3ApplicationConfiguration44.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration44.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration44.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration44.windowX = '#';
        lwjgl3ApplicationConfiguration44.setResizable(false);
        lwjgl3ApplicationConfiguration44.setTitle(".prefs/");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str57 = lwjgl3ApplicationConfiguration56.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration56.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean62 = lwjgl3ApplicationConfiguration56.vSyncEnabled;
        lwjgl3ApplicationConfiguration56.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType65 = lwjgl3ApplicationConfiguration56.preferencesFileType;
        lwjgl3ApplicationConfiguration44.setpreferencesFileType(fileType65);
        lwjgl3ApplicationConfiguration44.setaudioDeviceSimultaneousSources((int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration70 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str71 = lwjgl3ApplicationConfiguration70.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration70.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str75 = lwjgl3ApplicationConfiguration74.getpreferencesDirectory();
        com.badlogic.gdx.Files.FileType fileType76 = lwjgl3ApplicationConfiguration74.getpreferencesFileType();
        lwjgl3ApplicationConfiguration70.preferencesFileType = fileType76;
        lwjgl3ApplicationConfiguration44.setPreferencesConfig(".prefs/", fileType76);
        lwjgl3ApplicationConfiguration22.setPreferencesConfig("hi!", fileType76);
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType76);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType76);
        lwjgl3ApplicationConfiguration0.stencil = (short) 0;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ".prefs/" + "'", str23, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ".prefs/" + "'", str45, ".prefs/");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + ".prefs/" + "'", str57, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + fileType65 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType65.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + ".prefs/" + "'", str71, ".prefs/");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + ".prefs/" + "'", str75, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType76 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType76.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = '4';
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.g = (short) -1;
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str12 = lwjgl3ApplicationConfiguration11.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration11.windowListener = lwjgl3WindowListener13;
        lwjgl3ApplicationConfiguration11.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration11.stencil = ' ';
        int int19 = lwjgl3ApplicationConfiguration11.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration11.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        com.badlogic.gdx.graphics.Color color24 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(color24);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        int int8 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str10 = lwjgl3ApplicationConfiguration9.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration9.windowListener = lwjgl3WindowListener11;
        lwjgl3ApplicationConfiguration9.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration9.stencil = ' ';
        int int17 = lwjgl3ApplicationConfiguration9.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration9.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration9.audioDeviceBufferCount = (short) 0;
        int int22 = lwjgl3ApplicationConfiguration9.windowHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str24 = lwjgl3ApplicationConfiguration23.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration23.windowListener = lwjgl3WindowListener25;
        lwjgl3ApplicationConfiguration23.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration23.stencil = ' ';
        int int31 = lwjgl3ApplicationConfiguration23.getaudioDeviceSimultaneousSources();
        int int32 = lwjgl3ApplicationConfiguration23.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration23.setaudioDeviceSimultaneousSources(480);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str37 = lwjgl3ApplicationConfiguration36.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3ApplicationConfiguration36.windowListener = lwjgl3WindowListener38;
        lwjgl3ApplicationConfiguration36.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration36.stencil = ' ';
        int int44 = lwjgl3ApplicationConfiguration36.getaudioDeviceSimultaneousSources();
        int int45 = lwjgl3ApplicationConfiguration36.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration36.setaudioDeviceBufferSize(512);
        com.badlogic.gdx.Files.FileType fileType48 = lwjgl3ApplicationConfiguration36.preferencesFileType;
        lwjgl3ApplicationConfiguration23.setPreferencesConfig(".prefs/", fileType48);
        lwjgl3ApplicationConfiguration9.setpreferencesFileType(fileType48);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType48);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(512);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 640 + "'", int8 == 640);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 480 + "'", int22 == 480);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ".prefs/" + "'", str24, ".prefs/");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16 + "'", int31 == 16);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 512 + "'", int32 == 512);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ".prefs/" + "'", str37, ".prefs/");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 16 + "'", int44 == 16);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 512 + "'", int45 == 512);
        org.junit.Assert.assertTrue("'" + fileType48 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType48.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean6 = lwjgl3ApplicationConfiguration5.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean8 = lwjgl3ApplicationConfiguration7.getdisableAudio();
        boolean boolean9 = lwjgl3ApplicationConfiguration7.getwindowDecorated();
        lwjgl3ApplicationConfiguration7.setWindowedMode((int) 'a', (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        int int15 = lwjgl3ApplicationConfiguration13.getwindowWidth();
        java.lang.String str16 = lwjgl3ApplicationConfiguration13.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str19 = lwjgl3ApplicationConfiguration18.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration18.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration18.hdpiMode = hdpiMode22;
        lwjgl3ApplicationConfiguration18.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str27 = lwjgl3ApplicationConfiguration26.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration26.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean32 = lwjgl3ApplicationConfiguration26.vSyncEnabled;
        lwjgl3ApplicationConfiguration26.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType35 = lwjgl3ApplicationConfiguration26.preferencesFileType;
        lwjgl3ApplicationConfiguration18.preferencesFileType = fileType35;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig(".prefs/", fileType35);
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType35);
        lwjgl3ApplicationConfiguration5.preferencesFileType = fileType35;
        int int40 = lwjgl3ApplicationConfiguration5.getgles30ContextMajorVersion();
        int int41 = lwjgl3ApplicationConfiguration5.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".prefs/" + "'", str16, ".prefs/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".prefs/" + "'", str19, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ".prefs/" + "'", str27, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + fileType35 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType35.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 16 + "'", int41 == 16);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean16 = lwjgl3ApplicationConfiguration15.getdisableAudio();
        int int17 = lwjgl3ApplicationConfiguration15.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration15.title = "";
        lwjgl3ApplicationConfiguration15.setwindowDecorated(true);
        int int22 = lwjgl3ApplicationConfiguration15.r;
        lwjgl3ApplicationConfiguration15.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str26 = lwjgl3ApplicationConfiguration25.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration25.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration25.hdpiMode = hdpiMode29;
        lwjgl3ApplicationConfiguration25.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.graphics.Color color34 = lwjgl3ApplicationConfiguration25.initialBackgroundColor;
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color34;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color34;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ".prefs/" + "'", str26, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(color34);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 1, 9, (int) (byte) 10, 480, 0, 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(0);
        int int31 = lwjgl3ApplicationConfiguration0.getdepth();
        java.lang.String str32 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.samples = 35;
        int int35 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 480 + "'", int31 == 480);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ".prefs/" + "'", str32, ".prefs/");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 480 + "'", int35 == 480);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str13 = lwjgl3ApplicationConfiguration12.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration12.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean18 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        lwjgl3ApplicationConfiguration12.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType21 = lwjgl3ApplicationConfiguration12.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType21);
        int int23 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + fileType21 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType21.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = '4';
        int int8 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(16);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 480 + "'", int8 == 480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) -1);
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setAudioConfig(8, 480, 1);
        int int12 = lwjgl3ApplicationConfiguration0.getwindowY();
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.b = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        boolean boolean16 = lwjgl3ApplicationConfiguration13.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = lwjgl3ApplicationConfiguration13.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int20 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setwindowY(16);
        int int23 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 480 + "'", int23 == 480);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        int int9 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.samples = (byte) 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) ' ', 480, (int) 'a', 16, 0, 100);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(16, (int) (short) 10, (int) (byte) 100, 100, 480, 640, 97);
        boolean boolean34 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) 0);
        int int10 = lwjgl3ApplicationConfiguration0.getdepth();
        int int11 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str15 = lwjgl3ApplicationConfiguration14.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration14.windowListener = lwjgl3WindowListener16;
        lwjgl3ApplicationConfiguration14.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration14.stencil = ' ';
        int int22 = lwjgl3ApplicationConfiguration14.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration14.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration14.setaudioDeviceBufferSize(16);
        lwjgl3ApplicationConfiguration14.title = ".prefs/";
        com.badlogic.gdx.graphics.Color color29 = lwjgl3ApplicationConfiguration14.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color29;
        boolean boolean31 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) 'a');
        int int10 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        boolean boolean16 = lwjgl3ApplicationConfiguration13.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = lwjgl3ApplicationConfiguration13.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 'a';
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (short) 1, (int) (byte) 10, (int) 'a', (int) (byte) 0, (int) (byte) 0);
        boolean boolean30 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int13 = lwjgl3ApplicationConfiguration0.windowY;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.depth = 8;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.b = (byte) -1;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        int int12 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.windowX = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener17;
        int int19 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.b = 'a';
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.windowY = ' ';
        int int14 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.windowX = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode17 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode17;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((-1));
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = 10;
        boolean boolean18 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferCount;
        int int12 = lwjgl3ApplicationConfiguration10.getsamples();
        java.lang.Class<?> wildcardClass13 = lwjgl3ApplicationConfiguration10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setdepth(16);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) -1, (int) '4');
        java.lang.String str18 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int19 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".prefs/" + "'", str18, ".prefs/");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int20 = lwjgl3ApplicationConfiguration19.getwindowWidth();
        boolean boolean21 = lwjgl3ApplicationConfiguration19.useGL30;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 640 + "'", int20 == 640);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int11 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.g = (short) -1;
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str12 = lwjgl3ApplicationConfiguration11.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration11.windowListener = lwjgl3WindowListener13;
        lwjgl3ApplicationConfiguration11.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration11.stencil = ' ';
        int int19 = lwjgl3ApplicationConfiguration11.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration11.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        com.badlogic.gdx.graphics.Color color24 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        int int27 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(color24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        lwjgl3ApplicationConfiguration0.depth = 480;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str15 = lwjgl3ApplicationConfiguration14.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration14.windowListener = lwjgl3WindowListener16;
        lwjgl3ApplicationConfiguration14.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration14.stencil = ' ';
        int int22 = lwjgl3ApplicationConfiguration14.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration14.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType23;
        int int25 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.stencil = (short) 1;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 640 + "'", int25 == 640);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(480);
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (short) 1);
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        java.lang.String str3 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".prefs/" + "'", str3, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3WindowListener4);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int4 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int8 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 480 + "'", int4 == 480);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(480);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str14 = lwjgl3ApplicationConfiguration13.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration13.windowListener = lwjgl3WindowListener15;
        lwjgl3ApplicationConfiguration13.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration13.stencil = ' ';
        int int21 = lwjgl3ApplicationConfiguration13.getaudioDeviceSimultaneousSources();
        int int22 = lwjgl3ApplicationConfiguration13.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration13.setaudioDeviceBufferSize(512);
        com.badlogic.gdx.Files.FileType fileType25 = lwjgl3ApplicationConfiguration13.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        int int29 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int30 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = '4';
        int int8 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.windowHeight = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode13 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode13;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 480 + "'", int8 == 480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = '4';
        boolean boolean8 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int11 = lwjgl3ApplicationConfiguration0.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        int int11 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) '4');
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(0);
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int12 = lwjgl3ApplicationConfiguration0.g;
        int int13 = lwjgl3ApplicationConfiguration0.r;
        int int14 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode15;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType17;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode19 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode19;
        com.badlogic.gdx.graphics.Color color21 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.windowY = 480;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color21);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowX = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        boolean boolean20 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 1;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setWindowedMode(16, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int15 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNull(lwjgl3WindowListener10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, 32);
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.graphics.Color color14 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str16 = lwjgl3ApplicationConfiguration15.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration15.windowListener = lwjgl3WindowListener17;
        lwjgl3ApplicationConfiguration15.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = null;
        lwjgl3ApplicationConfiguration15.hdpiMode = hdpiMode21;
        lwjgl3ApplicationConfiguration15.useOpenGL3(false, (int) (byte) 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str28 = lwjgl3ApplicationConfiguration27.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration27.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration27.hdpiMode = hdpiMode31;
        lwjgl3ApplicationConfiguration27.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.graphics.Color color36 = lwjgl3ApplicationConfiguration27.initialBackgroundColor;
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color36;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color36;
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, 100);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".prefs/" + "'", str16, ".prefs/");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ".prefs/" + "'", str28, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(color36);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 1, 3);
        lwjgl3ApplicationConfiguration0.setwindowY(1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str23 = lwjgl3ApplicationConfiguration22.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration22.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration22.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration22.windowX = '#';
        lwjgl3ApplicationConfiguration22.setResizable(false);
        lwjgl3ApplicationConfiguration22.setTitle(".prefs/");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str35 = lwjgl3ApplicationConfiguration34.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration34.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean40 = lwjgl3ApplicationConfiguration34.vSyncEnabled;
        lwjgl3ApplicationConfiguration34.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType43 = lwjgl3ApplicationConfiguration34.preferencesFileType;
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType43);
        lwjgl3ApplicationConfiguration22.setaudioDeviceSimultaneousSources((int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str49 = lwjgl3ApplicationConfiguration48.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration48.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str53 = lwjgl3ApplicationConfiguration52.getpreferencesDirectory();
        com.badlogic.gdx.Files.FileType fileType54 = lwjgl3ApplicationConfiguration52.getpreferencesFileType();
        lwjgl3ApplicationConfiguration48.preferencesFileType = fileType54;
        lwjgl3ApplicationConfiguration22.setPreferencesConfig(".prefs/", fileType54);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType54);
        int int58 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ".prefs/" + "'", str23, ".prefs/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ".prefs/" + "'", str35, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + fileType43 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType43.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + ".prefs/" + "'", str49, ".prefs/");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + ".prefs/" + "'", str53, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType54 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType54.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.windowX = (byte) 100;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3WindowListener9);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int5 = lwjgl3ApplicationConfiguration0.b;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.stencil = (byte) 100;
        int int12 = lwjgl3ApplicationConfiguration0.stencil;
        int int13 = lwjgl3ApplicationConfiguration0.windowY;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(480);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.b = '#';
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        int int5 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        int int6 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        java.lang.Class<?> wildcardClass7 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        int int11 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 9;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.windowY = (short) 10;
        int int20 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = '4';
        int int8 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(16);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode15;
        int int17 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 480 + "'", int8 == 480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 1;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 8);
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) 10);
        lwjgl3ApplicationConfiguration0.windowX = 32;
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.windowX = (short) 10;
        lwjgl3ApplicationConfiguration0.windowY = ' ';
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(640, 0, (-1));
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (short) 1);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        int int8 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.title = "hi!";
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (byte) -1;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 640 + "'", int8 == 640);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.windowX = (short) 10;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str9 = lwjgl3ApplicationConfiguration8.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration8.windowListener = lwjgl3WindowListener10;
        lwjgl3ApplicationConfiguration8.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration8.stencil = ' ';
        int int16 = lwjgl3ApplicationConfiguration8.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration8.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration8.setaudioDeviceBufferSize(16);
        lwjgl3ApplicationConfiguration8.title = ".prefs/";
        com.badlogic.gdx.graphics.Color color23 = lwjgl3ApplicationConfiguration8.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str27 = lwjgl3ApplicationConfiguration26.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration26.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean32 = lwjgl3ApplicationConfiguration26.vSyncEnabled;
        lwjgl3ApplicationConfiguration26.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean35 = lwjgl3ApplicationConfiguration26.disableAudio;
        lwjgl3ApplicationConfiguration26.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = lwjgl3ApplicationConfiguration26.hdpiMode;
        boolean boolean39 = lwjgl3ApplicationConfiguration26.getvSyncEnabled();
        com.badlogic.gdx.Files.FileType fileType40 = lwjgl3ApplicationConfiguration26.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType40);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode42 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ".prefs/" + "'", str27, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + fileType40 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType40.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3DisplayMode42);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int10 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str12 = lwjgl3ApplicationConfiguration11.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration11.windowListener = lwjgl3WindowListener13;
        lwjgl3ApplicationConfiguration11.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration11.setsamples((int) (byte) 100);
        lwjgl3ApplicationConfiguration11.setgles30ContextMinorVersion((int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = lwjgl3ApplicationConfiguration11.windowListener;
        lwjgl3ApplicationConfiguration11.setpreferencesDirectory("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = lwjgl3ApplicationConfiguration11.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode24);
        int int26 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.g = ' ';
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3WindowListener21);
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.windowWidth = 9;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.depth = 8;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', 9, (int) ' ', (int) (byte) 10, (int) ' ', 10, 9);
        lwjgl3ApplicationConfiguration0.windowX = 2;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (short) -1;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((int) (short) 1);
        boolean boolean23 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = lwjgl3ApplicationConfiguration0.windowListener;
        int int11 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.samples = 1;
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3WindowListener10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        lwjgl3ApplicationConfiguration0.depth = 480;
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int15 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.windowY = ' ';
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 1;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.useGL30;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int14 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        lwjgl3ApplicationConfiguration0.depth = 480;
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int15 = lwjgl3ApplicationConfiguration0.stencil;
        boolean boolean16 = lwjgl3ApplicationConfiguration0.windowResizable;
        com.badlogic.gdx.Files.FileType fileType17 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + fileType17 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType17.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int6 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.a = 480;
        int int11 = lwjgl3ApplicationConfiguration0.windowHeight;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = ' ';
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.windowX = 480;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setsamples(640);
        int int22 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (byte) 100);
        int int12 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.r = (byte) 100;
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str17 = lwjgl3ApplicationConfiguration16.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration16.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean22 = lwjgl3ApplicationConfiguration16.vSyncEnabled;
        int int23 = lwjgl3ApplicationConfiguration16.getwindowY();
        int int24 = lwjgl3ApplicationConfiguration16.getdepth();
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration16.setFullscreenMode(displayMode25);
        int int27 = lwjgl3ApplicationConfiguration16.getwindowX();
        boolean boolean28 = lwjgl3ApplicationConfiguration16.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str30 = lwjgl3ApplicationConfiguration29.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration29.windowListener = lwjgl3WindowListener31;
        lwjgl3ApplicationConfiguration29.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode35 = null;
        lwjgl3ApplicationConfiguration29.hdpiMode = hdpiMode35;
        lwjgl3ApplicationConfiguration29.setgles30ContextMajorVersion((int) (byte) 0);
        com.badlogic.gdx.graphics.Color color39 = lwjgl3ApplicationConfiguration29.initialBackgroundColor;
        lwjgl3ApplicationConfiguration16.initialBackgroundColor = color39;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color39);
        lwjgl3ApplicationConfiguration0.windowY = (short) 100;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener44 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str46 = lwjgl3ApplicationConfiguration45.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration45.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode49 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration45.hdpiMode = hdpiMode49;
        lwjgl3ApplicationConfiguration45.setWindowPosition((int) (short) 0, 100);
        int int54 = lwjgl3ApplicationConfiguration45.getwindowWidth();
        lwjgl3ApplicationConfiguration45.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration45.windowY = ' ';
        int int59 = lwjgl3ApplicationConfiguration45.getwindowX();
        lwjgl3ApplicationConfiguration45.setaudioDeviceSimultaneousSources((int) (byte) -1);
        lwjgl3ApplicationConfiguration45.windowY = (byte) 100;
        boolean boolean64 = lwjgl3ApplicationConfiguration45.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str66 = lwjgl3ApplicationConfiguration65.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration65.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode69 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration65.hdpiMode = hdpiMode69;
        lwjgl3ApplicationConfiguration65.setWindowPosition((int) (short) 0, 100);
        int int74 = lwjgl3ApplicationConfiguration65.getwindowWidth();
        lwjgl3ApplicationConfiguration65.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration65.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType79 = lwjgl3ApplicationConfiguration65.preferencesFileType;
        lwjgl3ApplicationConfiguration65.windowHeight = (byte) 1;
        int int82 = lwjgl3ApplicationConfiguration65.getdepth();
        lwjgl3ApplicationConfiguration65.gles30ContextMinorVersion = 2;
        boolean boolean85 = lwjgl3ApplicationConfiguration65.getwindowResizable();
        lwjgl3ApplicationConfiguration65.setWindowPosition(2, (int) (byte) 0);
        boolean boolean89 = lwjgl3ApplicationConfiguration65.getvSyncEnabled();
        com.badlogic.gdx.Files.FileType fileType90 = lwjgl3ApplicationConfiguration65.getpreferencesFileType();
        lwjgl3ApplicationConfiguration45.setpreferencesFileType(fileType90);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType90);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".prefs/" + "'", str17, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ".prefs/" + "'", str30, ".prefs/");
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNull(lwjgl3WindowListener44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ".prefs/" + "'", str46, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 640 + "'", int54 == 640);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + ".prefs/" + "'", str66, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode69 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode69.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 640 + "'", int74 == 640);
        org.junit.Assert.assertTrue("'" + fileType79 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType79.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 16 + "'", int82 == 16);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + fileType90 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType90.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(480);
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        boolean boolean13 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration14.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int8 = lwjgl3ApplicationConfiguration0.depth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str10 = lwjgl3ApplicationConfiguration9.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration9.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration9.hdpiMode = hdpiMode13;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode13);
        int int16 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        com.badlogic.gdx.Files.FileType fileType5 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setwindowX(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.windowX = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.title = "";
        boolean boolean21 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3WindowListener10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        int int4 = lwjgl3ApplicationConfiguration0.getdepth();
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int6 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str16 = lwjgl3ApplicationConfiguration15.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration15.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration15.hdpiMode = hdpiMode19;
        lwjgl3ApplicationConfiguration15.audioDeviceSimultaneousSources = (byte) 0;
        lwjgl3ApplicationConfiguration15.useVsync(false);
        lwjgl3ApplicationConfiguration15.setaudioDeviceBufferCount((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str28 = lwjgl3ApplicationConfiguration27.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration27.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean33 = lwjgl3ApplicationConfiguration27.vSyncEnabled;
        lwjgl3ApplicationConfiguration27.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration27.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration27.audioDeviceSimultaneousSources = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean41 = lwjgl3ApplicationConfiguration40.getdisableAudio();
        boolean boolean42 = lwjgl3ApplicationConfiguration40.getwindowDecorated();
        boolean boolean43 = lwjgl3ApplicationConfiguration40.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = lwjgl3ApplicationConfiguration40.hdpiMode;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode44);
        com.badlogic.gdx.graphics.Color color46 = lwjgl3ApplicationConfiguration27.initialBackgroundColor;
        lwjgl3ApplicationConfiguration15.setInitialBackgroundColor(color46);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color46;
        lwjgl3ApplicationConfiguration0.windowWidth = (short) 1;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".prefs/" + "'", str16, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ".prefs/" + "'", str28, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(color46);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 16, (int) (short) 10);
        int int12 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.stencil = (byte) -1;
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (-1));
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) '4');
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowX = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode18;
        lwjgl3ApplicationConfiguration0.windowWidth = 9;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean23 = lwjgl3ApplicationConfiguration22.getdisableAudio();
        int int24 = lwjgl3ApplicationConfiguration22.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration22.title = "";
        lwjgl3ApplicationConfiguration22.setwindowDecorated(true);
        int int29 = lwjgl3ApplicationConfiguration22.r;
        com.badlogic.gdx.Files.FileType fileType30 = lwjgl3ApplicationConfiguration22.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType30;
        int int32 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertTrue("'" + fileType30 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType30.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 16 + "'", int32 == 16);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.title = "";
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean11 = lwjgl3ApplicationConfiguration10.getdisableAudio();
        int int12 = lwjgl3ApplicationConfiguration10.getwindowWidth();
        java.lang.String str13 = lwjgl3ApplicationConfiguration10.getpreferencesDirectory();
        com.badlogic.gdx.graphics.Color color14 = lwjgl3ApplicationConfiguration10.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color14;
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.samples = '#';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        int int13 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) -1);
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setAudioConfig(8, 480, 1);
        int int12 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) 1);
        boolean boolean16 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType9);
        lwjgl3ApplicationConfiguration0.g = 16;
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) '#');
        lwjgl3ApplicationConfiguration0.windowX = (short) -1;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(512);
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3WindowListener10);
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowX = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode18;
        lwjgl3ApplicationConfiguration0.windowWidth = 9;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean25 = lwjgl3ApplicationConfiguration24.getdisableAudio();
        int int26 = lwjgl3ApplicationConfiguration24.getwindowWidth();
        java.lang.String str27 = lwjgl3ApplicationConfiguration24.getpreferencesDirectory();
        com.badlogic.gdx.graphics.Color color28 = lwjgl3ApplicationConfiguration24.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color28;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 640 + "'", int26 == 640);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ".prefs/" + "'", str27, ".prefs/");
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setdepth(16);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) -1, (int) '4');
        boolean boolean18 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.setwindowWidth(10);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 10;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        int int19 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(lwjgl3DisplayMode11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.windowY = ' ';
        int int14 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setwindowWidth(1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setdepth(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener11;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        java.lang.String str3 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str6 = lwjgl3ApplicationConfiguration5.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration5.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration5.hdpiMode = hdpiMode9;
        lwjgl3ApplicationConfiguration5.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str14 = lwjgl3ApplicationConfiguration13.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration13.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean19 = lwjgl3ApplicationConfiguration13.vSyncEnabled;
        lwjgl3ApplicationConfiguration13.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType22 = lwjgl3ApplicationConfiguration13.preferencesFileType;
        lwjgl3ApplicationConfiguration5.preferencesFileType = fileType22;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType22);
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".prefs/" + "'", str3, ".prefs/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode9 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode9.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + fileType22 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType22.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int16 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType9);
        lwjgl3ApplicationConfiguration0.stencil = 0;
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.windowHeight = 0;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int4 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.title = "hi!";
        int int8 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setsamples(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode11;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 480 + "'", int4 == 480);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 1;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 8);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, 9, (int) (short) 0);
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 10, 100, (int) 'a', (int) (short) -1, (int) (short) 0, 16);
        lwjgl3ApplicationConfiguration0.r = (-1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener25;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.g = (short) -1;
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.title = "";
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setResizable(false);
        int int17 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode18;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 480 + "'", int17 == 480);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int5 = lwjgl3ApplicationConfiguration0.b;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.r = 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType13;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.r = 100;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(lwjgl3WindowListener15);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(480);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str14 = lwjgl3ApplicationConfiguration13.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration13.windowListener = lwjgl3WindowListener15;
        lwjgl3ApplicationConfiguration13.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration13.stencil = ' ';
        int int21 = lwjgl3ApplicationConfiguration13.getaudioDeviceSimultaneousSources();
        int int22 = lwjgl3ApplicationConfiguration13.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration13.setaudioDeviceBufferSize(512);
        com.badlogic.gdx.Files.FileType fileType25 = lwjgl3ApplicationConfiguration13.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        int int29 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 480 + "'", int29 == 480);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int4 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.windowX = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 480 + "'", int4 == 480);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        int int9 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = '4';
        int int8 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.windowWidth = (byte) 1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 480 + "'", int8 == 480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((-1));
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener16;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int19 = lwjgl3ApplicationConfiguration18.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration18.title = "hi!";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int8 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.g = (byte) 0;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        int int12 = lwjgl3ApplicationConfiguration0.b;
        java.lang.Class<?> wildcardClass13 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 1;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setWindowedMode(16, (int) ' ');
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNull(lwjgl3WindowListener10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int13 = lwjgl3ApplicationConfiguration0.windowY;
        int int14 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.g = (short) 100;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 1, 3);
        java.lang.String str21 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".prefs/" + "'", str21, ".prefs/");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str5 = lwjgl3ApplicationConfiguration4.getpreferencesDirectory();
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration4.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType6;
        java.lang.Class<?> wildcardClass8 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".prefs/" + "'", str5, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setwindowY(8);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 2;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean17 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str19 = lwjgl3ApplicationConfiguration18.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration18.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration18.hdpiMode = hdpiMode22;
        lwjgl3ApplicationConfiguration18.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.graphics.Color color27 = lwjgl3ApplicationConfiguration18.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color27;
        boolean boolean29 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.a = (short) 1;
        lwjgl3ApplicationConfiguration0.setWindowPosition(8, 9);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".prefs/" + "'", str19, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.setwindowWidth(10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode9 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode9;
        int int11 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int16 = lwjgl3ApplicationConfiguration0.g;
        int int17 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int18 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.g = (short) -1;
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str12 = lwjgl3ApplicationConfiguration11.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration11.windowListener = lwjgl3WindowListener13;
        lwjgl3ApplicationConfiguration11.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration11.stencil = ' ';
        int int19 = lwjgl3ApplicationConfiguration11.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration11.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        java.lang.String str24 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int25 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        boolean boolean26 = lwjgl3ApplicationConfiguration0.initialVisible;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int13 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.Files.FileType fileType2 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 100);
        lwjgl3ApplicationConfiguration0.a = 16;
        lwjgl3ApplicationConfiguration0.windowWidth = 640;
        int int10 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', 3);
        int int14 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType2 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType2.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 100);
        int int12 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 'a';
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 97;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        int int4 = lwjgl3ApplicationConfiguration0.getdepth();
        int int5 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) 'a');
        int int8 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.windowHeight = 32;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 640 + "'", int5 == 640);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) 'a');
        lwjgl3ApplicationConfiguration0.windowWidth = 0;
        int int16 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int17 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str19 = lwjgl3ApplicationConfiguration18.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration18.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean24 = lwjgl3ApplicationConfiguration18.vSyncEnabled;
        lwjgl3ApplicationConfiguration18.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean27 = lwjgl3ApplicationConfiguration18.disableAudio;
        lwjgl3ApplicationConfiguration18.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = lwjgl3ApplicationConfiguration18.hdpiMode;
        boolean boolean31 = lwjgl3ApplicationConfiguration18.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration18.windowListener = lwjgl3WindowListener32;
        boolean boolean34 = lwjgl3ApplicationConfiguration18.vSyncEnabled;
        lwjgl3ApplicationConfiguration18.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str38 = lwjgl3ApplicationConfiguration37.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration37.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode41 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration37.hdpiMode = hdpiMode41;
        lwjgl3ApplicationConfiguration37.setWindowPosition((int) (short) 0, 100);
        int int46 = lwjgl3ApplicationConfiguration37.getwindowWidth();
        lwjgl3ApplicationConfiguration37.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration37.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType51 = lwjgl3ApplicationConfiguration37.preferencesFileType;
        lwjgl3ApplicationConfiguration37.setAudioConfig(0, (int) (short) 1, 100);
        com.badlogic.gdx.Files.FileType fileType56 = lwjgl3ApplicationConfiguration37.getpreferencesFileType();
        lwjgl3ApplicationConfiguration18.preferencesFileType = fileType56;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType56);
        java.lang.Class<?> wildcardClass59 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".prefs/" + "'", str19, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode30 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode30.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ".prefs/" + "'", str38, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode41 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode41.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 640 + "'", int46 == 640);
        org.junit.Assert.assertTrue("'" + fileType51 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType51.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType56 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType56.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.windowX = (short) 10;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str9 = lwjgl3ApplicationConfiguration8.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration8.windowListener = lwjgl3WindowListener10;
        lwjgl3ApplicationConfiguration8.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration8.stencil = ' ';
        int int16 = lwjgl3ApplicationConfiguration8.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration8.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration8.setaudioDeviceBufferSize(16);
        lwjgl3ApplicationConfiguration8.title = ".prefs/";
        com.badlogic.gdx.graphics.Color color23 = lwjgl3ApplicationConfiguration8.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str27 = lwjgl3ApplicationConfiguration26.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration26.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean32 = lwjgl3ApplicationConfiguration26.vSyncEnabled;
        lwjgl3ApplicationConfiguration26.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean35 = lwjgl3ApplicationConfiguration26.disableAudio;
        lwjgl3ApplicationConfiguration26.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = lwjgl3ApplicationConfiguration26.hdpiMode;
        boolean boolean39 = lwjgl3ApplicationConfiguration26.getvSyncEnabled();
        com.badlogic.gdx.Files.FileType fileType40 = lwjgl3ApplicationConfiguration26.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType40);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode42 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        boolean boolean43 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int44 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ".prefs/" + "'", str27, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + fileType40 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType40.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3DisplayMode42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 16 + "'", int44 == 16);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str13 = lwjgl3ApplicationConfiguration12.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration12.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration12.hdpiMode = hdpiMode16;
        lwjgl3ApplicationConfiguration12.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.graphics.Color color21 = lwjgl3ApplicationConfiguration12.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color21;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (short) -1, 52);
        int int27 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int6 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.a = 480;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int12 = lwjgl3ApplicationConfiguration11.getwindowWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str14 = lwjgl3ApplicationConfiguration13.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration13.setaudioDeviceBufferCount(100);
        int int17 = lwjgl3ApplicationConfiguration13.samples;
        lwjgl3ApplicationConfiguration13.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean21 = lwjgl3ApplicationConfiguration20.getdisableAudio();
        boolean boolean22 = lwjgl3ApplicationConfiguration20.getwindowDecorated();
        boolean boolean23 = lwjgl3ApplicationConfiguration20.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str25 = lwjgl3ApplicationConfiguration24.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration24.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration24.hdpiMode = hdpiMode28;
        lwjgl3ApplicationConfiguration24.setWindowPosition((int) (short) 0, 100);
        int int33 = lwjgl3ApplicationConfiguration24.getwindowWidth();
        lwjgl3ApplicationConfiguration24.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration24.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType38 = lwjgl3ApplicationConfiguration24.preferencesFileType;
        lwjgl3ApplicationConfiguration24.useVsync(false);
        boolean boolean41 = lwjgl3ApplicationConfiguration24.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str43 = lwjgl3ApplicationConfiguration42.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration42.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration42.hdpiMode = hdpiMode46;
        lwjgl3ApplicationConfiguration42.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.graphics.Color color51 = lwjgl3ApplicationConfiguration42.initialBackgroundColor;
        lwjgl3ApplicationConfiguration24.initialBackgroundColor = color51;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color51);
        lwjgl3ApplicationConfiguration13.initialBackgroundColor = color51;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color51);
        lwjgl3ApplicationConfiguration11.setwindowDecorated(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ".prefs/" + "'", str25, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode28 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode28.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 640 + "'", int33 == 640);
        org.junit.Assert.assertTrue("'" + fileType38 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType38.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + ".prefs/" + "'", str43, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(color51);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int4 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) (byte) -1);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 480 + "'", int4 == 480);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration5.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration5.useGL30 = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.setwindowWidth(10);
        lwjgl3ApplicationConfiguration0.setWindowedMode(8, 512);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.windowHeight = (byte) 1;
        int int17 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (short) 0;
        lwjgl3ApplicationConfiguration0.b = 480;
        int int24 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int4 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int5 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(512);
        lwjgl3ApplicationConfiguration0.setwindowX(1);
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setWindowedMode(640, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        boolean boolean19 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 1;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 480;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int3 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 1);
        int int6 = lwjgl3ApplicationConfiguration0.samples;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        java.lang.Class<?> wildcardClass9 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 640 + "'", int3 == 640);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str13 = lwjgl3ApplicationConfiguration12.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration12.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean18 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        lwjgl3ApplicationConfiguration12.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration12.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration12.audioDeviceSimultaneousSources = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean26 = lwjgl3ApplicationConfiguration25.getdisableAudio();
        boolean boolean27 = lwjgl3ApplicationConfiguration25.getwindowDecorated();
        boolean boolean28 = lwjgl3ApplicationConfiguration25.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = lwjgl3ApplicationConfiguration25.hdpiMode;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode29);
        com.badlogic.gdx.graphics.Color color31 = lwjgl3ApplicationConfiguration12.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str33 = lwjgl3ApplicationConfiguration32.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration32.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean38 = lwjgl3ApplicationConfiguration32.vSyncEnabled;
        lwjgl3ApplicationConfiguration32.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean41 = lwjgl3ApplicationConfiguration32.disableAudio;
        lwjgl3ApplicationConfiguration32.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = lwjgl3ApplicationConfiguration32.hdpiMode;
        lwjgl3ApplicationConfiguration32.initialVisible = true;
        int int47 = lwjgl3ApplicationConfiguration32.getaudioDeviceBufferCount();
        int int48 = lwjgl3ApplicationConfiguration32.windowWidth;
        lwjgl3ApplicationConfiguration32.audioDeviceBufferSize = 640;
        boolean boolean51 = lwjgl3ApplicationConfiguration32.windowResizable;
        com.badlogic.gdx.graphics.Color color52 = lwjgl3ApplicationConfiguration32.initialBackgroundColor;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color52);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color52);
        boolean boolean55 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean56 = lwjgl3ApplicationConfiguration0.initialVisible;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ".prefs/" + "'", str33, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 640 + "'", int48 == 640);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.windowHeight = 'a';
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(35);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 16, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.depth = 480;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) '#', (int) (byte) -1);
        int int17 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int18 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.g = 52;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.samples = 100;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        boolean boolean16 = lwjgl3ApplicationConfiguration13.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = lwjgl3ApplicationConfiguration13.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode17);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int23 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        boolean boolean16 = lwjgl3ApplicationConfiguration13.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = lwjgl3ApplicationConfiguration13.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode17);
        lwjgl3ApplicationConfiguration0.windowX = ' ';
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 52;
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, 8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((-1));
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener16;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int19 = lwjgl3ApplicationConfiguration18.getdepth();
        int int20 = lwjgl3ApplicationConfiguration18.gles30ContextMinorVersion;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setwindowX((int) '4');
        int int6 = lwjgl3ApplicationConfiguration0.stencil;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        boolean boolean16 = lwjgl3ApplicationConfiguration13.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = lwjgl3ApplicationConfiguration13.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        com.badlogic.gdx.Files.FileType fileType22 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int23 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.depth = 3;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.r = (byte) 10;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + fileType22 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType22.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int4 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.windowY = 0;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.windowY = 2;
        lwjgl3ApplicationConfiguration0.windowWidth = 640;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 480 + "'", int4 == 480);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.windowY = ' ';
        int int14 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.windowWidth = (-1);
        int int19 = lwjgl3ApplicationConfiguration0.depth;
        int int20 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.depth = 8;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', 9, (int) ' ', (int) (byte) 10, (int) ' ', 10, 9);
        lwjgl3ApplicationConfiguration0.windowX = 2;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (short) -1;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((int) (short) 1);
        boolean boolean23 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 1, 3);
        lwjgl3ApplicationConfiguration0.setwindowY(1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str23 = lwjgl3ApplicationConfiguration22.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration22.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration22.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration22.windowX = '#';
        lwjgl3ApplicationConfiguration22.setResizable(false);
        lwjgl3ApplicationConfiguration22.setTitle(".prefs/");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str35 = lwjgl3ApplicationConfiguration34.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration34.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean40 = lwjgl3ApplicationConfiguration34.vSyncEnabled;
        lwjgl3ApplicationConfiguration34.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType43 = lwjgl3ApplicationConfiguration34.preferencesFileType;
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType43);
        lwjgl3ApplicationConfiguration22.setaudioDeviceSimultaneousSources((int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str49 = lwjgl3ApplicationConfiguration48.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration48.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str53 = lwjgl3ApplicationConfiguration52.getpreferencesDirectory();
        com.badlogic.gdx.Files.FileType fileType54 = lwjgl3ApplicationConfiguration52.getpreferencesFileType();
        lwjgl3ApplicationConfiguration48.preferencesFileType = fileType54;
        lwjgl3ApplicationConfiguration22.setPreferencesConfig(".prefs/", fileType54);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType54);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ".prefs/" + "'", str23, ".prefs/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ".prefs/" + "'", str35, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + fileType43 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType43.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + ".prefs/" + "'", str49, ".prefs/");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + ".prefs/" + "'", str53, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType54 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType54.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int3 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 1);
        lwjgl3ApplicationConfiguration0.windowWidth = (short) 0;
        lwjgl3ApplicationConfiguration0.setAudioConfig(3, 0, 2);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 640 + "'", int3 == 640);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType13;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean18 = lwjgl3ApplicationConfiguration17.getdisableAudio();
        int int19 = lwjgl3ApplicationConfiguration17.getaudioDeviceBufferCount();
        int int20 = lwjgl3ApplicationConfiguration17.getgles30ContextMinorVersion();
        int int21 = lwjgl3ApplicationConfiguration17.windowHeight;
        lwjgl3ApplicationConfiguration17.windowY = 0;
        lwjgl3ApplicationConfiguration17.setwindowWidth(16);
        lwjgl3ApplicationConfiguration17.disableAudio = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str29 = lwjgl3ApplicationConfiguration28.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration28.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration28.hdpiMode = hdpiMode32;
        lwjgl3ApplicationConfiguration28.setWindowPosition((int) (short) 0, 100);
        int int37 = lwjgl3ApplicationConfiguration28.getwindowWidth();
        lwjgl3ApplicationConfiguration28.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration28.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType42 = lwjgl3ApplicationConfiguration28.preferencesFileType;
        lwjgl3ApplicationConfiguration17.preferencesFileType = fileType42;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType42);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(10);
        int int49 = lwjgl3ApplicationConfiguration0.g;
        java.lang.Class<?> wildcardClass50 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(lwjgl3WindowListener15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 480 + "'", int21 == 480);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ".prefs/" + "'", str29, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 640 + "'", int37 == 640);
        org.junit.Assert.assertTrue("'" + fileType42 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType42.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.depth = 1;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setwindowY(8);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setwindowWidth(3);
        lwjgl3ApplicationConfiguration0.title = "";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = lwjgl3ApplicationConfiguration0.hdpiMode;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.windowY = '4';
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        int int18 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int19 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        boolean boolean16 = lwjgl3ApplicationConfiguration13.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = lwjgl3ApplicationConfiguration13.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode17);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int21 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setwindowX(100);
        java.lang.String str24 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getsamples();
        int int4 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setdepth((int) ' ');
        lwjgl3ApplicationConfiguration0.samples = 'a';
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 640;
        int int11 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 480 + "'", int4 == 480);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((-1));
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration0.b = '#';
        lwjgl3ApplicationConfiguration0.setWindowedMode(640, 97);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int3 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 1);
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.depth = (byte) 100;
        int int9 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 0, (int) (short) 1);
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 640 + "'", int3 == 640);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 97;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setwindowY(8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str12 = lwjgl3ApplicationConfiguration11.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration11.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration11.setgles30ContextMinorVersion(100);
        int int17 = lwjgl3ApplicationConfiguration11.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str19 = lwjgl3ApplicationConfiguration18.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration18.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration18.hdpiMode = hdpiMode22;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode22;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 2;
        int int28 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.windowHeight = 10;
        int int31 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".prefs/" + "'", str19, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16);
        lwjgl3ApplicationConfiguration0.title = ".prefs/";
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str17 = lwjgl3ApplicationConfiguration16.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration16.windowListener = lwjgl3WindowListener18;
        int int20 = lwjgl3ApplicationConfiguration16.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str22 = lwjgl3ApplicationConfiguration21.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration21.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean27 = lwjgl3ApplicationConfiguration21.vSyncEnabled;
        lwjgl3ApplicationConfiguration21.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean30 = lwjgl3ApplicationConfiguration21.disableAudio;
        lwjgl3ApplicationConfiguration21.disableAudio(true);
        lwjgl3ApplicationConfiguration21.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration21.r = 100;
        com.badlogic.gdx.Files.FileType fileType37 = lwjgl3ApplicationConfiguration21.preferencesFileType;
        lwjgl3ApplicationConfiguration16.preferencesFileType = fileType37;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType37;
        int int40 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.g = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode43 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode43;
        lwjgl3ApplicationConfiguration0.b = 10;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".prefs/" + "'", str17, ".prefs/");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ".prefs/" + "'", str22, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + fileType37 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType37.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 16 + "'", int40 == 16);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = '#';
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(97);
        lwjgl3ApplicationConfiguration0.windowX = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.samples = '#';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.depth = 'a';
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.samples = 0;
        int int13 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode4 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 2;
        lwjgl3ApplicationConfiguration0.setwindowX(8);
        java.lang.Class<?> wildcardClass9 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNull(lwjgl3DisplayMode4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.depth = 8;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.b = (byte) -1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str11 = lwjgl3ApplicationConfiguration10.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration10.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean16 = lwjgl3ApplicationConfiguration10.vSyncEnabled;
        lwjgl3ApplicationConfiguration10.setgles30ContextMajorVersion((int) (byte) -1);
        java.lang.String str19 = lwjgl3ApplicationConfiguration10.title;
        lwjgl3ApplicationConfiguration10.vSyncEnabled = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = lwjgl3ApplicationConfiguration10.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode22;
        java.lang.Class<?> wildcardClass24 = hdpiMode22.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.g = 9;
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.a = (short) -1;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.a = 512;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) '4');
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 9;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int4 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.windowY = 0;
        lwjgl3ApplicationConfiguration0.setwindowWidth(16);
        lwjgl3ApplicationConfiguration0.depth = 512;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) ' ', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str16 = lwjgl3ApplicationConfiguration15.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration15.windowListener = lwjgl3WindowListener17;
        lwjgl3ApplicationConfiguration15.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration15.setsamples((int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration15.setFullscreenMode(displayMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = lwjgl3ApplicationConfiguration15.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode25;
        lwjgl3ApplicationConfiguration0.setWindowedMode(97, 16);
        boolean boolean30 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 480 + "'", int4 == 480);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".prefs/" + "'", str16, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.stencil = 100;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        int int20 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        lwjgl3ApplicationConfiguration0.stencil = 'a';
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 1, 9, (int) (byte) 10, 480, 0, 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(0);
        int int31 = lwjgl3ApplicationConfiguration0.getdepth();
        java.lang.String str32 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.samples = 35;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 480 + "'", int31 == 480);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ".prefs/" + "'", str32, ".prefs/");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        boolean boolean16 = lwjgl3ApplicationConfiguration13.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = lwjgl3ApplicationConfiguration13.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int20 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setwindowY(16);
        int int23 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 0;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 480 + "'", int23 == 480);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType9);
        lwjgl3ApplicationConfiguration0.g = 16;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.windowHeight = 512;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.depth = (short) 100;
        lwjgl3ApplicationConfiguration0.b = 640;
        lwjgl3ApplicationConfiguration0.a = (byte) -1;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        int int4 = lwjgl3ApplicationConfiguration0.getdepth();
        int int5 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.windowWidth = 16;
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str10 = lwjgl3ApplicationConfiguration9.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration9.windowListener = lwjgl3WindowListener11;
        lwjgl3ApplicationConfiguration9.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration9.setsamples((int) (byte) 100);
        lwjgl3ApplicationConfiguration9.setgles30ContextMinorVersion((int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = lwjgl3ApplicationConfiguration9.windowListener;
        lwjgl3ApplicationConfiguration9.setpreferencesDirectory("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = lwjgl3ApplicationConfiguration9.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode22);
        boolean boolean24 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setdepth((int) 'a');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.r = 35;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3WindowListener19);
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int4 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int5 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (byte) 0;
        lwjgl3ApplicationConfiguration0.setResizable(false);
        int int10 = lwjgl3ApplicationConfiguration0.depth;
        int int11 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (-1));
        lwjgl3ApplicationConfiguration0.setwindowY((-1));
        lwjgl3ApplicationConfiguration0.setwindowHeight(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str13 = lwjgl3ApplicationConfiguration12.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration12.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean18 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        lwjgl3ApplicationConfiguration12.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration12.setuseGL30(true);
        int int23 = lwjgl3ApplicationConfiguration12.getgles30ContextMajorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode24 = null;
        lwjgl3ApplicationConfiguration12.fullscreenMode = lwjgl3DisplayMode24;
        com.badlogic.gdx.Files.FileType fileType26 = lwjgl3ApplicationConfiguration12.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType26);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = ' ';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int12 = lwjgl3ApplicationConfiguration0.g;
        int int13 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean6 = lwjgl3ApplicationConfiguration5.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean8 = lwjgl3ApplicationConfiguration7.getdisableAudio();
        boolean boolean9 = lwjgl3ApplicationConfiguration7.getwindowDecorated();
        lwjgl3ApplicationConfiguration7.setWindowedMode((int) 'a', (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        int int15 = lwjgl3ApplicationConfiguration13.getwindowWidth();
        java.lang.String str16 = lwjgl3ApplicationConfiguration13.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str19 = lwjgl3ApplicationConfiguration18.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration18.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration18.hdpiMode = hdpiMode22;
        lwjgl3ApplicationConfiguration18.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str27 = lwjgl3ApplicationConfiguration26.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration26.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean32 = lwjgl3ApplicationConfiguration26.vSyncEnabled;
        lwjgl3ApplicationConfiguration26.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType35 = lwjgl3ApplicationConfiguration26.preferencesFileType;
        lwjgl3ApplicationConfiguration18.preferencesFileType = fileType35;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig(".prefs/", fileType35);
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType35);
        lwjgl3ApplicationConfiguration5.preferencesFileType = fileType35;
        boolean boolean40 = lwjgl3ApplicationConfiguration5.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str42 = lwjgl3ApplicationConfiguration41.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration41.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration41.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration41.gles30ContextMajorVersion = '4';
        boolean boolean49 = lwjgl3ApplicationConfiguration41.useGL30;
        lwjgl3ApplicationConfiguration41.audioDeviceSimultaneousSources = 640;
        int int52 = lwjgl3ApplicationConfiguration41.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str54 = lwjgl3ApplicationConfiguration53.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener55 = null;
        lwjgl3ApplicationConfiguration53.windowListener = lwjgl3WindowListener55;
        lwjgl3ApplicationConfiguration53.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration53.setsamples((-1));
        lwjgl3ApplicationConfiguration53.preferencesDirectory = "hi!";
        lwjgl3ApplicationConfiguration53.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode65 = lwjgl3ApplicationConfiguration53.fullscreenMode;
        java.lang.String str66 = lwjgl3ApplicationConfiguration53.preferencesDirectory;
        int int67 = lwjgl3ApplicationConfiguration53.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration53.hdpiMode = hdpiMode68;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode70 = null;
        lwjgl3ApplicationConfiguration53.fullscreenMode = lwjgl3DisplayMode70;
        boolean boolean72 = lwjgl3ApplicationConfiguration53.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration73 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean74 = lwjgl3ApplicationConfiguration73.getdisableAudio();
        int int75 = lwjgl3ApplicationConfiguration73.getaudioDeviceBufferCount();
        int int76 = lwjgl3ApplicationConfiguration73.getgles30ContextMinorVersion();
        int int77 = lwjgl3ApplicationConfiguration73.windowHeight;
        lwjgl3ApplicationConfiguration73.windowY = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration80 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str81 = lwjgl3ApplicationConfiguration80.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration80.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode84 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration80.hdpiMode = hdpiMode84;
        lwjgl3ApplicationConfiguration80.setWindowPosition((int) (short) 0, 100);
        int int89 = lwjgl3ApplicationConfiguration80.getwindowWidth();
        lwjgl3ApplicationConfiguration80.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration80.windowY = ' ';
        int int94 = lwjgl3ApplicationConfiguration80.getwindowX();
        com.badlogic.gdx.Files.FileType fileType95 = lwjgl3ApplicationConfiguration80.getpreferencesFileType();
        lwjgl3ApplicationConfiguration73.setpreferencesFileType(fileType95);
        lwjgl3ApplicationConfiguration53.setpreferencesFileType(fileType95);
        lwjgl3ApplicationConfiguration41.setpreferencesFileType(fileType95);
        lwjgl3ApplicationConfiguration5.preferencesFileType = fileType95;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".prefs/" + "'", str16, ".prefs/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".prefs/" + "'", str19, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ".prefs/" + "'", str27, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + fileType35 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType35.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + ".prefs/" + "'", str42, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 640 + "'", int52 == 640);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + ".prefs/" + "'", str54, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3DisplayMode65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 512 + "'", int67 == 512);
        org.junit.Assert.assertTrue("'" + hdpiMode68 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode68.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 9 + "'", int75 == 9);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 480 + "'", int77 == 480);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + ".prefs/" + "'", str81, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode84 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode84.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 640 + "'", int89 == 640);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + fileType95 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType95.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        lwjgl3ApplicationConfiguration0.depth = 480;
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setwindowWidth(100);
        int int18 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 0);
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str24 = lwjgl3ApplicationConfiguration23.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration23.setuseGL30(false);
        int int27 = lwjgl3ApplicationConfiguration23.getaudioDeviceBufferSize();
        boolean boolean28 = lwjgl3ApplicationConfiguration23.getuseGL30();
        lwjgl3ApplicationConfiguration23.setaudioDeviceBufferCount(0);
        lwjgl3ApplicationConfiguration23.setwindowWidth(16);
        lwjgl3ApplicationConfiguration23.samples = 32;
        boolean boolean35 = lwjgl3ApplicationConfiguration23.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean37 = lwjgl3ApplicationConfiguration36.getdisableAudio();
        int int38 = lwjgl3ApplicationConfiguration36.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration36.title = "";
        lwjgl3ApplicationConfiguration36.setwindowDecorated(true);
        int int43 = lwjgl3ApplicationConfiguration36.r;
        lwjgl3ApplicationConfiguration36.setdisableAudio(false);
        lwjgl3ApplicationConfiguration36.depth = 'a';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str49 = lwjgl3ApplicationConfiguration48.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration48.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean54 = lwjgl3ApplicationConfiguration48.vSyncEnabled;
        int int55 = lwjgl3ApplicationConfiguration48.getwindowY();
        int int56 = lwjgl3ApplicationConfiguration48.getdepth();
        com.badlogic.gdx.Graphics.DisplayMode displayMode57 = null;
        lwjgl3ApplicationConfiguration48.setFullscreenMode(displayMode57);
        lwjgl3ApplicationConfiguration48.g = '4';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str62 = lwjgl3ApplicationConfiguration61.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration61.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean67 = lwjgl3ApplicationConfiguration61.vSyncEnabled;
        lwjgl3ApplicationConfiguration61.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean70 = lwjgl3ApplicationConfiguration61.disableAudio;
        lwjgl3ApplicationConfiguration61.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode73 = lwjgl3ApplicationConfiguration61.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode74 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration61.hdpiMode = hdpiMode74;
        lwjgl3ApplicationConfiguration48.hdpiMode = hdpiMode74;
        lwjgl3ApplicationConfiguration36.hdpiMode = hdpiMode74;
        lwjgl3ApplicationConfiguration23.hdpiMode = hdpiMode74;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode74;
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) 100;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 480 + "'", int18 == 480);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ".prefs/" + "'", str24, ".prefs/");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + ".prefs/" + "'", str49, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 16 + "'", int56 == 16);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + ".prefs/" + "'", str62, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode73 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode73.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode74 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode74.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        lwjgl3ApplicationConfiguration0.depth = 480;
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 1;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        com.badlogic.gdx.graphics.Color color14 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.depth = 16;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        lwjgl3ApplicationConfiguration0.depth = 480;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str15 = lwjgl3ApplicationConfiguration14.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration14.windowListener = lwjgl3WindowListener16;
        lwjgl3ApplicationConfiguration14.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration14.stencil = ' ';
        int int22 = lwjgl3ApplicationConfiguration14.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration14.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType23;
        int int25 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int26 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowY(16);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 640 + "'", int25 == 640);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int8 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType9);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        int int13 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 480 + "'", int13 == 480);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) 10;
        com.badlogic.gdx.Files.FileType fileType11 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener14;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int5 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean7 = lwjgl3ApplicationConfiguration6.getdisableAudio();
        boolean boolean8 = lwjgl3ApplicationConfiguration6.getwindowDecorated();
        boolean boolean9 = lwjgl3ApplicationConfiguration6.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode10 = lwjgl3ApplicationConfiguration6.hdpiMode;
        lwjgl3ApplicationConfiguration6.setDecorated(false);
        lwjgl3ApplicationConfiguration6.disableAudio = false;
        int int15 = lwjgl3ApplicationConfiguration6.getwindowHeight();
        lwjgl3ApplicationConfiguration6.setInitialVisible(true);
        int int18 = lwjgl3ApplicationConfiguration6.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration6.setwindowWidth((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str22 = lwjgl3ApplicationConfiguration21.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration21.windowListener = lwjgl3WindowListener23;
        lwjgl3ApplicationConfiguration21.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration21.stencil = ' ';
        int int29 = lwjgl3ApplicationConfiguration21.getaudioDeviceSimultaneousSources();
        int int30 = lwjgl3ApplicationConfiguration21.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration21.setaudioDeviceSimultaneousSources(480);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str35 = lwjgl3ApplicationConfiguration34.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration34.windowListener = lwjgl3WindowListener36;
        lwjgl3ApplicationConfiguration34.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration34.stencil = ' ';
        int int42 = lwjgl3ApplicationConfiguration34.getaudioDeviceSimultaneousSources();
        int int43 = lwjgl3ApplicationConfiguration34.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration34.setaudioDeviceBufferSize(512);
        com.badlogic.gdx.Files.FileType fileType46 = lwjgl3ApplicationConfiguration34.preferencesFileType;
        lwjgl3ApplicationConfiguration21.setPreferencesConfig(".prefs/", fileType46);
        lwjgl3ApplicationConfiguration6.setpreferencesFileType(fileType46);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType46;
        boolean boolean50 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode10 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode10.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ".prefs/" + "'", str22, ".prefs/");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 16 + "'", int29 == 16);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ".prefs/" + "'", str35, ".prefs/");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 512 + "'", int43 == 512);
        org.junit.Assert.assertTrue("'" + fileType46 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType46.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 100);
        int int12 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 'a';
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        int int17 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener11;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.setwindowWidth(0);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory(".prefs/");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = '4';
        int int8 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(16);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 480 + "'", int8 == 480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setwindowY(8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str12 = lwjgl3ApplicationConfiguration11.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration11.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration11.setgles30ContextMinorVersion(100);
        int int17 = lwjgl3ApplicationConfiguration11.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str19 = lwjgl3ApplicationConfiguration18.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration18.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration18.hdpiMode = hdpiMode22;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode22;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 2;
        boolean boolean28 = lwjgl3ApplicationConfiguration0.windowResizable;
        boolean boolean29 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".prefs/" + "'", str19, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.a = 512;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 0, 640, 9, (int) (byte) 0, (int) (byte) 100);
        int int20 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.windowX = (short) 1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str24 = lwjgl3ApplicationConfiguration23.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration23.windowListener = lwjgl3WindowListener25;
        lwjgl3ApplicationConfiguration23.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration23.stencil = ' ';
        int int31 = lwjgl3ApplicationConfiguration23.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration23.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration23.setaudioDeviceBufferSize(16);
        lwjgl3ApplicationConfiguration23.g = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean39 = lwjgl3ApplicationConfiguration38.getdisableAudio();
        int int40 = lwjgl3ApplicationConfiguration38.getaudioDeviceBufferCount();
        int int41 = lwjgl3ApplicationConfiguration38.getgles30ContextMinorVersion();
        int int42 = lwjgl3ApplicationConfiguration38.windowHeight;
        lwjgl3ApplicationConfiguration38.windowY = 0;
        boolean boolean45 = lwjgl3ApplicationConfiguration38.getdisableAudio();
        lwjgl3ApplicationConfiguration38.windowY = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean49 = lwjgl3ApplicationConfiguration48.getdisableAudio();
        boolean boolean50 = lwjgl3ApplicationConfiguration48.getwindowDecorated();
        int int51 = lwjgl3ApplicationConfiguration48.b;
        int int52 = lwjgl3ApplicationConfiguration48.getsamples();
        lwjgl3ApplicationConfiguration48.windowX = (short) 10;
        int int55 = lwjgl3ApplicationConfiguration48.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str57 = lwjgl3ApplicationConfiguration56.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener58 = null;
        lwjgl3ApplicationConfiguration56.windowListener = lwjgl3WindowListener58;
        lwjgl3ApplicationConfiguration56.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration56.stencil = ' ';
        int int64 = lwjgl3ApplicationConfiguration56.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration56.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration56.setaudioDeviceBufferSize(16);
        lwjgl3ApplicationConfiguration56.title = ".prefs/";
        com.badlogic.gdx.graphics.Color color71 = lwjgl3ApplicationConfiguration56.initialBackgroundColor;
        lwjgl3ApplicationConfiguration48.setInitialBackgroundColor(color71);
        lwjgl3ApplicationConfiguration38.initialBackgroundColor = color71;
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color71;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color71;
        int int76 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ".prefs/" + "'", str24, ".prefs/");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16 + "'", int31 == 16);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 480 + "'", int42 == 480);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 8 + "'", int51 == 8);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 8 + "'", int55 == 8);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + ".prefs/" + "'", str57, ".prefs/");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 16 + "'", int64 == 16);
        org.junit.Assert.assertNotNull(color71);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 480 + "'", int76 == 480);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean6 = lwjgl3ApplicationConfiguration5.disableAudio;
        lwjgl3ApplicationConfiguration5.windowDecorated = true;
        lwjgl3ApplicationConfiguration5.windowDecorated = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = ".prefs/";
        int int13 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) (short) 1, 480);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str19 = lwjgl3ApplicationConfiguration18.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration18.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean24 = lwjgl3ApplicationConfiguration18.vSyncEnabled;
        lwjgl3ApplicationConfiguration18.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration18.setpreferencesDirectory("hi!");
        boolean boolean29 = lwjgl3ApplicationConfiguration18.getdisableAudio();
        lwjgl3ApplicationConfiguration18.r = (byte) 100;
        lwjgl3ApplicationConfiguration18.setwindowY(640);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str35 = lwjgl3ApplicationConfiguration34.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration34.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean40 = lwjgl3ApplicationConfiguration34.vSyncEnabled;
        int int41 = lwjgl3ApplicationConfiguration34.getwindowY();
        int int42 = lwjgl3ApplicationConfiguration34.getdepth();
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3ApplicationConfiguration34.setFullscreenMode(displayMode43);
        int int45 = lwjgl3ApplicationConfiguration34.getwindowX();
        boolean boolean46 = lwjgl3ApplicationConfiguration34.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str48 = lwjgl3ApplicationConfiguration47.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener49 = null;
        lwjgl3ApplicationConfiguration47.windowListener = lwjgl3WindowListener49;
        lwjgl3ApplicationConfiguration47.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = null;
        lwjgl3ApplicationConfiguration47.hdpiMode = hdpiMode53;
        lwjgl3ApplicationConfiguration47.setgles30ContextMajorVersion((int) (byte) 0);
        com.badlogic.gdx.graphics.Color color57 = lwjgl3ApplicationConfiguration47.initialBackgroundColor;
        lwjgl3ApplicationConfiguration34.initialBackgroundColor = color57;
        lwjgl3ApplicationConfiguration18.setInitialBackgroundColor(color57);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color57;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".prefs/" + "'", str19, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ".prefs/" + "'", str35, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ".prefs/" + "'", str48, ".prefs/");
        org.junit.Assert.assertNotNull(color57);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.b = 9;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        int int16 = lwjgl3ApplicationConfiguration13.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode17 = lwjgl3ApplicationConfiguration13.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean20 = lwjgl3ApplicationConfiguration19.getdisableAudio();
        int int21 = lwjgl3ApplicationConfiguration19.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration19.title = "";
        lwjgl3ApplicationConfiguration19.setwindowDecorated(true);
        int int26 = lwjgl3ApplicationConfiguration19.r;
        lwjgl3ApplicationConfiguration19.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str31 = lwjgl3ApplicationConfiguration30.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration30.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration30.setgles30ContextMinorVersion(100);
        int int36 = lwjgl3ApplicationConfiguration30.windowX;
        com.badlogic.gdx.Files.FileType fileType37 = lwjgl3ApplicationConfiguration30.getpreferencesFileType();
        lwjgl3ApplicationConfiguration29.setpreferencesFileType(fileType37);
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("hi!", fileType37);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType37);
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        int int43 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        lwjgl3ApplicationConfiguration0.g = ' ';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNull(lwjgl3DisplayMode17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ".prefs/" + "'", str31, ".prefs/");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + fileType37 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType37.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int13 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 480;
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int17 = lwjgl3ApplicationConfiguration0.windowX;
        int int18 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.depth = 'a';
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int15 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int11 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setwindowY(16);
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.windowWidth = '4';
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(480);
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (short) 10);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 16, (int) (short) 10);
        int int12 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.stencil = (byte) -1;
        int int15 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, 640, 16);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        com.badlogic.gdx.Files.FileType fileType5 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = lwjgl3ApplicationConfiguration0.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str9 = lwjgl3ApplicationConfiguration8.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration8.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean14 = lwjgl3ApplicationConfiguration8.vSyncEnabled;
        lwjgl3ApplicationConfiguration8.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean17 = lwjgl3ApplicationConfiguration8.disableAudio;
        lwjgl3ApplicationConfiguration8.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode20 = null;
        lwjgl3ApplicationConfiguration8.fullscreenMode = lwjgl3DisplayMode20;
        boolean boolean22 = lwjgl3ApplicationConfiguration8.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str25 = lwjgl3ApplicationConfiguration24.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration24.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean30 = lwjgl3ApplicationConfiguration24.vSyncEnabled;
        lwjgl3ApplicationConfiguration24.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration24.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration24.audioDeviceSimultaneousSources = (short) 10;
        lwjgl3ApplicationConfiguration24.setdisableAudio(true);
        lwjgl3ApplicationConfiguration24.useOpenGL3(true, 1, 3);
        lwjgl3ApplicationConfiguration24.setwindowY(1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str47 = lwjgl3ApplicationConfiguration46.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration46.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration46.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration46.windowX = '#';
        lwjgl3ApplicationConfiguration46.setResizable(false);
        lwjgl3ApplicationConfiguration46.setTitle(".prefs/");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str59 = lwjgl3ApplicationConfiguration58.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration58.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean64 = lwjgl3ApplicationConfiguration58.vSyncEnabled;
        lwjgl3ApplicationConfiguration58.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType67 = lwjgl3ApplicationConfiguration58.preferencesFileType;
        lwjgl3ApplicationConfiguration46.setpreferencesFileType(fileType67);
        lwjgl3ApplicationConfiguration46.setaudioDeviceSimultaneousSources((int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration72 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str73 = lwjgl3ApplicationConfiguration72.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration72.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration76 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str77 = lwjgl3ApplicationConfiguration76.getpreferencesDirectory();
        com.badlogic.gdx.Files.FileType fileType78 = lwjgl3ApplicationConfiguration76.getpreferencesFileType();
        lwjgl3ApplicationConfiguration72.preferencesFileType = fileType78;
        lwjgl3ApplicationConfiguration46.setPreferencesConfig(".prefs/", fileType78);
        lwjgl3ApplicationConfiguration24.setPreferencesConfig("hi!", fileType78);
        lwjgl3ApplicationConfiguration8.setPreferencesConfig("hi!", fileType78);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType78;
        int int84 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ".prefs/" + "'", str25, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + ".prefs/" + "'", str47, ".prefs/");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + ".prefs/" + "'", str59, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + fileType67 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType67.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + ".prefs/" + "'", str73, ".prefs/");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + ".prefs/" + "'", str77, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType78 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType78.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(480);
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = '#';
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        int int11 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.windowHeight = (short) 1;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.a = (short) 100;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.a = 512;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        int int4 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean5 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.b = '4';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        int int13 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 480 + "'", int13 == 480);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 1;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str6 = lwjgl3ApplicationConfiguration5.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration5.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration5.hdpiMode = hdpiMode9;
        lwjgl3ApplicationConfiguration5.setWindowPosition((int) (short) 0, 100);
        int int14 = lwjgl3ApplicationConfiguration5.getwindowWidth();
        lwjgl3ApplicationConfiguration5.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration5.windowY = ' ';
        int int19 = lwjgl3ApplicationConfiguration5.a;
        lwjgl3ApplicationConfiguration5.windowX = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean23 = lwjgl3ApplicationConfiguration22.getdisableAudio();
        boolean boolean24 = lwjgl3ApplicationConfiguration22.getwindowDecorated();
        lwjgl3ApplicationConfiguration22.setwindowDecorated(true);
        int int27 = lwjgl3ApplicationConfiguration22.b;
        int int28 = lwjgl3ApplicationConfiguration22.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str30 = lwjgl3ApplicationConfiguration29.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration29.windowListener = lwjgl3WindowListener31;
        lwjgl3ApplicationConfiguration29.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration29.stencil = ' ';
        int int37 = lwjgl3ApplicationConfiguration29.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Files.FileType fileType38 = lwjgl3ApplicationConfiguration29.preferencesFileType;
        lwjgl3ApplicationConfiguration22.preferencesFileType = fileType38;
        lwjgl3ApplicationConfiguration5.setpreferencesFileType(fileType38);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType38);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode9 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode9.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 640 + "'", int14 == 640);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ".prefs/" + "'", str30, ".prefs/");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 16 + "'", int37 == 16);
        org.junit.Assert.assertTrue("'" + fileType38 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType38.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType9);
        lwjgl3ApplicationConfiguration0.g = 16;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.windowWidth = 100;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 16, (int) (short) 10);
        int int12 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.stencil = (byte) -1;
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (-1));
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setwindowX((int) '4');
        int int6 = lwjgl3ApplicationConfiguration0.stencil;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean8 = lwjgl3ApplicationConfiguration7.getdisableAudio();
        int int9 = lwjgl3ApplicationConfiguration7.getaudioDeviceBufferCount();
        int int10 = lwjgl3ApplicationConfiguration7.getsamples();
        lwjgl3ApplicationConfiguration7.setaudioDeviceBufferCount((int) (short) 10);
        int int13 = lwjgl3ApplicationConfiguration7.g;
        lwjgl3ApplicationConfiguration7.title = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean18 = lwjgl3ApplicationConfiguration17.getdisableAudio();
        int int19 = lwjgl3ApplicationConfiguration17.getwindowWidth();
        java.lang.String str20 = lwjgl3ApplicationConfiguration17.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str23 = lwjgl3ApplicationConfiguration22.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration22.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration22.hdpiMode = hdpiMode26;
        lwjgl3ApplicationConfiguration22.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str31 = lwjgl3ApplicationConfiguration30.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration30.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean36 = lwjgl3ApplicationConfiguration30.vSyncEnabled;
        lwjgl3ApplicationConfiguration30.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType39 = lwjgl3ApplicationConfiguration30.preferencesFileType;
        lwjgl3ApplicationConfiguration22.preferencesFileType = fileType39;
        lwjgl3ApplicationConfiguration17.setPreferencesConfig(".prefs/", fileType39);
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("", fileType39);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType39;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode44 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode44;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 640 + "'", int19 == 640);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ".prefs/" + "'", str20, ".prefs/");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ".prefs/" + "'", str23, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ".prefs/" + "'", str31, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + fileType39 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType39.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str13 = lwjgl3ApplicationConfiguration12.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration12.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean18 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        lwjgl3ApplicationConfiguration12.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration12.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration12.audioDeviceSimultaneousSources = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean26 = lwjgl3ApplicationConfiguration25.getdisableAudio();
        boolean boolean27 = lwjgl3ApplicationConfiguration25.getwindowDecorated();
        boolean boolean28 = lwjgl3ApplicationConfiguration25.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = lwjgl3ApplicationConfiguration25.hdpiMode;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode29);
        com.badlogic.gdx.graphics.Color color31 = lwjgl3ApplicationConfiguration12.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str33 = lwjgl3ApplicationConfiguration32.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration32.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean38 = lwjgl3ApplicationConfiguration32.vSyncEnabled;
        lwjgl3ApplicationConfiguration32.setgles30ContextMajorVersion((int) (byte) -1);
        boolean boolean41 = lwjgl3ApplicationConfiguration32.disableAudio;
        lwjgl3ApplicationConfiguration32.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = lwjgl3ApplicationConfiguration32.hdpiMode;
        lwjgl3ApplicationConfiguration32.initialVisible = true;
        int int47 = lwjgl3ApplicationConfiguration32.getaudioDeviceBufferCount();
        int int48 = lwjgl3ApplicationConfiguration32.windowWidth;
        lwjgl3ApplicationConfiguration32.audioDeviceBufferSize = 640;
        boolean boolean51 = lwjgl3ApplicationConfiguration32.windowResizable;
        com.badlogic.gdx.graphics.Color color52 = lwjgl3ApplicationConfiguration32.initialBackgroundColor;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color52);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color52);
        boolean boolean55 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean56 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ".prefs/" + "'", str33, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 640 + "'", int48 == 640);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration5.setwindowResizable(true);
        lwjgl3ApplicationConfiguration5.audioDeviceSimultaneousSources = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration5.preferencesFileType;
        int int11 = lwjgl3ApplicationConfiguration5.stencil;
        lwjgl3ApplicationConfiguration5.setvSyncEnabled(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int4 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.windowY = 0;
        int int7 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(480);
        boolean boolean10 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 480 + "'", int4 == 480);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 640 + "'", int7 == 640);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setwindowX((int) '4');
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener9;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.r = (byte) 100;
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str17 = lwjgl3ApplicationConfiguration16.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration16.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean22 = lwjgl3ApplicationConfiguration16.vSyncEnabled;
        int int23 = lwjgl3ApplicationConfiguration16.getwindowY();
        int int24 = lwjgl3ApplicationConfiguration16.getdepth();
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration16.setFullscreenMode(displayMode25);
        int int27 = lwjgl3ApplicationConfiguration16.getwindowX();
        boolean boolean28 = lwjgl3ApplicationConfiguration16.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str30 = lwjgl3ApplicationConfiguration29.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration29.windowListener = lwjgl3WindowListener31;
        lwjgl3ApplicationConfiguration29.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode35 = null;
        lwjgl3ApplicationConfiguration29.hdpiMode = hdpiMode35;
        lwjgl3ApplicationConfiguration29.setgles30ContextMajorVersion((int) (byte) 0);
        com.badlogic.gdx.graphics.Color color39 = lwjgl3ApplicationConfiguration29.initialBackgroundColor;
        lwjgl3ApplicationConfiguration16.initialBackgroundColor = color39;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color39);
        lwjgl3ApplicationConfiguration0.windowY = (short) 100;
        int int44 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".prefs/" + "'", str17, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ".prefs/" + "'", str30, ".prefs/");
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int3 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 1);
        int int6 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, 0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 640 + "'", int3 == 640);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) 0);
        int int10 = lwjgl3ApplicationConfiguration0.getdepth();
        int int11 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory(".prefs/");
        lwjgl3ApplicationConfiguration0.depth = (byte) 1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean17 = lwjgl3ApplicationConfiguration16.getdisableAudio();
        boolean boolean18 = lwjgl3ApplicationConfiguration16.getwindowDecorated();
        lwjgl3ApplicationConfiguration16.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        boolean boolean22 = lwjgl3ApplicationConfiguration21.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean24 = lwjgl3ApplicationConfiguration23.getdisableAudio();
        boolean boolean25 = lwjgl3ApplicationConfiguration23.getwindowDecorated();
        lwjgl3ApplicationConfiguration23.setWindowedMode((int) 'a', (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean30 = lwjgl3ApplicationConfiguration29.getdisableAudio();
        int int31 = lwjgl3ApplicationConfiguration29.getwindowWidth();
        java.lang.String str32 = lwjgl3ApplicationConfiguration29.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str35 = lwjgl3ApplicationConfiguration34.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration34.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration34.hdpiMode = hdpiMode38;
        lwjgl3ApplicationConfiguration34.audioDeviceSimultaneousSources = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str43 = lwjgl3ApplicationConfiguration42.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration42.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean48 = lwjgl3ApplicationConfiguration42.vSyncEnabled;
        lwjgl3ApplicationConfiguration42.setgles30ContextMajorVersion((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType51 = lwjgl3ApplicationConfiguration42.preferencesFileType;
        lwjgl3ApplicationConfiguration34.preferencesFileType = fileType51;
        lwjgl3ApplicationConfiguration29.setPreferencesConfig(".prefs/", fileType51);
        lwjgl3ApplicationConfiguration23.setpreferencesFileType(fileType51);
        lwjgl3ApplicationConfiguration21.preferencesFileType = fileType51;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType51);
        lwjgl3ApplicationConfiguration0.windowWidth = 8;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 640 + "'", int31 == 640);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ".prefs/" + "'", str32, ".prefs/");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ".prefs/" + "'", str35, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + ".prefs/" + "'", str43, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + fileType51 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType51.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (byte) 0);
        int int10 = lwjgl3ApplicationConfiguration0.getdepth();
        int int11 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.depth = (short) 100;
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, 16, 52);
        boolean boolean18 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16);
        lwjgl3ApplicationConfiguration0.g = '4';
        int int15 = lwjgl3ApplicationConfiguration0.windowWidth;
        boolean boolean16 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int19 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.audioDeviceBufferCount;
        int int12 = lwjgl3ApplicationConfiguration10.getsamples();
        lwjgl3ApplicationConfiguration10.windowWidth = 640;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean17 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.setsamples((int) '4');
        int int22 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean24 = lwjgl3ApplicationConfiguration23.getdisableAudio();
        int int25 = lwjgl3ApplicationConfiguration23.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration23.title = "";
        lwjgl3ApplicationConfiguration23.setpreferencesDirectory("");
        int int30 = lwjgl3ApplicationConfiguration23.gles30ContextMinorVersion;
        int int31 = lwjgl3ApplicationConfiguration23.depth;
        lwjgl3ApplicationConfiguration23.initialVisible = true;
        lwjgl3ApplicationConfiguration23.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = lwjgl3ApplicationConfiguration23.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 32, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.r = (-1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16 + "'", int31 == 16);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int5 = lwjgl3ApplicationConfiguration0.b;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int7 = lwjgl3ApplicationConfiguration0.getdepth();
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        boolean boolean9 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setwindowWidth(2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode6;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str13 = lwjgl3ApplicationConfiguration12.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration12.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration12.hdpiMode = hdpiMode16;
        lwjgl3ApplicationConfiguration12.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.graphics.Color color21 = lwjgl3ApplicationConfiguration12.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color21;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str24 = lwjgl3ApplicationConfiguration23.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration23.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration23.hdpiMode = hdpiMode27;
        lwjgl3ApplicationConfiguration23.setWindowPosition((int) (short) 0, 100);
        int int32 = lwjgl3ApplicationConfiguration23.getwindowWidth();
        lwjgl3ApplicationConfiguration23.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration23.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str38 = lwjgl3ApplicationConfiguration37.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration37.windowListener = lwjgl3WindowListener39;
        lwjgl3ApplicationConfiguration37.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration37.stencil = ' ';
        int int45 = lwjgl3ApplicationConfiguration37.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration37.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration37.setaudioDeviceBufferSize(16);
        lwjgl3ApplicationConfiguration37.title = ".prefs/";
        com.badlogic.gdx.graphics.Color color52 = lwjgl3ApplicationConfiguration37.initialBackgroundColor;
        lwjgl3ApplicationConfiguration23.initialBackgroundColor = color52;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color52);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 1;
        lwjgl3ApplicationConfiguration0.b = '#';
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ".prefs/" + "'", str24, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 640 + "'", int32 == 640);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ".prefs/" + "'", str38, ".prefs/");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 16 + "'", int45 == 16);
        org.junit.Assert.assertNotNull(color52);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.title;
        java.lang.String str7 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType9);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.g = (short) -1;
        lwjgl3ApplicationConfiguration0.setwindowHeight(0);
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int4 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int5 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.title = "hi!";
        int int8 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        int int11 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 480 + "'", int4 == 480);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 0;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.b = (short) 0;
        int int12 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(35);
        int int16 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.Files.FileType fileType2 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 100);
        lwjgl3ApplicationConfiguration0.a = 16;
        lwjgl3ApplicationConfiguration0.windowWidth = 640;
        lwjgl3ApplicationConfiguration0.setsamples(9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType2 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType2.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(640);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(3);
        lwjgl3ApplicationConfiguration0.setwindowX(640);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener24;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int10 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) (short) 100);
        int int15 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 1, 9, (int) (byte) 10, 480, 0, 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(0);
        int int31 = lwjgl3ApplicationConfiguration0.g;
        int int32 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 640 + "'", int32 == 640);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(100);
        lwjgl3ApplicationConfiguration0.windowX = '#';
        lwjgl3ApplicationConfiguration0.setResizable(false);
        boolean boolean10 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int11 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.windowX = 100;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setwindowY(640);
        lwjgl3ApplicationConfiguration0.depth = 480;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.windowDecorated;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode16 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(lwjgl3DisplayMode16);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.title = "";
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.b = 9;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        int int16 = lwjgl3ApplicationConfiguration13.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode17 = lwjgl3ApplicationConfiguration13.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean20 = lwjgl3ApplicationConfiguration19.getdisableAudio();
        int int21 = lwjgl3ApplicationConfiguration19.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration19.title = "";
        lwjgl3ApplicationConfiguration19.setwindowDecorated(true);
        int int26 = lwjgl3ApplicationConfiguration19.r;
        lwjgl3ApplicationConfiguration19.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str31 = lwjgl3ApplicationConfiguration30.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration30.setaudioDeviceBufferCount(100);
        lwjgl3ApplicationConfiguration30.setgles30ContextMinorVersion(100);
        int int36 = lwjgl3ApplicationConfiguration30.windowX;
        com.badlogic.gdx.Files.FileType fileType37 = lwjgl3ApplicationConfiguration30.getpreferencesFileType();
        lwjgl3ApplicationConfiguration29.setpreferencesFileType(fileType37);
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("hi!", fileType37);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig(".prefs/", fileType37);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) 'a');
        java.lang.Class<?> wildcardClass43 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNull(lwjgl3DisplayMode17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ".prefs/" + "'", str31, ".prefs/");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + fileType37 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType37.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        int int4 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((int) 'a');
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean17 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.setsamples((int) '4');
        lwjgl3ApplicationConfiguration0.a = (short) 1;
        int int24 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, 35);
        boolean boolean28 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int3 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setWindowPosition(480, 3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 16, (int) (short) 10);
        int int12 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.stencil = (byte) -1;
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (-1));
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        int int20 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (short) 1;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, 9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("hi!");
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean14 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        boolean boolean15 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        boolean boolean16 = lwjgl3ApplicationConfiguration13.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = lwjgl3ApplicationConfiguration13.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 'a';
        int int22 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.g = 32;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 0;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int2 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        java.lang.String str3 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) (byte) 0, 0);
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.r = 3;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".prefs/" + "'", str3, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int8 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setsamples((int) ' ');
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener13;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode4;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode11;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, 1);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener2 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener2;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.stencil = ' ';
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16);
        lwjgl3ApplicationConfiguration0.g = (byte) 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean16 = lwjgl3ApplicationConfiguration15.getdisableAudio();
        int int17 = lwjgl3ApplicationConfiguration15.getaudioDeviceBufferCount();
        int int18 = lwjgl3ApplicationConfiguration15.getgles30ContextMinorVersion();
        int int19 = lwjgl3ApplicationConfiguration15.windowHeight;
        lwjgl3ApplicationConfiguration15.windowY = 0;
        boolean boolean22 = lwjgl3ApplicationConfiguration15.getdisableAudio();
        lwjgl3ApplicationConfiguration15.windowY = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean26 = lwjgl3ApplicationConfiguration25.getdisableAudio();
        boolean boolean27 = lwjgl3ApplicationConfiguration25.getwindowDecorated();
        int int28 = lwjgl3ApplicationConfiguration25.b;
        int int29 = lwjgl3ApplicationConfiguration25.getsamples();
        lwjgl3ApplicationConfiguration25.windowX = (short) 10;
        int int32 = lwjgl3ApplicationConfiguration25.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str34 = lwjgl3ApplicationConfiguration33.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3ApplicationConfiguration33.windowListener = lwjgl3WindowListener35;
        lwjgl3ApplicationConfiguration33.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration33.stencil = ' ';
        int int41 = lwjgl3ApplicationConfiguration33.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration33.gles30ContextMinorVersion = (byte) -1;
        lwjgl3ApplicationConfiguration33.setaudioDeviceBufferSize(16);
        lwjgl3ApplicationConfiguration33.title = ".prefs/";
        com.badlogic.gdx.graphics.Color color48 = lwjgl3ApplicationConfiguration33.initialBackgroundColor;
        lwjgl3ApplicationConfiguration25.setInitialBackgroundColor(color48);
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color48;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color48;
        int int52 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".prefs/" + "'", str1, ".prefs/");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 480 + "'", int19 == 480);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ".prefs/" + "'", str34, ".prefs/");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 16 + "'", int41 == 16);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
    }
}

