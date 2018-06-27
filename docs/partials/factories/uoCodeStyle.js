app.factory('UOCodeStyle', function() {
    return [
        {
            start: 'new',
            end: ' ',
            color: '#f5deb3'
        },{
            start: 'double',
            end: ' ',
            color: '#CFA37A'
        },{
            start: 'int',
            end: ' ',
            color: '#CFA37A'
        },{
            start: 'float',
            end: ' ',
            color: '#CFA37A'
        },{
            start: 'String',
            end: ' ',
            color: '#CFA37A'
        },{
            start: 'var',
            end: ' ',
            color: '#CFA37A'
        },{
            start: 'DataType',
            end: ')',
            ignoreAfter: '(',
            color: '#CD797B'
        },{
            start: 'Anything',
            end: ')',
            ignoreAfter: '(',
            color: '#CD797B'
        },{
            startAfter: true,
            endBefore: true,
            start: 'UnitOf.',
            end: '.',
            color: '#CD797B',
        },{
            start: 'Length(',
            end: ')',
            color: '#CD797B',
        },{
            startAfter: true,
            endBefore: true,
            start: 'UnitOf.',
            end: ' ',
            color: '#CD797B',
        },{
            start: '//',
            end: '',//If '' just go to end
            color: 'rgba(181, 181, 181, 0.55)'
        },{
            start: 'from',
            end: ')',
            ignoreAfter: '(',//If fromPounds(50) we want to ignore only the 50
            color: '#4C797F'
        },{//For Java and C# to functions and can include default values
            start: 'to',
            end: ')',
            ignoreAfter: '(',
            color: '#66A863'
        },{
            start: 'From',
            end: ')',
            ignoreAfter: '(',//If fromPounds(50) we want to ignore only the 50
            color: '#4C797F'
        },{//For Java and C# to functions and can include default values
            start: 'To',
            end: ')',
            ignoreAfter: '(',
            color: '#66A863'
        },{//For JavaScript to functions
            start: 'to',
            end: ';',
            endBefore: true,
            color: '#66A863'
        },{
            start: 'convertNow',
            end: ')',
            ignoreAfter: '(',
            color: '#66A863'
        },{
            start: 'ConvertNow',
            end: ')',
            ignoreAfter: '(',
            color: '#66A863'
        }
    ];
});