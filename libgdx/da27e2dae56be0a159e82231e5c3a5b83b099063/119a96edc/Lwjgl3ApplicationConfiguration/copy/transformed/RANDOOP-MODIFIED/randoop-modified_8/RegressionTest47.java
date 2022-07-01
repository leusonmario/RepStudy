import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest47 {

    public static boolean debug = false;

    @Test
    public void test23501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23501");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(20160);
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color13, (int) 'a');
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color18 = color13.lerp(color16, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str20 = color19.toString();
        com.badlogic.gdx.graphics.Color color21 = color16.sub(color19);
        float float22 = color19.toFloatBits();
        com.badlogic.gdx.graphics.Color color24 = color19.set(32);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color19;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffff44ee";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00ff0000" + "'", str20, "00ff0000");
        org.junit.Assert.assertNotNull(color21);
// flaky:         org.junit.Assert.assertTrue("'" + float22 + "' != '" + 9.1477E-41f + "'", float22 == 9.1477E-41f);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test23502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23502");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLACK;
        float float1 = color0.r;
        com.badlogic.gdx.graphics.Color color6 = color0.set((-8.0750596E37f), 0.0f, (float) (-1L), (float) 65024);
        com.badlogic.gdx.graphics.Color color7 = color0.cpy();
        com.badlogic.gdx.graphics.Color color8 = color0.clamp();
        int int9 = com.badlogic.gdx.graphics.Color.rgb888(color0);
        color0.g = 0.69803923f;
        color0.g = 100.0f;
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.9529412f + "'", float1 == 0.9529412f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test23503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23503");
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
        int int31 = lwjgl3ApplicationConfiguration0.getdepth();
        int int32 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int33 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16 + "'", int31 == 16);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 512 + "'", int32 == 512);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
    }

    @Test
    public void test23504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23504");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color2, 16);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color2);
        com.badlogic.gdx.graphics.Color color10 = color2.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        color10.r = (-1241513983);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType14);
        lwjgl3ApplicationConfiguration13.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration13.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration13.r = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        boolean boolean29 = color10.equals((java.lang.Object) lwjgl3ApplicationConfiguration28);
        int int30 = lwjgl3ApplicationConfiguration28.r;
        lwjgl3ApplicationConfiguration28.setsamples(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test23505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23505");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-3200), (float) (-32256), (float) (-18874624), (float) (-100));
        com.badlogic.gdx.graphics.Color color6 = color4.set((-2147222656));
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test23506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23506");
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
        boolean boolean19 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int20 = lwjgl3ApplicationConfiguration0.b;
        int int21 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test23507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23507");
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
        float float30 = color22.b;
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color22);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color22);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
    }

    @Test
    public void test23508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23508");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-41632));
        float float2 = color1.toFloatBits();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.398714E19f + "'", float2 == 6.398714E19f);
    }

    @Test
    public void test23509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23509");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color7 = color2.add((-1.6947138E38f), (float) 1651519680, (-1.6974137E38f), (-1.7005551E38f));
        int int8 = com.badlogic.gdx.graphics.Color.argb8888(color2);
        int int9 = com.badlogic.gdx.graphics.Color.argb8888(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65280 + "'", int8 == 65280);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65280 + "'", int9 == 65280);
    }

    @Test
    public void test23510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23510");
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
        int int43 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        boolean boolean44 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode18);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test23511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23511");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-32509696));
    }

    @Test
    public void test23512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23512");
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
        java.lang.String str32 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int33 = lwjgl3ApplicationConfiguration0.samples;
        int int34 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
        org.junit.Assert.assertTrue("'" + fileType30 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType30.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ffffffff" + "'", str32, "ffffffff");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
    }

    @Test
    public void test23513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23513");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.windowY = 20188;
        int int4 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
    }

    @Test
    public void test23514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23514");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1);
        int int4 = color1.toIntBits();
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color10 = color5.add((-5.68232E37f), 1.00579765E-28f, (float) 2147483647, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(0.0f, (float) 1, 0.13333334f, 1.561203E-39f);
        com.badlogic.gdx.graphics.Color color17 = color15.mul((float) 100);
        com.badlogic.gdx.graphics.Color color22 = color15.add((float) (-1611265692), (float) 6147990, (float) (-1291845633), (float) 63736);
        com.badlogic.gdx.graphics.Color color24 = color10.lerp(color22, (float) (-587202461));
        color24.a = 0.0f;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 524288 + "'", int4 == 524288);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test23515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23515");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode(56864, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.windowHeight = (-1320288256);
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertNull(lwjgl3DisplayMode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test23516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23516");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-16777199), (float) (-383778816), (float) (-65280), 0.13333334f);
        java.lang.Object obj5 = null;
        boolean boolean6 = color4.equals(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test23517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23517");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-10420224));
        float float2 = color1.b;
        float float3 = color1.toFloatBits();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.5154E-41f + "'", float3 == 3.5154E-41f);
    }

    @Test
    public void test23518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23518");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 255, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test23519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23519");
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
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.stencil = 11;
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
    }

    @Test
    public void test23520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23520");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration6.preferencesFileType;
        lwjgl3ApplicationConfiguration6.useGL30 = true;
        lwjgl3ApplicationConfiguration6.setwindowWidth(48127);
        java.lang.String str12 = lwjgl3ApplicationConfiguration6.getpreferencesDirectory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
    }

    @Test
    public void test23521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23521");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        int int9 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int12 = lwjgl3ApplicationConfiguration11.getaudioDeviceBufferSize();
        boolean boolean13 = lwjgl3ApplicationConfiguration11.windowResizable;
        int int14 = lwjgl3ApplicationConfiguration11.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration11.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration11);
        com.badlogic.gdx.Files.FileType fileType18 = lwjgl3ApplicationConfiguration17.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00ff00dc", fileType18);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(266342400);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color27 = color21.mul((float) 11337472, 0.67741936f, (float) (-2075262976), (float) 20480);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color21;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 640 + "'", int9 == 640);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + fileType18 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType18.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test23522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23522");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setWindowedMode((-65486), (-2147483648));
        boolean boolean10 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00ffffff";
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23523");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration4.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration4.setwindowResizable(true);
        lwjgl3ApplicationConfiguration4.a = 13119;
        boolean boolean11 = color2.equals((java.lang.Object) 13119);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color2);
        com.badlogic.gdx.graphics.Color color13 = color12.premultiplyAlpha();
        int int14 = com.badlogic.gdx.graphics.Color.rgba4444(color12);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 43530 + "'", int14 == 43530);
    }

    @Test
    public void test23524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23524");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-16741598));
        com.badlogic.gdx.graphics.Color color3 = color1.set((-65280));
        com.badlogic.gdx.graphics.Color color4 = color3.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color6 = color3.set((-2131293696));
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test23525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23525");
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
        int int22 = lwjgl3ApplicationConfiguration0.r;
        int int23 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setdepth((-2103296));
        int int26 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test23526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23526");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 512);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-59160), (-1562574848));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        int int15 = lwjgl3ApplicationConfiguration0.stencil;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType17);
        lwjgl3ApplicationConfiguration16.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("", fileType22);
        boolean boolean24 = lwjgl3ApplicationConfiguration16.getuseGL30();
        lwjgl3ApplicationConfiguration16.windowWidth = (-65025);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.setDecorated(false);
        lwjgl3ApplicationConfiguration27.a = (byte) 10;
        boolean boolean32 = lwjgl3ApplicationConfiguration27.initialVisible;
        int int33 = lwjgl3ApplicationConfiguration27.b;
        lwjgl3ApplicationConfiguration27.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color36 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration27.initialBackgroundColor = color36;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int39 = lwjgl3ApplicationConfiguration38.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration38.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType42 = lwjgl3ApplicationConfiguration38.preferencesFileType;
        lwjgl3ApplicationConfiguration27.setpreferencesFileType(fileType42);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode45 = null;
        lwjgl3ApplicationConfiguration44.setFullscreenMode(displayMode45);
        lwjgl3ApplicationConfiguration44.windowX = 100;
        int int49 = lwjgl3ApplicationConfiguration44.g;
        int int50 = lwjgl3ApplicationConfiguration44.getwindowY();
        com.badlogic.gdx.Files.FileType fileType51 = lwjgl3ApplicationConfiguration44.getpreferencesFileType();
        lwjgl3ApplicationConfiguration27.preferencesFileType = fileType51;
        lwjgl3ApplicationConfiguration16.preferencesFileType = fileType51;
        lwjgl3ApplicationConfiguration16.samples = (-222);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode56 = lwjgl3ApplicationConfiguration16.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode56);
        int int58 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertTrue("'" + fileType42 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType42.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + fileType51 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType51.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode56 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode56.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 16 + "'", int58 == 16);
    }

    @Test
    public void test23527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23527");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20160);
        int int5 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("00000000");
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "c5040000";
        int int11 = lwjgl3ApplicationConfiguration0.samples;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test23528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23528");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(65024);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "feff08ff";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65024 + "'", int9 == 65024);
    }

    @Test
    public void test23529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23529");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.5086754E38f), (float) (-436443648), (float) 250675200, (float) 160);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((-11604982));
        boolean boolean7 = color4.equals((java.lang.Object) (-11604982));
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color15 = color9.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color15.g = 0.0f;
        com.badlogic.gdx.graphics.Color color19 = color4.lerp(color15, (-1.6950762E38f));
        com.badlogic.gdx.graphics.Color color20 = color15.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color15, 12303);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test23530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23530");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-1291845633));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-345);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.setDecorated(false);
        lwjgl3ApplicationConfiguration14.a = (byte) 10;
        boolean boolean19 = lwjgl3ApplicationConfiguration14.initialVisible;
        int int20 = lwjgl3ApplicationConfiguration14.b;
        lwjgl3ApplicationConfiguration14.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color23;
        com.badlogic.gdx.graphics.Color color25 = color23.clamp();
        com.badlogic.gdx.graphics.Color color30 = color23.set((float) (-65568), (float) (-579592), (float) (-1880097264), (float) (-16711681));
        com.badlogic.gdx.graphics.Color color35 = color23.add((float) (-524536), (float) 34303, (float) (-17694960), (float) (-204539423));
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color23;
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color35);
    }

    @Test
    public void test23531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23531");
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
        lwjgl3ApplicationConfiguration16.setaudioDeviceBufferCount(16769536);
        java.lang.String str26 = lwjgl3ApplicationConfiguration16.preferencesDirectory;
        lwjgl3ApplicationConfiguration16.setaudioDeviceBufferCount((-284098320));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 480 + "'", int23 == 480);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ".prefs/" + "'", str26, ".prefs/");
    }

    @Test
    public void test23532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23532");
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
        int int18 = lwjgl3ApplicationConfiguration17.a;
        int int19 = lwjgl3ApplicationConfiguration17.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration20.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration20.setwindowY((int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration20);
        lwjgl3ApplicationConfiguration20.setaudioDeviceBufferSize(65293);
        int int36 = lwjgl3ApplicationConfiguration20.b;
        lwjgl3ApplicationConfiguration20.setdepth(16648950);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = lwjgl3ApplicationConfiguration20.hdpiMode;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode39);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23533");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode(587202559, 1932040192);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.valueOf("009df663");
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color23);
        float float26 = color23.g;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.6156863f + "'", float26 == 0.6156863f);
    }

    @Test
    public void test23534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23534");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-56577));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14427135) + "'", int1 == (-14427135));
    }

    @Test
    public void test23535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23535");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        com.badlogic.gdx.Files.FileType fileType4 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 123030, (-1879860224));
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test23536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23536");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("");
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setwindowY(100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration17.setwindowX((int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = lwjgl3ApplicationConfiguration17.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode22;
        int int24 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int27 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test23537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23537");
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
        lwjgl3ApplicationConfiguration24.setpreferencesDirectory("01000000");
        int int30 = lwjgl3ApplicationConfiguration24.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 43268 + "'", int27 == 43268);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test23538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23538");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color9, (-398458880));
        float float12 = color9.b;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ffffffff" + "'", str8, "ffffffff");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test23539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23539");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(15687677);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("00002300");
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test23540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23540");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("00ff0000");
        int int11 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (-33488131), 0);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-2099712);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration19.setpreferencesFileType(fileType20);
        lwjgl3ApplicationConfiguration19.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration19.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode32 = lwjgl3ApplicationConfiguration19.fullscreenMode;
        boolean boolean33 = lwjgl3ApplicationConfiguration19.windowResizable;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration34.setpreferencesFileType(fileType35);
        lwjgl3ApplicationConfiguration34.disableAudio = true;
        int int39 = lwjgl3ApplicationConfiguration34.windowY;
        int int40 = lwjgl3ApplicationConfiguration34.audioDeviceBufferCount;
        int int41 = lwjgl3ApplicationConfiguration34.a;
        boolean boolean42 = lwjgl3ApplicationConfiguration34.getvSyncEnabled();
        com.badlogic.gdx.Files.FileType fileType43 = lwjgl3ApplicationConfiguration34.preferencesFileType;
        int int44 = lwjgl3ApplicationConfiguration34.gles30ContextMinorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = lwjgl3ApplicationConfiguration34.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener46 = null;
        lwjgl3ApplicationConfiguration34.windowListener = lwjgl3WindowListener46;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration48.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration48.setWindowedMode(1, 10);
        int int54 = lwjgl3ApplicationConfiguration48.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = lwjgl3ApplicationConfiguration48.hdpiMode;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration19.hdpiMode = hdpiMode55;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode55;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-346542080));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertNull(lwjgl3DisplayMode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(fileType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23541");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, 130560);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int9 = lwjgl3ApplicationConfiguration8.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration8.a = 16;
        int int12 = lwjgl3ApplicationConfiguration8.windowHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType14);
        lwjgl3ApplicationConfiguration13.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("", fileType19);
        lwjgl3ApplicationConfiguration13.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        lwjgl3ApplicationConfiguration23.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration26.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration26.samples = (-1);
        lwjgl3ApplicationConfiguration26.setgles30ContextMajorVersion(1677696502);
        boolean boolean33 = lwjgl3ApplicationConfiguration26.getwindowDecorated();
        lwjgl3ApplicationConfiguration26.setaudioDeviceBufferCount((-33488131));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration36.setpreferencesFileType(fileType37);
        lwjgl3ApplicationConfiguration36.disableAudio = true;
        int int41 = lwjgl3ApplicationConfiguration36.windowY;
        int int42 = lwjgl3ApplicationConfiguration36.audioDeviceBufferCount;
        int int43 = lwjgl3ApplicationConfiguration36.a;
        boolean boolean44 = lwjgl3ApplicationConfiguration36.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration36.hdpiMode = hdpiMode45;
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration8.hdpiMode = hdpiMode45;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode45);
        com.badlogic.gdx.graphics.Color color51 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.Graphics.DisplayMode displayMode52 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode52);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 9 + "'", int42 == 9);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(color51);
    }

    @Test
    public void test23542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23542");
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
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffffffff";
        lwjgl3ApplicationConfiguration0.r = 0;
        int int19 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean21 = lwjgl3ApplicationConfiguration20.vSyncEnabled;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test23543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23543");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener24;
        lwjgl3ApplicationConfiguration0.setwindowX((-16447240));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-56610);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
    }

    @Test
    public void test23544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23544");
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
        lwjgl3ApplicationConfiguration0.g = (short) 100;
        lwjgl3ApplicationConfiguration0.windowX = 0;
        lwjgl3ApplicationConfiguration0.setsamples((-10887648));
        lwjgl3ApplicationConfiguration0.setwindowWidth(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int27 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test23545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23545");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        int int9 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.windowHeight = 268435456;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test23546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23546");
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
        lwjgl3ApplicationConfiguration9.setdisableAudio(true);
        int int16 = lwjgl3ApplicationConfiguration9.getwindowWidth();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
    }

    @Test
    public void test23547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23547");
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
        lwjgl3ApplicationConfiguration0.r = 130560;
        lwjgl3ApplicationConfiguration0.setsamples(512);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test23548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23548");
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
        float float50 = color48.g;
        com.badlogic.gdx.graphics.Color color52 = color48.mul((float) (-11280864));
        com.badlogic.gdx.graphics.Color color57 = color52.set((float) 16735984, (float) 16771591, (-4.1619106E19f), (float) (-18432));
        color57.a = (-2147425792);
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
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.0f + "'", float50 == 0.0f);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color57);
    }

    @Test
    public void test23549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23549");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(10);
        int int2 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(7);
        com.badlogic.gdx.graphics.Color color5 = color1.mul(color4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test23550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23550");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (int) 'a');
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color6 = color3.clamp();
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str9 = lwjgl3ApplicationConfiguration8.title;
        lwjgl3ApplicationConfiguration8.a = (-1);
        boolean boolean12 = lwjgl3ApplicationConfiguration8.vSyncEnabled;
        lwjgl3ApplicationConfiguration8.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration8.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color15);
        float float18 = color15.toFloatBits();
        com.badlogic.gdx.graphics.Color color20 = color7.lerp(color15, 9.444733E21f);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-7.563619E37f) + "'", float18 == (-7.563619E37f));
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test23551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23551");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(20160);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        int int14 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test23552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23552");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        int int3 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(3570);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(0);
        int int8 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowWidth = (-63832320);
        lwjgl3ApplicationConfiguration0.windowX = (-558174448);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test23553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23553");
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
        int int15 = com.badlogic.gdx.graphics.Color.rgba8888(color14);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color14);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test23554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23554");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.FOREST;
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        com.badlogic.gdx.graphics.Color color6 = color1.lerp(color3, (float) (-50396672));
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color6);
        float float8 = color6.r;
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color14 = color9.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = color9.mul((-5.9417005E37f));
        com.badlogic.gdx.graphics.Color color21 = color9.add((float) 3276808, (float) (-579592), 0.0f, (float) 2047);
        com.badlogic.gdx.graphics.Color color23 = color6.lerp(color9, (float) (-1611265692));
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color29 = color24.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color24);
        int int31 = com.badlogic.gdx.graphics.Color.argb8888(color24);
        int int32 = color24.toIntBits();
        com.badlogic.gdx.graphics.Color color33 = color24.cpy();
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color35 = color23.sub(color34);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color35, (-56832));
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(color35);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65280 + "'", int2 == 65280);
        org.junit.Assert.assertNotNull(color3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65280 + "'", int7 == 65280);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color35);
    }

    @Test
    public void test23555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23555");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 584909055, (float) (-285216512), (float) (-2130706432));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2048) + "'", int3 == (-2048));
    }

    @Test
    public void test23556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23556");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode17 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3DisplayMode17);
    }

    @Test
    public void test23557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23557");
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
        lwjgl3ApplicationConfiguration0.windowY = 10;
        int int18 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.windowHeight = 587162524;
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color21, (int) 'a');
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color26 = color21.lerp(color24, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color27 = color24.clamp();
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color27);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color28;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color32 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color36 = color34.set(color35);
        float float37 = color35.b;
        float float38 = color35.r;
        com.badlogic.gdx.graphics.Color color43 = color35.set((float) (byte) 1, (float) (byte) 10, 0.0f, 0.69803923f);
        com.badlogic.gdx.graphics.Color color44 = color35.cpy();
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color50 = color45.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color(color45);
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color(color51);
        com.badlogic.gdx.graphics.Color color53 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color58 = color53.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color66 = color60.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color67 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str68 = color67.toString();
        com.badlogic.gdx.graphics.Color color70 = color60.lerp(color67, (-8.0750596E37f));
        boolean boolean71 = color53.equals((java.lang.Object) color60);
        com.badlogic.gdx.graphics.Color color72 = color52.add(color53);
        com.badlogic.gdx.graphics.Color color78 = color53.lerp(0.19607843f, (float) 167247232, (float) 16777215, (float) 587162524, 0.0f);
        com.badlogic.gdx.graphics.Color color79 = color44.add(color53);
        com.badlogic.gdx.graphics.Color color85 = color53.lerp((-4.731522E-22f), (float) 1105199359, (float) 2047, (float) 63519, (float) 1L);
        com.badlogic.gdx.graphics.Color color86 = color85.cpy();
        int int87 = com.badlogic.gdx.graphics.Color.argb8888(color86);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color86);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
// flaky:         org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
// flaky:         org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color66);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "00ff0000" + "'", str68, "00ff0000");
        org.junit.Assert.assertNotNull(color70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(color72);
        org.junit.Assert.assertNotNull(color78);
        org.junit.Assert.assertNotNull(color79);
        org.junit.Assert.assertNotNull(color85);
        org.junit.Assert.assertNotNull(color86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-16711681) + "'", int87 == (-16711681));
    }

    @Test
    public void test23558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23558");
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
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-56576));
        int int22 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration23.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration23.windowX = 100;
        int int28 = lwjgl3ApplicationConfiguration23.g;
        java.lang.String str29 = lwjgl3ApplicationConfiguration23.getpreferencesDirectory();
        int int30 = lwjgl3ApplicationConfiguration23.depth;
        lwjgl3ApplicationConfiguration23.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = lwjgl3ApplicationConfiguration23.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int35 = lwjgl3ApplicationConfiguration34.getaudioDeviceBufferSize();
        boolean boolean36 = lwjgl3ApplicationConfiguration34.windowResizable;
        lwjgl3ApplicationConfiguration34.disableAudio = false;
        lwjgl3ApplicationConfiguration34.setwindowHeight((int) (byte) 10);
        int int41 = lwjgl3ApplicationConfiguration34.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration42.setpreferencesFileType(fileType43);
        lwjgl3ApplicationConfiguration42.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType48 = null;
        lwjgl3ApplicationConfiguration42.setPreferencesConfig("", fileType48);
        lwjgl3ApplicationConfiguration42.g = (short) 0;
        lwjgl3ApplicationConfiguration42.windowX = 35;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode54 = lwjgl3ApplicationConfiguration42.hdpiMode;
        lwjgl3ApplicationConfiguration34.hdpiMode = hdpiMode54;
        lwjgl3ApplicationConfiguration23.hdpiMode = hdpiMode54;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode54);
        int int58 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int62 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ".prefs/" + "'", str29, ".prefs/");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16 + "'", int30 == 16);
        org.junit.Assert.assertTrue("'" + hdpiMode33 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode33.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 512 + "'", int35 == 512);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 8 + "'", int62 == 8);
    }

    @Test
    public void test23559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23559");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-69392), (-1714481152), (-12989440), (-603914496));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-69392) + "'", int4 == (-69392));
    }

    @Test
    public void test23560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23560");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.g = (-16646655);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test23561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23561");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        java.lang.String str4 = color1.toString();
        int int5 = com.badlogic.gdx.graphics.Color.rgba4444(color1);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color1, (-2336));
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(3);
        color10.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color13 = color10.clamp();
        com.badlogic.gdx.graphics.Color color18 = color13.add((float) 65520, (-1.7013883E38f), (-1.6947917E38f), (float) 9);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color13);
        int int20 = com.badlogic.gdx.graphics.Color.rgba8888(color13);
        com.badlogic.gdx.graphics.Color color22 = color13.mul((float) (-1573120));
        java.lang.String str23 = color13.toString();
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color27 = color25.set(color26);
        float float28 = color26.b;
        float float29 = color26.r;
        com.badlogic.gdx.graphics.Color color34 = color26.set((float) (byte) 1, (float) (byte) 10, 0.0f, 0.69803923f);
        com.badlogic.gdx.graphics.Color color35 = color26.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3ApplicationConfiguration36.setFullscreenMode(displayMode37);
        lwjgl3ApplicationConfiguration36.samples = (-1);
        boolean boolean41 = lwjgl3ApplicationConfiguration36.initialVisible;
        com.badlogic.gdx.graphics.Color color42 = com.badlogic.gdx.graphics.Color.BLACK;
        float float43 = color42.r;
        com.badlogic.gdx.graphics.Color color48 = color42.set((float) 0L, (float) 1671296512, (float) 255, (-5.387877E37f));
        lwjgl3ApplicationConfiguration36.initialBackgroundColor = color42;
        com.badlogic.gdx.graphics.Color color50 = color42.cpy();
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color(color50);
        com.badlogic.gdx.graphics.Color color52 = color35.mul(color51);
        com.badlogic.gdx.graphics.Color color53 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color54 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color55 = color53.mul(color54);
        com.badlogic.gdx.graphics.Color color60 = color53.sub((float) 1L, (float) (-27809536), (float) (-1), (float) (byte) 0);
        com.badlogic.gdx.graphics.Color color61 = color52.set(color53);
        com.badlogic.gdx.graphics.Color color62 = color13.add(color61);
        color61.b = (-203427056);
        com.badlogic.gdx.graphics.Color color65 = color1.mul(color61);
        com.badlogic.gdx.graphics.Color color66 = color65.cpy();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ffff00b2" + "'", str4, "ffff00b2");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 65290 + "'", int5 == 65290);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-16776961) + "'", int20 == (-16776961));
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00000000" + "'", str23, "00000000");
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(color66);
    }

    @Test
    public void test23562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23562");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setdepth(1939603456);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-65568), 11645360);
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23563");
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
        com.badlogic.gdx.graphics.Color color36 = color31.sub((float) 385941504, (float) (-1611265692), (float) (-1677721501), (float) (-10420224));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int38 = lwjgl3ApplicationConfiguration37.getaudioDeviceBufferSize();
        boolean boolean39 = lwjgl3ApplicationConfiguration37.windowResizable;
        lwjgl3ApplicationConfiguration37.disableAudio = false;
        lwjgl3ApplicationConfiguration37.setwindowHeight((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color46 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color51 = color46.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color52 = color45.sub(color51);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color45, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color59 = color45.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        lwjgl3ApplicationConfiguration37.setInitialBackgroundColor(color59);
        lwjgl3ApplicationConfiguration37.setwindowX(97);
        com.badlogic.gdx.graphics.Color color63 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color color64 = new com.badlogic.gdx.graphics.Color(color63);
        com.badlogic.gdx.graphics.Color color65 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str66 = color65.toString();
        com.badlogic.gdx.graphics.Color color68 = color65.set((-62986));
        com.badlogic.gdx.graphics.Color color69 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str70 = color69.toString();
        com.badlogic.gdx.graphics.Color color72 = color69.set((-62986));
        com.badlogic.gdx.graphics.Color color73 = color68.sub(color72);
        com.badlogic.gdx.graphics.Color color74 = color63.add(color72);
        lwjgl3ApplicationConfiguration37.setInitialBackgroundColor(color72);
        com.badlogic.gdx.graphics.Color color76 = lwjgl3ApplicationConfiguration37.initialBackgroundColor;
        java.lang.String str77 = color76.toString();
        boolean boolean78 = color36.equals((java.lang.Object) str77);
        com.badlogic.gdx.graphics.Color color79 = color36.cpy();
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "00ff0000" + "'", str66, "00ff0000");
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "ffff09f6" + "'", str70, "ffff09f6");
        org.junit.Assert.assertNotNull(color72);
        org.junit.Assert.assertNotNull(color73);
        org.junit.Assert.assertNotNull(color74);
        org.junit.Assert.assertNotNull(color76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "00000000" + "'", str77, "00000000");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(color79);
    }

    @Test
    public void test23564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23564");
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
        lwjgl3ApplicationConfiguration0.windowWidth = 2147483498;
        int int25 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 65522 + "'", int13 == 65522);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 480 + "'", int25 == 480);
    }

    @Test
    public void test23565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23565");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setwindowY((-65536));
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration15.disableAudio = true;
        lwjgl3ApplicationConfiguration15.b = (short) -1;
        int int22 = lwjgl3ApplicationConfiguration15.gles30ContextMinorVersion;
        int int23 = lwjgl3ApplicationConfiguration15.getsamples();
        lwjgl3ApplicationConfiguration15.disableAudio = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = lwjgl3ApplicationConfiguration15.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode26;
        lwjgl3ApplicationConfiguration0.setAudioConfig(2080800, (-16777216), (-10420224));
        com.badlogic.gdx.Files.FileType fileType32 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23566");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 587162524;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-10), 2016);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int17 = lwjgl3ApplicationConfiguration16.getaudioDeviceBufferSize();
        boolean boolean18 = lwjgl3ApplicationConfiguration16.windowResizable;
        lwjgl3ApplicationConfiguration16.disableAudio = false;
        lwjgl3ApplicationConfiguration16.setResizable(true);
        lwjgl3ApplicationConfiguration16.setwindowX(10);
        int int25 = lwjgl3ApplicationConfiguration16.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        int int27 = lwjgl3ApplicationConfiguration16.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration16.setWindowedMode(640, 65293);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration31.setpreferencesFileType(fileType32);
        lwjgl3ApplicationConfiguration31.useVsync(false);
        lwjgl3ApplicationConfiguration31.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration31);
        boolean boolean39 = lwjgl3ApplicationConfiguration31.windowDecorated;
        lwjgl3ApplicationConfiguration31.useVsync(false);
        lwjgl3ApplicationConfiguration31.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration44.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration44.setwindowResizable(true);
        int int49 = lwjgl3ApplicationConfiguration44.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = lwjgl3ApplicationConfiguration44.hdpiMode;
        lwjgl3ApplicationConfiguration31.hdpiMode = hdpiMode50;
        lwjgl3ApplicationConfiguration16.hdpiMode = hdpiMode50;
        com.badlogic.gdx.Files.FileType fileType53 = lwjgl3ApplicationConfiguration16.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType53);
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16 + "'", int27 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode50 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode50.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + fileType53 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType53.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23567");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float9 = color8.a;
        int int10 = color8.toIntBits();
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1996488960), (-16769793));
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-118095928);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test23568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23568");
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
        lwjgl3ApplicationConfiguration18.setdisableAudio(true);
        lwjgl3ApplicationConfiguration18.windowResizable = false;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
    }

    @Test
    public void test23569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23569");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test23570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23570");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        boolean boolean10 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.windowHeight = (-512);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration13.setWindowListener(lwjgl3WindowListener14);
        int int16 = lwjgl3ApplicationConfiguration13.samples;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color24 = color19.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = color18.sub(color24);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color18, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color18);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color36 = color30.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        int int37 = com.badlogic.gdx.graphics.Color.rgb888(color36);
        int int38 = com.badlogic.gdx.graphics.Color.rgb888(color36);
        com.badlogic.gdx.graphics.Color color39 = com.badlogic.gdx.graphics.Color.FOREST;
        int int40 = com.badlogic.gdx.graphics.Color.argb8888(color39);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int42 = lwjgl3ApplicationConfiguration41.getaudioDeviceBufferSize();
        boolean boolean43 = lwjgl3ApplicationConfiguration41.windowResizable;
        lwjgl3ApplicationConfiguration41.depth = (short) 10;
        lwjgl3ApplicationConfiguration41.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color57 = color51.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color58 = color49.mul(color57);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color49, (int) (byte) 0);
        lwjgl3ApplicationConfiguration41.initialBackgroundColor = color49;
        com.badlogic.gdx.graphics.Color color62 = color39.set(color49);
        com.badlogic.gdx.graphics.Color color63 = color36.set(color62);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color36, 35);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color36, (-150));
        com.badlogic.gdx.graphics.Color color69 = color28.lerp(color36, (float) (-16780544));
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color69);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 16711935 + "'", int37 == 16711935);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 16711935 + "'", int38 == 16711935);
        org.junit.Assert.assertNotNull(color39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 512 + "'", int42 == 512);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertNotNull(color69);
    }

    @Test
    public void test23571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23571");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.g = 31334400;
        lwjgl3ApplicationConfiguration0.depth = (-254);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-16711680), (-128512));
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration14.audioDeviceSimultaneousSources = 58111;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = lwjgl3ApplicationConfiguration14.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = lwjgl3ApplicationConfiguration14.windowListener;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertNull(lwjgl3WindowListener17);
        org.junit.Assert.assertNull(lwjgl3WindowListener18);
    }

    @Test
    public void test23572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23572");
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
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test23573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23573");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        float float1 = color0.b;
        com.badlogic.gdx.graphics.Color color6 = color0.mul((-2.6999944E36f), (float) 255, (-1.5020535E38f), (float) (-219211274));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test23574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23574");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.67129651E9f, (float) (-14540110), (float) 2, (-1.5659187E38f));
        com.badlogic.gdx.graphics.Color color6 = color4.mul(2.75501E-40f);
        int int7 = com.badlogic.gdx.graphics.Color.rgb565(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color13 = color8.sub((float) 7576628, (float) 2047, (float) 1175295, (-1.7011522E38f));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color13, (-19889));
        int int16 = com.badlogic.gdx.graphics.Color.rgb565(color13);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64873 + "'", int16 == 64873);
    }

    @Test
    public void test23575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23575");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(537395200);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode23 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        int int24 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-57120);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(fileType20);
        org.junit.Assert.assertNull(lwjgl3DisplayMode23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 480 + "'", int24 == 480);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
    }

    @Test
    public void test23576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23576");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-241));
    }

    @Test
    public void test23577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23577");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 0);
        int int10 = lwjgl3ApplicationConfiguration0.a;
        int int11 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.windowWidth = 16580354;
        com.badlogic.gdx.graphics.Color color14 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-203427056);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test23578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23578");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str1 = color0.toString();
        color0.g = 16;
        int int4 = com.badlogic.gdx.graphics.Color.rgb888(color0);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color0);
        float float6 = color5.g;
        color5.a = (-532099584);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00ff0000" + "'", str1, "00ff0000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1044480 + "'", int4 == 1044480);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 16.0f + "'", float6 == 16.0f);
    }

    @Test
    public void test23579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23579");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-254));
        int int11 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.windowY = 2154067;
        int int14 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20188 + "'", int11 == 20188);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2154067 + "'", int14 == 2154067);
    }

    @Test
    public void test23580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23580");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1, (float) 20160, (float) 0, (float) (byte) -1);
        com.badlogic.gdx.graphics.Color color9 = color4.set((float) 14500320, (float) 1651519680, 1.0f, 1.249E-38f);
        com.badlogic.gdx.graphics.Color color11 = color4.mul((-1.01139604E31f));
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test23581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23581");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) 8136, (float) (-16777206));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1616365568) + "'", int2 == (-1616365568));
    }

    @Test
    public void test23582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23582");
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
        lwjgl3ApplicationConfiguration11.gles30ContextMajorVersion = 570949632;
        lwjgl3ApplicationConfiguration11.windowX = 65520;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str20 = lwjgl3ApplicationConfiguration19.title;
        lwjgl3ApplicationConfiguration19.a = (-1);
        int int23 = lwjgl3ApplicationConfiguration19.getwindowWidth();
        com.badlogic.gdx.Files.FileType fileType24 = lwjgl3ApplicationConfiguration19.getpreferencesFileType();
        lwjgl3ApplicationConfiguration11.setPreferencesConfig("fffffdff", fileType24);
        int int26 = lwjgl3ApplicationConfiguration11.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 640 + "'", int23 == 640);
        org.junit.Assert.assertTrue("'" + fileType24 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType24.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 640 + "'", int26 == 640);
    }

    @Test
    public void test23583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23583");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        int int2 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-22));
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        int int8 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test23584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23584");
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
        int int31 = com.badlogic.gdx.graphics.Color.rgb888(color9);
        com.badlogic.gdx.graphics.Color color36 = color9.sub((float) (-1441792), (float) 301989887, (float) (-184549378), (float) 16668585);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(color36);
    }

    @Test
    public void test23585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23585");
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
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        int int16 = lwjgl3ApplicationConfiguration0.b;
        int int17 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20188 + "'", int17 == 20188);
    }

    @Test
    public void test23586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23586");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.SCARLET;
        int int18 = com.badlogic.gdx.graphics.Color.argb8888(color17);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color17;
        int int20 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean22 = lwjgl3ApplicationConfiguration21.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertNull(lwjgl3WindowListener16);
        org.junit.Assert.assertNotNull(color17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65280 + "'", int18 == 65280);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test23587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23587");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 6356992, (float) (-33488131), (float) 512, (float) 2783);
        com.badlogic.gdx.graphics.Color color9 = color4.set((float) (-8844), (float) (-533476352), (float) 11, (float) (-191249));
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test23588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23588");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration6.gles30ContextMinorVersion = (-166464000);
        int int9 = lwjgl3ApplicationConfiguration6.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test23589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23589");
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
        boolean boolean16 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int17 = lwjgl3ApplicationConfiguration0.depth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setwindowHeight(6528000);
        int int21 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setTitle("53ff4200");
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test23590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23590");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration15.disableAudio = true;
        lwjgl3ApplicationConfiguration15.initialVisible = true;
        int int22 = lwjgl3ApplicationConfiguration15.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration15.b = (-62986);
        lwjgl3ApplicationConfiguration15.b = 2;
        lwjgl3ApplicationConfiguration15.setwindowX((int) 'a');
        lwjgl3ApplicationConfiguration15.setsamples((int) (short) 10);
        lwjgl3ApplicationConfiguration15.g = 65295;
        int int33 = lwjgl3ApplicationConfiguration15.getwindowWidth();
        lwjgl3ApplicationConfiguration15.setpreferencesDirectory("hi!");
        boolean boolean36 = lwjgl3ApplicationConfiguration15.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = lwjgl3ApplicationConfiguration15.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode37);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 640 + "'", int33 == 640);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode37 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode37.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23591");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int13 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        boolean boolean14 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-8407040);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test23592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23592");
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
        boolean boolean24 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int25 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 16581375;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test23593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23593");
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
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 113;
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
    }

    @Test
    public void test23594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23594");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration6.preferencesFileType;
        lwjgl3ApplicationConfiguration6.useGL30 = true;
        lwjgl3ApplicationConfiguration6.setwindowResizable(false);
        boolean boolean12 = lwjgl3ApplicationConfiguration6.getwindowResizable();
        lwjgl3ApplicationConfiguration6.setwindowDecorated(false);
        boolean boolean15 = lwjgl3ApplicationConfiguration6.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration16.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration16.samples = (-1);
        lwjgl3ApplicationConfiguration16.setgles30ContextMajorVersion(1677696502);
        lwjgl3ApplicationConfiguration16.setdepth(0);
        lwjgl3ApplicationConfiguration16.setwindowX(640);
        lwjgl3ApplicationConfiguration16.gles30ContextMajorVersion = (short) 1;
        int int29 = lwjgl3ApplicationConfiguration16.getaudioDeviceSimultaneousSources();
        int int30 = lwjgl3ApplicationConfiguration16.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration16.audioDeviceBufferSize = (-270598144);
        lwjgl3ApplicationConfiguration16.initialVisible = false;
        lwjgl3ApplicationConfiguration16.setwindowY((-254));
        lwjgl3ApplicationConfiguration16.setTitle("ffff00ff");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int40 = lwjgl3ApplicationConfiguration39.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration39.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration39);
        int int44 = lwjgl3ApplicationConfiguration39.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int46 = lwjgl3ApplicationConfiguration45.getaudioDeviceBufferSize();
        boolean boolean47 = lwjgl3ApplicationConfiguration45.windowResizable;
        int int48 = lwjgl3ApplicationConfiguration45.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration45.setvSyncEnabled(false);
        boolean boolean51 = lwjgl3ApplicationConfiguration45.getvSyncEnabled();
        lwjgl3ApplicationConfiguration45.r = 140834847;
        lwjgl3ApplicationConfiguration45.setResizable(true);
        boolean boolean56 = lwjgl3ApplicationConfiguration45.getdisableAudio();
        int int57 = lwjgl3ApplicationConfiguration45.getwindowX();
        com.badlogic.gdx.Files.FileType fileType58 = lwjgl3ApplicationConfiguration45.getpreferencesFileType();
        lwjgl3ApplicationConfiguration39.setpreferencesFileType(fileType58);
        lwjgl3ApplicationConfiguration16.preferencesFileType = fileType58;
        lwjgl3ApplicationConfiguration6.preferencesFileType = fileType58;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + fileType7 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType7.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 16 + "'", int29 == 16);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 16 + "'", int44 == 16);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 512 + "'", int46 == 512);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + fileType58 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType58.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23595");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565((float) 16714240, (float) 2097152, (float) (-1877082112));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-38797312) + "'", int3 == (-38797312));
    }

    @Test
    public void test23596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23596");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(20249088, (-345), (-69373504), 1794637833);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-65792) + "'", int4 == (-65792));
    }

    @Test
    public void test23597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23597");
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
        boolean boolean18 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.g = (-14679876);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23598");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-14883840));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test23599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23599");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 64873, 0.007320262f, 0.24705882f, 0.0f);
    }

    @Test
    public void test23600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23600");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, (float) 1, 0.13333334f, 1.561203E-39f);
        com.badlogic.gdx.graphics.Color color6 = color4.mul((float) 100);
        com.badlogic.gdx.graphics.Color color11 = color4.add((float) (-1611265692), (float) 6147990, (float) (-1291845633), (float) 63736);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color12, 2);
        com.badlogic.gdx.graphics.Color color19 = color12.add((float) 652800, (float) 3855, (float) 16777215, (float) (-66048));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setDecorated(false);
        lwjgl3ApplicationConfiguration20.a = (byte) 10;
        boolean boolean25 = lwjgl3ApplicationConfiguration20.initialVisible;
        lwjgl3ApplicationConfiguration20.setAudioConfig((int) (byte) 0, (-1), (-270598144));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration30.setpreferencesFileType(fileType31);
        lwjgl3ApplicationConfiguration30.disableAudio = true;
        int int35 = lwjgl3ApplicationConfiguration30.windowY;
        int int36 = lwjgl3ApplicationConfiguration30.audioDeviceBufferCount;
        int int37 = lwjgl3ApplicationConfiguration30.a;
        boolean boolean38 = lwjgl3ApplicationConfiguration30.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration30.hdpiMode = hdpiMode39;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration20.stencil = (-2142638528);
        lwjgl3ApplicationConfiguration20.setwindowY(1105199359);
        lwjgl3ApplicationConfiguration20.windowHeight = 2303;
        lwjgl3ApplicationConfiguration20.setwindowY(16720418);
        boolean boolean50 = color19.equals((java.lang.Object) lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test23601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23601");
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
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        boolean boolean15 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23602");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color color14 = color8.mul(0.06666667f, (float) (-58475), (float) (-16734721), (float) 1044480);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color14, 8704);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test23603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23603");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(65024);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-1562574848));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration9.setdepth((-10158080));
        lwjgl3ApplicationConfiguration9.initialVisible = false;
        boolean boolean14 = lwjgl3ApplicationConfiguration9.windowDecorated;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test23604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23604");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int11 = lwjgl3ApplicationConfiguration0.g;
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int14 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test23605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23605");
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
        int int20 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.setWindowPosition(547143616, (-65568));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 480 + "'", int20 == 480);
    }

    @Test
    public void test23606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23606");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 100;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        int int10 = lwjgl3ApplicationConfiguration0.depth;
        int int11 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
    }

    @Test
    public void test23607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23607");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color7 = color2.add((-5.76451956E17f), 2.87E-42f, 0.44444445f, 5.0192666E30f);
        com.badlogic.gdx.graphics.Color color12 = color2.mul((float) (-95), (float) 15990783, (float) 16580354, 3.4084816E-37f);
        int int13 = com.badlogic.gdx.graphics.Color.rgba4444(color2);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 240 + "'", int13 == 240);
    }

    @Test
    public void test23608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23608");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.setsamples((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration8.setpreferencesFileType(fileType9);
        lwjgl3ApplicationConfiguration8.useVsync(false);
        lwjgl3ApplicationConfiguration8.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration8.a = (-62986);
        lwjgl3ApplicationConfiguration8.setdisableAudio(true);
        boolean boolean20 = lwjgl3ApplicationConfiguration8.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration22.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration22.windowX = 100;
        int int27 = lwjgl3ApplicationConfiguration22.g;
        com.badlogic.gdx.Files.FileType fileType28 = lwjgl3ApplicationConfiguration22.getpreferencesFileType();
        lwjgl3ApplicationConfiguration8.setPreferencesConfig("ffffff00", fileType28);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffff72ff", fileType28);
        lwjgl3ApplicationConfiguration0.samples = 166464502;
        int int33 = lwjgl3ApplicationConfiguration0.getdepth();
        int int34 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.windowHeight = (-11604982);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode37);
        lwjgl3ApplicationConfiguration0.windowWidth = (-1140916480);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16 + "'", int33 == 16);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test23609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23609");
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
        int int29 = lwjgl3ApplicationConfiguration0.r;
        boolean boolean30 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.a = (-2103296);
        lwjgl3ApplicationConfiguration0.stencil = (-50396672);
        boolean boolean35 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode36 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(lwjgl3DisplayMode36);
    }

    @Test
    public void test23610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23610");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float2 = color1.a;
        int int3 = color1.toIntBits();
        com.badlogic.gdx.graphics.Color color5 = color1.mul((float) (-2219520));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration9.windowListener = lwjgl3WindowListener10;
        boolean boolean12 = lwjgl3ApplicationConfiguration9.getdisableAudio();
        lwjgl3ApplicationConfiguration9.windowWidth = (-12632257);
        lwjgl3ApplicationConfiguration9.setaudioDeviceSimultaneousSources((-11280864));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.setDecorated(false);
        lwjgl3ApplicationConfiguration17.a = (byte) 10;
        boolean boolean22 = lwjgl3ApplicationConfiguration17.initialVisible;
        lwjgl3ApplicationConfiguration17.setWindowedMode(10, (-262646));
        int int26 = lwjgl3ApplicationConfiguration17.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration17);
        lwjgl3ApplicationConfiguration17.setResizable(false);
        com.badlogic.gdx.graphics.Color color30 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color35 = color30.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color35, 100);
        com.badlogic.gdx.graphics.Color color39 = color35.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color39, 8897069);
        com.badlogic.gdx.graphics.Color color42 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color47 = color42.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color(color42);
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color(color48);
        int int50 = com.badlogic.gdx.graphics.Color.argb8888(color49);
        int int51 = com.badlogic.gdx.graphics.Color.rgba8888(color49);
        com.badlogic.gdx.graphics.Color color53 = color39.lerp(color49, (float) 1044480);
        com.badlogic.gdx.graphics.Color color58 = color53.add((float) '4', (float) 10, (float) (short) 1, 0.69803923f);
        com.badlogic.gdx.graphics.Color color59 = new com.badlogic.gdx.graphics.Color(color53);
        lwjgl3ApplicationConfiguration17.initialBackgroundColor = color59;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color59, 1610620896);
        com.badlogic.gdx.graphics.Color color64 = new com.badlogic.gdx.graphics.Color(3);
        color64.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color67 = color64.clamp();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color64, (-1902614));
        com.badlogic.gdx.graphics.Color color74 = color64.set((float) (byte) 1, (float) '4', (float) 6529016, (float) (-16734721));
        com.badlogic.gdx.graphics.Color color75 = color74.cpy();
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color74, (-603914496));
        boolean boolean78 = color59.equals((java.lang.Object) color74);
        lwjgl3ApplicationConfiguration9.setInitialBackgroundColor(color59);
        com.badlogic.gdx.graphics.Color color80 = color1.sub(color59);
        com.badlogic.gdx.graphics.Color color82 = color1.set((-1077348352));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 16777215 + "'", int50 == 16777215);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-256) + "'", int51 == (-256));
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertNotNull(color74);
        org.junit.Assert.assertNotNull(color75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(color80);
        org.junit.Assert.assertNotNull(color82);
    }

    @Test
    public void test23611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23611");
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
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 2016;
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        boolean boolean18 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration19.setpreferencesFileType(fileType20);
        lwjgl3ApplicationConfiguration19.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration19.setPreferencesConfig("", fileType25);
        com.badlogic.gdx.Files.FileType fileType27 = lwjgl3ApplicationConfiguration19.preferencesFileType;
        int int28 = lwjgl3ApplicationConfiguration19.samples;
        lwjgl3ApplicationConfiguration19.windowY = (-2147438080);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str32 = lwjgl3ApplicationConfiguration31.title;
        lwjgl3ApplicationConfiguration31.a = (-1);
        boolean boolean35 = lwjgl3ApplicationConfiguration31.vSyncEnabled;
        lwjgl3ApplicationConfiguration31.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration31.useVsync(true);
        lwjgl3ApplicationConfiguration31.setgles30ContextMajorVersion((-254));
        int int42 = lwjgl3ApplicationConfiguration31.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color52 = lwjgl3ApplicationConfiguration43.initialBackgroundColor;
        int int53 = lwjgl3ApplicationConfiguration43.gles30ContextMajorVersion;
        boolean boolean54 = lwjgl3ApplicationConfiguration43.initialVisible;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType56 = null;
        lwjgl3ApplicationConfiguration55.setpreferencesFileType(fileType56);
        lwjgl3ApplicationConfiguration55.disableAudio = true;
        int int60 = lwjgl3ApplicationConfiguration55.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode61 = lwjgl3ApplicationConfiguration55.fullscreenMode;
        lwjgl3ApplicationConfiguration55.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration55.setwindowY((int) '#');
        lwjgl3ApplicationConfiguration55.setwindowHeight((int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode69 = null;
        lwjgl3ApplicationConfiguration68.setFullscreenMode(displayMode69);
        lwjgl3ApplicationConfiguration68.samples = (-1);
        lwjgl3ApplicationConfiguration68.useGL30 = true;
        lwjgl3ApplicationConfiguration68.setpreferencesDirectory("ffff72ff");
        int int77 = lwjgl3ApplicationConfiguration68.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration68.windowY = 20188;
        int int80 = lwjgl3ApplicationConfiguration68.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = lwjgl3ApplicationConfiguration68.hdpiMode;
        lwjgl3ApplicationConfiguration55.hdpiMode = hdpiMode81;
        lwjgl3ApplicationConfiguration43.hdpiMode = hdpiMode81;
        lwjgl3ApplicationConfiguration31.hdpiMode = hdpiMode81;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode81;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(fileType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode61);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 9 + "'", int80 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23612");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 48640, (-4.26002E37f), 0.0f, (float) (-1175040));
    }

    @Test
    public void test23613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23613");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.windowY = 1678374559;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test23614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23614");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(3);
        color1.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color4 = color1.clamp();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color1, (-1902614));
        com.badlogic.gdx.graphics.Color color11 = color1.set((float) (byte) 1, (float) '4', (float) 6529016, (float) (-16734721));
        float float12 = color11.r;
        com.badlogic.gdx.graphics.Color color17 = color11.add((float) (-156), (float) 33554431, (float) (-2140995584), (-1.6952088E38f));
        float float18 = color17.toFloatBits();
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 9.1477E-41f + "'", float18 == 9.1477E-41f);
    }

    @Test
    public void test23615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23615");
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
        int int22 = lwjgl3ApplicationConfiguration0.getwindowX();
        boolean boolean23 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 3381300;
        lwjgl3ApplicationConfiguration0.setAudioConfig(12, (-16777215), 1394089984);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 65295 + "'", int16 == 65295);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test23616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23616");
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
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int14 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setsamples((-10092544));
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((float) 16777198, (float) (-8672), (float) (-7688), (float) 1932040192);
        float float22 = color21.a;
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(15687677);
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color30 = color25.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color25);
        int int32 = com.badlogic.gdx.graphics.Color.argb8888(color25);
        com.badlogic.gdx.graphics.Color color33 = color25.clamp();
        com.badlogic.gdx.graphics.Color color34 = color33.cpy();
        com.badlogic.gdx.graphics.Color color35 = color24.set(color34);
        com.badlogic.gdx.graphics.Color color36 = color21.mul(color34);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color21;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = lwjgl3ApplicationConfiguration0.hdpiMode;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(fileType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1291845633) + "'", int32 == (-1291845633));
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23617");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.r = 1677696502;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int19 = lwjgl3ApplicationConfiguration18.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration20.setpreferencesFileType(fileType21);
        lwjgl3ApplicationConfiguration20.disableAudio = true;
        int int25 = lwjgl3ApplicationConfiguration20.windowY;
        boolean boolean26 = lwjgl3ApplicationConfiguration20.useGL30;
        int int27 = lwjgl3ApplicationConfiguration20.getwindowX();
        lwjgl3ApplicationConfiguration20.setResizable(true);
        boolean boolean30 = lwjgl3ApplicationConfiguration20.initialVisible;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = lwjgl3ApplicationConfiguration20.hdpiMode;
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode31);
        java.lang.String str33 = lwjgl3ApplicationConfiguration18.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ".prefs/" + "'", str33, ".prefs/");
    }

    @Test
    public void test23618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23618");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        int int7 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(9);
        int int10 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-1241513983);
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
    }

    @Test
    public void test23619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23619");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int9 = lwjgl3ApplicationConfiguration8.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration8.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration8.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffff00ff", fileType12);
        lwjgl3ApplicationConfiguration0.setsamples((-582885121));
        int int16 = lwjgl3ApplicationConfiguration0.windowX;
        com.badlogic.gdx.graphics.Color color17 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test23620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23620");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 229, (float) (-582885121), (float) (-32770560), (float) (-16777119));
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
    }

    @Test
    public void test23621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23621");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-340262899), (float) 63503, (float) 1912045568, (float) (-154));
    }

    @Test
    public void test23622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23622");
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
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType19 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int20 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setTitle("ffffa400");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(fileType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test23623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23623");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        int int11 = color9.toIntBits();
        color9.g = (-130050);
        com.badlogic.gdx.graphics.Color color18 = color9.set((-4.785221E37f), (float) 14548736, (float) (-134610432), (float) 2154067);
        color9.a = 11206638;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65280 + "'", int11 == 65280);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test23624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23624");
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
        boolean boolean14 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23625");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.19607843f, (-8.0750596E37f), (-5.68232E37f), (-9.997505E37f));
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        int int6 = com.badlogic.gdx.graphics.Color.rgb565(color4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12288 + "'", int6 == 12288);
    }

    @Test
    public void test23626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23626");
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
        int int18 = lwjgl3ApplicationConfiguration0.g;
        int int19 = lwjgl3ApplicationConfiguration0.windowX;
        int int20 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test23627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23627");
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
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
    }

    @Test
    public void test23628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23628");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int5 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode9 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode9;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 33423457;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.BLACK;
        float float15 = color14.r;
        com.badlogic.gdx.graphics.Color color20 = color14.set((-8.0750596E37f), 0.0f, (float) (-1L), (float) 65024);
        float float21 = color14.g;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color14;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test23629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23629");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((-1.2738033E38f), (float) (-1363456), 4.3190737E-19f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1187905536 + "'", int3 == 1187905536);
    }

    @Test
    public void test23630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23630");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        boolean boolean11 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int14 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setwindowX(652800);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration17.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration17.samples = '4';
        com.badlogic.gdx.Files.FileType fileType22 = lwjgl3ApplicationConfiguration17.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 640;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + fileType22 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType22.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23631");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.7014117E38f, (float) 1105199359, (float) 6529016, (float) (-67111040));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration5.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration5.setwindowY((int) (byte) -1);
        int int18 = lwjgl3ApplicationConfiguration5.g;
        int int19 = lwjgl3ApplicationConfiguration5.getdepth();
        lwjgl3ApplicationConfiguration5.setwindowY((-12632257));
        lwjgl3ApplicationConfiguration5.setuseGL30(true);
        boolean boolean24 = color4.equals((java.lang.Object) lwjgl3ApplicationConfiguration5);
        float float25 = color4.b;
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
    }

    @Test
    public void test23632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23632");
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
        int int25 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int26 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-147861504), (-983040), (-54496), (-603982879), (-164080), (-2117009408), (-67280896));
        int int35 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
    }

    @Test
    public void test23633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23633");
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
        com.badlogic.gdx.graphics.Color color37 = color32.add(2.75501E-40f, (float) 65290, (float) (-1610612736), (float) 123030);
        com.badlogic.gdx.graphics.Color color38 = color32.clamp();
        com.badlogic.gdx.graphics.Color color39 = color38.cpy();
        com.badlogic.gdx.graphics.Color color41 = color38.mul((-1.700529E38f));
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color41);
    }

    @Test
    public void test23634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23634");
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
        int int17 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.setDecorated(false);
        lwjgl3ApplicationConfiguration18.a = (byte) 10;
        boolean boolean23 = lwjgl3ApplicationConfiguration18.initialVisible;
        int int24 = lwjgl3ApplicationConfiguration18.b;
        lwjgl3ApplicationConfiguration18.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration18.initialBackgroundColor = color27;
        com.badlogic.gdx.graphics.Color color29 = color27.cpy();
        com.badlogic.gdx.graphics.Color color31 = color29.mul(0.057594743f);
        boolean boolean33 = color31.equals((java.lang.Object) (-4.2535296E37f));
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color31;
        int int35 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int36 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.depth = 14047;
        boolean boolean39 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 16 + "'", int35 == 16);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 16 + "'", int36 == 16);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration40);
    }

    @Test
    public void test23635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23635");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.useVsync(false);
        lwjgl3ApplicationConfiguration10.setwindowX((-50331646));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
    }

    @Test
    public void test23636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23636");
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
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        boolean boolean21 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean22 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int23 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setwindowWidth(41110);
        lwjgl3ApplicationConfiguration0.windowX = 11337472;
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.ORANGE;
        com.badlogic.gdx.graphics.Color color33 = color28.sub((float) 43268, (float) '#', (float) (-512), (float) (-65400));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color28, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color28;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test23637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23637");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-22));
        color1.a = (-57120);
    }

    @Test
    public void test23638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23638");
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
        int int17 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-240), 933216288);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-27133);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test23639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23639");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 65525, (-6.1807804E37f), (float) (-1340080128), (-1.615012E38f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-269111296) + "'", int4 == (-269111296));
    }

    @Test
    public void test23640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23640");
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
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        int int22 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int23 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 640 + "'", int23 == 640);
    }

    @Test
    public void test23641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23641");
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
        int int16 = lwjgl3ApplicationConfiguration0.getdepth();
        java.lang.String str17 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.windowWidth = (-934295308);
        int int20 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".prefs/" + "'", str17, ".prefs/");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test23642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23642");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ff000010");
        int int12 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int13 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.initialVisible;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test23643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23643");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 50134532, (-7.587357E37f), 0.0f, (float) (-52786));
    }

    @Test
    public void test23644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23644");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("00ff004e");
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test23645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23645");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-1241513983));
        int int11 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode12;
        int int14 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test23646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23646");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.a;
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.windowY = 650250;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((float) (-2147283968), (float) (-587726848), (float) (-603914496), 0.0f);
        java.lang.Object obj14 = null;
        boolean boolean15 = color13.equals(obj14);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color13, (-40910));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23647");
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
        int int15 = lwjgl3ApplicationConfiguration14.samples;
        lwjgl3ApplicationConfiguration14.windowDecorated = false;
        lwjgl3ApplicationConfiguration14.setgles30ContextMinorVersion((-469444608));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode20 = lwjgl3ApplicationConfiguration14.fullscreenMode;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(lwjgl3DisplayMode20);
    }

    @Test
    public void test23648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23648");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        int int11 = color1.toIntBits();
        com.badlogic.gdx.graphics.Color color16 = color1.add((float) 16744272, (float) (-49400), (float) 1799159552, (float) 20188);
        com.badlogic.gdx.graphics.Color color21 = color16.sub((float) 12263936, 7.8561E-41f, 0.0f, (float) 65517);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color21);
        float float23 = color21.toFloatBits();
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16711935 + "'", int11 == 16711935);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 2.3418052E-38f + "'", float23 == 2.3418052E-38f);
    }

    @Test
    public void test23649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23649");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str11 = lwjgl3ApplicationConfiguration10.title;
        int int12 = lwjgl3ApplicationConfiguration10.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration10.setaudioDeviceBufferSize((-22));
        int int15 = lwjgl3ApplicationConfiguration10.getwindowY();
        lwjgl3ApplicationConfiguration10.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.Files.FileType fileType18 = lwjgl3ApplicationConfiguration10.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("0ff00000", fileType18);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-2146959360));
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + fileType18 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType18.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23650");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(1932040192, (-806232493), 268493567, (-3344));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.01354793E31f) + "'", float4 == (-1.01354793E31f));
    }

    @Test
    public void test23651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23651");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1143197184), (float) 512, (-2.0571151E-38f), 0.0f);
    }

    @Test
    public void test23652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23652");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int4 = lwjgl3ApplicationConfiguration3.getwindowWidth();
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((-65042));
        lwjgl3ApplicationConfiguration3.initialBackgroundColor = color6;
        java.lang.String str8 = lwjgl3ApplicationConfiguration3.title;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 640 + "'", int4 == 640);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test23653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23653");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-7876885), (float) 0L, (float) 6529016, (-0.49791527f));
        java.lang.String str5 = color4.toString();
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color11 = color6.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        color6.g = 151015132;
        com.badlogic.gdx.graphics.Color color18 = color6.sub((float) 10L, (float) 480, (float) (-1611265692), (float) (-8672));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color6, (-65486));
        com.badlogic.gdx.graphics.Color color22 = color4.lerp(color6, (float) (-752));
        int int23 = com.badlogic.gdx.graphics.Color.rgb888(color6);
        color6.a = 0.0f;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color6, (-403734016));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0000ff00" + "'", str5, "0000ff00");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 51 + "'", int23 == 51);
    }

    @Test
    public void test23654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23654");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-1771051008), 8.908043E-39f, (float) (-2228448), 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0842022E-19f) + "'", float4 == (-1.0842022E-19f));
    }

    @Test
    public void test23655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23655");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((-1.5416968E38f), (float) (-8960));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2284800) + "'", int2 == (-2284800));
    }

    @Test
    public void test23656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23656");
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
        lwjgl3ApplicationConfiguration0.setwindowWidth((-2147477600));
        int int16 = lwjgl3ApplicationConfiguration0.getdepth();
        int int17 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2147477600) + "'", int17 == (-2147477600));
    }

    @Test
    public void test23657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23657");
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
        lwjgl3ApplicationConfiguration0.setdepth(16774389);
        lwjgl3ApplicationConfiguration0.b = 12;
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test23658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23658");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 24735, 0.001822412f, (-1.7013883E38f), (float) 10L);
        float float5 = color4.g;
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.001822412f + "'", float5 == 0.001822412f);
    }

    @Test
    public void test23659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23659");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int10 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test23660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23660");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 6147990, (float) (byte) -1, (float) (-61455), (float) 15687677);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color5, (int) 'a');
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color10 = color5.lerp(color8, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color11 = color8.clamp();
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color12, (-59160));
        com.badlogic.gdx.graphics.Color color15 = color4.set(color12);
        int int16 = com.badlogic.gdx.graphics.Color.argb8888(color12);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1580097 + "'", int16 == 1580097);
    }

    @Test
    public void test23661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23661");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int11 = lwjgl3ApplicationConfiguration0.stencil;
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setwindowWidth((-65024));
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-10518528);
        lwjgl3ApplicationConfiguration0.setTitle("1ef10000");
        lwjgl3ApplicationConfiguration0.stencil = (-15671025);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 480 + "'", int7 == 480);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
    }

    @Test
    public void test23662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23662");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration6.initialBackgroundColor;
        float float8 = color7.toFloatBits();
        float float9 = color7.toFloatBits();
        com.badlogic.gdx.graphics.Color color15 = color7.lerp((float) (-12240), (float) (-69), (float) (-3045376), (float) 16759790, (float) (-67280896));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-4.2535296E37f) + "'", float8 == (-4.2535296E37f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-4.2535296E37f) + "'", float9 == (-4.2535296E37f));
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test23663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23663");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.title = "88bb2222";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setWindowPosition((-3200), (-10420224));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode19 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration22.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration22.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration22.gles30ContextMajorVersion = 10;
        int int37 = lwjgl3ApplicationConfiguration22.getwindowY();
        lwjgl3ApplicationConfiguration22.initialVisible = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = lwjgl3ApplicationConfiguration22.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode40);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode42 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode42;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(lwjgl3DisplayMode19);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23664");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration15.useVsync(false);
        lwjgl3ApplicationConfiguration15.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        boolean boolean24 = lwjgl3ApplicationConfiguration22.vSyncEnabled;
        boolean boolean25 = lwjgl3ApplicationConfiguration22.getwindowDecorated();
        int int26 = lwjgl3ApplicationConfiguration22.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration28.setpreferencesFileType(fileType29);
        lwjgl3ApplicationConfiguration28.useVsync(false);
        lwjgl3ApplicationConfiguration28.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration28.a = (-62986);
        lwjgl3ApplicationConfiguration28.setdisableAudio(true);
        boolean boolean40 = lwjgl3ApplicationConfiguration28.disableAudio;
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
        lwjgl3ApplicationConfiguration28.setpreferencesFileType(fileType69);
        lwjgl3ApplicationConfiguration22.setPreferencesConfig("ffffffb6", fileType69);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType69;
        int int75 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setsamples((-2147283968));
        int int78 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 8 + "'", int68 == 8);
        org.junit.Assert.assertTrue("'" + fileType69 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType69.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 512 + "'", int75 == 512);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 9 + "'", int78 == 9);
    }

    @Test
    public void test23665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23665");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-15859955));
    }

    @Test
    public void test23666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23666");
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
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color24);
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
    }

    @Test
    public void test23667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23667");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 524288;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int13 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int14 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test23668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23668");
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
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode20 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode20;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test23669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23669");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) (byte) 100, (float) 41903542, (float) (short) 10, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color7 = color6.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color7, 1);
        float float10 = color7.r;
        com.badlogic.gdx.graphics.Color color11 = color0.sub(color7);
        com.badlogic.gdx.graphics.Color color16 = color11.set((float) (short) 100, 2.3418409E-38f, (float) 6147990, (-1.7014086E38f));
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(3);
        color18.a = (byte) 100;
        int int21 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        color18.b = 50200831;
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color29 = color24.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color24);
        int int31 = com.badlogic.gdx.graphics.Color.argb8888(color24);
        com.badlogic.gdx.graphics.Color color33 = color24.mul((float) (-262646));
        com.badlogic.gdx.graphics.Color color35 = color33.mul((float) (-56576));
        com.badlogic.gdx.graphics.Color color36 = color18.mul(color35);
        com.badlogic.gdx.graphics.Color color38 = color18.mul((float) 33423457);
        com.badlogic.gdx.graphics.Color color39 = color38.clamp();
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color39);
        com.badlogic.gdx.graphics.Color color41 = color11.mul(color40);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color11, (-909824));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16777215 + "'", int31 == 16777215);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color41);
    }

    @Test
    public void test23670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23670");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 60687, (float) (-84), (float) (-203427056), (float) (-379904));
        com.badlogic.gdx.graphics.Color color9 = color4.add((float) 551485439, (float) (-284098320), (float) 2285046, (-1.6789801E38f));
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test23671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23671");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(11);
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test23672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23672");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setsamples((int) (byte) 10);
        lwjgl3ApplicationConfiguration0.b = 167247232;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test23673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23673");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-3342337);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test23674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23674");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(16776961);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
    }

    @Test
    public void test23675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23675");
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
        lwjgl3ApplicationConfiguration13.gles30ContextMajorVersion = '4';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        lwjgl3ApplicationConfiguration13.setsamples((-14513374));
        lwjgl3ApplicationConfiguration13.audioDeviceBufferCount = (-110329856);
        java.lang.String str24 = lwjgl3ApplicationConfiguration13.title;
        lwjgl3ApplicationConfiguration13.samples = 186;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test23676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23676");
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
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-56576));
        int int22 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        int int25 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test23677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23677");
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
        int int27 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-10420224), (-2336), 50918400, (-128512), (-402678048), 7, 65290);
        java.lang.String str36 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setwindowX((-91008));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode39 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode39;
        lwjgl3ApplicationConfiguration0.windowHeight = (-75497581);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "01000000" + "'", str36, "01000000");
    }

    @Test
    public void test23678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23678");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        int int8 = com.badlogic.gdx.graphics.Color.rgb888(color7);
        int int9 = com.badlogic.gdx.graphics.Color.rgb888(color7);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color7, (-524800));
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color17 = color12.set((float) (-2228344), (-4.2866305E37f), 1.6768546E7f, (float) (-96));
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16711935 + "'", int8 == 16711935);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16711935 + "'", int9 == 16711935);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test23679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23679");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.TAN;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color0, (int) 'a');
        com.badlogic.gdx.graphics.Color color3 = color0.cpy();
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color3);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color10 = color4.lerp(color8, (float) 16648950);
        int int11 = com.badlogic.gdx.graphics.Color.rgb888(color8);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color8, (-3145729));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test23680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23680");
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
        boolean boolean13 = lwjgl3ApplicationConfiguration8.getvSyncEnabled();
        lwjgl3ApplicationConfiguration8.disableAudio = true;
        int int16 = lwjgl3ApplicationConfiguration8.windowWidth;
        lwjgl3ApplicationConfiguration8.setaudioDeviceBufferSize((-31));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
    }

    @Test
    public void test23681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23681");
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
        lwjgl3ApplicationConfiguration0.b = (-524536);
        lwjgl3ApplicationConfiguration0.setTitle("ffffff22");
        int int18 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int19 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setdepth(14548736);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test23682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23682");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(20188);
        com.badlogic.gdx.graphics.Color color6 = color1.add((float) 16776994, (float) (-1714481152), (float) 14, (float) (-33488896));
        float float7 = color1.b;
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test23683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23683");
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
        float float49 = color1.a;
        int int50 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
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
// flaky:         org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.69803923f + "'", float49 == 0.69803923f);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 178 + "'", int50 == 178);
    }

    @Test
    public void test23684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23684");
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
        lwjgl3ApplicationConfiguration13.gles30ContextMajorVersion = '4';
        lwjgl3ApplicationConfiguration13.setaudioDeviceBufferCount((-16777215));
        boolean boolean21 = lwjgl3ApplicationConfiguration13.initialVisible;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration22.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration22.windowX = 100;
        int int27 = lwjgl3ApplicationConfiguration22.g;
        com.badlogic.gdx.Files.FileType fileType28 = lwjgl3ApplicationConfiguration22.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType33 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration29.setPreferencesConfig("hi!", fileType33);
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType33);
        lwjgl3ApplicationConfiguration22.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        lwjgl3ApplicationConfiguration38.setwindowY((-65400));
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3ApplicationConfiguration38.setFullscreenMode(displayMode41);
        lwjgl3ApplicationConfiguration38.windowWidth = (-379904);
        com.badlogic.gdx.Files.FileType fileType45 = lwjgl3ApplicationConfiguration38.getpreferencesFileType();
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType45);
        java.lang.String str47 = lwjgl3ApplicationConfiguration13.preferencesDirectory;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType33 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType33.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration38);
        org.junit.Assert.assertTrue("'" + fileType45 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType45.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test23685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23685");
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
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color22);
        int int24 = color22.toIntBits();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16711680 + "'", int23 == 16711680);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 255 + "'", int24 == 255);
    }

    @Test
    public void test23686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23686");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        com.badlogic.gdx.Files.FileType fileType5 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int6 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setwindowY(33488896);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(63519);
        color10.a = 9.18893E-39f;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color10;
        com.badlogic.gdx.graphics.Color color18 = color10.mul((-1.7013873E38f), (float) 584974080, (float) (-134217728), (float) (-8320));
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color28 = color22.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color29 = color20.mul(color28);
        com.badlogic.gdx.graphics.Color color34 = color29.sub((float) (short) -1, (float) (-1306385665), (float) (-262646), (float) 100L);
        int int35 = color29.toIntBits();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color29, (-255));
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color40 = color10.lerp(color29, (float) (-469444608));
        com.badlogic.gdx.graphics.Color color45 = color29.set(1.6776994E7f, 0.9424053f, (float) (-7502), (float) (-728785));
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 16777215 + "'", int35 == 16777215);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color45);
    }

    @Test
    public void test23687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23687");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-134308060));
    }

    @Test
    public void test23688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23688");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 234288368, (-1.58456325E29f), (float) (-1606549504), (-1.6980527E38f));
    }

    @Test
    public void test23689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23689");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.g = ' ';
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.FOREST;
        int int9 = com.badlogic.gdx.graphics.Color.argb8888(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int11 = lwjgl3ApplicationConfiguration10.getaudioDeviceBufferSize();
        boolean boolean12 = lwjgl3ApplicationConfiguration10.windowResizable;
        lwjgl3ApplicationConfiguration10.depth = (short) 10;
        lwjgl3ApplicationConfiguration10.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color26 = color20.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color27 = color18.mul(color26);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color18, (int) (byte) 0);
        lwjgl3ApplicationConfiguration10.initialBackgroundColor = color18;
        com.badlogic.gdx.graphics.Color color31 = color8.set(color18);
        float float32 = color18.b;
        com.badlogic.gdx.graphics.Color color33 = color18.clamp();
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color33;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode36 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        boolean boolean37 = lwjgl3ApplicationConfiguration0.initialVisible;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNull(lwjgl3WindowListener35);
        org.junit.Assert.assertNull(lwjgl3DisplayMode36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test23690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23690");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 0);
        int int10 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 61200;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (byte) 100;
        int int15 = lwjgl3ApplicationConfiguration0.depth;
        int int16 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener17;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test23691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23691");
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
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-126));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-222), (-4051712), (-162117120), 40462, 16777164, (-2130837248), (-146800768));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration28);
    }

    @Test
    public void test23692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23692");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, 130560);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color14 = color12.set((int) (short) 0);
        int int15 = com.badlogic.gdx.graphics.Color.rgba4444(color12);
        java.lang.String str16 = color12.toString();
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color22 = color17.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color23);
        int int25 = com.badlogic.gdx.graphics.Color.argb8888(color24);
        int int26 = com.badlogic.gdx.graphics.Color.argb8888(color24);
        com.badlogic.gdx.graphics.Color color28 = color24.set(3);
        com.badlogic.gdx.graphics.Color color29 = color12.set(color28);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color29;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-16174642), (-7680));
        int int37 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 16777215 + "'", int25 == 16777215);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16777215 + "'", int26 == 16777215);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-7680) + "'", int37 == (-7680));
    }

    @Test
    public void test23693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23693");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.r = 140834847;
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-1306385665);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-16252928);
        int int19 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.samples = 485486337;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test23694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23694");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        com.badlogic.gdx.graphics.Color color11 = color9.cpy();
        com.badlogic.gdx.graphics.Color color13 = color11.mul(0.057594743f);
        boolean boolean15 = color13.equals((java.lang.Object) (-4.2535296E37f));
        com.badlogic.gdx.graphics.Color color17 = color13.mul((-1.6880791E38f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test23695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23695");
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
        boolean boolean21 = lwjgl3ApplicationConfiguration16.windowResizable;
        lwjgl3ApplicationConfiguration16.setsamples((-14368));
        lwjgl3ApplicationConfiguration16.setwindowHeight((-267394560));
        lwjgl3ApplicationConfiguration16.depth = (-786688);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test23696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23696");
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
        com.badlogic.gdx.graphics.Color color55 = color50.add((-5.915194E37f), 1.0f, (float) (-214040833), (float) (-1856073728));
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00ff0000" + "'", str9, "00ff0000");
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
        org.junit.Assert.assertNotNull(color55);
    }

    @Test
    public void test23697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23697");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(65295);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-13500161));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test23698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23698");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setwindowY(1671296512);
        int int8 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.g = (-36608);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 640 + "'", int8 == 640);
    }

    @Test
    public void test23699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23699");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(65024);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-1562574848));
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-10887648));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test23700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23700");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 573767680, (float) 284196832, (-1.7013883E38f), (float) (-56576));
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16776960 + "'", int6 == 16776960);
    }

    @Test
    public void test23701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23701");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        boolean boolean24 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test23702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23702");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(1158662112);
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(15408630);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("001cff00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
    }

    @Test
    public void test23703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23703");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-587202461), (float) 250675200, (float) (-2015879168), (float) 65535);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color12 = color7.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color13 = color6.sub(color12);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color6, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color20 = color6.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color6);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = color23.mul(color31);
        int int33 = com.badlogic.gdx.graphics.Color.argb8888(color32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str35 = lwjgl3ApplicationConfiguration34.title;
        com.badlogic.gdx.graphics.Color color36 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color36, 16);
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color36);
        int int40 = lwjgl3ApplicationConfiguration34.g;
        boolean boolean41 = color32.equals((java.lang.Object) lwjgl3ApplicationConfiguration34);
        com.badlogic.gdx.graphics.Color color42 = color6.add(color32);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color48 = color43.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color49 = color42.set(color48);
        com.badlogic.gdx.graphics.Color color50 = color4.add(color42);
        com.badlogic.gdx.graphics.Color color52 = color42.set(268435456);
        com.badlogic.gdx.graphics.Color color57 = new com.badlogic.gdx.graphics.Color((-4.2867603E37f), 9.18893E-39f, (float) 1794115036, (float) (-10));
        com.badlogic.gdx.graphics.Color color58 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color63 = color58.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color68 = color63.mul((-1.0f), (float) 1677696502, (float) 65024, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color69 = color57.sub(color68);
        com.badlogic.gdx.graphics.Color color74 = color69.sub((-4.785221E37f), (float) 573767680, (float) 1785, (float) (-8142));
        com.badlogic.gdx.graphics.Color color75 = color52.mul(color74);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color75, (-68060));
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16711935 + "'", int21 == 16711935);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16711935 + "'", int33 == 16711935);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNotNull(color74);
        org.junit.Assert.assertNotNull(color75);
    }

    @Test
    public void test23704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23704");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (short) 1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setWindowedMode((-12632257), 524288);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-1311232);
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23705");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-514080), (-1.7013893E38f), (float) (-1669267456), (float) (-52786));
        color4.a = (-3600);
    }

    @Test
    public void test23706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23706");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        int int3 = lwjgl3ApplicationConfiguration0.samples;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.samples = (-78);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode8;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffffc020";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test23707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23707");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) '#');
        lwjgl3ApplicationConfiguration0.setdepth((int) '#');
        int int17 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
    }

    @Test
    public void test23708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23708");
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
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 2016;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        int int42 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + fileType35 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType35.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }

    @Test
    public void test23709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23709");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        int int5 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.windowWidth = (-1234862334);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 640 + "'", int5 == 640);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test23710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23710");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.g = 6356992;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int15 = lwjgl3ApplicationConfiguration14.getaudioDeviceBufferSize();
        boolean boolean16 = lwjgl3ApplicationConfiguration14.windowResizable;
        lwjgl3ApplicationConfiguration14.depth = (short) 10;
        lwjgl3ApplicationConfiguration14.setWindowPosition(16, 130560);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType23);
        lwjgl3ApplicationConfiguration22.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration22.setPreferencesConfig("", fileType28);
        lwjgl3ApplicationConfiguration22.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        lwjgl3ApplicationConfiguration32.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3ApplicationConfiguration35.setFullscreenMode(displayMode36);
        lwjgl3ApplicationConfiguration35.samples = (-1);
        lwjgl3ApplicationConfiguration35.setgles30ContextMajorVersion(1677696502);
        boolean boolean42 = lwjgl3ApplicationConfiguration35.getwindowDecorated();
        lwjgl3ApplicationConfiguration35.setaudioDeviceBufferCount((-33488131));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType46 = null;
        lwjgl3ApplicationConfiguration45.setpreferencesFileType(fileType46);
        lwjgl3ApplicationConfiguration45.disableAudio = true;
        int int50 = lwjgl3ApplicationConfiguration45.windowY;
        int int51 = lwjgl3ApplicationConfiguration45.audioDeviceBufferCount;
        int int52 = lwjgl3ApplicationConfiguration45.a;
        boolean boolean53 = lwjgl3ApplicationConfiguration45.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode54 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration45.hdpiMode = hdpiMode54;
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration14.hdpiMode = hdpiMode54;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration0.windowHeight = (-65025);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int64 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration32);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 8 + "'", int52 == 8);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 8 + "'", int64 == 8);
    }

    @Test
    public void test23711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23711");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener17;
        int int19 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(lwjgl3DisplayMode14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test23712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23712");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType17);
        lwjgl3ApplicationConfiguration16.useVsync(false);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration16.initialBackgroundColor = color21;
        int int23 = lwjgl3ApplicationConfiguration16.depth;
        lwjgl3ApplicationConfiguration16.windowResizable = false;
        com.badlogic.gdx.graphics.Color color26 = lwjgl3ApplicationConfiguration16.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color28 = color15.lerp(color26, (float) 0L);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color30 = color15.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color35 = color30.sub((float) 130560, (float) (-234885152), (float) (-65042), (float) 480);
        com.badlogic.gdx.graphics.Color color40 = color35.sub(2.3509528E-38f, (float) 150866176, (float) (-840), (float) 61440);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color40);
    }

    @Test
    public void test23713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23713");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 983023, (-4.542481E37f), (float) 255, (float) (-32512));
    }

    @Test
    public void test23714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23714");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1671296512, 8897069);
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test23715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23715");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-33488131));
        int int10 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int12 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test23716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23716");
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
        int int40 = color8.toIntBits();
        int int41 = com.badlogic.gdx.graphics.Color.rgb888(color8);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 54503 + "'", int40 == 54503);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 15193088 + "'", int41 == 15193088);
    }

    @Test
    public void test23717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23717");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.setWindowedMode((int) '#', 16761475);
        lwjgl3ApplicationConfiguration10.audioDeviceBufferSize = (-983040);
        int int16 = lwjgl3ApplicationConfiguration10.getaudioDeviceBufferCount();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test23718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23718");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 10;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        int int14 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int15 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-68935680), 151015132, 1664640000);
        int int20 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test23719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23719");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color5 = color0.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color13 = color7.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str15 = color14.toString();
        com.badlogic.gdx.graphics.Color color17 = color7.lerp(color14, (-8.0750596E37f));
        boolean boolean18 = color0.equals((java.lang.Object) color7);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color7, (-16741598));
        float float21 = color7.g;
        com.badlogic.gdx.graphics.Color color22 = color7.clamp();
        int int23 = com.badlogic.gdx.graphics.Color.rgb888(color7);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "00ff0000" + "'", str15, "00ff0000");
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.73333335f + "'", float21 == 0.73333335f);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8960802 + "'", int23 == 8960802);
    }

    @Test
    public void test23720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23720");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-3709216), (float) 13090, (float) 255, (float) 252960);
        int int5 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16777215 + "'", int5 == 16777215);
    }

    @Test
    public void test23721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23721");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888(0.0f, (float) (-300814080), (float) (-38145), (float) (-16121856));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-342621952) + "'", int4 == (-342621952));
    }

    @Test
    public void test23722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23722");
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
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffffff00";
        int int23 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1425866751, 254, 0, (-1418), (-333580800), (-98049536), (-529006382));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
    }

    @Test
    public void test23723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23723");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.FOREST;
        java.lang.String str1 = color0.toString();
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((-33566977));
        com.badlogic.gdx.graphics.Color color4 = color0.add(color3);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000" + "'", str1, "00000000");
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test23724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23724");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode12;
        lwjgl3ApplicationConfiguration0.r = 2147483647;
        lwjgl3ApplicationConfiguration0.windowY = 16;
        boolean boolean18 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration19.setpreferencesFileType(fileType20);
        lwjgl3ApplicationConfiguration19.disableAudio = true;
        lwjgl3ApplicationConfiguration19.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType26 = lwjgl3ApplicationConfiguration19.getpreferencesFileType();
        lwjgl3ApplicationConfiguration19.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType29 = lwjgl3ApplicationConfiguration19.getpreferencesFileType();
        int int30 = lwjgl3ApplicationConfiguration19.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = lwjgl3ApplicationConfiguration19.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        int int35 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setWindowPosition(5342, 1664640000);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(fileType26);
        org.junit.Assert.assertNull(fileType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 16 + "'", int35 == 16);
    }

    @Test
    public void test23725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23725");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-16842496), (float) (-16777038), (-4.2712306E37f), (float) (-1562574592));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
    }

    @Test
    public void test23726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23726");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        int int9 = com.badlogic.gdx.graphics.Color.rgba4444(color6);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((float) (-16777199), (float) (-383778816), (float) (-65280), 0.13333334f);
        com.badlogic.gdx.graphics.Color color18 = color10.lerp(color16, (float) (-1291845888));
        com.badlogic.gdx.graphics.Color color20 = color16.mul((-4.319991E37f));
        com.badlogic.gdx.graphics.Color color25 = color20.set((float) (-353108224), (-7.946291E37f), (float) (-16711680), (-1.6947138E38f));
        color20.a = (-14883840);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ffffff00" + "'", str8, "ffffff00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65520 + "'", int9 == 65520);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color25);
    }

    @Test
    public void test23727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23727");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int9 = lwjgl3ApplicationConfiguration8.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration8.g = 62348;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test23728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23728");
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
        com.badlogic.gdx.graphics.Color color29 = color24.sub((float) 652800, (float) (-167641088), (float) (-335609856), (float) (-403734016));
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color((float) 6147990, (float) (byte) -1, (float) (-61455), (float) 15687677);
        float float35 = color34.a;
        com.badlogic.gdx.graphics.Color color40 = color34.add((-8.0750596E37f), 0.0f, (float) 1799159552, (float) (-16646655));
        com.badlogic.gdx.graphics.Color color41 = color24.mul(color40);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color41, 97976304);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16777215 + "'", int13 == 16777215);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56864 + "'", int18 == 56864);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
    }

    @Test
    public void test23729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23729");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.SALMON;
        float float11 = color10.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str13 = lwjgl3ApplicationConfiguration12.title;
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color14, 16);
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color14);
        com.badlogic.gdx.graphics.Color color22 = color14.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color30 = color24.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str32 = color31.toString();
        com.badlogic.gdx.graphics.Color color34 = color24.lerp(color31, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color35, 16);
        com.badlogic.gdx.graphics.Color color38 = color34.sub(color35);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color35, 1677696502);
        com.badlogic.gdx.graphics.Color color41 = color14.sub(color35);
        com.badlogic.gdx.graphics.Color color42 = color10.add(color35);
        color35.r = (-5.387877E37f);
        int int45 = com.badlogic.gdx.graphics.Color.rgba8888(color35);
        com.badlogic.gdx.graphics.Color color46 = color5.sub(color35);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.2024675E-38f + "'", float11 == 1.2024675E-38f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00ff0000" + "'", str32, "00ff0000");
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(color46);
    }

    @Test
    public void test23730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23730");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setWindowedMode(166464502, 16711425);
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-582885121), (-17425764), 62976, 2303, (-152494080), 6671565, (-888832));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test23731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23731");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("fffe1200");
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test23732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23732");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.6950243E38f), (float) (-2048), (float) (-1170), (float) (-166464000));
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.FOREST;
        int int6 = com.badlogic.gdx.graphics.Color.argb8888(color5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int8 = lwjgl3ApplicationConfiguration7.getaudioDeviceBufferSize();
        boolean boolean9 = lwjgl3ApplicationConfiguration7.windowResizable;
        lwjgl3ApplicationConfiguration7.depth = (short) 10;
        lwjgl3ApplicationConfiguration7.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color23 = color17.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color24 = color15.mul(color23);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color15, (int) (byte) 0);
        lwjgl3ApplicationConfiguration7.initialBackgroundColor = color15;
        com.badlogic.gdx.graphics.Color color28 = color5.set(color15);
        com.badlogic.gdx.graphics.Color color29 = color4.add(color15);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-131122) + "'", int6 == (-131122));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
    }

    @Test
    public void test23733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23733");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int10 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.stencil = (-131122);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test23734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23734");
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
        lwjgl3ApplicationConfiguration7.windowX = 0;
        lwjgl3ApplicationConfiguration7.windowY = 4080;
        lwjgl3ApplicationConfiguration7.setwindowResizable(false);
        com.badlogic.gdx.Files.FileType fileType28 = lwjgl3ApplicationConfiguration7.getpreferencesFileType();
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration7.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration7.audioDeviceSimultaneousSources = (-105472);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(fileType28);
    }

    @Test
    public void test23735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23735");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 100);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.setwindowX(13119);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration9.r = (-1627389952);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
    }

    @Test
    public void test23736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23736");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.g = 6356992;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.g = (-918031);
        int int16 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test23737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23737");
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
        com.badlogic.gdx.graphics.Color color29 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color30 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color31 = color29.mul(color30);
        com.badlogic.gdx.graphics.Color color36 = color29.sub((float) 1L, (float) (-27809536), (float) (-1), (float) (byte) 0);
        com.badlogic.gdx.graphics.Color color37 = color28.set(color29);
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(color28);
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color28);
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
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
    }

    @Test
    public void test23738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23738");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 32, (float) (-518127616), (float) (-288), (float) (-26303248));
    }

    @Test
    public void test23739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23739");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setwindowY((-18));
        lwjgl3ApplicationConfiguration0.setTitle("ff0000ff");
        int int7 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test23740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23740");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test23741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23741");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-567943452);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        lwjgl3ApplicationConfiguration0.setdepth((-16741598));
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        int int15 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test23742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23742");
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
        lwjgl3ApplicationConfiguration0.setsamples((-2147438080));
        lwjgl3ApplicationConfiguration0.windowHeight = 65520;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(480);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        boolean boolean22 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test23743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23743");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SCARLET;
        color0.b = '#';
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color5 = color0.lerp(color3, (float) 1L);
        color3.g = (byte) 10;
        com.badlogic.gdx.graphics.Color color9 = color3.set(167247232);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color9, (-11604982));
        int int12 = com.badlogic.gdx.graphics.Color.rgba4444(color9);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(1878880718);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color14);
        color15.g = 16648950;
        com.badlogic.gdx.graphics.Color color18 = color9.mul(color15);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color9);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19719 + "'", int12 == 19719);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test23744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23744");
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
        com.badlogic.gdx.graphics.Color color41 = color22.cpy();
        com.badlogic.gdx.graphics.Color color43 = color41.mul((-1.7014033E38f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 16711935 + "'", int37 == 16711935);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color43);
    }

    @Test
    public void test23745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23745");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.g = (short) 0;
        int int10 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener12;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-2147483392));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test23746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23746");
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
        lwjgl3ApplicationConfiguration0.stencil = (-69392);
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test23747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23747");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.r = 20188;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.initialVisible;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int11 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.r = (-13708800);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
    }

    @Test
    public void test23748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23748");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        java.lang.String str3 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-57312));
        int int9 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test23749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23749");
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
        lwjgl3ApplicationConfiguration16.setwindowResizable(false);
        lwjgl3ApplicationConfiguration16.setwindowWidth(852308735);
        int int26 = lwjgl3ApplicationConfiguration16.getwindowX();
        lwjgl3ApplicationConfiguration16.setdisableAudio(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".prefs/" + "'", str19, ".prefs/");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test23750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23750");
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
        boolean boolean20 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23751");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode9 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode9.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
    }

    @Test
    public void test23752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23752");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(31334400);
        com.badlogic.gdx.graphics.Color color2 = color1.clamp();
        com.badlogic.gdx.graphics.Color color4 = color2.mul((float) (-268471552));
        int int5 = com.badlogic.gdx.graphics.Color.argb8888(color4);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test23753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23753");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int8 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((-50135050));
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color10;
        color10.a = (-1.6947915E38f);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color10);
        color10.a = (-1.7013873E38f);
        com.badlogic.gdx.graphics.Color color21 = color10.sub((float) (-3600), (-1.6427872E38f), 1.00579765E-28f, (float) (-396800));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(color21);
    }

    @Test
    public void test23754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23754");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.windowY = 41903542;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 1677786624;
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test23755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23755");
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
        lwjgl3ApplicationConfiguration15.setdepth((-16711923));
        int int21 = lwjgl3ApplicationConfiguration15.getsamples();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test23756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23756");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        int int17 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test23757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23757");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        int int7 = color0.toIntBits();
        com.badlogic.gdx.graphics.Color color8 = color0.clamp();
        com.badlogic.gdx.graphics.Color color9 = color8.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color14 = color9.set((float) (-57375), (-1.8796216E35f), (float) 191744, (float) 16718848);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16777215 + "'", int7 == 16777215);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test23758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23758");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener17;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.title = "02fe0000";
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
    }

    @Test
    public void test23759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23759");
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
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(50134020);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
    }

    @Test
    public void test23760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23760");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ORANGE;
        com.badlogic.gdx.graphics.Color color5 = color0.sub((float) 43268, (float) '#', (float) (-512), (float) (-65400));
        float float6 = color5.toFloatBits();
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
        com.badlogic.gdx.graphics.Color color27 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color32 = color27.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(color27);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color35 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color40 = color35.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color48 = color42.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color49 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str50 = color49.toString();
        com.badlogic.gdx.graphics.Color color52 = color42.lerp(color49, (-8.0750596E37f));
        boolean boolean53 = color35.equals((java.lang.Object) color42);
        com.badlogic.gdx.graphics.Color color54 = color34.add(color35);
        com.badlogic.gdx.graphics.Color color55 = color19.set(color34);
        com.badlogic.gdx.graphics.Color color56 = color5.set(color55);
        com.badlogic.gdx.graphics.Color color57 = color5.cpy();
        com.badlogic.gdx.graphics.Color color63 = color57.lerp((-5.3419805E37f), (float) (-16711680), (float) (-5071695), (float) 16162147, (float) (-340020704));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.6947657E38f) + "'", float6 == (-1.6947657E38f));
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00ff0000" + "'", str16, "00ff0000");
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "00ff0000" + "'", str50, "00ff0000");
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color63);
    }

    @Test
    public void test23761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23761");
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
        int int25 = com.badlogic.gdx.graphics.Color.rgba4444(color23);
        com.badlogic.gdx.graphics.Color color30 = color23.sub((float) (-134610432), (-3.9429004E34f), (-1.6989325E38f), (-1.6996446E38f));
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color30);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 65520 + "'", int24 == 65520);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 65520 + "'", int25 == 65520);
        org.junit.Assert.assertNotNull(color30);
    }

    @Test
    public void test23762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23762");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1286766592), (float) (-32768), 0.80784315f, (float) 65343);
    }

    @Test
    public void test23763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23763");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16711425);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-340262899));
        lwjgl3ApplicationConfiguration0.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration16.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration16.samples = (-1);
        lwjgl3ApplicationConfiguration16.useGL30 = true;
        lwjgl3ApplicationConfiguration16.setpreferencesDirectory("ffff72ff");
        int int25 = lwjgl3ApplicationConfiguration16.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration16.windowX = 512;
        boolean boolean28 = lwjgl3ApplicationConfiguration16.vSyncEnabled;
        lwjgl3ApplicationConfiguration16.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration16.setFullscreenMode(displayMode31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration33.setpreferencesFileType(fileType34);
        lwjgl3ApplicationConfiguration33.disableAudio = true;
        int int38 = lwjgl3ApplicationConfiguration33.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode39 = lwjgl3ApplicationConfiguration33.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode42 = null;
        lwjgl3ApplicationConfiguration41.setFullscreenMode(displayMode42);
        lwjgl3ApplicationConfiguration41.windowX = 100;
        int int46 = lwjgl3ApplicationConfiguration41.g;
        com.badlogic.gdx.Files.FileType fileType47 = lwjgl3ApplicationConfiguration41.preferencesFileType;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("4169e1ff", fileType47);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode50 = null;
        lwjgl3ApplicationConfiguration49.setFullscreenMode(displayMode50);
        lwjgl3ApplicationConfiguration49.windowX = 100;
        int int54 = lwjgl3ApplicationConfiguration49.g;
        int int55 = lwjgl3ApplicationConfiguration49.getwindowY();
        com.badlogic.gdx.Files.FileType fileType56 = lwjgl3ApplicationConfiguration49.getpreferencesFileType();
        lwjgl3ApplicationConfiguration33.preferencesFileType = fileType56;
        lwjgl3ApplicationConfiguration33.preferencesDirectory = "01000000";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration60.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        int int69 = lwjgl3ApplicationConfiguration60.getwindowHeight();
        boolean boolean70 = lwjgl3ApplicationConfiguration60.useGL30;
        com.badlogic.gdx.Files.FileType fileType71 = lwjgl3ApplicationConfiguration60.getpreferencesFileType();
        lwjgl3ApplicationConfiguration33.setpreferencesFileType(fileType71);
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType71);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType71);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
        org.junit.Assert.assertTrue("'" + fileType47 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType47.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 8 + "'", int54 == 8);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + fileType56 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType56.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 480 + "'", int69 == 480);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + fileType71 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType71.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23764");
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
        int int24 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test23765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23765");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.r = 63519;
        com.badlogic.gdx.graphics.Color color8 = color4.set(512);
        color4.g = 167247232;
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.CHARTREUSE;
        color11.r = (-16776961);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color16 = color4.lerp(color14, (float) (-178));
        float float17 = color14.toFloatBits();
        com.badlogic.gdx.graphics.Color color22 = color14.mul((-1.7011522E38f), (-1.6947917E38f), (float) (-132758), (float) 63550);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color22, 16777164);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
// flaky:         org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-5.5962E-41f) + "'", float17 == (-5.5962E-41f));
        org.junit.Assert.assertNotNull(color22);
    }

    @Test
    public void test23766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23766");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-100), (-1.7014103E38f), (float) 268493567, (float) (-150));
        com.badlogic.gdx.graphics.Color color9 = color4.add((float) (-128), (float) (-16580863), (float) 1878880718, (float) 4517580);
        int int10 = com.badlogic.gdx.graphics.Color.rgba4444(color9);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 255 + "'", int10 == 255);
    }

    @Test
    public void test23767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23767");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color0, (-256));
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.FOREST;
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int6 = lwjgl3ApplicationConfiguration5.getaudioDeviceBufferSize();
        boolean boolean7 = lwjgl3ApplicationConfiguration5.windowResizable;
        lwjgl3ApplicationConfiguration5.depth = (short) 10;
        lwjgl3ApplicationConfiguration5.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = color15.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = color13.mul(color21);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color13, (int) (byte) 0);
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color13;
        com.badlogic.gdx.graphics.Color color26 = color3.set(color13);
        com.badlogic.gdx.graphics.Color color27 = color0.add(color3);
        com.badlogic.gdx.graphics.Color color29 = color0.set((-1980237824));
        com.badlogic.gdx.graphics.Color color31 = color29.mul((float) (-128512));
        color29.b = (-2460160);
        float float34 = color29.g;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
    }

    @Test
    public void test23768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23768");
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
        lwjgl3ApplicationConfiguration0.setsamples((-1665155040));
        int int22 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int23 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1306385665) + "'", int23 == (-1306385665));
    }

    @Test
    public void test23769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23769");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-56610);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setwindowY((-1363456));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test23770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23770");
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
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(0);
        lwjgl3ApplicationConfiguration0.r = 65530;
        int int32 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test23771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23771");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration6.initialBackgroundColor;
        int int8 = lwjgl3ApplicationConfiguration6.windowY;
        int int9 = lwjgl3ApplicationConfiguration6.audioDeviceBufferCount;
        java.lang.String str10 = lwjgl3ApplicationConfiguration6.title;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test23772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23772");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        java.lang.String str15 = lwjgl3ApplicationConfiguration14.preferencesDirectory;
        int int16 = lwjgl3ApplicationConfiguration14.getwindowY();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test23773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23773");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = (-340020704);
        lwjgl3ApplicationConfiguration7.setwindowWidth((-1627389952));
        lwjgl3ApplicationConfiguration7.useGL30 = false;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
    }

    @Test
    public void test23774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23774");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-33488131);
        lwjgl3ApplicationConfiguration0.setwindowX((-16734721));
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-58475));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test23775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23775");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test23776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23776");
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
        lwjgl3ApplicationConfiguration17.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration17.windowY = 16316297;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 480 + "'", int21 == 480);
    }

    @Test
    public void test23777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23777");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        int int43 = lwjgl3ApplicationConfiguration34.getwindowHeight();
        int int44 = lwjgl3ApplicationConfiguration34.getwindowWidth();
        lwjgl3ApplicationConfiguration34.setaudioDeviceBufferCount(151015132);
        java.lang.String str47 = lwjgl3ApplicationConfiguration34.getpreferencesDirectory();
        boolean boolean48 = lwjgl3ApplicationConfiguration34.windowDecorated;
        lwjgl3ApplicationConfiguration34.disableAudio(false);
        boolean boolean51 = color33.equals((java.lang.Object) lwjgl3ApplicationConfiguration34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration34);
        lwjgl3ApplicationConfiguration52.setWindowedMode((-13513103), (-132624));
        java.lang.String str56 = lwjgl3ApplicationConfiguration52.title;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2024675E-38f + "'", float1 == 1.2024675E-38f);
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 480 + "'", int43 == 480);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 640 + "'", int44 == 640);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + ".prefs/" + "'", str47, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration52);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test23778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23778");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((-16711680));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color10, (-16734721));
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color18 = color13.add((float) (byte) 100, (float) 41903542, (float) (short) 10, (-1.6947917E38f));
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color20 = color19.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color20, 1);
        float float23 = color20.r;
        com.badlogic.gdx.graphics.Color color24 = color13.sub(color20);
        com.badlogic.gdx.graphics.Color color25 = color10.set(color13);
        com.badlogic.gdx.graphics.Color color26 = color8.add(color13);
        com.badlogic.gdx.graphics.Color color31 = color26.mul((-1.7009715E38f), (-4.2867603E37f), (float) 1557110528, (float) (-7680));
        int int32 = com.badlogic.gdx.graphics.Color.rgb888(color31);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 255 + "'", int32 == 255);
    }

    @Test
    public void test23779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23779");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode(587202559, 1932040192);
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.valueOf("009df663");
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration0.title = "9c04a400";
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(233437642);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 16776704;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNull(lwjgl3WindowListener29);
    }

    @Test
    public void test23780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23780");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(65296);
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration12.setvSyncEnabled(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test23781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23781");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float9 = color8.a;
        int int10 = color8.toIntBits();
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(10.0f, (-1.7005551E38f), 0.0f, 2.3418409E-38f);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color16;
        int int18 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-63751);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType23);
        lwjgl3ApplicationConfiguration22.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration22.setPreferencesConfig("", fileType28);
        lwjgl3ApplicationConfiguration22.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration22.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration22.setWindowPosition(3, 8897069);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        lwjgl3ApplicationConfiguration37.g = 43268;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = lwjgl3ApplicationConfiguration37.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration42.setpreferencesFileType(fileType43);
        lwjgl3ApplicationConfiguration42.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType48 = null;
        lwjgl3ApplicationConfiguration42.setPreferencesConfig("", fileType48);
        lwjgl3ApplicationConfiguration42.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration42.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration42.setWindowPosition(3, 8897069);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration42);
        lwjgl3ApplicationConfiguration57.g = 43268;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration60.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration60.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration60.setwindowY((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType73 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration60.setpreferencesFileType(fileType73);
        lwjgl3ApplicationConfiguration57.preferencesFileType = fileType73;
        lwjgl3ApplicationConfiguration57.initialVisible = true;
        lwjgl3ApplicationConfiguration57.disableAudio = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration80 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration80.setDecorated(false);
        lwjgl3ApplicationConfiguration80.a = (byte) 10;
        boolean boolean85 = lwjgl3ApplicationConfiguration80.initialVisible;
        int int86 = lwjgl3ApplicationConfiguration80.b;
        lwjgl3ApplicationConfiguration80.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color89 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration80.initialBackgroundColor = color89;
        boolean boolean91 = lwjgl3ApplicationConfiguration80.useGL30;
        com.badlogic.gdx.Files.FileType fileType92 = lwjgl3ApplicationConfiguration80.preferencesFileType;
        lwjgl3ApplicationConfiguration57.setpreferencesFileType(fileType92);
        lwjgl3ApplicationConfiguration37.setPreferencesConfig("00000011", fileType92);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("01ff0000", fileType92);
        lwjgl3ApplicationConfiguration0.setwindowWidth((-2143795200));
        int int98 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration37);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration57);
        org.junit.Assert.assertTrue("'" + fileType73 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType73.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 8 + "'", int86 == 8);
        org.junit.Assert.assertNotNull(color89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + fileType92 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType92.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 16 + "'", int98 == 16);
    }

    @Test
    public void test23782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23782");
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
        boolean boolean24 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color30 = color25.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color30, 100);
        com.badlogic.gdx.graphics.Color color34 = color30.mul(100.0f);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color30);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color35;
        boolean boolean37 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.b = (-2072248832);
        int int42 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
    }

    @Test
    public void test23783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23783");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-62496));
    }

    @Test
    public void test23784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23784");
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
        lwjgl3ApplicationConfiguration17.samples = (-871890944);
        int int20 = lwjgl3ApplicationConfiguration17.stencil;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test23785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23785");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        int int2 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.b = 8;
        com.badlogic.gdx.graphics.Color color5 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test23786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23786");
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
        java.lang.String str22 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.windowWidth = (-8142);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration25.setwindowY(5431006);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
    }

    @Test
    public void test23787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23787");
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
        lwjgl3ApplicationConfiguration26.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration26.windowWidth = (-402678048);
        lwjgl3ApplicationConfiguration26.setuseGL30(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
    }

    @Test
    public void test23788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23788");
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
        int int15 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-270598144));
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(186);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
    }

    @Test
    public void test23789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23789");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-14492160));
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        color2.g = 35;
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(3);
        color6.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color9 = color6.clamp();
        com.badlogic.gdx.graphics.Color color14 = color9.sub((float) (-14540110), (float) (short) -1, (float) (-14513374), (float) 2);
        com.badlogic.gdx.graphics.Color color15 = color2.add(color14);
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color21 = color16.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(color22);
        int int24 = com.badlogic.gdx.graphics.Color.argb8888(color23);
        int int25 = com.badlogic.gdx.graphics.Color.argb8888(color23);
        com.badlogic.gdx.graphics.Color color27 = color23.set(3);
        com.badlogic.gdx.graphics.Color color28 = color2.sub(color27);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color28);
        com.badlogic.gdx.graphics.Color color30 = color1.add(color28);
        com.badlogic.gdx.graphics.Color color35 = color30.add((float) 56864, (-1.700529E38f), (-1.7009445E38f), (float) (-256));
        int int36 = com.badlogic.gdx.graphics.Color.rgba4444(color35);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16777215 + "'", int24 == 16777215);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 16777215 + "'", int25 == 16777215);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 61440 + "'", int36 == 61440);
    }

    @Test
    public void test23790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23790");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        lwjgl3ApplicationConfiguration13.setwindowX(16646400);
        int int17 = lwjgl3ApplicationConfiguration13.gles30ContextMajorVersion;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test23791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23791");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        int int18 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.Files.FileType fileType19 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.b = 402587648;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + fileType19 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType19.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23792");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 8;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.windowY = (-1081344);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test23793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23793");
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
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(63487);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test23794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23794");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str2 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration4.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration4.samples = '4';
        int int9 = lwjgl3ApplicationConfiguration4.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType14 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("hi!", fileType14);
        lwjgl3ApplicationConfiguration4.preferencesFileType = fileType14;
        com.badlogic.gdx.Files.FileType fileType17 = lwjgl3ApplicationConfiguration4.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffff72ff", fileType17);
        int int19 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int20 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".prefs/" + "'", str2, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + fileType17 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType17.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test23795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23795");
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
        com.badlogic.gdx.graphics.Color color53 = color10.add((-2.231065E33f), 0.67741936f, 10.0f, (float) (-1));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color53, 130560);
        com.badlogic.gdx.graphics.Color color56 = new com.badlogic.gdx.graphics.Color(color53);
        float float57 = color53.b;
        com.badlogic.gdx.graphics.Color color58 = new com.badlogic.gdx.graphics.Color(color53);
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
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 0.0f + "'", float57 == 0.0f);
    }

    @Test
    public void test23796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23796");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 983023, (float) 1882, (float) (-148496), (float) (-843808));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.47448015f + "'", float4 == 0.47448015f);
    }

    @Test
    public void test23797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23797");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.b = 16769536;
        lwjgl3ApplicationConfiguration0.setwindowX((-7800960));
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23798");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setTitle("0ff00000");
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setTitle("ffbdfbb0");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 480, (-134217728));
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(9436928, (-65438), (-820510720));
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "88bb2222";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 480 + "'", int1 == 480);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test23799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23799");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str2 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setwindowHeight(6529016);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration6.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration6.windowX = 100;
        int int11 = lwjgl3ApplicationConfiguration6.g;
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration6.getpreferencesFileType();
        boolean boolean13 = lwjgl3ApplicationConfiguration6.windowDecorated;
        lwjgl3ApplicationConfiguration6.setwindowX((-1291845633));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration17.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration17.windowX = 100;
        int int22 = lwjgl3ApplicationConfiguration17.g;
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration17.getpreferencesFileType();
        int int24 = lwjgl3ApplicationConfiguration17.b;
        lwjgl3ApplicationConfiguration17.windowDecorated = true;
        com.badlogic.gdx.Files.FileType fileType27 = lwjgl3ApplicationConfiguration17.preferencesFileType;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("00ff0000", fileType27);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType27);
        int int30 = lwjgl3ApplicationConfiguration0.r;
        boolean boolean31 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".prefs/" + "'", str2, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3WindowListener5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test23800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23800");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration9.windowHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration9);
        lwjgl3ApplicationConfiguration11.setsamples(2);
        int int14 = lwjgl3ApplicationConfiguration11.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration11.b = 5403904;
        boolean boolean17 = lwjgl3ApplicationConfiguration11.windowResizable;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test23801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23801");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-255);
        int int8 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test23802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23802");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-17694960), 1175295);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(8704);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(fileType12);
    }

    @Test
    public void test23803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23803");
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
        int int15 = lwjgl3ApplicationConfiguration8.getaudioDeviceBufferSize();
        int int16 = lwjgl3ApplicationConfiguration8.r;
        boolean boolean17 = lwjgl3ApplicationConfiguration8.windowResizable;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23804");
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
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color((float) (-257551), (-4.2865007E37f), (float) 2080800, 2.3477242E-38f);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color21, (-2147483616));
        org.junit.Assert.assertNull(fileType14);
    }

    @Test
    public void test23805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23805");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration3.windowListener = lwjgl3WindowListener4;
        boolean boolean6 = lwjgl3ApplicationConfiguration3.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = lwjgl3ApplicationConfiguration3.fullscreenMode;
        lwjgl3ApplicationConfiguration3.disableAudio(false);
        lwjgl3ApplicationConfiguration3.windowX = (-524869);
        int int13 = lwjgl3ApplicationConfiguration3.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration3.stencil = (-603914496);
        int int16 = lwjgl3ApplicationConfiguration3.getgles30ContextMinorVersion();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(lwjgl3DisplayMode8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test23806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23806");
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
        float float48 = color39.g;
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
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.0f + "'", float48 == 0.0f);
    }

    @Test
    public void test23807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23807");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType4 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1800));
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 19719;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test23808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23808");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-2143297280), (float) (-1677719560), (float) (-568254208), (-5.350142E37f));
    }

    @Test
    public void test23809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23809");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.title = "88bb2222";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 195840;
        int int18 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 480 + "'", int18 == 480);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
    }

    @Test
    public void test23810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23810");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color9 = color3.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = color1.mul(color9);
        int int11 = color1.toIntBits();
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color1, 11323275);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16711935 + "'", int11 == 16711935);
    }

    @Test
    public void test23811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23811");
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
        boolean boolean14 = lwjgl3ApplicationConfiguration8.useGL30;
        int int15 = lwjgl3ApplicationConfiguration8.b;
        int int16 = lwjgl3ApplicationConfiguration8.getaudioDeviceBufferCount();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test23812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23812");
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
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-58368);
        lwjgl3ApplicationConfiguration0.windowX = (-8424192);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
    }

    @Test
    public void test23813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23813");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, 130560);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-8672), (-8454400));
        lwjgl3ApplicationConfiguration0.windowX = (-167641088);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test23814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23814");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.WHITE;
        com.badlogic.gdx.graphics.Color color1 = color0.premultiplyAlpha();
        float float2 = color0.a;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(25500);
        com.badlogic.gdx.graphics.Color color5 = color0.set(color4);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color11 = color5.add((float) (-568254208), (float) (-65024), (-2.32278428E17f), (float) (-1268));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.6117647f + "'", float2 == 0.6117647f);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test23815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23815");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1320288256), 220, (-65536));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(268435455);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test23816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23816");
        int int3 = com.badlogic.gdx.graphics.Color.rgb565(0.25490198f, (float) (-33565334), (float) 16735984);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1056767744 + "'", int3 == 1056767744);
    }

    @Test
    public void test23817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23817");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.rgba8888ToColor(color0, (-100209390));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23818");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2560));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration2.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        boolean boolean11 = lwjgl3ApplicationConfiguration2.getvSyncEnabled();
        lwjgl3ApplicationConfiguration2.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color15 = color14.cpy();
        int int16 = com.badlogic.gdx.graphics.Color.argb8888(color15);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.FOREST;
        int int18 = com.badlogic.gdx.graphics.Color.argb8888(color17);
        com.badlogic.gdx.graphics.Color color20 = color15.lerp(color17, (float) (-50396672));
        int int21 = com.badlogic.gdx.graphics.Color.argb8888(color20);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color23 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color28 = color23.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color23);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color36 = color31.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color44 = color38.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str46 = color45.toString();
        com.badlogic.gdx.graphics.Color color48 = color38.lerp(color45, (-8.0750596E37f));
        boolean boolean49 = color31.equals((java.lang.Object) color38);
        com.badlogic.gdx.graphics.Color color50 = color30.add(color31);
        com.badlogic.gdx.graphics.Color color52 = color22.lerp(color30, (float) (-14540110));
        int int53 = com.badlogic.gdx.graphics.Color.rgb565(color22);
        com.badlogic.gdx.graphics.Color color54 = color20.sub(color22);
        lwjgl3ApplicationConfiguration2.initialBackgroundColor = color20;
        float float56 = color20.a;
        com.badlogic.gdx.graphics.Color color61 = color20.add((float) (-16777215), (float) (byte) 10, (float) 43268, (float) 3855);
        float float62 = color61.b;
        com.badlogic.gdx.graphics.Color color63 = color1.add(color61);
        com.badlogic.gdx.graphics.Color color68 = color1.sub((float) (-225), 0.0f, (float) 100, (float) (-1011333568));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15200130 + "'", int16 == 15200130);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16777215 + "'", int21 == 16777215);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "00ff0000" + "'", str46, "00ff0000");
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.0f + "'", float56 == 0.0f);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 1.0f + "'", float62 == 1.0f);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertNotNull(color68);
    }

    @Test
    public void test23819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23819");
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
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-16741598));
        lwjgl3ApplicationConfiguration0.samples = (-2142638528);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, 47616);
        lwjgl3ApplicationConfiguration0.windowY = (-299504);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-1363456));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test23820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23820");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-335));
        com.badlogic.gdx.graphics.Color color2 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color(color1);
        float float4 = color3.r;
        color3.b = 4242;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.69411767f + "'", float4 == 0.69411767f);
    }

    @Test
    public void test23821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23821");
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
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-2147222656));
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.graphics.Color color25 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(color25);
    }

    @Test
    public void test23822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23822");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1291845633), (float) (-183869281), (float) 4095, (float) 7);
        com.badlogic.gdx.graphics.Color color9 = color4.add((float) (-8520704), (float) (-68935680), (float) 56864, (float) (-10));
        int int10 = color9.toIntBits();
        java.lang.String str11 = color9.toString();
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16711680 + "'", int10 == 16711680);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0000ff00" + "'", str11, "0000ff00");
    }

    @Test
    public void test23823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23823");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.windowY = 33488896;
        lwjgl3ApplicationConfiguration0.setsamples((-1291911168));
        int int24 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 640 + "'", int24 == 640);
    }

    @Test
    public void test23824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23824");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration3.windowListener = lwjgl3WindowListener4;
        lwjgl3ApplicationConfiguration3.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration3.getpreferencesFileType();
        lwjgl3ApplicationConfiguration3.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration3);
        int int12 = lwjgl3ApplicationConfiguration3.getaudioDeviceBufferSize();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test23825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23825");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLACK;
        float float1 = color0.r;
        com.badlogic.gdx.graphics.Color color6 = color0.set((-8.0750596E37f), 0.0f, (float) (-1L), (float) 65024);
        float float7 = color0.g;
        com.badlogic.gdx.graphics.Color color8 = color0.cpy();
        com.badlogic.gdx.graphics.Color color10 = color0.mul((float) (-16711923));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color0, (-934295308));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test23826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23826");
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
        color28.g = 14486016;
        int int34 = com.badlogic.gdx.graphics.Color.rgb888(color28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8064516f + "'", float23 == 0.8064516f);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-256) + "'", int34 == (-256));
    }

    @Test
    public void test23827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23827");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1241513983), 6147990);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowY(16);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        int int18 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-9474482));
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
    }

    @Test
    public void test23828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23828");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(0.0f, (float) (-45390), (float) (-16719105), (float) 2106077);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1666103872 + "'", int4 == 1666103872);
    }

    @Test
    public void test23829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23829");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int8 = lwjgl3ApplicationConfiguration7.samples;
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration7.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = 1580097;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test23830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23830");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 480 + "'", int7 == 480);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test23831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23831");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.r = (byte) -1;
        lwjgl3ApplicationConfiguration10.setaudioDeviceBufferCount((-65486));
        int int15 = lwjgl3ApplicationConfiguration10.gles30ContextMajorVersion;
        int int16 = lwjgl3ApplicationConfiguration10.getgles30ContextMajorVersion();
        int int17 = lwjgl3ApplicationConfiguration10.getwindowX();
        lwjgl3ApplicationConfiguration10.windowX = 1442840575;
        lwjgl3ApplicationConfiguration10.g = 33488896;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test23832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23832");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(3260928);
    }

    @Test
    public void test23833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23833");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-4210688));
    }

    @Test
    public void test23834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23834");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-1109610));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-282950560) + "'", int1 == (-282950560));
    }

    @Test
    public void test23835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23835");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.title = "ffff72ff";
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setwindowWidth(52);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-15925492);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test23836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23836");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowWidth(0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
    }

    @Test
    public void test23837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23837");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int8 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setwindowWidth(16776960);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int13 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test23838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23838");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 7, (float) 25500, (float) (-7168), (float) (-1616365568));
    }

    @Test
    public void test23839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23839");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2130839799));
        com.badlogic.gdx.graphics.Color color3 = new com.badlogic.gdx.graphics.Color((-1958400));
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color3);
        com.badlogic.gdx.graphics.Color color5 = color1.set(color4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration6.setpreferencesFileType(fileType7);
        lwjgl3ApplicationConfiguration6.useVsync(false);
        lwjgl3ApplicationConfiguration6.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration6);
        boolean boolean14 = lwjgl3ApplicationConfiguration6.windowDecorated;
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.GREEN;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color15);
        int int17 = com.badlogic.gdx.graphics.Color.argb8888(color15);
        com.badlogic.gdx.graphics.Color color19 = color4.lerp(color15, (float) 35904);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(color15);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-16777216) + "'", int17 == (-16777216));
        org.junit.Assert.assertNotNull(color19);
    }

    @Test
    public void test23840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23840");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int4 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test23841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23841");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.stencil = (-1);
        int int7 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        boolean boolean8 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setdepth((-598016));
        int int14 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test23842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23842");
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
        lwjgl3ApplicationConfiguration0.windowWidth = 34277;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test23843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23843");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setwindowY((-18));
        com.badlogic.gdx.Files.FileType fileType5 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(16739839);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23844");
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
        lwjgl3ApplicationConfiguration0.setwindowY(61680);
        lwjgl3ApplicationConfiguration0.setwindowHeight(16648950);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.graphics.Color color26 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color26.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color26);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color29;
        color29.r = 524288;
        com.badlogic.gdx.graphics.Color color33 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color38 = color33.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        color33.g = 151015132;
        com.badlogic.gdx.graphics.Color color45 = color33.sub((float) 10L, (float) 480, (float) (-1611265692), (float) (-8672));
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color(color33);
        float float47 = color33.a;
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color(1671296512);
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color(color49);
        com.badlogic.gdx.graphics.Color color51 = color33.add(color49);
        com.badlogic.gdx.graphics.Color color56 = color49.set((float) (-16720897), (-1.70141E38f), (float) 788480, 4.3190737E-19f);
        com.badlogic.gdx.graphics.Color color58 = color29.lerp(color49, (-8.4042517E37f));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 1.0f + "'", float47 == 1.0f);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color58);
    }

    @Test
    public void test23845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23845");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        int int10 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color17 = color15.set((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.stencil = (-1291845888);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration23.setpreferencesFileType(fileType24);
        lwjgl3ApplicationConfiguration23.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration23.setPreferencesConfig("", fileType29);
        com.badlogic.gdx.Files.FileType fileType31 = lwjgl3ApplicationConfiguration23.preferencesFileType;
        int int32 = lwjgl3ApplicationConfiguration23.samples;
        int int33 = lwjgl3ApplicationConfiguration23.windowHeight;
        lwjgl3ApplicationConfiguration23.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color38 = lwjgl3ApplicationConfiguration23.initialBackgroundColor;
        lwjgl3ApplicationConfiguration23.audioDeviceBufferSize = 16711935;
        lwjgl3ApplicationConfiguration23.title = "00ff0000";
        int int43 = lwjgl3ApplicationConfiguration23.windowWidth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType45 = null;
        lwjgl3ApplicationConfiguration44.setpreferencesFileType(fileType45);
        lwjgl3ApplicationConfiguration44.disableAudio = true;
        int int49 = lwjgl3ApplicationConfiguration44.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode50 = lwjgl3ApplicationConfiguration44.fullscreenMode;
        lwjgl3ApplicationConfiguration44.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration44.setwindowY((int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration55.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType59 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration55.setPreferencesConfig("hi!", fileType59);
        lwjgl3ApplicationConfiguration44.preferencesFileType = fileType59;
        lwjgl3ApplicationConfiguration23.preferencesFileType = fileType59;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType59);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNull(fileType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 480 + "'", int33 == 480);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 640 + "'", int43 == 640);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode50);
        org.junit.Assert.assertTrue("'" + fileType59 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType59.equals(com.badlogic.gdx.Files.FileType.Absolute));
    }

    @Test
    public void test23846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23846");
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
        com.badlogic.gdx.graphics.Color color38 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + hdpiMode10 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode10.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(color38);
    }

    @Test
    public void test23847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23847");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(100);
        int int19 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.g = (-2147222656);
        int int22 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.windowWidth = (-1879024896);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-150936577));
        lwjgl3ApplicationConfiguration0.b = (-142576);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test23848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23848");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GREEN;
        com.badlogic.gdx.graphics.Color color6 = color0.lerp((-4.581683E37f), (float) 20160, (float) 13260, (float) (-187392), (float) (-1879860224));
        color6.r = 0.44444445f;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color6, (-134355456));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color6, (-112792302));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color6, 653309);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((float) 160, (float) 1070333936, (float) (-1311232), (float) 40462);
        com.badlogic.gdx.graphics.Color color20 = color6.sub(color19);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color27 = color22.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color22);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color28);
        com.badlogic.gdx.graphics.Color color30 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color35 = color30.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color37 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color43 = color37.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color44 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str45 = color44.toString();
        com.badlogic.gdx.graphics.Color color47 = color37.lerp(color44, (-8.0750596E37f));
        boolean boolean48 = color30.equals((java.lang.Object) color37);
        com.badlogic.gdx.graphics.Color color49 = color29.add(color30);
        com.badlogic.gdx.graphics.Color color51 = color21.lerp(color29, (float) (-14540110));
        int int52 = com.badlogic.gdx.graphics.Color.rgb565(color21);
        com.badlogic.gdx.graphics.Color color57 = color21.mul((float) (byte) 0, (float) (byte) 100, (float) 35, (float) (-255));
        com.badlogic.gdx.graphics.Color color58 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color59 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color61 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color63 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color69 = color63.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color70 = color61.mul(color69);
        com.badlogic.gdx.graphics.Color color72 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color78 = color72.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color78.g = (short) 1;
        com.badlogic.gdx.graphics.Color color82 = color70.lerp(color78, (float) 25500);
        com.badlogic.gdx.graphics.Color color87 = color70.mul(0.0f, (float) (-8142), (float) (-1562574848), (-1.0f));
        com.badlogic.gdx.graphics.Color color88 = color59.set(color70);
        com.badlogic.gdx.graphics.Color color89 = new com.badlogic.gdx.graphics.Color(color70);
        com.badlogic.gdx.graphics.Color color90 = color58.set(color89);
        com.badlogic.gdx.graphics.Color color91 = new com.badlogic.gdx.graphics.Color(color90);
        com.badlogic.gdx.graphics.Color color92 = color20.set(color90);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "00ff0000" + "'", str45, "00ff0000");
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNotNull(color70);
        org.junit.Assert.assertNotNull(color78);
        org.junit.Assert.assertNotNull(color82);
        org.junit.Assert.assertNotNull(color87);
        org.junit.Assert.assertNotNull(color88);
        org.junit.Assert.assertNotNull(color90);
        org.junit.Assert.assertNotNull(color92);
    }

    @Test
    public void test23849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23849");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (-262646));
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.getaudioDeviceSimultaneousSources();
        java.lang.String str12 = lwjgl3ApplicationConfiguration10.getpreferencesDirectory();
        int int13 = lwjgl3ApplicationConfiguration10.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test23850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23850");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        int int3 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str5 = lwjgl3ApplicationConfiguration4.title;
        lwjgl3ApplicationConfiguration4.windowY = 20188;
        lwjgl3ApplicationConfiguration4.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration10.disableAudio = true;
        int int15 = lwjgl3ApplicationConfiguration10.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode16 = lwjgl3ApplicationConfiguration10.fullscreenMode;
        lwjgl3ApplicationConfiguration10.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration19.setwindowX((int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = lwjgl3ApplicationConfiguration19.hdpiMode;
        lwjgl3ApplicationConfiguration10.hdpiMode = hdpiMode24;
        lwjgl3ApplicationConfiguration4.hdpiMode = hdpiMode24;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode24;
        lwjgl3ApplicationConfiguration0.stencil = (-16734721);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode16);
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23851");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setAudioConfig(14500320, (-524536), (-240));
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test23852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23852");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (byte) 10, (float) (byte) 0, (float) 100, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color6 = color4.set((-150994945));
        com.badlogic.gdx.graphics.Color color8 = color6.mul((float) (-3155968));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test23853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23853");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration8.setAudioConfig((-48), (-2076210), 266076800);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
    }

    @Test
    public void test23854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23854");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 453010332, 0.44444445f, (float) (-8192), (float) (-57375));
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color4, (-162117120));
    }

    @Test
    public void test23855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23855");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.windowY = (-2147438080);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str13 = lwjgl3ApplicationConfiguration12.title;
        lwjgl3ApplicationConfiguration12.a = (-1);
        boolean boolean16 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        lwjgl3ApplicationConfiguration12.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration12.useVsync(true);
        lwjgl3ApplicationConfiguration12.setgles30ContextMajorVersion((-254));
        int int23 = lwjgl3ApplicationConfiguration12.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color33 = lwjgl3ApplicationConfiguration24.initialBackgroundColor;
        int int34 = lwjgl3ApplicationConfiguration24.gles30ContextMajorVersion;
        boolean boolean35 = lwjgl3ApplicationConfiguration24.initialVisible;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration36.setpreferencesFileType(fileType37);
        lwjgl3ApplicationConfiguration36.disableAudio = true;
        int int41 = lwjgl3ApplicationConfiguration36.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode42 = lwjgl3ApplicationConfiguration36.fullscreenMode;
        lwjgl3ApplicationConfiguration36.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration36.setwindowY((int) '#');
        lwjgl3ApplicationConfiguration36.setwindowHeight((int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode50 = null;
        lwjgl3ApplicationConfiguration49.setFullscreenMode(displayMode50);
        lwjgl3ApplicationConfiguration49.samples = (-1);
        lwjgl3ApplicationConfiguration49.useGL30 = true;
        lwjgl3ApplicationConfiguration49.setpreferencesDirectory("ffff72ff");
        int int58 = lwjgl3ApplicationConfiguration49.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration49.windowY = 20188;
        int int61 = lwjgl3ApplicationConfiguration49.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode62 = lwjgl3ApplicationConfiguration49.hdpiMode;
        lwjgl3ApplicationConfiguration36.hdpiMode = hdpiMode62;
        lwjgl3ApplicationConfiguration24.hdpiMode = hdpiMode62;
        lwjgl3ApplicationConfiguration12.hdpiMode = hdpiMode62;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode62);
        lwjgl3ApplicationConfiguration0.setAudioConfig(397865479, 1158662112, (-2345472));
        com.badlogic.gdx.Graphics.DisplayMode displayMode71 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode71);
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode42);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 9 + "'", int61 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode62 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode62.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23856");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GREEN;
        com.badlogic.gdx.graphics.Color color6 = color0.lerp((-4.581683E37f), (float) 20160, (float) 13260, (float) (-187392), (float) (-1879860224));
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        int int8 = color7.toIntBits();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-16776961) + "'", int8 == (-16776961));
    }

    @Test
    public void test23857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23857");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(16711902);
    }

    @Test
    public void test23858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23858");
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
        lwjgl3ApplicationConfiguration0.windowY = 4030;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test23859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23859");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int13 = lwjgl3ApplicationConfiguration0.r;
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.windowHeight = (-536870912);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
    }

    @Test
    public void test23860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23860");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-15671025), (-268), 587202527, 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7011278E38f) + "'", float4 == (-1.7011278E38f));
    }

    @Test
    public void test23861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23861");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test23862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23862");
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
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test23863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23863");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-57120), (-240), (-1644167168), (-2132905712));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-53024) + "'", int4 == (-53024));
    }

    @Test
    public void test23864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23864");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str11 = lwjgl3ApplicationConfiguration10.title;
        int int12 = lwjgl3ApplicationConfiguration10.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration10.setaudioDeviceBufferSize((-22));
        int int15 = lwjgl3ApplicationConfiguration10.getwindowY();
        lwjgl3ApplicationConfiguration10.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.Files.FileType fileType18 = lwjgl3ApplicationConfiguration10.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("0ff00000", fileType18);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = '4';
        int int22 = lwjgl3ApplicationConfiguration0.r;
        int int23 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-524544);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + fileType18 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType18.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test23865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23865");
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
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(1664640000);
        lwjgl3ApplicationConfiguration0.windowHeight = 1426063356;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test23866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23866");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.title = "4169e1ff";
        int int7 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.title = "00001100";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test23867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23867");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 61450, (float) 524288, (float) (-1879860224), 0.0f);
        float float5 = color4.g;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color11 = color6.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str12 = color11.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color11, 1);
        com.badlogic.gdx.graphics.Color color19 = color11.mul((float) 41903542, (float) (-8672), (float) (-50135050), (float) (-10));
        com.badlogic.gdx.graphics.Color color25 = color19.lerp((float) (-65025), (-0.0f), (float) (-65486), (float) (byte) 10, (float) (-1L));
        color19.b = 652800;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color19, (-27133));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str31 = lwjgl3ApplicationConfiguration30.title;
        lwjgl3ApplicationConfiguration30.a = (-1);
        boolean boolean34 = lwjgl3ApplicationConfiguration30.vSyncEnabled;
        lwjgl3ApplicationConfiguration30.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color37 = lwjgl3ApplicationConfiguration30.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(color37);
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color38);
        com.badlogic.gdx.graphics.Color color40 = color19.mul(color38);
        com.badlogic.gdx.graphics.Color color42 = color4.lerp(color38, (float) (-16580865));
        com.badlogic.gdx.graphics.Color color44 = new com.badlogic.gdx.graphics.Color(246);
        boolean boolean45 = color38.equals((java.lang.Object) 246);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ffffffff" + "'", str12, "ffffffff");
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test23868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23868");
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
        int int21 = lwjgl3ApplicationConfiguration0.getwindowY();
        java.lang.String str22 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-262646) + "'", int21 == (-262646));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "eff1ff00" + "'", str22, "eff1ff00");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
    }

    @Test
    public void test23869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23869");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(537395200);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(2099200);
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.samples = (-55296);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test23870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23870");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowHeight((-18));
        lwjgl3ApplicationConfiguration0.setAudioConfig(1677786624, (-14540110), 31334400);
        boolean boolean16 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("00ff00dc");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23871");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        lwjgl3ApplicationConfiguration0.setwindowY((int) ' ');
        lwjgl3ApplicationConfiguration0.setsamples(51);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration9.setpreferencesFileType(fileType10);
        lwjgl3ApplicationConfiguration9.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration9.setPreferencesConfig("", fileType15);
        int int17 = lwjgl3ApplicationConfiguration9.r;
        int int18 = lwjgl3ApplicationConfiguration9.getwindowY();
        lwjgl3ApplicationConfiguration9.setTitle(".prefs/");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration22.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Files.FileType fileType25 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType25);
        lwjgl3ApplicationConfiguration22.setwindowY(100);
        lwjgl3ApplicationConfiguration22.r = 0;
        lwjgl3ApplicationConfiguration22.setsamples(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration33.setpreferencesFileType(fileType34);
        lwjgl3ApplicationConfiguration33.disableAudio = true;
        lwjgl3ApplicationConfiguration33.initialVisible = true;
        int int40 = lwjgl3ApplicationConfiguration33.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration33.b = (-62986);
        lwjgl3ApplicationConfiguration33.b = 2;
        lwjgl3ApplicationConfiguration33.setwindowX((int) 'a');
        lwjgl3ApplicationConfiguration33.setsamples((int) (short) 10);
        lwjgl3ApplicationConfiguration33.g = 65295;
        boolean boolean51 = lwjgl3ApplicationConfiguration33.initialVisible;
        com.badlogic.gdx.Files.FileType fileType52 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration33.setpreferencesFileType(fileType52);
        lwjgl3ApplicationConfiguration22.preferencesFileType = fileType52;
        lwjgl3ApplicationConfiguration9.setPreferencesConfig("00000000", fileType52);
        lwjgl3ApplicationConfiguration9.depth = (-379904);
        lwjgl3ApplicationConfiguration9.setWindowPosition((-178), (-8520704));
        lwjgl3ApplicationConfiguration9.setWindowPosition((-4326480), (-790528));
        boolean boolean64 = lwjgl3ApplicationConfiguration9.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode66 = lwjgl3ApplicationConfiguration65.fullscreenMode;
        com.badlogic.gdx.Files.FileType fileType67 = lwjgl3ApplicationConfiguration65.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType67;
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + fileType52 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType52.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration65);
        org.junit.Assert.assertNull(lwjgl3DisplayMode66);
        org.junit.Assert.assertTrue("'" + fileType67 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType67.equals(com.badlogic.gdx.Files.FileType.Local));
    }

    @Test
    public void test23872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23872");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.11764706f, (float) 65295, 0.0f, (float) (-1306385665));
        float float5 = color4.r;
        color4.g = (-8320);
        int int8 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.11764706f + "'", float5 == 0.11764706f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-541163520) + "'", int8 == (-541163520));
    }

    @Test
    public void test23873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23873");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration12.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration12.windowX = 100;
        int int17 = lwjgl3ApplicationConfiguration12.g;
        java.lang.String str18 = lwjgl3ApplicationConfiguration12.getpreferencesDirectory();
        int int19 = lwjgl3ApplicationConfiguration12.depth;
        lwjgl3ApplicationConfiguration12.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = lwjgl3ApplicationConfiguration12.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int24 = lwjgl3ApplicationConfiguration23.getaudioDeviceBufferSize();
        boolean boolean25 = lwjgl3ApplicationConfiguration23.windowResizable;
        lwjgl3ApplicationConfiguration23.disableAudio = false;
        lwjgl3ApplicationConfiguration23.setwindowHeight((int) (byte) 10);
        int int30 = lwjgl3ApplicationConfiguration23.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration31.setpreferencesFileType(fileType32);
        lwjgl3ApplicationConfiguration31.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration31.setPreferencesConfig("", fileType37);
        lwjgl3ApplicationConfiguration31.g = (short) 0;
        lwjgl3ApplicationConfiguration31.windowX = 35;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = lwjgl3ApplicationConfiguration31.hdpiMode;
        lwjgl3ApplicationConfiguration23.hdpiMode = hdpiMode43;
        lwjgl3ApplicationConfiguration12.hdpiMode = hdpiMode43;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode43);
        int int47 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-3315));
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".prefs/" + "'", str18, ".prefs/");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 16 + "'", int47 == 16);
    }

    @Test
    public void test23874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23874");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (-1), (-270598144));
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
    }

    @Test
    public void test23875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23875");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setdepth((-1879860224));
        int int12 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int13 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 480 + "'", int13 == 480);
    }

    @Test
    public void test23876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23876");
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
        int int23 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int24 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 640 + "'", int23 == 640);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test23877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23877");
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
        int int12 = lwjgl3ApplicationConfiguration8.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode13 = null;
        lwjgl3ApplicationConfiguration8.fullscreenMode = lwjgl3DisplayMode13;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test23878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23878");
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
        com.badlogic.gdx.graphics.Color color29 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color30 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color31 = color29.mul(color30);
        com.badlogic.gdx.graphics.Color color36 = color29.sub((float) 1L, (float) (-27809536), (float) (-1), (float) (byte) 0);
        com.badlogic.gdx.graphics.Color color37 = color28.set(color29);
        com.badlogic.gdx.graphics.Color color38 = color37.cpy();
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color((float) (-1291845633), (float) (-183869281), (float) 4095, (float) 7);
        com.badlogic.gdx.graphics.Color color45 = color43.set(385941504);
        com.badlogic.gdx.graphics.Color color46 = color38.sub(color45);
        com.badlogic.gdx.graphics.Color color47 = color45.cpy();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color47);
    }

    @Test
    public void test23879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23879");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-5.08119E37f), (-1.06283065E37f), 0.0f, (float) (-532099584));
    }

    @Test
    public void test23880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23880");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 167247232;
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.stencil = (-33565334);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color19);
    }

    @Test
    public void test23881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23881");
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
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int22 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int23 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.graphics.Color color24 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration25.setFullscreenMode(displayMode26);
        lwjgl3ApplicationConfiguration25.samples = '4';
        int int30 = lwjgl3ApplicationConfiguration25.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration31.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType35 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration31.setPreferencesConfig("hi!", fileType35);
        lwjgl3ApplicationConfiguration25.preferencesFileType = fileType35;
        lwjgl3ApplicationConfiguration25.setInitialVisible(false);
        int int40 = lwjgl3ApplicationConfiguration25.getsamples();
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration25.initialBackgroundColor = color41;
        int int43 = lwjgl3ApplicationConfiguration25.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration25.audioDeviceBufferCount = (-84);
        lwjgl3ApplicationConfiguration25.setwindowResizable(true);
        boolean boolean48 = color24.equals((java.lang.Object) true);
        com.badlogic.gdx.graphics.Color color50 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color58 = color52.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color59 = color50.mul(color58);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color50, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color62 = color50.cpy();
        com.badlogic.gdx.graphics.Color color63 = color24.set(color62);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + fileType35 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType35.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 16 + "'", int43 == 16);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color63);
    }

    @Test
    public void test23882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23882");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = lwjgl3ApplicationConfiguration8.windowListener;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 480 + "'", int26 == 480);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration29);
        org.junit.Assert.assertNull(lwjgl3WindowListener30);
    }

    @Test
    public void test23883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23883");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.windowY = (-1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int11 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int13 = lwjgl3ApplicationConfiguration0.windowY;
        int int14 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
    }

    @Test
    public void test23884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23884");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int11 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setWindowedMode((-128508928), (-11604982));
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        boolean boolean16 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowX((-397537));
        boolean boolean20 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test23885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23885");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        boolean boolean22 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 158;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-50135050));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test23886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23886");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration5.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration5.setpreferencesDirectory("ff00ff00");
        int int10 = lwjgl3ApplicationConfiguration5.getaudioDeviceBufferSize();
        java.lang.String str11 = lwjgl3ApplicationConfiguration5.title;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test23887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23887");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setAudioConfig(512, (-14540110), (int) (byte) 1);
        int int13 = lwjgl3ApplicationConfiguration8.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
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
        boolean boolean30 = lwjgl3ApplicationConfiguration15.getvSyncEnabled();
        lwjgl3ApplicationConfiguration15.r = 130560;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration33.setWindowedMode(1, 10);
        int int39 = lwjgl3ApplicationConfiguration33.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = lwjgl3ApplicationConfiguration33.hdpiMode;
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration8.hdpiMode = hdpiMode40;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertNull(fileType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 480 + "'", int25 == 480);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23888");
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
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int17 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean18 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setwindowWidth(16767488);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23889");
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
        int int47 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.windowY = (-16581120);
        int int50 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + fileType16 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType16.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + fileType43 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType43.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 640 + "'", int47 == 640);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 16 + "'", int50 == 16);
    }

    @Test
    public void test23890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23890");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-598016));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
    }

    @Test
    public void test23891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23891");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration10.disableAudio = true;
        int int15 = lwjgl3ApplicationConfiguration10.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode16 = lwjgl3ApplicationConfiguration10.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration18.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration18.windowX = 100;
        int int23 = lwjgl3ApplicationConfiguration18.g;
        com.badlogic.gdx.Files.FileType fileType24 = lwjgl3ApplicationConfiguration18.preferencesFileType;
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("4169e1ff", fileType24);
        lwjgl3ApplicationConfiguration10.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration10.disableAudio(false);
        lwjgl3ApplicationConfiguration10.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int33 = lwjgl3ApplicationConfiguration32.getaudioDeviceBufferSize();
        boolean boolean34 = lwjgl3ApplicationConfiguration32.windowResizable;
        int int35 = lwjgl3ApplicationConfiguration32.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration32.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration32);
        lwjgl3ApplicationConfiguration38.setaudioDeviceSimultaneousSources((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType41 = lwjgl3ApplicationConfiguration38.getpreferencesFileType();
        lwjgl3ApplicationConfiguration10.preferencesFileType = fileType41;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType41);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-65011690), 16777117, (-103936));
        int int48 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20188 + "'", int9 == 20188);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + fileType24 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType24.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 512 + "'", int33 == 512);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration38);
        org.junit.Assert.assertTrue("'" + fileType41 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType41.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
    }

    @Test
    public void test23892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23892");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration3.windowListener = lwjgl3WindowListener4;
        boolean boolean6 = lwjgl3ApplicationConfiguration3.getdisableAudio();
        lwjgl3ApplicationConfiguration3.windowWidth = (-12632257);
        int int9 = lwjgl3ApplicationConfiguration3.windowHeight;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration3.preferencesFileType;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((float) (-603664549), (float) (-469852380), (float) 268435456, (float) (-59160));
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((float) 217570864, (float) 62976, (-7.5108E-22f), (float) (-13513103));
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color20, 0);
        com.badlogic.gdx.graphics.Color color23 = color15.add(color20);
        int int24 = com.badlogic.gdx.graphics.Color.rgb888(color23);
        lwjgl3ApplicationConfiguration3.initialBackgroundColor = color23;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 255 + "'", int24 == 255);
    }

    @Test
    public void test23893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23893");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 2;
        int int14 = lwjgl3ApplicationConfiguration0.windowY;
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-17426));
        lwjgl3ApplicationConfiguration0.samples = (-599662592);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test23894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23894");
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
        lwjgl3ApplicationConfiguration22.useVsync(true);
        lwjgl3ApplicationConfiguration22.setdisableAudio(false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
    }

    @Test
    public void test23895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23895");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color32 = lwjgl3ApplicationConfiguration23.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode33 = null;
        lwjgl3ApplicationConfiguration23.fullscreenMode = lwjgl3DisplayMode33;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int38 = lwjgl3ApplicationConfiguration37.getaudioDeviceBufferSize();
        boolean boolean39 = lwjgl3ApplicationConfiguration37.windowResizable;
        lwjgl3ApplicationConfiguration37.disableAudio = false;
        lwjgl3ApplicationConfiguration37.setwindowHeight((int) (byte) 10);
        int int44 = lwjgl3ApplicationConfiguration37.getdepth();
        lwjgl3ApplicationConfiguration37.setaudioDeviceBufferSize((int) (byte) -1);
        lwjgl3ApplicationConfiguration37.setWindowPosition((-1611265692), (-50135050));
        lwjgl3ApplicationConfiguration37.gles30ContextMajorVersion = (-61455);
        lwjgl3ApplicationConfiguration37.a = (-10026973);
        com.badlogic.gdx.Files.FileType fileType54 = lwjgl3ApplicationConfiguration37.preferencesFileType;
        lwjgl3ApplicationConfiguration35.setPreferencesConfig("0ff00000", fileType54);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType54;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener57 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener57;
        lwjgl3ApplicationConfiguration0.a = (-513);
        lwjgl3ApplicationConfiguration0.windowY = 0;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 16 + "'", int44 == 16);
        org.junit.Assert.assertTrue("'" + fileType54 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType54.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23896");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setInitialVisible(true);
        lwjgl3ApplicationConfiguration8.g = (-16734721);
        boolean boolean13 = lwjgl3ApplicationConfiguration8.getwindowDecorated();
        lwjgl3ApplicationConfiguration8.audioDeviceBufferSize = 768;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test23897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23897");
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
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        int int16 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean18 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test23898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23898");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, 8);
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int12 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType14);
        lwjgl3ApplicationConfiguration13.useVsync(false);
        lwjgl3ApplicationConfiguration13.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration13.a = (-62986);
        int int23 = lwjgl3ApplicationConfiguration13.windowY;
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color30 = color28.set((int) (short) 0);
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color30);
        color30.g = 58111;
        java.lang.Object obj34 = null;
        boolean boolean35 = color30.equals(obj34);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color30;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test23899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23899");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.title = "88bb2222";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 195840;
        int int18 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int19 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(16777201);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 480 + "'", int18 == 480);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 480 + "'", int19 == 480);
    }

    @Test
    public void test23900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23900");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        int int14 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int15 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 640 + "'", int14 == 640);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test23901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23901");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.6415966E38f), 2.209062E-18f, 0.0f, (float) (-1459592292));
    }

    @Test
    public void test23902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23902");
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
        lwjgl3ApplicationConfiguration0.setwindowHeight((-232));
        boolean boolean30 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 184504044;
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test23903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23903");
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
        int int22 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int23 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test23904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23904");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 255, (float) 10L, 1.561203E-39f, (float) 480);
        com.badlogic.gdx.graphics.Color color5 = color4.cpy();
        int int6 = color4.toIntBits();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-16711681) + "'", int6 == (-16711681));
    }

    @Test
    public void test23905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23905");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        int int43 = lwjgl3ApplicationConfiguration34.getwindowHeight();
        int int44 = lwjgl3ApplicationConfiguration34.getwindowWidth();
        lwjgl3ApplicationConfiguration34.setaudioDeviceBufferCount(151015132);
        java.lang.String str47 = lwjgl3ApplicationConfiguration34.getpreferencesDirectory();
        boolean boolean48 = lwjgl3ApplicationConfiguration34.windowDecorated;
        lwjgl3ApplicationConfiguration34.disableAudio(false);
        boolean boolean51 = color33.equals((java.lang.Object) lwjgl3ApplicationConfiguration34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration34);
        lwjgl3ApplicationConfiguration52.gles30ContextMajorVersion = (-520094721);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-4.2866305E37f) + "'", float1 == (-4.2866305E37f));
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 480 + "'", int43 == 480);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 640 + "'", int44 == 640);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + ".prefs/" + "'", str47, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration52);
    }

    @Test
    public void test23906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23906");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.VIOLET;
        com.badlogic.gdx.graphics.Color color6 = color0.lerp((float) (byte) 100, (float) 8, (float) 10, (float) 9, (float) (-1611265692));
        int int7 = com.badlogic.gdx.graphics.Color.rgba8888(color0);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int10 = lwjgl3ApplicationConfiguration9.getaudioDeviceBufferSize();
        int int11 = lwjgl3ApplicationConfiguration9.b;
        lwjgl3ApplicationConfiguration9.useGL30 = false;
        lwjgl3ApplicationConfiguration9.useGL30 = true;
        lwjgl3ApplicationConfiguration9.audioDeviceSimultaneousSources = (-33488131);
        lwjgl3ApplicationConfiguration9.setwindowX((-16734721));
        lwjgl3ApplicationConfiguration9.setBackBufferConfig((-2336), 7576628, (-15671025), (-65536), (-1241350299), (-65281), 63519);
        boolean boolean28 = lwjgl3ApplicationConfiguration9.windowDecorated;
        lwjgl3ApplicationConfiguration9.gles30ContextMajorVersion = 70560;
        boolean boolean31 = color8.equals((java.lang.Object) 70560);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test23907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23907");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 0);
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        int int13 = lwjgl3ApplicationConfiguration0.stencil;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean15 = lwjgl3ApplicationConfiguration14.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test23908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23908");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType5 = null;
        lwjgl3ApplicationConfiguration4.setpreferencesFileType(fileType5);
        lwjgl3ApplicationConfiguration4.useVsync(false);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration4.initialBackgroundColor = color9;
        int int11 = com.badlogic.gdx.graphics.Color.rgba8888(color9);
        com.badlogic.gdx.graphics.Color color16 = color9.sub((float) (-240), (float) 65025, (-1.7013883E38f), (float) 2783);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color18 = color17.cpy();
        com.badlogic.gdx.graphics.Color color23 = color17.add((float) '#', (float) (-13500161), (float) 512, (float) (-335));
        com.badlogic.gdx.graphics.Color color24 = color9.sub(color17);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color17, (-2091510));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16711935 + "'", int11 == 16711935);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test23909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23909");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 61450, (float) 524288, (float) (-1879860224), 0.0f);
        int int5 = color4.toIntBits();
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color10.r = 63519;
        com.badlogic.gdx.graphics.Color color14 = color10.set(512);
        com.badlogic.gdx.graphics.Color color16 = color10.set(63519);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(25500);
        com.badlogic.gdx.graphics.Color color23 = color18.add((-1.5659187E38f), (-1.6950243E38f), (float) (-65486), (float) 16776994);
        com.badlogic.gdx.graphics.Color color25 = color16.lerp(color23, (float) 7680);
        com.badlogic.gdx.graphics.Color color26 = color4.add(color25);
        int int27 = com.badlogic.gdx.graphics.Color.rgb565(color26);
        color26.a = (-396800);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 65535 + "'", int5 == 65535);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 65504 + "'", int27 == 65504);
    }

    @Test
    public void test23910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23910");
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
        lwjgl3ApplicationConfiguration16.setwindowWidth(34303);
        lwjgl3ApplicationConfiguration16.setwindowX((-334888960));
        lwjgl3ApplicationConfiguration16.windowResizable = true;
        int int27 = lwjgl3ApplicationConfiguration16.getdepth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16 + "'", int27 == 16);
    }

    @Test
    public void test23911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23911");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setdepth((-1879860224));
        int int12 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int13 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration15.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration15.samples = '4';
        int int20 = lwjgl3ApplicationConfiguration15.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType25 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration21.setPreferencesConfig("hi!", fileType25);
        lwjgl3ApplicationConfiguration15.preferencesFileType = fileType25;
        lwjgl3ApplicationConfiguration15.setInitialVisible(false);
        lwjgl3ApplicationConfiguration15.audioDeviceBufferSize = (byte) 0;
        lwjgl3ApplicationConfiguration15.vSyncEnabled = true;
        com.badlogic.gdx.Files.FileType fileType34 = lwjgl3ApplicationConfiguration15.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("633c5f63", fileType34);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 480 + "'", int13 == 480);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + fileType34 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType34.equals(com.badlogic.gdx.Files.FileType.Absolute));
    }

    @Test
    public void test23912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23912");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowX = 512;
        lwjgl3ApplicationConfiguration0.setWindowPosition((-16646400), (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration15.disableAudio = true;
        int int20 = lwjgl3ApplicationConfiguration15.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode21 = lwjgl3ApplicationConfiguration15.fullscreenMode;
        lwjgl3ApplicationConfiguration15.r = 20188;
        boolean boolean24 = lwjgl3ApplicationConfiguration15.initialVisible;
        lwjgl3ApplicationConfiguration15.setdepth((-222));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str28 = lwjgl3ApplicationConfiguration27.title;
        lwjgl3ApplicationConfiguration27.a = (-1);
        boolean boolean31 = lwjgl3ApplicationConfiguration27.vSyncEnabled;
        lwjgl3ApplicationConfiguration27.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color34 = lwjgl3ApplicationConfiguration27.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color34);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color(color35);
        com.badlogic.gdx.graphics.Color color41 = color35.sub((float) 3306396, (float) 14500320, (float) 13260, 1.5612034E-37f);
        com.badlogic.gdx.graphics.Color color42 = color41.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color44 = color42.mul((float) 1794115036);
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color42;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration47.setDecorated(false);
        lwjgl3ApplicationConfiguration47.a = (byte) 10;
        lwjgl3ApplicationConfiguration47.setBackBufferConfig((int) (short) 100, 480, (int) '#', (int) 'a', 1677696502, (int) '#', (int) (short) 0);
        int int60 = lwjgl3ApplicationConfiguration47.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode63 = null;
        lwjgl3ApplicationConfiguration62.setFullscreenMode(displayMode63);
        com.badlogic.gdx.Files.FileType fileType65 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration62.setpreferencesFileType(fileType65);
        lwjgl3ApplicationConfiguration47.setPreferencesConfig("hi!", fileType65);
        lwjgl3ApplicationConfiguration15.setPreferencesConfig("ffffff00", fileType65);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType65);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 512 + "'", int60 == 512);
        org.junit.Assert.assertTrue("'" + fileType65 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType65.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23913");
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
        int int15 = lwjgl3ApplicationConfiguration14.samples;
        lwjgl3ApplicationConfiguration14.depth = (-187392);
        lwjgl3ApplicationConfiguration14.gles30ContextMinorVersion = 240;
        lwjgl3ApplicationConfiguration14.setWindowedMode((-1126961152), 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test23914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23914");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) '#', (float) (-1241350299), (float) 6529016, 0.0f);
        int int5 = com.badlogic.gdx.graphics.Color.rgba4444(color4);
        color4.b = (-1.5084639E38f);
        com.badlogic.gdx.graphics.Color color12 = color4.sub((float) 16188608, 0.20392157f, (float) 2047, (float) (-1308160));
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(268493567);
        com.badlogic.gdx.graphics.Color color15 = color14.cpy();
        com.badlogic.gdx.graphics.Color color17 = color12.lerp(color14, (float) (-157));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 61680 + "'", int5 == 61680);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test23915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23915");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener15;
        lwjgl3ApplicationConfiguration0.setwindowY((-50135050));
        lwjgl3ApplicationConfiguration0.a = (-185205247);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-3810));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23916");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.4936944E38f), 2.3418052E-38f, (float) ' ', (float) 65535);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (-536969804));
    }

    @Test
    public void test23917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23917");
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
        lwjgl3ApplicationConfiguration16.a = (-975375);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration16.setWindowListener(lwjgl3WindowListener23);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23918");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.setwindowX((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration7.getpreferencesFileType();
        int int11 = lwjgl3ApplicationConfiguration7.gles30ContextMinorVersion;
        int int12 = lwjgl3ApplicationConfiguration7.b;
        lwjgl3ApplicationConfiguration7.setwindowResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration7.disableAudio(false);
        lwjgl3ApplicationConfiguration7.useGL30 = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
    }

    @Test
    public void test23919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23919");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.windowHeight;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.SKY;
        int int14 = com.badlogic.gdx.graphics.Color.argb8888(color13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str16 = lwjgl3ApplicationConfiguration15.title;
        lwjgl3ApplicationConfiguration15.a = (-1);
        boolean boolean19 = lwjgl3ApplicationConfiguration15.vSyncEnabled;
        lwjgl3ApplicationConfiguration15.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color22 = lwjgl3ApplicationConfiguration15.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color23 = color13.mul(color22);
        com.badlogic.gdx.graphics.Color color24 = color22.cpy();
        com.badlogic.gdx.graphics.Color color25 = color12.sub(color22);
        float float26 = color25.b;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
    }

    @Test
    public void test23920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23920");
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
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration14.preferencesFileType = fileType16;
        int int18 = lwjgl3ApplicationConfiguration14.a;
        lwjgl3ApplicationConfiguration14.setBackBufferConfig(61536, 0, (-16794448), 150405120, 233437642, 11600098, (-225));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test23921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23921");
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
        lwjgl3ApplicationConfiguration12.setBackBufferConfig((-16646655), (-67611904), 16776994, (-265712), (-1439745), (-18874624), 252960);
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration12.preferencesFileType = fileType35;
        int int37 = lwjgl3ApplicationConfiguration12.windowX;
        lwjgl3ApplicationConfiguration12.setuseGL30(true);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test23922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23922");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str2 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setwindowHeight(6529016);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = lwjgl3ApplicationConfiguration0.windowListener;
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration8.samples = (-1);
        lwjgl3ApplicationConfiguration8.windowDecorated = false;
        int int15 = lwjgl3ApplicationConfiguration8.getaudioDeviceBufferSize();
        int int16 = lwjgl3ApplicationConfiguration8.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration8.setInitialVisible(true);
        boolean boolean19 = lwjgl3ApplicationConfiguration8.windowResizable;
        int int20 = lwjgl3ApplicationConfiguration8.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration8.stencil = (-4210688);
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration8.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("fffff6e0", fileType23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".prefs/" + "'", str2, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3WindowListener5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23923");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int8 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.windowY = (short) 10;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test23924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23924");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        color4.b = 65025;
        com.badlogic.gdx.graphics.Color color11 = color4.set((float) (-16252928), (float) 1470693630, (float) (-194841600), (-1.6615402E38f));
        float float12 = color11.g;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color11, 11665416);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color11);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test23925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23925");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
    }

    @Test
    public void test23926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23926");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1440087868, (float) 51, (float) (-35402), 1.327765E-27f);
    }

    @Test
    public void test23927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23927");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        int int7 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-201326593);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-8672));
        lwjgl3ApplicationConfiguration0.setsamples((-379904));
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int18 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8672) + "'", int18 == (-8672));
    }

    @Test
    public void test23928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23928");
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
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int14 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(fileType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test23929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23929");
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
        int int24 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test23930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23930");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.g = (short) 0;
        int int10 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-65279);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test23931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23931");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        int int17 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1902614), (-80190464), (-47784960));
        int int26 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-2130706432));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43268 + "'", int17 == 43268);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-80190464) + "'", int26 == (-80190464));
    }

    @Test
    public void test23932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23932");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 65535, 56864);
        int int12 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration14.setwindowX((int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = lwjgl3ApplicationConfiguration14.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = lwjgl3ApplicationConfiguration14.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration21.setpreferencesFileType(fileType22);
        lwjgl3ApplicationConfiguration21.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration21.setPreferencesConfig("", fileType27);
        lwjgl3ApplicationConfiguration21.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        lwjgl3ApplicationConfiguration21.b = '4';
        com.badlogic.gdx.Files.FileType fileType34 = lwjgl3ApplicationConfiguration21.preferencesFileType;
        int int35 = lwjgl3ApplicationConfiguration21.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration36.setDecorated(false);
        lwjgl3ApplicationConfiguration36.a = (byte) 10;
        boolean boolean41 = lwjgl3ApplicationConfiguration36.initialVisible;
        int int42 = lwjgl3ApplicationConfiguration36.b;
        lwjgl3ApplicationConfiguration36.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color45 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration36.initialBackgroundColor = color45;
        boolean boolean47 = lwjgl3ApplicationConfiguration36.useGL30;
        com.badlogic.gdx.Files.FileType fileType48 = lwjgl3ApplicationConfiguration36.preferencesFileType;
        lwjgl3ApplicationConfiguration21.setpreferencesFileType(fileType48);
        lwjgl3ApplicationConfiguration14.preferencesFileType = fileType48;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType48;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration31);
        org.junit.Assert.assertNull(fileType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 16 + "'", int35 == 16);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + fileType48 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType48.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23933");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color color6 = color0.set((float) (-3145729), (float) (-257551), (float) (-2084), (float) 43268);
        float float7 = color6.a;
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color((-8520704));
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color9);
        int int11 = com.badlogic.gdx.graphics.Color.rgb888(color9);
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
        color45.b = 1.7705992E21f;
        com.badlogic.gdx.graphics.Color color48 = color9.sub(color45);
        com.badlogic.gdx.graphics.Color color50 = color6.lerp(color9, (float) (-204539423));
        com.badlogic.gdx.graphics.Color color55 = color50.add((float) (-2147477600), (float) (-848655), (float) 16316297, (float) 536674560);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16743932 + "'", int11 == 16743932);
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
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color55);
    }

    @Test
    public void test23934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23934");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        java.lang.String str10 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int11 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.b = (-636610560);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        int int16 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int17 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".prefs/" + "'", str10, ".prefs/");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test23935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23935");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 512);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.windowHeight = (-2219520);
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color21 = color16.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color21, 100);
        com.badlogic.gdx.graphics.Color color25 = color21.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color25, 8897069);
        com.badlogic.gdx.graphics.Color color28 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color33 = color28.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color28);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color34);
        int int36 = com.badlogic.gdx.graphics.Color.argb8888(color35);
        int int37 = com.badlogic.gdx.graphics.Color.rgba8888(color35);
        com.badlogic.gdx.graphics.Color color39 = color25.lerp(color35, (float) 1044480);
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color();
        com.badlogic.gdx.graphics.Color color41 = color25.sub(color40);
        color41.a = 100L;
        java.lang.String str44 = color41.toString();
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color(480);
        com.badlogic.gdx.graphics.Color color47 = color46.cpy();
        float float48 = color47.b;
        com.badlogic.gdx.graphics.Color color49 = color41.mul(color47);
        com.badlogic.gdx.graphics.Color color50 = color49.cpy();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color49);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType53 = null;
        lwjgl3ApplicationConfiguration52.setpreferencesFileType(fileType53);
        lwjgl3ApplicationConfiguration52.disableAudio = true;
        lwjgl3ApplicationConfiguration52.initialVisible = true;
        int int59 = lwjgl3ApplicationConfiguration52.getaudioDeviceBufferSize();
        boolean boolean60 = lwjgl3ApplicationConfiguration52.getvSyncEnabled();
        int int61 = lwjgl3ApplicationConfiguration52.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration52.samples = 16718848;
        lwjgl3ApplicationConfiguration52.windowX = (-487968);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str67 = lwjgl3ApplicationConfiguration66.title;
        com.badlogic.gdx.graphics.Color color68 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color68, 16);
        lwjgl3ApplicationConfiguration66.setInitialBackgroundColor(color68);
        int int72 = lwjgl3ApplicationConfiguration66.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration66.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration76 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration76.setDecorated(false);
        lwjgl3ApplicationConfiguration76.a = (byte) 10;
        boolean boolean81 = lwjgl3ApplicationConfiguration76.initialVisible;
        int int82 = lwjgl3ApplicationConfiguration76.b;
        lwjgl3ApplicationConfiguration76.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color85 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration76.initialBackgroundColor = color85;
        boolean boolean87 = lwjgl3ApplicationConfiguration76.useGL30;
        com.badlogic.gdx.Files.FileType fileType88 = lwjgl3ApplicationConfiguration76.preferencesFileType;
        lwjgl3ApplicationConfiguration66.setPreferencesConfig("ffffffff", fileType88);
        lwjgl3ApplicationConfiguration52.setpreferencesFileType(fileType88);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType88;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 16777215 + "'", int36 == 16777215);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-256) + "'", int37 == (-256));
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ffffff9c" + "'", str44, "ffffff9c");
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.003921569f + "'", float48 == 0.003921569f);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 512 + "'", int59 == 512);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 512 + "'", int72 == 512);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 8 + "'", int82 == 8);
        org.junit.Assert.assertNotNull(color85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + fileType88 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType88.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23936");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color10 = color5.mul((-1.0f), (float) 1677696502, (float) 65024, (float) (short) 1);
        com.badlogic.gdx.graphics.Color color15 = color5.mul((float) 151015132, (float) (byte) 1, (-1.6880938E38f), (float) (-232));
        float float16 = color5.g;
        com.badlogic.gdx.graphics.Color color18 = color5.mul(0.0f);
        com.badlogic.gdx.graphics.Color color19 = color18.cpy();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
    }

    @Test
    public void test23937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23937");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.windowX = (short) 1;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 16776959;
        lwjgl3ApplicationConfiguration0.setResizable(false);
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-65792);
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test23938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23938");
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
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.r = 251658239;
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float18 = color17.a;
        int int19 = color17.toIntBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration20.setpreferencesFileType(fileType21);
        lwjgl3ApplicationConfiguration20.useVsync(false);
        lwjgl3ApplicationConfiguration20.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration20);
        boolean boolean28 = lwjgl3ApplicationConfiguration20.getwindowResizable();
        boolean boolean29 = color17.equals((java.lang.Object) lwjgl3ApplicationConfiguration20);
        lwjgl3ApplicationConfiguration20.preferencesDirectory = "ffffffff";
        int int32 = lwjgl3ApplicationConfiguration20.windowWidth;
        lwjgl3ApplicationConfiguration20.useOpenGL3(true, 63519, (-256));
        lwjgl3ApplicationConfiguration20.setResizable(false);
        int int39 = lwjgl3ApplicationConfiguration20.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.setDecorated(false);
        lwjgl3ApplicationConfiguration40.a = (byte) 10;
        boolean boolean45 = lwjgl3ApplicationConfiguration40.initialVisible;
        int int46 = lwjgl3ApplicationConfiguration40.b;
        lwjgl3ApplicationConfiguration40.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType49 = lwjgl3ApplicationConfiguration40.preferencesFileType;
        lwjgl3ApplicationConfiguration40.setwindowWidth((int) (byte) 100);
        int int52 = lwjgl3ApplicationConfiguration40.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration53.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration53.setwindowResizable(true);
        lwjgl3ApplicationConfiguration53.gles30ContextMajorVersion = (-567943452);
        lwjgl3ApplicationConfiguration53.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration53.setuseGL30(false);
        lwjgl3ApplicationConfiguration53.stencil = 16;
        lwjgl3ApplicationConfiguration53.initialVisible = true;
        com.badlogic.gdx.Files.FileType fileType68 = lwjgl3ApplicationConfiguration53.getpreferencesFileType();
        lwjgl3ApplicationConfiguration40.preferencesFileType = fileType68;
        lwjgl3ApplicationConfiguration20.setpreferencesFileType(fileType68);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType68;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 640 + "'", int32 == 640);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
        org.junit.Assert.assertTrue("'" + fileType49 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType49.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + fileType68 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType68.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23939");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.MAROON;
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color16, 16);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        int int20 = lwjgl3ApplicationConfiguration0.windowY;
        int int21 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test23940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23940");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-10));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode10;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-1901311));
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00fd1300";
        int int16 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test23941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23941");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-8672));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test23942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23942");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        com.badlogic.gdx.graphics.Color color8 = color0.clamp();
        com.badlogic.gdx.graphics.Color color9 = color8.cpy();
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color9, (-262646));
        com.badlogic.gdx.graphics.Color color16 = color9.add((float) (-1320288256), (float) 165813744, (float) 6356992, (float) (-4828));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16777215 + "'", int7 == 16777215);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test23943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23943");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        com.badlogic.gdx.Files.FileType fileType5 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int6 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode10;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.windowX = 97;
        lwjgl3ApplicationConfiguration0.setwindowY((-340020704));
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
    }

    @Test
    public void test23944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23944");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLACK;
        float float1 = color0.r;
        com.badlogic.gdx.graphics.Color color6 = color0.set((float) 0L, (float) 1671296512, (float) 255, (-5.387877E37f));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (-65042));
        float float9 = color0.b;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color15, 100);
        com.badlogic.gdx.graphics.Color color19 = color15.mul(100.0f);
        com.badlogic.gdx.graphics.Color color24 = color19.sub((float) (byte) 0, (float) (-65280), (float) 65295, 0.0f);
        com.badlogic.gdx.graphics.Color color26 = color24.set((int) (short) 100);
        com.badlogic.gdx.graphics.Color color31 = color26.mul((float) (-1241513983), (float) (-16711680), (-5.387877E37f), (float) 61450);
        com.badlogic.gdx.graphics.Color color37 = color26.lerp((float) 25500, (float) (-58475), (float) 100L, (float) (-436443648), (-1.7013583E38f));
        com.badlogic.gdx.graphics.Color color38 = color0.add(color26);
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color((-2147425792));
        com.badlogic.gdx.graphics.Color color42 = color39.sub(color41);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.93333334f + "'", float9 == 0.93333334f);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color42);
    }

    @Test
    public void test23945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23945");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((-96), (-2394624), (-1877082112), (-61440));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7014021E38f) + "'", float4 == (-1.7014021E38f));
    }

    @Test
    public void test23946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23946");
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
        lwjgl3ApplicationConfiguration0.windowX = 1073741568;
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
    public void test23947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23947");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration3.windowListener = lwjgl3WindowListener4;
        boolean boolean6 = lwjgl3ApplicationConfiguration3.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = lwjgl3ApplicationConfiguration3.fullscreenMode;
        lwjgl3ApplicationConfiguration3.setwindowY((-1308557313));
        int int11 = lwjgl3ApplicationConfiguration3.getdepth();
        lwjgl3ApplicationConfiguration3.setResizable(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(lwjgl3DisplayMode8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test23948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23948");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.g = 31334400;
        lwjgl3ApplicationConfiguration0.depth = (-254);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-16711680), (-128512));
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setwindowHeight(58111);
        boolean boolean18 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.a = (-52);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
    }

    @Test
    public void test23949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23949");
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
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-8126466));
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
    public void test23950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23950");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration10.windowListener = lwjgl3WindowListener12;
        lwjgl3ApplicationConfiguration10.setwindowHeight((-18874624));
        int int16 = lwjgl3ApplicationConfiguration10.getwindowY();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test23951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23951");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.stencil = (-1);
        int int7 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.windowX = 33488386;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23952");
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
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23953");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.r = (short) 100;
        lwjgl3ApplicationConfiguration0.stencil = 256;
        int int13 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setwindowWidth((-1627389952));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test23954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23954");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-130560), (float) 33554431, (-1.7013989E38f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-256) + "'", int3 == (-256));
    }

    @Test
    public void test23955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23955");
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
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color23 = color21.set((int) (short) 0);
        float float24 = color23.a;
        int int25 = com.badlogic.gdx.graphics.Color.rgb565(color23);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color23;
        int int27 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 43530;
        lwjgl3ApplicationConfiguration0.setsamples(8256822);
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 640 + "'", int16 == 640);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test23956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23956");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 266076800, (float) (-2097152), (float) (-780810), (-1.6947915E38f));
        int int5 = com.badlogic.gdx.graphics.Color.rgba4444(color4);
        com.badlogic.gdx.graphics.Color color10 = color4.mul((float) (-636610560), (float) (-10249181), (float) (-7168), (float) (-3100401));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 61440 + "'", int5 == 61440);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test23957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23957");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(3);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (-16734721));
        color1.a = 480;
        com.badlogic.gdx.graphics.Color color10 = color1.mul((-1.6948436E38f), (-9.997505E37f), (float) (-2147418368), (float) 3582);
        com.badlogic.gdx.graphics.Color color15 = color1.sub(2.3421279E-38f, (float) (-7876885), (float) (-67108964), 8.908043E-39f);
        int int16 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16777215 + "'", int16 == 16777215);
    }

    @Test
    public void test23958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23958");
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
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16711935;
        lwjgl3ApplicationConfiguration0.title = "00ff0000";
        boolean boolean20 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        int int21 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int22 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("fffffffc");
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 640 + "'", int21 == 640);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test23959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23959");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.052324E38f), (float) (-47784960), (-4.2865007E37f), (float) 587162524);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        color5.g = 151015132;
        com.badlogic.gdx.graphics.Color color17 = color5.sub((float) 10L, (float) 480, (float) (-1611265692), (float) (-8672));
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color5);
        float float19 = color5.a;
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(1671296512);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color23 = color5.add(color21);
        com.badlogic.gdx.graphics.Color color28 = color21.set((float) (-16720897), (-1.70141E38f), (float) 788480, 4.3190737E-19f);
        com.badlogic.gdx.graphics.Color color30 = color4.lerp(color21, 2.5243549E-29f);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
    }

    @Test
    public void test23960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23960");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration16.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration16.setBackBufferConfig(6147990, (-16729370), 31, (-141440), 63488, (-50396672), (-219211274));
        int int27 = lwjgl3ApplicationConfiguration16.getwindowHeight();
        lwjgl3ApplicationConfiguration16.setpreferencesDirectory("004e4edc");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 480 + "'", int27 == 480);
    }

    @Test
    public void test23961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23961");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 167247232;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setwindowWidth(234872319);
        lwjgl3ApplicationConfiguration0.setwindowX((-1644167168));
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test23962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23962");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(1003680, (-283184896), 0, (-1311232));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.7032521E-20f + "'", float4 == 2.7032521E-20f);
    }

    @Test
    public void test23963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23963");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.title = "ffff72ff";
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 255;
        lwjgl3ApplicationConfiguration0.setTitle("00ff0000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType14);
        lwjgl3ApplicationConfiguration13.useVsync(false);
        lwjgl3ApplicationConfiguration13.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration13.a = (-62986);
        lwjgl3ApplicationConfiguration13.windowX = 0;
        lwjgl3ApplicationConfiguration13.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration13.title = "b6ffffff";
        lwjgl3ApplicationConfiguration13.setWindowedMode((-2114125568), 385941504);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration33.setFullscreenMode(displayMode34);
        lwjgl3ApplicationConfiguration33.windowX = 100;
        int int38 = lwjgl3ApplicationConfiguration33.g;
        com.badlogic.gdx.Files.FileType fileType39 = lwjgl3ApplicationConfiguration33.preferencesFileType;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("ffff0000", fileType39);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType39;
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
        org.junit.Assert.assertTrue("'" + fileType39 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType39.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23964");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(251658239, (-16777216), (-59160), 2, 5147940, (-68935680), 2147483647);
        int int24 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setsamples((-59392));
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1677696502 + "'", int24 == 1677696502);
    }

    @Test
    public void test23965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23965");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.r = 63519;
        com.badlogic.gdx.graphics.Color color8 = color4.set(512);
        com.badlogic.gdx.graphics.Color color13 = color8.add((float) (-7876885), (float) 4095, (float) (-512), (-6.9082207E37f));
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color13);
        int int15 = color13.toIntBits();
        float float16 = color13.a;
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 65280 + "'", int15 == 65280);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test23966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23966");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.setTitle("ffffff64");
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffffff9c");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
    }

    @Test
    public void test23967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23967");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-16734721), (float) (-10420224), (float) 52, (float) '#');
        com.badlogic.gdx.graphics.Color color9 = color4.set((float) (-50396672), (float) 16769536, (float) (-1895829248), (float) 160);
        com.badlogic.gdx.graphics.Color color11 = color9.mul(1.249E-38f);
        com.badlogic.gdx.graphics.Color color12 = color9.cpy();
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test23968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23968");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode9 = lwjgl3ApplicationConfiguration0.hdpiMode;
        int int10 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 536936192;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode9 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode9.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test23969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23969");
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
        int int15 = lwjgl3ApplicationConfiguration0.windowHeight;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
    }

    @Test
    public void test23970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23970");
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
        int int24 = lwjgl3ApplicationConfiguration0.getdepth();
        boolean boolean25 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 61450 + "'", int23 == 61450);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test23971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23971");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(1310240);
    }

    @Test
    public void test23972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23972");
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
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 640 + "'", int10 == 640);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertNull(fileType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test23973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23973");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int8 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test23974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23974");
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
        boolean boolean18 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str20 = lwjgl3ApplicationConfiguration19.title;
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color21, 16);
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color21);
        com.badlogic.gdx.graphics.Color color29 = color21.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        color29.r = (-1241513983);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration32.setpreferencesFileType(fileType33);
        lwjgl3ApplicationConfiguration32.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration32.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration32.r = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration32);
        boolean boolean48 = color29.equals((java.lang.Object) lwjgl3ApplicationConfiguration47);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 5147940, (-68935680));
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test23975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23975");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444(2.3485134E-38f, 0.9647059f, 5.0192666E30f, 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16) + "'", int4 == (-16));
    }

    @Test
    public void test23976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23976");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        int int8 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.setDecorated(false);
        lwjgl3ApplicationConfiguration10.a = (byte) 10;
        boolean boolean15 = lwjgl3ApplicationConfiguration10.initialVisible;
        int int16 = lwjgl3ApplicationConfiguration10.b;
        lwjgl3ApplicationConfiguration10.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration10.initialBackgroundColor = color19;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int22 = lwjgl3ApplicationConfiguration21.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration21.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType25 = lwjgl3ApplicationConfiguration21.preferencesFileType;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration27.setFullscreenMode(displayMode28);
        lwjgl3ApplicationConfiguration27.windowX = 100;
        int int32 = lwjgl3ApplicationConfiguration27.g;
        int int33 = lwjgl3ApplicationConfiguration27.getwindowY();
        com.badlogic.gdx.Files.FileType fileType34 = lwjgl3ApplicationConfiguration27.getpreferencesFileType();
        lwjgl3ApplicationConfiguration10.preferencesFileType = fileType34;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffff00ff", fileType34);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1306385665), (-2147438080));
        lwjgl3ApplicationConfiguration0.depth = 587202559;
        int int42 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + fileType34 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType34.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
    }

    @Test
    public void test23977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23977");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (-524869), 587162524);
        lwjgl3ApplicationConfiguration0.setdepth((-3342337));
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23978");
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
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 2080800;
        boolean boolean17 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setWindowPosition(58111, 786);
        com.badlogic.gdx.Files.FileType fileType21 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(fileType21);
    }

    @Test
    public void test23979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23979");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color7 = color2.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = color1.sub(color7);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color14 = color12.mul((float) (-14513374));
        com.badlogic.gdx.graphics.Color color15 = color11.set(color12);
        com.badlogic.gdx.graphics.Color color16 = color12.cpy();
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.VIOLET;
        com.badlogic.gdx.graphics.Color color23 = color17.lerp((float) (byte) 100, (float) 8, (float) 10, (float) 9, (float) (-1611265692));
        com.badlogic.gdx.graphics.Color color24 = color12.mul(color23);
        com.badlogic.gdx.graphics.Color color25 = color23.premultiplyAlpha();
        int int26 = color23.toIntBits();
        com.badlogic.gdx.graphics.Color color28 = color23.mul((-6.041497E37f));
        color28.g = (-868);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test23980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23980");
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
        lwjgl3ApplicationConfiguration17.r = (-262176);
        int int20 = lwjgl3ApplicationConfiguration17.getaudioDeviceBufferSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
    }

    @Test
    public void test23981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23981");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int11 = lwjgl3ApplicationConfiguration0.g;
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int13 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
    }

    @Test
    public void test23982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23982");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.windowWidth = (-66048);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
    }

    @Test
    public void test23983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23983");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.stencil = 1677696502;
        int int13 = lwjgl3ApplicationConfiguration0.b;
        int int14 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.windowY = 9436928;
        lwjgl3ApplicationConfiguration0.r = (-806232493);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 640 + "'", int14 == 640);
    }

    @Test
    public void test23984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23984");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        com.badlogic.gdx.Files.FileType fileType4 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.windowHeight = 35;
        java.lang.String str7 = lwjgl3ApplicationConfiguration0.title;
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.windowWidth = 217570864;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.setTitle("8ff00000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void test23985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23985");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-50135050);
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffffa400";
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
    }

    @Test
    public void test23986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23986");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 10);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int8 = lwjgl3ApplicationConfiguration7.samples;
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration7.setFullscreenMode(displayMode9);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(1671296512);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        float float14 = color12.r;
        lwjgl3ApplicationConfiguration7.initialBackgroundColor = color12;
        lwjgl3ApplicationConfiguration7.useGL30 = false;
        int int18 = lwjgl3ApplicationConfiguration7.samples;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.3882353f + "'", float14 == 0.3882353f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test23987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23987");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int10 = lwjgl3ApplicationConfiguration0.getdepth();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23988");
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
        lwjgl3ApplicationConfiguration16.b = 2016;
        int int33 = lwjgl3ApplicationConfiguration16.getaudioDeviceBufferCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16 + "'", int30 == 16);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
    }

    @Test
    public void test23989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23989");
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
        lwjgl3ApplicationConfiguration11.gles30ContextMajorVersion = 570949632;
        lwjgl3ApplicationConfiguration11.windowX = 65520;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str20 = lwjgl3ApplicationConfiguration19.title;
        lwjgl3ApplicationConfiguration19.a = (-1);
        int int23 = lwjgl3ApplicationConfiguration19.getwindowWidth();
        com.badlogic.gdx.Files.FileType fileType24 = lwjgl3ApplicationConfiguration19.getpreferencesFileType();
        lwjgl3ApplicationConfiguration11.setPreferencesConfig("fffffdff", fileType24);
        int int26 = lwjgl3ApplicationConfiguration11.getgles30ContextMinorVersion();
        boolean boolean27 = lwjgl3ApplicationConfiguration11.getwindowDecorated();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 640 + "'", int23 == 640);
        org.junit.Assert.assertTrue("'" + fileType24 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType24.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test23990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23990");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowWidth(0);
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int14 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16711425, 61200);
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-62986) + "'", int14 == (-62986));
    }

    @Test
    public void test23991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23991");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2025652544));
    }

    @Test
    public void test23992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23992");
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
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color17 = color14.set((-17960192));
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 65522 + "'", int13 == 65522);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test23993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23993");
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
        lwjgl3ApplicationConfiguration0.a = (-16580863);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int22 = lwjgl3ApplicationConfiguration21.getaudioDeviceBufferSize();
        boolean boolean23 = lwjgl3ApplicationConfiguration21.windowResizable;
        int int24 = lwjgl3ApplicationConfiguration21.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration21.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        lwjgl3ApplicationConfiguration27.setaudioDeviceSimultaneousSources((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType30 = lwjgl3ApplicationConfiguration27.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType30);
        lwjgl3ApplicationConfiguration0.stencil = 1673500724;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
        org.junit.Assert.assertTrue("'" + fileType30 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType30.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test23994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23994");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1, (float) 20160, (float) 0, (float) (byte) -1);
        int int5 = com.badlogic.gdx.graphics.Color.rgb565(color4);
        float float6 = color4.g;
        com.badlogic.gdx.graphics.Color color12 = color4.lerp((float) 655360, (-3.9429004E34f), (float) 4242, 0.99607843f, (float) (-2560));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration13.setwindowX(10);
        int int18 = lwjgl3ApplicationConfiguration13.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration13.initialVisible = true;
        boolean boolean21 = color12.equals((java.lang.Object) lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 65504 + "'", int5 == 65504);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test23995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23995");
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
        lwjgl3ApplicationConfiguration16.setwindowResizable(true);
        lwjgl3ApplicationConfiguration16.setaudioDeviceBufferSize(0);
        java.lang.String str27 = lwjgl3ApplicationConfiguration16.getpreferencesDirectory();
        int int28 = lwjgl3ApplicationConfiguration16.a;
        boolean boolean29 = lwjgl3ApplicationConfiguration16.useGL30;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ".prefs/" + "'", str27, ".prefs/");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test23996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23996");
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
        lwjgl3ApplicationConfiguration0.setwindowWidth((-62986));
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("feff08ff");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23997");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        int int7 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-201326593);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-8672));
        int int12 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode14 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.title = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(lwjgl3DisplayMode14);
    }

    @Test
    public void test23998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23998");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setwindowY((-529006382));
        int int16 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test23999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23999");
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
        java.lang.String str16 = lwjgl3ApplicationConfiguration8.getpreferencesDirectory();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".prefs/" + "'", str16, ".prefs/");
    }

    @Test
    public void test24000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test24000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.windowX = (-8672);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration10.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("", fileType16);
        lwjgl3ApplicationConfiguration10.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration10.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration10.setWindowPosition(3, 8897069);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        lwjgl3ApplicationConfiguration10.a = (-255);
        int int28 = lwjgl3ApplicationConfiguration10.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration29.setpreferencesFileType(fileType30);
        lwjgl3ApplicationConfiguration29.disableAudio = true;
        lwjgl3ApplicationConfiguration29.initialVisible = true;
        int int36 = lwjgl3ApplicationConfiguration29.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration29.b = (-62986);
        lwjgl3ApplicationConfiguration29.b = 2;
        lwjgl3ApplicationConfiguration29.setwindowX((int) 'a');
        int int43 = lwjgl3ApplicationConfiguration29.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType46 = null;
        lwjgl3ApplicationConfiguration45.setpreferencesFileType(fileType46);
        lwjgl3ApplicationConfiguration45.useVsync(false);
        lwjgl3ApplicationConfiguration45.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration45.a = (-62986);
        lwjgl3ApplicationConfiguration45.setdisableAudio(true);
        boolean boolean57 = lwjgl3ApplicationConfiguration45.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode60 = null;
        lwjgl3ApplicationConfiguration59.setFullscreenMode(displayMode60);
        lwjgl3ApplicationConfiguration59.windowX = 100;
        int int64 = lwjgl3ApplicationConfiguration59.g;
        com.badlogic.gdx.Files.FileType fileType65 = lwjgl3ApplicationConfiguration59.getpreferencesFileType();
        lwjgl3ApplicationConfiguration45.setPreferencesConfig("ffffff00", fileType65);
        lwjgl3ApplicationConfiguration29.setPreferencesConfig("000000ff", fileType65);
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType65);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType65;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-1901311));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(60269, 0, 246, 1162137, (-218476203), 247, (-194841600));
        lwjgl3ApplicationConfiguration0.r = (-65438);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 512 + "'", int36 == 512);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 8 + "'", int64 == 8);
        org.junit.Assert.assertTrue("'" + fileType65 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType65.equals(com.badlogic.gdx.Files.FileType.External));
    }
}
