package com.x.attendance.assemble.control.jaxrs.attendancestatisticalcycle;

import com.x.base.core.project.exception.PromptException;

class ExceptionStatisticCycleProcess extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	public ExceptionStatisticCycleProcess( Throwable e, String message ) {
		super("用户在进行考勤统计处理时发生异常！message:" + message, e );
	}
}
