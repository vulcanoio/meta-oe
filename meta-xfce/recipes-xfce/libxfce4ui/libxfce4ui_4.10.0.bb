DESCRIPTION = "Xfce4 Widget library and X Window System interaction"
SECTION = "x11/libs"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=252890d9eee26aab7b432e8b8a616475"
DEPENDS = "gtk+ intltool libxfce4util startup-notification xfconf"

inherit xfce

SRC_URI += "file://0001-libxfce4kbd-private-xfce4-keyboard-shortcuts.xml-fix.patch"

SRC_URI[md5sum] = "6df1ce474a3d4885aee31cda9dbc9192"
SRC_URI[sha256sum] = "a2b9fa288ccb5f16fa13264e507ba3f7b8da0176da259a11239f21538c0ea3e2"

