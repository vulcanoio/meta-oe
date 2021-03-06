DESCRIPTION = "GPS application for openmoko freerunner"
HOMEPAGE = "http://omgps.googlecode.com"
SECTION = "openmoko/applications"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"
DEPENDS = "gtk+ python-pygobject dbus-glib"
SRCREV = "109"
PV = "0.1+svnr${SRCPV}"
S = "${WORKDIR}/${PN}"

do_configure_prepend() {
   sed -i "s#PY_VERSION = 2.6#PY_VERSION = ${PYTHON_BASEVERSION}#g" ${S}/Makefile.am
   sed -i "s#PY_INC_DIR = \$(OPIEDIR)#PY_INC_DIR = ${STAGING_DIR_HOST}#g" ${S}/Makefile.am
}

SRC_URI = "svn://omgps.googlecode.com/svn/trunk;module=omgps;protocol=http \
           file://gcc-4.4.patch \
           file://sysfs.node.2.6.32.patch \
           file://fix.capability.patch \
           file://use.unused.variable.patch \
"

inherit autotools
