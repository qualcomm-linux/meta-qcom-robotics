inherit ros_distro_humble
inherit ros_component

DESCRIPTION = "The AMR bringup ROS2 package"
LICENSE          = "BSD-3-Clause-Clear"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause-Clear;md5=7a434440b651f4a472ca93716d01033a"

DEPENDS += " \
    ament-cmake-native \
    ament-cmake \
    std-msgs \
    rosidl-default-generators \
    geometry-msgs \
    rclcpp \
    rclcpp-action \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-ros \
    tf2-geometry-msgs \
    rclpy \
    joint-state-publisher \
    nav2-msgs \
    nav-msgs \
"

RDEPENDS:${PN} += " \
    ament-cmake-native \
    ament-cmake \
    std-msgs \
    rosidl-default-generators \
    geometry-msgs \
    rclcpp \
    rclcpp-action \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-ros \
    tf2-geometry-msgs \
    rclpy \
    joint-state-publisher \
    nav2-msgs \
    nav-msgs \
"

FILESPATH =+ "${WORKSPACE}/robotics/robotics-oss:"
SRC_URI = "file://robot-control/qti_robot_amr_ctrl"
S = "${WORKDIR}/robot-control/qti_robot_amr_ctrl"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

FILES:${PN}:prepend = "${datadir}/qti_robot_amr_ctrl"
FILES:${PN} += "${libdir}/*"
FILES:${PN} += "${bindir}/*"

INSANE_SKIP:${PN} += "installed-vs-shipped"