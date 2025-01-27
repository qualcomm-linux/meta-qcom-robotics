inherit pkgconfig autotools-brokensep

DESCRIPTION = "sensor client"
LICENSE          = "BSD-3-Clause-Clear"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=7a434440b651f4a472ca93716d01033a"

DEPENDS += "glib-2.0 property-vault"
DEPENDS += "qmi-framework"
DEPENDS += "protobuf"
DEPENDS += "protobuf-native"

SRC_URI  += "git://git.codelinaro.org/clo/le/platform/vendor/qcom-opensource/robot-sensor.git;protocol=https;rev=cc6df61ef46b9dc9c6169714ea0e7b69664f1fa8;branch=robotics.qclinux.1.0.r1-rel"

S = "${WORKDIR}/git/sensor-client"

EXTRA_OECONF += " --enable-sns-direct-channel"

#Disable the split of debug information into -dbg files
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

FILES:${PN} += "${libdir}/*"
FILES:${PN}-dev = "${libdir}/* ${includedir}"

#Skips check for .so symlinks
INSANE_SKIP:${PN} = "dev-so"

# need to export these variables for python-config to work
FILES:${PN} += "${includedir}/*"
FILES:${PN} += "/usr/lib/*"
FILES:${PN} += "/usr/lib64/*"
FILES:${PN}-dev  = "${libdir}/*.la ${includedir}"
FILES:${PN} += "${sysconfdir}/sensors/*"
FILES:${PN} += "${systemd_unitdir}/system/"
FILES:${PN} += "/systemd/system/*"
RM_WORK_EXCLUDE += "${PN}"
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

do_install:append() {
    install -d ${D}/usr/include/
    install -m 0755 ${S}/inc/*.h -D ${D}/usr/include
    install -d ${D}/usr/lib/pkgconfig/
    install -m 0644 ${S}/*.pc -D ${D}/usr/lib/pkgconfig
}

PACKAGE_ARCH    ?= "${SOC_ARCH}"
